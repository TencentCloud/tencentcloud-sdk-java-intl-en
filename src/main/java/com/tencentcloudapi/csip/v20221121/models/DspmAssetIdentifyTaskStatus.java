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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmAssetIdentifyTaskStatus extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Unrecognized</li><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Unrecognized</li><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li></ul> 
     * @return Status <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Unrecognized</li><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Unrecognized</li><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li></ul>
     * @param Status <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Unrecognized</li><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DspmAssetIdentifyTaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetIdentifyTaskStatus(DspmAssetIdentifyTaskStatus source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

