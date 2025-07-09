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

public class BindDetailItem extends AbstractModel {

    /**
    * Specifies the ID of CLB to be bound
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Specifies the ID of listener to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Specifies the domain name to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Sets the bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Listener name.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * URL of the location.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Configuration ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
     * Get Specifies the ID of CLB to be bound 
     * @return LoadBalancerId Specifies the ID of CLB to be bound
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Specifies the ID of CLB to be bound
     * @param LoadBalancerId Specifies the ID of CLB to be bound
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Specifies the ID of listener to be bound
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ListenerId Specifies the ID of listener to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Specifies the ID of listener to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ListenerId Specifies the ID of listener to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Specifies the domain name to be bound
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Domain Specifies the domain name to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Specifies the domain name to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Domain Specifies the domain name to be bound
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Sets the bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LocationId Sets the bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Sets the bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LocationId Sets the bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Listener name.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ListenerName Listener name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ListenerName Listener name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener protocol.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Protocol Listener protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Protocol Listener protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Vport Listener port.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Listener port.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Vport Listener port.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get URL of the location.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Url URL of the location.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of the location.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Url URL of the location.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Configuration ID.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UconfigId Configuration ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set Configuration ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UconfigId Configuration ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    public BindDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDetailItem(BindDetailItem source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);

    }
}

