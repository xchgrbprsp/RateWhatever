package test;
import database.*;

public class TestMySQL {
	public static void main(String[] args){
		String url = "jdbc:mysql://ratewhatever.cloudapp.net/ratewhatever";
		String username = "user";
		String password = "1whatever";
		RatingDB db = new RatingDB(url, username, password);
		db.addNewRating("\'someone\'", "\'chipotle\'", 5, "\'good\'");
		db.commit();
	}
}
