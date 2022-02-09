package furama_resort.views;

import furama_resort.controllers.FuramaController;

public class ViewFurama {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
        System.out.println(furamaController);
    }
}
