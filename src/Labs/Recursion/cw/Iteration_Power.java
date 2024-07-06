package Labs.Recursion.cw;

public class Iteration_Power {
    private Integer x;
    private Integer y;

    public Iteration_Power(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public int Power(){
        int answer = 1;
        for(int i = 0; i<y; i++) {
            answer *= x;
        }
        return answer;
    }
    public void showAnswer(){
        System.out.println("Answer: " + Power());
    }
}
