package practicaMultiverse;
    public class GreenGoblin extends Spiderman implements Ataques{
        double Ataque;

        @Override
        public double getAtaque() {
            return Ataque;
        }

        GreenGoblin(String Nom, int edad, double Ataque){
            super(Nom, edad);
            this.Ataque = Ataque;
        }
    }
