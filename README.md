# Overview
Welcome to Tencent Cloud Software Development Kit (SDK) 3.0, a companion tool for the TencentCloud API 3.0 platform. Current supported products include CVM, VPC and CBS. All Tencent Cloud services and products will be integrated in the future. The new SDK version is unified and features the same SDK usage, API call methods, error codes, and return packet formats for different languages.
Tencent Cloud SDK for Java helps Java developers debug and use Tencent Cloud APIs. In this document, you will learn about Tencent Cloud SDK for Java and how to quickly use it with code samples provided.

# Dependencies
1. Dependencies: JDK version 7 or higher.
2. Activate your product in the Tencent Cloud Console.
3. Get the SecretID, SecretKey, and endpoint. The general format of the endpoint is *.tencentcloudapi.com. For example, the endpoint of CVM is cvm.tencentcloudapi.com. For details, see the documentation of the specified product.

## Installation
Before installing Tencent Cloud SDK for Java and using Tencent Cloud API, apply for security credentials in the Tencent Cloud Console. Security credential consists of SecretID and SecretKey. SecretID is for identifying the API requester. SecretKey is a key used for signature string encryption, and signature string verification by the server. Secure your SecretKey and do not disclose it to others.
## Installing via Maven (Recommended)
Installing via Maven is the recommended way to use the SDK for Java. Maven is a dependency management tool for Java. It supports the dependencies your project requires and installs them into your project. For more information on Maven, see Maven's official website.
1. Go to [Maven's official website](https://maven.apache.org/), download the Maven installation package supported by your operating system and install.
2. Add Maven dependencies to your project by adding the following dependencies in Maven's pom.xml. **Please note that the version number here is just an example, and you can view the latest version number in the [Maven repository](https://search.maven.org/search?q=tencentcloud-sdk-java-intl-en).**
```xml
<dependency>
	<groupId>com.tencentcloudapi</groupId>
	<artifactId>tencentcloud-sdk-java-intl-en</artifactId>
	<!-- go to https://search.maven.org/search?q=tencentcloud-sdk-java-intl-en and get the latest version. -->
	<version>3.0.2</version>
</dependency>
```
3. For reference methods, see the example.

## Installing via Source Package
1. Go to the [GitHub code hosting page](https://github.com/tencentcloud/tencentcloud-sdk-java-intl-en) to download the source code package.
2. Decompress the package to an appropriate location for your project.
3. You need to put the jar package under the vendor directory in a path that can be found by Java.
4. For reference methods, see the example.

# Example
Take the API for querying availability zones as an example:
```java
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
// Import the client of the corresponding product module.
import com.tencentcloudapi.cvm.v20170312.CvmClient;
// Import the request response class corresponding to the request API.
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesResponse;

public class DescribeZones
{
    public static void main(String [] args) {
        try{
            // Instantiate an authentication object. The Tencent Cloud account secretId and secretKey need to be passed in as the input parameters.
            Credential cred = new Credential("secretId", "secretKey");
            
            // Instantiate the client object to request the product (with CVM as an example).
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod(ClientProfile.SIGN_TC3_256);
            CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
            
            // Instantiate a request object.
            DescribeZonesRequest req = new DescribeZonesRequest();
            
            // Call the API you want to access through the client object; you need to pass in the request object.
            DescribeZonesResponse resp = client.DescribeZones(req);
            
            // The output is a string return packet in json format
            System.out.println(DescribeZonesRequest.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
                System.out.println(e.toString());
        }

    }
    
} 
```

## More Examples

You can find more detailed examples in the [GitHub repository](https://github.com/tencentcloud/tencentcloud-sdk-java-intl-en).

# Related Configuration

## Proxy

Currently, the Java SDK does not support proxy specifying; instead, it can only read the system's proxies. You can set the following in the code before initiating a request:

```
System.setProperty("https.proxyHost", "real proxy ip");
System.setProperty("https.proxyPort", "real proxy port");
```

You can also set in the launch parameters when running the program.
