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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationTaskBasicInfo extends AbstractModel {

    /**
    * Execution task ID.
    */
    @SerializedName("InvocationTaskId")
    @Expose
    private String InvocationTaskId;

    /**
    * Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Execution task ID. 
     * @return InvocationTaskId Execution task ID.
     */
    public String getInvocationTaskId() {
        return this.InvocationTaskId;
    }

    /**
     * Set Execution task ID.
     * @param InvocationTaskId Execution task ID.
     */
    public void setInvocationTaskId(String InvocationTaskId) {
        this.InvocationTaskId = InvocationTaskId;
    }

    /**
     * Get Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution). 
     * @return TaskStatus Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
     * @param TaskStatus Execution task status. valid values:.

-PENDING: waiting for distribution.
-DELIVERING: distributing.
-DELIVER_DELAYED: delivery delay.
-DELIVER_FAILED: delivery fail.
-START_FAILED: command start failed.
- RUNNING: command RUNNING.
-SUCCESS: command success.
-FAILED: command execution failed, exit code not 0.
-TIMEOUT: command timeout.
-TASK_TIMEOUT: client no response.
-Canceling.
- CANCELLED: canceled (command canceled before startup).
-TERMINATED: suspended (canceled during command execution).
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
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

    public InvocationTaskBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationTaskBasicInfo(InvocationTaskBasicInfo source) {
        if (source.InvocationTaskId != null) {
            this.InvocationTaskId = new String(source.InvocationTaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvocationTaskId", this.InvocationTaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

