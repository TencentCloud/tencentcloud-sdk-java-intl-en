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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleAnalysisTaskResult extends AbstractModel {

    /**
    * The task status. Valid values: PROCESSING, SUCCESS, FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The error code. An empty string indicates the task is successful; any other value returned indicates the task has failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * The error code. 0 indicates the task is successful; other values indicate the task has failed. This parameter is not recommended. Please use `ErrCodeExt` instead.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * The error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The input of the content analysis task.
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskInput Input;

    /**
    * Analysis task output.
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisResult [] Output;

    /**
    * Task execution start time in ISO date and time format.
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * Task execution completion time in ISO date and time format.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get The task status. Valid values: PROCESSING, SUCCESS, FAIL. 
     * @return Status The task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status. Valid values: PROCESSING, SUCCESS, FAIL.
     * @param Status The task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The error code. An empty string indicates the task is successful; any other value returned indicates the task has failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249). 
     * @return ErrCodeExt The error code. An empty string indicates the task is successful; any other value returned indicates the task has failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set The error code. An empty string indicates the task is successful; any other value returned indicates the task has failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
     * @param ErrCodeExt The error code. An empty string indicates the task is successful; any other value returned indicates the task has failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get The error code. 0 indicates the task is successful; other values indicate the task has failed. This parameter is not recommended. Please use `ErrCodeExt` instead. 
     * @return ErrCode The error code. 0 indicates the task is successful; other values indicate the task has failed. This parameter is not recommended. Please use `ErrCodeExt` instead.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set The error code. 0 indicates the task is successful; other values indicate the task has failed. This parameter is not recommended. Please use `ErrCodeExt` instead.
     * @param ErrCode The error code. 0 indicates the task is successful; other values indicate the task has failed. This parameter is not recommended. Please use `ErrCodeExt` instead.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get The error message. 
     * @return Message The error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The error message.
     * @param Message The error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The input of the content analysis task. 
     * @return Input The input of the content analysis task.
     */
    public AiAnalysisTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set The input of the content analysis task.
     * @param Input The input of the content analysis task.
     */
    public void setInput(AiAnalysisTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Analysis task output. 
     * @return Output Analysis task output.
     */
    public AiAnalysisResult [] getOutput() {
        return this.Output;
    }

    /**
     * Set Analysis task output.
     * @param Output Analysis task output.
     */
    public void setOutput(AiAnalysisResult [] Output) {
        this.Output = Output;
    }

    /**
     * Get Task execution start time in ISO date and time format. 
     * @return BeginProcessTime Task execution start time in ISO date and time format.
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Task execution start time in ISO date and time format.
     * @param BeginProcessTime Task execution start time in ISO date and time format.
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get Task execution completion time in ISO date and time format. 
     * @return FinishTime Task execution completion time in ISO date and time format.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task execution completion time in ISO date and time format.
     * @param FinishTime Task execution completion time in ISO date and time format.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public ScheduleAnalysisTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleAnalysisTaskResult(ScheduleAnalysisTaskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new AiAnalysisTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisResult[source.Output.length];
            for (int i = 0; i < source.Output.length; i++) {
                this.Output[i] = new AiAnalysisResult(source.Output[i]);
            }
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamArrayObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

