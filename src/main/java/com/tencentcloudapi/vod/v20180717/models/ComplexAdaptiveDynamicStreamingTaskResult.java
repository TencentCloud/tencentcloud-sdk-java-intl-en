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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplexAdaptiveDynamicStreamingTaskResult extends AbstractModel {

    /**
    * Task status of a single adaptive bitrate stream. Valid values: PROCESSING, SUCCESS, FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. An empty string indicates the task is successful; other values indicate failure. For details, see [Video Processing Error Codes](https://intl.cloud.tencent.com/zh/document/product/266/39145).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The execution progress of a single adaptive bitrate stream. Value range: 0-100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Input of a single adaptive bitrate stream.
    */
    @SerializedName("Input")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskInput Input;

    /**
    * Output of a single adaptive bitrate stream.
    */
    @SerializedName("Output")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskOutput Output;

    /**
     * Get Task status of a single adaptive bitrate stream. Valid values: PROCESSING, SUCCESS, FAIL. 
     * @return Status Task status of a single adaptive bitrate stream. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status of a single adaptive bitrate stream. Valid values: PROCESSING, SUCCESS, FAIL.
     * @param Status Task status of a single adaptive bitrate stream. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. An empty string indicates the task is successful; other values indicate failure. For details, see [Video Processing Error Codes](https://intl.cloud.tencent.com/zh/document/product/266/39145). 
     * @return ErrCodeExt Error code. An empty string indicates the task is successful; other values indicate failure. For details, see [Video Processing Error Codes](https://intl.cloud.tencent.com/zh/document/product/266/39145).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates the task is successful; other values indicate failure. For details, see [Video Processing Error Codes](https://intl.cloud.tencent.com/zh/document/product/266/39145).
     * @param ErrCodeExt Error code. An empty string indicates the task is successful; other values indicate failure. For details, see [Video Processing Error Codes](https://intl.cloud.tencent.com/zh/document/product/266/39145).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The execution progress of a single adaptive bitrate stream. Value range: 0-100. 
     * @return Progress The execution progress of a single adaptive bitrate stream. Value range: 0-100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set The execution progress of a single adaptive bitrate stream. Value range: 0-100.
     * @param Progress The execution progress of a single adaptive bitrate stream. Value range: 0-100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Input of a single adaptive bitrate stream. 
     * @return Input Input of a single adaptive bitrate stream.
     */
    public ComplexAdaptiveDynamicStreamingTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of a single adaptive bitrate stream.
     * @param Input Input of a single adaptive bitrate stream.
     */
    public void setInput(ComplexAdaptiveDynamicStreamingTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of a single adaptive bitrate stream. 
     * @return Output Output of a single adaptive bitrate stream.
     */
    public ComplexAdaptiveDynamicStreamingTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of a single adaptive bitrate stream.
     * @param Output Output of a single adaptive bitrate stream.
     */
    public void setOutput(ComplexAdaptiveDynamicStreamingTaskOutput Output) {
        this.Output = Output;
    }

    public ComplexAdaptiveDynamicStreamingTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskResult(ComplexAdaptiveDynamicStreamingTaskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new ComplexAdaptiveDynamicStreamingTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new ComplexAdaptiveDynamicStreamingTaskOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

