/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class AddSpartaProtectionRequest extends AbstractModel {

    /**
    * Domain requiring protection
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
    * Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed, and WAF will use a custom header in ip_headers to obtain the client IP address
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * Upstream type
0: proxy to upstream by IP address
1: proxy to upstream by domain name
    */
    @SerializedName("UpstreamType")
    @Expose
    private Long UpstreamType;

    /**
    * Whether to enable websocket
0: disable
1: enable
    */
    @SerializedName("IsWebsocket")
    @Expose
    private Long IsWebsocket;

    /**
    * Load balancing policy for upstream
0: round-robin
1: IP hash
2: weighted round-robin
    */
    @SerializedName("LoadBalance")
    @Expose
    private String LoadBalance;

    /**
    * Service port list configuration
NginxServerId: fill in '0' in this function
Port: listening port number
Protocol: port protocol
UpstreamPort: same as Port
UpstreamProtocol: same as Protocol
    */
    @SerializedName("Ports")
    @Expose
    private PortItem [] Ports;

    /**
    * (Required) Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private String IsKeepAlive;

    /**
    * (Required) Instance ID of the domain name
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

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
    * To be deprecated, not required. WAF resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * When IsCdn is 3, this parameter is required, indicating a custom header.
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * Upstream protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for upstream. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for upstream.
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
    * To be deprecated, can be left blank. Whether to enable grayscale: 0 indicates not to enable grayscale.
    */
    @SerializedName("IsGray")
    @Expose
    private Long IsGray;

    /**
    * To be deprecated, can be left blank. Grayscale area.
    */
    @SerializedName("GrayAreas")
    @Expose
    private String [] GrayAreas;

    /**
    * (Required) Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirect
1: enable forced redirect
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private Long HttpsRewrite;

    /**
    * Upstream domain when proxy to upstream by domain. When UpstreamType=1, this field needs to be filled
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * Upstream IP list when IP is back to source. When UpstreamType=0, this field is required
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * (Required) Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
    */
    @SerializedName("IsHttp2")
    @Expose
    private Long IsHttp2;

    /**
    * WAF instance type. This parameter will be deprecated in later versions and is not required in the current version.
sparta-waf: SaaS WAF
clb-waf: CLB WAF
cdn-waf: web protection capability on CDN
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * To be deprecated, currently just fill in 0. Anycast IP type switch: 0 Ordinary IP, 1 Anycast IP
    */
    @SerializedName("Anycast")
    @Expose
    private Long Anycast;

    /**
    * Weight of each IP in the back-to-source IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
    */
    @SerializedName("Weights")
    @Expose
    private Long [] Weights;

    /**
    * (Required) Whether to enable active health check
0: disable
1: enable
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
    * (Required) Cipher suite template
0: default template
1: general template
2: security template
3: custom template
    */
    @SerializedName("CipherTemplate")
    @Expose
    private Long CipherTemplate;

    /**
    * Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.
    */
    @SerializedName("Ciphers")
    @Expose
    private Long [] Ciphers;

    /**
    * Read timeout between WAF and upstream server, 300s by default.
    */
    @SerializedName("ProxyReadTimeout")
    @Expose
    private Long ProxyReadTimeout;

    /**
    * WAF and upstream server write timeout, 300s by default.
    */
    @SerializedName("ProxySendTimeout")
    @Expose
    private Long ProxySendTimeout;

    /**
    * SNI type during WAF sending request to upstream
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
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
    * Whether to enable XFF reset
0: disable
1: enable
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
    * Custom upstream host. The default value is an empty string, indicating that  protected domain is used as the upstream host.
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
    * 0: disable probe test; 1: enable probe test. The test is enabled by default.
    */
    @SerializedName("ProbeStatus")
    @Expose
    private Long ProbeStatus;

    /**
     * Get Domain requiring protection 
     * @return Domain Domain requiring protection
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain requiring protection
     * @param Domain Domain requiring protection
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed, and WAF will use a custom header in ip_headers to obtain the client IP address 
     * @return IsCdn Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed, and WAF will use a custom header in ip_headers to obtain the client IP address
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed, and WAF will use a custom header in ip_headers to obtain the client IP address
     * @param IsCdn Whether a layer-7 proxy service is deployed before WAF
0: No proxy service deployed
1: Proxy service deployed, and WAF will use XFF to obtain the client IP address
2: Proxy service deployed and WAF will use remote_addr to obtain the client IP address
3: Proxy service deployed, and WAF will use a custom header in ip_headers to obtain the client IP address
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get Upstream type
0: proxy to upstream by IP address
1: proxy to upstream by domain name 
     * @return UpstreamType Upstream type
0: proxy to upstream by IP address
1: proxy to upstream by domain name
     */
    public Long getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set Upstream type
0: proxy to upstream by IP address
1: proxy to upstream by domain name
     * @param UpstreamType Upstream type
0: proxy to upstream by IP address
1: proxy to upstream by domain name
     */
    public void setUpstreamType(Long UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get Whether to enable websocket
0: disable
1: enable 
     * @return IsWebsocket Whether to enable websocket
0: disable
1: enable
     */
    public Long getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set Whether to enable websocket
0: disable
1: enable
     * @param IsWebsocket Whether to enable websocket
0: disable
1: enable
     */
    public void setIsWebsocket(Long IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get Load balancing policy for upstream
0: round-robin
1: IP hash
2: weighted round-robin 
     * @return LoadBalance Load balancing policy for upstream
0: round-robin
1: IP hash
2: weighted round-robin
     */
    public String getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set Load balancing policy for upstream
0: round-robin
1: IP hash
2: weighted round-robin
     * @param LoadBalance Load balancing policy for upstream
0: round-robin
1: IP hash
2: weighted round-robin
     */
    public void setLoadBalance(String LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get Service port list configuration
NginxServerId: fill in '0' in this function
Port: listening port number
Protocol: port protocol
UpstreamPort: same as Port
UpstreamProtocol: same as Protocol 
     * @return Ports Service port list configuration
NginxServerId: fill in '0' in this function
Port: listening port number
Protocol: port protocol
UpstreamPort: same as Port
UpstreamProtocol: same as Protocol
     */
    public PortItem [] getPorts() {
        return this.Ports;
    }

    /**
     * Set Service port list configuration
NginxServerId: fill in '0' in this function
Port: listening port number
Protocol: port protocol
UpstreamPort: same as Port
UpstreamProtocol: same as Protocol
     * @param Ports Service port list configuration
NginxServerId: fill in '0' in this function
Port: listening port number
Protocol: port protocol
UpstreamPort: same as Port
UpstreamProtocol: same as Protocol
     */
    public void setPorts(PortItem [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get (Required) Whether to enable persistent connection
0: non-persistent connection
1: persistent connection 
     * @return IsKeepAlive (Required) Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
     */
    public String getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set (Required) Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
     * @param IsKeepAlive (Required) Whether to enable persistent connection
0: non-persistent connection
1: persistent connection
     */
    public void setIsKeepAlive(String IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get (Required) Instance ID of the domain name 
     * @return InstanceID (Required) Instance ID of the domain name
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set (Required) Instance ID of the domain name
     * @param InstanceID (Required) Instance ID of the domain name
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
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
     * Get To be deprecated, not required. WAF resource ID. 
     * @return ResourceId To be deprecated, not required. WAF resource ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set To be deprecated, not required. WAF resource ID.
     * @param ResourceId To be deprecated, not required. WAF resource ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get When IsCdn is 3, this parameter is required, indicating a custom header. 
     * @return IpHeaders When IsCdn is 3, this parameter is required, indicating a custom header.
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set When IsCdn is 3, this parameter is required, indicating a custom header.
     * @param IpHeaders When IsCdn is 3, this parameter is required, indicating a custom header.
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get Upstream protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for upstream. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for upstream. 
     * @return UpstreamScheme Upstream protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for upstream. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for upstream.
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set Upstream protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for upstream. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for upstream.
     * @param UpstreamScheme Upstream protocol for HTTPS when the service is configured with an HTTPS port
http: Use the HTTP protocol for upstream. It is used together with HttpsUpstreamPort.
https: Use the HTTPS protocol for upstream.
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
     * Get To be deprecated, can be left blank. Grayscale area. 
     * @return GrayAreas To be deprecated, can be left blank. Grayscale area.
     */
    public String [] getGrayAreas() {
        return this.GrayAreas;
    }

    /**
     * Set To be deprecated, can be left blank. Grayscale area.
     * @param GrayAreas To be deprecated, can be left blank. Grayscale area.
     */
    public void setGrayAreas(String [] GrayAreas) {
        this.GrayAreas = GrayAreas;
    }

    /**
     * Get (Required) Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirect
1: enable forced redirect 
     * @return HttpsRewrite (Required) Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirect
1: enable forced redirect
     */
    public Long getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set (Required) Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirect
1: enable forced redirect
     * @param HttpsRewrite (Required) Whether to enable forced redirection from HTTP to HTTPS
0: do not force redirect
1: enable forced redirect
     */
    public void setHttpsRewrite(Long HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
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
     * Get Upstream IP list when IP is back to source. When UpstreamType=0, this field is required 
     * @return SrcList Upstream IP list when IP is back to source. When UpstreamType=0, this field is required
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set Upstream IP list when IP is back to source. When UpstreamType=0, this field is required
     * @param SrcList Upstream IP list when IP is back to source. When UpstreamType=0, this field is required
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get (Required) Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable 
     * @return IsHttp2 (Required) Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
     */
    public Long getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set (Required) Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
     * @param IsHttp2 (Required) Whether to enable HTTP2. You should enable HTTPS as well.
0: disable
1: enable
     */
    public void setIsHttp2(Long IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get WAF instance type. This parameter will be deprecated in later versions and is not required in the current version.
sparta-waf: SaaS WAF
clb-waf: CLB WAF
cdn-waf: web protection capability on CDN 
     * @return Edition WAF instance type. This parameter will be deprecated in later versions and is not required in the current version.
sparta-waf: SaaS WAF
clb-waf: CLB WAF
cdn-waf: web protection capability on CDN
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF instance type. This parameter will be deprecated in later versions and is not required in the current version.
sparta-waf: SaaS WAF
clb-waf: CLB WAF
cdn-waf: web protection capability on CDN
     * @param Edition WAF instance type. This parameter will be deprecated in later versions and is not required in the current version.
sparta-waf: SaaS WAF
clb-waf: CLB WAF
cdn-waf: web protection capability on CDN
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get To be deprecated, currently just fill in 0. Anycast IP type switch: 0 Ordinary IP, 1 Anycast IP 
     * @return Anycast To be deprecated, currently just fill in 0. Anycast IP type switch: 0 Ordinary IP, 1 Anycast IP
     */
    public Long getAnycast() {
        return this.Anycast;
    }

    /**
     * Set To be deprecated, currently just fill in 0. Anycast IP type switch: 0 Ordinary IP, 1 Anycast IP
     * @param Anycast To be deprecated, currently just fill in 0. Anycast IP type switch: 0 Ordinary IP, 1 Anycast IP
     */
    public void setAnycast(Long Anycast) {
        this.Anycast = Anycast;
    }

    /**
     * Get Weight of each IP in the back-to-source IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ]. 
     * @return Weights Weight of each IP in the back-to-source IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
     */
    public Long [] getWeights() {
        return this.Weights;
    }

    /**
     * Set Weight of each IP in the back-to-source IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
     * @param Weights Weight of each IP in the back-to-source IP List, corresponding to SrcList. Required only when UpstreamType is 0, and SrcList contains multiple IPs, and LoadBalance is 2; otherwise, fill in [ ].
     */
    public void setWeights(Long [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get (Required) Whether to enable active health check
0: disable
1: enable 
     * @return ActiveCheck (Required) Whether to enable active health check
0: disable
1: enable
     */
    public Long getActiveCheck() {
        return this.ActiveCheck;
    }

    /**
     * Set (Required) Whether to enable active health check
0: disable
1: enable
     * @param ActiveCheck (Required) Whether to enable active health check
0: disable
1: enable
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
     * Get (Required) Cipher suite template
0: default template
1: general template
2: security template
3: custom template 
     * @return CipherTemplate (Required) Cipher suite template
0: default template
1: general template
2: security template
3: custom template
     */
    public Long getCipherTemplate() {
        return this.CipherTemplate;
    }

    /**
     * Set (Required) Cipher suite template
0: default template
1: general template
2: security template
3: custom template
     * @param CipherTemplate (Required) Cipher suite template
0: default template
1: general template
2: security template
3: custom template
     */
    public void setCipherTemplate(Long CipherTemplate) {
        this.CipherTemplate = CipherTemplate;
    }

    /**
     * Get Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API. 
     * @return Ciphers Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.
     */
    public Long [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.
     * @param Ciphers Custom encryption suite list. When CipherTemplate is 3, this field is required, indicating the custom encryption suite, value obtained through DescribeCiphersDetail API.
     */
    public void setCiphers(Long [] Ciphers) {
        this.Ciphers = Ciphers;
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
     * Get WAF and upstream server write timeout, 300s by default. 
     * @return ProxySendTimeout WAF and upstream server write timeout, 300s by default.
     */
    public Long getProxySendTimeout() {
        return this.ProxySendTimeout;
    }

    /**
     * Set WAF and upstream server write timeout, 300s by default.
     * @param ProxySendTimeout WAF and upstream server write timeout, 300s by default.
     */
    public void setProxySendTimeout(Long ProxySendTimeout) {
        this.ProxySendTimeout = ProxySendTimeout;
    }

    /**
     * Get SNI type during WAF sending request to upstream
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name. 
     * @return SniType SNI type during WAF sending request to upstream
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
     */
    public Long getSniType() {
        return this.SniType;
    }

    /**
     * Set SNI type during WAF sending request to upstream
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
     * @param SniType SNI type during WAF sending request to upstream
0: Disable SNI and do not configure server_name in client_hello.
1: Enable SNI. server_name in client_hello is a protected domain name.
2: Enable SNI. SNI is the origin server domain name during the domain name origin-pull.
3: Enable SNI. SNI is a custom domain name.
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
     * Get Whether to enable XFF reset
0: disable
1: enable 
     * @return XFFReset Whether to enable XFF reset
0: disable
1: enable
     */
    public Long getXFFReset() {
        return this.XFFReset;
    }

    /**
     * Set Whether to enable XFF reset
0: disable
1: enable
     * @param XFFReset Whether to enable XFF reset
0: disable
1: enable
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
     * Get Custom upstream host. The default value is an empty string, indicating that  protected domain is used as the upstream host. 
     * @return UpstreamHost Custom upstream host. The default value is an empty string, indicating that  protected domain is used as the upstream host.
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set Custom upstream host. The default value is an empty string, indicating that  protected domain is used as the upstream host.
     * @param UpstreamHost Custom upstream host. The default value is an empty string, indicating that  protected domain is used as the upstream host.
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
     * Get 0: disable probe test; 1: enable probe test. The test is enabled by default. 
     * @return ProbeStatus 0: disable probe test; 1: enable probe test. The test is enabled by default.
     */
    public Long getProbeStatus() {
        return this.ProbeStatus;
    }

    /**
     * Set 0: disable probe test; 1: enable probe test. The test is enabled by default.
     * @param ProbeStatus 0: disable probe test; 1: enable probe test. The test is enabled by default.
     */
    public void setProbeStatus(Long ProbeStatus) {
        this.ProbeStatus = ProbeStatus;
    }

    public AddSpartaProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSpartaProtectionRequest(AddSpartaProtectionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new Long(source.UpstreamType);
        }
        if (source.IsWebsocket != null) {
            this.IsWebsocket = new Long(source.IsWebsocket);
        }
        if (source.LoadBalance != null) {
            this.LoadBalance = new String(source.LoadBalance);
        }
        if (source.Ports != null) {
            this.Ports = new PortItem[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortItem(source.Ports[i]);
            }
        }
        if (source.IsKeepAlive != null) {
            this.IsKeepAlive = new String(source.IsKeepAlive);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
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
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.UpstreamScheme != null) {
            this.UpstreamScheme = new String(source.UpstreamScheme);
        }
        if (source.HttpsUpstreamPort != null) {
            this.HttpsUpstreamPort = new String(source.HttpsUpstreamPort);
        }
        if (source.IsGray != null) {
            this.IsGray = new Long(source.IsGray);
        }
        if (source.GrayAreas != null) {
            this.GrayAreas = new String[source.GrayAreas.length];
            for (int i = 0; i < source.GrayAreas.length; i++) {
                this.GrayAreas[i] = new String(source.GrayAreas[i]);
            }
        }
        if (source.HttpsRewrite != null) {
            this.HttpsRewrite = new Long(source.HttpsRewrite);
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
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
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
        if (source.CipherTemplate != null) {
            this.CipherTemplate = new Long(source.CipherTemplate);
        }
        if (source.Ciphers != null) {
            this.Ciphers = new Long[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new Long(source.Ciphers[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "IsWebsocket", this.IsWebsocket);
        this.setParamSimple(map, prefix + "LoadBalance", this.LoadBalance);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "IsKeepAlive", this.IsKeepAlive);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "UpstreamScheme", this.UpstreamScheme);
        this.setParamSimple(map, prefix + "HttpsUpstreamPort", this.HttpsUpstreamPort);
        this.setParamSimple(map, prefix + "IsGray", this.IsGray);
        this.setParamArraySimple(map, prefix + "GrayAreas.", this.GrayAreas);
        this.setParamSimple(map, prefix + "HttpsRewrite", this.HttpsRewrite);
        this.setParamSimple(map, prefix + "UpstreamDomain", this.UpstreamDomain);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamSimple(map, prefix + "IsHttp2", this.IsHttp2);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Anycast", this.Anycast);
        this.setParamArraySimple(map, prefix + "Weights.", this.Weights);
        this.setParamSimple(map, prefix + "ActiveCheck", this.ActiveCheck);
        this.setParamSimple(map, prefix + "TLSVersion", this.TLSVersion);
        this.setParamSimple(map, prefix + "CipherTemplate", this.CipherTemplate);
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "ProxyReadTimeout", this.ProxyReadTimeout);
        this.setParamSimple(map, prefix + "ProxySendTimeout", this.ProxySendTimeout);
        this.setParamSimple(map, prefix + "SniType", this.SniType);
        this.setParamSimple(map, prefix + "SniHost", this.SniHost);
        this.setParamSimple(map, prefix + "XFFReset", this.XFFReset);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamSimple(map, prefix + "ProxyBuffer", this.ProxyBuffer);
        this.setParamSimple(map, prefix + "ProbeStatus", this.ProbeStatus);

    }
}

