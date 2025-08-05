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

public class LiveScheduleTask extends AbstractModel {

    /**
    * Live orchestration task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task stream status. Valid values:
<li>PROCESSING: processing</li>
<li>FINISH: completed</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Live stream URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The task output.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveActivityResultSet")
    @Expose
    private LiveActivityResult [] LiveActivityResultSet;

    /**
     * Get Live orchestration task ID. 
     * @return TaskId Live orchestration task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Live orchestration task ID.
     * @param TaskId Live orchestration task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task stream status. Valid values:
<li>PROCESSING: processing</li>
<li>FINISH: completed</li> 
     * @return Status Task stream status. Valid values:
<li>PROCESSING: processing</li>
<li>FINISH: completed</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task stream status. Valid values:
<li>PROCESSING: processing</li>
<li>FINISH: completed</li>
     * @param Status Task stream status. Valid values:
<li>PROCESSING: processing</li>
<li>FINISH: completed</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned. 
     * @return ErrCode An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
     * @param ErrCode An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task. 
     * @return Message The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
     * @param Message The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Live stream URL. 
     * @return Url Live stream URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Live stream URL.
     * @param Url Live stream URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The task output.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LiveActivityResultSet The task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveActivityResult [] getLiveActivityResultSet() {
        return this.LiveActivityResultSet;
    }

    /**
     * Set The task output.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LiveActivityResultSet The task output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLiveActivityResultSet(LiveActivityResult [] LiveActivityResultSet) {
        this.LiveActivityResultSet = LiveActivityResultSet;
    }

    public LiveScheduleTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveScheduleTask(LiveScheduleTask source) {
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
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.LiveActivityResultSet != null) {
            this.LiveActivityResultSet = new LiveActivityResult[source.LiveActivityResultSet.length];
            for (int i = 0; i < source.LiveActivityResultSet.length; i++) {
                this.LiveActivityResultSet[i] = new LiveActivityResult(source.LiveActivityResultSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "LiveActivityResultSet.", this.LiveActivityResultSet);

    }
}

