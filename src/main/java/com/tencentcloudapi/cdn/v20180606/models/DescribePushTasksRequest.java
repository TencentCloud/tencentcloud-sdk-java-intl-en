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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePushTasksRequest extends AbstractModel {

    /**
    * Starting time, such as `2018-08-08 00:00:00`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, such as `2018-08-08 23:59:59`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies a task ID for your query.
You must specify either a task ID or a starting time.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Specifies a keyword for your query. Please enter a domain name or a complete URL beginning with `http(s)://`
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Offset for paginated queries. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies a region to query the prefetch records
`mainland`: Chinese mainland
`overseas`: Outside the Chinese mainland
`global`: Globe
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Queries the status of a specified task
`fail`: Prefetch failed
`done`: Prefetch succeeded
`process`: Prefetch in progress
`invalid`: Invalid prefetch with 4XX/5XX status code returned from the origin server
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Starting time, such as `2018-08-08 00:00:00` 
     * @return StartTime Starting time, such as `2018-08-08 00:00:00`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Starting time, such as `2018-08-08 00:00:00`
     * @param StartTime Starting time, such as `2018-08-08 00:00:00`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, such as `2018-08-08 23:59:59` 
     * @return EndTime End time, such as `2018-08-08 23:59:59`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, such as `2018-08-08 23:59:59`
     * @param EndTime End time, such as `2018-08-08 23:59:59`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies a task ID for your query.
You must specify either a task ID or a starting time. 
     * @return TaskId Specifies a task ID for your query.
You must specify either a task ID or a starting time.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Specifies a task ID for your query.
You must specify either a task ID or a starting time.
     * @param TaskId Specifies a task ID for your query.
You must specify either a task ID or a starting time.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Specifies a keyword for your query. Please enter a domain name or a complete URL beginning with `http(s)://` 
     * @return Keyword Specifies a keyword for your query. Please enter a domain name or a complete URL beginning with `http(s)://`
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Specifies a keyword for your query. Please enter a domain name or a complete URL beginning with `http(s)://`
     * @param Keyword Specifies a keyword for your query. Please enter a domain name or a complete URL beginning with `http(s)://`
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
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
     * Get Limit on paginated queries. Default value: 20 
     * @return Limit Limit on paginated queries. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: 20
     * @param Limit Limit on paginated queries. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies a region to query the prefetch records
`mainland`: Chinese mainland
`overseas`: Outside the Chinese mainland
`global`: Globe 
     * @return Area Specifies a region to query the prefetch records
`mainland`: Chinese mainland
`overseas`: Outside the Chinese mainland
`global`: Globe
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies a region to query the prefetch records
`mainland`: Chinese mainland
`overseas`: Outside the Chinese mainland
`global`: Globe
     * @param Area Specifies a region to query the prefetch records
`mainland`: Chinese mainland
`overseas`: Outside the Chinese mainland
`global`: Globe
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Queries the status of a specified task
`fail`: Prefetch failed
`done`: Prefetch succeeded
`process`: Prefetch in progress
`invalid`: Invalid prefetch with 4XX/5XX status code returned from the origin server 
     * @return Status Queries the status of a specified task
`fail`: Prefetch failed
`done`: Prefetch succeeded
`process`: Prefetch in progress
`invalid`: Invalid prefetch with 4XX/5XX status code returned from the origin server
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Queries the status of a specified task
`fail`: Prefetch failed
`done`: Prefetch succeeded
`process`: Prefetch in progress
`invalid`: Invalid prefetch with 4XX/5XX status code returned from the origin server
     * @param Status Queries the status of a specified task
`fail`: Prefetch failed
`done`: Prefetch succeeded
`process`: Prefetch in progress
`invalid`: Invalid prefetch with 4XX/5XX status code returned from the origin server
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DescribePushTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePushTasksRequest(DescribePushTasksRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

