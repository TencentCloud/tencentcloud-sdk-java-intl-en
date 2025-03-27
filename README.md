![](https://img.shields.io/maven-central/v/com.tencentcloudapi/tencentcloud-sdk-java-intl-en?label=maven)

# Overview
Welcome to Tencent Cloud Software Development Kit (SDK), a companion tool for the TencentCloud API 3.0 platform.
Tencent Cloud SDK for Java helps Java developers debug and use TencentCloud APIs with ease. This document describes Tencent Cloud SDK for Java and how to quickly use it with code examples provided.

# Dependent Environment
1. Dependent environment: JDK 7 or higher.
2. Activate your product in the Tencent Cloud Console.
3. Get the `SecretID`, `SecretKey`, and endpoint. The general format of endpoint is `\*.intl.tencentcloudapi.com`. For example, the endpoint of CVM is `cvm.intl.tencentcloudapi.com`. For more information, please see the documentation of the specified product.

# Installation
Before installing Tencent Cloud SDK for Java and using TencentCloud API, apply for security credentials in the Tencent Cloud Console. Security credential consists of `SecretID` and `SecretKey`. `SecretID` is for identifying the API requester. `SecretKey` is a key used for signature string encryption and authentication by the server. Please keep your `SecretKey` private and do not disclose it to others.
## Installing via Maven (recommended)
Installing through Maven is the recommended way to use the SDK for Java. Maven is a dependency manager for Java that supports the dependencies your project requires and installs them into your project. For more information, please visit Maven's official website.
1. Go to [Maven's official website](https://maven.apache.org/) to download the corresponding Maven installation package for your system and install it.
2. Add Maven dependencies to your project by adding the following dependencies in Maven's `pom.xml`. Please note that the version number here is just an example, and you can find the latest version in the [Maven repository](https://search.maven.org/search?q=tencentcloud-sdk-java-intl-en). Currently, the latest version is ![](https://img.shields.io/maven-central/v/com.tencentcloudapi/tencentcloud-sdk-java-intl-en?label=maven):
```xml
<dependency>
    <groupId>com.tencentcloudapi</groupId>
    <artifactId>tencentcloud-sdk-java-intl-en</artifactId>
    <!-- go to https://search.maven.org/search?q=tencentcloud-sdk-java-intl-en and get the latest version. -->
    <!-- Please query the latest version at https://search.maven.org/search?q=tencentcloud-sdk-java-intl-en -->
    <version>3.0.3</version>
</dependency>
```
3. For importing methods, please see the example.

## Installing via source package
1. Go to the [Github code hosting page](https://github.com/tencentcloud/tencentcloud-sdk-java-intl-en) to download the source code package.
2. Decompress the source package to an appropriate location in your project.
3. You need to put the jar package under the `vendor` directory in a path that can be found by Java.
4. For importing methods, please see the example.

# Example
Take the API for querying availability zones as an example:
```java
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
// Import the client of the corresponding product module
import com.tencentcloudapi.cvm.v20170312.CvmClient;
// Import the request response class corresponding to the request API
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;

public class DescribeInstances
{
    public static void main(String [] args) {
        try{
            // Instantiate an authentication object. The Tencent Cloud account `secretId` and `secretKey` need to be passed in as the input parameters
            Credential cred = new Credential("secretId", "secretKey");

            // Instantiate the client object of the requested product (with CVM as an example)
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod(ClientProfile.SIGN_TC3_256);
            CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);

            // Instantiate a request object
            DescribeInstancesRequest req = new DescribeInstancesRequest();

            // Call the API you want to access through the client object. You need to pass in the request object
            DescribeInstancesResponse resp = client.DescribeInstances(req);

            // A string return packet in JSON format is output
            System.out.println(DescribeInstancesRequest.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
                System.out.println(e.toString());
        }

    }
}
```

## More examples

You can find more detailed examples in the `examples` directory of the [GitHub repository](https://github.com/tencentcloud/tencentcloud-sdk-java-intl-en).

# Relevant Configuration

## Proxy

Specify proxy access. Currently, only HTTP proxy is supported:

```
HttpProfile httpProfile = new HttpProfile();
httpProfile.setProxyHost("real proxy IP");
httpProfile.setProxyPort(real proxy port);
```

Or, set the system proxy before initiating a request in the code:

```
System.setProperty("https.proxyHost", "Real proxy IP");
System.setProperty("https.proxyPort", "Real proxy port");
```

Or, set it in the startup parameters when running the program.

# Compliance Notice

Please prioritize using the ​default domain names configured in the SDK for each product. If using other domains, note that ​overseas domains may pose ​data compliance risks.
