package ss16_io_text_file.exercise.copy_file_text.Input;

public class StudentIO {
    private String name;
    private int age;

    public StudentIO() {
    }

    public StudentIO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentIO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
