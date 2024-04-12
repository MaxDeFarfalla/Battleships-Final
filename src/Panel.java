import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(int i){
        if (i%2==0){
            this.setBackground(Color.blue);
        }else {
            this.setBackground(Color.green);
        }
        this.setVisible(true);
    }
}
