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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvocationTasksRequest extends AbstractModel {

    /**
    * List of execution task IDs. Up to 100 IDs are allowed for each request. `InvocationTaskIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("InvocationTaskIds")
    @Expose
    private String [] InvocationTaskIds;

    /**
    * Filter conditions.<br>.

-invocation-task-id - String - required: no - (filter condition) filter by executing task id.
- invocation-id - String - required: no - (filter condition) filter by the execution activity id. you can obtain it through the [DescribeInvocations](https://www.tencentcloud.com/document/api/1340/52679?from_cn_redirect=1) api.
-instance-id - String - required: no - (filtering conditions) filter by instance id. you can get the instance id through the query instance interface of corresponding cloud services. currently supported instance types: CVM, Lighthouse, and managed instances of TAT.
-command-id - String - required: no - (filter criteria) filter by command id. obtain through the api [DescribeCommands (query command details)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1).

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvocationTaskIds` and `Filters` parameters cannot be specified at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether to hide the command output result. valid values:.

-true: hide output.
- false: do not hide.
 
The default value is true.
    */
    @SerializedName("HideOutput")
    @Expose
    private Boolean HideOutput;

    /**
     * Get List of execution task IDs. Up to 100 IDs are allowed for each request. `InvocationTaskIds` and `Filters` cannot be specified at the same time. 
     * @return InvocationTaskIds List of execution task IDs. Up to 100 IDs are allowed for each request. `InvocationTaskIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getInvocationTaskIds() {
        return this.InvocationTaskIds;
    }

    /**
     * Set List of execution task IDs. Up to 100 IDs are allowed for each request. `InvocationTaskIds` and `Filters` cannot be specified at the same time.
     * @param InvocationTaskIds List of execution task IDs. Up to 100 IDs are allowed for each request. `InvocationTaskIds` and `Filters` cannot be specified at the same time.
     */
    public void setInvocationTaskIds(String [] InvocationTaskIds) {
        this.InvocationTaskIds = InvocationTaskIds;
    }

    /**
     * Get Filter conditions.<br>.

-invocation-task-id - String - required: no - (filter condition) filter by executing task id.
- invocation-id - String - required: no - (filter condition) filter by the execution activity id. you can obtain it through the [DescribeInvocations](https://www.tencentcloud.com/document/api/1340/52679?from_cn_redirect=1) api.
-instance-id - String - required: no - (filtering conditions) filter by instance id. you can get the instance id through the query instance interface of corresponding cloud services. currently supported instance types: CVM, Lighthouse, and managed instances of TAT.
-command-id - String - required: no - (filter criteria) filter by command id. obtain through the api [DescribeCommands (query command details)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1).

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvocationTaskIds` and `Filters` parameters cannot be specified at the same time. 
     * @return Filters Filter conditions.<br>.

-invocation-task-id - String - required: no - (filter condition) filter by executing task id.
- invocation-id - String - required: no - (filter condition) filter by the execution activity id. you can obtain it through the [DescribeInvocations](https://www.tencentcloud.com/document/api/1340/52679?from_cn_redirect=1) api.
-instance-id - String - required: no - (filtering conditions) filter by instance id. you can get the instance id through the query instance interface of corresponding cloud services. currently supported instance types: CVM, Lighthouse, and managed instances of TAT.
-command-id - String - required: no - (filter criteria) filter by command id. obtain through the api [DescribeCommands (query command details)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1).

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvocationTaskIds` and `Filters` parameters cannot be specified at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions.<br>.

-invocation-task-id - String - required: no - (filter condition) filter by executing task id.
- invocation-id - String - required: no - (filter condition) filter by the execution activity id. you can obtain it through the [DescribeInvocations](https://www.tencentcloud.com/document/api/1340/52679?from_cn_redirect=1) api.
-instance-id - String - required: no - (filtering conditions) filter by instance id. you can get the instance id through the query instance interface of corresponding cloud services. currently supported instance types: CVM, Lighthouse, and managed instances of TAT.
-command-id - String - required: no - (filter criteria) filter by command id. obtain through the api [DescribeCommands (query command details)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1).

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvocationTaskIds` and `Filters` parameters cannot be specified at the same time.
     * @param Filters Filter conditions.<br>.

-invocation-task-id - String - required: no - (filter condition) filter by executing task id.
- invocation-id - String - required: no - (filter condition) filter by the execution activity id. you can obtain it through the [DescribeInvocations](https://www.tencentcloud.com/document/api/1340/52679?from_cn_redirect=1) api.
-instance-id - String - required: no - (filtering conditions) filter by instance id. you can get the instance id through the query instance interface of corresponding cloud services. currently supported instance types: CVM, Lighthouse, and managed instances of TAT.
-command-id - String - required: no - (filter criteria) filter by command id. obtain through the api [DescribeCommands (query command details)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1).

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvocationTaskIds` and `Filters` parameters cannot be specified at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned results. It defaults to `20`. The maximum is 100. For more information on `Limit`, see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset. The default value is `0`. For more information on `Offset`, see the relevant section in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Whether to hide the command output result. valid values:.

-true: hide output.
- false: do not hide.
 
The default value is true. 
     * @return HideOutput Whether to hide the command output result. valid values:.

-true: hide output.
- false: do not hide.
 
The default value is true.
     */
    public Boolean getHideOutput() {
        return this.HideOutput;
    }

    /**
     * Set Whether to hide the command output result. valid values:.

-true: hide output.
- false: do not hide.
 
The default value is true.
     * @param HideOutput Whether to hide the command output result. valid values:.

-true: hide output.
- false: do not hide.
 
The default value is true.
     */
    public void setHideOutput(Boolean HideOutput) {
        this.HideOutput = HideOutput;
    }

    public DescribeInvocationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvocationTasksRequest(DescribeInvocationTasksRequest source) {
        if (source.InvocationTaskIds != null) {
            this.InvocationTaskIds = new String[source.InvocationTaskIds.length];
            for (int i = 0; i < source.InvocationTaskIds.length; i++) {
                this.InvocationTaskIds[i] = new String(source.InvocationTaskIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.HideOutput != null) {
            this.HideOutput = new Boolean(source.HideOutput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InvocationTaskIds.", this.InvocationTaskIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "HideOutput", this.HideOutput);

    }
}

