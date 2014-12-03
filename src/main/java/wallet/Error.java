package wallet;

public class Error {

	String error="";
	//single attributed error constructor
	public Error(String input)
	{
		this.error = "Invalid "+input;
	}
	//double attributed error constructor
	public Error(String input, int i)
	{
		this.error = input;
	}
	public String getError() {
		return error;
	}
	
}
