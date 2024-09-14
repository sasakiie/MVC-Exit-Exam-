package Controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.View;

public class ClearButtonListener implements ActionListener {
    private View view;

    public ClearButtonListener(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.setCowId("");  // ล้างข้อความใน JTextField
        view.setResult(""); // ล้างข้อความใน JLabel
    }
}