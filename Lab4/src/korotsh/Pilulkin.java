package korotsh;

import enumeration.Place;
import thing.Pils;
/* This is class Pilulkin
 * @version 1.0
 * @author Panin A.
 */

public class Pilulkin extends Korotsh{
    /* Contructor - creating new object
     * @param Name - Name
     * @param HP - Heath Point
     * @param g - gravity
     * */
    public Pilulkin(String Name, int HP, boolean g){
        this.Name = Name;
        PhysicalParametrs.setHP(HP);;
        this.setHeath();
        this.setGravity(g);
    }
    /* Method - for walking in city
     * @return nothing
     * */
    public void walkInCity(){
        System.out.println(this.Name + " walk in city");
        this.setPlace(Place.OUTSIDE);
        this.setAppetite();
    }
    /* Method - creating new pils
     * @return nothing
     * */
    public Pils makePils(){
        Pils f = new Pils();
        System.out.println(this.Name + " make pil");
        return f;
    }
    /* Method - treating korotsh
     * @return nothing
     * */
    public void treatKorotsh(Korotsh k, Pils p){
        k.usePils(p);
    }

}



