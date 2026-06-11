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

public class DescribeDataTransformInfoRequest extends AbstractModel {

    /**
    * - taskName
Filter by [processing task name].
Type: String
Required: No
Example: test-task

- taskId
Filter by [processing task id].
Type: String
Required: No
Example: a3622556-6402-4942-b4ff-5ae32ec29810
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.

- topicId
Filter by [source topicId].
Type: String
Required: No
Example: 756cec3e-a0a5-44c3-85a8-090870582000
Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

- status
Filter by [Task running status]. 1: Preparing, 2: Running, 3: Stopping, 4: Stopped.
Type: String
Required: No
Example: 1

- hasServiceLog
Filter by [whether service logs are enabled]. 1: not enabled, 2: on.
Type: String
Required: No
Example: 1

- dstTopicType
Filter by [Target topic Type]. 1: Fixed, 2: Dynamic.
Type: String
Required: No
Example: 1

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
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
    * When Type is 1, this parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get - taskName
Filter by [processing task name].
Type: String
Required: No
Example: test-task

- taskId
Filter by [processing task id].
Type: String
Required: No
Example: a3622556-6402-4942-b4ff-5ae32ec29810
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.

- topicId
Filter by [source topicId].
Type: String
Required: No
Example: 756cec3e-a0a5-44c3-85a8-090870582000
Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

- status
Filter by [Task running status]. 1: Preparing, 2: Running, 3: Stopping, 4: Stopped.
Type: String
Required: No
Example: 1

- hasServiceLog
Filter by [whether service logs are enabled]. 1: not enabled, 2: on.
Type: String
Required: No
Example: 1

- dstTopicType
Filter by [Target topic Type]. 1: Fixed, 2: Dynamic.
Type: String
Required: No
Example: 1

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100. 
     * @return Filters - taskName
Filter by [processing task name].
Type: String
Required: No
Example: test-task

- taskId
Filter by [processing task id].
Type: String
Required: No
Example: a3622556-6402-4942-b4ff-5ae32ec29810
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.

- topicId
Filter by [source topicId].
Type: String
Required: No
Example: 756cec3e-a0a5-44c3-85a8-090870582000
Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

- status
Filter by [Task running status]. 1: Preparing, 2: Running, 3: Stopping, 4: Stopped.
Type: String
Required: No
Example: 1

- hasServiceLog
Filter by [whether service logs are enabled]. 1: not enabled, 2: on.
Type: String
Required: No
Example: 1

- dstTopicType
Filter by [Target topic Type]. 1: Fixed, 2: Dynamic.
Type: String
Required: No
Example: 1

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set - taskName
Filter by [processing task name].
Type: String
Required: No
Example: test-task

- taskId
Filter by [processing task id].
Type: String
Required: No
Example: a3622556-6402-4942-b4ff-5ae32ec29810
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.

- topicId
Filter by [source topicId].
Type: String
Required: No
Example: 756cec3e-a0a5-44c3-85a8-090870582000
Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

- status
Filter by [Task running status]. 1: Preparing, 2: Running, 3: Stopping, 4: Stopped.
Type: String
Required: No
Example: 1

- hasServiceLog
Filter by [whether service logs are enabled]. 1: not enabled, 2: on.
Type: String
Required: No
Example: 1

- dstTopicType
Filter by [Target topic Type]. 1: Fixed, 2: Dynamic.
Type: String
Required: No
Example: 1

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     * @param Filters - taskName
Filter by [processing task name].
Type: String
Required: No
Example: test-task

- taskId
Filter by [processing task id].
Type: String
Required: No
Example: a3622556-6402-4942-b4ff-5ae32ec29810
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.

- topicId
Filter by [source topicId].
Type: String
Required: No
Example: 756cec3e-a0a5-44c3-85a8-090870582000
Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

- status
Filter by [Task running status]. 1: Preparing, 2: Running, 3: Stopping, 4: Stopped.
Type: String
Required: No
Example: 1

- hasServiceLog
Filter by [whether service logs are enabled]. 1: not enabled, 2: on.
Type: String
Required: No
Example: 1

- dstTopicType
Filter by [Target topic Type]. 1: Fixed, 2: Dynamic.
Type: String
Required: No
Example: 1

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
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
     * Get When Type is 1, this parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID. 
     * @return TaskId When Type is 1, this parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set When Type is 1, this parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
     * @param TaskId When Type is 1, this parameter is required.
Data processing task ID - Search the data processing task list basic information (https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1) to get the data processing task ID.
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

