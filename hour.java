public class hour {
    public static void main(String[] args) {
        int time = 18;
        if (time >=0 && time <12){
            System.out.print("Morning");
        }
        else if (time >=12 && time <16){
            System.out.print("Afternoon");
        }
        else{
            System.out.print("Evening");
        }
    }
    
}
