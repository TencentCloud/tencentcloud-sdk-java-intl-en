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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * Task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Status of the task
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Resource
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Task type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task completion time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Task ID 
     * @return JobId Task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID
     * @param JobId Task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Status of the task 
     * @return Status Status of the task
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the task
     * @param Status Status of the task
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Resource 
     * @return Target Resource
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Resource
     * @param Target Resource
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Task type 
     * @return Type Task type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type
     * @param Type Task type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task completion time 
     * @return UpdateTime Task completion time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task completion time
     * @param UpdateTime Task completion time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

