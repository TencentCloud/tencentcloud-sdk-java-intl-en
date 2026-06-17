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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDetailItem extends AbstractModel {

    /**
    * ID of the CLB instance bound to the configuration
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * ID of the listener bound to the configuration
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name bound to the configuration
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule bound to the configuration
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Listener name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener protocol
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Location URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Configuration ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
     * Get ID of the CLB instance bound to the configuration 
     * @return LoadBalancerId ID of the CLB instance bound to the configuration
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance bound to the configuration
     * @param LoadBalancerId ID of the CLB instance bound to the configuration
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get ID of the listener bound to the configuration 
     * @return ListenerId ID of the listener bound to the configuration
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set ID of the listener bound to the configuration
     * @param ListenerId ID of the listener bound to the configuration
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name bound to the configuration 
     * @return Domain Domain name bound to the configuration
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name bound to the configuration
     * @param Domain Domain name bound to the configuration
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Rule bound to the configuration 
     * @return LocationId Rule bound to the configuration
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Rule bound to the configuration
     * @param LocationId Rule bound to the configuration
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Listener name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ListenerName Listener name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ListenerName Listener name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener protocol
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Listener protocol
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Listener protocol
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vport Listener port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Listener port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vport Listener port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Location URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Location URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Location URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Location URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Configuration ID 
     * @return ConfigId Configuration ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Configuration ID
     * @param ConfigId Configuration ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
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
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
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
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);

    }
}

