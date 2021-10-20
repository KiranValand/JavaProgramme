package PracticeLearning;

public class logicalOperator {
    public static void main(String[] args) {
        int a = 30;
        System.out.println(a<15 && a<20); //returns false
        System.out.println(a<15 || a<20); //returns false
        System.out.println(!(a<15 && a<20)); //returns true
    }
}
