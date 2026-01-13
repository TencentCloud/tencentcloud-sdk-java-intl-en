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

public class SmartSubtitleTaskFullTextResult extends AbstractModel {

    /**
    * Task status, which can be PROCESSING, SUCCESS, or FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of [MPS error codes](https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
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
    * Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private SmartSubtitleTaskResultInput Input;

    /**
    * Output information for smart subtitle tasks.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private SmartSubtitleTaskTextResultOutput Output;

    /**
    * Task progress.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get Task status, which can be PROCESSING, SUCCESS, or FAIL. 
     * @return Status Task status, which can be PROCESSING, SUCCESS, or FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, which can be PROCESSING, SUCCESS, or FAIL.
     * @param Status Task status, which can be PROCESSING, SUCCESS, or FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of [MPS error codes](https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81). 
     * @return ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of [MPS error codes](https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of [MPS error codes](https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     * @param ErrCodeExt Error code. A null string indicates that the task is successful, while other values indicate that the task has failed. For valid values, see the list of [MPS error codes](https://www.tencentcloud.com/document/product/862/50369?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
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
     * Get Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Input Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartSubtitleTaskResultInput getInput() {
        return this.Input;
    }

    /**
     * Set Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Input Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInput(SmartSubtitleTaskResultInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output information for smart subtitle tasks.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Output information for smart subtitle tasks.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartSubtitleTaskTextResultOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output information for smart subtitle tasks.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Output information for smart subtitle tasks.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(SmartSubtitleTaskTextResultOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Task progress.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Task progress.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Task progress.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public SmartSubtitleTaskFullTextResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskFullTextResult(SmartSubtitleTaskFullTextResult source) {
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
            this.Output = new SmartSubtitleTaskTextResultOutput(source.Output);
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

