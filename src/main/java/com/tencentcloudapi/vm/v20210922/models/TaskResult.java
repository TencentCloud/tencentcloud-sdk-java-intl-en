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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResult extends AbstractModel{

    /**
    * Data ID passed when you request the data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Error code. If `OK` is returned, it indicates the task is created successfully. You can see common error codes for more details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Data ID passed when you request the data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataId Data ID passed when you request the data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set Data ID passed when you request the data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataId Data ID passed when you request the data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Error code. If `OK` is returned, it indicates the task is created successfully. You can see common error codes for more details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Code Error code. If `OK` is returned, it indicates the task is created successfully. You can see common error codes for more details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Error code. If `OK` is returned, it indicates the task is created successfully. You can see common error codes for more details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Code Error code. If `OK` is returned, it indicates the task is created successfully. You can see common error codes for more details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Error message
Note: This field may return null, indicating that no valid values can be obtained.
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

