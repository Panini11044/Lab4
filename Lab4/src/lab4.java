import exception.*;
import korotsh.*;
import thing.Food;

/* This is class lab4
 * @version 2.0
 * @author Panin A.
 */
public class lab4 {
    /* Method Main - starts work project
     * @param args[] - massive of arguments
     * */
    public static void live() throws KorotshNotDifferentException{
        Shpuntik sh = new Shpuntik("Shpuntik", 75, true);
        Vintik v = new Vintik("Vintik", 30, false);
        Pilulkin p = new Pilulkin("Pilulkin", 80, true);
        Znaika z = new Znaika("Znaiks", 95, true);
        if ((!sh.equals(v)) & (!sh.equals(p)) &(!v.equals(p)) & (!z.equals(p))){
            try{
                z.exploreGravity();
            } catch (RopeNotGoodException e) {
                System.out.println(e.getMessage());
            }
            p.walkInCity();
            sh.createTeapod();
            Food f = sh.cookPorige();
            Food f1 = sh.cookKisel();
            Food f2 = sh.cookSoup();
            v.eatFood(f);
            v.eatFood(f1);
            v.eatFood(f2);
        }
        else
            throw new KorotshNotDifferentException("Korotshs are not different");

    }
    public static void main(String args[]) {
        try{
            live();
        } catch (KorotshNotDifferentException e) {
            System.out.println(e.getMessage());
        }
    }
}

