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

public class IPLineInfo extends AbstractModel {

    /**
    * IP line type. Valid values:
`bgp`: BGP IP
`ctcc`: CTCC IP
`cucc`: CUCC IP
`cmcc`: CMCC IP
`abroad`: IP outside the Chinese mainland
]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * CNAME of the instance
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Flag of the instance. `0`: Anti-DDoS Pro instance; `1`: Anti-DDoS Advanced instance; `2`: Non-Anti-DDoS Advanced instance.
    */
    @SerializedName("ResourceFlag")
    @Expose
    private Long ResourceFlag;

    /**
     * Get IP line type. Valid values:
`bgp`: BGP IP
`ctcc`: CTCC IP
`cucc`: CUCC IP
`cmcc`: CMCC IP
`abroad`: IP outside the Chinese mainland
] 
     * @return Type IP line type. Valid values:
`bgp`: BGP IP
`ctcc`: CTCC IP
`cucc`: CUCC IP
`cmcc`: CMCC IP
`abroad`: IP outside the Chinese mainland
]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP line type. Valid values:
`bgp`: BGP IP
`ctcc`: CTCC IP
`cucc`: CUCC IP
`cmcc`: CMCC IP
`abroad`: IP outside the Chinese mainland
]
     * @param Type IP line type. Valid values:
`bgp`: BGP IP
`ctcc`: CTCC IP
`cucc`: CUCC IP
`cmcc`: CMCC IP
`abroad`: IP outside the Chinese mainland
]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Eip 
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 
     * @param Eip 
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get CNAME of the instance 
     * @return Cname CNAME of the instance
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME of the instance
     * @param Cname CNAME of the instance
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Flag of the instance. `0`: Anti-DDoS Pro instance; `1`: Anti-DDoS Advanced instance; `2`: Non-Anti-DDoS Advanced instance. 
     * @return ResourceFlag Flag of the instance. `0`: Anti-DDoS Pro instance; `1`: Anti-DDoS Advanced instance; `2`: Non-Anti-DDoS Advanced instance.
     */
    public Long getResourceFlag() {
        return this.ResourceFlag;
    }

    /**
     * Set Flag of the instance. `0`: Anti-DDoS Pro instance; `1`: Anti-DDoS Advanced instance; `2`: Non-Anti-DDoS Advanced instance.
     * @param ResourceFlag Flag of the instance. `0`: Anti-DDoS Pro instance; `1`: Anti-DDoS Advanced instance; `2`: Non-Anti-DDoS Advanced instance.
     */
    public void setResourceFlag(Long ResourceFlag) {
        this.ResourceFlag = ResourceFlag;
    }

    public IPLineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPLineInfo(IPLineInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.ResourceFlag != null) {
            this.ResourceFlag = new Long(source.ResourceFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "ResourceFlag", this.ResourceFlag);

    }
}

