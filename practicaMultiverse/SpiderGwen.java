package practicaMultiverse;
    public class SpiderGwen extends Spiderman implements Ataques{
        double Ataque;

        @Override
        public double getAtaque(){
            return Ataque;
        }

        SpiderGwen(String Nom, int edad, double ataque){
            super(Nom, edad);
            this.Ataque = ataque;
        }
    }
