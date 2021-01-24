public class FooCorporation {
    public static void main(String[] args) {
        //Employee 1
        printTotalPay(7.5, 35);
        //Employee 2
        printTotalPay(8.2, 47);
        //Employee 3
        printTotalPay(10, 73);
    }
    public static void printTotalPay(double basePay, double hoursWorked){
        double normalTimePay;
        double overTimePay;
        double totalTimePay;
        if (basePay < 8){
            System.out.println("Error: base pay must not be less than the minimum wage ($8 an hour)");
        }
        else if (hoursWorked <= 40){
            normalTimePay = hoursWorked * basePay;
            overTimePay = 0;
            totalTimePay = normalTimePay + overTimePay;
            System.out.println("Total time pay is " + "$" + totalTimePay);
        }
        else if ((hoursWorked > 40) && (hoursWorked <= 60)){
            normalTimePay = 40 * basePay;
            overTimePay = (hoursWorked - 40) * basePay * 1.5;
            totalTimePay = normalTimePay + overTimePay;
            System.out.println("Total time pay is " + "$" + totalTimePay);
        }
        else if (hoursWorked > 60){
            System.out.println("Error: number of hours worked must not be more than 60");
        }
    }
}
