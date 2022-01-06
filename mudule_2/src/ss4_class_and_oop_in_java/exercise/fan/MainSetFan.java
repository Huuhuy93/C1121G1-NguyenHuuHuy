package ss4_class_and_oop_in_java.exercise.fan;

public class MainSetFan {
    public static void main(String[] args) {
        SetFan setFan1 = new SetFan(3, true, 10, "blue");
        SetFan setFan2 = new SetFan(2, false,5,"yellow");
        setFan1.toString(setFan1.isOn());
        setFan2.toString(setFan2.isOn());
    }
}
