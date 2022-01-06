package ss5_access_modifier_static_method_static_property.exercise.build_write_only_class_in_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Huy");
        student1.setClasses("CO3");
        System.out.println(student1.getName()+" - "+student1.getClasses());
    }
}
