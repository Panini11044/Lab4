package korotsh;


import thing.*;

/* This is class Shpuntik
 * @version 1.0
 * @author Panin A.
 */
public class Shpuntik extends Korotsh{
    /* Contructor - creating new object
     * @param Name - Name
     * @param HP - Heath Point
     * @param g - gravity
     * */
    public Shpuntik(String Name, int HP, boolean g){
        this.Name = Name;
        PhysicalParametrs.setHP(HP);;
        this.setHeath();
        this.setGravity(g);
    }
    /* Method - creating new Porige
     * @return - nothing
     * */
    public Food cookPorige(){
        Food f = new Porige();
        System.out.println(this.Name + " cook porige");
        return f;
    }
    /* Method - creating new Kisel
     * @return - nothing
     * */
    public Food cookKisel(){
        Food f = new Kisel();
        System.out.println(this.Name + " cook kisel");
        return f;
    }
    /* Method - creating new Soup
     * @return - nothing
     * */
    public Food cookSoup(){
        Food f = new Soup();
        System.out.println(this.Name + " cook soup");
        return f;
    }
    /* Method - creating new Teapod
     * @return - nothing
     * */
    public void createTeapod(){
        Mecanism m = new Teapod();

        System.out.print(this.Name + " create teapod");
        m.doSomething();
    }
}

