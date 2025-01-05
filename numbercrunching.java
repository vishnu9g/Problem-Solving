public class numbercrunching {
    public static void main(String[] args) {
        //sum of numbers from whole integer
        int num=123;
        int sum=0;
        int res=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
        System.out.println(num);
    }
    
}
