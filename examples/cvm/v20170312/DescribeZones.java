import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesResponse;

public class DescribeZones
{
    public static void main(String [] args) {
        try{
            Credential cred = new Credential("secretId", "secretKey");
            CvmClient client = new CvmClient(cred, "ap-guangzhou");
            DescribeZonesRequest req = new DescribeZonesRequest();
            DescribeZonesResponse resp = client.DescribeZones(req);
            System.out.println(DescribeZonesRequest.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
                System.out.println(e.toString());
        }
    }
}
