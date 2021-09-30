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

public class CreateAuditPolicyRequest extends AbstractModel{

    /**
    * Audit policy name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Audit rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Retention period of audit logs. Valid values:
7: seven days (a week);
30: 30 days (a month);
180: 180 days (six months);
365: 365 days (a year);
1095: 1095 days (three years);
1825: 1825 days (five years).
This parameter specifies the retention period (30 days by default) of audit logs, which is valid when you create the first audit policy for an instance. If the instance already has audit policies, this parameter is invalid, but you can use the `ModifyAuditConfig` API to modify the retention period.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
     * Get Audit policy name. 
     * @return Name Audit policy name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audit policy name.
     * @param Name Audit policy name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Audit rule ID. 
     * @return RuleId Audit rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Audit rule ID.
     * @param RuleId Audit rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Retention period of audit logs. Valid values:
7: seven days (a week);
30: 30 days (a month);
180: 180 days (six months);
365: 365 days (a year);
1095: 1095 days (three years);
1825: 1825 days (five years).
This parameter specifies the retention period (30 days by default) of audit logs, which is valid when you create the first audit policy for an instance. If the instance already has audit policies, this parameter is invalid, but you can use the `ModifyAuditConfig` API to modify the retention period. 
     * @return LogExpireDay Retention period of audit logs. Valid values:
7: seven days (a week);
30: 30 days (a month);
180: 180 days (six months);
365: 365 days (a year);
1095: 1095 days (three years);
1825: 1825 days (five years).
This parameter specifies the retention period (30 days by default) of audit logs, which is valid when you create the first audit policy for an instance. If the instance already has audit policies, this parameter is invalid, but you can use the `ModifyAuditConfig` API to modify the retention period.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Retention period of audit logs. Valid values:
7: seven days (a week);
30: 30 days (a month);
180: 180 days (six months);
365: 365 days (a year);
1095: 1095 days (three years);
1825: 1825 days (five years).
This parameter specifies the retention period (30 days by default) of audit logs, which is valid when you create the first audit policy for an instance. If the instance already has audit policies, this parameter is invalid, but you can use the `ModifyAuditConfig` API to modify the retention period.
     * @param LogExpireDay Retention period of audit logs. Valid values:
7: seven days (a week);
30: 30 days (a month);
180: 180 days (six months);
365: 365 days (a year);
1095: 1095 days (three years);
1825: 1825 days (five years).
This parameter specifies the retention period (30 days by default) of audit logs, which is valid when you create the first audit policy for an instance. If the instance already has audit policies, this parameter is invalid, but you can use the `ModifyAuditConfig` API to modify the retention period.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    public CreateAuditPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditPolicyRequest(CreateAuditPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);

    }
}

