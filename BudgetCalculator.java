public class BudgetCalculator 
{
    // these lines code for constants 
    public static final double SALARY = 3000.0;
    public static final double SAVINGS_PERCENT = 0.20;
    public static final double RENT_PERCENT = 0.30;
    public static final double GROCERIES_PERCENT = 0.15;
    public static final double ENTERTAINMENT_PERCENT = 0.10;

    public static void main(String[] args)
    {
        // the above line is the method I will used to run the program
        // the lines below are used to declare the variables to hold the calculated values
        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount; 
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;

        // the lines below are to perform calculations 
        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = monthlySalary - totalExpenses;

        // the lines below are to print the message out
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Amount Saved: $" + savedAmount);
        System.out.println("Amount Spent on Rent: $" + rentAmount);
        System.out.println("Amount Spent on Groceries: $" + groceriesAmount);
        System.out.println("Amount Spent on Entertainment: $" + entertainmentAmount);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + remainingBalance);
    }
}
