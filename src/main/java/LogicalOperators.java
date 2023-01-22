public class LogicalOperators {
    public int logicalOperationsAnd(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("Both the condition are checked and first number is minimum number");
        }
        return firstNumber;
    }

    public int logicalOperationsOr(int firstNumber, int secondNumber, int thirdNumber) {

        if(firstNumber<secondNumber||firstNumber<thirdNumber){
            System.out.println("At least one condition is checked and first number is minimum number");
        }
        return firstNumber;
    }

    public int logicalOperationsNot(int firstNumber, int secondNumber, int thirdNumber) {

        if(firstNumber!=secondNumber){
            System.out.println("condition not equal is checked ");
        }
        else
        {
            return secondNumber;
        }
        return firstNumber;
    }
}







