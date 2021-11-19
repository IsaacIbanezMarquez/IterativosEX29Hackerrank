
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



// ENUNCIADO:

// Piràmide_:

/*  Donat un nombre N enter positiu i senar, dibuixa una piràmide amb * on la base tingui 5 N.

Input Format

Nombre N enter, positiu i senar.

Constraints

No n'hi ha.

Output Format

Piràmide amb base 5 *

Sample Input 0

5
Sample Output 0

  *
 ***
*****

 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int filas = 1;

        int mitad = (int)Math.floor(num/2);


        while ( filas <= num)
        {
            int columnas = 0;
            int blancos = 0;

            while(columnas < filas)
            {
                while (blancos < mitad)
                {
                    System.out.print(" ");
                    blancos++;
                }
                System.out.print("*");
                columnas++;

            }
            mitad--;
            filas +=2;
            System.out.println("");
        }

    }
}
