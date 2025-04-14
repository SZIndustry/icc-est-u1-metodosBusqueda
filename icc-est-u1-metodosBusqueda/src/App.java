public class App {
    
    public static void main(String[] args) {
        MetodosBusqueda buscador = new MetodosBusqueda();
        
        int[] numeros = {10, 20, 30, 40, 50};
        int elementoABuscar = 30;
        
        int resultado = buscador.busquedaLineal(numeros, elementoABuscar);
        
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado en el arreglo");
        }
    }
}