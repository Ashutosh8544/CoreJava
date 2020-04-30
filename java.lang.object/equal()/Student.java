class Student{
	private  int sNo;
	private String sName;
	private String course;
	//Define COnstructor to initialize object with user given value
	public Student(int sNo, String sName, String course){
		this.sNo = sNo;
		this.sName = sName;
		this.course = course;
	}
	//overriding equals method
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
			if (obj instanceof Student){
				Student s  =(Student)obj;
				return(this.sNo == sNo) && this.course.equals(s.course);
			}
			else{
				return false;
			}
	}
}

class Address{
}