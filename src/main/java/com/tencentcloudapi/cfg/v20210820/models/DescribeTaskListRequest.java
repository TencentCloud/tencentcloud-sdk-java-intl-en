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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskListRequest extends AbstractModel {

    /**
    * Pagination limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Experiment name
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * Tag key
    */
    @SerializedName("TaskTag")
    @Expose
    private String [] TaskTag;

    /**
    * Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Start time, in fixed format: %Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * End time, in fixed format: %Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * Update time, in fixed format: %Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskUpdateTime")
    @Expose
    private String TaskUpdateTime;

    /**
    * Tag pair
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
    * Filtering criteria
    */
    @SerializedName("Filters")
    @Expose
    private ActionFilter [] Filters;

    /**
    * Experiment ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long [] TaskId;

    /**
    * ID of the associated application for filtering
    */
    @SerializedName("ApplicationId")
    @Expose
    private String [] ApplicationId;

    /**
    * Associated application for filtering
    */
    @SerializedName("ApplicationName")
    @Expose
    private String [] ApplicationName;

    /**
    * Task status for filtering, supporting multiple states (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
    */
    @SerializedName("TaskStatusList")
    @Expose
    private Long [] TaskStatusList;

    /**
     * Get Pagination limit 
     * @return Limit Pagination limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit
     * @param Limit Pagination limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Experiment name 
     * @return TaskTitle Experiment name
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set Experiment name
     * @param TaskTitle Experiment name
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get Tag key 
     * @return TaskTag Tag key
     */
    public String [] getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set Tag key
     * @param TaskTag Tag key
     */
    public void setTaskTag(String [] TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended) 
     * @return TaskStatus Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     * @param TaskStatus Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Start time, in fixed format: %Y-%m-%d %H:%M:%S 
     * @return TaskStartTime Start time, in fixed format: %Y-%m-%d %H:%M:%S
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set Start time, in fixed format: %Y-%m-%d %H:%M:%S
     * @param TaskStartTime Start time, in fixed format: %Y-%m-%d %H:%M:%S
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get End time, in fixed format: %Y-%m-%d %H:%M:%S 
     * @return TaskEndTime End time, in fixed format: %Y-%m-%d %H:%M:%S
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set End time, in fixed format: %Y-%m-%d %H:%M:%S
     * @param TaskEndTime End time, in fixed format: %Y-%m-%d %H:%M:%S
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get Update time, in fixed format: %Y-%m-%d %H:%M:%S 
     * @return TaskUpdateTime Update time, in fixed format: %Y-%m-%d %H:%M:%S
     */
    public String getTaskUpdateTime() {
        return this.TaskUpdateTime;
    }

    /**
     * Set Update time, in fixed format: %Y-%m-%d %H:%M:%S
     * @param TaskUpdateTime Update time, in fixed format: %Y-%m-%d %H:%M:%S
     */
    public void setTaskUpdateTime(String TaskUpdateTime) {
        this.TaskUpdateTime = TaskUpdateTime;
    }

    /**
     * Get Tag pair 
     * @return Tags Tag pair
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag pair
     * @param Tags Tag pair
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Filtering criteria 
     * @return Filters Filtering criteria
     */
    public ActionFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
     * @param Filters Filtering criteria
     */
    public void setFilters(ActionFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Experiment ID 
     * @return TaskId Experiment ID
     */
    public Long [] getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Experiment ID
     * @param TaskId Experiment ID
     */
    public void setTaskId(Long [] TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get ID of the associated application for filtering 
     * @return ApplicationId ID of the associated application for filtering
     */
    public String [] getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set ID of the associated application for filtering
     * @param ApplicationId ID of the associated application for filtering
     */
    public void setApplicationId(String [] ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Associated application for filtering 
     * @return ApplicationName Associated application for filtering
     */
    public String [] getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Associated application for filtering
     * @param ApplicationName Associated application for filtering
     */
    public void setApplicationName(String [] ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Task status for filtering, supporting multiple states (1001: not started; 1002: in progress; 1003: paused; 1004: ended) 
     * @return TaskStatusList Task status for filtering, supporting multiple states (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     */
    public Long [] getTaskStatusList() {
        return this.TaskStatusList;
    }

    /**
     * Set Task status for filtering, supporting multiple states (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     * @param TaskStatusList Task status for filtering, supporting multiple states (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     */
    public void setTaskStatusList(Long [] TaskStatusList) {
        this.TaskStatusList = TaskStatusList;
    }

    public DescribeTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskListRequest(DescribeTaskListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskTag != null) {
            this.TaskTag = new String[source.TaskTag.length];
            for (int i = 0; i < source.TaskTag.length; i++) {
                this.TaskTag[i] = new String(source.TaskTag[i]);
            }
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.TaskUpdateTime != null) {
            this.TaskUpdateTime = new String(source.TaskUpdateTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new ActionFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ActionFilter(source.Filters[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new Long[source.TaskId.length];
            for (int i = 0; i < source.TaskId.length; i++) {
                this.TaskId[i] = new Long(source.TaskId[i]);
            }
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String[source.ApplicationId.length];
            for (int i = 0; i < source.ApplicationId.length; i++) {
                this.ApplicationId[i] = new String(source.ApplicationId[i]);
            }
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String[source.ApplicationName.length];
            for (int i = 0; i < source.ApplicationName.length; i++) {
                this.ApplicationName[i] = new String(source.ApplicationName[i]);
            }
        }
        if (source.TaskStatusList != null) {
            this.TaskStatusList = new Long[source.TaskStatusList.length];
            for (int i = 0; i < source.TaskStatusList.length; i++) {
                this.TaskStatusList[i] = new Long(source.TaskStatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamArraySimple(map, prefix + "TaskTag.", this.TaskTag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "TaskUpdateTime", this.TaskUpdateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "TaskId.", this.TaskId);
        this.setParamArraySimple(map, prefix + "ApplicationId.", this.ApplicationId);
        this.setParamArraySimple(map, prefix + "ApplicationName.", this.ApplicationName);
        this.setParamArraySimple(map, prefix + "TaskStatusList.", this.TaskStatusList);

    }
}

