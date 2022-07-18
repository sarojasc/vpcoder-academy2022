package Oopsconcepts;

public class testEnc {
    public static void main(String[] args) {
        StudentEncp s1 = new StudentEncp();
        s1.setAge(12);
        System.out.println((s1.getAge()));
        s1.setResult(87.999);
        System.out.println(s1.getResult());
    }
}