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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLifecycleDataTaskRequest extends AbstractModel {

    /**
    * File system unique ID.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Lifecycle task type; archive: settlement; restore: preheating; release: data release; metaload: metadata loading.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The path or file to be settled supports passing only one path and cannot be empty.
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Data flow ID. this api can be accessed through DescribeDataFlow.
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * When a file in CFS Turbo and an external storage have the same name, whether to overwrite. true: overwrite. false: not overwrite (at the same time, data storage will not be released). default false when empty.
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
     * Get File system unique ID. 
     * @return FileSystemId File system unique ID.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system unique ID.
     * @param FileSystemId File system unique ID.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Lifecycle task type; archive: settlement; restore: preheating; release: data release; metaload: metadata loading. 
     * @return Type Lifecycle task type; archive: settlement; restore: preheating; release: data release; metaload: metadata loading.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Lifecycle task type; archive: settlement; restore: preheating; release: data release; metaload: metadata loading.
     * @param Type Lifecycle task type; archive: settlement; restore: preheating; release: data release; metaload: metadata loading.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The path or file to be settled supports passing only one path and cannot be empty. 
     * @return TaskPath The path or file to be settled supports passing only one path and cannot be empty.
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set The path or file to be settled supports passing only one path and cannot be empty.
     * @param TaskPath The path or file to be settled supports passing only one path and cannot be empty.
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

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
     * Get Data flow ID. this api can be accessed through DescribeDataFlow. 
     * @return DataFlowId Data flow ID. this api can be accessed through DescribeDataFlow.
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set Data flow ID. this api can be accessed through DescribeDataFlow.
     * @param DataFlowId Data flow ID. this api can be accessed through DescribeDataFlow.
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get When a file in CFS Turbo and an external storage have the same name, whether to overwrite. true: overwrite. false: not overwrite (at the same time, data storage will not be released). default false when empty. 
     * @return IsOverwrite When a file in CFS Turbo and an external storage have the same name, whether to overwrite. true: overwrite. false: not overwrite (at the same time, data storage will not be released). default false when empty.
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set When a file in CFS Turbo and an external storage have the same name, whether to overwrite. true: overwrite. false: not overwrite (at the same time, data storage will not be released). default false when empty.
     * @param IsOverwrite When a file in CFS Turbo and an external storage have the same name, whether to overwrite. true: overwrite. false: not overwrite (at the same time, data storage will not be released). default false when empty.
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    public CreateLifecycleDataTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLifecycleDataTaskRequest(CreateLifecycleDataTaskRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);

    }
}

