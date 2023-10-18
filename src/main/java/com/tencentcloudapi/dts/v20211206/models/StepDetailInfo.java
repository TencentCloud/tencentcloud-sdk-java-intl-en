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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StepDetailInfo extends AbstractModel {

    /**
    * Step number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * Step name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * Step ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * Step status. Valid values: `success`, `failed`, `running`, `notStarted`. Default value: `notStarted`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Start time of the current step in the format of "yyyy-mm-dd hh:mm:ss". If this field does not exist or is empty, it is meaningless.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Step error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

    /**
    * Execution progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Errors")
    @Expose
    private ProcessStepTip [] Errors;

    /**
    * Warning
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Warnings")
    @Expose
    private ProcessStepTip [] Warnings;

    /**
     * Get Step number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepNo Step number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set Step number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepNo Step number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get Step name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepName Step name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set Step name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepName Step name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get Step ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepId Step ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set Step ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepId Step ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get Step status. Valid values: `success`, `failed`, `running`, `notStarted`. Default value: `notStarted`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Step status. Valid values: `success`, `failed`, `running`, `notStarted`. Default value: `notStarted`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Step status. Valid values: `success`, `failed`, `running`, `notStarted`. Default value: `notStarted`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Step status. Valid values: `success`, `failed`, `running`, `notStarted`. Default value: `notStarted`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Start time of the current step in the format of "yyyy-mm-dd hh:mm:ss". If this field does not exist or is empty, it is meaningless.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time of the current step in the format of "yyyy-mm-dd hh:mm:ss". If this field does not exist or is empty, it is meaningless.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the current step in the format of "yyyy-mm-dd hh:mm:ss". If this field does not exist or is empty, it is meaningless.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time of the current step in the format of "yyyy-mm-dd hh:mm:ss". If this field does not exist or is empty, it is meaningless.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Step error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepMessage Step error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * Set Step error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepMessage Step error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    /**
     * Get Execution progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Percent Execution progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Execution progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Percent Execution progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Errors Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcessStepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Errors Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrors(ProcessStepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get Warning
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Warnings Warning
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcessStepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set Warning
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Warnings Warning
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarnings(ProcessStepTip [] Warnings) {
        this.Warnings = Warnings;
    }

    public StepDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StepDetailInfo(StepDetailInfo source) {
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepId != null) {
            this.StepId = new String(source.StepId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.StepMessage != null) {
            this.StepMessage = new String(source.StepMessage);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.Errors != null) {
            this.Errors = new ProcessStepTip[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new ProcessStepTip(source.Errors[i]);
            }
        }
        if (source.Warnings != null) {
            this.Warnings = new ProcessStepTip[source.Warnings.length];
            for (int i = 0; i < source.Warnings.length; i++) {
                this.Warnings[i] = new ProcessStepTip(source.Warnings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);

    }
}

