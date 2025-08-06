import java.lang.Math;

class Interest{
    // Function to calculate Simple Interest
    static float simpleInterest(float principal, float rate, float time) {
        return (principal * rate * time) / 100;
    }

    // Function to calculate Compound Interest
    static double compoundInterest(double principal, double rate, double time, int n) {
        // n = number of times interest applied per time period
        return principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
    }

    public static void main(String[] args) {
        float principal = 1000;
        float rate = 5;
        float time = 3;

        float si = simpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + si);

        double ci = compoundInterest(principal, rate, time, 1); // Compounded annually
        System.out.println("Compound Interest: " + ci);
    }
}