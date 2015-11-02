import java.util.ArrayList;
import java.util.List;

/**
 * Created by user2 on 10/30/15.
 */
public class Separator {
    private String data;

    public Separator(String data) {
        this.data = data;

    }


    private List<String> splitDataByLine() {
        List<String> dataList = new ArrayList<>();
        String[] splitData = data.split("\r\n");
        for(int i = 0;i<splitData.length;i++)
            dataList.add(splitData[i]);
        return dataList;
    }

    public List<String> fetchSignatureData(char signature){
        List<String> dataList = splitDataByLine();
        List<String> fetchedDataList = new ArrayList<>();
        for (String data : dataList) {
            if(data.toLowerCase().charAt(Constraints.ZERO.getValue()) == signature){
                fetchedDataList.add(data);
            }
        }
        return fetchedDataList;
    }

}
