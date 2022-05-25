package CommonClient;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class CommonClientCall {
    public static void main(String [] args) {
        try{
            Credential cred = new Credential("secretId", "secretKey");

            CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");

            String resp = client.call("DescribeInstances",
                              "{\"Filters\":"
                            + "[{\"Name\":\"zone\","
                            + "\"Values\":[\"ap-guangzhou-1\"]},"
                            + "{\"Name\":\"instance-charge-type\","
                            + "\"Values\":[\"PREPAID\",\"POSTPAID_BY_HOUR\"]}]"
                            + "}");

            System.out.println(resp);
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}