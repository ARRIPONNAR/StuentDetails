package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TableResponse {

	public static List<PrimaryData> getPrimaryTable() {

		List<PrimaryData> primaryList = new ArrayList<PrimaryData>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nm", "root", "12345");
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("Select * from nmtask");

			while (rs.next()) {

				PrimaryData primaryData = new PrimaryData();

				primaryData.setName(rs.getString("name"));
				primaryData.setNumber(rs.getString("phno"));
				
				primaryList.add(primaryData);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return primaryList;
	}

	public static List<SecondaryData> getSecondaryTable() {

		List<SecondaryData> secondaryList = new ArrayList<SecondaryData>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileaddress", "root", "12345");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from mobileaddress");

			while (rs.next()) {

				SecondaryData secondaryData = new SecondaryData();

				secondaryData.setAddess(rs.getString("address"));
				secondaryData.setNumber(rs.getString("phno"));
				
				secondaryList.add(secondaryData);
			}


		} catch (Exception e) {
			System.out.println(e);
		}
		return secondaryList;
	}

}


