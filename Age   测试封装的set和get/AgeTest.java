 public  class AgeTest
 {
	 public static void main(String[] args)
	 {
		 Age age = new Age();
		 System.out.println(age.getAge());

		 age.setAge(60);
		 age.setAge(-100);
		 age.setAge(660);

		 System.out.println(age.getAge());




	 }
 }