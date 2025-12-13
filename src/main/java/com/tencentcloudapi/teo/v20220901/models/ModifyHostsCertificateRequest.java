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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostsCertificateRequest extends AbstractModel {

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain names that you need to modify the certificate configuration
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Configures the server certificate mode. valid values:.

- disable: without configuring server certificate.
- eofreecert: specifies to apply for a free certificate through automatic validation and deploy it. for verification methods, see [free certificate application supported verification methods](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1).
    - In ns or DNSPod hosting access mode, free certificates can only be applied for via automatic validation.
    - When a free certificate application fails, it can cause deployment failure. you can obtain the failure reason through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> .
- eofreecert_manual: specifies the deployment of free certificates applied through DNS delegation verification or file verification. before deploying a free certificate, you need to trigger the [apply for free certificate](https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1)) api to apply for a free certificate. once the application is successful, you can use this enumeration value to deploy the free certificate.
Note: when deploying a free certificate, ensure a successful application for a free certificate already exists. you can check whether a successful application for a free certificate already exists through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> api.
- sslcert: specifies the configuration of the managed service side certificate.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * SSL certificate configuration. This parameter is effective only when the mode is sslcert. You only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
    */
    @SerializedName("ServerCertInfo")
    @Expose
    private ServerCertInfo [] ServerCertInfo;

    /**
    * Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
    */
    @SerializedName("ApplyType")
    @Expose
    private String ApplyType;

    /**
    * In the mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for the client to authenticate the EO node. By default, it is disabled. If it is left blank, it indicates retaining the original configuration.
    */
    @SerializedName("ClientCertInfo")
    @Expose
    private MutualTLS ClientCertInfo;

    /**
    * Specifies the certificate carried during EO node origin-pull for origin-pull mutual authentication handshake, off by default. leave blank to indicate retaining the original configuration. this configuration is currently in closed beta testing for the allowlist feature. if you need to use it, please contact us (https://www.tencentcloud.comom/online?from_cn_redirect=1-service).
    */
    @SerializedName("UpstreamCertInfo")
    @Expose
    private UpstreamCertInfo UpstreamCertInfo;

    /**
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Domain names that you need to modify the certificate configuration 
     * @return Hosts Domain names that you need to modify the certificate configuration
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Domain names that you need to modify the certificate configuration
     * @param Hosts Domain names that you need to modify the certificate configuration
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Configures the server certificate mode. valid values:.

- disable: without configuring server certificate.
- eofreecert: specifies to apply for a free certificate through automatic validation and deploy it. for verification methods, see [free certificate application supported verification methods](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1).
    - In ns or DNSPod hosting access mode, free certificates can only be applied for via automatic validation.
    - When a free certificate application fails, it can cause deployment failure. you can obtain the failure reason through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> .
- eofreecert_manual: specifies the deployment of free certificates applied through DNS delegation verification or file verification. before deploying a free certificate, you need to trigger the [apply for free certificate](https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1)) api to apply for a free certificate. once the application is successful, you can use this enumeration value to deploy the free certificate.
Note: when deploying a free certificate, ensure a successful application for a free certificate already exists. you can check whether a successful application for a free certificate already exists through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> api.
- sslcert: specifies the configuration of the managed service side certificate. 
     * @return Mode Configures the server certificate mode. valid values:.

- disable: without configuring server certificate.
- eofreecert: specifies to apply for a free certificate through automatic validation and deploy it. for verification methods, see [free certificate application supported verification methods](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1).
    - In ns or DNSPod hosting access mode, free certificates can only be applied for via automatic validation.
    - When a free certificate application fails, it can cause deployment failure. you can obtain the failure reason through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> .
- eofreecert_manual: specifies the deployment of free certificates applied through DNS delegation verification or file verification. before deploying a free certificate, you need to trigger the [apply for free certificate](https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1)) api to apply for a free certificate. once the application is successful, you can use this enumeration value to deploy the free certificate.
Note: when deploying a free certificate, ensure a successful application for a free certificate already exists. you can check whether a successful application for a free certificate already exists through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> api.
- sslcert: specifies the configuration of the managed service side certificate.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Configures the server certificate mode. valid values:.

- disable: without configuring server certificate.
- eofreecert: specifies to apply for a free certificate through automatic validation and deploy it. for verification methods, see [free certificate application supported verification methods](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1).
    - In ns or DNSPod hosting access mode, free certificates can only be applied for via automatic validation.
    - When a free certificate application fails, it can cause deployment failure. you can obtain the failure reason through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> .
- eofreecert_manual: specifies the deployment of free certificates applied through DNS delegation verification or file verification. before deploying a free certificate, you need to trigger the [apply for free certificate](https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1)) api to apply for a free certificate. once the application is successful, you can use this enumeration value to deploy the free certificate.
Note: when deploying a free certificate, ensure a successful application for a free certificate already exists. you can check whether a successful application for a free certificate already exists through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> api.
- sslcert: specifies the configuration of the managed service side certificate.
     * @param Mode Configures the server certificate mode. valid values:.

- disable: without configuring server certificate.
- eofreecert: specifies to apply for a free certificate through automatic validation and deploy it. for verification methods, see [free certificate application supported verification methods](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1).
    - In ns or DNSPod hosting access mode, free certificates can only be applied for via automatic validation.
    - When a free certificate application fails, it can cause deployment failure. you can obtain the failure reason through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> .
- eofreecert_manual: specifies the deployment of free certificates applied through DNS delegation verification or file verification. before deploying a free certificate, you need to trigger the [apply for free certificate](https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1)) api to apply for a free certificate. once the application is successful, you can use this enumeration value to deploy the free certificate.
Note: when deploying a free certificate, ensure a successful application for a free certificate already exists. you can check whether a successful application for a free certificate already exists through the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1)'>check free certificate application result</a> api.
- sslcert: specifies the configuration of the managed service side certificate.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get SSL certificate configuration. This parameter is effective only when the mode is sslcert. You only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl). 
     * @return ServerCertInfo SSL certificate configuration. This parameter is effective only when the mode is sslcert. You only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
     */
    public ServerCertInfo [] getServerCertInfo() {
        return this.ServerCertInfo;
    }

    /**
     * Set SSL certificate configuration. This parameter is effective only when the mode is sslcert. You only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
     * @param ServerCertInfo SSL certificate configuration. This parameter is effective only when the mode is sslcert. You only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
     */
    public void setServerCertInfo(ServerCertInfo [] ServerCertInfo) {
        this.ServerCertInfo = ServerCertInfo;
    }

    /**
     * Get Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`. 
     * @return ApplyType Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
     * @deprecated
     */
    @Deprecated
    public String getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
     * @param ApplyType Whether the certificate is managed by EdgeOne. Values:
