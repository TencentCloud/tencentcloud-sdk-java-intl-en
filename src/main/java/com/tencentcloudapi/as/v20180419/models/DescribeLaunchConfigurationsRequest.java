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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLaunchConfigurationsRequest extends AbstractModel {

    /**
    * Queries by one or more launch configuration IDs in the format of `asc-ouy1ax38`. The maximum quantity per request is 100. This parameter does not support specifying both `LaunchConfigurationIds` and `Filters` at the same time.
    */
    @SerializedName("LaunchConfigurationIds")
    @Expose
    private String [] LaunchConfigurationIds;

    /**
    * Filter criteria

<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration ID.</li>
<li>launch-configuration-name - String - required: no - (filter condition) filter by launch configuration name.</li>
<li>vague-launch-configuration-name - String - required: no - (filter condition) fuzzy search by launch configuration name.</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key.</li>
<li>tag-value - String - required: no - (filter condition) filter by tag value.</li>
<li>tag:tag-key - String - required: no - (filter condition) filter by Tag key-value pair. Replace tag-key with a specific tag key. See Example 3 for usage.</li>
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. The parameter does not support specifying both `LaunchConfigurationIds` and `Filters`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The number of returned results. Default value: `20`. Maximum value: `100`. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The offset. Default value: `0`. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Queries by one or more launch configuration IDs in the format of `asc-ouy1ax38`. The maximum quantity per request is 100. This parameter does not support specifying both `LaunchConfigurationIds` and `Filters` at the same time. 
     * @return LaunchConfigurationIds Queries by one or more launch configuration IDs in the format of `asc-ouy1ax38`. The maximum quantity per request is 100. This parameter does not support specifying both `LaunchConfigurationIds` and `Filters` at the same time.
     */
    public String [] getLaunchConfigurationIds() {
        return this.LaunchConfigurationIds;
    }

    /**
     * Set Queries by one or more launch configuration IDs in the format of `asc-ouy1ax38`. The maximum quantity per request is 100. This parameter does not support specifying both `LaunchConfigurationIds` and `Filters` at the same time.
     * @param LaunchConfigurationIds Queries by one or more launch configuration IDs in the format of `asc-ouy1ax38`. The maximum quantity per request is 100. This parameter does not support specifying both `LaunchConfigurationIds` and `Filters` at the same time.
     */
    public void setLaunchConfigurationIds(String [] LaunchConfigurationIds) {
        this.LaunchConfigurationIds = LaunchConfigurationIds;
    }

    /**
     * Get Filter criteria

<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration ID.</li>
<li>launch-configuration-name - String - required: no - (filter condition) filter by launch configuration name.</li>
<li>vague-launch-configuration-name - String - required: no - (filter condition) fuzzy search by launch configuration name.</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key.</li>
<li>tag-value - String - required: no - (filter condition) filter by tag value.</li>
<li>tag:tag-key - String - required: no - (filter condition) filter by Tag key-value pair. Replace tag-key with a specific tag key. See Example 3 for usage.</li>
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. The parameter does not support specifying both `LaunchConfigurationIds` and `Filters`. 
     * @return Filters Filter criteria

<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration ID.</li>
<li>launch-configuration-name - String - required: no - (filter condition) filter by launch configuration name.</li>
<li>vague-launch-configuration-name - String - required: no - (filter condition) fuzzy search by launch configuration name.</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key.</li>
<li>tag-value - String - required: no - (filter condition) filter by tag value.</li>
<li>tag:tag-key - String - required: no - (filter condition) filter by Tag key-value pair. Replace tag-key with a specific tag key. See Example 3 for usage.</li>
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. The parameter does not support specifying both `LaunchConfigurationIds` and `Filters`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria

<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration ID.</li>
<li>launch-configuration-name - String - required: no - (filter condition) filter by launch configuration name.</li>
<li>vague-launch-configuration-name - String - required: no - (filter condition) fuzzy search by launch configuration name.</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key.</li>
<li>tag-value - String - required: no - (filter condition) filter by tag value.</li>
<li>tag:tag-key - String - required: no - (filter condition) filter by Tag key-value pair. Replace tag-key with a specific tag key. See Example 3 for usage.</li>
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. The parameter does not support specifying both `LaunchConfigurationIds` and `Filters`.
     * @param Filters Filter criteria

<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration ID.</li>
<li>launch-configuration-name - String - required: no - (filter condition) filter by launch configuration name.</li>
<li>vague-launch-configuration-name - String - required: no - (filter condition) fuzzy search by launch configuration name.</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key.</li>
<li>tag-value - String - required: no - (filter condition) filter by tag value.</li>
<li>tag:tag-key - String - required: no - (filter condition) filter by Tag key-value pair. Replace tag-key with a specific tag key. See Example 3 for usage.</li>
The maximum number of `Filters` per request is 10, and the maximum number of `Filter.Values` is 5. The parameter does not support specifying both `LaunchConfigurationIds` and `Filters`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The number of returned results. Default value: `20`. Maximum value: `100`. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit The number of returned results. Default value: `20`. Maximum value: `100`. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned results. Default value: `20`. Maximum value: `100`. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit The number of returned results. Default value: `20`. Maximum value: `100`. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The offset. Default value: `0`. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset The offset. Default value: `0`. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: `0`. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset The offset. Default value: `0`. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLaunchConfigurationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLaunchConfigurationsRequest(DescribeLaunchConfigurationsRequest source) {
        if (source.LaunchConfigurationIds != null) {
            this.LaunchConfigurationIds = new String[source.LaunchConfigurationIds.length];
            for (int i = 0; i < source.LaunchConfigurationIds.length; i++) {
                this.LaunchConfigurationIds[i] = new String(source.LaunchConfigurationIds[i]);
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
        this.setParamArraySimple(map, prefix + "LaunchConfigurationIds.", this.LaunchConfigurationIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

