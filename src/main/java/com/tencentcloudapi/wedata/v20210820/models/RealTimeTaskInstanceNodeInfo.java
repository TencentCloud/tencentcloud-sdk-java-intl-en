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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealTimeTaskInstanceNodeInfo extends AbstractModel {

    /**
    * Task Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Real-time Task Instance Node Information List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceNodeInfoList")
    @Expose
    private InstanceNodeInfo [] InstanceNodeInfoList;

    /**
     * Get Task Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Real-time Task Instance Node Information List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceNodeInfoList Real-time Task Instance Node Information List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceNodeInfo [] getInstanceNodeInfoList() {
        return this.InstanceNodeInfoList;
    }

    /**
     * Set Real-time Task Instance Node Information List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceNodeInfoList Real-time Task Instance Node Information List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceNodeInfoList(InstanceNodeInfo [] InstanceNodeInfoList) {
        this.InstanceNodeInfoList = InstanceNodeInfoList;
    }

    public RealTimeTaskInstanceNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealTimeTaskInstanceNodeInfo(RealTimeTaskInstanceNodeInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.InstanceNodeInfoList != null) {
            this.InstanceNodeInfoList = new InstanceNodeInfo[source.InstanceNodeInfoList.length];
            for (int i = 0; i < source.InstanceNodeInfoList.length; i++) {
                this.InstanceNodeInfoList[i] = new InstanceNodeInfo(source.InstanceNodeInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "InstanceNodeInfoList.", this.InstanceNodeInfoList);

    }
}

