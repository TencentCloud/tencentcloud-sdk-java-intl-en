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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataTransformInfoRequest extends AbstractModel {

    /**
    * <br><li>taskName

Filter by **processing task name**.
Type: String

Required: No

<br><li>taskId

Filter by **processing task ID**.
Type: String

Required: No

<br><li>srctopicId

Filter by **source topic ID**.
Type: String

Required: No

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The pagination offset. Default value: 0.
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
    * Task type. Valid values: 1: Get the details of a single task. 2 (default): Get the task list.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Task ID, which is required when `Type` is set to `1`
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get <br><li>taskName

Filter by **processing task name**.
Type: String

Required: No

<br><li>taskId

Filter by **processing task ID**.
Type: String

Required: No

<br><li>srctopicId

Filter by **source topic ID**.
Type: String

Required: No

Each request can have up to 10 `Filters` and 100 `Filter.Values`. 
     * @return Filters <br><li>taskName

Filter by **processing task name**.
Type: String

Required: No

<br><li>taskId

Filter by **processing task ID**.
Type: String

Required: No

<br><li>srctopicId

Filter by **source topic ID**.
Type: String

Required: No

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <br><li>taskName

Filter by **processing task name**.
Type: String

Required: No

<br><li>taskId

Filter by **processing task ID**.
Type: String

Required: No

<br><li>srctopicId

Filter by **source topic ID**.
Type: String

Required: No

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     * @param Filters <br><li>taskName

Filter by **processing task name**.
Type: String

Required: No

<br><li>taskId

Filter by **processing task ID**.
Type: String

Required: No

<br><li>srctopicId

Filter by **source topic ID**.
Type: String

Required: No

Each request can have up to 10 `Filters` and 100 `Filter.Values`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The pagination offset. Default value: 0. 
     * @return Offset The pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The pagination offset. Default value: 0.
     * @param Offset The pagination offset. Default value: 0.
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
     * Get Task type. Valid values: 1: Get the details of a single task. 2 (default): Get the task list. 
     * @return Type Task type. Valid values: 1: Get the details of a single task. 2 (default): Get the task list.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values: 1: Get the details of a single task. 2 (default): Get the task list.
     * @param Type Task type. Valid values: 1: Get the details of a single task. 2 (default): Get the task list.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Task ID, which is required when `Type` is set to `1` 
     * @return TaskId Task ID, which is required when `Type` is set to `1`
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID, which is required when `Type` is set to `1`
     * @param TaskId Task ID, which is required when `Type` is set to `1`
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeDataTransformInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataTransformInfoRequest(DescribeDataTransformInfoRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

