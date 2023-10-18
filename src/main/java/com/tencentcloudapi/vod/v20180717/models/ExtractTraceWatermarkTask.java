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

public class ExtractTraceWatermarkTask extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The task status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>40000: Invalid input parameter.</li>
<li>60000: Source file error (e.g., video data is corrupted).</li>
<li>70000: Internal server error. Please try again.</li>
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
    * The error code. An empty string indicates the task is successful; other values indicate that the task failed. For details, see [Video processing error codes](https://intl.cloud.tencent.com/document/product/266/39145?lang=en&pg=#video-processing).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * The information of a digital watermark extraction task.
    */
    @SerializedName("Input")
    @Expose
    private ExtractTraceWatermarkTaskInput Input;

    /**
    * The output of a digital watermark extraction task.
    */
    @SerializedName("Output")
    @Expose
    private ExtractTraceWatermarkTaskOutput Output;

    /**
    * The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get The task ID. 
     * @return TaskId The task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID.
     * @param TaskId The task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The task status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li> 
     * @return Status The task status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     * @param Status The task status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>40000: Invalid input parameter.</li>
<li>60000: Source file error (e.g., video data is corrupted).</li>
<li>70000: Internal server error. Please try again.</li> 
     * @return ErrCode The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>40000: Invalid input parameter.</li>
<li>60000: Source file error (e.g., video data is corrupted).</li>
<li>70000: Internal server error. Please try again.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>40000: Invalid input parameter.</li>
<li>60000: Source file error (e.g., video data is corrupted).</li>
<li>70000: Internal server error. Please try again.</li>
     * @param ErrCode The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>40000: Invalid input parameter.</li>
<li>60000: Source file error (e.g., video data is corrupted).</li>
<li>70000: Internal server error. Please try again.</li>
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
     * Get The information of a digital watermark extraction task. 
     * @return Input The information of a digital watermark extraction task.
     */
    public ExtractTraceWatermarkTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set The information of a digital watermark extraction task.
     * @param Input The information of a digital watermark extraction task.
     */
    public void setInput(ExtractTraceWatermarkTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get The output of a digital watermark extraction task. 
     * @return Output The output of a digital watermark extraction task.
     */
    public ExtractTraceWatermarkTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set The output of a digital watermark extraction task.
     * @param Output The output of a digital watermark extraction task.
     */
    public void setOutput(ExtractTraceWatermarkTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified. 
     * @return SessionId The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     * @param SessionId The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters. 
     * @return SessionContext The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
     * @param SessionContext The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public ExtractTraceWatermarkTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractTraceWatermarkTask(ExtractTraceWatermarkTask source) {
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
            this.Input = new ExtractTraceWatermarkTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new ExtractTraceWatermarkTaskOutput(source.Output);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
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

    }
}

