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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResult extends AbstractModel {

    /**
    * This field is used to return the `DataId` passed in within the `TaskInput` structure when a video moderation task is created. It is used to identify the specific moderation task.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * This field is used to return the ID of a video moderation task for identification, query, and management of moderation tasks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * This field is used to return the task creation status. If `OK` is returned, the task has been created successfully; if another value is returned, refer to the common error codes.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * **This field will take effect only when the returned value of `Code` is an error code**. It is used to return the error message.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get This field is used to return the `DataId` passed in within the `TaskInput` structure when a video moderation task is created. It is used to identify the specific moderation task.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataId This field is used to return the `DataId` passed in within the `TaskInput` structure when a video moderation task is created. It is used to identify the specific moderation task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set This field is used to return the `DataId` passed in within the `TaskInput` structure when a video moderation task is created. It is used to identify the specific moderation task.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataId This field is used to return the `DataId` passed in within the `TaskInput` structure when a video moderation task is created. It is used to identify the specific moderation task.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get This field is used to return the ID of a video moderation task for identification, query, and management of moderation tasks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskId This field is used to return the ID of a video moderation task for identification, query, and management of moderation tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set This field is used to return the ID of a video moderation task for identification, query, and management of moderation tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskId This field is used to return the ID of a video moderation task for identification, query, and management of moderation tasks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get This field is used to return the task creation status. If `OK` is returned, the task has been created successfully; if another value is returned, refer to the common error codes.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Code This field is used to return the task creation status. If `OK` is returned, the task has been created successfully; if another value is returned, refer to the common error codes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set This field is used to return the task creation status. If `OK` is returned, the task has been created successfully; if another value is returned, refer to the common error codes.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Code This field is used to return the task creation status. If `OK` is returned, the task has been created successfully; if another value is returned, refer to the common error codes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get **This field will take effect only when the returned value of `Code` is an error code**. It is used to return the error message.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Message **This field will take effect only when the returned value of `Code` is an error code**. It is used to return the error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set **This field will take effect only when the returned value of `Code` is an error code**. It is used to return the error message.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Message **This field will take effect only when the returned value of `Code` is an error code**. It is used to return the error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public TaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResult(TaskResult source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

