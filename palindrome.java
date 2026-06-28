class Main {
    public static void main(String args[]) {
        boolean check=true;
        char word[] = {'l','e','v','e','l'};
        for(int i=0; i<word.length/2;i++) {
            if(word[i]!=word[word.length-1-i]) {
                check=false;
            }
        }
        System.out.println(check);
    }
}