package HomeWork2;

public class Exercise1 {
    public static void main(String[] args)
    {
            String str1 = "PHP Exercises and";
            String str2 = " Python Exercises  ";

            String str3 = str1.replaceAll("P", "");
            String str4 = str2.replaceAll("P", "");

            String str5 = str1.concat(str2);

            System.out.println("The concatenated string: " + str3 + str4 );
        }
    }
