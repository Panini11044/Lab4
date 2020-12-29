package thing;
/* This is class Porige
 * @version 1.0
 * @author Panin A.
 */
public class Porige implements Food {
    int PointToHeal = 10;
    String Name = "porige";
    public void Porige(){};
    public int eatFood(){
        System.out.print(this.Name+"\n");
        return this.PointToHeal;
    }
}
