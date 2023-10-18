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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdleLoadBalancer extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * CLB instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * CLB instance VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * The reason why the load balancer is considered idle. `NO_RULES`: No rules configured. `NO_RS`: The rules are not associated with servers.
    */
    @SerializedName("IdleReason")
    @Expose
    private String IdleReason;

    /**
    * CLB instance status, including:
`0`: Creating; `1`: Running.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CLB type. Value range: `1` (CLB); `0` (classic CLB).
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * The load balancing hostname.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
     * Get CLB instance name 
     * @return LoadBalancerName CLB instance name
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name
     * @param LoadBalancerName CLB instance name
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get CLB instance region 
     * @return Region CLB instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set CLB instance region
     * @param Region CLB instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get CLB instance VIP 
     * @return Vip CLB instance VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set CLB instance VIP
     * @param Vip CLB instance VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get The reason why the load balancer is considered idle. `NO_RULES`: No rules configured. `NO_RS`: The rules are not associated with servers. 
     * @return IdleReason The reason why the load balancer is considered idle. `NO_RULES`: No rules configured. `NO_RS`: The rules are not associated with servers.
     */
    public String getIdleReason() {
        return this.IdleReason;
    }

    /**
     * Set The reason why the load balancer is considered idle. `NO_RULES`: No rules configured. `NO_RS`: The rules are not associated with servers.
     * @param IdleReason The reason why the load balancer is considered idle. `NO_RULES`: No rules configured. `NO_RS`: The rules are not associated with servers.
     */
    public void setIdleReason(String IdleReason) {
        this.IdleReason = IdleReason;
    }

    /**
     * Get CLB instance status, including:
`0`: Creating; `1`: Running. 
     * @return Status CLB instance status, including:
`0`: Creating; `1`: Running.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set CLB instance status, including:
`0`: Creating; `1`: Running.
     * @param Status CLB instance status, including:
`0`: Creating; `1`: Running.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CLB type. Value range: `1` (CLB); `0` (classic CLB). 
     * @return Forward CLB type. Value range: `1` (CLB); `0` (classic CLB).
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set CLB type. Value range: `1` (CLB); `0` (classic CLB).
     * @param Forward CLB type. Value range: `1` (CLB); `0` (classic CLB).
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get The load balancing hostname.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Domain The load balancing hostname.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The load balancing hostname.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Domain The load balancing hostname.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public IdleLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdleLoadBalancer(IdleLoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.IdleReason != null) {
            this.IdleReason = new String(source.IdleReason);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "IdleReason", this.IdleReason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

