package wallet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.hibernate.validator.constraints.NotEmpty;

public class CreateIDCard {

	public CreateIDCard()
	{
		this.setCard_id();
	}
	
	String card_id="";
	//validation
	@NotEmpty (message ="please enter card name")
	String card_name="";
	@NotEmpty (message ="please enter card number")
	String card_number="";
	@NotEmpty (message ="please enter expiration date")
	String expiration_date="";
	
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id() {
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		df.setTimeZone(tz);
		this.card_id =  "c-"+df.format(new Date());
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	
}
