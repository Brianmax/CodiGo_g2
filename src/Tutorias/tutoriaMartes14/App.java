package Tutorias.tutoriaMartes14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Persona estudiante = new Estudiante("Jorge", "Lazarte", 18.3f);
        List<Persona> lita1 = new ArrayList<>();
        lita1.add(estudiante);
        lita1.add(new Estudiante("Mercedes", "Montes", 15.4f));
        lita1.add(new Profesor("Miguel", "Fuentes", "Ingeniero"));
        lita1.add(new Profesor("Jose", "Valdivia", "Jardinero"));

        for (Persona persona : lita1) {
            persona.showInfo();
        }
    }
}
