package thing;

import enumeration.Properties;

/* This is class Pils
 * @version 1.0
 * @author Panin A.
 */
public class Pils{
    public int PointToRestore;
    public Properties p;
    public void Pils(){
        this.PointToRestore = (int)Math.random()*10+10;
        if(Math.random() > 0.5)
            this.p = Properties.SLEEP;
        if((Math.random() <= 0.5)&(Math.random() > -0.5))
            this.p = Properties.PAIN;
        if(Math.random() < -0.5)
            this.p = Properties.PARALYZE;
    }
}
