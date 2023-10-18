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

public class ProcessProgress extends AbstractModel {

    /**
    * Step status. Valid values: `notStarted`, `running`, `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Progress information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * Current step
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * The prompt output in the current step
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Step information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Steps")
    @Expose
    private StepDetailInfo [] Steps;

    /**
     * Get Step status. Valid values: `notStarted`, `running`, `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Step status. Valid values: `notStarted`, `running`, `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Step status. Valid values: `notStarted`, `running`, `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Step status. Valid values: `notStarted`, `running`, `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Progress information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Percent Progress information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Progress information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Percent Progress information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Total number of steps
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepAll Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepAll Total number of steps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get Current step
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepNow Current step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set Current step
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepNow Current step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get The prompt output in the current step
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message The prompt output in the current step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The prompt output in the current step
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message The prompt output in the current step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Step information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Steps Step information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StepDetailInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set Step information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Steps Step information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSteps(StepDetailInfo [] Steps) {
        this.Steps = Steps;
    }

    public ProcessProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessProgress(ProcessProgress source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Steps != null) {
            this.Steps = new StepDetailInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new StepDetailInfo(source.Steps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);

    }
}

