/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eelupubg;

/**
 *
 * @author darkchaker
 */
public class Eelupubg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("i)");
        int e = 1;
        int i = 1;
        while (e < 5) {
            while (i < 10) {
                System.out.print("*");
                i++;
            }
            i = 1;
            System.out.print("\n");
            e++;
        }
        System.out.println("ii)");
        int f = 1;
        int g = 1;
        int h = 0;
        while (g < 6) {
            while (h < g) {
                System.out.print("*");
                h++;
            }
            System.out.print("\n");
            h = 0;
            g++;
        }

        System.out.println("iii)");
        f = 1;
        g = 1;
        h = 0;
        int x = 1;
        int y = 1;
        while (g < 6) {
            x = g;
            while (x > 1) {
                //while (x < g) {
                //    System.out.print(x);
                //    x++;
                //}
                System.out.print(x);
                x--;
            }
            while (x <= g) {
                System.out.print(x);
                x++;
            }
            System.out.print("\n");
            g++;

        }
        System.out.println("iv)");
        f = 1;
        g = 1;
        h = 0;
        x = 1;
        y = 1;
        while (g < 6) {
            x = g;
            while (x > 1) {
                //while (x < g) {
                //    System.out.print(x);
                //    x++;
                //}
                System.out.print("*");
                x--;
            }
            while (x <= g) {
                System.out.print("*");
                x++;
            }
            System.out.print("\n");
            g++;

        }
        System.out.println("v)");
        f = 1;
        g = 1;
        h = 0;
        x = 1;
        y = 1;
        while (g < 6) {
            while (y < f + 1 && f <= g) {
                while (x < g + 1) {
                    for (int j = 0; j < x; j++) {
                        System.out.print(x);
                    }
                    if(x>1)
                    System.out.print(x);
                    x++;
                    f++;
                }
                y++;
            }
            System.out.print("\n");
            g++;
        }

    }

}
