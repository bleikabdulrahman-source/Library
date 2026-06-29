public class Main {
    public static void main(String args[]) {
        int numbers[] = {33,37,77,45};
        for(int i=0; i<numbers.length/2; i++) {
            int temp=numbers[i];
            numbers[i]=numbers[numbers.length-i-1];
            numbers[numbers.length-i-1]=temp;
        }
        for(int r=0; r<numbers.length; r++) {
            System.out.println(numbers[r]);
        }
    }
}