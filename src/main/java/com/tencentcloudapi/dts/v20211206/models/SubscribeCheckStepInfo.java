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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeCheckStepInfo extends AbstractModel {

    /**
    * Step name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * Step Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * Step number, starting from 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * Current step status. Valid values: notStarted, running, finished, failed.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Current step progressNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Error messageNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Errors")
    @Expose
    private SubscribeCheckStepTip [] Errors;

    /**
    * Warning messageNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Warnings")
    @Expose
    private SubscribeCheckStepTip [] Warnings;

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
     * Get Step Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepId Step Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set Step Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepId Step Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get Step number, starting from 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepNo Step number, starting from 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set Step number, starting from 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepNo Step number, starting from 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get Current step status. Valid values: notStarted, running, finished, failed.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Current step status. Valid values: notStarted, running, finished, failed.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current step status. Valid values: notStarted, running, finished, failed.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Current step status. Valid values: notStarted, running, finished, failed.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Current step progressNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Percent Current step progressNote: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Current step progressNote: This field may return null, indicating that no valid values can be obtained.
     * @param Percent Current step progressNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Error messageNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Errors Error messageNote: This field may return null, indicating that no valid values can be obtained.
     */
    public SubscribeCheckStepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set Error messageNote: This field may return null, indicating that no valid values can be obtained.
     * @param Errors Error messageNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrors(SubscribeCheckStepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get Warning messageNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Warnings Warning messageNote: This field may return null, indicating that no valid values can be obtained.
     */
    public SubscribeCheckStepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set Warning messageNote: This field may return null, indicating that no valid values can be obtained.
     * @param Warnings Warning messageNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarnings(SubscribeCheckStepTip [] Warnings) {
        this.Warnings = Warnings;
    }

    public SubscribeCheckStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeCheckStepInfo(SubscribeCheckStepInfo source) {
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepId != null) {
            this.StepId = new String(source.StepId);
        }
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.Errors != null) {
            this.Errors = new SubscribeCheckStepTip[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new SubscribeCheckStepTip(source.Errors[i]);
            }
        }
        if (source.Warnings != null) {
            this.Warnings = new SubscribeCheckStepTip[source.Warnings.length];
            for (int i = 0; i < source.Warnings.length; i++) {
                this.Warnings[i] = new SubscribeCheckStepTip(source.Warnings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);

    }
}

