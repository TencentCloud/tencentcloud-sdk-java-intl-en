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

public class AssociationItem extends AbstractModel{

    /**
    * ID of associated CLB instance
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * ID of associated listener
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * ID of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Protocol type of associated listener, such as HTTP or TCP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port of associated listener
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Domain name of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * URL of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * CLB instance name
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
     * Get ID of associated CLB instance 
     * @return LoadBalancerId ID of associated CLB instance
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of associated CLB instance
     * @param LoadBalancerId ID of associated CLB instance
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get ID of associated listener 
     * @return ListenerId ID of associated listener
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set ID of associated listener
     * @param ListenerId ID of associated listener
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get ID of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LocationId ID of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set ID of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LocationId ID of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Protocol type of associated listener, such as HTTP or TCP 
     * @return Protocol Protocol type of associated listener, such as HTTP or TCP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type of associated listener, such as HTTP or TCP
     * @param Protocol Protocol type of associated listener, such as HTTP or TCP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port of associated listener 
     * @return Port Port of associated listener
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port of associated listener
     * @param Port Port of associated listener
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Domain name of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get URL of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url URL of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url URL of associated forwarding rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
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
     * Get Listener name 
     * @return ListenerName Listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
     * @param ListenerName Listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    public AssociationItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociationItem(AssociationItem source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);

    }
}

