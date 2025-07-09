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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTask extends AbstractModel {

    /**
    * Task auto-increment ID.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task type
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Status of tasks.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Task ID (cluster ID | instance group ID | instance ID).
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * Task type
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
     * Get Task auto-increment ID. 
     * @return TaskId Task auto-increment ID.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task auto-increment ID.
     * @param TaskId Task auto-increment ID.
     */
    public void setTaskId(Long TaskId) {
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
     * Get Status of tasks. 
     * @return TaskStatus Status of tasks.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Status of tasks.
     * @param TaskStatus Status of tasks.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task ID (cluster ID | instance group ID | instance ID). 
     * @return ObjectId Task ID (cluster ID | instance group ID | instance ID).
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set Task ID (cluster ID | instance group ID | instance ID).
     * @param ObjectId Task ID (cluster ID | instance group ID | instance ID).
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get Task type 
     * @return ObjectType Task type
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Task type
     * @param ObjectType Task type
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    public ObjectTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectTask(ObjectTask source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);

    }
}

