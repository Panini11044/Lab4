package thing;

/* This is class Soup
 * @version 1.0
 * @author Panin A.
 */
public class Soup implements Food {
    int PointToHeal = 15;
    String Name = "soup";
    public void Soup(){};
    public int eatFood(){
        System.out.print(this.Name+"\n");
        return this.PointToHeal;
    }
}