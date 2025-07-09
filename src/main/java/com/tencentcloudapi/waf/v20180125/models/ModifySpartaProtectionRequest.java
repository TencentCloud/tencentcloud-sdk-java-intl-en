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

public class ModifySpartaProtectionRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Required. Unique domain name ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Required. Instance ID of the domain name
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * When CertType is 1, this parameter is required, indicating the self-owned certificate chain
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
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
    * Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * Origin-pull protocol for HTTPS when the service is configured with an HTTPS port.
http: Use the HTTP protocol for origin-pull. It is used with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
    */
    @SerializedName("UpstreamScheme")
    @Expose
    private String UpstreamScheme;

    /**
    * HTTPS upstream port, required only when UpstreamScheme is http
    */
    @SerializedName("HttpsUpstreamPort")
    @Expose
    private String HttpsUpstreamPort;

    /**
    * Whether to enable forced redirection from HTTP to HTTPS. 0: disable; 1: enable
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private Long HttpsRewrite;

    /**
    * upstream type. 0: proxy to upstream by IP; 1: proxy to upstream by domain name
    */
    @SerializedName("UpstreamType")
    @Expose
    private Long UpstreamType;

    /**
    * Upstream domain when proxy to upstream by domain. When UpstreamType=1, this field needs to be filled
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * Upstream IP list when proxy to upstream by IP. When UpstreamType=0, this field is required
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * Whether to enable HTTP2. You should enable HTTPS as well. 0: disable; 1: enable
    */
    @SerializedName("IsHttp2")
    @Expose
    private Long IsHttp2;

    /**
    * Whether to enable WebSocket. 0: disable; 1: enable
    */
    @SerializedName("IsWebsocket")
    @Expose
    private Long IsWebsocket;

    /**
    * Load balancing policy for upstream. 0: round-robin scheduling; 1: IP hash; 2: weighted round-robin scheduling
    */
    @SerializedName("LoadBalance")
    @Expose
    private Long LoadBalance;

    /**
    * To be deprecated, can be left blank. Whether to enable grayscale: 0 indicates not to enable grayscale.
    */
    @SerializedName("IsGray")
    @Expose
    private Long IsGray;

    /**
    * Instance type of the domain name
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Port information, which can be obtained through the DescribeDomains API
    */
    @SerializedName("Ports")
    @Expose
    private SpartaProtectionPort [] Ports;

    /**
    * Whether to enable persistent connection. 0: non-persistent connection; 1: persistent connection
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private String IsKeepAlive;

    /**
    * To be deprecated. Currently, set this parameter to 0. Anycast IP type switch. 0: common IP; 1: Anycast IP
    */
    @SerializedName("Anycast")
    @Expose
    private Long Anycast;

    /**
    * Weight of each IP in the upstream IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
    */
    @SerializedName("Weights")
    @Expose
    private Long [] Weights;

    /**
    * Whether to enable proactive health detection. 0: disable; 1: enable
    */
    @SerializedName("ActiveCheck")
    @Expose
    private Long ActiveCheck;

    /**
    * TLS version information
    */
    @SerializedName("TLSVersion")
    @Expose
    private Long TLSVersion;

    /**
    * Cipher suite information
    */
    @SerializedName("Ciphers")
    @Expose
    private Long [] Ciphers;

    /**
    * Cipher suite template. 0: default template (no selection); 1: general template; 2: secure template; 3: custom template
    */
    @SerializedName("CipherTemplate")
    @Expose
    private Long CipherTemplate;

    /**
    * Read timeout between WAF and upstream server, 300s by default.
    */
    @SerializedName("ProxyReadTimeout")
    @Expose
    private Long ProxyReadTimeout;

    /**
    * WAF and origin server write timeout, 300s by default.
    */
    @SerializedName("ProxySendTimeout")
    @Expose
    private Long ProxySendTimeout;

    /**
    * SNI type when proxy to upstream.
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is the protected domain name.
2: Enable SNI. SNI is the origin server domain name when proxy to upstream by domain.
3: Enable SNI. SNI is the custom domain name.
    */
    @SerializedName("SniType")
    @Expose
    private Long SniType;

    /**
    * When SniType=3, this parameter is required, indicating a custom SNI;
    */
    @SerializedName("SniHost")
    @Expose
    private String SniHost;

    /**
    * IsCdn=3 required for this parameter, indicates custom header
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * Whether to enable XFF reset. 0: disable; 1: enable
    */
    @SerializedName("XFFReset")
    @Expose
    private Long XFFReset;

    /**
    * Domain name remarks
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Custom upstream host. The default value is a null string, indicating that the protected domain name is used as the upstream host.
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
    * Whether to enable caching. 0: disable; 1: enable.
    */
    @SerializedName("ProxyBuffer")
    @Expose
    private Long ProxyBuffer;

    /**
    * Whether to enable the test. 0: disable; 1: enable. The test is enabled by default.
    */
    @SerializedName("ProbeStatus")
    @Expose
    private Long ProbeStatus;

    /**
    * SM option. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
    */
    @SerializedName("GmType")
    @Expose
    private Long GmType;

    /**
    * SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
    */
    @SerializedName("GmCertType")
    @Expose
    private Long GmCertType;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
    */
    @SerializedName("GmCert")
    @Expose
    private String GmCert;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
    */
    @SerializedName("GmPrivateKey")
    @Expose
    private String GmPrivateKey;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
    */
    @SerializedName("GmEncCert")
    @Expose
    private String GmEncCert;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
    */
    @SerializedName("GmEncPrivateKey")
    @Expose
    private String GmEncPrivateKey;

    /**
    * When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
    */
    @SerializedName("GmSSLId")
    @Expose
    private String GmSSLId;

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
     * Get Required. Unique domain name ID 
     * @return DomainId Required. Unique domain name ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Required. Unique domain name ID
     * @param DomainId Required. Unique domain name ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Required. Instance ID of the domain name 
     * @return InstanceID Required. Instance ID of the domain name
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Required. Instance ID of the domain name
     * @param InstanceID Required. Instance ID of the domain name
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate. 
     * @return CertType Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
     * @param CertType Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get When CertType is 1, this parameter is required, indicating the self-owned certificate chain 
     * @return Cert When CertType is 1, this parameter is required, indicating the self-owned certificate chain
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set When CertType is 1, this parameter is required, indicating the self-owned certificate chain
     * @param Cert When CertType is 1, this parameter is required, indicating the self-owned certificate chain
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get When CertType=1, this parameter is required, indicating the private key of the self-owned certificate. 
     * @return PrivateKey When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
     * @param PrivateKey When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
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
     * Get Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address. 
     * @return IsCdn Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
     * @param IsCdn Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get Origin-pull protocol for HTTPS when the service is configured with an HTTPS port.
