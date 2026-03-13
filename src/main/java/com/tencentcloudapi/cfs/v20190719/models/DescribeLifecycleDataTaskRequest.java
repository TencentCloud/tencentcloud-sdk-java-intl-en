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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLifecycleDataTaskRequest extends AbstractModel {

    /**
    * Start time. must be earlier than EndTime. only supports querying task data within the most recent 3 months.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. must be later than StartTime. only supports querying task data within the most recent 3 months.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Offset paging number	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit page size	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions, TaskName, FileSystemId, Type.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * File system version; v3.1: pcfs/hifs v4.0: Turbo.
    */
    @SerializedName("CfsVersion")
    @Expose
    private String CfsVersion;

    /**
     * Get Start time. must be earlier than EndTime. only supports querying task data within the most recent 3 months. 
     * @return StartTime Start time. must be earlier than EndTime. only supports querying task data within the most recent 3 months.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. must be earlier than EndTime. only supports querying task data within the most recent 3 months.
     * @param StartTime Start time. must be earlier than EndTime. only supports querying task data within the most recent 3 months.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. must be later than StartTime. only supports querying task data within the most recent 3 months. 
     * @return EndTime End time. must be later than StartTime. only supports querying task data within the most recent 3 months.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. must be later than StartTime. only supports querying task data within the most recent 3 months.
     * @param EndTime End time. must be later than StartTime. only supports querying task data within the most recent 3 months.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Offset paging number	 
     * @return Offset Offset paging number	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset paging number	
     * @param Offset Offset paging number	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit page size	 
     * @return Limit Limit page size	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit page size	
     * @param Limit Limit page size	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions, TaskName, FileSystemId, Type. 
     * @return Filters Filter conditions, TaskName, FileSystemId, Type.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions, TaskName, FileSystemId, Type.
     * @param Filters Filter conditions, TaskName, FileSystemId, Type.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get File system version; v3.1: pcfs/hifs v4.0: Turbo. 
     * @return CfsVersion File system version; v3.1: pcfs/hifs v4.0: Turbo.
     */
    public String getCfsVersion() {
        return this.CfsVersion;
    }

    /**
     * Set File system version; v3.1: pcfs/hifs v4.0: Turbo.
     * @param CfsVersion File system version; v3.1: pcfs/hifs v4.0: Turbo.
     */
    public void setCfsVersion(String CfsVersion) {
        this.CfsVersion = CfsVersion;
    }

    public DescribeLifecycleDataTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLifecycleDataTaskRequest(DescribeLifecycleDataTaskRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.CfsVersion != null) {
            this.CfsVersion = new String(source.CfsVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "CfsVersion", this.CfsVersion);

    }
}

