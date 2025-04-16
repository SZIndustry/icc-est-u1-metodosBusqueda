package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Persona[] People;
    
    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole(); 
        this.People = persons;
        showPerson();
        showPersonByName();
    }

    public int busquedalinea(int[] arreglo, int valorBuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscar) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code) {
        for (int i = 0; i < People.length; i++) {
            if (People[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public String findPersonByName (String name) {
        for (int i = 0; i < People.length; i++) {
            if (People[i].getName().equalsIgnoreCase(name)) {
                return People[i].toString(); 
            }
        }
        return "nada";
    }

    public void showPersonByName() {
        String nameToFind = showConsole.inputName(); 
        String result = findPersonByName(nameToFind);
        if (!result.equals("nada")) {
            showConsole.showMessage("Persona con nombre " + nameToFind + " encontrada"); // <--
            showConsole.showMessage(result); 
        } else {
            showConsole.showMessage("Persona con nombre " + nameToFind + " no encontrada"); // <-- Manejo de error mejorado
        }
    }

    public void showPerson() {
        int codeToFind = showConsole.inputCode(); 
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0) {
            showConsole.showMessage("Persona con código " + codeToFind + " encontrada"); 
            showConsole.showMessage(People[indexPerson].toString()); 
        } else {
            showConsole.showMessage("Persona con código " + codeToFind + " no encontrada"); 
        }
    }
    
}
