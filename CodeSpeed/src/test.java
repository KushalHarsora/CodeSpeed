import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String args[]){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.height/2 - 200);
        System.out.println(screenSize.width/2 - 100);
    }
}
