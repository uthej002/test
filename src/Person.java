public class Person {
    private String name = null;
    private float heightInFt = 0;
    private float weightInKgs = 0;
    private int age = 0;
    private char gender;
    private Head head;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return heightInFt;
    }

    public void setHeight(float height) {
        this.heightInFt = height;
    }

    public float getWeight() {
        return weightInKgs;
    }

    public void setWeight(float weight) {
        this.weightInKgs = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printDetails() {
        System.out.println("A new person is created, below are his details:");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Height: " +heightInFt);
        System.out.println("Weight: " +weightInKgs);
        head.printDetails();
    }
}
