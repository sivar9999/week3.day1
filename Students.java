package org.system;

public class Students {
	int id;
	String name;
	long l;
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		this.id=id;
		System.out.println(id);
		
	}
	public void getStudentInfo(int i, String string) {
		// TODO Auto-generated method stub
		this.id=id;
		name=string;
		System.out.println(id);
		System.out.println(string);
		
	}
	public void getStudentInfo(String string, long l) {
		// TODO Auto-generated method stub
		name=string;
	     l=l;
		System.out.println(string);
		System.out.println(l);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students obj =new Students();
		obj.getStudentInfo(1);
		obj.getStudentInfo(1,"siva");
		
		obj.getStudentInfo("sivarockz.44@gmail.com",8555990437l);
		
	

	}
	
	
	
	

}
