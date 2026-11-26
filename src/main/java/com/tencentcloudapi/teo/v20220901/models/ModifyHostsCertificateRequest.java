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
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration domain name whose certificate configuration needs to be modified.
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Mode for configuring the server certificate. Valid values:
<ul><li>disable: without configuring server certificate;</li>
<li>eofreecert: apply for a free certificate through automatic validation and deploy it. For verification methods, see [verification methods supported for free certificate application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1)</li>

-In NS or DNSPod hosting access mode, free certificate application is only supported via automatic validation.
- If a free certificate application fails, it will cause certificate deployment failure. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>eofreecert_manual: deploy a free certificate applied through DNS delegated verification or file validation. Before deploying the free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After a successful application, you can use this enumeration value to deploy the free certificate;</li>
<ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>sslcert: Configure an SSL managed service side certificate.</li>
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
    * Managed type. Valid values:
<li>none: Do not manage EO;</li>
<li>apply: manage EO</li>
If this field is not specified, the default value 'none' will be used.
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
    * Used to enable or disable origin-pull mutual authentication and origin certificate verification respectively. Off by default. Leave blank to indicate retaining the original configuration. The origin-pull mutual authentication configuration is currently in internal allowlist testing. If needed, contact us (https://www.tencentcloud.com/online?from_cn_redirect=1-service).
    */
    @SerializedName("UpstreamCertInfo")
    @Expose
    private UpstreamCertInfo UpstreamCertInfo;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration domain name whose certificate configuration needs to be modified. 
     * @return Hosts Acceleration domain name whose certificate configuration needs to be modified.
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Acceleration domain name whose certificate configuration needs to be modified.
     * @param Hosts Acceleration domain name whose certificate configuration needs to be modified.
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Mode for configuring the server certificate. Valid values:
<ul><li>disable: without configuring server certificate;</li>
<li>eofreecert: apply for a free certificate through automatic validation and deploy it. For verification methods, see [verification methods supported for free certificate application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1)</li>

-In NS or DNSPod hosting access mode, free certificate application is only supported via automatic validation.
- If a free certificate application fails, it will cause certificate deployment failure. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>eofreecert_manual: deploy a free certificate applied through DNS delegated verification or file validation. Before deploying the free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After a successful application, you can use this enumeration value to deploy the free certificate;</li>
<ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>sslcert: Configure an SSL managed service side certificate.</li> 
     * @return Mode Mode for configuring the server certificate. Valid values:
<ul><li>disable: without configuring server certificate;</li>
<li>eofreecert: apply for a free certificate through automatic validation and deploy it. For verification methods, see [verification methods supported for free certificate application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1)</li>

-In NS or DNSPod hosting access mode, free certificate application is only supported via automatic validation.
- If a free certificate application fails, it will cause certificate deployment failure. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>eofreecert_manual: deploy a free certificate applied through DNS delegated verification or file validation. Before deploying the free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After a successful application, you can use this enumeration value to deploy the free certificate;</li>
<ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>sslcert: Configure an SSL managed service side certificate.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Mode for configuring the server certificate. Valid values:
<ul><li>disable: without configuring server certificate;</li>
<li>eofreecert: apply for a free certificate through automatic validation and deploy it. For verification methods, see [verification methods supported for free certificate application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1)</li>

-In NS or DNSPod hosting access mode, free certificate application is only supported via automatic validation.
- If a free certificate application fails, it will cause certificate deployment failure. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>eofreecert_manual: deploy a free certificate applied through DNS delegated verification or file validation. Before deploying the free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After a successful application, you can use this enumeration value to deploy the free certificate;</li>
<ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>sslcert: Configure an SSL managed service side certificate.</li>
     * @param Mode Mode for configuring the server certificate. Valid values:
<ul><li>disable: without configuring server certificate;</li>
<li>eofreecert: apply for a free certificate through automatic validation and deploy it. For verification methods, see [verification methods supported for free certificate application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1)</li>

-In NS or DNSPod hosting access mode, free certificate application is only supported via automatic validation.
- If a free certificate application fails, it will cause certificate deployment failure. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>eofreecert_manual: deploy a free certificate applied through DNS delegated verification or file validation. Before deploying the free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After a successful application, you can use this enumeration value to deploy the free certificate;</li>
<ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li>
</ul><li>sslcert: Configure an SSL managed service side certificate.</li>
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
     * Get Managed type. Valid values:
<li>none: Do not manage EO;</li>
<li>apply: manage EO</li>
If this field is not specified, the default value 'none' will be used. 
     * @return ApplyType Managed type. Valid values:
<li>none: Do not manage EO;</li>
<li>apply: manage EO</li>
If this field is not specified, the default value 'none' will be used.
     * @deprecated
     */
    @Deprecated
    public String getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Managed type. Valid values:
<li>none: Do not manage EO;</li>
<li>apply: manage EO</li>
If this field is not specified, the default value 'none' will be used.
     * @param ApplyType Managed type. Valid values:
<li>none: Do not manage EO;</li>
<li>apply: manage EO</li>
If this field is not specified, the default value 'none' will be used.
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
     * Get Used to enable or disable origin-pull mutual authentication and origin certificate verification respectively. Off by default. Leave blank to indicate retaining the original configuration. The origin-pull mutual authentication configuration is currently in internal allowlist testing. If needed, contact us (https://www.tencentcloud.com/online?from_cn_redirect=1-service). 
     * @return UpstreamCertInfo Used to enable or disable origin-pull mutual authentication and origin certificate verification respectively. Off by default. Leave blank to indicate retaining the original configuration. The origin-pull mutual authentication configuration is currently in internal allowlist testing. If needed, contact us (https://www.tencentcloud.com/online?from_cn_redirect=1-service).
     */
    public UpstreamCertInfo getUpstreamCertInfo() {
        return this.UpstreamCertInfo;
    }

    /**
     * Set Used to enable or disable origin-pull mutual authentication and origin certificate verification respectively. Off by default. Leave blank to indicate retaining the original configuration. The origin-pull mutual authentication configuration is currently in internal allowlist testing. If needed, contact us (https://www.tencentcloud.com/online?from_cn_redirect=1-service).
     * @param UpstreamCertInfo Used to enable or disable origin-pull mutual authentication and origin certificate verification respectively. Off by default. Leave blank to indicate retaining the original configuration. The origin-pull mutual authentication configuration is currently in internal allowlist testing. If needed, contact us (https://www.tencentcloud.com/online?from_cn_redirect=1-service).
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

