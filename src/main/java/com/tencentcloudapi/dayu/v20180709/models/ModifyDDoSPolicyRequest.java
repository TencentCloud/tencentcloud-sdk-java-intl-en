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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSPolicyRequest extends AbstractModel{

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Protocol disablement, which must be entered, and the array length must be 1
    */
    @SerializedName("DropOptions")
    @Expose
    private DDoSPolicyDropOption [] DropOptions;

    /**
    * Port disablement. If no ports are to be disabled, enter an empty array
    */
    @SerializedName("PortLimits")
    @Expose
    private DDoSPolicyPortLimit [] PortLimits;

    /**
    * IP blocklist/allowlist. Enter an empty array if there is no IP blocklist/allowlist
    */
    @SerializedName("IpAllowDenys")
    @Expose
    private IpBlackWhite [] IpAllowDenys;

    /**
    * Packet filter. Enter an empty array if there are no packets to filter
    */
    @SerializedName("PacketFilters")
    @Expose
    private DDoSPolicyPacketFilter [] PacketFilters;

    /**
    * Watermarking policy parameter. Enter an empty array if the watermarking feature is not enabled. At most one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
    */
    @SerializedName("WaterPrint")
    @Expose
    private WaterPrintPolicy [] WaterPrint;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Protocol disablement, which must be entered, and the array length must be 1 
     * @return DropOptions Protocol disablement, which must be entered, and the array length must be 1
     */
    public DDoSPolicyDropOption [] getDropOptions() {
        return this.DropOptions;
    }

    /**
     * Set Protocol disablement, which must be entered, and the array length must be 1
     * @param DropOptions Protocol disablement, which must be entered, and the array length must be 1
     */
    public void setDropOptions(DDoSPolicyDropOption [] DropOptions) {
        this.DropOptions = DropOptions;
    }

    /**
     * Get Port disablement. If no ports are to be disabled, enter an empty array 
     * @return PortLimits Port disablement. If no ports are to be disabled, enter an empty array
     */
    public DDoSPolicyPortLimit [] getPortLimits() {
        return this.PortLimits;
    }

    /**
     * Set Port disablement. If no ports are to be disabled, enter an empty array
     * @param PortLimits Port disablement. If no ports are to be disabled, enter an empty array
     */
    public void setPortLimits(DDoSPolicyPortLimit [] PortLimits) {
        this.PortLimits = PortLimits;
    }

    /**
     * Get IP blocklist/allowlist. Enter an empty array if there is no IP blocklist/allowlist 
     * @return IpAllowDenys IP blocklist/allowlist. Enter an empty array if there is no IP blocklist/allowlist
     */
    public IpBlackWhite [] getIpAllowDenys() {
        return this.IpAllowDenys;
    }

    /**
     * Set IP blocklist/allowlist. Enter an empty array if there is no IP blocklist/allowlist
     * @param IpAllowDenys IP blocklist/allowlist. Enter an empty array if there is no IP blocklist/allowlist
     */
    public void setIpAllowDenys(IpBlackWhite [] IpAllowDenys) {
        this.IpAllowDenys = IpAllowDenys;
    }

    /**
     * Get Packet filter. Enter an empty array if there are no packets to filter 
     * @return PacketFilters Packet filter. Enter an empty array if there are no packets to filter
     */
    public DDoSPolicyPacketFilter [] getPacketFilters() {
        return this.PacketFilters;
    }

    /**
     * Set Packet filter. Enter an empty array if there are no packets to filter
     * @param PacketFilters Packet filter. Enter an empty array if there are no packets to filter
     */
    public void setPacketFilters(DDoSPolicyPacketFilter [] PacketFilters) {
        this.PacketFilters = PacketFilters;
    }

    /**
     * Get Watermarking policy parameter. Enter an empty array if the watermarking feature is not enabled. At most one watermarking policy can be passed in (that is, the size of the array cannot exceed 1) 
     * @return WaterPrint Watermarking policy parameter. Enter an empty array if the watermarking feature is not enabled. At most one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
     */
    public WaterPrintPolicy [] getWaterPrint() {
        return this.WaterPrint;
    }

    /**
     * Set Watermarking policy parameter. Enter an empty array if the watermarking feature is not enabled. At most one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
     * @param WaterPrint Watermarking policy parameter. Enter an empty array if the watermarking feature is not enabled. At most one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
     */
    public void setWaterPrint(WaterPrintPolicy [] WaterPrint) {
        this.WaterPrint = WaterPrint;
    }

    public ModifyDDoSPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSPolicyRequest(ModifyDDoSPolicyRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.DropOptions != null) {
            this.DropOptions = new DDoSPolicyDropOption[source.DropOptions.length];
            for (int i = 0; i < source.DropOptions.length; i++) {
                this.DropOptions[i] = new DDoSPolicyDropOption(source.DropOptions[i]);
            }
        }
        if (source.PortLimits != null) {
            this.PortLimits = new DDoSPolicyPortLimit[source.PortLimits.length];
            for (int i = 0; i < source.PortLimits.length; i++) {
                this.PortLimits[i] = new DDoSPolicyPortLimit(source.PortLimits[i]);
            }
        }
        if (source.IpAllowDenys != null) {
            this.IpAllowDenys = new IpBlackWhite[source.IpAllowDenys.length];
            for (int i = 0; i < source.IpAllowDenys.length; i++) {
                this.IpAllowDenys[i] = new IpBlackWhite(source.IpAllowDenys[i]);
            }
        }
        if (source.PacketFilters != null) {
            this.PacketFilters = new DDoSPolicyPacketFilter[source.PacketFilters.length];
            for (int i = 0; i < source.PacketFilters.length; i++) {
                this.PacketFilters[i] = new DDoSPolicyPacketFilter(source.PacketFilters[i]);
            }
        }
        if (source.WaterPrint != null) {
            this.WaterPrint = new WaterPrintPolicy[source.WaterPrint.length];
            for (int i = 0; i < source.WaterPrint.length; i++) {
                this.WaterPrint[i] = new WaterPrintPolicy(source.WaterPrint[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArrayObj(map, prefix + "DropOptions.", this.DropOptions);
        this.setParamArrayObj(map, prefix + "PortLimits.", this.PortLimits);
        this.setParamArrayObj(map, prefix + "IpAllowDenys.", this.IpAllowDenys);
        this.setParamArrayObj(map, prefix + "PacketFilters.", this.PacketFilters);
        this.setParamArrayObj(map, prefix + "WaterPrint.", this.WaterPrint);

    }
}

