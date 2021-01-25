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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitMediaTaskSegmentInfo extends AbstractModel{

    /**
    * Input information of a video splitting task.
    */
    @SerializedName("Input")
    @Expose
    private SplitMediaTaskInput Input;

    /**
    * Output information of a video splitting task.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private TaskOutputMediaInfo Output;

    /**
    * If a video processing flow is specified when a video splitting task is initiated, this field will be the task flow ID.
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
     * Get Input information of a video splitting task. 
     * @return Input Input information of a video splitting task.
     */
    public SplitMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input information of a video splitting task.
     * @param Input Input information of a video splitting task.
     */
    public void setInput(SplitMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output information of a video splitting task.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Output Output information of a video splitting task.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TaskOutputMediaInfo getOutput() {
        return this.Output;
    }

    /**
     * Set Output information of a video splitting task.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Output Output information of a video splitting task.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOutput(TaskOutputMediaInfo Output) {
        this.Output = Output;
    }

    /**
     * Get If a video processing flow is specified when a video splitting task is initiated, this field will be the task flow ID. 
     * @return ProcedureTaskId If a video processing flow is specified when a video splitting task is initiated, this field will be the task flow ID.
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set If a video processing flow is specified when a video splitting task is initiated, this field will be the task flow ID.
     * @param ProcedureTaskId If a video processing flow is specified when a video splitting task is initiated, this field will be the task flow ID.
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);

    }
}

