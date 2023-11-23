import java.util.*;
class testCase
{
    public static String generateStringTestCase() 
    {
        Random random = new Random();
        int length= random.nextInt(26);
        String CHARACTERS= "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randomString = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            randomString.append(CHARACTERS.charAt(randomIndex));
        }

        return randomString.toString();
    }

    public static char generateCharTestCase() 
    {
        String chars = "qwertyuiopasdfghjklzxcvbnm";
        Random random = new Random();
        return chars.charAt(random.nextInt(chars.length()));
    }

    public static float generateFloatTestCase() 
    {
        Random random = new Random();
        return random.nextFloat() * 100;
    }

    public static int generateIntTestCase()
    {
        Random random = new Random();
        return random.nextInt();
    }

    public static void main(String args[])
    {
        for(int i= 0; i<10; i++)
        {
            for(int j= 0; j<3; j++)
            {
                Random random= new Random();
                int k= random.nextInt(5);
                switch(k)
                {
                    case 0:
                        System.out.print(generateCharTestCase()+" ");
                        break;
                    case 1:
                        System.out.print(generateFloatTestCase()+" ");
                        break;
                    case 2:
                        System.out.print(generateIntTestCase()+" ");
                        break;
                    case 3:
                        System.out.print(generateStringTestCase()+" ");
                        break;
                    case 4:
                        System.out.print(generateIntTestCase()+"i ");
                        break;    
                }
            }
            System.out.println();
        }
    }
}