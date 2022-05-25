package CommonClient;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;

public class CommonClientRequest {
    public static void main(String[] args) {
        try {
            Credential cred = new Credential("secretId", "secretKey");

            CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");

            DescribeInstancesRequest req = new DescribeInstancesRequest();
            String resp = client.commonRequest(req, "DescribeInstances");

            System.out.println(resp);
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}