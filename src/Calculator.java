import java.io.IOException;

public class Calculator
{
    static void calculation(int a, char op, int b)
    {
        int result = -1;

        switch (op)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                try
                {
                    throw new Exception("'" + op + "' is not a valid operator");
                }

                catch (Exception e)
                {
                    e.printStackTrace();
                }
                break;
        }

        if (IsRoman.isRoman == true)
        {
            String romanResult = "";

            while (result >= 100)
            {
                romanResult += "C";
                result -= 100;
            }
            while (result >= 90)
            {
                romanResult += "XC";
                result -= 90;
            }
            while (result >= 50)
            {
                romanResult += "L";
                result -= 50;
            }
            while (result >= 40)
            {
                romanResult += "XL";
                result -= 40;
            }
            while (result >= 10)
            {
                romanResult += "X";
                result -= 10;
            }
            while (result >= 9)
            {
                romanResult += "IX";
                result -= 9;
            }
            while (result >= 5)
            {
                romanResult += "V";
                result -= 5;
            }
            while (result >= 4)
            {
                romanResult += "IV";
                result -= 4;
            }
            while (result >= 1)
            {
                romanResult += "I";
                result -= 1;
            }

            System.out.println(romanResult);
        }

        else if (IsRoman.isRoman == false)
        {
            System.out.println(result);
        }


        try
        {
            Main.scanner();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
