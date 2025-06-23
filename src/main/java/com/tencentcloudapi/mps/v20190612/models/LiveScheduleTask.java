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

public class LiveScheduleTask extends AbstractModel {

    /**
    * The ID of a live scheme subtask.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The task status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH` </li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * If the value returned is not `0`, there was a source error. If `0` is returned, refer to the error codes of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * If there was a source error, this parameter is the error message. For other errors, refer to the error messages of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The URL of the live stream.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get The ID of a live scheme subtask.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId The ID of a live scheme subtask.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The ID of a live scheme subtask.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId The ID of a live scheme subtask.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The task status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH` </li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The task status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH` </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH` </li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The task status. Valid values:
<li>`PROCESSING`</li>
<li>`FINISH` </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get If the value returned is not `0`, there was a source error. If `0` is returned, refer to the error codes of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrCode If the value returned is not `0`, there was a source error. If `0` is returned, refer to the error codes of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set If the value returned is not `0`, there was a source error. If `0` is returned, refer to the error codes of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrCode If the value returned is not `0`, there was a source error. If `0` is returned, refer to the error codes of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get If there was a source error, this parameter is the error message. For other errors, refer to the error messages of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message If there was a source error, this parameter is the error message. For other errors, refer to the error messages of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set If there was a source error, this parameter is the error message. For other errors, refer to the error messages of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message If there was a source error, this parameter is the error message. For other errors, refer to the error messages of the corresponding task type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The URL of the live stream.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url The URL of the live stream.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL of the live stream.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url The URL of the live stream.
Note: This field may return null, indicating that no valid values can be obtained.
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

