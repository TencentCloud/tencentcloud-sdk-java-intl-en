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

public class CompliancePeriodTaskRule extends AbstractModel {

    /**
    * Execution frequency (days). Valid values: `1`, `3`, `7`.
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * Execution time in the format of "HH:mm:SS"
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * Whether to enable
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get Execution frequency (days). Valid values: `1`, `3`, `7`. 
     * @return Frequency Execution frequency (days). Valid values: `1`, `3`, `7`.
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Execution frequency (days). Valid values: `1`, `3`, `7`.
     * @param Frequency Execution frequency (days). Valid values: `1`, `3`, `7`.
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Execution time in the format of "HH:mm:SS" 
     * @return ExecutionTime Execution time in the format of "HH:mm:SS"
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set Execution time in the format of "HH:mm:SS"
     * @param ExecutionTime Execution time in the format of "HH:mm:SS"
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get Whether to enable
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Whether to enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Whether to enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public CompliancePeriodTaskRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePeriodTaskRule(CompliancePeriodTaskRule source) {
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new String(source.ExecutionTime);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

