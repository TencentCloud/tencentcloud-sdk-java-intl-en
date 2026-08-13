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

public class AigcTaskListItem extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task type</p><p>Enumeration value:</p><ul><li>VideoRedraw: Video redraw task</li><li>AIDrama: AI drama task</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>Task status</p><p>Enumeration values:</p><ul><li>PENDING: Task waiting for scheduling</li><li>RUNNING: Task running</li><li>FINISHED: Task executed successfully</li><li>STOP: Task termination</li><li>FAILED: Task failure</li><li>TIMEOUT: Task timeout</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>Task creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Task start scheduling time</p>
    */
    @SerializedName("ScheduledTime")
    @Expose
    private String ScheduledTime;

    /**
    * <p>Task end time</p>
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
    * <p>Task result Url.</p>
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * <p>Task execution error code</p>
    */
    @SerializedName("TaskResultCode")
    @Expose
    private Long TaskResultCode;

    /**
    * <p>Task execution error message</p>
    */
    @SerializedName("TaskResultMsg")
    @Expose
    private String TaskResultMsg;

    /**
    * <p>Output video resolution</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Aspect ratio of the output video</p>
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>Task request package</p>
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

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
     * Get <p>Task type</p><p>Enumeration value:</p><ul><li>VideoRedraw: Video redraw task</li><li>AIDrama: AI drama task</li></ul> 
     * @return TaskType <p>Task type</p><p>Enumeration value:</p><ul><li>VideoRedraw: Video redraw task</li><li>AIDrama: AI drama task</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type</p><p>Enumeration value:</p><ul><li>VideoRedraw: Video redraw task</li><li>AIDrama: AI drama task</li></ul>
     * @param TaskType <p>Task type</p><p>Enumeration value:</p><ul><li>VideoRedraw: Video redraw task</li><li>AIDrama: AI drama task</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Task status</p><p>Enumeration values:</p><ul><li>PENDING: Task waiting for scheduling</li><li>RUNNING: Task running</li><li>FINISHED: Task executed successfully</li><li>STOP: Task termination</li><li>FAILED: Task failure</li><li>TIMEOUT: Task timeout</li></ul> 
     * @return TaskStatus <p>Task status</p><p>Enumeration values:</p><ul><li>PENDING: Task waiting for scheduling</li><li>RUNNING: Task running</li><li>FINISHED: Task executed successfully</li><li>STOP: Task termination</li><li>FAILED: Task failure</li><li>TIMEOUT: Task timeout</li></ul>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Task status</p><p>Enumeration values:</p><ul><li>PENDING: Task waiting for scheduling</li><li>RUNNING: Task running</li><li>FINISHED: Task executed successfully</li><li>STOP: Task termination</li><li>FAILED: Task failure</li><li>TIMEOUT: Task timeout</li></ul>
     * @param TaskStatus <p>Task status</p><p>Enumeration values:</p><ul><li>PENDING: Task waiting for scheduling</li><li>RUNNING: Task running</li><li>FINISHED: Task executed successfully</li><li>STOP: Task termination</li><li>FAILED: Task failure</li><li>TIMEOUT: Task timeout</li></ul>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Task creation time</p> 
     * @return CreateTime <p>Task creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time</p>
     * @param CreateTime <p>Task creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Task start scheduling time</p> 
     * @return ScheduledTime <p>Task start scheduling time</p>
     */
    public String getScheduledTime() {
        return this.ScheduledTime;
    }

    /**
     * Set <p>Task start scheduling time</p>
     * @param ScheduledTime <p>Task start scheduling time</p>
     */
    public void setScheduledTime(String ScheduledTime) {
        this.ScheduledTime = ScheduledTime;
    }

    /**
     * Get <p>Task end time</p> 
     * @return FinishedTime <p>Task end time</p>
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set <p>Task end time</p>
     * @param FinishedTime <p>Task end time</p>
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get <p>Task result Url.</p> 
     * @return Urls <p>Task result Url.</p>
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set <p>Task result Url.</p>
     * @param Urls <p>Task result Url.</p>
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get <p>Task execution error code</p> 
     * @return TaskResultCode <p>Task execution error code</p>
     */
    public Long getTaskResultCode() {
        return this.TaskResultCode;
    }

    /**
     * Set <p>Task execution error code</p>
     * @param TaskResultCode <p>Task execution error code</p>
     */
    public void setTaskResultCode(Long TaskResultCode) {
        this.TaskResultCode = TaskResultCode;
    }

    /**
     * Get <p>Task execution error message</p> 
     * @return TaskResultMsg <p>Task execution error message</p>
     */
    public String getTaskResultMsg() {
        return this.TaskResultMsg;
    }

    /**
     * Set <p>Task execution error message</p>
     * @param TaskResultMsg <p>Task execution error message</p>
     */
    public void setTaskResultMsg(String TaskResultMsg) {
        this.TaskResultMsg = TaskResultMsg;
    }

    /**
     * Get <p>Output video resolution</p> 
     * @return Resolution <p>Output video resolution</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Output video resolution</p>
     * @param Resolution <p>Output video resolution</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Aspect ratio of the output video</p> 
     * @return Ratio <p>Aspect ratio of the output video</p>
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>Aspect ratio of the output video</p>
     * @param Ratio <p>Aspect ratio of the output video</p>
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>Task request package</p> 
     * @return RequestBody <p>Task request package</p>
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set <p>Task request package</p>
     * @param RequestBody <p>Task request package</p>
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    public AigcTaskListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcTaskListItem(AigcTaskListItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScheduledTime != null) {
            this.ScheduledTime = new String(source.ScheduledTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.TaskResultCode != null) {
            this.TaskResultCode = new Long(source.TaskResultCode);
        }
        if (source.TaskResultMsg != null) {
            this.TaskResultMsg = new String(source.TaskResultMsg);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScheduledTime", this.ScheduledTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "TaskResultCode", this.TaskResultCode);
        this.setParamSimple(map, prefix + "TaskResultMsg", this.TaskResultMsg);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);

    }
}

