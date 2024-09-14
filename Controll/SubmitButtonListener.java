package Controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Cow;
import Model.CowDatabase;
import View.View;

public class SubmitButtonListener implements ActionListener {
    private CowDatabase data;
    private View view;

    public SubmitButtonListener(CowDatabase data, View view) {
        this.data = data;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cowId = view.getCowId();

        if (!isValidCowId(cowId)) {
            view.setResult("Invalid Cow ID.");
            return;
        }

        Cow cow = data.getCowById(cowId);
        if (cow == null) {
            view.setResult("Cow not found.");
        } else {
            double milk = cow.calculateMilk();
            String result = String.format(
                "Cow ID: %s\n " +
                "Type : %s\n " +
                "Age : %d years, %d months\n " +
                "Milk produced : %.2f liters\n ",
                cow.getId(), 
                cow.getType(), 
                cow.getYears(), 
                cow.getMonths(), 
                milk
            );
            view.setResult(result);
        }
    }

    private boolean isValidCowId(String cowId) {
        return cowId.length() == 8 && cowId.matches("[1-9]\\d*");
    }
}