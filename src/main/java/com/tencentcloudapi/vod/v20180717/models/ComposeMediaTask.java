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

public class ComposeMediaTask extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task flow status. Valid values:
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Progress of a media file composing task. Value range: [0, 100]
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Input of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private ComposeMediaTaskInput Input;

    /**
    * Output of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private ComposeMediaTaskOutput Output;

    /**
    * The metadata of the output video.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task flow status. Valid values:
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Task flow status. Valid values:
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task flow status. Valid values:
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Task flow status. Valid values:
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Progress of a media file composing task. Value range: [0, 100] 
     * @return Progress Progress of a media file composing task. Value range: [0, 100]
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress of a media file composing task. Value range: [0, 100]
     * @param Progress Progress of a media file composing task. Value range: [0, 100]
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Input of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Input Input of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ComposeMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Input Input of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInput(ComposeMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Output Output of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ComposeMediaTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Output Output of media file composing task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(ComposeMediaTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get The metadata of the output video.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return MetaData The metadata of the output video.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set The metadata of the output video.
Note: This field may return `null`, indicating that no valid value was found.
     * @param MetaData The metadata of the output video.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed. 
     * @return SessionId ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
     * @param SessionId ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is not carried or is left empty, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters. 
     * @return SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
     * @param SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this parameter. It can contain up to 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public ComposeMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaTask(ComposeMediaTask source) {
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
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new ComposeMediaTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new ComposeMediaTaskOutput(source.Output);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

