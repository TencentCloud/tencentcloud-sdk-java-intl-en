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

public class BGPIPInstanceSpecification extends AbstractModel{

    /**
    * Base protection bandwidth (in Gbps)
    */
    @SerializedName("ProtectBandwidth")
    @Expose
    private Long ProtectBandwidth;

    /**
    * CC protection bandwidth (in QPS)
    */
    @SerializedName("ProtectCCQPS")
    @Expose
    private Long ProtectCCQPS;

    /**
    * Normal application bandwidth (in Mbps)
    */
    @SerializedName("NormalBandwidth")
    @Expose
    private Long NormalBandwidth;

    /**
    * Number of forwarding rules
    */
    @SerializedName("ForwardRulesLimit")
    @Expose
    private Long ForwardRulesLimit;

    /**
    * Auto-renewal status. Valid values:
`0`: disabled
`1`: enabled
]
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Anti-DDoS Advanced line. Valid values:
`1`: BGP
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * Elastic protection bandwidth (in Gbps)
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
     * Get Base protection bandwidth (in Gbps) 
     * @return ProtectBandwidth Base protection bandwidth (in Gbps)
     */
    public Long getProtectBandwidth() {
        return this.ProtectBandwidth;
    }

    /**
     * Set Base protection bandwidth (in Gbps)
     * @param ProtectBandwidth Base protection bandwidth (in Gbps)
     */
    public void setProtectBandwidth(Long ProtectBandwidth) {
        this.ProtectBandwidth = ProtectBandwidth;
    }

    /**
     * Get CC protection bandwidth (in QPS) 
     * @return ProtectCCQPS CC protection bandwidth (in QPS)
     */
    public Long getProtectCCQPS() {
        return this.ProtectCCQPS;
    }

    /**
     * Set CC protection bandwidth (in QPS)
     * @param ProtectCCQPS CC protection bandwidth (in QPS)
     */
    public void setProtectCCQPS(Long ProtectCCQPS) {
        this.ProtectCCQPS = ProtectCCQPS;
    }

    /**
     * Get Normal application bandwidth (in Mbps) 
     * @return NormalBandwidth Normal application bandwidth (in Mbps)
     */
    public Long getNormalBandwidth() {
        return this.NormalBandwidth;
    }

    /**
     * Set Normal application bandwidth (in Mbps)
     * @param NormalBandwidth Normal application bandwidth (in Mbps)
     */
    public void setNormalBandwidth(Long NormalBandwidth) {
        this.NormalBandwidth = NormalBandwidth;
    }

    /**
     * Get Number of forwarding rules 
     * @return ForwardRulesLimit Number of forwarding rules
     */
    public Long getForwardRulesLimit() {
        return this.ForwardRulesLimit;
    }

    /**
     * Set Number of forwarding rules
     * @param ForwardRulesLimit Number of forwarding rules
     */
    public void setForwardRulesLimit(Long ForwardRulesLimit) {
        this.ForwardRulesLimit = ForwardRulesLimit;
    }

    /**
     * Get Auto-renewal status. Valid values:
`0`: disabled
`1`: enabled
] 
     * @return AutoRenewFlag Auto-renewal status. Valid values:
`0`: disabled
`1`: enabled
]
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal status. Valid values:
`0`: disabled
`1`: enabled
]
     * @param AutoRenewFlag Auto-renewal status. Valid values:
`0`: disabled
`1`: enabled
]
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Anti-DDoS Advanced line. Valid values:
`1`: BGP
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
] 
     * @return Line Anti-DDoS Advanced line. Valid values:
`1`: BGP
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set Anti-DDoS Advanced line. Valid values:
`1`: BGP
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
     * @param Line Anti-DDoS Advanced line. Valid values:
`1`: BGP
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get Elastic protection bandwidth (in Gbps) 
     * @return ElasticBandwidth Elastic protection bandwidth (in Gbps)
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set Elastic protection bandwidth (in Gbps)
     * @param ElasticBandwidth Elastic protection bandwidth (in Gbps)
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    public BGPIPInstanceSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPIPInstanceSpecification(BGPIPInstanceSpecification source) {
        if (source.ProtectBandwidth != null) {
            this.ProtectBandwidth = new Long(source.ProtectBandwidth);
        }
        if (source.ProtectCCQPS != null) {
            this.ProtectCCQPS = new Long(source.ProtectCCQPS);
        }
        if (source.NormalBandwidth != null) {
            this.NormalBandwidth = new Long(source.NormalBandwidth);
        }
        if (source.ForwardRulesLimit != null) {
            this.ForwardRulesLimit = new Long(source.ForwardRulesLimit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.ElasticBandwidth != null) {
            this.ElasticBandwidth = new Long(source.ElasticBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectBandwidth", this.ProtectBandwidth);
        this.setParamSimple(map, prefix + "ProtectCCQPS", this.ProtectCCQPS);
        this.setParamSimple(map, prefix + "NormalBandwidth", this.NormalBandwidth);
        this.setParamSimple(map, prefix + "ForwardRulesLimit", this.ForwardRulesLimit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "ElasticBandwidth", this.ElasticBandwidth);

    }
}

