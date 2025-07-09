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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel {

    /**
    * CLB LD's ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB LD's Name
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * CLB Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Name of CLB Listener
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * IP of CLB Instance
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port of the CLB Instance
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * CLB LD's Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Listener Protocol, HTTP, HTTPS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Zone of the CLB Listener
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * CLB's VPC ID, -1 for public network, fill in the actual number for private network

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * CLB Network Type

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB Domain Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
     * Get CLB LD's ID 
     * @return LoadBalancerId CLB LD's ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB LD's ID
     * @param LoadBalancerId CLB LD's ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB LD's Name 
     * @return LoadBalancerName CLB LD's Name
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB LD's Name
     * @param LoadBalancerName CLB LD's Name
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get CLB Listener ID 
     * @return ListenerId CLB Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB Listener ID
     * @param ListenerId CLB Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Name of CLB Listener 
     * @return ListenerName Name of CLB Listener
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Name of CLB Listener
     * @param ListenerName Name of CLB Listener
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get IP of CLB Instance 
     * @return Vip IP of CLB Instance
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP of CLB Instance
     * @param Vip IP of CLB Instance
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port of the CLB Instance 
     * @return Vport Port of the CLB Instance
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Port of the CLB Instance
     * @param Vport Port of the CLB Instance
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get CLB LD's Region 
     * @return Region CLB LD's Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set CLB LD's Region
     * @param Region CLB LD's Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Listener Protocol, HTTP, HTTPS 
     * @return Protocol Listener Protocol, HTTP, HTTPS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener Protocol, HTTP, HTTPS
     * @param Protocol Listener Protocol, HTTP, HTTPS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Zone of the CLB Listener 
     * @return Zone Zone of the CLB Listener
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Zone of the CLB Listener
     * @param Zone Zone of the CLB Listener
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get CLB's VPC ID, -1 for public network, fill in the actual number for private network

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumericalVpcId CLB's VPC ID, -1 for public network, fill in the actual number for private network

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set CLB's VPC ID, -1 for public network, fill in the actual number for private network

Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumericalVpcId CLB's VPC ID, -1 for public network, fill in the actual number for private network

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get CLB Network Type

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerType CLB Network Type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB Network Type

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerType CLB Network Type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB Domain Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerDomain CLB Domain Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set CLB Domain Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerDomain CLB Domain Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);

    }
}

