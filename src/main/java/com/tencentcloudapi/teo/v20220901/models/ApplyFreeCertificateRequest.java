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

public class ApplyFreeCertificateRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Specifies the target domain name for free certificate application.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Specifies the verification method for applying for a free certificate. for detailed verification methods, refer to the [free certificate application documentation](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). valid values:.
<li>http_challenge: specifies the file validation mode for http access. verifies by getting file information from the specified URL of the access domain to complete free certificate application.</li>
<li>dns_challenge: specifies the dns delegation verification method. verifies the free certificate application by adding the designated host record pointing to EdgeOne.</li>

Note: after triggering this api, you need to complete the verification content configuration based on the returned verification information. once configured, you must also verify by calling the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api. after verification passes, the application succeeds. once the application is successful, you can call the <a href = 'https://www.tencentcloud.comom/document/product/1552/80764?from_cn_redirect=1'>configure domain name certificate</a> API to deploy a free certificate for the current domain name.
    */
    @SerializedName("VerificationMethod")
    @Expose
    private String VerificationMethod;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Specifies the target domain name for free certificate application. 
     * @return Domain Specifies the target domain name for free certificate application.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Specifies the target domain name for free certificate application.
     * @param Domain Specifies the target domain name for free certificate application.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Specifies the verification method for applying for a free certificate. for detailed verification methods, refer to the [free certificate application documentation](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). valid values:.
<li>http_challenge: specifies the file validation mode for http access. verifies by getting file information from the specified URL of the access domain to complete free certificate application.</li>
<li>dns_challenge: specifies the dns delegation verification method. verifies the free certificate application by adding the designated host record pointing to EdgeOne.</li>

Note: after triggering this api, you need to complete the verification content configuration based on the returned verification information. once configured, you must also verify by calling the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api. after verification passes, the application succeeds. once the application is successful, you can call the <a href = 'https://www.tencentcloud.comom/document/product/1552/80764?from_cn_redirect=1'>configure domain name certificate</a> API to deploy a free certificate for the current domain name. 
     * @return VerificationMethod Specifies the verification method for applying for a free certificate. for detailed verification methods, refer to the [free certificate application documentation](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). valid values:.
<li>http_challenge: specifies the file validation mode for http access. verifies by getting file information from the specified URL of the access domain to complete free certificate application.</li>
<li>dns_challenge: specifies the dns delegation verification method. verifies the free certificate application by adding the designated host record pointing to EdgeOne.</li>

Note: after triggering this api, you need to complete the verification content configuration based on the returned verification information. once configured, you must also verify by calling the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api. after verification passes, the application succeeds. once the application is successful, you can call the <a href = 'https://www.tencentcloud.comom/document/product/1552/80764?from_cn_redirect=1'>configure domain name certificate</a> API to deploy a free certificate for the current domain name.
     */
    public String getVerificationMethod() {
        return this.VerificationMethod;
    }

    /**
     * Set Specifies the verification method for applying for a free certificate. for detailed verification methods, refer to the [free certificate application documentation](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). valid values:.
<li>http_challenge: specifies the file validation mode for http access. verifies by getting file information from the specified URL of the access domain to complete free certificate application.</li>
<li>dns_challenge: specifies the dns delegation verification method. verifies the free certificate application by adding the designated host record pointing to EdgeOne.</li>

Note: after triggering this api, you need to complete the verification content configuration based on the returned verification information. once configured, you must also verify by calling the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api. after verification passes, the application succeeds. once the application is successful, you can call the <a href = 'https://www.tencentcloud.comom/document/product/1552/80764?from_cn_redirect=1'>configure domain name certificate</a> API to deploy a free certificate for the current domain name.
     * @param VerificationMethod Specifies the verification method for applying for a free certificate. for detailed verification methods, refer to the [free certificate application documentation](https://www.tencentcloud.comom/document/product/1552/90437?from_cn_redirect=1). valid values:.
<li>http_challenge: specifies the file validation mode for http access. verifies by getting file information from the specified URL of the access domain to complete free certificate application.</li>
<li>dns_challenge: specifies the dns delegation verification method. verifies the free certificate application by adding the designated host record pointing to EdgeOne.</li>

Note: after triggering this api, you need to complete the verification content configuration based on the returned verification information. once configured, you must also verify by calling the <a href = 'https://www.tencentcloud.comom/document/product/1552/124806?from_cn_redirect=1'>check free certificate application result</a> api. after verification passes, the application succeeds. once the application is successful, you can call the <a href = 'https://www.tencentcloud.comom/document/product/1552/80764?from_cn_redirect=1'>configure domain name certificate</a> API to deploy a free certificate for the current domain name.
     */
    public void setVerificationMethod(String VerificationMethod) {
        this.VerificationMethod = VerificationMethod;
    }

    public ApplyFreeCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyFreeCertificateRequest(ApplyFreeCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VerificationMethod != null) {
            this.VerificationMethod = new String(source.VerificationMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VerificationMethod", this.VerificationMethod);

    }
}

