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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfoNew extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task type
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * ID of TcaplusDB internal transaction associated with task
    */
    @SerializedName("TransId")
    @Expose
    private String TransId;

    /**
    * ID of the cluster where a task resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Name of the cluster where a task resides
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Task progress
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Task creation time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task last modified time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Task details
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task type 
     * @return TaskType Task type
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type
     * @param TaskType Task type
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get ID of TcaplusDB internal transaction associated with task 
     * @return TransId ID of TcaplusDB internal transaction associated with task
     */
    public String getTransId() {
        return this.TransId;
    }

    /**
     * Set ID of TcaplusDB internal transaction associated with task
     * @param TransId ID of TcaplusDB internal transaction associated with task
     */
    public void setTransId(String TransId) {
        this.TransId = TransId;
    }

    /**
     * Get ID of the cluster where a task resides 
     * @return ClusterId ID of the cluster where a task resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where a task resides
     * @param ClusterId ID of the cluster where a task resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Name of the cluster where a task resides 
     * @return ClusterName Name of the cluster where a task resides
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Name of the cluster where a task resides
     * @param ClusterName Name of the cluster where a task resides
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Task progress 
     * @return Progress Task progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress
     * @param Progress Task progress
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task creation time 
     * @return StartTime Task creation time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task creation time
     * @param StartTime Task creation time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task last modified time 
     * @return UpdateTime Task last modified time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task last modified time
     * @param UpdateTime Task last modified time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Task details 
     * @return Content Task details
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Task details
     * @param Content Task details
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public TaskInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoNew(TaskInfoNew source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TransId != null) {
            this.TransId = new String(source.TransId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TransId", this.TransId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

