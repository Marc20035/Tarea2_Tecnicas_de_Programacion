/*¿Qué hace este algoritmo?

Algo QueHace
¿Qué hace este algoritmo?
Variable valor1, valor2: real
Inicio
valor1 <- enter("Introduza un valor: ")
valor2 <- enter("Introduza otro valor: ")
tratamiento valor1 <- valor2
valor2 <- valor1
escribir("valor1 = " & valor1 & "; valor2 = " & valor2)
Fin */

//Este algoritmo intercambia el valor de dos variables
//Suponiendo que valor 1 = 5 y valor2 = 3
//En el primer caso, valor1 = 5; valor2 = 3

class Ejercicio4{
    public static void main(String[] args){
        double valor1, valor2;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca otro valor: "));
        double aux = valor1;
        valor1 = valor2;
        valor2 = aux;
        System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);
    }
}