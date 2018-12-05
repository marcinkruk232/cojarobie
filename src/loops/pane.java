package loops;

import javax.swing.*;

public class pane {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "What's your name?");
        JOptionPane.showMessageDialog(null, "Hello There!");
        JOptionPane.showMessageDialog(null, "Hello " + name);


        String ageStr = JOptionPane.showInputDialog(null, "How are you old?");
        Integer age = Integer.parseInt(ageStr);
        JOptionPane.showMessageDialog(null, "You are: " + ageStr);
        int decision = JOptionPane.showConfirmDialog(null, "Are you sure? You don't look like...");
        JOptionPane.showMessageDialog(null, "You chose: " + decision);
    }

}
