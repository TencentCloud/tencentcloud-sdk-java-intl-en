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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaProcessTaskTranscodeResult extends AbstractModel {

    /**
    * Task status. Valid values: PROCESSING, SUCCESS, FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The error code. An empty string indicates the task is successful; any other value returned indicates the task failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
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
    * Input for a transcoding task.
    */
    @SerializedName("Input")
    @Expose
    private TranscodeTaskInput Input;

    /**
    * Output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private MediaTranscodeItem Output;

    /**
    * Transcoding progress. Value range: 0-100
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

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
     * Get The error code. An empty string indicates the task is successful; any other value returned indicates the task failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249). 
     * @return ErrCodeExt The error code. An empty string indicates the task is successful; any other value returned indicates the task failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set The error code. An empty string indicates the task is successful; any other value returned indicates the task failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
     * @param ErrCodeExt The error code. An empty string indicates the task is successful; any other value returned indicates the task failed. For details, see [Error Codes](https://intl.cloud.tencent.com/document/product/1041/40249).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt. 
     * @return ErrCode Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
     * @param ErrCode Error code. 0 indicates the task is successful; otherwise it is failed. This parameter is no longer recommended. Consider using the new error code parameter ErrCodeExt.
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
     * Get Input for a transcoding task. 
     * @return Input Input for a transcoding task.
     */
    public TranscodeTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input for a transcoding task.
     * @param Input Input for a transcoding task.
     */
    public void setInput(TranscodeTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaTranscodeItem getOutput() {
        return this.Output;
    }

    /**
     * Set Output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Output of a transcoding task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(MediaTranscodeItem Output) {
        this.Output = Output;
    }

    /**
     * Get Transcoding progress. Value range: 0-100
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Progress Transcoding progress. Value range: 0-100
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Transcoding progress. Value range: 0-100
Note: This field may return `null`, indicating that no valid value was found.
     * @param Progress Transcoding progress. Value range: 0-100
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public MediaProcessTaskTranscodeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskTranscodeResult(MediaProcessTaskTranscodeResult source) {
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
            this.Input = new TranscodeTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new MediaTranscodeItem(source.Output);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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

    }
}

