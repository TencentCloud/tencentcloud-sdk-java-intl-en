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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeTasksRequest extends AbstractModel{

    /**
    * Specifies a purge type:
`url`: URL purge record
`path`: Directory purge record
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * Specifies the starting time of the period you want to query, such as `2018-08-08 00:00:00`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Specifies the end time of the period you want to query, such as 2018-08-08 23:59:59
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies a task ID when you want to query by task ID.
You must specify either a task ID or a starting time for your query.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Offset for paginated queries. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paged queries. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * You can filter the results by domain name or a complete URL beginning with `http(s)://`
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Specifies a task state for your query:
`fail`: purge failed
`done`: purge succeeded
`process`: purge in progress
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Specifies a purge region for your query:
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Specifies a purge type:
`url`: URL purge record
`path`: Directory purge record 
     * @return PurgeType Specifies a purge type:
`url`: URL purge record
`path`: Directory purge record
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * Set Specifies a purge type:
`url`: URL purge record
`path`: Directory purge record
     * @param PurgeType Specifies a purge type:
`url`: URL purge record
`path`: Directory purge record
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * Get Specifies the starting time of the period you want to query, such as `2018-08-08 00:00:00` 
     * @return StartTime Specifies the starting time of the period you want to query, such as `2018-08-08 00:00:00`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Specifies the starting time of the period you want to query, such as `2018-08-08 00:00:00`
     * @param StartTime Specifies the starting time of the period you want to query, such as `2018-08-08 00:00:00`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the end time of the period you want to query, such as 2018-08-08 23:59:59 
     * @return EndTime Specifies the end time of the period you want to query, such as 2018-08-08 23:59:59
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Specifies the end time of the period you want to query, such as 2018-08-08 23:59:59
     * @param EndTime Specifies the end time of the period you want to query, such as 2018-08-08 23:59:59
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies a task ID when you want to query by task ID.
You must specify either a task ID or a starting time for your query. 
     * @return TaskId Specifies a task ID when you want to query by task ID.
You must specify either a task ID or a starting time for your query.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Specifies a task ID when you want to query by task ID.
You must specify either a task ID or a starting time for your query.
     * @param TaskId Specifies a task ID when you want to query by task ID.
You must specify either a task ID or a starting time for your query.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Offset for paginated queries. Default value: 0 
     * @return Offset Offset for paginated queries. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: 0
     * @param Offset Offset for paginated queries. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paged queries. Default value: 20 
     * @return Limit Limit on paged queries. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paged queries. Default value: 20
     * @param Limit Limit on paged queries. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get You can filter the results by domain name or a complete URL beginning with `http(s)://` 
     * @return Keyword You can filter the results by domain name or a complete URL beginning with `http(s)://`
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set You can filter the results by domain name or a complete URL beginning with `http(s)://`
     * @param Keyword You can filter the results by domain name or a complete URL beginning with `http(s)://`
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Specifies a task state for your query:
`fail`: purge failed
`done`: purge succeeded
`process`: purge in progress 
     * @return Status Specifies a task state for your query:
`fail`: purge failed
`done`: purge succeeded
`process`: purge in progress
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Specifies a task state for your query:
`fail`: purge failed
`done`: purge succeeded
`process`: purge in progress
     * @param Status Specifies a task state for your query:
`fail`: purge failed
`done`: purge succeeded
`process`: purge in progress
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies a purge region for your query:
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global 
     * @return Area Specifies a purge region for your query:
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies a purge region for your query:
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
     * @param Area Specifies a purge region for your query:
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
     */
    public void setArea(String Area) {
        this.Area = Area;
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
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

