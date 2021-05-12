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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeTasksRequest extends AbstractModel{

    /**
    * Purge type to be queried. url: query URL purge records; path: query directory purge records.
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * Start time, such as 2018-08-08 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, such as 2018-08-08 23:59:59
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task ID returned during submission. Either `TaskId` or start time must be specified for a query.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Pagination offset. Default value: 0 (starting from entry 0).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination limit. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query keyword. Please enter a domain name or full URL beginning with `http(s)://`.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Specified task status to be queried. fail: failed, done: succeeded, process: purging.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Purge type to be queried. url: query URL purge records; path: query directory purge records. 
     * @return PurgeType Purge type to be queried. url: query URL purge records; path: query directory purge records.
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * Set Purge type to be queried. url: query URL purge records; path: query directory purge records.
     * @param PurgeType Purge type to be queried. url: query URL purge records; path: query directory purge records.
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * Get Start time, such as 2018-08-08 00:00:00 
     * @return StartTime Start time, such as 2018-08-08 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, such as 2018-08-08 00:00:00
     * @param StartTime Start time, such as 2018-08-08 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, such as 2018-08-08 23:59:59 
     * @return EndTime End time, such as 2018-08-08 23:59:59
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, such as 2018-08-08 23:59:59
     * @param EndTime End time, such as 2018-08-08 23:59:59
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task ID returned during submission. Either `TaskId` or start time must be specified for a query. 
     * @return TaskId Task ID returned during submission. Either `TaskId` or start time must be specified for a query.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID returned during submission. Either `TaskId` or start time must be specified for a query.
     * @param TaskId Task ID returned during submission. Either `TaskId` or start time must be specified for a query.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Pagination offset. Default value: 0 (starting from entry 0). 
     * @return Offset Pagination offset. Default value: 0 (starting from entry 0).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0 (starting from entry 0).
     * @param Offset Pagination offset. Default value: 0 (starting from entry 0).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination limit. Default value: 20. 
     * @return Limit Pagination limit. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit. Default value: 20.
     * @param Limit Pagination limit. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query keyword. Please enter a domain name or full URL beginning with `http(s)://`. 
     * @return Keyword Query keyword. Please enter a domain name or full URL beginning with `http(s)://`.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Query keyword. Please enter a domain name or full URL beginning with `http(s)://`.
     * @param Keyword Query keyword. Please enter a domain name or full URL beginning with `http(s)://`.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Specified task status to be queried. fail: failed, done: succeeded, process: purging. 
     * @return Status Specified task status to be queried. fail: failed, done: succeeded, process: purging.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Specified task status to be queried. fail: failed, done: succeeded, process: purging.
     * @param Status Specified task status to be queried. fail: failed, done: succeeded, process: purging.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DescribePurgeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePurgeTasksRequest(DescribePurgeTasksRequest source) {
        if (source.PurgeType != null) {
            this.PurgeType = new String(source.PurgeType);
        }
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
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

