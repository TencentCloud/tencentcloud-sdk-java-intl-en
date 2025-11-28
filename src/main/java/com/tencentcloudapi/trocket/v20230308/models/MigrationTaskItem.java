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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationTaskItem extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0 - not specified (existing).
Metadata import.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Total number of topics.
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Total Number of Consumer Groups
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * Task status. 0: migrating; 1: migration successful; 2: migration completed, with only part of the data migrated.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

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

    /**
     * Get 0 - not specified (existing).
Metadata import. 
     * @return Type 0 - not specified (existing).
Metadata import.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 - not specified (existing).
Metadata import.
     * @param Type 0 - not specified (existing).
Metadata import.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Total number of topics. 
     * @return TopicNum Total number of topics.
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Total number of topics.
     * @param TopicNum Total number of topics.
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Total Number of Consumer Groups 
     * @return GroupNum Total Number of Consumer Groups
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set Total Number of Consumer Groups
     * @param GroupNum Total Number of Consumer Groups
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get Task status. 0: migrating; 1: migration successful; 2: migration completed, with only part of the data migrated. 
     * @return Status Task status. 0: migrating; 1: migration successful; 2: migration completed, with only part of the data migrated.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 0: migrating; 1: migration successful; 2: migration completed, with only part of the data migrated.
     * @param Status Task status. 0: migrating; 1: migration successful; 2: migration completed, with only part of the data migrated.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public MigrationTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationTaskItem(MigrationTaskItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

