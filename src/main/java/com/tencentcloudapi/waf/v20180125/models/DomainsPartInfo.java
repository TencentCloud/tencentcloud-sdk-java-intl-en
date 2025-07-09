/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainsPartInfo extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Unique domain name ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Unique instance ID of the domain name
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance type of the domain name
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Instance name of the domain name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Certificate
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirection
1: enable forced redirection
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private Long HttpsRewrite;

    /**
    * HTTPS origin-pull port
    */
    @SerializedName("HttpsUpstreamPort")
    @Expose
    private String HttpsUpstreamPort;

    /**
    * Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed and WAF will use the custom header in ip_headers to obtain the client IP address
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * This parameter has been deprecated.
    */
    @SerializedName("IsGray")
    @Expose
    private Long IsGray;

    /**
    * Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
    */
    @SerializedName("IsHttp2")
    @Expose
    private Long IsHttp2;

    /**
    * Whether to enable support for WebSocket
0: disable
1: enable
    */
    @SerializedName("IsWebsocket")
    @Expose
    private Long IsWebsocket;

    /**
    * Load balancing policy for origin-pull
0: round-robin
1: IP hash
2: weighted round-robin
    */
    @SerializedName("LoadBalance")
    @Expose
    private Long LoadBalance;

    /**
    * Protection mode
0: observation mode
1: interception mode
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Private key of the self-owned certificate
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * Origin domain when domain is back to source. When UpstreamType=1, this field needs to be filled
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * Origin-pull type
0: origin-pull via IP address
1: origin-pull via domain name
    */
    @SerializedName("UpstreamType")
    @Expose
    private Long UpstreamType;

    /**
    * Origin IP list when IP is back to source. When UpstreamType=0, this field is required
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    *  Domain name port configuration
    */
    @SerializedName("Ports")
    @Expose
    private PortInfo [] Ports;

    /**
    * Certificate type
0: no certificate, with only the HTTP listening port configured
1: self-owned certificate
2: managed certificate
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * Origin-pull protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for origin-pull. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
    */
    @SerializedName("UpstreamScheme")
    @Expose
    private String UpstreamScheme;

    /**
    * Whether to enable access logging
0: disable
1: enable
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * CNAME record for accessing a domain name protected by SaaS WAF
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private Long IsKeepAlive;

    /**
    * Whether to enable proactive health check
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActiveCheck")
    @Expose
    private Long ActiveCheck;

    /**
    * TLS version information

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TLSVersion")
    @Expose
    private Long TLSVersion;

    /**
    * Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ciphers")
    @Expose
    private Long [] Ciphers;

    /**
    * Cipher suite template
0: default template
1: general template
2: security template
3: custom template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CipherTemplate")
    @Expose
    private Long CipherTemplate;

    /**
    * Read timeout between WAF and origin server, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyReadTimeout")
    @Expose
    private Long ProxyReadTimeout;

    /**
    * WAF and origin server write timeout, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxySendTimeout")
    @Expose
    private Long ProxySendTimeout;

    /**
    * SNI type during WAF origin-pull
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SniType")
    @Expose
    private Long SniType;

    /**
    * When SniType=3, this parameter is required, indicating a custom SNI;

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SniHost")
    @Expose
    private String SniHost;

    /**
    * Weight of the IP address for origin-pull
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weights")
    @Expose
    private String [] Weights;

    /**
    * IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * Whether to enable XFF reset
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("XFFReset")
    @Expose
    private Long XFFReset;

    /**
    * Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Custom origin-pull host. The default value is a null string, indicating that a protected domain name is used as the origin-pull host.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
    * Protection rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Whether to enable caching. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyBuffer")
    @Expose
    private Long ProxyBuffer;

    /**
    * Whether to enable SM. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GmType")
    @Expose
    private Long GmType;

    /**
    * SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GmCertType")
    @Expose
    private Long GmCertType;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GmCert")
    @Expose
    private String GmCert;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GmPrivateKey")
    @Expose
    private String GmPrivateKey;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GmEncCert")
    @Expose
    private String GmEncCert;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GmEncPrivateKey")
    @Expose
    private String GmEncPrivateKey;

    /**
    * When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GmSSLId")
    @Expose
    private String GmSSLId;

    /**
    * Domain name tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Unique domain name ID 
     * @return DomainId Unique domain name ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Unique domain name ID
     * @param DomainId Unique domain name ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Unique instance ID of the domain name 
     * @return InstanceId Unique instance ID of the domain name
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Unique instance ID of the domain name
     * @param InstanceId Unique instance ID of the domain name
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance type of the domain name 
     * @return Edition Instance type of the domain name
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Instance type of the domain name
     * @param Edition Instance type of the domain name
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Instance name of the domain name 
     * @return InstanceName Instance name of the domain name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name of the domain name
     * @param InstanceName Instance name of the domain name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Certificate 
     * @return Cert Certificate
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set Certificate
     * @param Cert Certificate
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine 
     * @return Engine Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
     * @param Engine Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirection
1: enable forced redirection 
     * @return HttpsRewrite Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirection
1: enable forced redirection
     */
    public Long getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirection
