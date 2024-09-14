package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField cowIdField;
    private JButton submitButton;
    private JButton clearButton; // ปุ่มใหม่
    private JLabel resultLabel;

    public View() {
        setTitle("Cow Milk Production");
        setSize(400, 250); // เพิ่มขนาดเพื่อให้พอเหมาะกับปุ่ม Clear
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cowIdField = new JTextField(10);
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear"); // สร้างปุ่ม Clear
        resultLabel = new JLabel("Enter Cow ID:");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Cow ID:"));
        panel.add(cowIdField);
        panel.add(submitButton);
        panel.add(clearButton); // เพิ่มปุ่ม Clear
        panel.add(resultLabel);

        add(panel);
    }

    public String getCowId() {
        return cowIdField.getText();
    }

    public void setCowId(String id) {
        cowIdField.setText(id);
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public void addSubmitButtonListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }

    public void addClearButtonListener(ActionListener listener) {
        clearButton.addActionListener(listener); // เชื่อมต่อกับ ActionListener
    }
}