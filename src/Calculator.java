public class Calculator {

    public static int add(String numbers) {
        int result = 0;
        if (numbers.length() > 0) {
            String[] values = numbers.split(" ");
            for (String item : values) {
                result = result + Integer.parseInt(item);
            }
        }
        return result;
    }

    public static int mul(String numbers) {
        int result = 1;
        if (numbers.length() > 0)
        {
            String[] values = numbers.split(" ");
            for(String item: values) {
                int element = Integer.parseInt(item);
                result = result * element;
            }
        }
        return result;
    }
}









