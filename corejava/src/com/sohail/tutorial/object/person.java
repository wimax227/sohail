package com.sohail.tutorial.object;

public class person { //this is called as POJO/Domain classes
        private int age;
		private String name;
		private int height;
		private String address;
		
		public person(int age , String name){
			this.age=age;
			this.name=name;
		}
		
		public person(int age , String name , int height){
		    this(age,name);
			this.height=height;
		}
		
		public person(int age , String name ,int height , String address)
		{
			this(age,name,height);
			this.address=address;
		}
		
public void setAge(int age){
	if (age <= 0)
	{age=1;}
	else{this.age = age;}
}		
public int getAge(){
return age;}

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}

public void setHeight(int height){
	this.height=height;
}

public int getHeight(){
	return height;
}

public void setAddress(String address){
	this.address=address;
}

public String getAddress(){
	return address;
}

public void showDetails(){
	System.out.println("Name :"+name+"\n Age" + age);
	System.out.println(getName());//these method is calling from another methd and it will be stored in the stack trace
	System.out.println("Hello I am here.......");
}

@Override
	protected void finalize() throws Throwable {
		System.out.println("Reclaimed"+ name);
	}

}