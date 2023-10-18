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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BetaInfoByACL extends AbstractModel {

    /**
    * Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Last execution time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
     * Get Task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Last execution time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastTime Last execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last execution time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastTime Last execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    public BetaInfoByACL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BetaInfoByACL(BetaInfoByACL source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);

    }
}

