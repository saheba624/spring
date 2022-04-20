package in.co.rays.bean;

public class UserBean {
	
	public long id;
	
	public String fname;
	
	public String lname;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

}
