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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainData extends AbstractModel {

    /**
    * Domain ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Playback domain
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * CNAME record value
    */
    @SerializedName("InternalDomain")
    @Expose
    private String InternalDomain;

    /**
    * Whether to upload a certificate (0: No, 1: Yes)
    */
    @SerializedName("HaveCert")
    @Expose
    private Long HaveCert;

    /**
    * Service node ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Service node name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * User ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Certificate ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Domain type. 0: Pull streaming domain name; 1: Streaming domain
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get Domain ID 
     * @return Id Domain ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Domain ID
     * @param Id Domain ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Playback domain 
     * @return PlayDomain Playback domain
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set Playback domain
     * @param PlayDomain Playback domain
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get CNAME record value 
     * @return InternalDomain CNAME record value
     */
    public String getInternalDomain() {
        return this.InternalDomain;
    }

    /**
     * Set CNAME record value
     * @param InternalDomain CNAME record value
     */
    public void setInternalDomain(String InternalDomain) {
        this.InternalDomain = InternalDomain;
    }

    /**
     * Get Whether to upload a certificate (0: No, 1: Yes) 
     * @return HaveCert Whether to upload a certificate (0: No, 1: Yes)
     */
    public Long getHaveCert() {
        return this.HaveCert;
    }

    /**
     * Set Whether to upload a certificate (0: No, 1: Yes)
     * @param HaveCert Whether to upload a certificate (0: No, 1: Yes)
     */
    public void setHaveCert(Long HaveCert) {
        this.HaveCert = HaveCert;
    }

    /**
     * Get Service node ID 
     * @return ClusterId Service node ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Service node ID
     * @param ClusterId Service node ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Service node name 
     * @return ClusterName Service node name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Service node name
     * @param ClusterName Service node name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get User ID. 
     * @return AppId User ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID.
     * @param AppId User ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Certificate ID 
     * @return CertId Certificate ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID
     * @param CertId Certificate ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Domain type. 0: Pull streaming domain name; 1: Streaming domain 
     * @return DomainType Domain type. 0: Pull streaming domain name; 1: Streaming domain
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Domain type. 0: Pull streaming domain name; 1: Streaming domain
     * @param DomainType Domain type. 0: Pull streaming domain name; 1: Streaming domain
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    public DescribeDomainData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainData(DescribeDomainData source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.InternalDomain != null) {
            this.InternalDomain = new String(source.InternalDomain);
        }
        if (source.HaveCert != null) {
            this.HaveCert = new Long(source.HaveCert);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "InternalDomain", this.InternalDomain);
        this.setParamSimple(map, prefix + "HaveCert", this.HaveCert);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);

    }
}

