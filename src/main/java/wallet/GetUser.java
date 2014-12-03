package wallet;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class GetUser {
	String userid = "";
	String email="";
	String password="";
	String created_at ="";
	String updated_at="";
	
	//get user details
	public GetUser(DBCursor cursor)
	{	
		DBObject obj = cursor.next();
		this.setUserid(obj.get("userid").toString());
		this.setEmail(obj.get("email").toString());
		this.setPassword(obj.get("password").toString());
		this.setCreated_at(obj.get("created_at").toString());
		this.setUpdated_at(obj.get("updated_at").toString());
	}
	
	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	

}
