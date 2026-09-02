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

public class CreateBaselineMainTaskExportJobRequest extends AbstractModel {

    /**
    * <p>Baseline main task ID, precisely export the testing items and subtasks of this task; exports as empty if not provided.</p>
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
    * <p>Export task name. If not specified, it will be automatically generated.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Universal Filter Criteria. Supported fields include: TaskID (exact), TaskType, Status, CheckAssetType.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>Baseline main task ID, precisely export the testing items and subtasks of this task; exports as empty if not provided.</p> 
     * @return TaskID <p>Baseline main task ID, precisely export the testing items and subtasks of this task; exports as empty if not provided.</p>
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set <p>Baseline main task ID, precisely export the testing items and subtasks of this task; exports as empty if not provided.</p>
     * @param TaskID <p>Baseline main task ID, precisely export the testing items and subtasks of this task; exports as empty if not provided.</p>
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get <p>Export task name. If not specified, it will be automatically generated.</p> 
     * @return Name <p>Export task name. If not specified, it will be automatically generated.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Export task name. If not specified, it will be automatically generated.</p>
     * @param Name <p>Export task name. If not specified, it will be automatically generated.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Universal Filter Criteria. Supported fields include: TaskID (exact), TaskType, Status, CheckAssetType.</p> 
     * @return Filters <p>Universal Filter Criteria. Supported fields include: TaskID (exact), TaskType, Status, CheckAssetType.</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Universal Filter Criteria. Supported fields include: TaskID (exact), TaskType, Status, CheckAssetType.</p>
     * @param Filters <p>Universal Filter Criteria. Supported fields include: TaskID (exact), TaskType, Status, CheckAssetType.</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public CreateBaselineMainTaskExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBaselineMainTaskExportJobRequest(CreateBaselineMainTaskExportJobRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

