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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDetail extends AbstractModel {

    /**
    * Current task step name.
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * Describes the step description of the current task you own.
    */
    @SerializedName("AllSteps")
    @Expose
    private String AllSteps;

    /**
    * Input of the task.
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * Output parameter of the task.
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Specifies the switch time after instance configurations are modified. default value: 0.
This task does not require switching.
Switch immediately.
2: switch at specified time.
3: switch during maintenance time window.
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * Specifies the switch time.
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
    * Note of the task.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Current task step name. 
     * @return CurrentStep Current task step name.
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set Current task step name.
     * @param CurrentStep Current task step name.
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get Describes the step description of the current task you own. 
     * @return AllSteps Describes the step description of the current task you own.
     */
    public String getAllSteps() {
        return this.AllSteps;
    }

    /**
     * Set Describes the step description of the current task you own.
     * @param AllSteps Describes the step description of the current task you own.
     */
    public void setAllSteps(String AllSteps) {
        this.AllSteps = AllSteps;
    }

    /**
     * Get Input of the task. 
     * @return Input Input of the task.
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set Input of the task.
     * @param Input Input of the task.
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get Output parameter of the task. 
     * @return Output Output parameter of the task.
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Output parameter of the task.
     * @param Output Output parameter of the task.
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Specifies the switch time after instance configurations are modified. default value: 0.
This task does not require switching.
Switch immediately.
2: switch at specified time.
3: switch during maintenance time window. 
     * @return SwitchTag Specifies the switch time after instance configurations are modified. default value: 0.
This task does not require switching.
Switch immediately.
2: switch at specified time.
3: switch during maintenance time window.
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set Specifies the switch time after instance configurations are modified. default value: 0.
This task does not require switching.
Switch immediately.
2: switch at specified time.
3: switch during maintenance time window.
     * @param SwitchTag Specifies the switch time after instance configurations are modified. default value: 0.
This task does not require switching.
Switch immediately.
2: switch at specified time.
3: switch during maintenance time window.
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get Specifies the switch time. 
     * @return SwitchTime Specifies the switch time.
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * Set Specifies the switch time.
     * @param SwitchTime Specifies the switch time.
     */
    public void setSwitchTime(String SwitchTime) {
        this.SwitchTime = SwitchTime;
    }

    /**
     * Get Note of the task. 
     * @return Message Note of the task.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Note of the task.
     * @param Message Note of the task.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public TaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDetail(TaskDetail source) {
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.AllSteps != null) {
            this.AllSteps = new String(source.AllSteps);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchTime != null) {
            this.SwitchTime = new String(source.SwitchTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "AllSteps", this.AllSteps);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchTime", this.SwitchTime);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

