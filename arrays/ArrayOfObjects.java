package arrays;

public class ArrayOfObjects {
	public static void main(String[] args) {
		Student arr[]=new Student[2];
		Student s1=new Student(1,"Mourya");
		arr[0]=s1;
		arr[1]=new Student(2,"Gowda");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);

	}


}