<li>`none`: Not managed by EdgeOne</li>
<li>`apply`: Managed by EdgeOne</li>
Default value: `none`.
     * @deprecated
     */
    @Deprecated
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get In the mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for the client to authenticate the EO node. By default, it is disabled. If it is left blank, it indicates retaining the original configuration. 
     * @return ClientCertInfo In the mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for the client to authenticate the EO node. By default, it is disabled. If it is left blank, it indicates retaining the original configuration.
     */
    public MutualTLS getClientCertInfo() {
        return this.ClientCertInfo;
    }

    /**
     * Set In the mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for the client to authenticate the EO node. By default, it is disabled. If it is left blank, it indicates retaining the original configuration.
     * @param ClientCertInfo In the mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for the client to authenticate the EO node. By default, it is disabled. If it is left blank, it indicates retaining the original configuration.
     */
    public void setClientCertInfo(MutualTLS ClientCertInfo) {
        this.ClientCertInfo = ClientCertInfo;
    }

    /**
     * Get Specifies the certificate carried during EO node origin-pull for origin-pull mutual authentication handshake, off by default. leave blank to indicate retaining the original configuration. this configuration is currently in closed beta testing for the allowlist feature. if you need to use it, please contact us (https://www.tencentcloud.comom/online?from_cn_redirect=1-service). 
     * @return UpstreamCertInfo Specifies the certificate carried during EO node origin-pull for origin-pull mutual authentication handshake, off by default. leave blank to indicate retaining the original configuration. this configuration is currently in closed beta testing for the allowlist feature. if you need to use it, please contact us (https://www.tencentcloud.comom/online?from_cn_redirect=1-service).
     */
    public UpstreamCertInfo getUpstreamCertInfo() {
        return this.UpstreamCertInfo;
    }

    /**
     * Set Specifies the certificate carried during EO node origin-pull for origin-pull mutual authentication handshake, off by default. leave blank to indicate retaining the original configuration. this configuration is currently in closed beta testing for the allowlist feature. if you need to use it, please contact us (https://www.tencentcloud.comom/online?from_cn_redirect=1-service).
     * @param UpstreamCertInfo Specifies the certificate carried during EO node origin-pull for origin-pull mutual authentication handshake, off by default. leave blank to indicate retaining the original configuration. this configuration is currently in closed beta testing for the allowlist feature. if you need to use it, please contact us (https://www.tencentcloud.comom/online?from_cn_redirect=1-service).
     */
    public void setUpstreamCertInfo(UpstreamCertInfo UpstreamCertInfo) {
        this.UpstreamCertInfo = UpstreamCertInfo;
    }

    public ModifyHostsCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostsCertificateRequest(ModifyHostsCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ServerCertInfo != null) {
            this.ServerCertInfo = new ServerCertInfo[source.ServerCertInfo.length];
            for (int i = 0; i < source.ServerCertInfo.length; i++) {
                this.ServerCertInfo[i] = new ServerCertInfo(source.ServerCertInfo[i]);
            }
        }
        if (source.ApplyType != null) {
            this.ApplyType = new String(source.ApplyType);
        }
        if (source.ClientCertInfo != null) {
            this.ClientCertInfo = new MutualTLS(source.ClientCertInfo);
        }
        if (source.UpstreamCertInfo != null) {
            this.UpstreamCertInfo = new UpstreamCertInfo(source.UpstreamCertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "ServerCertInfo.", this.ServerCertInfo);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamObj(map, prefix + "ClientCertInfo.", this.ClientCertInfo);
        this.setParamObj(map, prefix + "UpstreamCertInfo.", this.UpstreamCertInfo);

    }
}

