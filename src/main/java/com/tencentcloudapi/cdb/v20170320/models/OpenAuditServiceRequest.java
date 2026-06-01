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
    * CDB instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Audit log retention period. Supported values include:
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * High frequency audit log retention period. Default value is 7. This item must take value less than or equal to LogExpireDay. Supported values include:
3 - 3 days;
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * Audit rule (deprecated, no longer effective).
    */
    @SerializedName("AuditRuleFilters")
    @Expose
    private AuditRuleFilters [] AuditRuleFilters;

    /**
    * Rule template ID.
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * Audit type. true - full audit; default false - rule audit.
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
     * Get CDB instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId CDB instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CDB instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId CDB instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Audit log retention period. Supported values include:
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years. 
     * @return LogExpireDay Audit log retention period. Supported values include:
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Audit log retention period. Supported values include:
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
     * @param LogExpireDay Audit log retention period. Supported values include:
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get High frequency audit log retention period. Default value is 7. This item must take value less than or equal to LogExpireDay. Supported values include:
3 - 3 days;
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years. 
     * @return HighLogExpireDay High frequency audit log retention period. Default value is 7. This item must take value less than or equal to LogExpireDay. Supported values include:
3 - 3 days;
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set High frequency audit log retention period. Default value is 7. This item must take value less than or equal to LogExpireDay. Supported values include:
3 - 3 days;
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
     * @param HighLogExpireDay High frequency audit log retention period. Default value is 7. This item must take value less than or equal to LogExpireDay. Supported values include:
3 - 3 days;
7 - A week;
30 - one month
90 - three months;
180 - 6 months;
365 - One year;
1095 - Three years;
1825 - Five years.
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get Audit rule (deprecated, no longer effective). 
     * @return AuditRuleFilters Audit rule (deprecated, no longer effective).
     * @deprecated
     */
    @Deprecated
    public AuditRuleFilters [] getAuditRuleFilters() {
        return this.AuditRuleFilters;
    }

    /**
     * Set Audit rule (deprecated, no longer effective).
     * @param AuditRuleFilters Audit rule (deprecated, no longer effective).
     * @deprecated
     */
    @Deprecated
    public void setAuditRuleFilters(AuditRuleFilters [] AuditRuleFilters) {
        this.AuditRuleFilters = AuditRuleFilters;
    }

    /**
     * Get Rule template ID. 
     * @return RuleTemplateIds Rule template ID.
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set Rule template ID.
     * @param RuleTemplateIds Rule template ID.
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get Audit type. true - full audit; default false - rule audit. 
     * @return AuditAll Audit type. true - full audit; default false - rule audit.
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set Audit type. true - full audit; default false - rule audit.
     * @param AuditAll Audit type. true - full audit; default false - rule audit.
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