1: enable forced redirection
     * @param HttpsRewrite Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirection
1: enable forced redirection
     */
    public void setHttpsRewrite(Long HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
    }

    /**
     * Get HTTPS origin-pull port 
     * @return HttpsUpstreamPort HTTPS origin-pull port
     */
    public String getHttpsUpstreamPort() {
        return this.HttpsUpstreamPort;
    }

    /**
     * Set HTTPS origin-pull port
     * @param HttpsUpstreamPort HTTPS origin-pull port
     */
    public void setHttpsUpstreamPort(String HttpsUpstreamPort) {
        this.HttpsUpstreamPort = HttpsUpstreamPort;
    }

    /**
     * Get Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed and WAF will use the custom header in ip_headers to obtain the client IP address 
     * @return IsCdn Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed and WAF will use the custom header in ip_headers to obtain the client IP address
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed and WAF will use the custom header in ip_headers to obtain the client IP address
     * @param IsCdn Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed and WAF will use the custom header in ip_headers to obtain the client IP address
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get This parameter has been deprecated. 
     * @return IsGray This parameter has been deprecated.
     */
    public Long getIsGray() {
        return this.IsGray;
    }

    /**
     * Set This parameter has been deprecated.
     * @param IsGray This parameter has been deprecated.
     */
    public void setIsGray(Long IsGray) {
        this.IsGray = IsGray;
    }

    /**
     * Get Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable 
     * @return IsHttp2 Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
     */
    public Long getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
     * @param IsHttp2 Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
     */
    public void setIsHttp2(Long IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get Whether to enable support for WebSocket
0: disable
1: enable 
     * @return IsWebsocket Whether to enable support for WebSocket
0: disable
1: enable
     */
    public Long getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set Whether to enable support for WebSocket
0: disable
1: enable
     * @param IsWebsocket Whether to enable support for WebSocket
0: disable
1: enable
     */
    public void setIsWebsocket(Long IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get Load balancing policy for origin-pull
0: round-robin
1: IP hash
2: weighted round-robin 
     * @return LoadBalance Load balancing policy for origin-pull
0: round-robin
1: IP hash
2: weighted round-robin
     */
    public Long getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set Load balancing policy for origin-pull
0: round-robin
1: IP hash
2: weighted round-robin
     * @param LoadBalance Load balancing policy for origin-pull
0: round-robin
1: IP hash
2: weighted round-robin
     */
    public void setLoadBalance(Long LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get Protection mode
0: observation mode
1: interception mode 
     * @return Mode Protection mode
0: observation mode
1: interception mode
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Protection mode
0: observation mode
1: interception mode
     * @param Mode Protection mode
0: observation mode
1: interception mode
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Private key of the self-owned certificate 
     * @return PrivateKey Private key of the self-owned certificate
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Private key of the self-owned certificate
     * @param PrivateKey Private key of the self-owned certificate
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform 
     * @return SSLId When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
     * @param SSLId When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get Origin domain when domain is back to source. When UpstreamType=1, this field needs to be filled 
     * @return UpstreamDomain Origin domain when domain is back to source. When UpstreamType=1, this field needs to be filled
     */
    public String getUpstreamDomain() {
        return this.UpstreamDomain;
    }

    /**
     * Set Origin domain when domain is back to source. When UpstreamType=1, this field needs to be filled
     * @param UpstreamDomain Origin domain when domain is back to source. When UpstreamType=1, this field needs to be filled
     */
    public void setUpstreamDomain(String UpstreamDomain) {
        this.UpstreamDomain = UpstreamDomain;
    }

    /**
     * Get Origin-pull type
0: origin-pull via IP address
1: origin-pull via domain name 
     * @return UpstreamType Origin-pull type
0: origin-pull via IP address
1: origin-pull via domain name
     */
    public Long getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set Origin-pull type
0: origin-pull via IP address
1: origin-pull via domain name
     * @param UpstreamType Origin-pull type
0: origin-pull via IP address
1: origin-pull via domain name
     */
    public void setUpstreamType(Long UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get Origin IP list when IP is back to source. When UpstreamType=0, this field is required 
     * @return SrcList Origin IP list when IP is back to source. When UpstreamType=0, this field is required
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set Origin IP list when IP is back to source. When UpstreamType=0, this field is required
     * @param SrcList Origin IP list when IP is back to source. When UpstreamType=0, this field is required
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get  Domain name port configuration 
     * @return Ports  Domain name port configuration
     */
    public PortInfo [] getPorts() {
        return this.Ports;
    }

    /**
     * Set  Domain name port configuration
     * @param Ports  Domain name port configuration
     */
    public void setPorts(PortInfo [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Certificate type
0: no certificate, with only the HTTP listening port configured
1: self-owned certificate
2: managed certificate 
     * @return CertType Certificate type
0: no certificate, with only the HTTP listening port configured
1: self-owned certificate
2: managed certificate
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type
0: no certificate, with only the HTTP listening port configured
1: self-owned certificate
2: managed certificate
     * @param CertType Certificate type
0: no certificate, with only the HTTP listening port configured
1: self-owned certificate
2: managed certificate
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get Origin-pull protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for origin-pull. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull. 
     * @return UpstreamScheme Origin-pull protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for origin-pull. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set Origin-pull protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for origin-pull. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
     * @param UpstreamScheme Origin-pull protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for origin-pull. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
     */
    public void setUpstreamScheme(String UpstreamScheme) {
        this.UpstreamScheme = UpstreamScheme;
    }

    /**
     * Get Whether to enable access logging
0: disable
1: enable 
     * @return Cls Whether to enable access logging
0: disable
1: enable
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set Whether to enable access logging
0: disable
1: enable
     * @param Cls Whether to enable access logging
0: disable
1: enable
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get CNAME record for accessing a domain name protected by SaaS WAF 
     * @return Cname CNAME record for accessing a domain name protected by SaaS WAF
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME record for accessing a domain name protected by SaaS WAF
     * @param Cname CNAME record for accessing a domain name protected by SaaS WAF
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Whether to enable persistent connection
0: non-persistent connection
1: persistent connection 
     * @return IsKeepAlive Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
     */
    public Long getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
     * @param IsKeepAlive Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
     */
    public void setIsKeepAlive(Long IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get Whether to enable proactive health check
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActiveCheck Whether to enable proactive health check
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getActiveCheck() {
        return this.ActiveCheck;
    }

    /**
     * Set Whether to enable proactive health check
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActiveCheck Whether to enable proactive health check
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActiveCheck(Long ActiveCheck) {
        this.ActiveCheck = ActiveCheck;
    }

    /**
     * Get TLS version information

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TLSVersion TLS version information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTLSVersion() {
        return this.TLSVersion;
    }

    /**
     * Set TLS version information

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TLSVersion TLS version information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTLSVersion(Long TLSVersion) {
        this.TLSVersion = TLSVersion;
    }

    /**
     * Get Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ciphers Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ciphers Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCiphers(Long [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get Cipher suite template
0: default template
1: general template
2: security template
3: custom template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CipherTemplate Cipher suite template
0: default template
1: general template
2: security template
3: custom template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCipherTemplate() {
        return this.CipherTemplate;
    }

    /**
     * Set Cipher suite template
0: default template
1: general template
2: security template
3: custom template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CipherTemplate Cipher suite template
0: default template
1: general template
2: security template
3: custom template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCipherTemplate(Long CipherTemplate) {
        this.CipherTemplate = CipherTemplate;
    }

    /**
     * Get Read timeout between WAF and origin server, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyReadTimeout Read timeout between WAF and origin server, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProxyReadTimeout() {
        return this.ProxyReadTimeout;
    }

    /**
     * Set Read timeout between WAF and origin server, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyReadTimeout Read timeout between WAF and origin server, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyReadTimeout(Long ProxyReadTimeout) {
        this.ProxyReadTimeout = ProxyReadTimeout;
    }

    /**
     * Get WAF and origin server write timeout, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxySendTimeout WAF and origin server write timeout, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProxySendTimeout() {
        return this.ProxySendTimeout;
    }

    /**
     * Set WAF and origin server write timeout, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxySendTimeout WAF and origin server write timeout, 300s by default.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxySendTimeout(Long ProxySendTimeout) {
        this.ProxySendTimeout = ProxySendTimeout;
    }

    /**
     * Get SNI type during WAF origin-pull
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SniType SNI type during WAF origin-pull
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSniType() {
        return this.SniType;
    }

    /**
     * Set SNI type during WAF origin-pull
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SniType SNI type during WAF origin-pull
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSniType(Long SniType) {
        this.SniType = SniType;
    }

    /**
     * Get When SniType=3, this parameter is required, indicating a custom SNI;

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SniHost When SniType=3, this parameter is required, indicating a custom SNI;

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSniHost() {
        return this.SniHost;
    }

    /**
     * Set When SniType=3, this parameter is required, indicating a custom SNI;

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SniHost When SniType=3, this parameter is required, indicating a custom SNI;

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSniHost(String SniHost) {
        this.SniHost = SniHost;
    }

    /**
     * Get Weight of the IP address for origin-pull
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weights Weight of the IP address for origin-pull
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getWeights() {
        return this.Weights;
    }

    /**
     * Set Weight of the IP address for origin-pull
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weights Weight of the IP address for origin-pull
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeights(String [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpHeaders IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpHeaders IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get Whether to enable XFF reset
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return XFFReset Whether to enable XFF reset
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getXFFReset() {
        return this.XFFReset;
    }

    /**
     * Set Whether to enable XFF reset
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
     * @param XFFReset Whether to enable XFF reset
0: disable
1: enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setXFFReset(Long XFFReset) {
        this.XFFReset = XFFReset;
    }

    /**
     * Get Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Note Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Note Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Custom origin-pull host. The default value is a null string, indicating that a protected domain name is used as the origin-pull host.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamHost Custom origin-pull host. The default value is a null string, indicating that a protected domain name is used as the origin-pull host.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set Custom origin-pull host. The default value is a null string, indicating that a protected domain name is used as the origin-pull host.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamHost Custom origin-pull host. The default value is a null string, indicating that a protected domain name is used as the origin-pull host.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    /**
     * Get Protection rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Protection rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Protection rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Protection rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Whether to enable caching. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyBuffer Whether to enable caching. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProxyBuffer() {
        return this.ProxyBuffer;
    }

    /**
     * Set Whether to enable caching. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyBuffer Whether to enable caching. 0: disable; 1: enable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyBuffer(Long ProxyBuffer) {
        this.ProxyBuffer = ProxyBuffer;
    }

    /**
     * Get Whether to enable SM. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GmType Whether to enable SM. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGmType() {
        return this.GmType;
    }

    /**
     * Set Whether to enable SM. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GmType Whether to enable SM. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGmType(Long GmType) {
        this.GmType = GmType;
    }

    /**
     * Get SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GmCertType SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGmCertType() {
        return this.GmCertType;
    }

    /**
     * Set SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GmCertType SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGmCertType(Long GmCertType) {
        this.GmCertType = GmCertType;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GmCert When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGmCert() {
        return this.GmCert;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GmCert When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGmCert(String GmCert) {
        this.GmCert = GmCert;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GmPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGmPrivateKey() {
        return this.GmPrivateKey;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GmPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGmPrivateKey(String GmPrivateKey) {
        this.GmPrivateKey = GmPrivateKey;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GmEncCert When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGmEncCert() {
        return this.GmEncCert;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GmEncCert When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGmEncCert(String GmEncCert) {
        this.GmEncCert = GmEncCert;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GmEncPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGmEncPrivateKey() {
        return this.GmEncPrivateKey;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GmEncPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGmEncPrivateKey(String GmEncPrivateKey) {
        this.GmEncPrivateKey = GmEncPrivateKey;
    }

    /**
     * Get When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GmSSLId When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGmSSLId() {
        return this.GmSSLId;
    }

    /**
     * Set When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GmSSLId When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGmSSLId(String GmSSLId) {
        this.GmSSLId = GmSSLId;
    }

    /**
     * Get Domain name tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Labels Domain name tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Domain name tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Labels Domain name tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    public DomainsPartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainsPartInfo(DomainsPartInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Engine != null) {
            this.Engine = new Long(source.Engine);
        }
        if (source.HttpsRewrite != null) {
            this.HttpsRewrite = new Long(source.HttpsRewrite);
        }
        if (source.HttpsUpstreamPort != null) {
            this.HttpsUpstreamPort = new String(source.HttpsUpstreamPort);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.IsGray != null) {
            this.IsGray = new Long(source.IsGray);
        }
        if (source.IsHttp2 != null) {
            this.IsHttp2 = new Long(source.IsHttp2);
        }
        if (source.IsWebsocket != null) {
            this.IsWebsocket = new Long(source.IsWebsocket);
        }
        if (source.LoadBalance != null) {
            this.LoadBalance = new Long(source.LoadBalance);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
        if (source.UpstreamDomain != null) {
            this.UpstreamDomain = new String(source.UpstreamDomain);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new Long(source.UpstreamType);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new PortInfo[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortInfo(source.Ports[i]);
            }
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.UpstreamScheme != null) {
            this.UpstreamScheme = new String(source.UpstreamScheme);
        }
        if (source.Cls != null) {
            this.Cls = new Long(source.Cls);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IsKeepAlive != null) {
            this.IsKeepAlive = new Long(source.IsKeepAlive);
        }
        if (source.ActiveCheck != null) {
            this.ActiveCheck = new Long(source.ActiveCheck);
        }
        if (source.TLSVersion != null) {
            this.TLSVersion = new Long(source.TLSVersion);
        }
        if (source.Ciphers != null) {
            this.Ciphers = new Long[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new Long(source.Ciphers[i]);
            }
        }
        if (source.CipherTemplate != null) {
            this.CipherTemplate = new Long(source.CipherTemplate);
        }
        if (source.ProxyReadTimeout != null) {
            this.ProxyReadTimeout = new Long(source.ProxyReadTimeout);
        }
        if (source.ProxySendTimeout != null) {
            this.ProxySendTimeout = new Long(source.ProxySendTimeout);
        }
        if (source.SniType != null) {
            this.SniType = new Long(source.SniType);
        }
        if (source.SniHost != null) {
            this.SniHost = new String(source.SniHost);
        }
        if (source.Weights != null) {
            this.Weights = new String[source.Weights.length];
            for (int i = 0; i < source.Weights.length; i++) {
                this.Weights[i] = new String(source.Weights[i]);
            }
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.XFFReset != null) {
            this.XFFReset = new Long(source.XFFReset);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.UpstreamHost != null) {
            this.UpstreamHost = new String(source.UpstreamHost);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.ProxyBuffer != null) {
            this.ProxyBuffer = new Long(source.ProxyBuffer);
        }
        if (source.GmType != null) {
            this.GmType = new Long(source.GmType);
        }
        if (source.GmCertType != null) {
            this.GmCertType = new Long(source.GmCertType);
        }
        if (source.GmCert != null) {
            this.GmCert = new String(source.GmCert);
        }
        if (source.GmPrivateKey != null) {
            this.GmPrivateKey = new String(source.GmPrivateKey);
        }
        if (source.GmEncCert != null) {
            this.GmEncCert = new String(source.GmEncCert);
        }
        if (source.GmEncPrivateKey != null) {
            this.GmEncPrivateKey = new String(source.GmEncPrivateKey);
        }
        if (source.GmSSLId != null) {
            this.GmSSLId = new String(source.GmSSLId);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "HttpsRewrite", this.HttpsRewrite);
        this.setParamSimple(map, prefix + "HttpsUpstreamPort", this.HttpsUpstreamPort);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamSimple(map, prefix + "IsGray", this.IsGray);
        this.setParamSimple(map, prefix + "IsHttp2", this.IsHttp2);
        this.setParamSimple(map, prefix + "IsWebsocket", this.IsWebsocket);
        this.setParamSimple(map, prefix + "LoadBalance", this.LoadBalance);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "UpstreamDomain", this.UpstreamDomain);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "UpstreamScheme", this.UpstreamScheme);
        this.setParamSimple(map, prefix + "Cls", this.Cls);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IsKeepAlive", this.IsKeepAlive);
        this.setParamSimple(map, prefix + "ActiveCheck", this.ActiveCheck);
        this.setParamSimple(map, prefix + "TLSVersion", this.TLSVersion);
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "CipherTemplate", this.CipherTemplate);
        this.setParamSimple(map, prefix + "ProxyReadTimeout", this.ProxyReadTimeout);
        this.setParamSimple(map, prefix + "ProxySendTimeout", this.ProxySendTimeout);
        this.setParamSimple(map, prefix + "SniType", this.SniType);
        this.setParamSimple(map, prefix + "SniHost", this.SniHost);
        this.setParamArraySimple(map, prefix + "Weights.", this.Weights);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "XFFReset", this.XFFReset);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ProxyBuffer", this.ProxyBuffer);
        this.setParamSimple(map, prefix + "GmType", this.GmType);
        this.setParamSimple(map, prefix + "GmCertType", this.GmCertType);
        this.setParamSimple(map, prefix + "GmCert", this.GmCert);
        this.setParamSimple(map, prefix + "GmPrivateKey", this.GmPrivateKey);
        this.setParamSimple(map, prefix + "GmEncCert", this.GmEncCert);
        this.setParamSimple(map, prefix + "GmEncPrivateKey", this.GmEncPrivateKey);
        this.setParamSimple(map, prefix + "GmSSLId", this.GmSSLId);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);

    }
}

