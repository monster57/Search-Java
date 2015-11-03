import java.util.List;
import java.util.Map;

/**
 * Created by user2 on 10/31/15.
 */
public class Main {
    public static void main(String[] args){
        String data = "P Ford Car Review\r\nP Review Car\r\nP Review Ford\r\nP Toyota Car\r\nP Honda Car\r\nP Car\r\nQ Ford\r\nQ Car\r\nQ Review\r\nQ Ford Review\r\nQ Ford Car\r\nQ cooking French";
        Separator separator = new Separator(data);
        List<String> pageData = separator.fetchSignatureData('p');
        List<String> queryData = separator.fetchSignatureData('q');
        ElementContainer elementContainer = new ElementContainer();
        StrengthContainer strengthContainer = new StrengthContainer();
        Converter converter  = new Converter(pageData , queryData , elementContainer , strengthContainer);
        List<Page> pageSet = converter.convertPageDataToSetOfPage();
        List<Query> querySet = converter.convertQueryDataToSetOfQuery();
        Search search = new Search(pageSet , querySet);
        Map<String, Map<String, Integer>> resultSet = search.getResultSet();
        OutputGenarator outputGenarator = new OutputGenarator(resultSet);
        List<String> printableValue = outputGenarator.getPrintableValue();


        System.out.println(String.join("\r\n" , printableValue));



    }
}


