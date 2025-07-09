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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleRequest extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * ID of the forwarding rule to be modified.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * New forwarding path of the forwarding rule. This parameter is not required if the URL does not need to be modified.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Health check information
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Session persistence duration, in seconds. Value range: 0 or 30-86400.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Forwarding protocol between a CLB instance and the real server. Default value: HTTP. Valid values: HTTP, HTTPS, GRPC. This parameter is valid only for HTTPS listeners.
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * TRPC callee server route, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * TRPC calling service API, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
    * OAuth configuration information.
    */
    @SerializedName("OAuth")
    @Expose
    private OAuth OAuth;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB listener ID 
     * @return ListenerId CLB listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID
     * @param ListenerId CLB listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get ID of the forwarding rule to be modified. 
     * @return LocationId ID of the forwarding rule to be modified.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set ID of the forwarding rule to be modified.
     * @param LocationId ID of the forwarding rule to be modified.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get New forwarding path of the forwarding rule. This parameter is not required if the URL does not need to be modified. 
     * @return Url New forwarding path of the forwarding rule. This parameter is not required if the URL does not need to be modified.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set New forwarding path of the forwarding rule. This parameter is not required if the URL does not need to be modified.
     * @param Url New forwarding path of the forwarding rule. This parameter is not required if the URL does not need to be modified.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Health check information 
     * @return HealthCheck Health check information
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check information
     * @param HealthCheck Health check information
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR. 
     * @return Scheduler Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
     * @param Scheduler Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Session persistence duration, in seconds. Value range: 0 or 30-86400. 
     * @return SessionExpireTime Session persistence duration, in seconds. Value range: 0 or 30-86400.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence duration, in seconds. Value range: 0 or 30-86400.
     * @param SessionExpireTime Session persistence duration, in seconds. Value range: 0 or 30-86400.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Forwarding protocol between a CLB instance and the real server. Default value: HTTP. Valid values: HTTP, HTTPS, GRPC. This parameter is valid only for HTTPS listeners. 
     * @return ForwardType Forwarding protocol between a CLB instance and the real server. Default value: HTTP. Valid values: HTTP, HTTPS, GRPC. This parameter is valid only for HTTPS listeners.
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set Forwarding protocol between a CLB instance and the real server. Default value: HTTP. Valid values: HTTP, HTTPS, GRPC. This parameter is valid only for HTTPS listeners.
     * @param ForwardType Forwarding protocol between a CLB instance and the real server. Default value: HTTP. Valid values: HTTP, HTTPS, GRPC. This parameter is valid only for HTTPS listeners.
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * Get TRPC callee server route, which is required when `ForwardType` is "TRPC". This is now only for internal usage. 
     * @return TrpcCallee TRPC callee server route, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
     */
    public String getTrpcCallee() {
        return this.TrpcCallee;
    }

    /**
     * Set TRPC callee server route, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
     * @param TrpcCallee TRPC callee server route, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
     */
    public void setTrpcCallee(String TrpcCallee) {
        this.TrpcCallee = TrpcCallee;
    }

    /**
     * Get TRPC calling service API, which is required when `ForwardType` is "TRPC". This is now only for internal usage. 
     * @return TrpcFunc TRPC calling service API, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set TRPC calling service API, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
     * @param TrpcFunc TRPC calling service API, which is required when `ForwardType` is "TRPC". This is now only for internal usage.
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Get OAuth configuration information. 
     * @return OAuth OAuth configuration information.
     */
    public OAuth getOAuth() {
        return this.OAuth;
    }

    /**
     * Set OAuth configuration information.
     * @param OAuth OAuth configuration information.
     */
    public void setOAuth(OAuth OAuth) {
        this.OAuth = OAuth;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.ForwardType != null) {
            this.ForwardType = new String(source.ForwardType);
        }
        if (source.TrpcCallee != null) {
            this.TrpcCallee = new String(source.TrpcCallee);
        }
        if (source.TrpcFunc != null) {
            this.TrpcFunc = new String(source.TrpcFunc);
        }
        if (source.OAuth != null) {
            this.OAuth = new OAuth(source.OAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);
        this.setParamSimple(map, prefix + "TrpcCallee", this.TrpcCallee);
        this.setParamSimple(map, prefix + "TrpcFunc", this.TrpcFunc);
        this.setParamObj(map, prefix + "OAuth.", this.OAuth);

    }
}

