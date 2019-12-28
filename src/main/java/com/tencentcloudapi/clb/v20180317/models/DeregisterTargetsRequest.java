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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeregisterTargetsRequest extends AbstractModel{

    /**
    * CLB instance ID in the format of lb-12345678
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Listener ID in the format of lbl-12345678
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * List of real servers to be unbound. Array length limit: 20
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * Forwarding rule ID in the format of loc-12345678. When unbinding a server from a layer-7 forwarding rule, you must provide either this parameter or Domain+Url
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Target rule domain name. This parameter does not take effect if LocationId is specified
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Target rule URL. This parameter does not take effect if LocationId is specified
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get CLB instance ID in the format of lb-12345678 
     * @return LoadBalancerId CLB instance ID in the format of lb-12345678
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID in the format of lb-12345678
     * @param LoadBalancerId CLB instance ID in the format of lb-12345678
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Listener ID in the format of lbl-12345678 
     * @return ListenerId Listener ID in the format of lbl-12345678
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID in the format of lbl-12345678
     * @param ListenerId Listener ID in the format of lbl-12345678
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get List of real servers to be unbound. Array length limit: 20 
     * @return Targets List of real servers to be unbound. Array length limit: 20
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of real servers to be unbound. Array length limit: 20
     * @param Targets List of real servers to be unbound. Array length limit: 20
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Forwarding rule ID in the format of loc-12345678. When unbinding a server from a layer-7 forwarding rule, you must provide either this parameter or Domain+Url 
     * @return LocationId Forwarding rule ID in the format of loc-12345678. When unbinding a server from a layer-7 forwarding rule, you must provide either this parameter or Domain+Url
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID in the format of loc-12345678. When unbinding a server from a layer-7 forwarding rule, you must provide either this parameter or Domain+Url
     * @param LocationId Forwarding rule ID in the format of loc-12345678. When unbinding a server from a layer-7 forwarding rule, you must provide either this parameter or Domain+Url
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Target rule domain name. This parameter does not take effect if LocationId is specified 
     * @return Domain Target rule domain name. This parameter does not take effect if LocationId is specified
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Target rule domain name. This parameter does not take effect if LocationId is specified
     * @param Domain Target rule domain name. This parameter does not take effect if LocationId is specified
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Target rule URL. This parameter does not take effect if LocationId is specified 
     * @return Url Target rule URL. This parameter does not take effect if LocationId is specified
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Target rule URL. This parameter does not take effect if LocationId is specified
     * @param Url Target rule URL. This parameter does not take effect if LocationId is specified
     */
    public void setUrl(String Url) {
        this.Url = Url;
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

