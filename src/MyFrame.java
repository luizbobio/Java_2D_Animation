import javax.swing.*;


public class MyFrame extends JFrame {

    MyPanel panel = new MyPanel();

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bola Animada");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

}
