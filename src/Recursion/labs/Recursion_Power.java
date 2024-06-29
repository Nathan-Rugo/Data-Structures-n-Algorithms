package Labs.Recursion.labs;

public class Recursion_Power {
    private Integer x;
    private Integer y;
    public Recursion_Power(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public int Power(){
        if (y == 0){
            return 1;}
        else{
            y-=1;
            return x * Power();}
        }
    public void showAnswer(){
        System.out.print("Answer: " + Power());
    }

}

