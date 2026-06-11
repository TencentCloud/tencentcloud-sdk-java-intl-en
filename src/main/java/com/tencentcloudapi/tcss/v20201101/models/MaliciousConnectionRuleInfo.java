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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaliciousConnectionRuleInfo extends AbstractModel {

    /**
    * Enumerate:
IP: Indicates ipv4 or ipv6
DOMAIN: Indicates the domain name
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Custom Blocklist/Allowlist Domain/IP
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Rule ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
     * Get Enumerate:
IP: Indicates ipv4 or ipv6
DOMAIN: Indicates the domain name 
     * @return RuleType Enumerate:
IP: Indicates ipv4 or ipv6
DOMAIN: Indicates the domain name
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Enumerate:
IP: Indicates ipv4 or ipv6
DOMAIN: Indicates the domain name
     * @param RuleType Enumerate:
IP: Indicates ipv4 or ipv6
DOMAIN: Indicates the domain name
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Custom Blocklist/Allowlist Domain/IP 
     * @return Address Custom Blocklist/Allowlist Domain/IP
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Custom Blocklist/Allowlist Domain/IP
     * @param Address Custom Blocklist/Allowlist Domain/IP
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Rule ID 
     * @return RuleID Rule ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID
     * @param RuleID Rule ID
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    public MaliciousConnectionRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaliciousConnectionRuleInfo(MaliciousConnectionRuleInfo source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);

    }
}

