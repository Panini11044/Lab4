package korotsh;

import exception.RopeNotGoodException;
import exception.RopeNotGoodException;
import thing.Mecanism;


public class Znaika extends Korotsh{
    /* Contructor - creating new object
     * @param Name - Name
     * @param HP - Heath Point
     * @param g - gravity
     * */
    public Znaika(String Name, int HP, boolean g){
        this.Name = Name;
        PhysicalParametrs.setHP(HP);
        this.setHeath();
        this.setGravity(g);
    }
    public void walkAroundTheHouse(){
        class House{
            final boolean Gravity = false;
            double height = 10;
            double weight = 10;
        }
        House h = new House();
        this.setGravity(h.Gravity);
    }
    public void exploreGravity() throws RopeNotGoodException {
        this.walkAroundTheHouse();
        Mecanism Rope = new Mecanism(){
             @Override
             public void doSomething(){
                 System.out.printf("Znaika use rope");
             }
        };
         System.out.print("Znaika understand that ");
        final double lenght = Math.random() * 50;
        final double strenght = Math.random() * 50;
        if (lenght > 20 & strenght > 25) {
            Fact.AbouteGravity f = new Fact.AbouteGravity();
        }
        else
            throw new RopeNotGoodException("Rope not long for explore gravity");
        this.setGravity(true);
    }
}
