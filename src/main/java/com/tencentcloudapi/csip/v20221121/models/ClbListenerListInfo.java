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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbListenerListInfo extends AbstractModel {

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * CLB Id
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB name
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Load balancing ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Region.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC id
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * CLB Type
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * Listener Domain Name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * CLB domain name
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get listener name 
     * @return ListenerName listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set listener name
     * @param ListenerName listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get CLB Id 
     * @return LoadBalancerId CLB Id
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB Id
     * @param LoadBalancerId CLB Id
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB name 
     * @return LoadBalancerName CLB name
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB name
     * @param LoadBalancerName CLB name
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Load balancing ip 
     * @return Vip Load balancing ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Load balancing ip
     * @param Vip Load balancing ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port. 
     * @return VPort Port.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Port.
     * @param VPort Port.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Region. 
     * @return Zone Region.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region.
     * @param Zone Region.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC id 
     * @return NumericalVpcId VPC id
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set VPC id
     * @param NumericalVpcId VPC id
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get CLB Type 
     * @return LoadBalancerType CLB Type
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB Type
     * @param LoadBalancerType CLB Type
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get Listener Domain Name 
     * @return Domain Listener Domain Name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Listener Domain Name
     * @param Domain Listener Domain Name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get CLB domain name 
     * @return LoadBalancerDomain CLB domain name
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set CLB domain name
     * @param LoadBalancerDomain CLB domain name
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    public ClbListenerListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListenerListInfo(ClbListenerListInfo source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
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
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);

    }
}

