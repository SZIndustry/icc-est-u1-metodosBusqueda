package controllers;

import models.Persona;
import views.*;

public class MetodoBusquedaBinario {
    private Persona[] person;
    private ShowConsole pantalla;

    public MetodoBusquedaBinario(Persona[] arregloPersonas) {
        this.person = arregloPersonas;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de busqueda binaria");
        
    }

    private int findePersonByCode(int code) {
        int alto = 0;
        int bajo = person.length - 1;
        while (alto <= bajo) {
            int medio = alto + (bajo - alto) / 2; 
            
            if (person[medio].getCode() == code) {
                return medio; 
            }
            
            if (person[medio].getCode() < code) {
                alto = medio + 1;
            }
            else {
                bajo = medio - 1;
            
            }
        }
        return -1;
    }

    public void ordenarArreglo(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getName().compareToIgnoreCase(personas[j + 1].getName()) > 0) {
                    Persona aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;
                }
            }
        }

        for (Persona o : personas) {
            System.out.println(o.getName());
        }
        
    }


    public String findPersonByName(String name) {
        int inicio = 0;
        int fin = person.length - 1;
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2; 
            
            String nombreMedio = person[medio].getName();
            
            int comparacion = nombreMedio.compareToIgnoreCase(name);
            
            if (comparacion == 0) {
                return person[medio].toString(); 
            }
            
            if (comparacion < 0) {
                inicio = medio + 1;
            }
            else {
                fin = medio - 1;
            }
        }
        
        return "nada"; 
    }

    
    public void showPersonByName() {
        String nameToFind = pantalla.inputName(); 
        String result = findPersonByName(nameToFind);
        if (!result.equals("nada")) {
            pantalla.showMessage("Persona con nombre " + nameToFind + " encontrada"); // <--
            pantalla.showMessage(result); 
        } else {
            pantalla.showMessage("Persona con nombre " + nameToFind + " no encontrada"); // <-- Manejo de error mejorado
        }
    }

    public void showPersonByCode() {
        int codeToFind = pantalla.inputCode();
        int indexPerson = findePersonByCode(codeToFind);

        if(indexPerson >= 0) {
            pantalla.showMessage("Persona con código " + codeToFind + " encontrada"); 
            pantalla.showMessage(person[indexPerson].toString()); 
        } else {
            pantalla.showMessage("Persona con código " + codeToFind + " no encontrada"); 
        }
    }
}

