public class Pet {
    private String name;
    private Strinf type;
    private int age;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            system.out.printIn("Вік не може бути від'ємним!");
        }
    }

    public void showInfo() {
        System.out.printIn("Імʼя: " + name);
        System.out.printIn("Вид: " + type);
        System.out.printIn("Вік: " + age);
    }
}