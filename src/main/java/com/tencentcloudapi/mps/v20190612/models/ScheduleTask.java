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

public class ScheduleTask extends AbstractModel {

    /**
    * Orchestration task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
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
    * 
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 
    */
    @SerializedName("ActivityResultSet")
    @Expose
    private ActivityResult [] ActivityResultSet;

    /**
     * Get Orchestration task ID. 
     * @return TaskId Orchestration task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Orchestration task ID.
     * @param TaskId Orchestration task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li> 
     * @return Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     * @param Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
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
     * Get  
     * @return InputInfo 
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 
     * @param InputInfo 
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get  
     * @return MetaData 
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 
     * @param MetaData 
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get  
     * @return ActivityResultSet 
     */
    public ActivityResult [] getActivityResultSet() {
        return this.ActivityResultSet;
    }

    /**
     * Set 
     * @param ActivityResultSet 
     */
    public void setActivityResultSet(ActivityResult [] ActivityResultSet) {
        this.ActivityResultSet = ActivityResultSet;
    }

    public ScheduleTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleTask(ScheduleTask source) {
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
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.ActivityResultSet != null) {
            this.ActivityResultSet = new ActivityResult[source.ActivityResultSet.length];
            for (int i = 0; i < source.ActivityResultSet.length; i++) {
                this.ActivityResultSet[i] = new ActivityResult(source.ActivityResultSet[i]);
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
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "ActivityResultSet.", this.ActivityResultSet);

    }
}

