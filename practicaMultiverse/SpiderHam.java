package practicaMultiverse;
    public class SpiderHam extends Spiderman implements Ataques{
        double Ataque;

        @Override
        public double getAtaque(){
            return Ataque;
        }

        SpiderHam(String Nom, int edad, double Ataque){
            super(Nom, edad);
            this.Ataque = Ataque;
        }
    }
