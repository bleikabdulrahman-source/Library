public class Main {
    public static void main(String[] args) {
        int t=0;
        int scores[] = {67,23,78,38,91};
        for(int i=0; i<scores.length;i++) {
            if(t<scores[i]) {
                t=scores[i];
            }
        }
        System.out.println("The highest score is "+t);
    }
}