http: Use the HTTP protocol for origin-pull. It is used with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull. 
     * @return UpstreamScheme Origin-pull protocol for HTTPS when the service is configured with an HTTPS port.
http: Use the HTTP protocol for origin-pull. It is used with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set Origin-pull protocol for HTTPS when the service is configured with an HTTPS port.
http: Use the HTTP protocol for origin-pull. It is used with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
     * @param UpstreamScheme Origin-pull protocol for HTTPS when the service is configured with an HTTPS port.
http: Use the HTTP protocol for origin-pull. It is used with HttpsUpstreamPort.
https: Use the HTTPS protocol for origin-pull.
     */
    public void setUpstreamScheme(String UpstreamScheme) {
        this.UpstreamScheme = UpstreamScheme;
    }

    /**
     * Get HTTPS upstream port, required only when UpstreamScheme is http 
     * @return HttpsUpstreamPort HTTPS upstream port, required only when UpstreamScheme is http
     */
    public String getHttpsUpstreamPort() {
        return this.HttpsUpstreamPort;
    }

    /**
     * Set HTTPS upstream port, required only when UpstreamScheme is http
     * @param HttpsUpstreamPort HTTPS upstream port, required only when UpstreamScheme is http
     */
    public void setHttpsUpstreamPort(String HttpsUpstreamPort) {
        this.HttpsUpstreamPort = HttpsUpstreamPort;
    }

    /**
     * Get Whether to enable forced redirection from HTTP to HTTPS. 0: disable; 1: enable 
     * @return HttpsRewrite Whether to enable forced redirection from HTTP to HTTPS. 0: disable; 1: enable
     */
    public Long getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set Whether to enable forced redirection from HTTP to HTTPS. 0: disable; 1: enable
     * @param HttpsRewrite Whether to enable forced redirection from HTTP to HTTPS. 0: disable; 1: enable
     */
    public void setHttpsRewrite(Long HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
    }

    /**
     * Get upstream type. 0: proxy to upstream by IP; 1: proxy to upstream by domain name 
     * @return UpstreamType upstream type. 0: proxy to upstream by IP; 1: proxy to upstream by domain name
     */
    public Long getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set upstream type. 0: proxy to upstream by IP; 1: proxy to upstream by domain name
     * @param UpstreamType upstream type. 0: proxy to upstream by IP; 1: proxy to upstream by domain name
     */
    public void setUpstreamType(Long UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get Upstream domain when proxy to upstream by domain. When UpstreamType=1, this field needs to be filled 
     * @return UpstreamDomain Upstream domain when proxy to upstream by domain. When UpstreamType=1, this field needs to be filled
     */
    public String getUpstreamDomain() {
        return this.UpstreamDomain;
    }

    /**
     * Set Upstream domain when proxy to upstream by domain. When UpstreamType=1, this field needs to be filled
     * @param UpstreamDomain Upstream domain when proxy to upstream by domain. When UpstreamType=1, this field needs to be filled
     */
    public void setUpstreamDomain(String UpstreamDomain) {
        this.UpstreamDomain = UpstreamDomain;
    }

    /**
     * Get Upstream IP list when proxy to upstream by IP. When UpstreamType=0, this field is required 
     * @return SrcList Upstream IP list when proxy to upstream by IP. When UpstreamType=0, this field is required
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set Upstream IP list when proxy to upstream by IP. When UpstreamType=0, this field is required
     * @param SrcList Upstream IP list when proxy to upstream by IP. When UpstreamType=0, this field is required
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get Whether to enable HTTP2. You should enable HTTPS as well. 0: disable; 1: enable 
     * @return IsHttp2 Whether to enable HTTP2. You should enable HTTPS as well. 0: disable; 1: enable
     */
    public Long getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set Whether to enable HTTP2. You should enable HTTPS as well. 0: disable; 1: enable
     * @param IsHttp2 Whether to enable HTTP2. You should enable HTTPS as well. 0: disable; 1: enable
     */
    public void setIsHttp2(Long IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get Whether to enable WebSocket. 0: disable; 1: enable 
     * @return IsWebsocket Whether to enable WebSocket. 0: disable; 1: enable
     */
    public Long getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set Whether to enable WebSocket. 0: disable; 1: enable
     * @param IsWebsocket Whether to enable WebSocket. 0: disable; 1: enable
     */
    public void setIsWebsocket(Long IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get Load balancing policy for upstream. 0: round-robin scheduling; 1: IP hash; 2: weighted round-robin scheduling 
     * @return LoadBalance Load balancing policy for upstream. 0: round-robin scheduling; 1: IP hash; 2: weighted round-robin scheduling
     */
    public Long getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set Load balancing policy for upstream. 0: round-robin scheduling; 1: IP hash; 2: weighted round-robin scheduling
     * @param LoadBalance Load balancing policy for upstream. 0: round-robin scheduling; 1: IP hash; 2: weighted round-robin scheduling
     */
    public void setLoadBalance(Long LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get To be deprecated, can be left blank. Whether to enable grayscale: 0 indicates not to enable grayscale. 
     * @return IsGray To be deprecated, can be left blank. Whether to enable grayscale: 0 indicates not to enable grayscale.
     */
    public Long getIsGray() {
        return this.IsGray;
    }

    /**
     * Set To be deprecated, can be left blank. Whether to enable grayscale: 0 indicates not to enable grayscale.
     * @param IsGray To be deprecated, can be left blank. Whether to enable grayscale: 0 indicates not to enable grayscale.
     */
    public void setIsGray(Long IsGray) {
        this.IsGray = IsGray;
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
     * Get Port information, which can be obtained through the DescribeDomains API 
     * @return Ports Port information, which can be obtained through the DescribeDomains API
     */
    public SpartaProtectionPort [] getPorts() {
        return this.Ports;
    }

    /**
     * Set Port information, which can be obtained through the DescribeDomains API
     * @param Ports Port information, which can be obtained through the DescribeDomains API
     */
    public void setPorts(SpartaProtectionPort [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Whether to enable persistent connection. 0: non-persistent connection; 1: persistent connection 
     * @return IsKeepAlive Whether to enable persistent connection. 0: non-persistent connection; 1: persistent connection
     */
    public String getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set Whether to enable persistent connection. 0: non-persistent connection; 1: persistent connection
     * @param IsKeepAlive Whether to enable persistent connection. 0: non-persistent connection; 1: persistent connection
     */
    public void setIsKeepAlive(String IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get To be deprecated. Currently, set this parameter to 0. Anycast IP type switch. 0: common IP; 1: Anycast IP 
     * @return Anycast To be deprecated. Currently, set this parameter to 0. Anycast IP type switch. 0: common IP; 1: Anycast IP
     */
    public Long getAnycast() {
        return this.Anycast;
    }

    /**
     * Set To be deprecated. Currently, set this parameter to 0. Anycast IP type switch. 0: common IP; 1: Anycast IP
     * @param Anycast To be deprecated. Currently, set this parameter to 0. Anycast IP type switch. 0: common IP; 1: Anycast IP
     */
    public void setAnycast(Long Anycast) {
        this.Anycast = Anycast;
    }

    /**
     * Get Weight of each IP in the upstream IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ]. 
     * @return Weights Weight of each IP in the upstream IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
     */
    public Long [] getWeights() {
        return this.Weights;
    }

    /**
     * Set Weight of each IP in the upstream IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
     * @param Weights Weight of each IP in the upstream IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
     */
    public void setWeights(Long [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get Whether to enable proactive health detection. 0: disable; 1: enable 
     * @return ActiveCheck Whether to enable proactive health detection. 0: disable; 1: enable
     */
    public Long getActiveCheck() {
        return this.ActiveCheck;
    }

    /**
     * Set Whether to enable proactive health detection. 0: disable; 1: enable
     * @param ActiveCheck Whether to enable proactive health detection. 0: disable; 1: enable
     */
    public void setActiveCheck(Long ActiveCheck) {
        this.ActiveCheck = ActiveCheck;
    }

    /**
     * Get TLS version information 
     * @return TLSVersion TLS version information
     */
    public Long getTLSVersion() {
        return this.TLSVersion;
    }

    /**
     * Set TLS version information
     * @param TLSVersion TLS version information
     */
    public void setTLSVersion(Long TLSVersion) {
        this.TLSVersion = TLSVersion;
    }

    /**
     * Get Cipher suite information 
     * @return Ciphers Cipher suite information
     */
    public Long [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set Cipher suite information
     * @param Ciphers Cipher suite information
     */
    public void setCiphers(Long [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get Cipher suite template. 0: default template (no selection); 1: general template; 2: secure template; 3: custom template 
     * @return CipherTemplate Cipher suite template. 0: default template (no selection); 1: general template; 2: secure template; 3: custom template
     */
    public Long getCipherTemplate() {
        return this.CipherTemplate;
    }

    /**
     * Set Cipher suite template. 0: default template (no selection); 1: general template; 2: secure template; 3: custom template
     * @param CipherTemplate Cipher suite template. 0: default template (no selection); 1: general template; 2: secure template; 3: custom template
     */
    public void setCipherTemplate(Long CipherTemplate) {
        this.CipherTemplate = CipherTemplate;
    }

    /**
     * Get Read timeout between WAF and upstream server, 300s by default. 
     * @return ProxyReadTimeout Read timeout between WAF and upstream server, 300s by default.
     */
    public Long getProxyReadTimeout() {
        return this.ProxyReadTimeout;
    }

    /**
     * Set Read timeout between WAF and upstream server, 300s by default.
     * @param ProxyReadTimeout Read timeout between WAF and upstream server, 300s by default.
     */
    public void setProxyReadTimeout(Long ProxyReadTimeout) {
        this.ProxyReadTimeout = ProxyReadTimeout;
    }

    /**
     * Get WAF and origin server write timeout, 300s by default. 
     * @return ProxySendTimeout WAF and origin server write timeout, 300s by default.
     */
    public Long getProxySendTimeout() {
        return this.ProxySendTimeout;
    }

    /**
     * Set WAF and origin server write timeout, 300s by default.
     * @param ProxySendTimeout WAF and origin server write timeout, 300s by default.
     */
    public void setProxySendTimeout(Long ProxySendTimeout) {
        this.ProxySendTimeout = ProxySendTimeout;
    }

    /**
     * Get SNI type when proxy to upstream.
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is the protected domain name.
2: Enable SNI. SNI is the origin server domain name when proxy to upstream by domain.
3: Enable SNI. SNI is the custom domain name. 
     * @return SniType SNI type when proxy to upstream.
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is the protected domain name.
2: Enable SNI. SNI is the origin server domain name when proxy to upstream by domain.
3: Enable SNI. SNI is the custom domain name.
     */
    public Long getSniType() {
        return this.SniType;
    }

    /**
     * Set SNI type when proxy to upstream.
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is the protected domain name.
2: Enable SNI. SNI is the origin server domain name when proxy to upstream by domain.
3: Enable SNI. SNI is the custom domain name.
     * @param SniType SNI type when proxy to upstream.
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is the protected domain name.
2: Enable SNI. SNI is the origin server domain name when proxy to upstream by domain.
3: Enable SNI. SNI is the custom domain name.
     */
    public void setSniType(Long SniType) {
        this.SniType = SniType;
    }

    /**
     * Get When SniType=3, this parameter is required, indicating a custom SNI; 
     * @return SniHost When SniType=3, this parameter is required, indicating a custom SNI;
     */
    public String getSniHost() {
        return this.SniHost;
    }

    /**
     * Set When SniType=3, this parameter is required, indicating a custom SNI;
     * @param SniHost When SniType=3, this parameter is required, indicating a custom SNI;
     */
    public void setSniHost(String SniHost) {
        this.SniHost = SniHost;
    }

    /**
     * Get IsCdn=3 required for this parameter, indicates custom header 
     * @return IpHeaders IsCdn=3 required for this parameter, indicates custom header
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3 required for this parameter, indicates custom header
     * @param IpHeaders IsCdn=3 required for this parameter, indicates custom header
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get Whether to enable XFF reset. 0: disable; 1: enable 
     * @return XFFReset Whether to enable XFF reset. 0: disable; 1: enable
     */
    public Long getXFFReset() {
        return this.XFFReset;
    }

    /**
     * Set Whether to enable XFF reset. 0: disable; 1: enable
     * @param XFFReset Whether to enable XFF reset. 0: disable; 1: enable
     */
    public void setXFFReset(Long XFFReset) {
        this.XFFReset = XFFReset;
    }

    /**
     * Get Domain name remarks 
     * @return Note Domain name remarks
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Domain name remarks
     * @param Note Domain name remarks
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Custom upstream host. The default value is a null string, indicating that the protected domain name is used as the upstream host. 
     * @return UpstreamHost Custom upstream host. The default value is a null string, indicating that the protected domain name is used as the upstream host.
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set Custom upstream host. The default value is a null string, indicating that the protected domain name is used as the upstream host.
     * @param UpstreamHost Custom upstream host. The default value is a null string, indicating that the protected domain name is used as the upstream host.
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    /**
     * Get Whether to enable caching. 0: disable; 1: enable. 
     * @return ProxyBuffer Whether to enable caching. 0: disable; 1: enable.
     */
    public Long getProxyBuffer() {
        return this.ProxyBuffer;
    }

    /**
     * Set Whether to enable caching. 0: disable; 1: enable.
     * @param ProxyBuffer Whether to enable caching. 0: disable; 1: enable.
     */
    public void setProxyBuffer(Long ProxyBuffer) {
        this.ProxyBuffer = ProxyBuffer;
    }

    /**
     * Get Whether to enable the test. 0: disable; 1: enable. The test is enabled by default. 
     * @return ProbeStatus Whether to enable the test. 0: disable; 1: enable. The test is enabled by default.
     */
    public Long getProbeStatus() {
        return this.ProbeStatus;
    }

    /**
     * Set Whether to enable the test. 0: disable; 1: enable. The test is enabled by default.
     * @param ProbeStatus Whether to enable the test. 0: disable; 1: enable. The test is enabled by default.
     */
    public void setProbeStatus(Long ProbeStatus) {
        this.ProbeStatus = ProbeStatus;
    }

    /**
     * Get SM option. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access. 
     * @return GmType SM option. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
     */
    public Long getGmType() {
        return this.GmType;
    }

    /**
     * Set SM option. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
     * @param GmType SM option. 0: do not enable SM; 1: add support for SM based on the existing TLS option; 2: enable SM and support only SM client access.
     */
    public void setGmType(Long GmType) {
        this.GmType = GmType;
    }

    /**
     * Get SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate. 
     * @return GmCertType SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
     */
    public Long getGmCertType() {
        return this.GmCertType;
    }

    /**
     * Set SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
     * @param GmCertType SM certificate type. 0: no SM certificate is available; 1: the certificate is a self-owned SM certificate; 2: the certificate is a managed SM certificate.
     */
    public void setGmCertType(Long GmCertType) {
        this.GmCertType = GmCertType;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate. 
     * @return GmCert When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
     */
    public String getGmCert() {
        return this.GmCert;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
     * @param GmCert When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
     */
    public void setGmCert(String GmCert) {
        this.GmCert = GmCert;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate. 
     * @return GmPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
     */
    public String getGmPrivateKey() {
        return this.GmPrivateKey;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
     * @param GmPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
     */
    public void setGmPrivateKey(String GmPrivateKey) {
        this.GmPrivateKey = GmPrivateKey;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate. 
     * @return GmEncCert When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
     */
    public String getGmEncCert() {
        return this.GmEncCert;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
     * @param GmEncCert When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
     */
    public void setGmEncCert(String GmEncCert) {
        this.GmEncCert = GmEncCert;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate. 
     * @return GmEncPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
     */
    public String getGmEncPrivateKey() {
        return this.GmEncPrivateKey;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
     * @param GmEncPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
     */
    public void setGmEncPrivateKey(String GmEncPrivateKey) {
        this.GmEncPrivateKey = GmEncPrivateKey;
    }

    /**
     * Get When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform. 
     * @return GmSSLId When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
     */
    public String getGmSSLId() {
        return this.GmSSLId;
    }

    /**
     * Set When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
     * @param GmSSLId When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
     */
    public void setGmSSLId(String GmSSLId) {
        this.GmSSLId = GmSSLId;
    }

    public ModifySpartaProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySpartaProtectionRequest(ModifySpartaProtectionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.UpstreamScheme != null) {
            this.UpstreamScheme = new String(source.UpstreamScheme);
        }
        if (source.HttpsUpstreamPort != null) {
            this.HttpsUpstreamPort = new String(source.HttpsUpstreamPort);
        }
        if (source.HttpsRewrite != null) {
            this.HttpsRewrite = new Long(source.HttpsRewrite);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new Long(source.UpstreamType);
        }
        if (source.UpstreamDomain != null) {
            this.UpstreamDomain = new String(source.UpstreamDomain);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
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
        if (source.IsGray != null) {
            this.IsGray = new Long(source.IsGray);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Ports != null) {
            this.Ports = new SpartaProtectionPort[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new SpartaProtectionPort(source.Ports[i]);
            }
        }
        if (source.IsKeepAlive != null) {
            this.IsKeepAlive = new String(source.IsKeepAlive);
        }
        if (source.Anycast != null) {
            this.Anycast = new Long(source.Anycast);
        }
        if (source.Weights != null) {
            this.Weights = new Long[source.Weights.length];
            for (int i = 0; i < source.Weights.length; i++) {
                this.Weights[i] = new Long(source.Weights[i]);
            }
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
        if (source.ProxyBuffer != null) {
            this.ProxyBuffer = new Long(source.ProxyBuffer);
        }
        if (source.ProbeStatus != null) {
            this.ProbeStatus = new Long(source.ProbeStatus);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamSimple(map, prefix + "UpstreamScheme", this.UpstreamScheme);
        this.setParamSimple(map, prefix + "HttpsUpstreamPort", this.HttpsUpstreamPort);
        this.setParamSimple(map, prefix + "HttpsRewrite", this.HttpsRewrite);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "UpstreamDomain", this.UpstreamDomain);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamSimple(map, prefix + "IsHttp2", this.IsHttp2);
        this.setParamSimple(map, prefix + "IsWebsocket", this.IsWebsocket);
        this.setParamSimple(map, prefix + "LoadBalance", this.LoadBalance);
        this.setParamSimple(map, prefix + "IsGray", this.IsGray);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "IsKeepAlive", this.IsKeepAlive);
        this.setParamSimple(map, prefix + "Anycast", this.Anycast);
        this.setParamArraySimple(map, prefix + "Weights.", this.Weights);
        this.setParamSimple(map, prefix + "ActiveCheck", this.ActiveCheck);
        this.setParamSimple(map, prefix + "TLSVersion", this.TLSVersion);
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "CipherTemplate", this.CipherTemplate);
        this.setParamSimple(map, prefix + "ProxyReadTimeout", this.ProxyReadTimeout);
        this.setParamSimple(map, prefix + "ProxySendTimeout", this.ProxySendTimeout);
        this.setParamSimple(map, prefix + "SniType", this.SniType);
        this.setParamSimple(map, prefix + "SniHost", this.SniHost);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "XFFReset", this.XFFReset);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamSimple(map, prefix + "ProxyBuffer", this.ProxyBuffer);
        this.setParamSimple(map, prefix + "ProbeStatus", this.ProbeStatus);
        this.setParamSimple(map, prefix + "GmType", this.GmType);
        this.setParamSimple(map, prefix + "GmCertType", this.GmCertType);
        this.setParamSimple(map, prefix + "GmCert", this.GmCert);
        this.setParamSimple(map, prefix + "GmPrivateKey", this.GmPrivateKey);
        this.setParamSimple(map, prefix + "GmEncCert", this.GmEncCert);
        this.setParamSimple(map, prefix + "GmEncPrivateKey", this.GmEncPrivateKey);
        this.setParamSimple(map, prefix + "GmSSLId", this.GmSSLId);

    }
}

