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

public class PureSubtitleTransResult extends AbstractModel {

    /**
    * Task status (the three valid values are as follows):
- PROCESSING
- SUCCESS 
- FAIL
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
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
    * Error message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Translation task input information.
    */
    @SerializedName("Input")
    @Expose
    private SmartSubtitleTaskResultInput Input;

    /**
    * Translation output result of pure subtitle files.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private PureSubtitleTransResultOutput Output;

    /**
    * Task progress.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get Task status (the three valid values are as follows):
- PROCESSING
- SUCCESS 
- FAIL 
     * @return Status Task status (the three valid values are as follows):
- PROCESSING
- SUCCESS 
- FAIL
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status (the three valid values are as follows):
- PROCESSING
- SUCCESS 
- FAIL
     * @param Status Task status (the three valid values are as follows):
- PROCESSING
- SUCCESS 
- FAIL
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes. 
     * @return ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
     * @param ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of Media Processing Service (MPS) error codes.
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
     * Get Error message 
     * @return Message Error message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message
     * @param Message Error message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Translation task input information. 
     * @return Input Translation task input information.
     */
    public SmartSubtitleTaskResultInput getInput() {
        return this.Input;
    }

    /**
     * Set Translation task input information.
     * @param Input Translation task input information.
     */
    public void setInput(SmartSubtitleTaskResultInput Input) {
        this.Input = Input;
    }

    /**
     * Get Translation output result of pure subtitle files.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Translation output result of pure subtitle files.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PureSubtitleTransResultOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Translation output result of pure subtitle files.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Translation output result of pure subtitle files.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(PureSubtitleTransResultOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Task progress. 
     * @return Progress Task progress.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress.
     * @param Progress Task progress.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public PureSubtitleTransResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PureSubtitleTransResult(PureSubtitleTransResult source) {
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
            this.Input = new SmartSubtitleTaskResultInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new PureSubtitleTransResultOutput(source.Output);
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

