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

public class ReduceMediaBitrateTranscodeResult extends AbstractModel {

    /**
    * The task status. Valid values: PROCESSING, SUCCESS, FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The error code. An empty string indicates the task is successful; other values indicate that the task failed. For details, see [Video processing error codes](https://intl.cloud.tencent.com/document/product/266/39145?lang=en&pg=#video-processing).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * The error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The input of a transcoding task.
    */
    @SerializedName("Input")
    @Expose
    private TranscodeTaskInput Input;

    /**
    * The output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private MediaTranscodeItem Output;

    /**
    * The transcoding progress. Value range: 0-100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * The start time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * The end time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
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
     * Get The error code. An empty string indicates the task is successful; other values indicate that the task failed. For details, see [Video processing error codes](https://intl.cloud.tencent.com/document/product/266/39145?lang=en&pg=#video-processing). 
     * @return ErrCodeExt The error code. An empty string indicates the task is successful; other values indicate that the task failed. For details, see [Video processing error codes](https://intl.cloud.tencent.com/document/product/266/39145?lang=en&pg=#video-processing).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set The error code. An empty string indicates the task is successful; other values indicate that the task failed. For details, see [Video processing error codes](https://intl.cloud.tencent.com/document/product/266/39145?lang=en&pg=#video-processing).
     * @param ErrCodeExt The error code. An empty string indicates the task is successful; other values indicate that the task failed. For details, see [Video processing error codes](https://intl.cloud.tencent.com/document/product/266/39145?lang=en&pg=#video-processing).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
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
     * Get The input of a transcoding task. 
     * @return Input The input of a transcoding task.
     */
    public TranscodeTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set The input of a transcoding task.
     * @param Input The input of a transcoding task.
     */
    public void setInput(TranscodeTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get The output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output The output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaTranscodeItem getOutput() {
        return this.Output;
    }

    /**
     * Set The output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output The output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(MediaTranscodeItem Output) {
        this.Output = Output;
    }

    /**
     * Get The transcoding progress. Value range: 0-100. 
     * @return Progress The transcoding progress. Value range: 0-100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set The transcoding progress. Value range: 0-100.
     * @param Progress The transcoding progress. Value range: 0-100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get The start time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return BeginProcessTime The start time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set The start time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param BeginProcessTime The start time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get The end time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return FinishTime The end time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set The end time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param FinishTime The end time of the transcoding task, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public ReduceMediaBitrateTranscodeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReduceMediaBitrateTranscodeResult(ReduceMediaBitrateTranscodeResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new TranscodeTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new MediaTranscodeItem(source.Output);
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
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

