package dk.cngroup.university.input.calculator.operation;

import dk.cngroup.university.input.calculator.Operation;

public class Subtraction extends Operation {

    public static final String KEYWORD = "subtract";

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 - operand2;
    }
}
