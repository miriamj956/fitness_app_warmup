public class MyProgram {

    public String getBadge(int steps) {
     
        if (steps < 5000){
            return "none";
        }
        else if (steps >= 5000 && steps >= 10000){
            return "bronze";
        }
        else if (steps >= 10000 && steps >= 20000){
            return "silver";
        }
        else {
            return "gold";
        }
    }
    public static void main(String[] args)
    {
        MyProgram badge = new MyProgram();
        System.out.print(badge.getBadge(6000));
    }
    
}
