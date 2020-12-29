package korotsh;

import thing.Mecanism;
import thing.Teapod;

/* This is class Vintik
* @version 1.0
* @author Panin A.
*/
public class Vintik extends Korotsh{
    /* Contructor - creating new object
    * @param Name - Name
    * @param HP - Heath Point
    * @param g - gravity
    * */
    public Vintik(String Name, int HP, boolean g){
        this.Name = Name;
        PhysicalParametrs.setHP(HP);;
        this.setHeath();
        this.setGravity(g);
    }
    /* Method - for driving car
     * @return nothing
     * */
    public void driveCar(){
        System.out.println(this.Name + " ride a car");
    }
    /* Method - creating new teapod
     * @return nothing
     * */
    public void createTeapod(){
        Mecanism m = new Teapod();

        System.out.print(this.Name + " create teapod");
        m.doSomething();
    }
}

