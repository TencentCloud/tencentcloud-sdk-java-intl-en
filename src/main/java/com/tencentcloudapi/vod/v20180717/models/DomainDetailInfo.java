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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainDetailInfo extends AbstractModel{

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Acceleration region information
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AccelerateAreaInfos")
    @Expose
    private AccelerateAreaInfo [] AccelerateAreaInfos;

    /**
    * Deployment status. Valid values:
<li>Online</li>
<li>Deploying</li>
<li>Locked: you cannot change the deployment status of locked domain names</li>
    */
    @SerializedName("DeployStatus")
    @Expose
    private String DeployStatus;

    /**
    * HTTPS configuration information
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("HTTPSConfig")
    @Expose
    private DomainHTTPSConfig HTTPSConfig;

    /**
    * [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("UrlSignatureAuthPolicy")
    @Expose
    private UrlSignatureAuthPolicy UrlSignatureAuthPolicy;

    /**
    * [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("RefererAuthPolicy")
    @Expose
    private RefererAuthPolicy RefererAuthPolicy;

    /**
    * The time when the domain name was added in the VOD system
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get Acceleration region information
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AccelerateAreaInfos Acceleration region information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public AccelerateAreaInfo [] getAccelerateAreaInfos() {
        return this.AccelerateAreaInfos;
    }

    /**
     * Set Acceleration region information
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AccelerateAreaInfos Acceleration region information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAccelerateAreaInfos(AccelerateAreaInfo [] AccelerateAreaInfos) {
        this.AccelerateAreaInfos = AccelerateAreaInfos;
    }

    /**
     * Get Deployment status. Valid values:
<li>Online</li>
<li>Deploying</li>
<li>Locked: you cannot change the deployment status of locked domain names</li> 
     * @return DeployStatus Deployment status. Valid values:
<li>Online</li>
<li>Deploying</li>
<li>Locked: you cannot change the deployment status of locked domain names</li>
     */
    public String getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set Deployment status. Valid values:
<li>Online</li>
<li>Deploying</li>
<li>Locked: you cannot change the deployment status of locked domain names</li>
     * @param DeployStatus Deployment status. Valid values:
<li>Online</li>
<li>Deploying</li>
<li>Locked: you cannot change the deployment status of locked domain names</li>
     */
    public void setDeployStatus(String DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get HTTPS configuration information
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return HTTPSConfig HTTPS configuration information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public DomainHTTPSConfig getHTTPSConfig() {
        return this.HTTPSConfig;
    }

    /**
     * Set HTTPS configuration information
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param HTTPSConfig HTTPS configuration information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setHTTPSConfig(DomainHTTPSConfig HTTPSConfig) {
        this.HTTPSConfig = HTTPSConfig;
    }

    /**
     * Get [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986) configuration
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return UrlSignatureAuthPolicy [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public UrlSignatureAuthPolicy getUrlSignatureAuthPolicy() {
        return this.UrlSignatureAuthPolicy;
    }

    /**
     * Set [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param UrlSignatureAuthPolicy [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setUrlSignatureAuthPolicy(UrlSignatureAuthPolicy UrlSignatureAuthPolicy) {
        this.UrlSignatureAuthPolicy = UrlSignatureAuthPolicy;
    }

    /**
     * Get [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) configuration
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return RefererAuthPolicy [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public RefererAuthPolicy getRefererAuthPolicy() {
        return this.RefererAuthPolicy;
    }

    /**
     * Set [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param RefererAuthPolicy [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) configuration
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRefererAuthPolicy(RefererAuthPolicy RefererAuthPolicy) {
        this.RefererAuthPolicy = RefererAuthPolicy;
    }

    /**
     * Get The time when the domain name was added in the VOD system
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li> 
     * @return CreateTime The time when the domain name was added in the VOD system
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the domain name was added in the VOD system
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
     * @param CreateTime The time when the domain name was added in the VOD system
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DomainDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainDetailInfo(DomainDetailInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AccelerateAreaInfos != null) {
            this.AccelerateAreaInfos = new AccelerateAreaInfo[source.AccelerateAreaInfos.length];
            for (int i = 0; i < source.AccelerateAreaInfos.length; i++) {
                this.AccelerateAreaInfos[i] = new AccelerateAreaInfo(source.AccelerateAreaInfos[i]);
            }
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new String(source.DeployStatus);
        }
        if (source.HTTPSConfig != null) {
            this.HTTPSConfig = new DomainHTTPSConfig(source.HTTPSConfig);
        }
        if (source.UrlSignatureAuthPolicy != null) {
            this.UrlSignatureAuthPolicy = new UrlSignatureAuthPolicy(source.UrlSignatureAuthPolicy);
        }
        if (source.RefererAuthPolicy != null) {
            this.RefererAuthPolicy = new RefererAuthPolicy(source.RefererAuthPolicy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "AccelerateAreaInfos.", this.AccelerateAreaInfos);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamObj(map, prefix + "HTTPSConfig.", this.HTTPSConfig);
        this.setParamObj(map, prefix + "UrlSignatureAuthPolicy.", this.UrlSignatureAuthPolicy);
        this.setParamObj(map, prefix + "RefererAuthPolicy.", this.RefererAuthPolicy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

