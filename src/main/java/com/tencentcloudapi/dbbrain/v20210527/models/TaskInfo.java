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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel{

    /**
    * Async task ID.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * List of all proxies of the current instance.
    */
    @SerializedName("InstProxyList")
    @Expose
    private String [] InstProxyList;

    /**
    * Total number of proxies of the current instance.
    */
    @SerializedName("InstProxyCount")
    @Expose
    private Long InstProxyCount;

    /**
    * Task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task status. Valid values: `created` (create), `chosen` (to be executed), `running` (being executed), `failed` (failed), and `finished` (completed).
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * IDs of the proxies that have completed the session killing tasks.
    */
    @SerializedName("FinishedProxyList")
    @Expose
    private String [] FinishedProxyList;

    /**
    * IDs of the proxies that failed to execute the session killing tasks.
    */
    @SerializedName("FailedProxyList")
    @Expose
    private String [] FailedProxyList;

    /**
    * Task end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task progress.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Async task ID. 
     * @return AsyncRequestId Async task ID.
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Async task ID.
     * @param AsyncRequestId Async task ID.
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get List of all proxies of the current instance. 
     * @return InstProxyList List of all proxies of the current instance.
     */
    public String [] getInstProxyList() {
        return this.InstProxyList;
    }

    /**
     * Set List of all proxies of the current instance.
     * @param InstProxyList List of all proxies of the current instance.
     */
    public void setInstProxyList(String [] InstProxyList) {
        this.InstProxyList = InstProxyList;
    }

    /**
     * Get Total number of proxies of the current instance. 
     * @return InstProxyCount Total number of proxies of the current instance.
     */
    public Long getInstProxyCount() {
        return this.InstProxyCount;
    }

    /**
     * Set Total number of proxies of the current instance.
     * @param InstProxyCount Total number of proxies of the current instance.
     */
    public void setInstProxyCount(Long InstProxyCount) {
        this.InstProxyCount = InstProxyCount;
    }

    /**
     * Get Task creation time. 
     * @return CreateTime Task creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time.
     * @param CreateTime Task creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task start time. 
     * @return StartTime Task start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time.
     * @param StartTime Task start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task status. Valid values: `created` (create), `chosen` (to be executed), `running` (being executed), `failed` (failed), and `finished` (completed). 
     * @return TaskStatus Task status. Valid values: `created` (create), `chosen` (to be executed), `running` (being executed), `failed` (failed), and `finished` (completed).
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status. Valid values: `created` (create), `chosen` (to be executed), `running` (being executed), `failed` (failed), and `finished` (completed).
     * @param TaskStatus Task status. Valid values: `created` (create), `chosen` (to be executed), `running` (being executed), `failed` (failed), and `finished` (completed).
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get IDs of the proxies that have completed the session killing tasks. 
     * @return FinishedProxyList IDs of the proxies that have completed the session killing tasks.
     */
    public String [] getFinishedProxyList() {
        return this.FinishedProxyList;
    }

    /**
     * Set IDs of the proxies that have completed the session killing tasks.
     * @param FinishedProxyList IDs of the proxies that have completed the session killing tasks.
     */
    public void setFinishedProxyList(String [] FinishedProxyList) {
        this.FinishedProxyList = FinishedProxyList;
    }

    /**
     * Get IDs of the proxies that failed to execute the session killing tasks. 
     * @return FailedProxyList IDs of the proxies that failed to execute the session killing tasks.
     */
    public String [] getFailedProxyList() {
        return this.FailedProxyList;
    }

    /**
     * Set IDs of the proxies that failed to execute the session killing tasks.
     * @param FailedProxyList IDs of the proxies that failed to execute the session killing tasks.
     */
    public void setFailedProxyList(String [] FailedProxyList) {
        this.FailedProxyList = FailedProxyList;
    }

    /**
     * Get Task end time. 
     * @return EndTime Task end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time.
     * @param EndTime Task end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task progress. 
     * @return Progress Task progress.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress.
     * @param Progress Task progress.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.InstProxyList != null) {
            this.InstProxyList = new String[source.InstProxyList.length];
            for (int i = 0; i < source.InstProxyList.length; i++) {
                this.InstProxyList[i] = new String(source.InstProxyList[i]);
            }
        }
        if (source.InstProxyCount != null) {
            this.InstProxyCount = new Long(source.InstProxyCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.FinishedProxyList != null) {
            this.FinishedProxyList = new String[source.FinishedProxyList.length];
            for (int i = 0; i < source.FinishedProxyList.length; i++) {
                this.FinishedProxyList[i] = new String(source.FinishedProxyList[i]);
            }
        }
        if (source.FailedProxyList != null) {
            this.FailedProxyList = new String[source.FailedProxyList.length];
            for (int i = 0; i < source.FailedProxyList.length; i++) {
                this.FailedProxyList[i] = new String(source.FailedProxyList[i]);
            }
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamArraySimple(map, prefix + "InstProxyList.", this.InstProxyList);
        this.setParamSimple(map, prefix + "InstProxyCount", this.InstProxyCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "FinishedProxyList.", this.FinishedProxyList);
        this.setParamArraySimple(map, prefix + "FailedProxyList.", this.FailedProxyList);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

