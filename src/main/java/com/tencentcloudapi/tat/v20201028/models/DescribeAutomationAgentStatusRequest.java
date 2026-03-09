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

public class DescribeAutomationAgentStatusRequest extends AbstractModel {

    /**
    * List of instance ids to be queried.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * -agent-status - String - required: no - (filter condition) filters by agent status. valid values: Online, Offline. 
-environment - String - required: no - (filter condition) query by agent runtime environment. valid values: Linux, Windows.
-instance-id - String - required: no - (filter condition) filter by instance id. you can get the instance id through the query instance API of the corresponding cloud services. currently supports instance types: CVM, Lighthouse, and managed instances.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InstanceIds` and `Filters` parameters cannot be specified at the same time.
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
     * Get List of instance ids to be queried.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`. 
     * @return InstanceIds List of instance ids to be queried.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of instance ids to be queried.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.
     * @param InstanceIds List of instance ids to be queried.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get -agent-status - String - required: no - (filter condition) filters by agent status. valid values: Online, Offline. 
-environment - String - required: no - (filter condition) query by agent runtime environment. valid values: Linux, Windows.
-instance-id - String - required: no - (filter condition) filter by instance id. you can get the instance id through the query instance API of the corresponding cloud services. currently supports instance types: CVM, Lighthouse, and managed instances.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InstanceIds` and `Filters` parameters cannot be specified at the same time. 
     * @return Filters -agent-status - String - required: no - (filter condition) filters by agent status. valid values: Online, Offline. 
-environment - String - required: no - (filter condition) query by agent runtime environment. valid values: Linux, Windows.
-instance-id - String - required: no - (filter condition) filter by instance id. you can get the instance id through the query instance API of the corresponding cloud services. currently supports instance types: CVM, Lighthouse, and managed instances.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InstanceIds` and `Filters` parameters cannot be specified at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set -agent-status - String - required: no - (filter condition) filters by agent status. valid values: Online, Offline. 
-environment - String - required: no - (filter condition) query by agent runtime environment. valid values: Linux, Windows.
-instance-id - String - required: no - (filter condition) filter by instance id. you can get the instance id through the query instance API of the corresponding cloud services. currently supports instance types: CVM, Lighthouse, and managed instances.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InstanceIds` and `Filters` parameters cannot be specified at the same time.
     * @param Filters -agent-status - String - required: no - (filter condition) filters by agent status. valid values: Online, Offline. 
-environment - String - required: no - (filter condition) query by agent runtime environment. valid values: Linux, Windows.
-instance-id - String - required: no - (filter condition) filter by instance id. you can get the instance id through the query instance API of the corresponding cloud services. currently supports instance types: CVM, Lighthouse, and managed instances.

The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `InstanceIds` and `Filters` parameters cannot be specified at the same time.
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

    public DescribeAutomationAgentStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutomationAgentStatusRequest(DescribeAutomationAgentStatusRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

