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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOutput extends AbstractModel{

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Status description
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Status value. Valid values: SUCCESS, FAILED, OPERATING
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task submission time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Operation name
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

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
     * Get Status description 
     * @return Message Status description
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Status description
     * @param Message Status description
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Status value. Valid values: SUCCESS, FAILED, OPERATING 
     * @return Status Status value. Valid values: SUCCESS, FAILED, OPERATING
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status value. Valid values: SUCCESS, FAILED, OPERATING
     * @param Status Status value. Valid values: SUCCESS, FAILED, OPERATING
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task submission time 
     * @return AddTime Task submission time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Task submission time
     * @param AddTime Task submission time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Task end time 
     * @return EndTime Task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
     * @param EndTime Task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Operation name 
     * @return Operation Operation name
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation name
     * @param Operation Operation name
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public TaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOutput(TaskOutput source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

