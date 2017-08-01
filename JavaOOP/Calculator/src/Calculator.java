public class Calculator implements java.io.Serializable {
    private double operandOne;
    private double operandTwo;
    private double result;
    private char operation;

    Calculator(){}

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void performOperation(){
        switch (operation){
            case '+':
                result = operandOne + operandTwo;
                break;
            case '-':
                result = operandOne - operandTwo;
                break;
            default:
                break;
        }
    }

    public double getResult() {
        return result;
    }
}
