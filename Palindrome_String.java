class Problemsolving 
{
    public static void main(String[] args) 
	{
		String a = "problemsolving";
		String b = "";
		for(int i=0;i<a.length();i++)
		{
			b=a.charAt(i)+b;
		}
		System.out.println("String : " + a);
		System.out.println("Reversed String : " + b);
		if(a.equals(b)){
			System.out.println("Palindrome");
		}else{
		   System.out.println("Not a Palindrome");
		}
	 }
}