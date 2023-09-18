import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image ball;
    Image field;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        ball = new ImageIcon("bola.png").getImage();
        field = new ImageIcon("campo.png").getImage();
        timer = new Timer(1,this);
        timer.start();

    }

    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(field,0,0,null);
        g2D.drawImage(ball,x,y,null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x >= PANEL_WIDTH - ball.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        if(y >= PANEL_HEIGHT - ball.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }

}
