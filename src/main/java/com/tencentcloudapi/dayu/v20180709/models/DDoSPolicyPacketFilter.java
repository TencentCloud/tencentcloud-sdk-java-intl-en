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

public class DDoSPolicyPacketFilter extends AbstractModel {

    /**
    * Protocol. Valid values: [tcp, udp, icmp, all]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Start source port. Value range: [0,65535]
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * End source port. Value range: [0,65535]
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * Start destination port. Value range: [0,65535]
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * End destination port. Value range: [0,65535]
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * Minimum packet length. Value range: [0,1500]
    */
    @SerializedName("PktlenMin")
    @Expose
    private Long PktlenMin;

    /**
    * Maximum packet length. Value range: [0,1500]
    */
    @SerializedName("PktlenMax")
    @Expose
    private Long PktlenMax;

    /**
    * Whether to detect the payload. Valid values: [
begin_l3 (IP header)
begin_l4 (TCP header)
begin_l5 (payload)
no_match (no check)
]
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * Whether it is a regular expression. Valid values: [sunday (keyword), pcre (regular expression)]
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Keyword or regular expression
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * Detection depth. Value range: [0,1500]
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * Detection offset. Value range: [0,1500]
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether to include. Valid values: [0 (no), 1 (yes)]
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * Policy action. Valid values: [drop, drop_black, drop_rst, drop_black_rst, transmit]
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get Protocol. Valid values: [tcp, udp, icmp, all] 
     * @return Protocol Protocol. Valid values: [tcp, udp, icmp, all]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: [tcp, udp, icmp, all]
     * @param Protocol Protocol. Valid values: [tcp, udp, icmp, all]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Start source port. Value range: [0,65535] 
     * @return SportStart Start source port. Value range: [0,65535]
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set Start source port. Value range: [0,65535]
     * @param SportStart Start source port. Value range: [0,65535]
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get End source port. Value range: [0,65535] 
     * @return SportEnd End source port. Value range: [0,65535]
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set End source port. Value range: [0,65535]
     * @param SportEnd End source port. Value range: [0,65535]
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get Start destination port. Value range: [0,65535] 
     * @return DportStart Start destination port. Value range: [0,65535]
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set Start destination port. Value range: [0,65535]
     * @param DportStart Start destination port. Value range: [0,65535]
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get End destination port. Value range: [0,65535] 
     * @return DportEnd End destination port. Value range: [0,65535]
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set End destination port. Value range: [0,65535]
     * @param DportEnd End destination port. Value range: [0,65535]
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get Minimum packet length. Value range: [0,1500] 
     * @return PktlenMin Minimum packet length. Value range: [0,1500]
     */
    public Long getPktlenMin() {
        return this.PktlenMin;
    }

    /**
     * Set Minimum packet length. Value range: [0,1500]
     * @param PktlenMin Minimum packet length. Value range: [0,1500]
     */
    public void setPktlenMin(Long PktlenMin) {
        this.PktlenMin = PktlenMin;
    }

    /**
     * Get Maximum packet length. Value range: [0,1500] 
     * @return PktlenMax Maximum packet length. Value range: [0,1500]
     */
    public Long getPktlenMax() {
        return this.PktlenMax;
    }

    /**
     * Set Maximum packet length. Value range: [0,1500]
     * @param PktlenMax Maximum packet length. Value range: [0,1500]
     */
    public void setPktlenMax(Long PktlenMax) {
        this.PktlenMax = PktlenMax;
    }

    /**
     * Get Whether to detect the payload. Valid values: [
begin_l3 (IP header)
begin_l4 (TCP header)
begin_l5 (payload)
no_match (no check)
] 
     * @return MatchBegin Whether to detect the payload. Valid values: [
begin_l3 (IP header)
begin_l4 (TCP header)
begin_l5 (payload)
no_match (no check)
]
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set Whether to detect the payload. Valid values: [
begin_l3 (IP header)
begin_l4 (TCP header)
begin_l5 (payload)
no_match (no check)
]
     * @param MatchBegin Whether to detect the payload. Valid values: [
begin_l3 (IP header)
begin_l4 (TCP header)
begin_l5 (payload)
no_match (no check)
]
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get Whether it is a regular expression. Valid values: [sunday (keyword), pcre (regular expression)] 
     * @return MatchType Whether it is a regular expression. Valid values: [sunday (keyword), pcre (regular expression)]
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Whether it is a regular expression. Valid values: [sunday (keyword), pcre (regular expression)]
     * @param MatchType Whether it is a regular expression. Valid values: [sunday (keyword), pcre (regular expression)]
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Keyword or regular expression 
     * @return Str Keyword or regular expression
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * Set Keyword or regular expression
     * @param Str Keyword or regular expression
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * Get Detection depth. Value range: [0,1500] 
     * @return Depth Detection depth. Value range: [0,1500]
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set Detection depth. Value range: [0,1500]
     * @param Depth Detection depth. Value range: [0,1500]
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get Detection offset. Value range: [0,1500] 
     * @return Offset Detection offset. Value range: [0,1500]
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Detection offset. Value range: [0,1500]
     * @param Offset Detection offset. Value range: [0,1500]
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Whether to include. Valid values: [0 (no), 1 (yes)] 
     * @return IsNot Whether to include. Valid values: [0 (no), 1 (yes)]
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * Set Whether to include. Valid values: [0 (no), 1 (yes)]
     * @param IsNot Whether to include. Valid values: [0 (no), 1 (yes)]
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * Get Policy action. Valid values: [drop, drop_black, drop_rst, drop_black_rst, transmit] 
     * @return Action Policy action. Valid values: [drop, drop_black, drop_rst, drop_black_rst, transmit]
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Policy action. Valid values: [drop, drop_black, drop_rst, drop_black_rst, transmit]
     * @param Action Policy action. Valid values: [drop, drop_black, drop_rst, drop_black_rst, transmit]
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public DDoSPolicyPacketFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSPolicyPacketFilter(DDoSPolicyPacketFilter source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.PktlenMin != null) {
            this.PktlenMin = new Long(source.PktlenMin);
        }
        if (source.PktlenMax != null) {
            this.PktlenMax = new Long(source.PktlenMax);
        }
        if (source.MatchBegin != null) {
            this.MatchBegin = new String(source.MatchBegin);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.Str != null) {
            this.Str = new String(source.Str);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.IsNot != null) {
            this.IsNot = new Long(source.IsNot);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "PktlenMin", this.PktlenMin);
        this.setParamSimple(map, prefix + "PktlenMax", this.PktlenMax);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

