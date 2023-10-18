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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSLStatusResponse extends AbstractModel {

    /**
    * Download address for SSL certificate
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
    * Whether the SSL is enabled for the identified instance.
- `true`: Enabled
- `false`: Disabled
    */
    @SerializedName("SSLConfig")
    @Expose
    private Boolean SSLConfig;

    /**
    * Whether SSL is supported for the identified instance.
-`true`: Supported
-`false`: Not supported
    */
    @SerializedName("FeatureSupport")
    @Expose
    private Boolean FeatureSupport;

    /**
    * Status of SSL configuration
- `1`: Configuring
- `2`: Configured successfully
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
     * Get Download address for SSL certificate 
     * @return CertDownloadUrl Download address for SSL certificate
     */
    public String getCertDownloadUrl() {
        return this.CertDownloadUrl;
    }

    /**
     * Set Download address for SSL certificate
     * @param CertDownloadUrl Download address for SSL certificate
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
     * Get Whether the SSL is enabled for the identified instance.
- `true`: Enabled
- `false`: Disabled 
     * @return SSLConfig Whether the SSL is enabled for the identified instance.
- `true`: Enabled
- `false`: Disabled
     */
    public Boolean getSSLConfig() {
        return this.SSLConfig;
    }

    /**
     * Set Whether the SSL is enabled for the identified instance.
- `true`: Enabled
- `false`: Disabled
     * @param SSLConfig Whether the SSL is enabled for the identified instance.
- `true`: Enabled
- `false`: Disabled
     */
    public void setSSLConfig(Boolean SSLConfig) {
        this.SSLConfig = SSLConfig;
    }

    /**
     * Get Whether SSL is supported for the identified instance.
-`true`: Supported
-`false`: Not supported 
     * @return FeatureSupport Whether SSL is supported for the identified instance.
-`true`: Supported
-`false`: Not supported
     */
    public Boolean getFeatureSupport() {
        return this.FeatureSupport;
    }

    /**
     * Set Whether SSL is supported for the identified instance.
-`true`: Supported
-`false`: Not supported
     * @param FeatureSupport Whether SSL is supported for the identified instance.
-`true`: Supported
-`false`: Not supported
     */
    public void setFeatureSupport(Boolean FeatureSupport) {
        this.FeatureSupport = FeatureSupport;
    }

    /**
     * Get Status of SSL configuration
- `1`: Configuring
- `2`: Configured successfully 
     * @return Status Status of SSL configuration
- `1`: Configuring
- `2`: Configured successfully
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of SSL configuration
- `1`: Configuring
- `2`: Configured successfully
     * @param Status Status of SSL configuration
- `1`: Configuring
- `2`: Configured successfully
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

