package korotsh;

import enumeration.Heath;
import enumeration.Place;
import enumeration.Properties;
import thing.Food;
import thing.Pils;
/* This is class Korotsh
 * @version 1.0
 * @author Panin A.
 */

public abstract class Korotsh{
    public String Name;

    protected Heath heath;
    public Place place;
    public double Appetite = 0;
    public boolean Gravity;
    public static  class PhysicalParametrs{
        public static int HP;

        public static void setHP(int HP) {
            PhysicalParametrs.HP = HP;
        }

        public static int getHP() {
            return HP;
        }
    }
    @Override
    public String toString(){
        return this.Name;
    }
    @Override
    public int hashCode(){

        return 10 * Name.hashCode() + 20456;
    }

    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof Korotsh))
            return false;
        Korotsh p = (Korotsh)obj;
        if (this.hashCode() == p.hashCode())
            return true;
        else
            return false;
    }
    public void setPlace(Place p){
        this.place = p;
    }
    public Place getPlace(){
        return this.place;
    }
    public void setAppetite(){
        if (this.place == Place.OUTSIDE)
            this.Appetite = 0.1;
        else
            this.Appetite = 0.05;
    }
    public void deleteAppetite(){
        this.Appetite = 0;
    }
    public boolean getAppetite(){
        if (this.Appetite > 0)
            return true;
        else
            return false;
    }
    public boolean getGravity(){
        return this.Gravity;
    }
    public void setGravity(boolean g){
        this.Gravity = g;
    }
    public void setHeath(){
        if (PhysicalParametrs.HP >= 50)
            this.heath = Heath.HEATHY;
        else
            this.heath = Heath.SICK;
    }
    public Heath getHeath(){
        return this.heath;
    }
    public void eatFood(Food f){
        System.out.print(this.Name + " eat ");
        double healing = f.eatFood();
        PhysicalParametrs.HP += healing+ this.Appetite * healing;
        this.setHeath();

    }
    public void usePils(Pils p){
        PhysicalParametrs.HP += p.PointToRestore;
        if (p.p == Properties.SLEEP)
            System.out.println(this.Name + "is sleeping");
        if (p.p == Properties.PAIN)
            PhysicalParametrs.HP -= 5;
        if (p.p == Properties.SLEEP)
            System.out.println(this.Name + "can't move");
        this.setHeath();
        System.out.println(this.Name+"eat pil");
    }
}





