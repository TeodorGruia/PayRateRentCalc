public class Calc {

    static void test_Method() {
        // Test method to make sure calculations work
        int init_pay = 20;
        int per_year = (init_pay * 160) * 12;


        System.out.println(per_year);
    }
    static String rent_amt(double pay) {
        //The real deal, this method takes a double, pay, and calculated the yearly salary
        //It then divides that salary by 1/3 to get the afordable MAX per-month rent
        //Also cleanly formatted to two decimal places

        double best_rent = ((pay *160) * 12) /33;
        String Output = String.format("%.2f", best_rent);
        return Output;
    }
    static void mult_rent_amts(double amt1, double amt2, double amt3) {
        //Calculate the affordable rent amount for three values, instead of just one
        double[] amounts = {amt1, amt2, amt3};
        String output;
        for (double i = 0;  i < amounts.length; i++) {
            output = rent_amt(amounts[(int)i]);
            System.out.println("The MAX per-month rent you can afford on a $" + amounts[(int)i] + " per hour salary is " + "$" + output);
        }
    }

    public static void main(String[] args) {
        //This is where the 'engine' lives
        //You can edit the m_pay variable to any double and the 
        //next line will print out what you put in
        //Then, the following line will print out the MAX per-month rent
        //you can afford with that pay.

        double m_pay = 25; 
        System.out.println("Your Hourly Rate is: " + m_pay);
        System.out.println("Your max rent per month is: " + "$" + rent_amt(m_pay));
        mult_rent_amts(21, 25, 30);
    }
    
}
