package practicaMultiverse;
    public class Principal {
        public static void main(String[] args) {
            System.out.println("***** Green Goblin *****");
            GreenGoblin objGB = new GreenGoblin("Green Goblin",58,105.20);
            System.out.println("Nombre: " + objGB.getNombre() + " Edad: " + objGB.getEdad() + " Ataque: " + objGB.getAtaque());

            Ataques attacks = new GreenGoblin("Green Goblin",58,105.20);
            System.out.println("Cast: " + ((GreenGoblin) attacks).getNombre() + "\n");

            System.out.println("///// Spider-Ham /////");
            Ataques attack = new SpiderHam("Spider-Ham",
                    1983,72.66);
            SpiderHam ObjSH = new SpiderHam("Spider-Ham",
                    1983,72.66);
            System.out.println("Nombre: " + ObjSH.getNombre() + " Año: " + ObjSH.getEdad() + " Ataque: " + ObjSH.getAtaque());
            System.out.println("Cast: " + ((SpiderHam) attack).getNombre() + "\n");

            System.out.println("------ Spider-Gwen -------");
            /*SpiderGwen ObjSG = new SpiderGwen("Spider-Gwen",
                    16,120.01);*/
            //System.out.println("Nombre: " + ObjSG.getNombre() + " Edad: " + ObjSG.getEdad() + " Ataque: " + ObjSG.getAtaque());
            Ataques ATTACKS = new SpiderGwen("Spider-Gwen",
                    16,120.01);
            System.out.println("Cast: " + ((SpiderGwen) ATTACKS).getNombre() + " " + ((SpiderGwen) ATTACKS).getEdad() + " " + ((SpiderGwen) ATTACKS).getAtaque());
        }
    }
