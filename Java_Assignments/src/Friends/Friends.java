package Friends;

import java.util.Date;

//Q2. Write a java program to store information of your friends
//id,name,lastname,hobbies,mobno,email,bdate,address
//note: hobbies- a friend may have multiple hobbies
//
//Accept all friends details and store it in an array
//
//And do the following.
//1. Display All Friend
//2. Search by id
//3. Search by name
//4. Display all friend with a particular hobby
//5. Exit
public class Friends {
	
	private int id;
	private String name, lname, mobno,email,address;
	private Date bdate;
	private String hobby[];
	
	public Friends() {
		super();
	}

	public Friends(int id, String name, String lname, String mobno, String email, String address, Date bdate,
			String[] hobby) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.mobno = mobno;
		this.email = email;
		this.address = address;
		this.bdate = bdate;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	

}
