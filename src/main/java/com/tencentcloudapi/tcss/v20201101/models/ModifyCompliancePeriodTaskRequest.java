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

public class ModifyCompliancePeriodTaskRequest extends AbstractModel {

    /**
    * ID of the scheduled task to be modified, which is returned by the `DescribeCompliancePeriodTaskList` API.
    */
    @SerializedName("PeriodTaskId")
    @Expose
    private Long PeriodTaskId;

    /**
    * Cycle rule of the scheduled task, which indicates no modification if the field is not specified.
    */
    @SerializedName("PeriodRule")
    @Expose
    private CompliancePeriodTaskRule PeriodRule;

    /**
    * Compliance standard, which indicates no modification if the field is not specified.
    */
    @SerializedName("StandardSettings")
    @Expose
    private ComplianceBenchmarkStandardEnable [] StandardSettings;

    /**
     * Get ID of the scheduled task to be modified, which is returned by the `DescribeCompliancePeriodTaskList` API. 
     * @return PeriodTaskId ID of the scheduled task to be modified, which is returned by the `DescribeCompliancePeriodTaskList` API.
     */
    public Long getPeriodTaskId() {
        return this.PeriodTaskId;
    }

    /**
     * Set ID of the scheduled task to be modified, which is returned by the `DescribeCompliancePeriodTaskList` API.
     * @param PeriodTaskId ID of the scheduled task to be modified, which is returned by the `DescribeCompliancePeriodTaskList` API.
     */
    public void setPeriodTaskId(Long PeriodTaskId) {
        this.PeriodTaskId = PeriodTaskId;
    }

    /**
     * Get Cycle rule of the scheduled task, which indicates no modification if the field is not specified. 
     * @return PeriodRule Cycle rule of the scheduled task, which indicates no modification if the field is not specified.
     */
    public CompliancePeriodTaskRule getPeriodRule() {
        return this.PeriodRule;
    }

    /**
     * Set Cycle rule of the scheduled task, which indicates no modification if the field is not specified.
     * @param PeriodRule Cycle rule of the scheduled task, which indicates no modification if the field is not specified.
     */
    public void setPeriodRule(CompliancePeriodTaskRule PeriodRule) {
        this.PeriodRule = PeriodRule;
    }

    /**
     * Get Compliance standard, which indicates no modification if the field is not specified. 
     * @return StandardSettings Compliance standard, which indicates no modification if the field is not specified.
     */
    public ComplianceBenchmarkStandardEnable [] getStandardSettings() {
        return this.StandardSettings;
    }

    /**
     * Set Compliance standard, which indicates no modification if the field is not specified.
     * @param StandardSettings Compliance standard, which indicates no modification if the field is not specified.
     */
    public void setStandardSettings(ComplianceBenchmarkStandardEnable [] StandardSettings) {
        this.StandardSettings = StandardSettings;
    }

    public ModifyCompliancePeriodTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCompliancePeriodTaskRequest(ModifyCompliancePeriodTaskRequest source) {
        if (source.PeriodTaskId != null) {
            this.PeriodTaskId = new Long(source.PeriodTaskId);
        }
        if (source.PeriodRule != null) {
            this.PeriodRule = new CompliancePeriodTaskRule(source.PeriodRule);
        }
        if (source.StandardSettings != null) {
            this.StandardSettings = new ComplianceBenchmarkStandardEnable[source.StandardSettings.length];
            for (int i = 0; i < source.StandardSettings.length; i++) {
                this.StandardSettings[i] = new ComplianceBenchmarkStandardEnable(source.StandardSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeriodTaskId", this.PeriodTaskId);
        this.setParamObj(map, prefix + "PeriodRule.", this.PeriodRule);
        this.setParamArrayObj(map, prefix + "StandardSettings.", this.StandardSettings);

    }
}

