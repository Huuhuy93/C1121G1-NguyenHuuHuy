package ss9_dsa_list.exercise.implement_method_of_array_list_by_library;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Huy");
        Student student2 = new Student(2,"Hùng");
        Student student3 = new Student(3,"Anh");
        Student student4 = new Student(4,"Tuan");
        Student student5 = new Student(5,"Hai");
        Student student6 = new Student(6,"Phong");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        //arrayList mới copy từ arrayList cũ
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
//        studentMyArrayList.add(student6,2);
        studentMyArrayList.size();
//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.println(studentMyArrayList.get(2).getName());
//        System.out.println(studentMyArrayList.indexOf(student6));
//        newMyArrayList = studentMyArrayList.clone();
//        newMyArrayList.remove(0);
//        Student student = newMyArrayList.remove(0);

//        for (int i = 0; i < newMyArrayList.size(); i++) {
//            System.out.println(newMyArrayList.get(i).getName());
//        }

    }
}
