package Java;

import javax.swing.*;

public class Test {
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog("What Is Your Name : ");
        JOptionPane.showMessageDialog(null,"Hello Mr "+name);
    }
}
