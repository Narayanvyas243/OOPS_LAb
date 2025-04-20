import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField displayField = new JTextField(20);
        JPanel panel = new JPanel();
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = button.getText();
                    if (command.equals("=")) {
                        displayField.setText(evaluate(displayField.getText()));
                    } else if (command.equals("C")) {
                        displayField.setText("");
                    } else {
                        displayField.setText(displayField.getText() + command);
                    }
                }
            });
            panel.add(button);
        }

        panel.add(displayField);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static String evaluate(String expression) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            return String.valueOf(engine.eval(expression));
        } catch (Exception e) {
            return "Error";
        }
    }
}