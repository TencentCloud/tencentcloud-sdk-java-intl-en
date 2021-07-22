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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PacketFilterConfig extends AbstractModel{

    /**
    * Protocol. Valid values: `tcp`, `udp`, `icmp`, `all`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Start source port. Value range: 0–65535.
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * End source port. Value range: 0–65535. The value also should be greater than or equal to that of the start source port.
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * Start destination port
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * End destination port. Value range: 1–65535. The value also should be greater than or equal to that of the start source port.
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * Minimum message length. Value range: 1–1500.
    */
    @SerializedName("PktlenMin")
    @Expose
    private Long PktlenMin;

    /**
    * Maximum message length. Value range: 1–1500. The value also should be greater than or equal to that of the minimum message length.
    */
    @SerializedName("PktlenMax")
    @Expose
    private Long PktlenMax;

    /**
    * Action. Valid values:
`drop`: discards the request.
`transmit`: allows the request.
`drop_black`: discards the request and adds the IP to blocklist.
`drop_rst`: blocks the request.
`drop_black_rst`: blocks the request and adds the IP to blocklist.
`forward`: continues protection.
]
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Detection location:
`begin_l3`: IP header
`begin_l4`: TCP/UDP header
`begin_l5`: T load
`no_match`: no match
]
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * Detection type:
`sunday`: keyword
`pcre`: regular expression
]
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * Detection depth starting from the detection position. Value range: [0, 1500].
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * Offset starting from the detection position. Value range: [0, Depth].
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether the detection value is included:
`0`: included
`1`: excluded
]
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * Relationship between the first and second detection conditions:
`and`: under both the first and second detection conditions
`none`: under only the first detection condition
]
    */
    @SerializedName("MatchLogic")
    @Expose
    private String MatchLogic;

    /**
    * The second detection position:
`begin_l5`: load
`no_match`: no match
]
    */
    @SerializedName("MatchBegin2")
    @Expose
    private String MatchBegin2;

    /**
    * The second detection type:
`sunday`: keyword
`pcre`: regular expression
]
    */
    @SerializedName("MatchType2")
    @Expose
    private String MatchType2;

    /**
    * The second detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
    */
    @SerializedName("Str2")
    @Expose
    private String Str2;

    /**
    * Detection depth starting from the second detection position. Value range: [0, 1500].
    */
    @SerializedName("Depth2")
    @Expose
    private Long Depth2;

    /**
    * Offset starting from the second detection position. Value range: [0, Depth2].
    */
    @SerializedName("Offset2")
    @Expose
    private Long Offset2;

    /**
    * Whether the second detection value is included:
`0`: included
`1`: excluded
]
    */
    @SerializedName("IsNot2")
    @Expose
    private Long IsNot2;

    /**
    * A rule ID is generated after a feature filtering configuration is added successfully. Leave this field empty when adding a new feature filtering configuration.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Protocol. Valid values: `tcp`, `udp`, `icmp`, `all`. 
     * @return Protocol Protocol. Valid values: `tcp`, `udp`, `icmp`, `all`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: `tcp`, `udp`, `icmp`, `all`.
     * @param Protocol Protocol. Valid values: `tcp`, `udp`, `icmp`, `all`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Start source port. Value range: 0–65535. 
     * @return SportStart Start source port. Value range: 0–65535.
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set Start source port. Value range: 0–65535.
     * @param SportStart Start source port. Value range: 0–65535.
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get End source port. Value range: 0–65535. The value also should be greater than or equal to that of the start source port. 
     * @return SportEnd End source port. Value range: 0–65535. The value also should be greater than or equal to that of the start source port.
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set End source port. Value range: 0–65535. The value also should be greater than or equal to that of the start source port.
     * @param SportEnd End source port. Value range: 0–65535. The value also should be greater than or equal to that of the start source port.
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get Start destination port 
     * @return DportStart Start destination port
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set Start destination port
     * @param DportStart Start destination port
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get End destination port. Value range: 1–65535. The value also should be greater than or equal to that of the start source port. 
     * @return DportEnd End destination port. Value range: 1–65535. The value also should be greater than or equal to that of the start source port.
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set End destination port. Value range: 1–65535. The value also should be greater than or equal to that of the start source port.
     * @param DportEnd End destination port. Value range: 1–65535. The value also should be greater than or equal to that of the start source port.
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get Minimum message length. Value range: 1–1500. 
     * @return PktlenMin Minimum message length. Value range: 1–1500.
     */
    public Long getPktlenMin() {
        return this.PktlenMin;
    }

    /**
     * Set Minimum message length. Value range: 1–1500.
     * @param PktlenMin Minimum message length. Value range: 1–1500.
     */
    public void setPktlenMin(Long PktlenMin) {
        this.PktlenMin = PktlenMin;
    }

    /**
     * Get Maximum message length. Value range: 1–1500. The value also should be greater than or equal to that of the minimum message length. 
     * @return PktlenMax Maximum message length. Value range: 1–1500. The value also should be greater than or equal to that of the minimum message length.
     */
    public Long getPktlenMax() {
        return this.PktlenMax;
    }

    /**
     * Set Maximum message length. Value range: 1–1500. The value also should be greater than or equal to that of the minimum message length.
     * @param PktlenMax Maximum message length. Value range: 1–1500. The value also should be greater than or equal to that of the minimum message length.
     */
    public void setPktlenMax(Long PktlenMax) {
        this.PktlenMax = PktlenMax;
    }

    /**
     * Get Action. Valid values:
`drop`: discards the request.
`transmit`: allows the request.
`drop_black`: discards the request and adds the IP to blocklist.
`drop_rst`: blocks the request.
`drop_black_rst`: blocks the request and adds the IP to blocklist.
`forward`: continues protection.
] 
     * @return Action Action. Valid values:
`drop`: discards the request.
`transmit`: allows the request.
`drop_black`: discards the request and adds the IP to blocklist.
`drop_rst`: blocks the request.
`drop_black_rst`: blocks the request and adds the IP to blocklist.
`forward`: continues protection.
]
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values:
`drop`: discards the request.
`transmit`: allows the request.
`drop_black`: discards the request and adds the IP to blocklist.
`drop_rst`: blocks the request.
`drop_black_rst`: blocks the request and adds the IP to blocklist.
`forward`: continues protection.
]
     * @param Action Action. Valid values:
`drop`: discards the request.
`transmit`: allows the request.
`drop_black`: discards the request and adds the IP to blocklist.
`drop_rst`: blocks the request.
`drop_black_rst`: blocks the request and adds the IP to blocklist.
`forward`: continues protection.
]
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Detection location:
`begin_l3`: IP header
`begin_l4`: TCP/UDP header
`begin_l5`: T load
`no_match`: no match
] 
     * @return MatchBegin Detection location:
`begin_l3`: IP header
`begin_l4`: TCP/UDP header
`begin_l5`: T load
`no_match`: no match
]
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set Detection location:
`begin_l3`: IP header
`begin_l4`: TCP/UDP header
`begin_l5`: T load
`no_match`: no match
]
     * @param MatchBegin Detection location:
`begin_l3`: IP header
`begin_l4`: TCP/UDP header
`begin_l5`: T load
`no_match`: no match
]
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get Detection type:
`sunday`: keyword
`pcre`: regular expression
] 
     * @return MatchType Detection type:
`sunday`: keyword
`pcre`: regular expression
]
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Detection type:
`sunday`: keyword
`pcre`: regular expression
]
     * @param MatchType Detection type:
`sunday`: keyword
`pcre`: regular expression
]
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
] 
     * @return Str Detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * Set Detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
     * @param Str Detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * Get Detection depth starting from the detection position. Value range: [0, 1500]. 
     * @return Depth Detection depth starting from the detection position. Value range: [0, 1500].
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set Detection depth starting from the detection position. Value range: [0, 1500].
     * @param Depth Detection depth starting from the detection position. Value range: [0, 1500].
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get Offset starting from the detection position. Value range: [0, Depth]. 
     * @return Offset Offset starting from the detection position. Value range: [0, Depth].
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset starting from the detection position. Value range: [0, Depth].
     * @param Offset Offset starting from the detection position. Value range: [0, Depth].
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Whether the detection value is included:
`0`: included
`1`: excluded
] 
     * @return IsNot Whether the detection value is included:
`0`: included
`1`: excluded
]
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * Set Whether the detection value is included:
`0`: included
`1`: excluded
]
     * @param IsNot Whether the detection value is included:
`0`: included
`1`: excluded
]
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * Get Relationship between the first and second detection conditions:
`and`: under both the first and second detection conditions
`none`: under only the first detection condition
] 
     * @return MatchLogic Relationship between the first and second detection conditions:
`and`: under both the first and second detection conditions
`none`: under only the first detection condition
]
     */
    public String getMatchLogic() {
        return this.MatchLogic;
    }

    /**
     * Set Relationship between the first and second detection conditions:
`and`: under both the first and second detection conditions
`none`: under only the first detection condition
]
     * @param MatchLogic Relationship between the first and second detection conditions:
`and`: under both the first and second detection conditions
`none`: under only the first detection condition
]
     */
    public void setMatchLogic(String MatchLogic) {
        this.MatchLogic = MatchLogic;
    }

    /**
     * Get The second detection position:
`begin_l5`: load
`no_match`: no match
] 
     * @return MatchBegin2 The second detection position:
`begin_l5`: load
`no_match`: no match
]
     */
    public String getMatchBegin2() {
        return this.MatchBegin2;
    }

    /**
     * Set The second detection position:
`begin_l5`: load
`no_match`: no match
]
     * @param MatchBegin2 The second detection position:
`begin_l5`: load
`no_match`: no match
]
     */
    public void setMatchBegin2(String MatchBegin2) {
        this.MatchBegin2 = MatchBegin2;
    }

    /**
     * Get The second detection type:
`sunday`: keyword
`pcre`: regular expression
] 
     * @return MatchType2 The second detection type:
`sunday`: keyword
`pcre`: regular expression
]
     */
    public String getMatchType2() {
        return this.MatchType2;
    }

    /**
     * Set The second detection type:
`sunday`: keyword
`pcre`: regular expression
]
     * @param MatchType2 The second detection type:
`sunday`: keyword
`pcre`: regular expression
]
     */
    public void setMatchType2(String MatchType2) {
        this.MatchType2 = MatchType2;
    }

    /**
     * Get The second detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
] 
     * @return Str2 The second detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
     */
    public String getStr2() {
        return this.Str2;
    }

    /**
     * Set The second detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
     * @param Str2 The second detection value. Should be in key string or regular expression.
For `sunday`, enter a string or a string in hexadecimal byte code representation starting with `\x`. For example, a string "123" corresponds to the hexadecimal byte code "\x313233".
For `pcre`, enter a regular expression.
]
     */
    public void setStr2(String Str2) {
        this.Str2 = Str2;
    }

    /**
     * Get Detection depth starting from the second detection position. Value range: [0, 1500]. 
     * @return Depth2 Detection depth starting from the second detection position. Value range: [0, 1500].
     */
    public Long getDepth2() {
        return this.Depth2;
    }

    /**
     * Set Detection depth starting from the second detection position. Value range: [0, 1500].
     * @param Depth2 Detection depth starting from the second detection position. Value range: [0, 1500].
     */
    public void setDepth2(Long Depth2) {
        this.Depth2 = Depth2;
    }

    /**
     * Get Offset starting from the second detection position. Value range: [0, Depth2]. 
     * @return Offset2 Offset starting from the second detection position. Value range: [0, Depth2].
     */
    public Long getOffset2() {
        return this.Offset2;
    }

    /**
     * Set Offset starting from the second detection position. Value range: [0, Depth2].
     * @param Offset2 Offset starting from the second detection position. Value range: [0, Depth2].
     */
    public void setOffset2(Long Offset2) {
        this.Offset2 = Offset2;
    }

    /**
     * Get Whether the second detection value is included:
`0`: included
`1`: excluded
] 
     * @return IsNot2 Whether the second detection value is included:
`0`: included
`1`: excluded
]
     */
    public Long getIsNot2() {
        return this.IsNot2;
    }

    /**
     * Set Whether the second detection value is included:
`0`: included
`1`: excluded
]
     * @param IsNot2 Whether the second detection value is included:
`0`: included
`1`: excluded
]
     */
    public void setIsNot2(Long IsNot2) {
        this.IsNot2 = IsNot2;
    }

    /**
     * Get A rule ID is generated after a feature filtering configuration is added successfully. Leave this field empty when adding a new feature filtering configuration. 
     * @return Id A rule ID is generated after a feature filtering configuration is added successfully. Leave this field empty when adding a new feature filtering configuration.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set A rule ID is generated after a feature filtering configuration is added successfully. Leave this field empty when adding a new feature filtering configuration.
     * @param Id A rule ID is generated after a feature filtering configuration is added successfully. Leave this field empty when adding a new feature filtering configuration.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public PacketFilterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PacketFilterConfig(PacketFilterConfig source) {
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
        if (source.Action != null) {
            this.Action = new String(source.Action);
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
        if (source.MatchLogic != null) {
            this.MatchLogic = new String(source.MatchLogic);
        }
        if (source.MatchBegin2 != null) {
            this.MatchBegin2 = new String(source.MatchBegin2);
        }
        if (source.MatchType2 != null) {
            this.MatchType2 = new String(source.MatchType2);
        }
        if (source.Str2 != null) {
            this.Str2 = new String(source.Str2);
        }
        if (source.Depth2 != null) {
            this.Depth2 = new Long(source.Depth2);
        }
        if (source.Offset2 != null) {
            this.Offset2 = new Long(source.Offset2);
        }
        if (source.IsNot2 != null) {
            this.IsNot2 = new Long(source.IsNot2);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "MatchLogic", this.MatchLogic);
        this.setParamSimple(map, prefix + "MatchBegin2", this.MatchBegin2);
        this.setParamSimple(map, prefix + "MatchType2", this.MatchType2);
        this.setParamSimple(map, prefix + "Str2", this.Str2);
        this.setParamSimple(map, prefix + "Depth2", this.Depth2);
        this.setParamSimple(map, prefix + "Offset2", this.Offset2);
        this.setParamSimple(map, prefix + "IsNot2", this.IsNot2);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

