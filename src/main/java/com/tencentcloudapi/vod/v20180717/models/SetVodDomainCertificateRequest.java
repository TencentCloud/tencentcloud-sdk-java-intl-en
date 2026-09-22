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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetVodDomainCertificateRequest extends AbstractModel {

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Operation type of this API call. Available values:</p><li>Set: certificate required for setting domain HTTPS;</li><li>Clear: clear domain HTTPS configuration. After clearance, the domain cannot support HTTPS access.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>ID of the certificate uploaded to <a href="https://www.tencentcloud.com/document/product/400/7572?from_cn_redirect=1">Tencent Cloud SSL</a>. This field is not required when clearing domain HTTPS configuration.</p>
    */
    @SerializedName("CertID")
    @Expose
    private String CertID;

    /**
     * Get <p>Domain name.</p> 
     * @return Domain <p>Domain name.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name.</p>
     * @param Domain <p>Domain name.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Operation type of this API call. Available values:</p><li>Set: certificate required for setting domain HTTPS;</li><li>Clear: clear domain HTTPS configuration. After clearance, the domain cannot support HTTPS access.</li> 
     * @return Operation <p>Operation type of this API call. Available values:</p><li>Set: certificate required for setting domain HTTPS;</li><li>Clear: clear domain HTTPS configuration. After clearance, the domain cannot support HTTPS access.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>Operation type of this API call. Available values:</p><li>Set: certificate required for setting domain HTTPS;</li><li>Clear: clear domain HTTPS configuration. After clearance, the domain cannot support HTTPS access.</li>
     * @param Operation <p>Operation type of this API call. Available values:</p><li>Set: certificate required for setting domain HTTPS;</li><li>Clear: clear domain HTTPS configuration. After clearance, the domain cannot support HTTPS access.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>ID of the certificate uploaded to <a href="https://www.tencentcloud.com/document/product/400/7572?from_cn_redirect=1">Tencent Cloud SSL</a>. This field is not required when clearing domain HTTPS configuration.</p> 
     * @return CertID <p>ID of the certificate uploaded to <a href="https://www.tencentcloud.com/document/product/400/7572?from_cn_redirect=1">Tencent Cloud SSL</a>. This field is not required when clearing domain HTTPS configuration.</p>
     */
    public String getCertID() {
        return this.CertID;
    }

    /**
     * Set <p>ID of the certificate uploaded to <a href="https://www.tencentcloud.com/document/product/400/7572?from_cn_redirect=1">Tencent Cloud SSL</a>. This field is not required when clearing domain HTTPS configuration.</p>
     * @param CertID <p>ID of the certificate uploaded to <a href="https://www.tencentcloud.com/document/product/400/7572?from_cn_redirect=1">Tencent Cloud SSL</a>. This field is not required when clearing domain HTTPS configuration.</p>
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

