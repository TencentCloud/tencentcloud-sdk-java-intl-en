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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectThresholdRelation extends AbstractModel {

    /**
    * DDoS protection level:
`low`: loose protection
`middle`: medium protection
`high`: strict protection
]
    */
    @SerializedName("DDoSLevel")
    @Expose
    private String DDoSLevel;

    /**
    * DDoS cleansing threshold (in Mbps)
    */
    @SerializedName("DDoSThreshold")
    @Expose
    private Long DDoSThreshold;

    /**
    * DDoS AI protection switch:
`on`: enabled
`off`: disabled
]
    */
    @SerializedName("DDoSAI")
    @Expose
    private String DDoSAI;

    /**
    * CC cleansing switch
`0`: disabled
`1`: enabled
]
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * CC cleansing threshold (in QPS)
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * Anti-DDoS instance configured
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
    * Domain name and protocol protection thresholds
    */
    @SerializedName("ListenerCcThresholdList")
    @Expose
    private ListenerCcThreholdConfig [] ListenerCcThresholdList;

    /**
    * SYN traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SynFloodThreshold")
    @Expose
    private Long SynFloodThreshold;

    /**
    * SYN packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SynFloodPktThreshold")
    @Expose
    private Long SynFloodPktThreshold;

    /**
    * UDP traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UdpFloodThreshold")
    @Expose
    private Long UdpFloodThreshold;

    /**
    * UDP packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UdpFloodPktThreshold")
    @Expose
    private Long UdpFloodPktThreshold;

    /**
    * ACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AckFloodThreshold")
    @Expose
    private Long AckFloodThreshold;

    /**
    * ACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AckFloodPktThreshold")
    @Expose
    private Long AckFloodPktThreshold;

    /**
    * SYNACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SynAckFloodThreshold")
    @Expose
    private Long SynAckFloodThreshold;

    /**
    * SYNACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SynAckFloodPktThreshold")
    @Expose
    private Long SynAckFloodPktThreshold;

    /**
    * RST traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RstFloodThreshold")
    @Expose
    private Long RstFloodThreshold;

    /**
    * RST packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RstFloodPktThreshold")
    @Expose
    private Long RstFloodPktThreshold;

    /**
     * Get DDoS protection level:
`low`: loose protection
`middle`: medium protection
`high`: strict protection
] 
     * @return DDoSLevel DDoS protection level:
`low`: loose protection
`middle`: medium protection
`high`: strict protection
]
     */
    public String getDDoSLevel() {
        return this.DDoSLevel;
    }

    /**
     * Set DDoS protection level:
`low`: loose protection
`middle`: medium protection
`high`: strict protection
]
     * @param DDoSLevel DDoS protection level:
`low`: loose protection
`middle`: medium protection
`high`: strict protection
]
     */
    public void setDDoSLevel(String DDoSLevel) {
        this.DDoSLevel = DDoSLevel;
    }

    /**
     * Get DDoS cleansing threshold (in Mbps) 
     * @return DDoSThreshold DDoS cleansing threshold (in Mbps)
     */
    public Long getDDoSThreshold() {
        return this.DDoSThreshold;
    }

    /**
     * Set DDoS cleansing threshold (in Mbps)
     * @param DDoSThreshold DDoS cleansing threshold (in Mbps)
     */
    public void setDDoSThreshold(Long DDoSThreshold) {
        this.DDoSThreshold = DDoSThreshold;
    }

    /**
     * Get DDoS AI protection switch:
`on`: enabled
`off`: disabled
] 
     * @return DDoSAI DDoS AI protection switch:
`on`: enabled
`off`: disabled
]
     */
    public String getDDoSAI() {
        return this.DDoSAI;
    }

    /**
     * Set DDoS AI protection switch:
`on`: enabled
`off`: disabled
]
     * @param DDoSAI DDoS AI protection switch:
`on`: enabled
`off`: disabled
]
     */
    public void setDDoSAI(String DDoSAI) {
        this.DDoSAI = DDoSAI;
    }

    /**
     * Get CC cleansing switch
`0`: disabled
`1`: enabled
] 
     * @return CCEnable CC cleansing switch
`0`: disabled
`1`: enabled
]
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set CC cleansing switch
`0`: disabled
`1`: enabled
]
     * @param CCEnable CC cleansing switch
`0`: disabled
`1`: enabled
]
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get CC cleansing threshold (in QPS) 
     * @return CCThreshold CC cleansing threshold (in QPS)
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set CC cleansing threshold (in QPS)
     * @param CCThreshold CC cleansing threshold (in QPS)
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    /**
     * Get Anti-DDoS instance configured 
     * @return InstanceDetailList Anti-DDoS instance configured
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set Anti-DDoS instance configured
     * @param InstanceDetailList Anti-DDoS instance configured
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    /**
     * Get Domain name and protocol protection thresholds 
     * @return ListenerCcThresholdList Domain name and protocol protection thresholds
     */
    public ListenerCcThreholdConfig [] getListenerCcThresholdList() {
        return this.ListenerCcThresholdList;
    }

    /**
     * Set Domain name and protocol protection thresholds
     * @param ListenerCcThresholdList Domain name and protocol protection thresholds
     */
    public void setListenerCcThresholdList(ListenerCcThreholdConfig [] ListenerCcThresholdList) {
        this.ListenerCcThresholdList = ListenerCcThresholdList;
    }

    /**
     * Get SYN traffic threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SynFloodThreshold SYN traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSynFloodThreshold() {
        return this.SynFloodThreshold;
    }

    /**
     * Set SYN traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SynFloodThreshold SYN traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSynFloodThreshold(Long SynFloodThreshold) {
        this.SynFloodThreshold = SynFloodThreshold;
    }

    /**
     * Get SYN packet threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SynFloodPktThreshold SYN packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSynFloodPktThreshold() {
        return this.SynFloodPktThreshold;
    }

    /**
     * Set SYN packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SynFloodPktThreshold SYN packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSynFloodPktThreshold(Long SynFloodPktThreshold) {
        this.SynFloodPktThreshold = SynFloodPktThreshold;
    }

    /**
     * Get UDP traffic threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UdpFloodThreshold UDP traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUdpFloodThreshold() {
        return this.UdpFloodThreshold;
    }

    /**
     * Set UDP traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UdpFloodThreshold UDP traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUdpFloodThreshold(Long UdpFloodThreshold) {
        this.UdpFloodThreshold = UdpFloodThreshold;
    }

    /**
     * Get UDP packet threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UdpFloodPktThreshold UDP packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUdpFloodPktThreshold() {
        return this.UdpFloodPktThreshold;
    }

    /**
     * Set UDP packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UdpFloodPktThreshold UDP packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUdpFloodPktThreshold(Long UdpFloodPktThreshold) {
        this.UdpFloodPktThreshold = UdpFloodPktThreshold;
    }

    /**
     * Get ACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AckFloodThreshold ACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAckFloodThreshold() {
        return this.AckFloodThreshold;
    }

    /**
     * Set ACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AckFloodThreshold ACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAckFloodThreshold(Long AckFloodThreshold) {
        this.AckFloodThreshold = AckFloodThreshold;
    }

    /**
     * Get ACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AckFloodPktThreshold ACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAckFloodPktThreshold() {
        return this.AckFloodPktThreshold;
    }

    /**
     * Set ACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AckFloodPktThreshold ACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAckFloodPktThreshold(Long AckFloodPktThreshold) {
        this.AckFloodPktThreshold = AckFloodPktThreshold;
    }

    /**
     * Get SYNACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SynAckFloodThreshold SYNACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSynAckFloodThreshold() {
        return this.SynAckFloodThreshold;
    }

    /**
     * Set SYNACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SynAckFloodThreshold SYNACK traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSynAckFloodThreshold(Long SynAckFloodThreshold) {
        this.SynAckFloodThreshold = SynAckFloodThreshold;
    }

    /**
     * Get SYNACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SynAckFloodPktThreshold SYNACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSynAckFloodPktThreshold() {
        return this.SynAckFloodPktThreshold;
    }

    /**
     * Set SYNACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SynAckFloodPktThreshold SYNACK packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSynAckFloodPktThreshold(Long SynAckFloodPktThreshold) {
        this.SynAckFloodPktThreshold = SynAckFloodPktThreshold;
    }

    /**
     * Get RST traffic threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RstFloodThreshold RST traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRstFloodThreshold() {
        return this.RstFloodThreshold;
    }

    /**
     * Set RST traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RstFloodThreshold RST traffic threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRstFloodThreshold(Long RstFloodThreshold) {
        this.RstFloodThreshold = RstFloodThreshold;
    }

    /**
     * Get RST packet threshold
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RstFloodPktThreshold RST packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRstFloodPktThreshold() {
        return this.RstFloodPktThreshold;
    }

    /**
     * Set RST packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RstFloodPktThreshold RST packet threshold
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRstFloodPktThreshold(Long RstFloodPktThreshold) {
        this.RstFloodPktThreshold = RstFloodPktThreshold;
    }

    public ProtectThresholdRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectThresholdRelation(ProtectThresholdRelation source) {
        if (source.DDoSLevel != null) {
            this.DDoSLevel = new String(source.DDoSLevel);
        }
        if (source.DDoSThreshold != null) {
            this.DDoSThreshold = new Long(source.DDoSThreshold);
        }
        if (source.DDoSAI != null) {
            this.DDoSAI = new String(source.DDoSAI);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.CCThreshold != null) {
            this.CCThreshold = new Long(source.CCThreshold);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
        if (source.ListenerCcThresholdList != null) {
            this.ListenerCcThresholdList = new ListenerCcThreholdConfig[source.ListenerCcThresholdList.length];
            for (int i = 0; i < source.ListenerCcThresholdList.length; i++) {
                this.ListenerCcThresholdList[i] = new ListenerCcThreholdConfig(source.ListenerCcThresholdList[i]);
            }
        }
        if (source.SynFloodThreshold != null) {
            this.SynFloodThreshold = new Long(source.SynFloodThreshold);
        }
        if (source.SynFloodPktThreshold != null) {
            this.SynFloodPktThreshold = new Long(source.SynFloodPktThreshold);
        }
        if (source.UdpFloodThreshold != null) {
            this.UdpFloodThreshold = new Long(source.UdpFloodThreshold);
        }
        if (source.UdpFloodPktThreshold != null) {
            this.UdpFloodPktThreshold = new Long(source.UdpFloodPktThreshold);
        }
        if (source.AckFloodThreshold != null) {
            this.AckFloodThreshold = new Long(source.AckFloodThreshold);
        }
        if (source.AckFloodPktThreshold != null) {
            this.AckFloodPktThreshold = new Long(source.AckFloodPktThreshold);
        }
        if (source.SynAckFloodThreshold != null) {
            this.SynAckFloodThreshold = new Long(source.SynAckFloodThreshold);
        }
        if (source.SynAckFloodPktThreshold != null) {
            this.SynAckFloodPktThreshold = new Long(source.SynAckFloodPktThreshold);
        }
        if (source.RstFloodThreshold != null) {
            this.RstFloodThreshold = new Long(source.RstFloodThreshold);
        }
        if (source.RstFloodPktThreshold != null) {
            this.RstFloodPktThreshold = new Long(source.RstFloodPktThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DDoSLevel", this.DDoSLevel);
        this.setParamSimple(map, prefix + "DDoSThreshold", this.DDoSThreshold);
        this.setParamSimple(map, prefix + "DDoSAI", this.DDoSAI);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);
        this.setParamArrayObj(map, prefix + "ListenerCcThresholdList.", this.ListenerCcThresholdList);
        this.setParamSimple(map, prefix + "SynFloodThreshold", this.SynFloodThreshold);
        this.setParamSimple(map, prefix + "SynFloodPktThreshold", this.SynFloodPktThreshold);
        this.setParamSimple(map, prefix + "UdpFloodThreshold", this.UdpFloodThreshold);
        this.setParamSimple(map, prefix + "UdpFloodPktThreshold", this.UdpFloodPktThreshold);
        this.setParamSimple(map, prefix + "AckFloodThreshold", this.AckFloodThreshold);
        this.setParamSimple(map, prefix + "AckFloodPktThreshold", this.AckFloodPktThreshold);
        this.setParamSimple(map, prefix + "SynAckFloodThreshold", this.SynAckFloodThreshold);
        this.setParamSimple(map, prefix + "SynAckFloodPktThreshold", this.SynAckFloodPktThreshold);
        this.setParamSimple(map, prefix + "RstFloodThreshold", this.RstFloodThreshold);
        this.setParamSimple(map, prefix + "RstFloodPktThreshold", this.RstFloodPktThreshold);

    }
}

