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

public class DomainDetailInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 
    */
    @SerializedName("AccelerateAreaInfos")
    @Expose
    private AccelerateAreaInfo [] AccelerateAreaInfos;

    /**
    * 
    */
    @SerializedName("DeployStatus")
    @Expose
    private String DeployStatus;

    /**
    * 
    */
    @SerializedName("HTTPSConfig")
    @Expose
    private DomainHTTPSConfig HTTPSConfig;

    /**
    * 
    */
    @SerializedName("UrlSignatureAuthPolicy")
    @Expose
    private UrlSignatureAuthPolicy UrlSignatureAuthPolicy;

    /**
    * 
    */
    @SerializedName("RefererAuthPolicy")
    @Expose
    private RefererAuthPolicy RefererAuthPolicy;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("QUICConfig")
    @Expose
    private DomainQUICConfig QUICConfig;

    /**
    * 
    */
    @SerializedName("IPFilterPolicy")
    @Expose
    private IPFilterPolicy IPFilterPolicy;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get  
     * @return Domain 
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 
     * @param Domain 
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get  
     * @return AccelerateAreaInfos 
     */
    public AccelerateAreaInfo [] getAccelerateAreaInfos() {
        return this.AccelerateAreaInfos;
    }

    /**
     * Set 
     * @param AccelerateAreaInfos 
     */
    public void setAccelerateAreaInfos(AccelerateAreaInfo [] AccelerateAreaInfos) {
        this.AccelerateAreaInfos = AccelerateAreaInfos;
    }

    /**
     * Get  
     * @return DeployStatus 
     */
    public String getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set 
     * @param DeployStatus 
     */
    public void setDeployStatus(String DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get  
     * @return HTTPSConfig 
     */
    public DomainHTTPSConfig getHTTPSConfig() {
        return this.HTTPSConfig;
    }

    /**
     * Set 
     * @param HTTPSConfig 
     */
    public void setHTTPSConfig(DomainHTTPSConfig HTTPSConfig) {
        this.HTTPSConfig = HTTPSConfig;
    }

    /**
     * Get  
     * @return UrlSignatureAuthPolicy 
     */
    public UrlSignatureAuthPolicy getUrlSignatureAuthPolicy() {
        return this.UrlSignatureAuthPolicy;
    }

    /**
     * Set 
     * @param UrlSignatureAuthPolicy 
     */
    public void setUrlSignatureAuthPolicy(UrlSignatureAuthPolicy UrlSignatureAuthPolicy) {
        this.UrlSignatureAuthPolicy = UrlSignatureAuthPolicy;
    }

    /**
     * Get  
     * @return RefererAuthPolicy 
     */
    public RefererAuthPolicy getRefererAuthPolicy() {
        return this.RefererAuthPolicy;
    }

    /**
     * Set 
     * @param RefererAuthPolicy 
     */
    public void setRefererAuthPolicy(RefererAuthPolicy RefererAuthPolicy) {
        this.RefererAuthPolicy = RefererAuthPolicy;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return QUICConfig 
     */
    public DomainQUICConfig getQUICConfig() {
        return this.QUICConfig;
    }

    /**
     * Set 
     * @param QUICConfig 
     */
    public void setQUICConfig(DomainQUICConfig QUICConfig) {
        this.QUICConfig = QUICConfig;
    }

    /**
     * Get  
     * @return IPFilterPolicy 
     */
    public IPFilterPolicy getIPFilterPolicy() {
        return this.IPFilterPolicy;
    }

    /**
     * Set 
     * @param IPFilterPolicy 
     */
    public void setIPFilterPolicy(IPFilterPolicy IPFilterPolicy) {
        this.IPFilterPolicy = IPFilterPolicy;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
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
        if (source.QUICConfig != null) {
            this.QUICConfig = new DomainQUICConfig(source.QUICConfig);
        }
        if (source.IPFilterPolicy != null) {
            this.IPFilterPolicy = new IPFilterPolicy(source.IPFilterPolicy);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamObj(map, prefix + "QUICConfig.", this.QUICConfig);
        this.setParamObj(map, prefix + "IPFilterPolicy.", this.IPFilterPolicy);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

