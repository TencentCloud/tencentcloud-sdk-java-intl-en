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

public class AccelerationDomainCertificate extends AbstractModel {

    /**
    * Mode for configuring the server certificate. Valid values: <ul><li>disable: Do not configure a server certificate.</li> <li>eofreecert: Apply for a free certificate through automatic verification and deploy it. For details on the verification method, see [Supported Verification Methods for Free Certificate Application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1). - In NS or DNSPod hosting access mode, free certificates can only be applied for through automatic verification. - If the free certificate application fails, the certificate deployment will fail. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li><li>eofreecert_manual: Deploy a free certificate applied for through DNS delegated verification or file verification. Before deploying a free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After the free certificate application succeeds, you can use this enumeration value to deploy the free certificate.</li> <ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li> </ul> <li>sslcert: Configure an SSL managed server certificate.</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * List of server certificates. The related certificates are deployed at the EO entry side.
    */
    @SerializedName("List")
    @Expose
    private CertificateInfo [] List;

    /**
    * In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
    */
    @SerializedName("ClientCertInfo")
    @Expose
    private MutualTLS ClientCertInfo;

    /**
    * Used to enable or disable origin-pull mutual authentication and origin certificate verification. The certificate for origin-pull mutual authentication is carried during EO origin-pull. The origin server can choose to verify this certificate to ensure the request originates from a trusted EO node. When origin certificate verification is enabled, the certificate configuration is used for EO nodes to verify whether the origin certificate is trustworthy.
    */
    @SerializedName("UpstreamCertInfo")
    @Expose
    private UpstreamCertInfo UpstreamCertInfo;

    /**
     * Get Mode for configuring the server certificate. Valid values: <ul><li>disable: Do not configure a server certificate.</li> <li>eofreecert: Apply for a free certificate through automatic verification and deploy it. For details on the verification method, see [Supported Verification Methods for Free Certificate Application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1). - In NS or DNSPod hosting access mode, free certificates can only be applied for through automatic verification. - If the free certificate application fails, the certificate deployment will fail. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li><li>eofreecert_manual: Deploy a free certificate applied for through DNS delegated verification or file verification. Before deploying a free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After the free certificate application succeeds, you can use this enumeration value to deploy the free certificate.</li> <ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li> </ul> <li>sslcert: Configure an SSL managed server certificate.</li></ul> 
     * @return Mode Mode for configuring the server certificate. Valid values: <ul><li>disable: Do not configure a server certificate.</li> <li>eofreecert: Apply for a free certificate through automatic verification and deploy it. For details on the verification method, see [Supported Verification Methods for Free Certificate Application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1). - In NS or DNSPod hosting access mode, free certificates can only be applied for through automatic verification. - If the free certificate application fails, the certificate deployment will fail. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li><li>eofreecert_manual: Deploy a free certificate applied for through DNS delegated verification or file verification. Before deploying a free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After the free certificate application succeeds, you can use this enumeration value to deploy the free certificate.</li> <ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li> </ul> <li>sslcert: Configure an SSL managed server certificate.</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Mode for configuring the server certificate. Valid values: <ul><li>disable: Do not configure a server certificate.</li> <li>eofreecert: Apply for a free certificate through automatic verification and deploy it. For details on the verification method, see [Supported Verification Methods for Free Certificate Application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1). - In NS or DNSPod hosting access mode, free certificates can only be applied for through automatic verification. - If the free certificate application fails, the certificate deployment will fail. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li><li>eofreecert_manual: Deploy a free certificate applied for through DNS delegated verification or file verification. Before deploying a free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After the free certificate application succeeds, you can use this enumeration value to deploy the free certificate.</li> <ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li> </ul> <li>sslcert: Configure an SSL managed server certificate.</li></ul>
     * @param Mode Mode for configuring the server certificate. Valid values: <ul><li>disable: Do not configure a server certificate.</li> <li>eofreecert: Apply for a free certificate through automatic verification and deploy it. For details on the verification method, see [Supported Verification Methods for Free Certificate Application](https://www.tencentcloud.com/document/product/1552/90437?from_cn_redirect=1). - In NS or DNSPod hosting access mode, free certificates can only be applied for through automatic verification. - If the free certificate application fails, the certificate deployment will fail. You can obtain the failure reason through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li><li>eofreecert_manual: Deploy a free certificate applied for through DNS delegated verification or file verification. Before deploying a free certificate, you need to trigger the <a href = 'https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1'>Apply for Free Certificate</a> API to apply for a free certificate. After the free certificate application succeeds, you can use this enumeration value to deploy the free certificate.</li> <ul><li>Note: When deploying a free certificate, ensure that a successfully applied free certificate already exists. You can check whether a successfully applied free certificate already exists through the <a href = 'https://www.tencentcloud.com/document/product/1552/124806?from_cn_redirect=1'>Check Free Certificate Application Result</a> API.</li> </ul> <li>sslcert: Configure an SSL managed server certificate.</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get List of server certificates. The related certificates are deployed at the EO entry side. 
     * @return List List of server certificates. The related certificates are deployed at the EO entry side.
     */
    public CertificateInfo [] getList() {
        return this.List;
    }

