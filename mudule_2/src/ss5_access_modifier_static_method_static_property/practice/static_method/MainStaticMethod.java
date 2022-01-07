package ss5_access_modifier_static_method_static_property.practice.static_method;

public class MainStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Huy");
        Student s2 = new Student(222, "Hoang");
        Student s3 = new Student(333, "Ngoc");
        s1.display();
        s2.display();
        s3.display();


    }
}
