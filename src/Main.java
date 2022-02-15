import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            scanner();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    static void scanner() throws IOException
    {
        Scanner console = new Scanner(System.in);

        String a, b;
        char op;
        int a1, b1;

        a = console.next();
        op = console.next().charAt(0);
        b = console.next();

        try
        {
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
            IsRoman.isRoman = false;
        }

        catch (NumberFormatException e)
        {
            a1 = romanConverter(a);
            b1 = romanConverter(b);
            IsRoman.isRoman = true;
        }

        if ( a1 <= 0 || a1 > 10 || b1 <= 0 || b1 > 10)
        {
            throw new IOException("\nНеверный тип данных" +
                    "\nИспользовать можно только числа от 1 до 10" +
                    "\nИспользовать можно только римские или только арабские числа");
        }

        Calculator.calculation(a1, op , b1);
    }

    private static int romanConverter (String n)
    {
        try
        {
            switch (n)
            {
                case "I": return 1;
                case "II": return 2;
                case "III": return 3;
                case "IV": return 4;
                case "V": return 5;
                case "VI": return 6;
                case "VII": return 7;
                case "VIII": return 8;
                case "IX": return 9;
                case "X": return 10;
            }
        }

        catch (InputMismatchException e)
        {
            throw new InputMismatchException("Неверный формат данных");
        }

        return -1;
    }
}



