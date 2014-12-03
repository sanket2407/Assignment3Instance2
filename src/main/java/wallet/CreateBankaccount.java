package wallet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.hibernate.validator.constraints.NotEmpty;

public class CreateBankaccount {
	
	public CreateBankaccount()
	{
		this.setBa_id();
	}
	
	String ba_id="";
	//validation
	String account_name="";
	@NotEmpty (message ="please enter routing number")
	String routing_number="";
	@NotEmpty (message ="please enter account number")
	String account_number="";
	
	public String getBa_id() {
		return ba_id;
	}
	public void setBa_id() {
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		df.setTimeZone(tz);
		this.ba_id =  "b-"+df.format(new Date());
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getRouting_number() {
		return routing_number;
	}
	public void setRouting_number(String routing_number) {
		this.routing_number = routing_number;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
			
}
