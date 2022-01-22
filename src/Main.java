public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person kevin = new Person();
        Head head = new Head();
        head.setHair(false);
        head.setEyeColor("brown");
        head.setSpectacles(true);
        kevin.setName("Kevin");
        kevin.setAge(24);
        kevin.setHeight(5.6f);
        kevin.setWeight(65.8f);
        kevin.setGender('M');
        kevin.setHead(head);
        kevin.printDetails();
    }
}
