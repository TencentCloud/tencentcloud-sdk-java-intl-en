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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskAsrTranslateResult extends AbstractModel {

    /**
    * Task status. Valid values: PROCESSING, SUCCESS, FAIL.
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
    * Error code. 0 indicates the task is successful; other values indicate failure. It is not recommended to use this parameter, but to use the new parameter `ErrCodeExt`.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Input information of the voice translation task.
    */
    @SerializedName("Input")
    @Expose
    private AiRecognitionTaskAsrTranslateResultInput Input;

    /**
    * Output information of the voice translation task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private AiRecognitionTaskAsrTranslateResultOutput Output;

    /**
    * Progress of the voice translation task, value range [0-100].
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Begin process time of the voice translation task, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * The time when the voice translation task is completed, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get Task status. Valid values: PROCESSING, SUCCESS, FAIL. 
     * @return Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     * @param Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
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
     * Get Error code. 0 indicates the task is successful; other values indicate failure. It is not recommended to use this parameter, but to use the new parameter `ErrCodeExt`. 
     * @return ErrCode Error code. 0 indicates the task is successful; other values indicate failure. It is not recommended to use this parameter, but to use the new parameter `ErrCodeExt`.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0 indicates the task is successful; other values indicate failure. It is not recommended to use this parameter, but to use the new parameter `ErrCodeExt`.
     * @param ErrCode Error code. 0 indicates the task is successful; other values indicate failure. It is not recommended to use this parameter, but to use the new parameter `ErrCodeExt`.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
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
     * Get Input information of the voice translation task. 
     * @return Input Input information of the voice translation task.
     */
    public AiRecognitionTaskAsrTranslateResultInput getInput() {
        return this.Input;
    }

    /**
     * Set Input information of the voice translation task.
     * @param Input Input information of the voice translation task.
     */
    public void setInput(AiRecognitionTaskAsrTranslateResultInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output information of the voice translation task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Output Output information of the voice translation task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskAsrTranslateResultOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output information of the voice translation task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Output Output information of the voice translation task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(AiRecognitionTaskAsrTranslateResultOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Progress of the voice translation task, value range [0-100]. 
     * @return Progress Progress of the voice translation task, value range [0-100].
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress of the voice translation task, value range [0-100].
     * @param Progress Progress of the voice translation task, value range [0-100].
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Begin process time of the voice translation task, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return BeginProcessTime Begin process time of the voice translation task, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Begin process time of the voice translation task, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param BeginProcessTime Begin process time of the voice translation task, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get The time when the voice translation task is completed, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return FinishTime The time when the voice translation task is completed, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set The time when the voice translation task is completed, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param FinishTime The time when the voice translation task is completed, in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AiRecognitionTaskAsrTranslateResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrTranslateResult(AiRecognitionTaskAsrTranslateResult source) {
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
            this.Input = new AiRecognitionTaskAsrTranslateResultInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiRecognitionTaskAsrTranslateResultOutput(source.Output);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

