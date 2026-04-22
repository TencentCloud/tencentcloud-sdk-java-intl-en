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
    * <p>Mini program appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Task ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>Task status information</p>
    */
    @SerializedName("TaskMsg")
    @Expose
    private String TaskMsg;

    /**
    * <p>Mini program version ID (returned upon successful compilation)</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
     * Get <p>Mini program appid</p> 
     * @return MNPId <p>Mini program appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini program appid</p>
     * @param MNPId <p>Mini program appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Task ID</p> 
     * @return TaskId <p>Task ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID</p>
     * @param TaskId <p>Task ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded</p> 
     * @return TaskStatus <p>Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded</p>
     * @param TaskStatus <p>Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Task status information</p> 
     * @return TaskMsg <p>Task status information</p>
     */
    public String getTaskMsg() {
        return this.TaskMsg;
    }

    /**
     * Set <p>Task status information</p>
     * @param TaskMsg <p>Task status information</p>
     */
    public void setTaskMsg(String TaskMsg) {
        this.TaskMsg = TaskMsg;
    }

    /**
     * Get <p>Mini program version ID (returned upon successful compilation)</p> 
     * @return MNPVersionId <p>Mini program version ID (returned upon successful compilation)</p>
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set <p>Mini program version ID (returned upon successful compilation)</p>
     * @param MNPVersionId <p>Mini program version ID (returned upon successful compilation)</p>
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

