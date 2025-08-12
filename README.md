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

# Configuration

## Proxy
```java  
HttpProfile httpProfile = new HttpProfile();  
httpProfile.setProxyHost("proxy-host");  
httpProfile.setProxyPort(proxy-port);  
httpProfile.setProxyUsername("username");  
httpProfile.setProxyPassword("password");  
```  

Or, set the system proxy before initiating a request in the code:

```
System.setProperty("https.proxyHost", "Real proxy IP");
System.setProperty("https.proxyPort", "Real proxy port");
```

## Language
```java  
clientProfile.setLanguage(Language.ZH_CN); // or Language.EN_US  
```  

## HTTP/HTTPS
Switch protocols using `HttpProfile.setProtocol()`:
```java  
httpProfile.setProtocol("http://"); // or "https://" (default)  
```  

## Logging
```java  
clientProfile.setDebug(true);  
```  
Logs use `commons.logging`. Configure logging frameworks like Log4j if needed.

## Regional Failover
1. Failures ≥ 5 times.
2. Failure rate ≥ 75%.

Configure as follows:
```java  
clientProfile.setBackupEndpoint("ap-guangzhou.tencentcloudapi.com");  
CircuitBreaker.Setting setting = new CircuitBreaker.Setting();  
setting.maxFailNum = 6;  
setting.maxFailPercentage = 0.8f;  
client.setRegionBreaker(new CircuitBreaker(setting));  
```  

# Common Client
**Note**: You must know the exact API parameters. Only POST + Signature v3 is supported.  
Example: [Common Client Usage](https://github.com/TencentCloud/tencentcloud-sdk-java/tree/master/examples/common/commonclient).

# Retry Mechanism
Example: [Retry Example](https://github.com/TencentCloud/tencentcloud-sdk-java/tree/master/examples/common/Retry.java).

# Credential Management
Supported methods:
1. **Environment Variables**:
   ```java  
   Credential cred = new EnvironmentVariableCredentialsProvider().getCredentials();  
   ```  
2. **Configuration File**:
    - Path: `~/.tencentcloud/credentials` (Linux) or `C:\Users\NAME\.tencentcloud\credentials` (Windows).
    - Format:
      ```ini  
      [default]  
      secret_id = xxxxx  
      secret_key = xxxxx  
      ```  
   ```java  
   Credential cred = new ProfileCredentialsProvider().getCredentials();  
   ```  
3. **Role Assumption**:
   ```java  
   Credential cred = new STSCredential("secretId", "secretKey", "roleArn", "roleSessionName");  
   ```  
4. **Instance Role**:
   ```java  
   Credential cred = new CvmRoleCredential();  
   ```  
5. **TKE OIDC**:
   ```java  
   Credential cred = new OIDCRoleArnProvider().getCredentials();  
   ```  
6. **Provider Chain**:
   ```java  
   Credential cred = new DefaultCredentialsProvider().getCredentials(); // Order: Env → File → Instance → OIDC  
   ```  
Example: [Credential Manager](https://github.com/TencentCloud/tencentcloud-sdk-java/blob/master/examples/common/CredentialManager.java).

# Custom SSL/TLS
```java  
ClientProfile cpf = new ClientProfile();  
cpf.getHttpProfile().setSslSocketFactory(new MySSLSocketFactoryImpl());  
cpf.getHttpProfile().setX509TrustManager(new MyX509TrustManagerImpl());  
```  

# Skip Certificate Verification
```java  
TrustManager[] trustAllCerts = new TrustManager[] { /* Custom TrustManager */ };  
SSLContext sslContext = SSLContext.getInstance("TLS");  
sslContext.init(null, trustAllCerts, new SecureRandom());  
httpProfile.setSslSocketFactory(sslContext.getSocketFactory());  
httpProfile.setX509TrustManager((X509TrustManager) trustAllCerts[0]);  
httpProfile.setHostnameVerifier((hostname, session) -> true);  
```  

# Custom Headers
## For `DescribeInstancesRequest`:
```java  
Map<String, String> header = new HashMap<>();  
header.put("X-TC-TraceId", "ffe0c072-8a5d-4e17-8887-a8a60252abca");  
request.setHeader(header);  
```  
## For `CommonClient`:
```java  
CommonRequest request = new CommonRequest();  
request.setHeader(header);  
```  
Example: [CustomHttpClient.java](examples/common/CustomHttpClient.java).

# Other Issues

## Certificate Problems
Usually caused by client environment misconfiguration. Enable debug logs with `-Djavax.net.debug=ssl`.

- **IBM JDK 1.8**: Some users report `SSLHandshakeException`. Switching to Oracle JDK may resolve it.

## Kotlin Issues
Error: `java.lang.NoSuchMethodError: kotlin.collections.ArraysKt.copyInto`. Upgrade Kotlin to fix.
