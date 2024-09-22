package l18;

public class l18 {
    public static void main(String[] args) {
        //1
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers,0));
        //2
        System.out.println(count7(717771237));

    }
    //1
    public static int recursionSum(int[] n,int c){
        if (n.length == c){
            return 0;
        }
        return recursionSum(n,c+1)+n[c];
    }
    //2
    public static int count7(int x){
        if (x==0){
            return 0;
        }
        if (x%10 == 7){
            return 1+count7(x/10);
        }
        else{
            return count7(x/10);
        }
    }
}
