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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetVodDomainCertificateRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The operation type of this API call, optional value:
<li>Set: Set the certificate required for the domain name HTTPS;</li>
<li>Clear: Clear the domain name HTTPS configuration, after clearing, the domain name cannot support </li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * [Tencent Cloud SSL](https://intl.cloud.tencent.com/document/product/400/7572?from_cn_redirect=1) uploaded certificate ID. No need to fill in this field when clearing domain HTTPS configuration
    */
    @SerializedName("CertID")
    @Expose
    private String CertID;

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
     * Get The operation type of this API call, optional value:
<li>Set: Set the certificate required for the domain name HTTPS;</li>
<li>Clear: Clear the domain name HTTPS configuration, after clearing, the domain name cannot support </li> 
     * @return Operation The operation type of this API call, optional value:
<li>Set: Set the certificate required for the domain name HTTPS;</li>
<li>Clear: Clear the domain name HTTPS configuration, after clearing, the domain name cannot support </li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set The operation type of this API call, optional value:
<li>Set: Set the certificate required for the domain name HTTPS;</li>
<li>Clear: Clear the domain name HTTPS configuration, after clearing, the domain name cannot support </li>
     * @param Operation The operation type of this API call, optional value:
<li>Set: Set the certificate required for the domain name HTTPS;</li>
<li>Clear: Clear the domain name HTTPS configuration, after clearing, the domain name cannot support </li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b> 
     * @return SubAppId <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
     * @param SubAppId <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get [Tencent Cloud SSL](https://intl.cloud.tencent.com/document/product/400/7572?from_cn_redirect=1) uploaded certificate ID. No need to fill in this field when clearing domain HTTPS configuration 
     * @return CertID [Tencent Cloud SSL](https://intl.cloud.tencent.com/document/product/400/7572?from_cn_redirect=1) uploaded certificate ID. No need to fill in this field when clearing domain HTTPS configuration
     */
    public String getCertID() {
        return this.CertID;
    }

    /**
     * Set [Tencent Cloud SSL](https://intl.cloud.tencent.com/document/product/400/7572?from_cn_redirect=1) uploaded certificate ID. No need to fill in this field when clearing domain HTTPS configuration
     * @param CertID [Tencent Cloud SSL](https://intl.cloud.tencent.com/document/product/400/7572?from_cn_redirect=1) uploaded certificate ID. No need to fill in this field when clearing domain HTTPS configuration
     */
    public void setCertID(String CertID) {
        this.CertID = CertID;
    }

    public SetVodDomainCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetVodDomainCertificateRequest(SetVodDomainCertificateRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.CertID != null) {
            this.CertID = new String(source.CertID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "CertID", this.CertID);

    }
}

