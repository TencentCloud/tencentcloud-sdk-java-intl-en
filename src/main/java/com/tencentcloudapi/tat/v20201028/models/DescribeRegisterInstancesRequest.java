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

public class DescribeRegisterInstancesRequest extends AbstractModel {

    /**
    * Managed instance id.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.

    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter list. the maximum number of `Filters` is 10 per request, and the maximum number of `Filter.Values` is 5. parameters must not be specified simultaneously for `InstanceIds` and `Filters`.


- instance-name

Filter by [managed instance name].
Type: String.
Required: No

- instance-id

Filter by [managed instance ID].
Type: String.
Required: No

- register-status

Filter by [managed instance status]. valid values: Online | Offline.
Type: String.
Required: No

- local-ip

Filter by [managed instance nic IP].
Type: String.
Required: No

- register-code-id

Filter by [managed instance registration code ID]. call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
Type: String.
Required: No

- sys-name

Filter by [operating system type]. valid values: Linux | Windows.
Type: String.
Required: No

- tag-key

Filter by [tag key].
Type: String.
Required: No

- tag-value

Filter by [tag value].
Type: String.
Required: No

- tag:tag-key

Filter by [tag key-value pair]. replace tag-key with a specific Tag key.
Type: String.
Required: No

For example, the Filter is {"Name": "tag:key1", "Values": ["v1", "v2"] }, which queries all resources belonging to tag key1:v1 or key1:v2.


    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results, defaults to 20, maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Managed instance id.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.
 
     * @return InstanceIds Managed instance id.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.

     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Managed instance id.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.

     * @param InstanceIds Managed instance id.

The maximum per request is 100.

Parameters must not be specified simultaneously `InstanceIds` and `Filters`.

     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Filter list. the maximum number of `Filters` is 10 per request, and the maximum number of `Filter.Values` is 5. parameters must not be specified simultaneously for `InstanceIds` and `Filters`.


- instance-name

Filter by [managed instance name].
Type: String.
Required: No

- instance-id

Filter by [managed instance ID].
Type: String.
Required: No

- register-status

Filter by [managed instance status]. valid values: Online | Offline.
Type: String.
Required: No

- local-ip

Filter by [managed instance nic IP].
Type: String.
Required: No

- register-code-id

Filter by [managed instance registration code ID]. call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
Type: String.
Required: No

- sys-name

Filter by [operating system type]. valid values: Linux | Windows.
Type: String.
Required: No

- tag-key

Filter by [tag key].
Type: String.
Required: No

- tag-value

Filter by [tag value].
Type: String.
Required: No

- tag:tag-key

Filter by [tag key-value pair]. replace tag-key with a specific Tag key.
Type: String.
Required: No

For example, the Filter is {"Name": "tag:key1", "Values": ["v1", "v2"] }, which queries all resources belonging to tag key1:v1 or key1:v2.

 
     * @return Filters Filter list. the maximum number of `Filters` is 10 per request, and the maximum number of `Filter.Values` is 5. parameters must not be specified simultaneously for `InstanceIds` and `Filters`.


- instance-name

Filter by [managed instance name].
Type: String.
Required: No

- instance-id

Filter by [managed instance ID].
Type: String.
Required: No

- register-status

Filter by [managed instance status]. valid values: Online | Offline.
Type: String.
Required: No

- local-ip

Filter by [managed instance nic IP].
Type: String.
Required: No

- register-code-id

Filter by [managed instance registration code ID]. call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
Type: String.
Required: No

- sys-name

Filter by [operating system type]. valid values: Linux | Windows.
Type: String.
Required: No

- tag-key

Filter by [tag key].
Type: String.
Required: No

- tag-value

Filter by [tag value].
Type: String.
Required: No

- tag:tag-key

Filter by [tag key-value pair]. replace tag-key with a specific Tag key.
Type: String.
Required: No

For example, the Filter is {"Name": "tag:key1", "Values": ["v1", "v2"] }, which queries all resources belonging to tag key1:v1 or key1:v2.


     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter list. the maximum number of `Filters` is 10 per request, and the maximum number of `Filter.Values` is 5. parameters must not be specified simultaneously for `InstanceIds` and `Filters`.


- instance-name

Filter by [managed instance name].
Type: String.
Required: No

- instance-id

Filter by [managed instance ID].
Type: String.
Required: No

- register-status

Filter by [managed instance status]. valid values: Online | Offline.
Type: String.
Required: No

- local-ip

Filter by [managed instance nic IP].
Type: String.
Required: No

- register-code-id

Filter by [managed instance registration code ID]. call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
Type: String.
Required: No

- sys-name

Filter by [operating system type]. valid values: Linux | Windows.
Type: String.
Required: No

- tag-key

Filter by [tag key].
Type: String.
Required: No

- tag-value

Filter by [tag value].
Type: String.
Required: No

- tag:tag-key

Filter by [tag key-value pair]. replace tag-key with a specific Tag key.
Type: String.
Required: No

For example, the Filter is {"Name": "tag:key1", "Values": ["v1", "v2"] }, which queries all resources belonging to tag key1:v1 or key1:v2.


     * @param Filters Filter list. the maximum number of `Filters` is 10 per request, and the maximum number of `Filter.Values` is 5. parameters must not be specified simultaneously for `InstanceIds` and `Filters`.


- instance-name

Filter by [managed instance name].
Type: String.
Required: No

- instance-id

Filter by [managed instance ID].
Type: String.
Required: No

- register-status

Filter by [managed instance status]. valid values: Online | Offline.
Type: String.
Required: No

- local-ip

Filter by [managed instance nic IP].
Type: String.
Required: No

- register-code-id

Filter by [managed instance registration code ID]. call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
Type: String.
Required: No

- sys-name

Filter by [operating system type]. valid values: Linux | Windows.
Type: String.
Required: No

- tag-key

Filter by [tag key].
Type: String.
Required: No

- tag-value

Filter by [tag value].
Type: String.
Required: No

- tag:tag-key

Filter by [tag key-value pair]. replace tag-key with a specific Tag key.
Type: String.
Required: No

For example, the Filter is {"Name": "tag:key1", "Values": ["v1", "v2"] }, which queries all resources belonging to tag key1:v1 or key1:v2.


     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. default value: 0. 
     * @return Offset Offset. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. default value: 0.
     * @param Offset Offset. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results, defaults to 20, maximum value is 100. 
     * @return Limit Number of returned results, defaults to 20, maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results, defaults to 20, maximum value is 100.
     * @param Limit Number of returned results, defaults to 20, maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRegisterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegisterInstancesRequest(DescribeRegisterInstancesRequest source) {
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
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

