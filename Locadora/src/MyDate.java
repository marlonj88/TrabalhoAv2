import java.text.DateFormat;
import java.util.Date;

public class MyDate {
	private Date data = new Date();
	private DateFormat formataData = DateFormat.getDateInstance();
	public String formataData() {
		return formataData.format(data);
	}
	
}
