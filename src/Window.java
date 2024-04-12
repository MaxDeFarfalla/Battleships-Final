import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){
        new BorderLayout();
        this.setSize(500,500);
        addPanels();
        this.setLayout(new GridLayout(10,10));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        



        this.setVisible(true);
    }

    private void addPanels() {
        for (int i = 0; i<5*5; i++){
            this.add(new Panel(i));
        }
    }
}
