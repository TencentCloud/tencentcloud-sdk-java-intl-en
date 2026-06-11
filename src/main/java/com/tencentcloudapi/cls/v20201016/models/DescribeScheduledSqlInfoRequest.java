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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScheduledSqlInfoRequest extends AbstractModel {

    /**
    * Page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries per page. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * -srcTopicName is filtered by [source log topic name] with fuzzy matching. Type: String. Required: No. Example: business log topic 1. Get the log topic name by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Filter dstTopicName by [target log topic name] with fuzzy matching. Type: String. Required: No. Example: Business log topic 2. Get the log topic name by [getting the log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- srcTopicId is filtered by [source log topic ID]. Type: String. Required: No. Example: a4478687-2382-4486-9692-de7986350f6b. Get the log topic id by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-dstTopicId is filtered by [target log topic ID]. Type: String. Required: No. Example: bd4d3375-d72a-4cd2-988d-d8eda2bd62b0. Get log topic ID by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-bizType is filtered by [topic type], 0: log topic; 1: metric topic. Type: String. Required: No.
-Status is filtered by [task status]: 1: running; 2: stop; 3: exception. Type: String. Required: no.
-Filter the taskName by [task name] with fuzzy matching. Type: String. Required: No. Example: metricTask. Search the task name by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
-taskId is filtered by [task ID] with fuzzy matching. Type: String. Required: No. Example: 9c64f9c1-a14e-4b59-b074-5b73cac3dd66. Obtain the task ID by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Page offset. Default value: 0 
     * @return Offset Page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. Default value: 0
     * @param Offset Page offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of entries per page. Default value: 20. Maximum value: 100. 
     * @return Limit Maximum number of entries per page. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries per page. Default value: 20. Maximum value: 100.
     * @param Limit Maximum number of entries per page. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Task name. 
     * @return Name Task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name.
     * @param Name Task name.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get -srcTopicName is filtered by [source log topic name] with fuzzy matching. Type: String. Required: No. Example: business log topic 1. Get the log topic name by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Filter dstTopicName by [target log topic name] with fuzzy matching. Type: String. Required: No. Example: Business log topic 2. Get the log topic name by [getting the log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- srcTopicId is filtered by [source log topic ID]. Type: String. Required: No. Example: a4478687-2382-4486-9692-de7986350f6b. Get the log topic id by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-dstTopicId is filtered by [target log topic ID]. Type: String. Required: No. Example: bd4d3375-d72a-4cd2-988d-d8eda2bd62b0. Get log topic ID by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-bizType is filtered by [topic type], 0: log topic; 1: metric topic. Type: String. Required: No.
-Status is filtered by [task status]: 1: running; 2: stop; 3: exception. Type: String. Required: no.
-Filter the taskName by [task name] with fuzzy matching. Type: String. Required: No. Example: metricTask. Search the task name by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
-taskId is filtered by [task ID] with fuzzy matching. Type: String. Required: No. Example: 9c64f9c1-a14e-4b59-b074-5b73cac3dd66. Obtain the task ID by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1). 
     * @return Filters -srcTopicName is filtered by [source log topic name] with fuzzy matching. Type: String. Required: No. Example: business log topic 1. Get the log topic name by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Filter dstTopicName by [target log topic name] with fuzzy matching. Type: String. Required: No. Example: Business log topic 2. Get the log topic name by [getting the log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- srcTopicId is filtered by [source log topic ID]. Type: String. Required: No. Example: a4478687-2382-4486-9692-de7986350f6b. Get the log topic id by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-dstTopicId is filtered by [target log topic ID]. Type: String. Required: No. Example: bd4d3375-d72a-4cd2-988d-d8eda2bd62b0. Get log topic ID by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-bizType is filtered by [topic type], 0: log topic; 1: metric topic. Type: String. Required: No.
-Status is filtered by [task status]: 1: running; 2: stop; 3: exception. Type: String. Required: no.
-Filter the taskName by [task name] with fuzzy matching. Type: String. Required: No. Example: metricTask. Search the task name by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
-taskId is filtered by [task ID] with fuzzy matching. Type: String. Required: No. Example: 9c64f9c1-a14e-4b59-b074-5b73cac3dd66. Obtain the task ID by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set -srcTopicName is filtered by [source log topic name] with fuzzy matching. Type: String. Required: No. Example: business log topic 1. Get the log topic name by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Filter dstTopicName by [target log topic name] with fuzzy matching. Type: String. Required: No. Example: Business log topic 2. Get the log topic name by [getting the log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- srcTopicId is filtered by [source log topic ID]. Type: String. Required: No. Example: a4478687-2382-4486-9692-de7986350f6b. Get the log topic id by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-dstTopicId is filtered by [target log topic ID]. Type: String. Required: No. Example: bd4d3375-d72a-4cd2-988d-d8eda2bd62b0. Get log topic ID by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-bizType is filtered by [topic type], 0: log topic; 1: metric topic. Type: String. Required: No.
-Status is filtered by [task status]: 1: running; 2: stop; 3: exception. Type: String. Required: no.
-Filter the taskName by [task name] with fuzzy matching. Type: String. Required: No. Example: metricTask. Search the task name by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
-taskId is filtered by [task ID] with fuzzy matching. Type: String. Required: No. Example: 9c64f9c1-a14e-4b59-b074-5b73cac3dd66. Obtain the task ID by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
     * @param Filters -srcTopicName is filtered by [source log topic name] with fuzzy matching. Type: String. Required: No. Example: business log topic 1. Get the log topic name by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Filter dstTopicName by [target log topic name] with fuzzy matching. Type: String. Required: No. Example: Business log topic 2. Get the log topic name by [getting the log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- srcTopicId is filtered by [source log topic ID]. Type: String. Required: No. Example: a4478687-2382-4486-9692-de7986350f6b. Get the log topic id by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-dstTopicId is filtered by [target log topic ID]. Type: String. Required: No. Example: bd4d3375-d72a-4cd2-988d-d8eda2bd62b0. Get log topic ID by [get log topic list](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-bizType is filtered by [topic type], 0: log topic; 1: metric topic. Type: String. Required: No.
-Status is filtered by [task status]: 1: running; 2: stop; 3: exception. Type: String. Required: no.
-Filter the taskName by [task name] with fuzzy matching. Type: String. Required: No. Example: metricTask. Search the task name by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
-taskId is filtered by [task ID] with fuzzy matching. Type: String. Required: No. Example: 9c64f9c1-a14e-4b59-b074-5b73cac3dd66. Obtain the task ID by [retrieving the scheduled SQL analysis task list](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeScheduledSqlInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduledSqlInfoRequest(DescribeScheduledSqlInfoRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

