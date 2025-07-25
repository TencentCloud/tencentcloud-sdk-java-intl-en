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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStepInfo extends AbstractModel {

    /**
    * Step name
    */
    @SerializedName("Step")
    @Expose
    private String Step;

    /**
    * Lifecycle
pending: the step is not started
running: the step is in progress
success: the step is completed
failed: the step failed
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * Step start time
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * Step end time
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * If the lifecycle of the step is failed, this field will display the error information.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FailedMsg")
    @Expose
    private String FailedMsg;

    /**
     * Get Step name 
     * @return Step Step name
     */
    public String getStep() {
        return this.Step;
    }

    /**
     * Set Step name
     * @param Step Step name
     */
    public void setStep(String Step) {
        this.Step = Step;
    }

    /**
     * Get Lifecycle
pending: the step is not started
running: the step is in progress
success: the step is completed
failed: the step failed 
     * @return LifeState Lifecycle
pending: the step is not started
running: the step is in progress
success: the step is completed
failed: the step failed
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set Lifecycle
pending: the step is not started
running: the step is in progress
success: the step is completed
failed: the step failed
     * @param LifeState Lifecycle
pending: the step is not started
running: the step is in progress
success: the step is completed
failed: the step failed
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get Step start time
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return StartAt Step start time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Step start time
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param StartAt Step start time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get Step end time
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return EndAt Step end time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set Step end time
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param EndAt Step end time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get If the lifecycle of the step is failed, this field will display the error information.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FailedMsg If the lifecycle of the step is failed, this field will display the error information.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getFailedMsg() {
        return this.FailedMsg;
    }

    /**
     * Set If the lifecycle of the step is failed, this field will display the error information.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FailedMsg If the lifecycle of the step is failed, this field will display the error information.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFailedMsg(String FailedMsg) {
        this.FailedMsg = FailedMsg;
    }

    public TaskStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStepInfo(TaskStepInfo source) {
        if (source.Step != null) {
            this.Step = new String(source.Step);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.FailedMsg != null) {
            this.FailedMsg = new String(source.FailedMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamSimple(map, prefix + "FailedMsg", this.FailedMsg);

    }
}

