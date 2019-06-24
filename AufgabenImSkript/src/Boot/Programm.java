package Boot;

public class Programm {

   public static void main(String[] args){
       Boot boot1 = new Boot("Titanic","rot");
       ausgebem(1,boot1);
       Boot boot2 = boot1;
       Boot boot3 = boot1.clone();
       Werkstatt werkstatt = new Werkstatt();
       werkstatt.umlackieren(boot2,"schwarz");
       werkstatt.umlackieren(boot3,"grün");
       ausgebem(1,boot1);
       ausgebem(2, boot2);
       ausgebem(3,boot3);

   }

   static void ausgebem(int i, Boot b){
       System.out.println("Boot" + i + ": " + b.name + "," + b.farbe );
   }
}

