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

public class CreateDDoSPolicyRequest extends AbstractModel{

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Protocol disablement, which must be entered, and the array length must be 1
    */
    @SerializedName("DropOptions")
    @Expose
    private DDoSPolicyDropOption [] DropOptions;

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Ports to be closed. If no ports are to be closed, enter an empty array
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
    * Watermarking policy parameters. Enter an empty array if the watermarking feature is not enabled. Only one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
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
     * Get Policy name 
     * @return Name Policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
     * @param Name Policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Ports to be closed. If no ports are to be closed, enter an empty array 
     * @return PortLimits Ports to be closed. If no ports are to be closed, enter an empty array
     */
    public DDoSPolicyPortLimit [] getPortLimits() {
        return this.PortLimits;
    }

    /**
     * Set Ports to be closed. If no ports are to be closed, enter an empty array
     * @param PortLimits Ports to be closed. If no ports are to be closed, enter an empty array
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
     * Get Watermarking policy parameters. Enter an empty array if the watermarking feature is not enabled. Only one watermarking policy can be passed in (that is, the size of the array cannot exceed 1) 
     * @return WaterPrint Watermarking policy parameters. Enter an empty array if the watermarking feature is not enabled. Only one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
     */
    public WaterPrintPolicy [] getWaterPrint() {
        return this.WaterPrint;
    }

    /**
     * Set Watermarking policy parameters. Enter an empty array if the watermarking feature is not enabled. Only one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
     * @param WaterPrint Watermarking policy parameters. Enter an empty array if the watermarking feature is not enabled. Only one watermarking policy can be passed in (that is, the size of the array cannot exceed 1)
     */
    public void setWaterPrint(WaterPrintPolicy [] WaterPrint) {
        this.WaterPrint = WaterPrint;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArrayObj(map, prefix + "DropOptions.", this.DropOptions);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "PortLimits.", this.PortLimits);
        this.setParamArrayObj(map, prefix + "IpAllowDenys.", this.IpAllowDenys);
        this.setParamArrayObj(map, prefix + "PacketFilters.", this.PacketFilters);
        this.setParamArrayObj(map, prefix + "WaterPrint.", this.WaterPrint);

    }
}
