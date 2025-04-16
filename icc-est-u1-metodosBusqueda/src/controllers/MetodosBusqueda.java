package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Persona[] People;
    
    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.People = persons;
        
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

    public void showPerson() {
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0) {
            showConsole.showMessage("Persona con codigo" + codeToFind + " encontrada");
            showConsole.showMessage(People[indexPerson].toString());
        }
    }

}