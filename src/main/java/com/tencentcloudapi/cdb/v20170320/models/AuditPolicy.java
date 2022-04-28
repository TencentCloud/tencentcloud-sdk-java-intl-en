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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditPolicy extends AbstractModel{

    /**
    * Audit policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Audit policy status. Valid values:
`creating`;
`running`,
`paused`;
`failed`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Database instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Creation time of audit policy in the format of 2019-03-20 17:09:13
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of audit policy in the format of 2019-03-20 17:09:13
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Audit policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Audit rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Database instance name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Audit policy ID. 
     * @return PolicyId Audit policy ID.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Audit policy ID.
     * @param PolicyId Audit policy ID.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Audit policy status. Valid values:
`creating`;
`running`,
`paused`;
`failed`. 
     * @return Status Audit policy status. Valid values:
`creating`;
`running`,
`paused`;
`failed`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Audit policy status. Valid values:
`creating`;
`running`,
`paused`;
`failed`.
     * @param Status Audit policy status. Valid values:
`creating`;
`running`,
`paused`;
`failed`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Database instance ID 
     * @return InstanceId Database instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID
     * @param InstanceId Database instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Creation time of audit policy in the format of 2019-03-20 17:09:13 
     * @return CreateTime Creation time of audit policy in the format of 2019-03-20 17:09:13
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of audit policy in the format of 2019-03-20 17:09:13
     * @param CreateTime Creation time of audit policy in the format of 2019-03-20 17:09:13
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of audit policy in the format of 2019-03-20 17:09:13 
     * @return ModifyTime Last modified time of audit policy in the format of 2019-03-20 17:09:13
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modified time of audit policy in the format of 2019-03-20 17:09:13
     * @param ModifyTime Last modified time of audit policy in the format of 2019-03-20 17:09:13
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Audit policy name 
     * @return PolicyName Audit policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Audit policy name
     * @param PolicyName Audit policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Audit rule ID 
     * @return RuleId Audit rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Audit rule ID
     * @param RuleId Audit rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Audit rule name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RuleName Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
     * @param RuleName Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Database instance name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceName Database instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Database instance name
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceName Database instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public AuditPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditPolicy(AuditPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

