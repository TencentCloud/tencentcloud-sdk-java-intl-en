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

public class UpdateTaskBaseAttributePart extends AbstractModel {

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task owner ID.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Task description
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" classification, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
    */
    @SerializedName("TaskFolderPath")
    @Expose
    private String TaskFolderPath;

    /**
     * Get Task name. 
     * @return TaskName Task name.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
     * @param TaskName Task name.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task owner ID. 
     * @return OwnerUin Task owner ID.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Task owner ID.
     * @param OwnerUin Task owner ID.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Task description 
     * @return TaskDescription Task description
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set Task description
     * @param TaskDescription Task description
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" classification, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed. 
     * @return TaskFolderPath Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" classification, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
     */
    public String getTaskFolderPath() {
        return this.TaskFolderPath;
    }

    /**
     * Set Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" classification, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
     * @param TaskFolderPath Note:.
-Do not fill in the task node type in the path. for example, in a workflow named wf01, under the "common" classification, if you want to create a new shell task under the tf_01 folder in this classification, just fill in /tf_01.
-If the tf_01 folder does not exist, first create this folder (use the CreateTaskFolder api) for the operation to succeed.
     */
    public void setTaskFolderPath(String TaskFolderPath) {
        this.TaskFolderPath = TaskFolderPath;
    }

    public UpdateTaskBaseAttributePart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTaskBaseAttributePart(UpdateTaskBaseAttributePart source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskFolderPath != null) {
            this.TaskFolderPath = new String(source.TaskFolderPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskFolderPath", this.TaskFolderPath);

    }
}

