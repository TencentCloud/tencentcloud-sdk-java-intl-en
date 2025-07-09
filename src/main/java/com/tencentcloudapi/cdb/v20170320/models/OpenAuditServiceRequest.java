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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenAuditServiceRequest extends AbstractModel {

    /**
    * TencentDB for MySQL instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Retention period of the audit log. Valid values:  `7` (one week), `30` (one month), `90` (three months), `180` (six months), `365` (one year), `1095` (three years), `1825` (five years).
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * Retention period of high-frequency audit logs. Valid values:  `7` (one week), `30` (one month).
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * Audit rule If both this parameter and `RuleTemplateIds` are left empty, full audit will be applied.
    */
    @SerializedName("AuditRuleFilters")
    @Expose
    private AuditRuleFilters [] AuditRuleFilters;

    /**
    * Rule template ID. If both this parameter and AuditRuleFilters are not specified, all SQL statements will be recorded.
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * Audit type. Valid values: true: Record all; false: Record by rules (default value).
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
     * Get TencentDB for MySQL instance ID 
     * @return InstanceId TencentDB for MySQL instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TencentDB for MySQL instance ID
     * @param InstanceId TencentDB for MySQL instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Retention period of the audit log. Valid values:  `7` (one week), `30` (one month), `90` (three months), `180` (six months), `365` (one year), `1095` (three years), `1825` (five years). 
     * @return LogExpireDay Retention period of the audit log. Valid values:  `7` (one week), `30` (one month), `90` (three months), `180` (six months), `365` (one year), `1095` (three years), `1825` (five years).
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Retention period of the audit log. Valid values:  `7` (one week), `30` (one month), `90` (three months), `180` (six months), `365` (one year), `1095` (three years), `1825` (five years).
     * @param LogExpireDay Retention period of the audit log. Valid values:  `7` (one week), `30` (one month), `90` (three months), `180` (six months), `365` (one year), `1095` (three years), `1825` (five years).
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get Retention period of high-frequency audit logs. Valid values:  `7` (one week), `30` (one month). 
     * @return HighLogExpireDay Retention period of high-frequency audit logs. Valid values:  `7` (one week), `30` (one month).
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set Retention period of high-frequency audit logs. Valid values:  `7` (one week), `30` (one month).
     * @param HighLogExpireDay Retention period of high-frequency audit logs. Valid values:  `7` (one week), `30` (one month).
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get Audit rule If both this parameter and `RuleTemplateIds` are left empty, full audit will be applied. 
     * @return AuditRuleFilters Audit rule If both this parameter and `RuleTemplateIds` are left empty, full audit will be applied.
     */
    public AuditRuleFilters [] getAuditRuleFilters() {
        return this.AuditRuleFilters;
    }

    /**
     * Set Audit rule If both this parameter and `RuleTemplateIds` are left empty, full audit will be applied.
     * @param AuditRuleFilters Audit rule If both this parameter and `RuleTemplateIds` are left empty, full audit will be applied.
     */
    public void setAuditRuleFilters(AuditRuleFilters [] AuditRuleFilters) {
        this.AuditRuleFilters = AuditRuleFilters;
    }

    /**
     * Get Rule template ID. If both this parameter and AuditRuleFilters are not specified, all SQL statements will be recorded. 
     * @return RuleTemplateIds Rule template ID. If both this parameter and AuditRuleFilters are not specified, all SQL statements will be recorded.
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set Rule template ID. If both this parameter and AuditRuleFilters are not specified, all SQL statements will be recorded.
     * @param RuleTemplateIds Rule template ID. If both this parameter and AuditRuleFilters are not specified, all SQL statements will be recorded.
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get Audit type. Valid values: true: Record all; false: Record by rules (default value). 
     * @return AuditAll Audit type. Valid values: true: Record all; false: Record by rules (default value).
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set Audit type. Valid values: true: Record all; false: Record by rules (default value).
     * @param AuditAll Audit type. Valid values: true: Record all; false: Record by rules (default value).
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    public OpenAuditServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenAuditServiceRequest(OpenAuditServiceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.AuditRuleFilters != null) {
            this.AuditRuleFilters = new AuditRuleFilters[source.AuditRuleFilters.length];
            for (int i = 0; i < source.AuditRuleFilters.length; i++) {
                this.AuditRuleFilters[i] = new AuditRuleFilters(source.AuditRuleFilters[i]);
            }
        }
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamArrayObj(map, prefix + "AuditRuleFilters.", this.AuditRuleFilters);
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);

    }
}

