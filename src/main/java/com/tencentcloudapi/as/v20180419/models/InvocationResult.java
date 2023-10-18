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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationResult extends AbstractModel {

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Execution activity ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * Execution task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InvocationTaskId")
    @Expose
    private String InvocationTaskId;

    /**
    * Command ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Execution Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Execution exception information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Execution activity ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InvocationId Execution activity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set Execution activity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InvocationId Execution activity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get Execution task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InvocationTaskId Execution task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInvocationTaskId() {
        return this.InvocationTaskId;
    }

    /**
     * Set Execution task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InvocationTaskId Execution task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInvocationTaskId(String InvocationTaskId) {
        this.InvocationTaskId = InvocationTaskId;
    }

    /**
     * Get Command ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CommandId Command ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Command ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CommandId Command ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get Execution Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatus Execution Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Execution Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStatus Execution Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Execution exception information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage Execution exception information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Execution exception information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage Execution exception information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public InvocationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationResult(InvocationResult source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.InvocationTaskId != null) {
            this.InvocationTaskId = new String(source.InvocationTaskId);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "InvocationTaskId", this.InvocationTaskId);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

