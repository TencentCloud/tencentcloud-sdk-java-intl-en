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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPVersionResp extends AbstractModel {

    /**
    * Mini program ID
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 1: Pending; 20: Running; 30: Failed; 60: Succeeded
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Task status message
    */
    @SerializedName("TaskMsg")
    @Expose
    private String TaskMsg;

    /**
    * Mini program version ID (returned when compilation succeeds)
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
     * Get Mini program ID 
     * @return MNPId Mini program ID
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
     * @param MNPId Mini program ID
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

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
     * Get 1: Pending; 20: Running; 30: Failed; 60: Succeeded 
     * @return TaskStatus 1: Pending; 20: Running; 30: Failed; 60: Succeeded
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 1: Pending; 20: Running; 30: Failed; 60: Succeeded
     * @param TaskStatus 1: Pending; 20: Running; 30: Failed; 60: Succeeded
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task status message 
     * @return TaskMsg Task status message
     */
    public String getTaskMsg() {
        return this.TaskMsg;
    }

    /**
     * Set Task status message
     * @param TaskMsg Task status message
     */
    public void setTaskMsg(String TaskMsg) {
        this.TaskMsg = TaskMsg;
    }

    /**
     * Get Mini program version ID (returned when compilation succeeds) 
     * @return MNPVersionId Mini program version ID (returned when compilation succeeds)
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set Mini program version ID (returned when compilation succeeds)
     * @param MNPVersionId Mini program version ID (returned when compilation succeeds)
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    public DescribeMNPVersionResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPVersionResp(DescribeMNPVersionResp source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskMsg != null) {
            this.TaskMsg = new String(source.TaskMsg);
        }
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskMsg", this.TaskMsg);
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);

    }
}

