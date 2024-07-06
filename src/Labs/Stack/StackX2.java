package Labs.Stack;
public class StackX2 {
    private int maxsize;
    private String[] Stack;
    private int top;
    private String word;

    public StackX2(){
        maxsize = 0;
        top = -1;
    }
    public void isPalindrome(String word) throws InterruptedException {
        this.word = word;
        maxsize = word.length();
        Stack =  new String[maxsize];
        for(int i = 0; i < maxsize; i++){
            Stack[++top] = String.valueOf(word.charAt(i));
        }
        System.out.println("Checking....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if(checker()){
            System.out.print("The word "+ word +" is a palindrome");
        }
        else{
            System.out.print("The word "+ word +" is not a palindrome");
        }
    }
    public boolean checker(){
        StringBuilder newWord = new StringBuilder();
        for(int i = top; i > -1; i--){
            newWord.append(Stack[i]);
        }
        if(newWord.toString().equals(word)){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }
}