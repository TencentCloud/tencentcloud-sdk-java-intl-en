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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDetail extends AbstractModel {

    /**
    * Task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Task progress
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Task completion time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Subtask
    */
    @SerializedName("SubTasks")
    @Expose
    private SubTaskDetail [] SubTasks;

    /**
    * The task time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElapsedTime")
    @Expose
    private Long ElapsedTime;

    /**
     * Get Task name 
     * @return Name Task name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name
     * @param Name Task name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Task progress 
     * @return Progress Task progress
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress
     * @param Progress Task progress
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task completion time 
     * @return FinishTime Task completion time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task completion time
     * @param FinishTime Task completion time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Subtask 
     * @return SubTasks Subtask
     */
    public SubTaskDetail [] getSubTasks() {
        return this.SubTasks;
    }

    /**
     * Set Subtask
     * @param SubTasks Subtask
     */
    public void setSubTasks(SubTaskDetail [] SubTasks) {
        this.SubTasks = SubTasks;
    }

    /**
     * Get The task time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElapsedTime The task time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getElapsedTime() {
        return this.ElapsedTime;
    }

    /**
     * Set The task time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElapsedTime The task time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElapsedTime(Long ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
    }

    public TaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDetail(TaskDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.SubTasks != null) {
            this.SubTasks = new SubTaskDetail[source.SubTasks.length];
            for (int i = 0; i < source.SubTasks.length; i++) {
                this.SubTasks[i] = new SubTaskDetail(source.SubTasks[i]);
            }
        }
        if (source.ElapsedTime != null) {
            this.ElapsedTime = new Long(source.ElapsedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamArrayObj(map, prefix + "SubTasks.", this.SubTasks);
        this.setParamSimple(map, prefix + "ElapsedTime", this.ElapsedTime);

    }
}