    /**
     * Set List of server certificates. The related certificates are deployed at the EO entry side.
     * @param List List of server certificates. The related certificates are deployed at the EO entry side.
     */
    public void setList(CertificateInfo [] List) {
        this.List = List;
    }

    /**
     * Get In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate. 
     * @return ClientCertInfo In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
     */
    public MutualTLS getClientCertInfo() {
        return this.ClientCertInfo;
    }

    /**
     * Set In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
     * @param ClientCertInfo In the edge mutual authentication scenario, this field represents the client's CA certificate, which is deployed inside the EO node and used for EO node authentication of the client certificate.
     */
    public void setClientCertInfo(MutualTLS ClientCertInfo) {
        this.ClientCertInfo = ClientCertInfo;
    }

    /**
     * Get Used to enable or disable origin-pull mutual authentication and origin certificate verification. The certificate for origin-pull mutual authentication is carried during EO origin-pull. The origin server can choose to verify this certificate to ensure the request originates from a trusted EO node. When origin certificate verification is enabled, the certificate configuration is used for EO nodes to verify whether the origin certificate is trustworthy. 
     * @return UpstreamCertInfo Used to enable or disable origin-pull mutual authentication and origin certificate verification. The certificate for origin-pull mutual authentication is carried during EO origin-pull. The origin server can choose to verify this certificate to ensure the request originates from a trusted EO node. When origin certificate verification is enabled, the certificate configuration is used for EO nodes to verify whether the origin certificate is trustworthy.
     */
    public UpstreamCertInfo getUpstreamCertInfo() {
        return this.UpstreamCertInfo;
    }

    /**
     * Set Used to enable or disable origin-pull mutual authentication and origin certificate verification. The certificate for origin-pull mutual authentication is carried during EO origin-pull. The origin server can choose to verify this certificate to ensure the request originates from a trusted EO node. When origin certificate verification is enabled, the certificate configuration is used for EO nodes to verify whether the origin certificate is trustworthy.
     * @param UpstreamCertInfo Used to enable or disable origin-pull mutual authentication and origin certificate verification. The certificate for origin-pull mutual authentication is carried during EO origin-pull. The origin server can choose to verify this certificate to ensure the request originates from a trusted EO node. When origin certificate verification is enabled, the certificate configuration is used for EO nodes to verify whether the origin certificate is trustworthy.
     */
    public void setUpstreamCertInfo(UpstreamCertInfo UpstreamCertInfo) {
        this.UpstreamCertInfo = UpstreamCertInfo;
    }

    public AccelerationDomainCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerationDomainCertificate(AccelerationDomainCertificate source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.List != null) {
            this.List = new CertificateInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new CertificateInfo(source.List[i]);
            }
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
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamObj(map, prefix + "ClientCertInfo.", this.ClientCertInfo);
        this.setParamObj(map, prefix + "UpstreamCertInfo.", this.UpstreamCertInfo);

    }
}

