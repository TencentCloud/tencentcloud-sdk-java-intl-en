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

public class StepInfo extends AbstractModel {

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
    * Status of the current step. Valid values: `notStarted`, `running`, `failed`, `finished, `skipped`, `paused`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Step start time, which may be null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Errors")
    @Expose
    private StepTip [] Errors;

    /**
    * Warning message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Warnings")
    @Expose
    private StepTip [] Warnings;

    /**
    * Current step progress. Value range: 0-100. The value `-1` indicates that the progress of the current step is unavailable. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

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
     * Get Status of the current step. Valid values: `notStarted`, `running`, `failed`, `finished, `skipped`, `paused`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status of the current step. Valid values: `notStarted`, `running`, `failed`, `finished, `skipped`, `paused`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the current step. Valid values: `notStarted`, `running`, `failed`, `finished, `skipped`, `paused`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status of the current step. Valid values: `notStarted`, `running`, `failed`, `finished, `skipped`, `paused`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Step start time, which may be null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Step start time, which may be null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Step start time, which may be null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Step start time, which may be null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Errors Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Errors Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrors(StepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get Warning message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Warnings Warning message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set Warning message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Warnings Warning message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarnings(StepTip [] Warnings) {
        this.Warnings = Warnings;
    }

    /**
     * Get Current step progress. Value range: 0-100. The value `-1` indicates that the progress of the current step is unavailable. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Current step progress. Value range: 0-100. The value `-1` indicates that the progress of the current step is unavailable. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Current step progress. Value range: 0-100. The value `-1` indicates that the progress of the current step is unavailable. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Current step progress. Value range: 0-100. The value `-1` indicates that the progress of the current step is unavailable. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public StepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StepInfo(StepInfo source) {
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
        if (source.Errors != null) {
            this.Errors = new StepTip[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new StepTip(source.Errors[i]);
            }
        }
        if (source.Warnings != null) {
            this.Warnings = new StepTip[source.Warnings.length];
            for (int i = 0; i < source.Warnings.length; i++) {
                this.Warnings[i] = new StepTip(source.Warnings[i]);
            }
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

