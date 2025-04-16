import controllers.MetodosBusqueda;
import models.Persona;

public class App {
    
    public static void main(String[] args) {
        Persona[] peoples = new Persona[7];
        peoples[0] = new Persona(101,"Juan");
        peoples[1] = new Persona(102,"Maria");
        peoples[2] = new Persona(103,"Carlos");
        peoples[3] = new Persona(104,"Ana");
        peoples[4] = new Persona(105,"Luis");
        peoples[5] = new Persona(106,"Sofia");
        peoples[6] = new Persona(107,"Pedro");
        
        MetodosBusqueda mB = new MetodosBusqueda(peoples);

        
        
        // int[] numeros = {10, 20, 30, 40, 50};
        // int elementoABuscar = 30;
        
        // int resultado = mB.busquedaLineal(numeros, elementoABuscar);
        
        // if (resultado != -1) {
        //     System.out.println("Elemento encontrado en la posición: " + resultado);
        // } else {
        //     System.out.println("Elemento no encontrado en el arreglo");
        // }
    }
}