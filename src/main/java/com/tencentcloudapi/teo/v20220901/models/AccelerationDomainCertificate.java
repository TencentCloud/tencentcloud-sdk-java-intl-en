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
    * The server certificate configuration mode has the following valid values: <ul><li>disable: do not configure a server certificate.</li> <li>eofreecert: apply for a free certificate through automatic verification and deploy it. for verification methods, see: [supported verification methods for free certificate applications](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). - in NS or DNSPod hosting access mode, only the automatic verification method is supported for free certificate applications. - if the free certificate application fails, it will cause deployment failure. you can obtain the reason for the failure through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> <li>eofreecert_manual: deploy a free certificate applied through DNS delegation verification or file verification. before deploying the free certificate, you need to trigger the <a href='https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1'>apply for free certificate</a> API to apply for a free certificate. once the application is successful, you can deploy the free certificate using this enumeration value.</li> <ul><li>note: when deploying a free certificate, ensure that a successfully applied free certificate already exists. you can check whether a successfully applied free certificate exists through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> </ul> <li>sslcert: configure an SSL managed server-side certificate.</li></ul>.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
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
    * Specifies whether to enable or disable origin-pull mutual authentication and origin certificate verification. the certificate for origin-pull mutual authentication is carried during EO node origin-pull, and the origin server can choose to validate this certificate to ensure the request originates from a trusted EO node. when origin certificate verification is enabled, the certificate configuration is used for the EO node to verify whether the origin certificate is trustworthy.
    */
    @SerializedName("UpstreamCertInfo")
    @Expose
    private UpstreamCertInfo UpstreamCertInfo;

    /**
     * Get The server certificate configuration mode has the following valid values: <ul><li>disable: do not configure a server certificate.</li> <li>eofreecert: apply for a free certificate through automatic verification and deploy it. for verification methods, see: [supported verification methods for free certificate applications](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). - in NS or DNSPod hosting access mode, only the automatic verification method is supported for free certificate applications. - if the free certificate application fails, it will cause deployment failure. you can obtain the reason for the failure through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> <li>eofreecert_manual: deploy a free certificate applied through DNS delegation verification or file verification. before deploying the free certificate, you need to trigger the <a href='https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1'>apply for free certificate</a> API to apply for a free certificate. once the application is successful, you can deploy the free certificate using this enumeration value.</li> <ul><li>note: when deploying a free certificate, ensure that a successfully applied free certificate already exists. you can check whether a successfully applied free certificate exists through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> </ul> <li>sslcert: configure an SSL managed server-side certificate.</li></ul>. 
     * @return Mode The server certificate configuration mode has the following valid values: <ul><li>disable: do not configure a server certificate.</li> <li>eofreecert: apply for a free certificate through automatic verification and deploy it. for verification methods, see: [supported verification methods for free certificate applications](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). - in NS or DNSPod hosting access mode, only the automatic verification method is supported for free certificate applications. - if the free certificate application fails, it will cause deployment failure. you can obtain the reason for the failure through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> <li>eofreecert_manual: deploy a free certificate applied through DNS delegation verification or file verification. before deploying the free certificate, you need to trigger the <a href='https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1'>apply for free certificate</a> API to apply for a free certificate. once the application is successful, you can deploy the free certificate using this enumeration value.</li> <ul><li>note: when deploying a free certificate, ensure that a successfully applied free certificate already exists. you can check whether a successfully applied free certificate exists through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> </ul> <li>sslcert: configure an SSL managed server-side certificate.</li></ul>.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The server certificate configuration mode has the following valid values: <ul><li>disable: do not configure a server certificate.</li> <li>eofreecert: apply for a free certificate through automatic verification and deploy it. for verification methods, see: [supported verification methods for free certificate applications](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). - in NS or DNSPod hosting access mode, only the automatic verification method is supported for free certificate applications. - if the free certificate application fails, it will cause deployment failure. you can obtain the reason for the failure through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> <li>eofreecert_manual: deploy a free certificate applied through DNS delegation verification or file verification. before deploying the free certificate, you need to trigger the <a href='https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1'>apply for free certificate</a> API to apply for a free certificate. once the application is successful, you can deploy the free certificate using this enumeration value.</li> <ul><li>note: when deploying a free certificate, ensure that a successfully applied free certificate already exists. you can check whether a successfully applied free certificate exists through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> </ul> <li>sslcert: configure an SSL managed server-side certificate.</li></ul>.
     * @param Mode The server certificate configuration mode has the following valid values: <ul><li>disable: do not configure a server certificate.</li> <li>eofreecert: apply for a free certificate through automatic verification and deploy it. for verification methods, see: [supported verification methods for free certificate applications](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). - in NS or DNSPod hosting access mode, only the automatic verification method is supported for free certificate applications. - if the free certificate application fails, it will cause deployment failure. you can obtain the reason for the failure through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> <li>eofreecert_manual: deploy a free certificate applied through DNS delegation verification or file verification. before deploying the free certificate, you need to trigger the <a href='https://www.tencentcloud.comom/document/product/1552/124807?from_cn_redirect=1'>apply for free certificate</a> API to apply for a free certificate. once the application is successful, you can deploy the free certificate using this enumeration value.</li> <ul><li>note: when deploying a free certificate, ensure that a successfully applied free certificate already exists. you can check whether a successfully applied free certificate exists through the <a href='https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api.</li> </ul> <li>sslcert: configure an SSL managed server-side certificate.</li></ul>.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return List List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public CertificateInfo [] getList() {
        return this.List;
    }

    /**
     * Set List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param List List of server certificates. The relevant certificates are deployed on the entrance side of the EO.
Note: This field may return null, which indicates a failure to obtain a valid value.
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
     * Get Specifies whether to enable or disable origin-pull mutual authentication and origin certificate verification. the certificate for origin-pull mutual authentication is carried during EO node origin-pull, and the origin server can choose to validate this certificate to ensure the request originates from a trusted EO node. when origin certificate verification is enabled, the certificate configuration is used for the EO node to verify whether the origin certificate is trustworthy. 
     * @return UpstreamCertInfo Specifies whether to enable or disable origin-pull mutual authentication and origin certificate verification. the certificate for origin-pull mutual authentication is carried during EO node origin-pull, and the origin server can choose to validate this certificate to ensure the request originates from a trusted EO node. when origin certificate verification is enabled, the certificate configuration is used for the EO node to verify whether the origin certificate is trustworthy.
     */
    public UpstreamCertInfo getUpstreamCertInfo() {
        return this.UpstreamCertInfo;
    }

    /**
     * Set Specifies whether to enable or disable origin-pull mutual authentication and origin certificate verification. the certificate for origin-pull mutual authentication is carried during EO node origin-pull, and the origin server can choose to validate this certificate to ensure the request originates from a trusted EO node. when origin certificate verification is enabled, the certificate configuration is used for the EO node to verify whether the origin certificate is trustworthy.
     * @param UpstreamCertInfo Specifies whether to enable or disable origin-pull mutual authentication and origin certificate verification. the certificate for origin-pull mutual authentication is carried during EO node origin-pull, and the origin server can choose to validate this certificate to ensure the request originates from a trusted EO node. when origin certificate verification is enabled, the certificate configuration is used for the EO node to verify whether the origin certificate is trustworthy.
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

