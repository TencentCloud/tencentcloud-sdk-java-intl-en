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

public class SchedulingDomainInfo extends AbstractModel{

    /**
    * Scheduling domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * List of line IPs
    */
    @SerializedName("LineIPList")
    @Expose
    private IPLineInfo [] LineIPList;

    /**
    * Scheduling mode. Valid value: `priority` (priority scheduling).
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * TTL value recorded from the scheduling domain name resolution
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Running status. Valid values:
`0`: not running
`1`: running
`2`: abnormal
]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UsrDomainName")
    @Expose
    private String UsrDomainName;

    /**
     * Get Scheduling domain name 
     * @return Domain Scheduling domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Scheduling domain name
     * @param Domain Scheduling domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get List of line IPs 
     * @return LineIPList List of line IPs
     */
    public IPLineInfo [] getLineIPList() {
        return this.LineIPList;
    }

    /**
     * Set List of line IPs
     * @param LineIPList List of line IPs
     */
    public void setLineIPList(IPLineInfo [] LineIPList) {
        this.LineIPList = LineIPList;
    }

    /**
     * Get Scheduling mode. Valid value: `priority` (priority scheduling). 
     * @return Method Scheduling mode. Valid value: `priority` (priority scheduling).
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Scheduling mode. Valid value: `priority` (priority scheduling).
     * @param Method Scheduling mode. Valid value: `priority` (priority scheduling).
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get TTL value recorded from the scheduling domain name resolution 
     * @return TTL TTL value recorded from the scheduling domain name resolution
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL value recorded from the scheduling domain name resolution
     * @param TTL TTL value recorded from the scheduling domain name resolution
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Running status. Valid values:
`0`: not running
`1`: running
`2`: abnormal
] 
     * @return Status Running status. Valid values:
`0`: not running
`1`: running
`2`: abnormal
]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Running status. Valid values:
`0`: not running
`1`: running
`2`: abnormal
]
     * @param Status Running status. Valid values:
`0`: not running
`1`: running
`2`: abnormal
]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Last modification time 
     * @return ModifyTime Last modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modification time
     * @param ModifyTime Last modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Domain name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UsrDomainName Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getUsrDomainName() {
        return this.UsrDomainName;
    }

    /**
     * Set Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UsrDomainName Domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUsrDomainName(String UsrDomainName) {
        this.UsrDomainName = UsrDomainName;
    }

    public SchedulingDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulingDomainInfo(SchedulingDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LineIPList != null) {
            this.LineIPList = new IPLineInfo[source.LineIPList.length];
            for (int i = 0; i < source.LineIPList.length; i++) {
                this.LineIPList[i] = new IPLineInfo(source.LineIPList[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.UsrDomainName != null) {
            this.UsrDomainName = new String(source.UsrDomainName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "LineIPList.", this.LineIPList);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "UsrDomainName", this.UsrDomainName);

    }
}

