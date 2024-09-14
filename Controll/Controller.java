package Controll;

import Model.CowDatabase;
import View.View;

public class Controller {
    CowDatabase data;
    View view;

    public Controller(CowDatabase data, View view) {
        this.data = data;
        this.view = view;

        // สร้าง SubmitButtonListener และเชื่อมต่อกับ View
        SubmitButtonListener listener = new SubmitButtonListener(data, view);
        view.addSubmitButtonListener(listener);

        // สร้าง ClearButtonListener และเชื่อมต่อกับ View
        ClearButtonListener clearListener = new ClearButtonListener(view);
        view.addClearButtonListener(clearListener);
    }
}