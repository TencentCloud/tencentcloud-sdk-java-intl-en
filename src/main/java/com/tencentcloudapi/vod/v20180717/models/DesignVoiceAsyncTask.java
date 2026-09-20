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

public class DesignVoiceAsyncTask extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check the input parameters;</li><li>60000: source file error (for example, video data damage). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Error code. An empty string indicates success, and other values indicate failure. For values, see <a href="https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">video processing error code</a> list.</p>
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * <p>Timbre design task input information.</p>
    */
    @SerializedName("Input")
    @Expose
    private DesignVoiceAsyncInput Input;

    /**
    * <p>Timbre design task output information.</p>
    */
    @SerializedName("Output")
    @Expose
    private DesignVoiceAsyncOutput Output;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Pull upload progress, in the range of [0,100].</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li> 
     * @return Status <p>Task status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
     * @param Status <p>Task status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check the input parameters;</li><li>60000: source file error (for example, video data damage). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li> 
     * @return ErrCode <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check the input parameters;</li><li>60000: source file error (for example, video data damage). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check the input parameters;</li><li>60000: source file error (for example, video data damage). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
     * @param ErrCode <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check the input parameters;</li><li>60000: source file error (for example, video data damage). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Error message.</p> 
     * @return Message <p>Error message.</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Error message.</p>
     * @param Message <p>Error message.</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Error code. An empty string indicates success, and other values indicate failure. For values, see <a href="https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">video processing error code</a> list.</p> 
     * @return ErrCodeExt <p>Error code. An empty string indicates success, and other values indicate failure. For values, see <a href="https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">video processing error code</a> list.</p>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>Error code. An empty string indicates success, and other values indicate failure. For values, see <a href="https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">video processing error code</a> list.</p>
     * @param ErrCodeExt <p>Error code. An empty string indicates success, and other values indicate failure. For values, see <a href="https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">video processing error code</a> list.</p>
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get <p>Timbre design task input information.</p> 
     * @return Input <p>Timbre design task input information.</p>
     */
    public DesignVoiceAsyncInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Timbre design task input information.</p>
     * @param Input <p>Timbre design task input information.</p>
     */
    public void setInput(DesignVoiceAsyncInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>Timbre design task output information.</p> 
     * @return Output <p>Timbre design task output information.</p>
     */
    public DesignVoiceAsyncOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Timbre design task output information.</p>
     * @param Output <p>Timbre design task output information.</p>
     */
    public void setOutput(DesignVoiceAsyncOutput Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Pull upload progress, in the range of [0,100].</p> 
     * @return Progress <p>Pull upload progress, in the range of [0,100].</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Pull upload progress, in the range of [0,100].</p>
     * @param Progress <p>Pull upload progress, in the range of [0,100].</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public DesignVoiceAsyncTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignVoiceAsyncTask(DesignVoiceAsyncTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Input != null) {
            this.Input = new DesignVoiceAsyncInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new DesignVoiceAsyncOutput(source.Output);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

