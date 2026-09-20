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

public class MediaProcessTaskAdaptiveDynamicStreamingResult extends AbstractModel {

    /**
    * Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Error code. 0 indicates that the task is successful, and other values indicate that the task has failed. (This field is not recommended. Use the new error code field ErrCodeExt instead.)
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
    * Progress of the adaptive bitrate streaming task. Value range: 0-100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Input of the video to adaptive streaming task.
    */
    @SerializedName("Input")
    @Expose
    private AdaptiveDynamicStreamingTaskInput Input;

    /**
    * Output of a video to adaptive streaming task.
    */
    @SerializedName("Output")
    @Expose
    private AdaptiveDynamicStreamingInfoItem Output;

    /**
    * Adaptive bitrate streaming task start execution time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * Task completion time of transcoding to adaptive bitstream in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get Task status. Valid values are PROCESSING, SUCCESS, and FAIL. 
     * @return Status Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     * @param Status Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81). 
     * @return ErrCodeExt Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     * @param ErrCodeExt Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Error code. 0 indicates that the task is successful, and other values indicate that the task has failed. (This field is not recommended. Use the new error code field ErrCodeExt instead.) 
     * @return ErrCode Error code. 0 indicates that the task is successful, and other values indicate that the task has failed. (This field is not recommended. Use the new error code field ErrCodeExt instead.)
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0 indicates that the task is successful, and other values indicate that the task has failed. (This field is not recommended. Use the new error code field ErrCodeExt instead.)
     * @param ErrCode Error code. 0 indicates that the task is successful, and other values indicate that the task has failed. (This field is not recommended. Use the new error code field ErrCodeExt instead.)
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
     * Get Progress of the adaptive bitrate streaming task. Value range: 0-100. 
     * @return Progress Progress of the adaptive bitrate streaming task. Value range: 0-100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress of the adaptive bitrate streaming task. Value range: 0-100.
     * @param Progress Progress of the adaptive bitrate streaming task. Value range: 0-100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Input of the video to adaptive streaming task. 
     * @return Input Input of the video to adaptive streaming task.
     */
    public AdaptiveDynamicStreamingTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of the video to adaptive streaming task.
     * @param Input Input of the video to adaptive streaming task.
     */
    public void setInput(AdaptiveDynamicStreamingTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of a video to adaptive streaming task. 
     * @return Output Output of a video to adaptive streaming task.
     */
    public AdaptiveDynamicStreamingInfoItem getOutput() {
        return this.Output;
    }

    /**
     * Set Output of a video to adaptive streaming task.
     * @param Output Output of a video to adaptive streaming task.
     */
    public void setOutput(AdaptiveDynamicStreamingInfoItem Output) {
        this.Output = Output;
    }

    /**
     * Get Adaptive bitrate streaming task start execution time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return BeginProcessTime Adaptive bitrate streaming task start execution time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Adaptive bitrate streaming task start execution time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param BeginProcessTime Adaptive bitrate streaming task start execution time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get Task completion time of transcoding to adaptive bitstream in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return FinishTime Task completion time of transcoding to adaptive bitstream in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task completion time of transcoding to adaptive bitstream in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param FinishTime Task completion time of transcoding to adaptive bitstream in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public MediaProcessTaskAdaptiveDynamicStreamingResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult(MediaProcessTaskAdaptiveDynamicStreamingResult source) {
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
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new AdaptiveDynamicStreamingTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AdaptiveDynamicStreamingInfoItem(source.Output);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

