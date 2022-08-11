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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSFeaturesFilter extends AbstractModel{

    /**
    * Action. `drop`: Drop the request; `transmit`: Allow the request; `drop_block`: Drop the request and block it; `forward`: Continue to offer protection.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Sets how far from the first search position
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * Sets how far from the second search position
    */
    @SerializedName("Depth2")
    @Expose
    private Long Depth2;

    /**
    * End of the destination port
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * Start of the destination port
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * Whether to match string 1 that does not contain all the specified elements
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * Whether to match string 2 that does not contain all the specified elements
    */
    @SerializedName("IsNot2")
    @Expose
    private Long IsNot2;

    /**
    * Logical operator that combines two conditions. Values: `none`, `and` and `or`. If there is only one condition, pass in `none` for this condition only.
    */
    @SerializedName("MatchLogic")
    @Expose
    private String MatchLogic;

    /**
    * Matching method of the first condition. `pcre`: Regex match; `sunday`: String match.
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Matching method of the second condition. `pcre`: Regex match; `sunday`: String match.
    */
    @SerializedName("MatchType2")
    @Expose
    private String MatchType2;

    /**
    * Offset from the first search position
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Offset from the second search position
    */
    @SerializedName("Offset2")
    @Expose
    private Long Offset2;

    /**
    * Maximum packet length
    */
    @SerializedName("PacketMax")
    @Expose
    private Long PacketMax;

    /**
    * Minimum packet length
    */
    @SerializedName("PacketMin")
    @Expose
    private Long PacketMin;

    /**
    * Protocol. Values: `tcp`, `udp`, `icmp` and `all`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * End of the source port
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * Start of the source port
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * String in the first condition
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * String in the second condition
    */
    @SerializedName("Str2")
    @Expose
    private String Str2;

    /**
    * Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
    */
    @SerializedName("MatchBegin2")
    @Expose
    private String MatchBegin2;

    /**
     * Get Action. `drop`: Drop the request; `transmit`: Allow the request; `drop_block`: Drop the request and block it; `forward`: Continue to offer protection. 
     * @return Action Action. `drop`: Drop the request; `transmit`: Allow the request; `drop_block`: Drop the request and block it; `forward`: Continue to offer protection.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. `drop`: Drop the request; `transmit`: Allow the request; `drop_block`: Drop the request and block it; `forward`: Continue to offer protection.
     * @param Action Action. `drop`: Drop the request; `transmit`: Allow the request; `drop_block`: Drop the request and block it; `forward`: Continue to offer protection.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Sets how far from the first search position 
     * @return Depth Sets how far from the first search position
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set Sets how far from the first search position
     * @param Depth Sets how far from the first search position
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get Sets how far from the second search position 
     * @return Depth2 Sets how far from the second search position
     */
    public Long getDepth2() {
        return this.Depth2;
    }

    /**
     * Set Sets how far from the second search position
     * @param Depth2 Sets how far from the second search position
     */
    public void setDepth2(Long Depth2) {
        this.Depth2 = Depth2;
    }

    /**
     * Get End of the destination port 
     * @return DportEnd End of the destination port
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set End of the destination port
     * @param DportEnd End of the destination port
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get Start of the destination port 
     * @return DportStart Start of the destination port
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set Start of the destination port
     * @param DportStart Start of the destination port
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get Whether to match string 1 that does not contain all the specified elements 
     * @return IsNot Whether to match string 1 that does not contain all the specified elements
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * Set Whether to match string 1 that does not contain all the specified elements
     * @param IsNot Whether to match string 1 that does not contain all the specified elements
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * Get Whether to match string 2 that does not contain all the specified elements 
     * @return IsNot2 Whether to match string 2 that does not contain all the specified elements
     */
    public Long getIsNot2() {
        return this.IsNot2;
    }

    /**
     * Set Whether to match string 2 that does not contain all the specified elements
     * @param IsNot2 Whether to match string 2 that does not contain all the specified elements
     */
    public void setIsNot2(Long IsNot2) {
        this.IsNot2 = IsNot2;
    }

    /**
     * Get Logical operator that combines two conditions. Values: `none`, `and` and `or`. If there is only one condition, pass in `none` for this condition only. 
     * @return MatchLogic Logical operator that combines two conditions. Values: `none`, `and` and `or`. If there is only one condition, pass in `none` for this condition only.
     */
    public String getMatchLogic() {
        return this.MatchLogic;
    }

    /**
     * Set Logical operator that combines two conditions. Values: `none`, `and` and `or`. If there is only one condition, pass in `none` for this condition only.
     * @param MatchLogic Logical operator that combines two conditions. Values: `none`, `and` and `or`. If there is only one condition, pass in `none` for this condition only.
     */
    public void setMatchLogic(String MatchLogic) {
        this.MatchLogic = MatchLogic;
    }

    /**
     * Get Matching method of the first condition. `pcre`: Regex match; `sunday`: String match. 
     * @return MatchType Matching method of the first condition. `pcre`: Regex match; `sunday`: String match.
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Matching method of the first condition. `pcre`: Regex match; `sunday`: String match.
     * @param MatchType Matching method of the first condition. `pcre`: Regex match; `sunday`: String match.
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Matching method of the second condition. `pcre`: Regex match; `sunday`: String match. 
     * @return MatchType2 Matching method of the second condition. `pcre`: Regex match; `sunday`: String match.
     */
    public String getMatchType2() {
        return this.MatchType2;
    }

    /**
     * Set Matching method of the second condition. `pcre`: Regex match; `sunday`: String match.
     * @param MatchType2 Matching method of the second condition. `pcre`: Regex match; `sunday`: String match.
     */
    public void setMatchType2(String MatchType2) {
        this.MatchType2 = MatchType2;
    }

    /**
     * Get Offset from the first search position 
     * @return Offset Offset from the first search position
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset from the first search position
     * @param Offset Offset from the first search position
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Offset from the second search position 
     * @return Offset2 Offset from the second search position
     */
    public Long getOffset2() {
        return this.Offset2;
    }

    /**
     * Set Offset from the second search position
     * @param Offset2 Offset from the second search position
     */
    public void setOffset2(Long Offset2) {
        this.Offset2 = Offset2;
    }

    /**
     * Get Maximum packet length 
     * @return PacketMax Maximum packet length
     */
    public Long getPacketMax() {
        return this.PacketMax;
    }

    /**
     * Set Maximum packet length
     * @param PacketMax Maximum packet length
     */
    public void setPacketMax(Long PacketMax) {
        this.PacketMax = PacketMax;
    }

    /**
     * Get Minimum packet length 
     * @return PacketMin Minimum packet length
     */
    public Long getPacketMin() {
        return this.PacketMin;
    }

    /**
     * Set Minimum packet length
     * @param PacketMin Minimum packet length
     */
    public void setPacketMin(Long PacketMin) {
        this.PacketMin = PacketMin;
    }

    /**
     * Get Protocol. Values: `tcp`, `udp`, `icmp` and `all`. 
     * @return Protocol Protocol. Values: `tcp`, `udp`, `icmp` and `all`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Values: `tcp`, `udp`, `icmp` and `all`.
     * @param Protocol Protocol. Values: `tcp`, `udp`, `icmp` and `all`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get End of the source port 
     * @return SportEnd End of the source port
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set End of the source port
     * @param SportEnd End of the source port
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get Start of the source port 
     * @return SportStart Start of the source port
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set Start of the source port
     * @param SportStart Start of the source port
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get String in the first condition 
     * @return Str String in the first condition
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * Set String in the first condition
     * @param Str String in the first condition
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * Get String in the second condition 
     * @return Str2 String in the second condition
     */
    public String getStr2() {
        return this.Str2;
    }

    /**
     * Set String in the second condition
     * @param Str2 String in the second condition
     */
    public void setStr2(String Str2) {
        this.Str2 = Str2;
    }

    /**
     * Get Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`. 
     * @return MatchBegin Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
     * @param MatchBegin Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`. 
     * @return MatchBegin2 Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
     */
    public String getMatchBegin2() {
        return this.MatchBegin2;
    }

    /**
     * Set Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
     * @param MatchBegin2 Layer at which each match starts. Values: `begin_l5`, `no_match`, `begin_l3` and `begin_l4`.
     */
    public void setMatchBegin2(String MatchBegin2) {
        this.MatchBegin2 = MatchBegin2;
    }

    public DDoSFeaturesFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSFeaturesFilter(DDoSFeaturesFilter source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.Depth2 != null) {
            this.Depth2 = new Long(source.Depth2);
        }
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.IsNot != null) {
            this.IsNot = new Long(source.IsNot);
        }
        if (source.IsNot2 != null) {
            this.IsNot2 = new Long(source.IsNot2);
        }
        if (source.MatchLogic != null) {
            this.MatchLogic = new String(source.MatchLogic);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.MatchType2 != null) {
            this.MatchType2 = new String(source.MatchType2);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Offset2 != null) {
            this.Offset2 = new Long(source.Offset2);
        }
        if (source.PacketMax != null) {
            this.PacketMax = new Long(source.PacketMax);
        }
        if (source.PacketMin != null) {
            this.PacketMin = new Long(source.PacketMin);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.Str != null) {
            this.Str = new String(source.Str);
        }
        if (source.Str2 != null) {
            this.Str2 = new String(source.Str2);
        }
        if (source.MatchBegin != null) {
            this.MatchBegin = new String(source.MatchBegin);
        }
        if (source.MatchBegin2 != null) {
            this.MatchBegin2 = new String(source.MatchBegin2);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "Depth2", this.Depth2);
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "IsNot2", this.IsNot2);
        this.setParamSimple(map, prefix + "MatchLogic", this.MatchLogic);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "MatchType2", this.MatchType2);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Offset2", this.Offset2);
        this.setParamSimple(map, prefix + "PacketMax", this.PacketMax);
        this.setParamSimple(map, prefix + "PacketMin", this.PacketMin);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "Str2", this.Str2);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "MatchBegin2", this.MatchBegin2);

    }
}

