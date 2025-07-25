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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * This parameter indicates the number of tasks to be displayed on each page of the task list. **Default value: 10**.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * This parameter indicates the input parameter of the task filter. You can filter tasks by business type, file type, processing suggestion, and task status. For the specific parameter content, see the detailed description of the `TaskFilter` data structure.
    */
    @SerializedName("Filter")
    @Expose
    private TaskFilter Filter;

    /**
    * This parameter indicates the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * This parameter indicates the start time of the task list in ISO 8601 timestamp format. **Default value: 3 days ago**. If this parameter is passed in, tasks between this time point and `EndTime` will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * This parameter indicates the end time of the task list in ISO 8601 timestamp format. **Default value: empty**. If this parameter is passed in, tasks between `StartTime` and this time point will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get This parameter indicates the number of tasks to be displayed on each page of the task list. **Default value: 10**. 
     * @return Limit This parameter indicates the number of tasks to be displayed on each page of the task list. **Default value: 10**.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set This parameter indicates the number of tasks to be displayed on each page of the task list. **Default value: 10**.
     * @param Limit This parameter indicates the number of tasks to be displayed on each page of the task list. **Default value: 10**.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get This parameter indicates the input parameter of the task filter. You can filter tasks by business type, file type, processing suggestion, and task status. For the specific parameter content, see the detailed description of the `TaskFilter` data structure. 
     * @return Filter This parameter indicates the input parameter of the task filter. You can filter tasks by business type, file type, processing suggestion, and task status. For the specific parameter content, see the detailed description of the `TaskFilter` data structure.
     */
    public TaskFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set This parameter indicates the input parameter of the task filter. You can filter tasks by business type, file type, processing suggestion, and task status. For the specific parameter content, see the detailed description of the `TaskFilter` data structure.
     * @param Filter This parameter indicates the input parameter of the task filter. You can filter tasks by business type, file type, processing suggestion, and task status. For the specific parameter content, see the detailed description of the `TaskFilter` data structure.
     */
    public void setFilter(TaskFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get This parameter indicates the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty. 
     * @return PageToken This parameter indicates the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set This parameter indicates the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
     * @param PageToken This parameter indicates the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get This parameter indicates the start time of the task list in ISO 8601 timestamp format. **Default value: 3 days ago**. If this parameter is passed in, tasks between this time point and `EndTime` will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order. 
     * @return StartTime This parameter indicates the start time of the task list in ISO 8601 timestamp format. **Default value: 3 days ago**. If this parameter is passed in, tasks between this time point and `EndTime` will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set This parameter indicates the start time of the task list in ISO 8601 timestamp format. **Default value: 3 days ago**. If this parameter is passed in, tasks between this time point and `EndTime` will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
     * @param StartTime This parameter indicates the start time of the task list in ISO 8601 timestamp format. **Default value: 3 days ago**. If this parameter is passed in, tasks between this time point and `EndTime` will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get This parameter indicates the end time of the task list in ISO 8601 timestamp format. **Default value: empty**. If this parameter is passed in, tasks between `StartTime` and this time point will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order. 
     * @return EndTime This parameter indicates the end time of the task list in ISO 8601 timestamp format. **Default value: empty**. If this parameter is passed in, tasks between `StartTime` and this time point will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set This parameter indicates the end time of the task list in ISO 8601 timestamp format. **Default value: empty**. If this parameter is passed in, tasks between `StartTime` and this time point will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
     * @param EndTime This parameter indicates the end time of the task list in ISO 8601 timestamp format. **Default value: empty**. If this parameter is passed in, tasks between `StartTime` and this time point will be filtered out.<br>Note: this parameter is used together with `Filter` to filter tasks in no particular order.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new TaskFilter(source.Filter);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

