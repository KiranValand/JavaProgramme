package PracticeLearning;

class votingVerification
{
    public static void main(String [] args)
    {
        // enter age here
       int age = 24;
        System.out.println("your age: " +age);
        // condition is that if person is 18 or more he or she will get this message
        if(age>=18)
            System.out.println(age+ "  You are eligible for voting");
        else
            //if person is less than 18 he or she will get this message
            System.out.println(age+ "  You are not eligible for voting");
    }
}