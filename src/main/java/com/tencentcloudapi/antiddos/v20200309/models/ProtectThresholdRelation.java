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

public class ProtectThresholdRelation extends AbstractModel{

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

    }
}

