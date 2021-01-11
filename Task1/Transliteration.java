package Task1;

import java.sql.SQLOutput;
import java.util.Scanner;

class Transliteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence (30 symbols is max)");

        String сyrillic = input.nextLine();
        if (сyrillic.length() > 30) {
            System.out.println("This phrase is to long");
            return;
        }
        System.out.println(stringTolatyn(сyrillic));
    }


    public static String encode (String toEncode)
    {
        String latyn = toEncode;

        if (toEncode.equalsIgnoreCase("а"))
            latyn = "a";
        if (toEncode.equalsIgnoreCase("б"))
            latyn = "b";
        if (toEncode.equalsIgnoreCase("в"))
            latyn = "v";
        if (toEncode.equalsIgnoreCase("г"))
            latyn = "g";
        if (toEncode.equalsIgnoreCase("д"))
            latyn = "d";
        if (toEncode.equalsIgnoreCase("е"))
            latyn = "e";
        if (toEncode.equalsIgnoreCase("ж"))
            latyn = "zh";
        if (toEncode.equalsIgnoreCase("з"))
            latyn = "z";
        if (toEncode.equalsIgnoreCase("и"))
            latyn = "i";
        if (toEncode.equalsIgnoreCase("й"))
            latyn = "j";
        if (toEncode.equalsIgnoreCase("к"))
            latyn = "k";
        if (toEncode.equalsIgnoreCase("л"))
            latyn = "l";
        if (toEncode.equalsIgnoreCase("м"))
            latyn = "m";
        if (toEncode.equalsIgnoreCase("н"))
            latyn = "n";
        if (toEncode.equalsIgnoreCase("о"))
            latyn = "o";
        if (toEncode.equalsIgnoreCase("п"))
            latyn = "p";
        if (toEncode.equalsIgnoreCase("р"))
            latyn = "r";
        if (toEncode.equalsIgnoreCase("с"))
            latyn = "s";
        if (toEncode.equalsIgnoreCase("т"))
            latyn = "t";
        if (toEncode.equalsIgnoreCase("у"))
            latyn = "u";
        if (toEncode.equalsIgnoreCase("ф"))
            latyn = "f";
        if (toEncode.equalsIgnoreCase("х"))
            latyn = "x";
        if (toEncode.equalsIgnoreCase("ц"))
            latyn = "c";
        if (toEncode.equalsIgnoreCase("ч"))
            latyn = "ch";
        if (toEncode.equalsIgnoreCase("ш"))
            latyn = "sh";
        if (toEncode.equalsIgnoreCase("щ"))
            latyn = "shh";
        if (toEncode.equalsIgnoreCase("ы"))
            latyn = "y";
        if (toEncode.equalsIgnoreCase("э"))
            latyn = "e";
        if (toEncode.equalsIgnoreCase("ю"))
            latyn = "yu";
        if (toEncode.equalsIgnoreCase("я"))
            latyn = "ya";
        return latyn;
    }
    public static String stringTolatyn (String text )
    {
        String newText = "";
        String selectedChar;
        String convertedChar;
        for (int i = 0; i < 29; i++) {
            selectedChar = text.charAt(i) + "";

            convertedChar = encode(selectedChar);

            if (convertedChar.equalsIgnoreCase("")) {
                newText = newText + " ";
            } else {
                newText = newText + convertedChar;
                if (!convertedChar.equalsIgnoreCase("")) {
                    newText = newText + "";
                }
            }
        }
        return newText;
    }
}