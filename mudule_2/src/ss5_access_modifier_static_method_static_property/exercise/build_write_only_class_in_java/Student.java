package ss5_access_modifier_static_method_static_property.exercise.build_write_only_class_in_java;

public class Student {
    private String name = "John";
    private String classes = "CO2";
    Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
