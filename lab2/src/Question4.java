import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Question4 implements ActionListener {
    private JTextArea area;
    private String currentInput = "";
    private String operator = "";
    private double operand1 = 0;
    private boolean isOperatorClicked = false;

    public static void main(String[] args) {
        new Question4();
    }

    public Question4() {
        JFrame j = new JFrame("Calculator");
        j.setLayout(null); 
        
        area = new JTextArea();
        area.setBounds(0, 0, 550, 100);
        area.setEditable(false);
        j.add(area);

        JPanel jp1 = new JPanel();
        jp1.setBounds(0, 100, 550, 420);
        String[] buttonLabels = {"7", "8", "9", "C", "4", "5", "6", "+", "3", "2", "1", "*", "0", "%", "/", "="};
        JButton[] buttons = new JButton[buttonLabels.length];
        jp1.setLayout(new GridLayout(4, 4));
        
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            jp1.add(buttons[i]);
        }

        j.add(jp1);

        j.setSize(550, 550);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String command = source.getText();
        
        switch (command) {
            case "C":
                currentInput = "";
                operator = "";
                operand1 = 0;
                isOperatorClicked = false;
                area.setText("");
                break;
            case "=":
                if (!currentInput.isEmpty()) {
                    double result = calculate(Double.parseDouble(currentInput));
                    area.setText(String.valueOf(result));
                    currentInput = String.valueOf(result);
                    operator = "";
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                if (!currentInput.isEmpty()) {
                    operand1 = Double.parseDouble(currentInput);
                    operator = command;
                    currentInput = "";
                    isOperatorClicked = true;
                }
                break;
            default:
                if (isOperatorClicked) {
                    currentInput = command;
                    isOperatorClicked = false;
                } else {
                    currentInput += command;
                }
                area.setText(currentInput);
                break;
        }
    }

    private double calculate(double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "%":
                return operand1 % operand2;
            default:
                return operand2;
        }
    }
}
