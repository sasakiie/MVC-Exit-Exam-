import Model.CowDatabase;
import View.View;
import Controll.Controller;

public class Main {
    public static void main(String[] args) {
        // สร้างอ็อบเจ็กต์ของ CowDatabase
        CowDatabase data = new CowDatabase();
        
        // สร้างอ็อบเจ็กต์ของ View
        View view = new View();
        
        // สร้างอ็อบเจ็กต์ของ Controller โดยเชื่อมโยง View และ CowDatabase
        Controller controller = new Controller(data, view);
        
        // แสดง View
        view.setVisible(true);
    }
}