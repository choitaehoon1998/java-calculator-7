package calculator;

public class Application {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.getInput();
        SeparatorParser separatorParser = new SeparatorParser(input);
        if (separatorParser.isCustomSeparatorExist()) {
            String mathExpression = separatorParser.getMathematicalExpression();
            String customSeparator = separatorParser.getCustomSeparator();
            StringDivider stringDivider = new StringDivider(customSeparator);
            String[] dividedNum = stringDivider.divideStringBy(mathExpression);
            Calculator calculator = new Calculator();
            int result = calculator.sum(dividedNum);
            OutputHandler outputHandler = new OutputHandler();
            outputHandler.printResult(result);
            return;
        }
        StringDivider stringDivider = new StringDivider();
        String[] dividedNum = stringDivider.divideStringBy(input);
        Calculator calculator = new Calculator();
        int result = calculator.sum(dividedNum);
        OutputHandler outputHandler = new OutputHandler();
        outputHandler.printResult(result);
    }

}
