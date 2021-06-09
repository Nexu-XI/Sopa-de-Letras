import java.util.*;

public class Loteria {

    public static void main(String[] args) {
        
        ArrayList<Integer> bono = new ArrayList();
        ArrayList<Integer> complementarioA = new ArrayList();
        
        for (int i = 0; i < 6; i++) {   // Bucle que genera 6 numeros
            
            int numero = (int) Math.floor(Math.random()*49+1);    // Generar un numero entre 0 y 50 sin contar 50
              
            if (bono.contains(numero)) {    // Comprobar que el numero generado no esta dentro del ArrayList
                i = i - 1;  // Si el numero se repite el bucle retrocede uno
            }else{
                bono.add(numero);   // Si no se repite metemos el numero
                
                /*
                int complementario = (int) Math.floor(Math.random()*49+1);
                complementarioA.add(complementario);
                */
                
            }
            
        }
        Collections.sort(bono); // Ordenar los elementos de menor a mayor
        //Collections.sort(bono, Collections.reverseOrder()); /*Ordenar al reves*/
        
        //int complementario = complementarioA.get(0); /*Hacer que el complementario no sea un nuemro repetido*/
        
        System.out.println("Combinacion Ganadora\t\tComplementario");
        System.out.println("--------------------\t\t--------------");
        ArrayList<Integer> par = new ArrayList();   // Crear el ArrayList Par
        ArrayList<Integer> impar = new ArrayList(); // Crear el ArrayList Impar
        for (int i = 0; i < bono.size(); i++) { // Leemos todos los numeros del ArrayList Bono
            System.out.print(bono.get(i)+" ");
            
            if (bono.get(i)%2==0) { // Comprobamos si son pares, si no entonces son impares
                par.add(bono.get(i));
            }else{
                impar.add(bono.get(i));
            }
        }
        int complementario = (int) Math.floor(Math.random()*49+1);    // Creamos un numero aleatorio
        System.out.println("\t\t"+complementario);
        System.out.println("Pares:");
        for (int i = 0; i < par.size(); i++) {  // Leemos los numeros pares
            System.out.print(par.get(i)+" "); 
        }
        System.out.println("\n");
        System.out.println("Imares:");
        for (int i = 0; i < impar.size(); i++) {    // Leemos los numeros impares
            System.out.print(impar.get(i)+" "); 
        }
        System.out.println("\n");
        System.out.println("El mensaje secreto es:");   // Leemos el ArrayList otra vez
        for (int i = 0; i < bono.size(); i++) {
            int letra = bono.get(i);    // Creamos un int que tenga el valor del elemento del ArrayList
            System.out.print((char)letra);  // Pasamos a char el int y lo mostramos en pantalla
        }
        System.out.println("");
        
        /*
        int suma = 0;
        for (int i = 0; i < bono.size(); i++) {
            suma = suma + bono.get(i);
        }
        suma = suma + complementario;
        System.out.println("\n");
        System.out.println("Todos los numeros sumados: "+suma);
        System.out.println("Suma de los numeros a char: "+(char)suma);
        System.out.println("");
        
        ArrayList<Integer> bonototal = new ArrayList();
        bonototal = bono;
        bonototal.add(complementario);
        String cadenado = bonototal.toString();
        System.out.println("cadenado = " + cadenado);
        */
    }
    
}
