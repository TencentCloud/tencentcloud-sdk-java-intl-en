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

public class BGPInstanceSpecification extends AbstractModel {

    /**
    * Base protection bandwidth (in Gbps)
    */
    @SerializedName("ProtectBandwidth")
    @Expose
    private Long ProtectBandwidth;

    /**
    * Number of protection chances
    */
    @SerializedName("ProtectCountLimit")
    @Expose
    private Long ProtectCountLimit;

    /**
    * Number of protected IPs
    */
    @SerializedName("ProtectIPNumberLimit")
    @Expose
    private Long ProtectIPNumberLimit;

    /**
    * Auto-renewal status. Values:
`0`: Disabled
`1`: Enabled
]
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnionPackFlag")
    @Expose
    private Long UnionPackFlag;

    /**
    * Application bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceBandWidth")
    @Expose
    private Long ServiceBandWidth;

    /**
    * Whether it’s an Anti-DDoS Pro Premium edition. Values: `0` (General edition); `1` (Premium edition).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BattleEditionFlag")
    @Expose
    private Long BattleEditionFlag;

    /**
    * Whether it’s an Anti-DDoS Pro Standard edition. Values: `0` (General edition); `1` (Standard edition).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChannelEditionFlag")
    @Expose
    private Long ChannelEditionFlag;

    /**
    * Whether it’s an Anti-DDoS Pro Enterprise edition. Values: `0` (General edition); `1` (Enterprise edition).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnterpriseFlag")
    @Expose
    private Long EnterpriseFlag;

    /**
    * Elastic bandwidth threshold of the Anti-DDoS Pro Enterprise edition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
    * Protection bandwidth after the plan downgrade, in Gbps. 
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DownGradeProtect")
    @Expose
    private Long DownGradeProtect;

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
     * Get Number of protection chances 
     * @return ProtectCountLimit Number of protection chances
     */
    public Long getProtectCountLimit() {
        return this.ProtectCountLimit;
    }

    /**
     * Set Number of protection chances
     * @param ProtectCountLimit Number of protection chances
     */
    public void setProtectCountLimit(Long ProtectCountLimit) {
        this.ProtectCountLimit = ProtectCountLimit;
    }

    /**
     * Get Number of protected IPs 
     * @return ProtectIPNumberLimit Number of protected IPs
     */
    public Long getProtectIPNumberLimit() {
        return this.ProtectIPNumberLimit;
    }

    /**
     * Set Number of protected IPs
     * @param ProtectIPNumberLimit Number of protected IPs
     */
    public void setProtectIPNumberLimit(Long ProtectIPNumberLimit) {
        this.ProtectIPNumberLimit = ProtectIPNumberLimit;
    }

