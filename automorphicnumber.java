public class automorphicnumber {
    public static void main(String[] args) {
        int num=625;
        int num1=num;
        int sq=num*num;
        System.out.println("Square of "+ num+" is:"+ sq);
        int a=0;
        while(num>0)
        {
            a=num%1000;
            if(a==num1)
            {
                System.out.println("Ends with " + a +" so Automorphic Number");
            }
            else{
                System.out.println(a+" is not a Automorphic Number");
            }
            num=num/1000;

        }
       
        
    }
    
}
