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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayRateLimitDetail extends AbstractModel {

    /**
    * Plug-in enable status
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * qps threshold
    */
    @SerializedName("QpsThresholds")
    @Expose
    private QpsThreshold [] QpsThresholds;

    /**
    * Request path that requires traffic control
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Request header Key for traffic control
    */
    @SerializedName("Header")
    @Expose
    private String Header;

    /**
    * Traffic throttling basis
ip service consumer credential path header
    */
    @SerializedName("LimitBy")
    @Expose
    private String LimitBy;

    /**
    * external redis configuration
    */
    @SerializedName("ExternalRedis")
    @Expose
    private ExternalRedis ExternalRedis;

    /**
    * redis configuration in global configuration
    */
    @SerializedName("GlobalConfigId")
    @Expose
    private String GlobalConfigId;

    /**
    * Counter policy 
local standalone
default redis
external redis

    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Response configuration, response policy is text

    */
    @SerializedName("RateLimitResponse")
    @Expose
    private RateLimitResponse RateLimitResponse;

    /**
    * Request forwarding address
    */
    @SerializedName("RateLimitResponseUrl")
    @Expose
    private String RateLimitResponseUrl;

    /**
    * response policy
url request forwarding
Response configuration
default mode: return directly.

    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * Whether to hide the traffic throttling client response header
    */
    @SerializedName("HideClientHeaders")
    @Expose
    private Boolean HideClientHeaders;

    /**
    * queuing time
    */
    @SerializedName("LineUpTime")
    @Expose
    private Long LineUpTime;

    /**
    * Whether request queuing is enabled
    */
    @SerializedName("IsDelay")
    @Expose
    private Boolean IsDelay;

    /**
    * Basic throttling
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BasicLimitQpsThresholds")
    @Expose
    private QpsThreshold [] BasicLimitQpsThresholds;

    /**
    * Parameter throttling policy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LimitRules")
    @Expose
    private LimitRule [] LimitRules;

    /**
     * Get Plug-in enable status 
     * @return Enabled Plug-in enable status
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Plug-in enable status
     * @param Enabled Plug-in enable status
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get qps threshold 
     * @return QpsThresholds qps threshold
     */
    public QpsThreshold [] getQpsThresholds() {
        return this.QpsThresholds;
    }

    /**
     * Set qps threshold
     * @param QpsThresholds qps threshold
     */
    public void setQpsThresholds(QpsThreshold [] QpsThresholds) {
        this.QpsThresholds = QpsThresholds;
    }

    /**
     * Get Request path that requires traffic control 
     * @return Path Request path that requires traffic control
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Request path that requires traffic control
     * @param Path Request path that requires traffic control
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Request header Key for traffic control 
     * @return Header Request header Key for traffic control
     */
    public String getHeader() {
        return this.Header;
    }

    /**
     * Set Request header Key for traffic control
     * @param Header Request header Key for traffic control
     */
    public void setHeader(String Header) {
        this.Header = Header;
    }

    /**
     * Get Traffic throttling basis
ip service consumer credential path header 
     * @return LimitBy Traffic throttling basis
ip service consumer credential path header
     */
    public String getLimitBy() {
        return this.LimitBy;
    }

    /**
     * Set Traffic throttling basis
ip service consumer credential path header
     * @param LimitBy Traffic throttling basis
ip service consumer credential path header
     */
    public void setLimitBy(String LimitBy) {
        this.LimitBy = LimitBy;
    }

    /**
     * Get external redis configuration 
     * @return ExternalRedis external redis configuration
     */
    public ExternalRedis getExternalRedis() {
        return this.ExternalRedis;
    }

    /**
     * Set external redis configuration
     * @param ExternalRedis external redis configuration
     */
    public void setExternalRedis(ExternalRedis ExternalRedis) {
        this.ExternalRedis = ExternalRedis;
    }

    /**
     * Get redis configuration in global configuration 
     * @return GlobalConfigId redis configuration in global configuration
     */
    public String getGlobalConfigId() {
        return this.GlobalConfigId;
    }

    /**
     * Set redis configuration in global configuration
     * @param GlobalConfigId redis configuration in global configuration
     */
    public void setGlobalConfigId(String GlobalConfigId) {
        this.GlobalConfigId = GlobalConfigId;
    }

    /**
     * Get Counter policy 
local standalone
default redis
external redis
 
     * @return Policy Counter policy 
local standalone
default redis
external redis

     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Counter policy 
local standalone
default redis
external redis

     * @param Policy Counter policy 
local standalone
default redis
external redis

     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Response configuration, response policy is text
 
     * @return RateLimitResponse Response configuration, response policy is text

     */
    public RateLimitResponse getRateLimitResponse() {
        return this.RateLimitResponse;
    }

    /**
     * Set Response configuration, response policy is text

     * @param RateLimitResponse Response configuration, response policy is text

     */
    public void setRateLimitResponse(RateLimitResponse RateLimitResponse) {
        this.RateLimitResponse = RateLimitResponse;
    }

    /**
     * Get Request forwarding address 
     * @return RateLimitResponseUrl Request forwarding address
     */
    public String getRateLimitResponseUrl() {
        return this.RateLimitResponseUrl;
    }

    /**
     * Set Request forwarding address
     * @param RateLimitResponseUrl Request forwarding address
     */
    public void setRateLimitResponseUrl(String RateLimitResponseUrl) {
        this.RateLimitResponseUrl = RateLimitResponseUrl;
    }

    /**
     * Get response policy
url request forwarding
Response configuration
default mode: return directly.
 
     * @return ResponseType response policy
url request forwarding
Response configuration
default mode: return directly.

     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set response policy
url request forwarding
Response configuration
default mode: return directly.

     * @param ResponseType response policy
url request forwarding
Response configuration
default mode: return directly.

     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get Whether to hide the traffic throttling client response header 
     * @return HideClientHeaders Whether to hide the traffic throttling client response header
     */
    public Boolean getHideClientHeaders() {
        return this.HideClientHeaders;
    }

    /**
     * Set Whether to hide the traffic throttling client response header
     * @param HideClientHeaders Whether to hide the traffic throttling client response header
     */
    public void setHideClientHeaders(Boolean HideClientHeaders) {
        this.HideClientHeaders = HideClientHeaders;
    }

    /**
     * Get queuing time 
     * @return LineUpTime queuing time
     */
    public Long getLineUpTime() {
        return this.LineUpTime;
    }

    /**
     * Set queuing time
     * @param LineUpTime queuing time
     */
    public void setLineUpTime(Long LineUpTime) {
        this.LineUpTime = LineUpTime;
    }

    /**
     * Get Whether request queuing is enabled 
     * @return IsDelay Whether request queuing is enabled
     */
    public Boolean getIsDelay() {
        return this.IsDelay;
    }

    /**
     * Set Whether request queuing is enabled
     * @param IsDelay Whether request queuing is enabled
     */
    public void setIsDelay(Boolean IsDelay) {
        this.IsDelay = IsDelay;
    }

    /**
     * Get Basic throttling
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BasicLimitQpsThresholds Basic throttling
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QpsThreshold [] getBasicLimitQpsThresholds() {
        return this.BasicLimitQpsThresholds;
    }

    /**
     * Set Basic throttling
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BasicLimitQpsThresholds Basic throttling
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBasicLimitQpsThresholds(QpsThreshold [] BasicLimitQpsThresholds) {
        this.BasicLimitQpsThresholds = BasicLimitQpsThresholds;
    }

    /**
     * Get Parameter throttling policy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LimitRules Parameter throttling policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LimitRule [] getLimitRules() {
        return this.LimitRules;
    }

    /**
     * Set Parameter throttling policy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LimitRules Parameter throttling policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLimitRules(LimitRule [] LimitRules) {
        this.LimitRules = LimitRules;
    }

    public CloudNativeAPIGatewayRateLimitDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayRateLimitDetail(CloudNativeAPIGatewayRateLimitDetail source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.QpsThresholds != null) {
            this.QpsThresholds = new QpsThreshold[source.QpsThresholds.length];
            for (int i = 0; i < source.QpsThresholds.length; i++) {
                this.QpsThresholds[i] = new QpsThreshold(source.QpsThresholds[i]);
            }
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Header != null) {
            this.Header = new String(source.Header);
        }
        if (source.LimitBy != null) {
            this.LimitBy = new String(source.LimitBy);
        }
        if (source.ExternalRedis != null) {
            this.ExternalRedis = new ExternalRedis(source.ExternalRedis);
        }
        if (source.GlobalConfigId != null) {
            this.GlobalConfigId = new String(source.GlobalConfigId);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.RateLimitResponse != null) {
            this.RateLimitResponse = new RateLimitResponse(source.RateLimitResponse);
        }
        if (source.RateLimitResponseUrl != null) {
            this.RateLimitResponseUrl = new String(source.RateLimitResponseUrl);
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.HideClientHeaders != null) {
            this.HideClientHeaders = new Boolean(source.HideClientHeaders);
        }
        if (source.LineUpTime != null) {
            this.LineUpTime = new Long(source.LineUpTime);
        }
        if (source.IsDelay != null) {
            this.IsDelay = new Boolean(source.IsDelay);
        }
        if (source.BasicLimitQpsThresholds != null) {
            this.BasicLimitQpsThresholds = new QpsThreshold[source.BasicLimitQpsThresholds.length];
            for (int i = 0; i < source.BasicLimitQpsThresholds.length; i++) {
                this.BasicLimitQpsThresholds[i] = new QpsThreshold(source.BasicLimitQpsThresholds[i]);
            }
        }
        if (source.LimitRules != null) {
            this.LimitRules = new LimitRule[source.LimitRules.length];
            for (int i = 0; i < source.LimitRules.length; i++) {
                this.LimitRules[i] = new LimitRule(source.LimitRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "QpsThresholds.", this.QpsThresholds);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Header", this.Header);
        this.setParamSimple(map, prefix + "LimitBy", this.LimitBy);
        this.setParamObj(map, prefix + "ExternalRedis.", this.ExternalRedis);
        this.setParamSimple(map, prefix + "GlobalConfigId", this.GlobalConfigId);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamObj(map, prefix + "RateLimitResponse.", this.RateLimitResponse);
        this.setParamSimple(map, prefix + "RateLimitResponseUrl", this.RateLimitResponseUrl);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "HideClientHeaders", this.HideClientHeaders);
        this.setParamSimple(map, prefix + "LineUpTime", this.LineUpTime);
        this.setParamSimple(map, prefix + "IsDelay", this.IsDelay);
        this.setParamArrayObj(map, prefix + "BasicLimitQpsThresholds.", this.BasicLimitQpsThresholds);
        this.setParamArrayObj(map, prefix + "LimitRules.", this.LimitRules);

    }
}