    /**
     * Get Auto-renewal status. Values:
`0`: Disabled
`1`: Enabled
] 
     * @return AutoRenewFlag Auto-renewal status. Values:
`0`: Disabled
`1`: Enabled
]
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal status. Values:
`0`: Disabled
`1`: Enabled
]
     * @param AutoRenewFlag Auto-renewal status. Values:
`0`: Disabled
`1`: Enabled
]
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnionPackFlag Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnionPackFlag() {
        return this.UnionPackFlag;
    }

    /**
     * Set Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnionPackFlag Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnionPackFlag(Long UnionPackFlag) {
        this.UnionPackFlag = UnionPackFlag;
    }

    /**
     * Get Application bandwidth
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceBandWidth Application bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getServiceBandWidth() {
        return this.ServiceBandWidth;
    }

    /**
     * Set Application bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceBandWidth Application bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceBandWidth(Long ServiceBandWidth) {
        this.ServiceBandWidth = ServiceBandWidth;
    }

    /**
     * Get Whether it’s an Anti-DDoS Pro Premium edition. Values: `0` (General edition); `1` (Premium edition).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BattleEditionFlag Whether it’s an Anti-DDoS Pro Premium edition. Values: `0` (General edition); `1` (Premium edition).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBattleEditionFlag() {
        return this.BattleEditionFlag;
    }

    /**
     * Set Whether it’s an Anti-DDoS Pro Premium edition. Values: `0` (General edition); `1` (Premium edition).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BattleEditionFlag Whether it’s an Anti-DDoS Pro Premium edition. Values: `0` (General edition); `1` (Premium edition).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBattleEditionFlag(Long BattleEditionFlag) {
        this.BattleEditionFlag = BattleEditionFlag;
    }

    /**
     * Get Whether it’s an Anti-DDoS Pro Standard edition. Values: `0` (General edition); `1` (Standard edition).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChannelEditionFlag Whether it’s an Anti-DDoS Pro Standard edition. Values: `0` (General edition); `1` (Standard edition).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getChannelEditionFlag() {
        return this.ChannelEditionFlag;
    }

    /**
     * Set Whether it’s an Anti-DDoS Pro Standard edition. Values: `0` (General edition); `1` (Standard edition).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChannelEditionFlag Whether it’s an Anti-DDoS Pro Standard edition. Values: `0` (General edition); `1` (Standard edition).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChannelEditionFlag(Long ChannelEditionFlag) {
        this.ChannelEditionFlag = ChannelEditionFlag;
    }

    /**
     * Get Whether it’s an Anti-DDoS Pro Enterprise edition. Values: `0` (General edition); `1` (Enterprise edition).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnterpriseFlag Whether it’s an Anti-DDoS Pro Enterprise edition. Values: `0` (General edition); `1` (Enterprise edition).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnterpriseFlag() {
        return this.EnterpriseFlag;
    }

    /**
     * Set Whether it’s an Anti-DDoS Pro Enterprise edition. Values: `0` (General edition); `1` (Enterprise edition).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnterpriseFlag Whether it’s an Anti-DDoS Pro Enterprise edition. Values: `0` (General edition); `1` (Enterprise edition).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnterpriseFlag(Long EnterpriseFlag) {
        this.EnterpriseFlag = EnterpriseFlag;
    }

    /**
     * Get Elastic bandwidth threshold of the Anti-DDoS Pro Enterprise edition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElasticLimit Elastic bandwidth threshold of the Anti-DDoS Pro Enterprise edition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set Elastic bandwidth threshold of the Anti-DDoS Pro Enterprise edition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElasticLimit Elastic bandwidth threshold of the Anti-DDoS Pro Enterprise edition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    /**
     * Get Protection bandwidth after the plan downgrade, in Gbps. 
Note: This field may return `null`, indicating that no valid value was found. 
     * @return DownGradeProtect Protection bandwidth after the plan downgrade, in Gbps. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getDownGradeProtect() {
        return this.DownGradeProtect;
    }

    /**
     * Set Protection bandwidth after the plan downgrade, in Gbps. 
Note: This field may return `null`, indicating that no valid value was found.
     * @param DownGradeProtect Protection bandwidth after the plan downgrade, in Gbps. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDownGradeProtect(Long DownGradeProtect) {
        this.DownGradeProtect = DownGradeProtect;
    }

    public BGPInstanceSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPInstanceSpecification(BGPInstanceSpecification source) {
        if (source.ProtectBandwidth != null) {
            this.ProtectBandwidth = new Long(source.ProtectBandwidth);
        }
        if (source.ProtectCountLimit != null) {
            this.ProtectCountLimit = new Long(source.ProtectCountLimit);
        }
        if (source.ProtectIPNumberLimit != null) {
            this.ProtectIPNumberLimit = new Long(source.ProtectIPNumberLimit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.UnionPackFlag != null) {
            this.UnionPackFlag = new Long(source.UnionPackFlag);
        }
        if (source.ServiceBandWidth != null) {
            this.ServiceBandWidth = new Long(source.ServiceBandWidth);
        }
        if (source.BattleEditionFlag != null) {
            this.BattleEditionFlag = new Long(source.BattleEditionFlag);
        }
        if (source.ChannelEditionFlag != null) {
            this.ChannelEditionFlag = new Long(source.ChannelEditionFlag);
        }
        if (source.EnterpriseFlag != null) {
            this.EnterpriseFlag = new Long(source.EnterpriseFlag);
        }
        if (source.ElasticLimit != null) {
            this.ElasticLimit = new Long(source.ElasticLimit);
        }
        if (source.DownGradeProtect != null) {
            this.DownGradeProtect = new Long(source.DownGradeProtect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectBandwidth", this.ProtectBandwidth);
        this.setParamSimple(map, prefix + "ProtectCountLimit", this.ProtectCountLimit);
        this.setParamSimple(map, prefix + "ProtectIPNumberLimit", this.ProtectIPNumberLimit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "UnionPackFlag", this.UnionPackFlag);
        this.setParamSimple(map, prefix + "ServiceBandWidth", this.ServiceBandWidth);
        this.setParamSimple(map, prefix + "BattleEditionFlag", this.BattleEditionFlag);
        this.setParamSimple(map, prefix + "ChannelEditionFlag", this.ChannelEditionFlag);
        this.setParamSimple(map, prefix + "EnterpriseFlag", this.EnterpriseFlag);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);
        this.setParamSimple(map, prefix + "DownGradeProtect", this.DownGradeProtect);

    }
}

