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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSFeaturesFilter extends AbstractModel{

    /**
    * Action to be executed. Valid values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`drop_block`: Discard and block</li>
<li>`forward`: Continue protection</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`icmp`: ICMP protocol</li>
<li>`all`: All protocols</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Start of the destination port. Value range: 0–65535.
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * End of the destination port. Value range: 0–65535.
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * Minimum packet length. Value range: 0–1500.
    */
    @SerializedName("PacketMin")
    @Expose
    private Long PacketMin;

    /**
    * Maximum packet length. Value range: 0–1500.
    */
    @SerializedName("PacketMax")
    @Expose
    private Long PacketMax;

    /**
    * Start of the source port. Value range: 0–65535.
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * End of the source port. Value range: 0–65535.
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * Matching method 1 of **feature 1**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Whether the pattern in **feature 1** is matched. This parameter is used together with `MatchType`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * Offset 1 of **feature 1**. Value range: 0–1500.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The depth to inspect **feature 1** in the packet. Value range: 1–1500.
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * The match content of **feature 1**.
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * Matching method 2 of **feature 2**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
    */
    @SerializedName("MatchType2")
    @Expose
    private String MatchType2;

    /**
    * Whether the pattern in **feature 2** is matched. This parameter is used together with `MatchType2`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
    */
    @SerializedName("IsNot2")
    @Expose
    private Long IsNot2;

    /**
    * Offset 2 of **feature 2**. Value range: 0–1500.
    */
    @SerializedName("Offset2")
    @Expose
    private Long Offset2;

    /**
    * The depth to inspect **feature 2** in the packet. Value range: 1–1500.
    */
    @SerializedName("Depth2")
    @Expose
    private Long Depth2;

    /**
    * The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
    */
    @SerializedName("MatchBegin2")
    @Expose
    private String MatchBegin2;

    /**
    * The match content of **feature 2**.
    */
    @SerializedName("Str2")
    @Expose
    private String Str2;

    /**
    * Multi-feature relationship. Enter `none` if only **feature 1** is configured. If **feature 2** exists, you can leave this parameter empty.
    */
    @SerializedName("MatchLogic")
    @Expose
    private String MatchLogic;

    /**
     * Get Action to be executed. Valid values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`drop_block`: Discard and block</li>
<li>`forward`: Continue protection</li> 
     * @return Action Action to be executed. Valid values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`drop_block`: Discard and block</li>
<li>`forward`: Continue protection</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. Valid values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`drop_block`: Discard and block</li>
<li>`forward`: Continue protection</li>
     * @param Action Action to be executed. Valid values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`drop_block`: Discard and block</li>
<li>`forward`: Continue protection</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`icmp`: ICMP protocol</li>
<li>`all`: All protocols</li> 
     * @return Protocol The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`icmp`: ICMP protocol</li>
<li>`all`: All protocols</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`icmp`: ICMP protocol</li>
<li>`all`: All protocols</li>
     * @param Protocol The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`icmp`: ICMP protocol</li>
<li>`all`: All protocols</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Start of the destination port. Value range: 0–65535. 
     * @return DportStart Start of the destination port. Value range: 0–65535.
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set Start of the destination port. Value range: 0–65535.
     * @param DportStart Start of the destination port. Value range: 0–65535.
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get End of the destination port. Value range: 0–65535. 
     * @return DportEnd End of the destination port. Value range: 0–65535.
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set End of the destination port. Value range: 0–65535.
     * @param DportEnd End of the destination port. Value range: 0–65535.
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get Minimum packet length. Value range: 0–1500. 
     * @return PacketMin Minimum packet length. Value range: 0–1500.
     */
    public Long getPacketMin() {
        return this.PacketMin;
    }

    /**
     * Set Minimum packet length. Value range: 0–1500.
     * @param PacketMin Minimum packet length. Value range: 0–1500.
     */
    public void setPacketMin(Long PacketMin) {
        this.PacketMin = PacketMin;
    }

    /**
     * Get Maximum packet length. Value range: 0–1500. 
     * @return PacketMax Maximum packet length. Value range: 0–1500.
     */
    public Long getPacketMax() {
        return this.PacketMax;
    }

    /**
     * Set Maximum packet length. Value range: 0–1500.
     * @param PacketMax Maximum packet length. Value range: 0–1500.
     */
    public void setPacketMax(Long PacketMax) {
        this.PacketMax = PacketMax;
    }

    /**
     * Get Start of the source port. Value range: 0–65535. 
     * @return SportStart Start of the source port. Value range: 0–65535.
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set Start of the source port. Value range: 0–65535.
     * @param SportStart Start of the source port. Value range: 0–65535.
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get End of the source port. Value range: 0–65535. 
     * @return SportEnd End of the source port. Value range: 0–65535.
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set End of the source port. Value range: 0–65535.
     * @param SportEnd End of the source port. Value range: 0–65535.
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get Matching method 1 of **feature 1**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default. 
     * @return MatchType Matching method 1 of **feature 1**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Matching method 1 of **feature 1**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
     * @param MatchType Matching method 1 of **feature 1**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Whether the pattern in **feature 1** is matched. This parameter is used together with `MatchType`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li> 
     * @return IsNot Whether the pattern in **feature 1** is matched. This parameter is used together with `MatchType`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * Set Whether the pattern in **feature 1** is matched. This parameter is used together with `MatchType`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
     * @param IsNot Whether the pattern in **feature 1** is matched. This parameter is used together with `MatchType`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * Get Offset 1 of **feature 1**. Value range: 0–1500. 
     * @return Offset Offset 1 of **feature 1**. Value range: 0–1500.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset 1 of **feature 1**. Value range: 0–1500.
     * @param Offset Offset 1 of **feature 1**. Value range: 0–1500.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The depth to inspect **feature 1** in the packet. Value range: 1–1500. 
     * @return Depth The depth to inspect **feature 1** in the packet. Value range: 1–1500.
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set The depth to inspect **feature 1** in the packet. Value range: 1–1500.
     * @param Depth The depth to inspect **feature 1** in the packet. Value range: 1–1500.
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li> 
     * @return MatchBegin The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
     * @param MatchBegin The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get The match content of **feature 1**. 
     * @return Str The match content of **feature 1**.
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * Set The match content of **feature 1**.
     * @param Str The match content of **feature 1**.
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * Get Matching method 2 of **feature 2**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default. 
     * @return MatchType2 Matching method 2 of **feature 2**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
     */
    public String getMatchType2() {
        return this.MatchType2;
    }

    /**
     * Set Matching method 2 of **feature 2**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
     * @param MatchType2 Matching method 2 of **feature 2**. Values:
<li>`pcre`: Regular expression match</li>
<li>`sunday`: String match</li>An empty string is used by default.
     */
    public void setMatchType2(String MatchType2) {
        this.MatchType2 = MatchType2;
    }

    /**
     * Get Whether the pattern in **feature 2** is matched. This parameter is used together with `MatchType2`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li> 
     * @return IsNot2 Whether the pattern in **feature 2** is matched. This parameter is used together with `MatchType2`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
     */
    public Long getIsNot2() {
        return this.IsNot2;
    }

    /**
     * Set Whether the pattern in **feature 2** is matched. This parameter is used together with `MatchType2`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
     * @param IsNot2 Whether the pattern in **feature 2** is matched. This parameter is used together with `MatchType2`. Values:
<li>`0`: Matched</li>
<li>`1`: Not matched</li>
     */
    public void setIsNot2(Long IsNot2) {
        this.IsNot2 = IsNot2;
    }

    /**
     * Get Offset 2 of **feature 2**. Value range: 0–1500. 
     * @return Offset2 Offset 2 of **feature 2**. Value range: 0–1500.
     */
    public Long getOffset2() {
        return this.Offset2;
    }

    /**
     * Set Offset 2 of **feature 2**. Value range: 0–1500.
     * @param Offset2 Offset 2 of **feature 2**. Value range: 0–1500.
     */
    public void setOffset2(Long Offset2) {
        this.Offset2 = Offset2;
    }

    /**
     * Get The depth to inspect **feature 2** in the packet. Value range: 1–1500. 
     * @return Depth2 The depth to inspect **feature 2** in the packet. Value range: 1–1500.
     */
    public Long getDepth2() {
        return this.Depth2;
    }

    /**
     * Set The depth to inspect **feature 2** in the packet. Value range: 1–1500.
     * @param Depth2 The depth to inspect **feature 2** in the packet. Value range: 1–1500.
     */
    public void setDepth2(Long Depth2) {
        this.Depth2 = Depth2;
    }

    /**
     * Get The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li> 
     * @return MatchBegin2 The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
     */
    public String getMatchBegin2() {
        return this.MatchBegin2;
    }

    /**
     * Set The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
     * @param MatchBegin2 The layer from which each match starts. Values:
<li>`begin_l5`: Start from the payload.</li>
<li>`begin_l4`: Start from the TCP/UDP header.</li>
<li>`begin_l3`: Start from the IP header.</li>
     */
    public void setMatchBegin2(String MatchBegin2) {
        this.MatchBegin2 = MatchBegin2;
    }

    /**
     * Get The match content of **feature 2**. 
     * @return Str2 The match content of **feature 2**.
     */
    public String getStr2() {
        return this.Str2;
    }

    /**
     * Set The match content of **feature 2**.
     * @param Str2 The match content of **feature 2**.
     */
    public void setStr2(String Str2) {
        this.Str2 = Str2;
    }

    /**
     * Get Multi-feature relationship. Enter `none` if only **feature 1** is configured. If **feature 2** exists, you can leave this parameter empty. 
     * @return MatchLogic Multi-feature relationship. Enter `none` if only **feature 1** is configured. If **feature 2** exists, you can leave this parameter empty.
     */
    public String getMatchLogic() {
        return this.MatchLogic;
    }

    /**
     * Set Multi-feature relationship. Enter `none` if only **feature 1** is configured. If **feature 2** exists, you can leave this parameter empty.
     * @param MatchLogic Multi-feature relationship. Enter `none` if only **feature 1** is configured. If **feature 2** exists, you can leave this parameter empty.
     */
    public void setMatchLogic(String MatchLogic) {
        this.MatchLogic = MatchLogic;
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.PacketMin != null) {
            this.PacketMin = new Long(source.PacketMin);
        }
        if (source.PacketMax != null) {
            this.PacketMax = new Long(source.PacketMax);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.IsNot != null) {
            this.IsNot = new Long(source.IsNot);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.MatchBegin != null) {
            this.MatchBegin = new String(source.MatchBegin);
        }
        if (source.Str != null) {
            this.Str = new String(source.Str);
        }
        if (source.MatchType2 != null) {
            this.MatchType2 = new String(source.MatchType2);
        }
        if (source.IsNot2 != null) {
            this.IsNot2 = new Long(source.IsNot2);
        }
        if (source.Offset2 != null) {
            this.Offset2 = new Long(source.Offset2);
        }
        if (source.Depth2 != null) {
            this.Depth2 = new Long(source.Depth2);
        }
        if (source.MatchBegin2 != null) {
            this.MatchBegin2 = new String(source.MatchBegin2);
        }
        if (source.Str2 != null) {
            this.Str2 = new String(source.Str2);
        }
        if (source.MatchLogic != null) {
            this.MatchLogic = new String(source.MatchLogic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "PacketMin", this.PacketMin);
        this.setParamSimple(map, prefix + "PacketMax", this.PacketMax);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "MatchType2", this.MatchType2);
        this.setParamSimple(map, prefix + "IsNot2", this.IsNot2);
        this.setParamSimple(map, prefix + "Offset2", this.Offset2);
        this.setParamSimple(map, prefix + "Depth2", this.Depth2);
        this.setParamSimple(map, prefix + "MatchBegin2", this.MatchBegin2);
        this.setParamSimple(map, prefix + "Str2", this.Str2);
        this.setParamSimple(map, prefix + "MatchLogic", this.MatchLogic);

    }
}

