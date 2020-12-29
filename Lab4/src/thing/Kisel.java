package thing;

public class Kisel implements Food {
    int PointToHeal = 5;
    String Name = "kisel";
    public void Kisel(){};
    public int eatFood(){
        System.out.print(this.Name+"\n");
        return this.PointToHeal;
    }
}
