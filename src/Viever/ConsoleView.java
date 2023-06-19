package Viever;

public class ConsoleView {

    public ConsoleView() {

    }


    public static void paramPerMonth(int wool, int meat ) {
        System.out.printf(Text.STRING_FORMAT_MESSAGE_PARAMETER, Text.QUANTITY_OF_WOOL_PER_MONTH, wool, Text.GRAM);
        System.out.println();
        System.out.printf(Text.STRING_FORMAT_MESSAGE_PARAMETER, Text.QUANTITY_OF_MEAT_PER_MONTH, meat, Text.KILOGRAM);
        System.out.println();
    }

}
