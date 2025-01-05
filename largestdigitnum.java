public class largestdigitnum {
    public static void main(String[] args) {
        int num = 12534;
        int rem =0;
        int max = 0;
        while(num>0){
            rem=num%10;
            if(rem>max){
                max=rem;
            }
            num=num/10;
        }
        System.out.println(max);
    }
    
}
