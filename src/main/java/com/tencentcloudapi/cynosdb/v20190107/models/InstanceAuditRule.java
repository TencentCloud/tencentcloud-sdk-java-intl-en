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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditRule extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether the audit is rule audit. Valid values: `true` (rule audit), `false` (full audit).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditRule")
    @Expose
    private Boolean AuditRule;

    /**
    * Audit rule details, which is valid only when `AuditRule` is `true`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditRuleFilters")
    @Expose
    private AuditRuleFilters [] AuditRuleFilters;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether the audit is rule audit. Valid values: `true` (rule audit), `false` (full audit).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditRule Whether the audit is rule audit. Valid values: `true` (rule audit), `false` (full audit).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAuditRule() {
        return this.AuditRule;
    }

    /**
     * Set Whether the audit is rule audit. Valid values: `true` (rule audit), `false` (full audit).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditRule Whether the audit is rule audit. Valid values: `true` (rule audit), `false` (full audit).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditRule(Boolean AuditRule) {
        this.AuditRule = AuditRule;
    }

    /**
     * Get Audit rule details, which is valid only when `AuditRule` is `true`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditRuleFilters Audit rule details, which is valid only when `AuditRule` is `true`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AuditRuleFilters [] getAuditRuleFilters() {
        return this.AuditRuleFilters;
    }

    /**
     * Set Audit rule details, which is valid only when `AuditRule` is `true`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditRuleFilters Audit rule details, which is valid only when `AuditRule` is `true`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditRuleFilters(AuditRuleFilters [] AuditRuleFilters) {
        this.AuditRuleFilters = AuditRuleFilters;
    }

    public InstanceAuditRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditRule(InstanceAuditRule source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditRule != null) {
            this.AuditRule = new Boolean(source.AuditRule);
        }
        if (source.AuditRuleFilters != null) {
            this.AuditRuleFilters = new AuditRuleFilters[source.AuditRuleFilters.length];
            for (int i = 0; i < source.AuditRuleFilters.length; i++) {
                this.AuditRuleFilters[i] = new AuditRuleFilters(source.AuditRuleFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditRule", this.AuditRule);
        this.setParamArrayObj(map, prefix + "AuditRuleFilters.", this.AuditRuleFilters);

    }
}

