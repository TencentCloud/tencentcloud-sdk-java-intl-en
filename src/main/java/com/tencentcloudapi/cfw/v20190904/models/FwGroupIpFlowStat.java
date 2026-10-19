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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FwGroupIpFlowStat extends AbstractModel {

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * VPCID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Peak traffic
    */
    @SerializedName("FlowMax")
    @Expose
    private Long FlowMax;

    /**
    * Average bandwidth
    */
    @SerializedName("FlowAvg")
    @Expose
    private Float FlowAvg;

    /**
    * Rate limiting status
    */
    @SerializedName("TcRuleStatus")
    @Expose
    private Long TcRuleStatus;

    /**
    * Firewall ID.
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * 0 IPV4 , 1 IPV6
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get VPCID 
     * @return VpcId VPCID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPCID
     * @param VpcId VPCID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name 
     * @return VpcName VPC name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
     * @param VpcName VPC name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Peak traffic 
     * @return FlowMax Peak traffic
     */
    public Long getFlowMax() {
        return this.FlowMax;
    }

    /**
     * Set Peak traffic
     * @param FlowMax Peak traffic
     */
    public void setFlowMax(Long FlowMax) {
        this.FlowMax = FlowMax;
    }

    /**
     * Get Average bandwidth 
     * @return FlowAvg Average bandwidth
     */
    public Float getFlowAvg() {
        return this.FlowAvg;
    }

    /**
     * Set Average bandwidth
     * @param FlowAvg Average bandwidth
     */
    public void setFlowAvg(Float FlowAvg) {
        this.FlowAvg = FlowAvg;
    }

    /**
     * Get Rate limiting status 
     * @return TcRuleStatus Rate limiting status
     */
    public Long getTcRuleStatus() {
        return this.TcRuleStatus;
    }

    /**
     * Set Rate limiting status
     * @param TcRuleStatus Rate limiting status
     */
    public void setTcRuleStatus(Long TcRuleStatus) {
        this.TcRuleStatus = TcRuleStatus;
    }

    /**
     * Get Firewall ID. 
     * @return FwInsId Firewall ID.
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set Firewall ID.
     * @param FwInsId Firewall ID.
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get 0 IPV4 , 1 IPV6 
     * @return IpVersion 0 IPV4 , 1 IPV6
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set 0 IPV4 , 1 IPV6
     * @param IpVersion 0 IPV4 , 1 IPV6
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    public FwGroupIpFlowStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwGroupIpFlowStat(FwGroupIpFlowStat source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.FlowMax != null) {
            this.FlowMax = new Long(source.FlowMax);
        }
        if (source.FlowAvg != null) {
            this.FlowAvg = new Float(source.FlowAvg);
        }
        if (source.TcRuleStatus != null) {
            this.TcRuleStatus = new Long(source.TcRuleStatus);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "FlowMax", this.FlowMax);
        this.setParamSimple(map, prefix + "FlowAvg", this.FlowAvg);
        this.setParamSimple(map, prefix + "TcRuleStatus", this.TcRuleStatus);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

