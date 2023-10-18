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

public class RebuildMediaTask extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The task flow status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH`</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>`40000`: Invalid input parameter.</li>
<li>`60000`: Source file error (e.g., video data is corrupted).</li>
<li>`70000`: Internal server error. Please try again.</li>
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
    * The task progress. Value range: 0-100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * The input parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private RebuildMediaTaskInput Input;

    /**
    * The output parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private RebuildMediaTaskOutput Output;

    /**
    * The metadata of the output file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

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
     * Get The task flow status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH`</li> 
     * @return Status The task flow status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH`</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task flow status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH`</li>
     * @param Status The task flow status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH`</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>`40000`: Invalid input parameter.</li>
<li>`60000`: Source file error (e.g., video data is corrupted).</li>
<li>`70000`: Internal server error. Please try again.</li> 
     * @return ErrCode The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>`40000`: Invalid input parameter.</li>
<li>`60000`: Source file error (e.g., video data is corrupted).</li>
<li>`70000`: Internal server error. Please try again.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>`40000`: Invalid input parameter.</li>
<li>`60000`: Source file error (e.g., video data is corrupted).</li>
<li>`70000`: Internal server error. Please try again.</li>
     * @param ErrCode The error code. `0` indicates the task is successful. Other values indicate that the task failed.
<li>`40000`: Invalid input parameter.</li>
<li>`60000`: Source file error (e.g., video data is corrupted).</li>
<li>`70000`: Internal server error. Please try again.</li>
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
     * Get The task progress. Value range: 0-100. 
     * @return Progress The task progress. Value range: 0-100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set The task progress. Value range: 0-100.
     * @param Progress The task progress. Value range: 0-100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get The input parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Input The input parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set The input parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Input The input parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInput(RebuildMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get The output parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output The output parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildMediaTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set The output parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output The output parameters of the audio/video remastering task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(RebuildMediaTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get The metadata of the output file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaData The metadata of the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set The metadata of the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaData The metadata of the output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
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

    public RebuildMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTask(RebuildMediaTask source) {
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
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new RebuildMediaTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new RebuildMediaTaskOutput(source.Output);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

