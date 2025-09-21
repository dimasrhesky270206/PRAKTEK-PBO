

public class Encaptest {
    private int age;

    public void setAge(int age) {
        if (age < 18) {
            this.age = 18;
        } else if (age > 30) {
            this.age = 30;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        EncapTest e = new EncapTest();
        e.setAge(35);
        System.out.println("Age is: " + e.getAge());
    }
}
