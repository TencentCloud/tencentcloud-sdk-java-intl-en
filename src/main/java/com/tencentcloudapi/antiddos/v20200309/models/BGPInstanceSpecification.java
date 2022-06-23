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

public class BGPInstanceSpecification extends AbstractModel{

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
    * Number of protection IPs
    */
    @SerializedName("ProtectIPNumberLimit")
    @Expose
    private Long ProtectIPNumberLimit;

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
    * Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnionPackFlag")
    @Expose
    private Long UnionPackFlag;

    /**
    * 
    */
    @SerializedName("ServiceBandWidth")
    @Expose
    private Long ServiceBandWidth;

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
     * Get Number of protection IPs 
     * @return ProtectIPNumberLimit Number of protection IPs
     */
    public Long getProtectIPNumberLimit() {
        return this.ProtectIPNumberLimit;
    }

    /**
     * Set Number of protection IPs
     * @param ProtectIPNumberLimit Number of protection IPs
     */
    public void setProtectIPNumberLimit(Long ProtectIPNumberLimit) {
        this.ProtectIPNumberLimit = ProtectIPNumberLimit;
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
     * Get Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UnionPackFlag Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getUnionPackFlag() {
        return this.UnionPackFlag;
    }

    /**
     * Set Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UnionPackFlag Protection type of Anti-DDoS Pro. Valid values: `0` (general protection) and `1` (Lighthouse-based protection).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnionPackFlag(Long UnionPackFlag) {
        this.UnionPackFlag = UnionPackFlag;
    }

    /**
     * Get  
     * @return ServiceBandWidth 
     */
    public Long getServiceBandWidth() {
        return this.ServiceBandWidth;
    }

    /**
     * Set 
     * @param ServiceBandWidth 
     */
    public void setServiceBandWidth(Long ServiceBandWidth) {
        this.ServiceBandWidth = ServiceBandWidth;
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

    }
}

