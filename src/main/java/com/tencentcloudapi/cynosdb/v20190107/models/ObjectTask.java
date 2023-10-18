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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTask extends AbstractModel {

    /**
    * Auto-Incrementing task ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Task ID (cluster ID | instance group ID | instance ID)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * Task type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
     * Get Auto-Incrementing task ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Auto-Incrementing task ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Auto-Incrementing task ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskId Auto-Incrementing task ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskType Task type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskType Task type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatus Task status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskStatus Task status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task ID (cluster ID | instance group ID | instance ID)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ObjectId Task ID (cluster ID | instance group ID | instance ID)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set Task ID (cluster ID | instance group ID | instance ID)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ObjectId Task ID (cluster ID | instance group ID | instance ID)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get Task type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ObjectType Task type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Task type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ObjectType Task type
Note: this field may return null, indicating that no valid values can be obtained.
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

