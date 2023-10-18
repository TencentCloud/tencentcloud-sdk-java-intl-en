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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionPolicy extends AbstractModel {

    /**
    * Tag retention policy ID
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * Namespace name
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * List of rules
    */
    @SerializedName("RetentionRuleList")
    @Expose
    private RetentionRule [] RetentionRuleList;

    /**
    * Regular execution mode
    */
    @SerializedName("CronSetting")
    @Expose
    private String CronSetting;

    /**
    * Whether to enable the rule
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * The execution time of the next task based on the current time and `cronSetting`, which is for reference only
    */
    @SerializedName("NextExecutionTime")
    @Expose
    private String NextExecutionTime;

    /**
     * Get Tag retention policy ID 
     * @return RetentionId Tag retention policy ID
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set Tag retention policy ID
     * @param RetentionId Tag retention policy ID
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get Namespace name 
     * @return NamespaceName Namespace name
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
     * @param NamespaceName Namespace name
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get List of rules 
     * @return RetentionRuleList List of rules
     */
    public RetentionRule [] getRetentionRuleList() {
        return this.RetentionRuleList;
    }

    /**
     * Set List of rules
     * @param RetentionRuleList List of rules
     */
    public void setRetentionRuleList(RetentionRule [] RetentionRuleList) {
        this.RetentionRuleList = RetentionRuleList;
    }

    /**
     * Get Regular execution mode 
     * @return CronSetting Regular execution mode
     */
    public String getCronSetting() {
        return this.CronSetting;
    }

    /**
     * Set Regular execution mode
     * @param CronSetting Regular execution mode
     */
    public void setCronSetting(String CronSetting) {
        this.CronSetting = CronSetting;
    }

    /**
     * Get Whether to enable the rule 
     * @return Disabled Whether to enable the rule
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set Whether to enable the rule
     * @param Disabled Whether to enable the rule
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get The execution time of the next task based on the current time and `cronSetting`, which is for reference only 
     * @return NextExecutionTime The execution time of the next task based on the current time and `cronSetting`, which is for reference only
     */
    public String getNextExecutionTime() {
        return this.NextExecutionTime;
    }

    /**
     * Set The execution time of the next task based on the current time and `cronSetting`, which is for reference only
     * @param NextExecutionTime The execution time of the next task based on the current time and `cronSetting`, which is for reference only
     */
    public void setNextExecutionTime(String NextExecutionTime) {
        this.NextExecutionTime = NextExecutionTime;
    }

    public RetentionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionPolicy(RetentionPolicy source) {
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RetentionRuleList != null) {
            this.RetentionRuleList = new RetentionRule[source.RetentionRuleList.length];
            for (int i = 0; i < source.RetentionRuleList.length; i++) {
                this.RetentionRuleList[i] = new RetentionRule(source.RetentionRuleList[i]);
            }
        }
        if (source.CronSetting != null) {
            this.CronSetting = new String(source.CronSetting);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.NextExecutionTime != null) {
            this.NextExecutionTime = new String(source.NextExecutionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamArrayObj(map, prefix + "RetentionRuleList.", this.RetentionRuleList);
        this.setParamSimple(map, prefix + "CronSetting", this.CronSetting);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "NextExecutionTime", this.NextExecutionTime);

    }
}

