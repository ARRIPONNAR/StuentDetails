package student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilClass {

	public static void main(String[] args) {

		List<PrimaryData> primaryResponse = TableResponse.getPrimaryTable();
		List<SecondaryData> secondaryResponse = TableResponse.getSecondaryTable();

		Map<String, PrimaryData> primaryMap = new HashMap<String, PrimaryData>();

		for (PrimaryData primaryData : primaryResponse) {
			primaryMap.put(primaryData.getNumber(), primaryData);
		}

		for (SecondaryData secondaryData : secondaryResponse) {
			PrimaryData primaryData = primaryMap.get(secondaryData.getNumber());
			
			if(primaryData !=null)
			{
			primaryData.getName();
			primaryData.getNumber();
			secondaryData.getAddess();
			System.out.println(primaryData.getName()+"+"+primaryData.getNumber()+"+"+secondaryData.getAddess());
			}
			//System.out.println(primaryData.getName()+"+"+primaryData.getNumber()+"+"+secondaryData.getAddess());
		}

	}

}

