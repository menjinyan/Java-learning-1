package Exception;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String str) {
        String[] arr = str.split(",");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);

    }

    public Student(String name, int age) {
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
        if(age<18 || age>40){
            throw new RuntimeException();
        }else{
            this.age = age;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}