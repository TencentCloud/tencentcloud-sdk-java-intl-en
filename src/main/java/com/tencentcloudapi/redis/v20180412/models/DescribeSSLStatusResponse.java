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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSLStatusResponse extends AbstractModel{

    /**
    * Certificate download address
    */
    @SerializedName("CertDownloadUrl")
    @Expose
    private String CertDownloadUrl;

    /**
    * Expiration time of the certificate download address
    */
    @SerializedName("UrlExpiredTime")
    @Expose
    private String UrlExpiredTime;

    /**
    * SSL configuration status of an instance. Valid values: `true` (enable), `false` (disable).
    */
    @SerializedName("SSLConfig")
    @Expose
    private Boolean SSLConfig;

    /**
    * Whether the instance supports SSL. Valid values: `true` (Yes. When minor version is upgraded.), `false` (No).
    */
    @SerializedName("FeatureSupport")
    @Expose
    private Boolean FeatureSupport;

    /**
    * SSL configuration status. Valid values: `1`(Configuring), `2` (Configured).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Certificate download address 
     * @return CertDownloadUrl Certificate download address
     */
    public String getCertDownloadUrl() {
        return this.CertDownloadUrl;
    }

    /**
     * Set Certificate download address
     * @param CertDownloadUrl Certificate download address
     */
    public void setCertDownloadUrl(String CertDownloadUrl) {
        this.CertDownloadUrl = CertDownloadUrl;
    }

    /**
     * Get Expiration time of the certificate download address 
     * @return UrlExpiredTime Expiration time of the certificate download address
     */
    public String getUrlExpiredTime() {
        return this.UrlExpiredTime;
    }

    /**
     * Set Expiration time of the certificate download address
     * @param UrlExpiredTime Expiration time of the certificate download address
     */
    public void setUrlExpiredTime(String UrlExpiredTime) {
        this.UrlExpiredTime = UrlExpiredTime;
    }

    /**
     * Get SSL configuration status of an instance. Valid values: `true` (enable), `false` (disable). 
     * @return SSLConfig SSL configuration status of an instance. Valid values: `true` (enable), `false` (disable).
     */
    public Boolean getSSLConfig() {
        return this.SSLConfig;
    }

    /**
     * Set SSL configuration status of an instance. Valid values: `true` (enable), `false` (disable).
     * @param SSLConfig SSL configuration status of an instance. Valid values: `true` (enable), `false` (disable).
     */
    public void setSSLConfig(Boolean SSLConfig) {
        this.SSLConfig = SSLConfig;
    }

    /**
     * Get Whether the instance supports SSL. Valid values: `true` (Yes. When minor version is upgraded.), `false` (No). 
     * @return FeatureSupport Whether the instance supports SSL. Valid values: `true` (Yes. When minor version is upgraded.), `false` (No).
     */
    public Boolean getFeatureSupport() {
        return this.FeatureSupport;
    }

    /**
     * Set Whether the instance supports SSL. Valid values: `true` (Yes. When minor version is upgraded.), `false` (No).
     * @param FeatureSupport Whether the instance supports SSL. Valid values: `true` (Yes. When minor version is upgraded.), `false` (No).
     */
    public void setFeatureSupport(Boolean FeatureSupport) {
        this.FeatureSupport = FeatureSupport;
    }

    /**
     * Get SSL configuration status. Valid values: `1`(Configuring), `2` (Configured). 
     * @return Status SSL configuration status. Valid values: `1`(Configuring), `2` (Configured).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set SSL configuration status. Valid values: `1`(Configuring), `2` (Configured).
     * @param Status SSL configuration status. Valid values: `1`(Configuring), `2` (Configured).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSSLStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSSLStatusResponse(DescribeSSLStatusResponse source) {
        if (source.CertDownloadUrl != null) {
            this.CertDownloadUrl = new String(source.CertDownloadUrl);
        }
        if (source.UrlExpiredTime != null) {
            this.UrlExpiredTime = new String(source.UrlExpiredTime);
        }
        if (source.SSLConfig != null) {
            this.SSLConfig = new Boolean(source.SSLConfig);
        }
        if (source.FeatureSupport != null) {
            this.FeatureSupport = new Boolean(source.FeatureSupport);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertDownloadUrl", this.CertDownloadUrl);
        this.setParamSimple(map, prefix + "UrlExpiredTime", this.UrlExpiredTime);
        this.setParamSimple(map, prefix + "SSLConfig", this.SSLConfig);
        this.setParamSimple(map, prefix + "FeatureSupport", this.FeatureSupport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

