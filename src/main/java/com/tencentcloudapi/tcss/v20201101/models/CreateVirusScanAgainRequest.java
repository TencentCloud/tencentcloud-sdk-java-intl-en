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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVirusScanAgainRequest extends AbstractModel{

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Set of IDs of containers to be scanned
    */
    @SerializedName("ContainerIds")
    @Expose
    private String [] ContainerIds;

    /**
    * Whether to scan all timed-out containers
    */
    @SerializedName("TimeoutAll")
    @Expose
    private Boolean TimeoutAll;

    /**
    * New timeout period
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

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
     * Get Set of IDs of containers to be scanned 
     * @return ContainerIds Set of IDs of containers to be scanned
     */
    public String [] getContainerIds() {
        return this.ContainerIds;
    }

    /**
     * Set Set of IDs of containers to be scanned
     * @param ContainerIds Set of IDs of containers to be scanned
     */
    public void setContainerIds(String [] ContainerIds) {
        this.ContainerIds = ContainerIds;
    }

    /**
     * Get Whether to scan all timed-out containers 
     * @return TimeoutAll Whether to scan all timed-out containers
     */
    public Boolean getTimeoutAll() {
        return this.TimeoutAll;
    }

    /**
     * Set Whether to scan all timed-out containers
     * @param TimeoutAll Whether to scan all timed-out containers
     */
    public void setTimeoutAll(Boolean TimeoutAll) {
        this.TimeoutAll = TimeoutAll;
    }

    /**
     * Get New timeout period 
     * @return Timeout New timeout period
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set New timeout period
     * @param Timeout New timeout period
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateVirusScanAgainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVirusScanAgainRequest(CreateVirusScanAgainRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ContainerIds != null) {
            this.ContainerIds = new String[source.ContainerIds.length];
            for (int i = 0; i < source.ContainerIds.length; i++) {
                this.ContainerIds[i] = new String(source.ContainerIds[i]);
            }
        }
        if (source.TimeoutAll != null) {
            this.TimeoutAll = new Boolean(source.TimeoutAll);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "ContainerIds.", this.ContainerIds);
        this.setParamSimple(map, prefix + "TimeoutAll", this.TimeoutAll);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

