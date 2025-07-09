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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSSpeedLimitConfig extends AbstractModel {

    /**
    * Rate limit mode. Valid values:
`1`: rate limit based on the real server IP
`2`: rate limit based on the destination port
]
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Rate limit value. This field contains at least one valid rate limit type. Note that only up to one value of each type is supported.
    */
    @SerializedName("SpeedValues")
    @Expose
    private SpeedValue [] SpeedValues;

    /**
    * This field is replaced with a new field DstPortList.
    */
    @SerializedName("DstPortScopes")
    @Expose
    private PortSegment [] DstPortScopes;

    /**
    * 
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * IP protocol number. Valid values:
`ALL`: all protocols
`TCP`: TCP protocol
`UDP`: UDP protocol
`SMP`: SMP protocol
`1;2–100`: user-defined protocol with up to 8 ranges
]
Note: For custom protocol ranges, only protocol number is supported. Multiple ranges are separated by ";". If the value is `ALL`, any other protocol or protocol number should be excluded.
    */
    @SerializedName("ProtocolList")
    @Expose
    private String ProtocolList;

    /**
    * Port range list, which contains up to 8 ranges. Use ";" to separate multiple ports and "–" to indicate a range of ports, as described in the following formats: `0–65535`, `80;443;1000–2000`.
    */
    @SerializedName("DstPortList")
    @Expose
    private String DstPortList;

    /**
     * Get Rate limit mode. Valid values:
`1`: rate limit based on the real server IP
`2`: rate limit based on the destination port
] 
     * @return Mode Rate limit mode. Valid values:
`1`: rate limit based on the real server IP
`2`: rate limit based on the destination port
]
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Rate limit mode. Valid values:
`1`: rate limit based on the real server IP
`2`: rate limit based on the destination port
]
     * @param Mode Rate limit mode. Valid values:
`1`: rate limit based on the real server IP
`2`: rate limit based on the destination port
]
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Rate limit value. This field contains at least one valid rate limit type. Note that only up to one value of each type is supported. 
     * @return SpeedValues Rate limit value. This field contains at least one valid rate limit type. Note that only up to one value of each type is supported.
     */
    public SpeedValue [] getSpeedValues() {
        return this.SpeedValues;
    }

    /**
     * Set Rate limit value. This field contains at least one valid rate limit type. Note that only up to one value of each type is supported.
     * @param SpeedValues Rate limit value. This field contains at least one valid rate limit type. Note that only up to one value of each type is supported.
     */
    public void setSpeedValues(SpeedValue [] SpeedValues) {
        this.SpeedValues = SpeedValues;
    }

    /**
     * Get This field is replaced with a new field DstPortList. 
     * @return DstPortScopes This field is replaced with a new field DstPortList.
     */
    public PortSegment [] getDstPortScopes() {
        return this.DstPortScopes;
    }

    /**
     * Set This field is replaced with a new field DstPortList.
     * @param DstPortScopes This field is replaced with a new field DstPortList.
     */
    public void setDstPortScopes(PortSegment [] DstPortScopes) {
        this.DstPortScopes = DstPortScopes;
    }

    /**
     * Get  
     * @return Id 
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 
     * @param Id 
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get IP protocol number. Valid values:
`ALL`: all protocols
`TCP`: TCP protocol
`UDP`: UDP protocol
`SMP`: SMP protocol
`1;2–100`: user-defined protocol with up to 8 ranges
]
Note: For custom protocol ranges, only protocol number is supported. Multiple ranges are separated by ";". If the value is `ALL`, any other protocol or protocol number should be excluded. 
     * @return ProtocolList IP protocol number. Valid values:
`ALL`: all protocols
`TCP`: TCP protocol
`UDP`: UDP protocol
`SMP`: SMP protocol
`1;2–100`: user-defined protocol with up to 8 ranges
]
Note: For custom protocol ranges, only protocol number is supported. Multiple ranges are separated by ";". If the value is `ALL`, any other protocol or protocol number should be excluded.
     */
    public String getProtocolList() {
        return this.ProtocolList;
    }

    /**
     * Set IP protocol number. Valid values:
`ALL`: all protocols
`TCP`: TCP protocol
`UDP`: UDP protocol
`SMP`: SMP protocol
`1;2–100`: user-defined protocol with up to 8 ranges
]
Note: For custom protocol ranges, only protocol number is supported. Multiple ranges are separated by ";". If the value is `ALL`, any other protocol or protocol number should be excluded.
     * @param ProtocolList IP protocol number. Valid values:
`ALL`: all protocols
`TCP`: TCP protocol
`UDP`: UDP protocol
`SMP`: SMP protocol
`1;2–100`: user-defined protocol with up to 8 ranges
]
Note: For custom protocol ranges, only protocol number is supported. Multiple ranges are separated by ";". If the value is `ALL`, any other protocol or protocol number should be excluded.
     */
    public void setProtocolList(String ProtocolList) {
        this.ProtocolList = ProtocolList;
    }

    /**
     * Get Port range list, which contains up to 8 ranges. Use ";" to separate multiple ports and "–" to indicate a range of ports, as described in the following formats: `0–65535`, `80;443;1000–2000`. 
     * @return DstPortList Port range list, which contains up to 8 ranges. Use ";" to separate multiple ports and "–" to indicate a range of ports, as described in the following formats: `0–65535`, `80;443;1000–2000`.
     */
    public String getDstPortList() {
        return this.DstPortList;
    }

    /**
     * Set Port range list, which contains up to 8 ranges. Use ";" to separate multiple ports and "–" to indicate a range of ports, as described in the following formats: `0–65535`, `80;443;1000–2000`.
     * @param DstPortList Port range list, which contains up to 8 ranges. Use ";" to separate multiple ports and "–" to indicate a range of ports, as described in the following formats: `0–65535`, `80;443;1000–2000`.
     */
    public void setDstPortList(String DstPortList) {
        this.DstPortList = DstPortList;
    }

    public DDoSSpeedLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSSpeedLimitConfig(DDoSSpeedLimitConfig source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.SpeedValues != null) {
            this.SpeedValues = new SpeedValue[source.SpeedValues.length];
            for (int i = 0; i < source.SpeedValues.length; i++) {
                this.SpeedValues[i] = new SpeedValue(source.SpeedValues[i]);
            }
        }
        if (source.DstPortScopes != null) {
            this.DstPortScopes = new PortSegment[source.DstPortScopes.length];
            for (int i = 0; i < source.DstPortScopes.length; i++) {
                this.DstPortScopes[i] = new PortSegment(source.DstPortScopes[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProtocolList != null) {
            this.ProtocolList = new String(source.ProtocolList);
        }
        if (source.DstPortList != null) {
            this.DstPortList = new String(source.DstPortList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "SpeedValues.", this.SpeedValues);
        this.setParamArrayObj(map, prefix + "DstPortScopes.", this.DstPortScopes);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProtocolList", this.ProtocolList);
        this.setParamSimple(map, prefix + "DstPortList", this.DstPortList);

    }
}

