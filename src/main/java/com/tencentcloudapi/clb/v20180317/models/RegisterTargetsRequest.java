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

public class RegisterTargetsRequest extends AbstractModel {

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
    * List of real servers to be bound. Array length limit: 20.
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * Forwarding rule ID. When binding a real server to a layer-7 forwarding rule, you must provide either this parameter or Domain+Url.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Target forwarding rule domain name. This parameter does not take effect if LocationId is specified.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Target forwarding rule URL. This parameter does not take effect if LocationId is specified.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

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
     * Get List of real servers to be bound. Array length limit: 20. 
     * @return Targets List of real servers to be bound. Array length limit: 20.
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of real servers to be bound. Array length limit: 20.
     * @param Targets List of real servers to be bound. Array length limit: 20.
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Forwarding rule ID. When binding a real server to a layer-7 forwarding rule, you must provide either this parameter or Domain+Url. 
     * @return LocationId Forwarding rule ID. When binding a real server to a layer-7 forwarding rule, you must provide either this parameter or Domain+Url.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID. When binding a real server to a layer-7 forwarding rule, you must provide either this parameter or Domain+Url.
     * @param LocationId Forwarding rule ID. When binding a real server to a layer-7 forwarding rule, you must provide either this parameter or Domain+Url.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Target forwarding rule domain name. This parameter does not take effect if LocationId is specified. 
     * @return Domain Target forwarding rule domain name. This parameter does not take effect if LocationId is specified.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Target forwarding rule domain name. This parameter does not take effect if LocationId is specified.
     * @param Domain Target forwarding rule domain name. This parameter does not take effect if LocationId is specified.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Target forwarding rule URL. This parameter does not take effect if LocationId is specified. 
     * @return Url Target forwarding rule URL. This parameter does not take effect if LocationId is specified.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Target forwarding rule URL. This parameter does not take effect if LocationId is specified.
     * @param Url Target forwarding rule URL. This parameter does not take effect if LocationId is specified.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public RegisterTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterTargetsRequest(RegisterTargetsRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Targets != null) {
            this.Targets = new Target[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Target(source.Targets[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

