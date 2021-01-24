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
        double normalTime = 40;
        double maximumWorkingTime = 60;
        double overTimeBonus = 1.5;
        double minimumWage = 8;
        
        double overTime = hoursWorked - normalTime;
        
        double normalTimePay;
        double overTimePay;
        double totalTimePay;
        

        //test if basePay is not less than the minimum wage or the hours worked is not greater than 60
        if ((basePay < minimumWage) || (hoursWorked > maximumWorkingTime)){
            if (basePay < minimumWage){
                System.out.println("Error: base pay must not be less than the minimum wage ($8 an hour)");
            }
            if (hoursWorked > maximumWorkingTime){
                System.out.println("Error: number of hours worked must not be more than 60");
            }
        }

        else {
            // if hours worked is less than or equal to normalTime the normalTimePay is hoursWorked * basePay
            //however if its not then normalTimePay is normalTime * basePay
            normalTimePay = hoursWorked <= normalTime ? hoursWorked * basePay : normalTime * basePay;

            // if hours worked is less than or equal to normalTime the overTimePay is 0
            // however if its not then overTimePay is overtime * basePay * overTimeBonus
            overTimePay = hoursWorked <= normalTime ? 0 : overTime * basePay * overTimeBonus;
            totalTimePay = normalTimePay + overTimePay;
            System.out.println("Total time pay is " + "$" + totalTimePay);
        }
    }
}
