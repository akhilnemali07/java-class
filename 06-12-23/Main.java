class CustomConversionException extends Exception {
    public CustomConversionException(String message) {
        super(message);
    }
}

public class Main {
    public static int convertToInt(String str) throws CustomConversionException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new CustomConversionException("Failed to convert '" + str + "' to an integer.");
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = convertToInt(input);
                System.out.println("Converted '" + input + "' to integer: " + result);
            } catch (CustomConversionException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}