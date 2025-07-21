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

public class DescribeAutoScalingGroupsRequest extends AbstractModel {

    /**
    * Queries by one or more auto scaling group IDs in the format of `asg-nkdwoui0`. The maximum quantity per request is 100. This parameter does not support specifying both `AutoScalingGroupIds` and `Filters` at the same time.
    */
    @SerializedName("AutoScalingGroupIds")
    @Expose
    private String [] AutoScalingGroupIds;

    /**
    * Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
Specifies the scaling group ID obtained by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.
<li> auto-scaling-group-name - String - required: no - (filter) filter by auto scaling group name.</li>.
<li> vague-auto-scaling-group-name - String - required: no - (filter) filter by scaling group name fuzzy search.</li>.
<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration id. you can obtain the launch configuration id by logging in to the console (https://console.cloud.tencent.com/autoscaling/config) or calling the api DescribeLaunchConfigurations (https://intl.cloud.tencent.com/document/api/377/20445?from_cn_redirect=1) and retrieving the LaunchConfigurationId from the returned information.</li>.
<li> `tag-key` - String - optional - filter by the tag key. you can call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the tag key from the returned information.</li>.
<li>tag-value - String - required: no - (filter condition) filter by tag value. you can obtain the tag value by calling the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) and retrieving the TagValue from the returned information.</li>.
<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key. see example 2 for reference. call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the TagKey from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingGroupIds` and `Filters` parameters cannot be specified simultaneously.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Queries by one or more auto scaling group IDs in the format of `asg-nkdwoui0`. The maximum quantity per request is 100. This parameter does not support specifying both `AutoScalingGroupIds` and `Filters` at the same time. 
     * @return AutoScalingGroupIds Queries by one or more auto scaling group IDs in the format of `asg-nkdwoui0`. The maximum quantity per request is 100. This parameter does not support specifying both `AutoScalingGroupIds` and `Filters` at the same time.
     */
    public String [] getAutoScalingGroupIds() {
        return this.AutoScalingGroupIds;
    }

    /**
     * Set Queries by one or more auto scaling group IDs in the format of `asg-nkdwoui0`. The maximum quantity per request is 100. This parameter does not support specifying both `AutoScalingGroupIds` and `Filters` at the same time.
     * @param AutoScalingGroupIds Queries by one or more auto scaling group IDs in the format of `asg-nkdwoui0`. The maximum quantity per request is 100. This parameter does not support specifying both `AutoScalingGroupIds` and `Filters` at the same time.
     */
    public void setAutoScalingGroupIds(String [] AutoScalingGroupIds) {
        this.AutoScalingGroupIds = AutoScalingGroupIds;
    }

    /**
     * Get Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
Specifies the scaling group ID obtained by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.
<li> auto-scaling-group-name - String - required: no - (filter) filter by auto scaling group name.</li>.
<li> vague-auto-scaling-group-name - String - required: no - (filter) filter by scaling group name fuzzy search.</li>.
<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration id. you can obtain the launch configuration id by logging in to the console (https://console.cloud.tencent.com/autoscaling/config) or calling the api DescribeLaunchConfigurations (https://intl.cloud.tencent.com/document/api/377/20445?from_cn_redirect=1) and retrieving the LaunchConfigurationId from the returned information.</li>.
<li> `tag-key` - String - optional - filter by the tag key. you can call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the tag key from the returned information.</li>.
<li>tag-value - String - required: no - (filter condition) filter by tag value. you can obtain the tag value by calling the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) and retrieving the TagValue from the returned information.</li>.
<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key. see example 2 for reference. call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the TagKey from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingGroupIds` and `Filters` parameters cannot be specified simultaneously. 
     * @return Filters Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
Specifies the scaling group ID obtained by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.
<li> auto-scaling-group-name - String - required: no - (filter) filter by auto scaling group name.</li>.
<li> vague-auto-scaling-group-name - String - required: no - (filter) filter by scaling group name fuzzy search.</li>.
<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration id. you can obtain the launch configuration id by logging in to the console (https://console.cloud.tencent.com/autoscaling/config) or calling the api DescribeLaunchConfigurations (https://intl.cloud.tencent.com/document/api/377/20445?from_cn_redirect=1) and retrieving the LaunchConfigurationId from the returned information.</li>.
<li> `tag-key` - String - optional - filter by the tag key. you can call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the tag key from the returned information.</li>.
<li>tag-value - String - required: no - (filter condition) filter by tag value. you can obtain the tag value by calling the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) and retrieving the TagValue from the returned information.</li>.
<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key. see example 2 for reference. call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the TagKey from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingGroupIds` and `Filters` parameters cannot be specified simultaneously.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
Specifies the scaling group ID obtained by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.
<li> auto-scaling-group-name - String - required: no - (filter) filter by auto scaling group name.</li>.
<li> vague-auto-scaling-group-name - String - required: no - (filter) filter by scaling group name fuzzy search.</li>.
<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration id. you can obtain the launch configuration id by logging in to the console (https://console.cloud.tencent.com/autoscaling/config) or calling the api DescribeLaunchConfigurations (https://intl.cloud.tencent.com/document/api/377/20445?from_cn_redirect=1) and retrieving the LaunchConfigurationId from the returned information.</li>.
<li> `tag-key` - String - optional - filter by the tag key. you can call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the tag key from the returned information.</li>.
<li>tag-value - String - required: no - (filter condition) filter by tag value. you can obtain the tag value by calling the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) and retrieving the TagValue from the returned information.</li>.
<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key. see example 2 for reference. call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the TagKey from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingGroupIds` and `Filters` parameters cannot be specified simultaneously.
     * @param Filters Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
Specifies the scaling group ID obtained by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.
<li> auto-scaling-group-name - String - required: no - (filter) filter by auto scaling group name.</li>.
<li> vague-auto-scaling-group-name - String - required: no - (filter) filter by scaling group name fuzzy search.</li>.
<li>launch-configuration-id - String - required: no - (filter condition) filter by launch configuration id. you can obtain the launch configuration id by logging in to the console (https://console.cloud.tencent.com/autoscaling/config) or calling the api DescribeLaunchConfigurations (https://intl.cloud.tencent.com/document/api/377/20445?from_cn_redirect=1) and retrieving the LaunchConfigurationId from the returned information.</li>.
<li> `tag-key` - String - optional - filter by the tag key. you can call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the tag key from the returned information.</li>.
<li>tag-value - String - required: no - (filter condition) filter by tag value. you can obtain the tag value by calling the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) and retrieving the TagValue from the returned information.</li>.
<li>tag:tag-key - String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key. see example 2 for reference. call the API [GetTags](https://intl.cloud.tencent.com/document/product/651/72275?from_cn_redirect=1) to obtain the TagKey from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingGroupIds` and `Filters` parameters cannot be specified simultaneously.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAutoScalingGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingGroupsRequest(DescribeAutoScalingGroupsRequest source) {
        if (source.AutoScalingGroupIds != null) {
            this.AutoScalingGroupIds = new String[source.AutoScalingGroupIds.length];
            for (int i = 0; i < source.AutoScalingGroupIds.length; i++) {
                this.AutoScalingGroupIds[i] = new String(source.AutoScalingGroupIds[i]);
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
        this.setParamArraySimple(map, prefix + "AutoScalingGroupIds.", this.AutoScalingGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

