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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4RuleEntry extends AbstractModel {

    /**
    * Forwarding protocol. Valid values: [TCP, UDP]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Forwarding port
    */
    @SerializedName("VirtualPort")
    @Expose
    private Long VirtualPort;

    /**
    * Real server port
    */
    @SerializedName("SourcePort")
    @Expose
    private Long SourcePort;

    /**
    * Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Session persistence duration in seconds
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * Forward list
    */
    @SerializedName("SourceList")
    @Expose
    private L4RuleSource [] SourceList;

    /**
    * Load balancing method. Valid values: [1 (weighted round robin), 2 (source IP hash)]
    */
    @SerializedName("LbType")
    @Expose
    private Long LbType;

    /**
    * Session persistence status. Valid values: [0 (disabled), 1 (enabled)];
    */
    @SerializedName("KeepEnable")
    @Expose
    private Long KeepEnable;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule description
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Watermark removal status. Valid values: [0 (disabled), 1 (enabled)]
    */
    @SerializedName("RemoveSwitch")
    @Expose
    private Long RemoveSwitch;

    /**
     * Get Forwarding protocol. Valid values: [TCP, UDP] 
     * @return Protocol Forwarding protocol. Valid values: [TCP, UDP]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol. Valid values: [TCP, UDP]
     * @param Protocol Forwarding protocol. Valid values: [TCP, UDP]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Forwarding port 
     * @return VirtualPort Forwarding port
     */
    public Long getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set Forwarding port
     * @param VirtualPort Forwarding port
     */
    public void setVirtualPort(Long VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    /**
     * Get Real server port 
     * @return SourcePort Real server port
     */
    public Long getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set Real server port
     * @param SourcePort Real server port
     */
    public void setSourcePort(Long SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)] 
     * @return SourceType Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
     * @param SourceType Forwarding method. Valid values: [1 (forwarding via domain name), 2 (forwarding via IP)]
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Session persistence duration in seconds 
     * @return KeepTime Session persistence duration in seconds
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set Session persistence duration in seconds
     * @param KeepTime Session persistence duration in seconds
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Get Forward list 
     * @return SourceList Forward list
     */
    public L4RuleSource [] getSourceList() {
        return this.SourceList;
    }

    /**
     * Set Forward list
     * @param SourceList Forward list
     */
    public void setSourceList(L4RuleSource [] SourceList) {
        this.SourceList = SourceList;
    }

    /**
     * Get Load balancing method. Valid values: [1 (weighted round robin), 2 (source IP hash)] 
     * @return LbType Load balancing method. Valid values: [1 (weighted round robin), 2 (source IP hash)]
     */
    public Long getLbType() {
        return this.LbType;
    }

    /**
     * Set Load balancing method. Valid values: [1 (weighted round robin), 2 (source IP hash)]
     * @param LbType Load balancing method. Valid values: [1 (weighted round robin), 2 (source IP hash)]
     */
    public void setLbType(Long LbType) {
        this.LbType = LbType;
    }

    /**
     * Get Session persistence status. Valid values: [0 (disabled), 1 (enabled)]; 
     * @return KeepEnable Session persistence status. Valid values: [0 (disabled), 1 (enabled)];
     */
    public Long getKeepEnable() {
        return this.KeepEnable;
    }

    /**
     * Set Session persistence status. Valid values: [0 (disabled), 1 (enabled)];
     * @param KeepEnable Session persistence status. Valid values: [0 (disabled), 1 (enabled)];
     */
    public void setKeepEnable(Long KeepEnable) {
        this.KeepEnable = KeepEnable;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule description 
     * @return RuleName Rule description
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule description
     * @param RuleName Rule description
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Watermark removal status. Valid values: [0 (disabled), 1 (enabled)] 
     * @return RemoveSwitch Watermark removal status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public Long getRemoveSwitch() {
        return this.RemoveSwitch;
    }

    /**
     * Set Watermark removal status. Valid values: [0 (disabled), 1 (enabled)]
     * @param RemoveSwitch Watermark removal status. Valid values: [0 (disabled), 1 (enabled)]
     */
    public void setRemoveSwitch(Long RemoveSwitch) {
        this.RemoveSwitch = RemoveSwitch;
    }

    public L4RuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4RuleEntry(L4RuleEntry source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new Long(source.VirtualPort);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new Long(source.SourcePort);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
        if (source.SourceList != null) {
            this.SourceList = new L4RuleSource[source.SourceList.length];
            for (int i = 0; i < source.SourceList.length; i++) {
                this.SourceList[i] = new L4RuleSource(source.SourceList[i]);
            }
        }
        if (source.LbType != null) {
            this.LbType = new Long(source.LbType);
        }
        if (source.KeepEnable != null) {
            this.KeepEnable = new Long(source.KeepEnable);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RemoveSwitch != null) {
            this.RemoveSwitch = new Long(source.RemoveSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "SourcePort", this.SourcePort);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamArrayObj(map, prefix + "SourceList.", this.SourceList);
        this.setParamSimple(map, prefix + "LbType", this.LbType);
        this.setParamSimple(map, prefix + "KeepEnable", this.KeepEnable);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RemoveSwitch", this.RemoveSwitch);

    }
}

