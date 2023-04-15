/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 
E2) Faça um programa que apresente os números de 1 a 15 na forma de um triangulo, como
apresentado a seguir:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
package exerciciose2;

/**
 *
 * @author igorn
 */
public class ExerciciosE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,l,n;
        
        l=1;
        
        
        for(n=1;n<=15;){
            for(i=0;i<l;i++)
            {
                System.out.print(n);
                n++;
            }
            System.out.print("\n");
            l++;
        }
    }
    
}
