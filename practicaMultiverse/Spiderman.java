package practicaMultiverse;
import practicaMona.Spider;
public class Spiderman{
        public String Nombre;
        public int edad;

        String getNombre(){
            return Nombre;
        }

        int getEdad(){
            return edad;
        }

        Spiderman(String Nom, int edad) {
            this.Nombre = Nom;
            this.edad = edad;
        }
    }
