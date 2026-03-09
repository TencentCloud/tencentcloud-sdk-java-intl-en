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

public class DescribeInvokersRequest extends AbstractModel {

    /**
    * Executor ID list.

The maximum per request is 100.

Parameters must not be specified simultaneously `InvokerIds` and `Filters`.

    */
    @SerializedName("InvokerIds")
    @Expose
    private String [] InvokerIds;

    /**
    * Filter criteria:.

- invoker-id - String - required: no - (filter condition) filter by executor id.
-command-id - String - required: no - (filter condition) filters commands by id. you can obtain the id through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
- invoker-type - String - required: no - (filter condition) filter by the executor type. currently only support SCHEDULE.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvokerIds` and `Filters` parameters cannot be specified at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Executor ID list.

The maximum per request is 100.

Parameters must not be specified simultaneously `InvokerIds` and `Filters`.
 
     * @return InvokerIds Executor ID list.

The maximum per request is 100.

Parameters must not be specified simultaneously `InvokerIds` and `Filters`.

     */
    public String [] getInvokerIds() {
        return this.InvokerIds;
    }

    /**
     * Set Executor ID list.

The maximum per request is 100.

Parameters must not be specified simultaneously `InvokerIds` and `Filters`.

     * @param InvokerIds Executor ID list.

The maximum per request is 100.

Parameters must not be specified simultaneously `InvokerIds` and `Filters`.

     */
    public void setInvokerIds(String [] InvokerIds) {
        this.InvokerIds = InvokerIds;
    }

    /**
     * Get Filter criteria:.

- invoker-id - String - required: no - (filter condition) filter by executor id.
-command-id - String - required: no - (filter condition) filters commands by id. you can obtain the id through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
- invoker-type - String - required: no - (filter condition) filter by the executor type. currently only support SCHEDULE.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvokerIds` and `Filters` parameters cannot be specified at the same time. 
     * @return Filters Filter criteria:.

- invoker-id - String - required: no - (filter condition) filter by executor id.
-command-id - String - required: no - (filter condition) filters commands by id. you can obtain the id through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
- invoker-type - String - required: no - (filter condition) filter by the executor type. currently only support SCHEDULE.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvokerIds` and `Filters` parameters cannot be specified at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria:.

- invoker-id - String - required: no - (filter condition) filter by executor id.
-command-id - String - required: no - (filter condition) filters commands by id. you can obtain the id through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
- invoker-type - String - required: no - (filter condition) filter by the executor type. currently only support SCHEDULE.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvokerIds` and `Filters` parameters cannot be specified at the same time.
     * @param Filters Filter criteria:.

- invoker-id - String - required: no - (filter condition) filter by executor id.
-command-id - String - required: no - (filter condition) filters commands by id. you can obtain the id through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
- invoker-type - String - required: no - (filter condition) filter by the executor type. currently only support SCHEDULE.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InvokerIds` and `Filters` parameters cannot be specified at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInvokersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvokersRequest(DescribeInvokersRequest source) {
        if (source.InvokerIds != null) {
            this.InvokerIds = new String[source.InvokerIds.length];
            for (int i = 0; i < source.InvokerIds.length; i++) {
                this.InvokerIds[i] = new String(source.InvokerIds[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InvokerIds.", this.InvokerIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

