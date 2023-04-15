/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 
E1) Faça um programa que apresente os números de 1 a 10, sendo que cada número deve ser
impresso em uma linha e os números ímpares deslocados (\t) a direita.
*/
package exerciciose1;

/**
 *
 * @author igorn
 */
public class ExerciciosE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++){
            if (i%2==0){
           System.out.println(i);
            }
        else {
                System.out.println("\t"+ i);
                }
        }
    }
    
}
