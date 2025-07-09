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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosPolicy extends AbstractModel {

    /**
    * Resource bound to policy
    */
    @SerializedName("Resources")
    @Expose
    private ResourceIp [] Resources;

    /**
    * Disabled protocol
    */
    @SerializedName("DropOptions")
    @Expose
    private DDoSPolicyDropOption DropOptions;

    /**
    * Disabled port
    */
    @SerializedName("PortLimits")
    @Expose
    private DDoSPolicyPortLimit [] PortLimits;

    /**
    * Packet filter
    */
    @SerializedName("PacketFilters")
    @Expose
    private DDoSPolicyPacketFilter [] PacketFilters;

    /**
    * IP blocklist/allowlist
    */
    @SerializedName("IpBlackWhiteLists")
    @Expose
    private IpBlackWhite [] IpBlackWhiteLists;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Watermarking policy parameter. There can be only one policy. If there are no policies, the array is empty
    */
    @SerializedName("WaterPrint")
    @Expose
    private WaterPrintPolicy [] WaterPrint;

    /**
    * Watermark key. There can be up to two keys. If there are no policies, the array is empty
    */
    @SerializedName("WaterKey")
    @Expose
    private WaterPrintKey [] WaterKey;

    /**
    * Resource instance bound to policy
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BoundResources")
    @Expose
    private String [] BoundResources;

    /**
    * Policy scenario
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
     * Get Resource bound to policy 
     * @return Resources Resource bound to policy
     */
    public ResourceIp [] getResources() {
        return this.Resources;
    }

    /**
     * Set Resource bound to policy
     * @param Resources Resource bound to policy
     */
    public void setResources(ResourceIp [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Disabled protocol 
     * @return DropOptions Disabled protocol
     */
    public DDoSPolicyDropOption getDropOptions() {
        return this.DropOptions;
    }

    /**
     * Set Disabled protocol
     * @param DropOptions Disabled protocol
     */
    public void setDropOptions(DDoSPolicyDropOption DropOptions) {
        this.DropOptions = DropOptions;
    }

    /**
     * Get Disabled port 
     * @return PortLimits Disabled port
     */
    public DDoSPolicyPortLimit [] getPortLimits() {
        return this.PortLimits;
    }

    /**
     * Set Disabled port
     * @param PortLimits Disabled port
     */
    public void setPortLimits(DDoSPolicyPortLimit [] PortLimits) {
        this.PortLimits = PortLimits;
    }

    /**
     * Get Packet filter 
     * @return PacketFilters Packet filter
     */
    public DDoSPolicyPacketFilter [] getPacketFilters() {
        return this.PacketFilters;
    }

    /**
     * Set Packet filter
     * @param PacketFilters Packet filter
     */
    public void setPacketFilters(DDoSPolicyPacketFilter [] PacketFilters) {
        this.PacketFilters = PacketFilters;
    }

    /**
     * Get IP blocklist/allowlist 
     * @return IpBlackWhiteLists IP blocklist/allowlist
     */
    public IpBlackWhite [] getIpBlackWhiteLists() {
        return this.IpBlackWhiteLists;
    }

    /**
     * Set IP blocklist/allowlist
     * @param IpBlackWhiteLists IP blocklist/allowlist
     */
    public void setIpBlackWhiteLists(IpBlackWhite [] IpBlackWhiteLists) {
        this.IpBlackWhiteLists = IpBlackWhiteLists;
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
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy creation time 
     * @return CreateTime Policy creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Policy creation time
     * @param CreateTime Policy creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Watermarking policy parameter. There can be only one policy. If there are no policies, the array is empty 
     * @return WaterPrint Watermarking policy parameter. There can be only one policy. If there are no policies, the array is empty
     */
    public WaterPrintPolicy [] getWaterPrint() {
        return this.WaterPrint;
    }

    /**
     * Set Watermarking policy parameter. There can be only one policy. If there are no policies, the array is empty
     * @param WaterPrint Watermarking policy parameter. There can be only one policy. If there are no policies, the array is empty
     */
    public void setWaterPrint(WaterPrintPolicy [] WaterPrint) {
        this.WaterPrint = WaterPrint;
    }

    /**
     * Get Watermark key. There can be up to two keys. If there are no policies, the array is empty 
     * @return WaterKey Watermark key. There can be up to two keys. If there are no policies, the array is empty
     */
    public WaterPrintKey [] getWaterKey() {
        return this.WaterKey;
    }

    /**
     * Set Watermark key. There can be up to two keys. If there are no policies, the array is empty
     * @param WaterKey Watermark key. There can be up to two keys. If there are no policies, the array is empty
     */
    public void setWaterKey(WaterPrintKey [] WaterKey) {
        this.WaterKey = WaterKey;
    }

    /**
     * Get Resource instance bound to policy
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BoundResources Resource instance bound to policy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBoundResources() {
        return this.BoundResources;
    }

    /**
     * Set Resource instance bound to policy
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BoundResources Resource instance bound to policy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBoundResources(String [] BoundResources) {
        this.BoundResources = BoundResources;
    }

    /**
     * Get Policy scenario
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SceneId Policy scenario
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set Policy scenario
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SceneId Policy scenario
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    public DDosPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosPolicy(DDosPolicy source) {
        if (source.Resources != null) {
            this.Resources = new ResourceIp[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceIp(source.Resources[i]);
            }
        }
        if (source.DropOptions != null) {
            this.DropOptions = new DDoSPolicyDropOption(source.DropOptions);
        }
        if (source.PortLimits != null) {
            this.PortLimits = new DDoSPolicyPortLimit[source.PortLimits.length];
            for (int i = 0; i < source.PortLimits.length; i++) {
                this.PortLimits[i] = new DDoSPolicyPortLimit(source.PortLimits[i]);
            }
        }
        if (source.PacketFilters != null) {
            this.PacketFilters = new DDoSPolicyPacketFilter[source.PacketFilters.length];
            for (int i = 0; i < source.PacketFilters.length; i++) {
                this.PacketFilters[i] = new DDoSPolicyPacketFilter(source.PacketFilters[i]);
            }
        }
        if (source.IpBlackWhiteLists != null) {
            this.IpBlackWhiteLists = new IpBlackWhite[source.IpBlackWhiteLists.length];
            for (int i = 0; i < source.IpBlackWhiteLists.length; i++) {
                this.IpBlackWhiteLists[i] = new IpBlackWhite(source.IpBlackWhiteLists[i]);
            }
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.WaterPrint != null) {
            this.WaterPrint = new WaterPrintPolicy[source.WaterPrint.length];
            for (int i = 0; i < source.WaterPrint.length; i++) {
                this.WaterPrint[i] = new WaterPrintPolicy(source.WaterPrint[i]);
            }
        }
        if (source.WaterKey != null) {
            this.WaterKey = new WaterPrintKey[source.WaterKey.length];
            for (int i = 0; i < source.WaterKey.length; i++) {
                this.WaterKey[i] = new WaterPrintKey(source.WaterKey[i]);
            }
        }
        if (source.BoundResources != null) {
            this.BoundResources = new String[source.BoundResources.length];
            for (int i = 0; i < source.BoundResources.length; i++) {
                this.BoundResources[i] = new String(source.BoundResources[i]);
            }
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "DropOptions.", this.DropOptions);
        this.setParamArrayObj(map, prefix + "PortLimits.", this.PortLimits);
        this.setParamArrayObj(map, prefix + "PacketFilters.", this.PacketFilters);
        this.setParamArrayObj(map, prefix + "IpBlackWhiteLists.", this.IpBlackWhiteLists);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "WaterPrint.", this.WaterPrint);
        this.setParamArrayObj(map, prefix + "WaterKey.", this.WaterKey);
        this.setParamArraySimple(map, prefix + "BoundResources.", this.BoundResources);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);

    }
}

