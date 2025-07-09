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
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * The listener name.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Load balancer ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Network protocol
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Region
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * CLB instance IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * CLB instance type
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * Listener domain name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Load balancer domain name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
     * Get Listener ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ListenerId Listener ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ListenerId Listener ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get The listener name.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ListenerName The listener name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set The listener name.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ListenerName The listener name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Load balancer ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LoadBalancerId Load balancer ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Load balancer ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LoadBalancerId Load balancer ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB instance name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LoadBalancerName CLB instance name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LoadBalancerName CLB instance name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Network protocol
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Protocol Network protocol
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Network protocol
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Protocol Network protocol
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Region
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get CLB instance IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Vip CLB instance IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set CLB instance IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Vip CLB instance IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VPort Port
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Port
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VPort Port
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Availability zone
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Zone Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Zone Availability zone
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return NumericalVpcId VPC ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set VPC ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param NumericalVpcId VPC ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get CLB instance type
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LoadBalancerType CLB instance type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB instance type
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LoadBalancerType CLB instance type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get Listener domain name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Domain Listener domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Listener domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Domain Listener domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Load balancer domain name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LoadBalancerDomain Load balancer domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set Load balancer domain name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LoadBalancerDomain Load balancer domain name
Note: This field may return·null, indicating that no valid values can be obtained.
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

