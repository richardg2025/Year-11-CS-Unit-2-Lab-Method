//1
public class Method {

    //2
    public static void main(String[] args) {

        int sum1 = add(1, 2);
        System.out.println(sum1);

        int sum2 = add(1, 2, 3, 4);
        System.out.println(sum2);

        String greeting1 = morningGreeting("Hello");
        System.out.println(greeting1);

        String greeting2 = afternoonGreeting("Hello");
        System.out.println(greeting2);

        String three = triple("Hello");
        System.out.println(three);

        double two = half(5);
        System.out.println(two);

        double round = roundPositiveValueToNearestInteger(4.5);
        System.out.println(round);

        double negRound = roundNegativeValueToNearestInteger(-4.5);
        System.out.println(negRound);
    }

    //3
    public static int add(int a, int b) {
        return a + b;
    }

    //4
    public static int add(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }

    //5
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    //6
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    //7
    public static String triple(String input) {
        return input + input + input;
    }

    //8
    public static double half(int num){
        return (double) num/2;
    }

    //9
    public static int roundPositiveValueToNearestInteger(double num){
        double a = num + 0.5;
        return (int) a;
    }

    //10
    public static int roundNegativeValueToNearestInteger(double num){
        double a = num - 0.5;
        return (int) a;
    }

}
