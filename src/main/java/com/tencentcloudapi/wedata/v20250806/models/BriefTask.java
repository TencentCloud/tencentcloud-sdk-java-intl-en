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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BriefTask extends AbstractModel {

    /**
    * Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task owner id. a task may have multiple responsible persons.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUinList")
    @Expose
    private String [] OwnerUinList;

    /**
     * Get Task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Task creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task owner id. a task may have multiple responsible persons.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUinList Task owner id. a task may have multiple responsible persons.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOwnerUinList() {
        return this.OwnerUinList;
    }

    /**
     * Set Task owner id. a task may have multiple responsible persons.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUinList Task owner id. a task may have multiple responsible persons.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUinList(String [] OwnerUinList) {
        this.OwnerUinList = OwnerUinList;
    }

    public BriefTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BriefTask(BriefTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.OwnerUinList != null) {
            this.OwnerUinList = new String[source.OwnerUinList.length];
            for (int i = 0; i < source.OwnerUinList.length; i++) {
                this.OwnerUinList[i] = new String(source.OwnerUinList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "OwnerUinList.", this.OwnerUinList);

    }
}

