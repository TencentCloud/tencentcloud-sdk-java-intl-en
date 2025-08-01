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

public class DescribeNotificationConfigurationsRequest extends AbstractModel {

    /**
    * Query by one or more notification ids. the list length limit is 100. you can obtain the notification ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). parameters AutoScalingNotificationIds and Filters must not be specified simultaneously.
    */
    @SerializedName("AutoScalingNotificationIds")
    @Expose
    private String [] AutoScalingNotificationIds;

    /**
    * Filter criteria

<li> auto-scaling-notification-id - String - required: no - (filter) filter by notification id.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. you can obtain the scaling group id by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingNotificationIds` and `Filters` parameters cannot be specified simultaneously.
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
     * Get Query by one or more notification ids. the list length limit is 100. you can obtain the notification ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). parameters AutoScalingNotificationIds and Filters must not be specified simultaneously. 
     * @return AutoScalingNotificationIds Query by one or more notification ids. the list length limit is 100. you can obtain the notification ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). parameters AutoScalingNotificationIds and Filters must not be specified simultaneously.
     */
    public String [] getAutoScalingNotificationIds() {
        return this.AutoScalingNotificationIds;
    }

    /**
     * Set Query by one or more notification ids. the list length limit is 100. you can obtain the notification ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). parameters AutoScalingNotificationIds and Filters must not be specified simultaneously.
     * @param AutoScalingNotificationIds Query by one or more notification ids. the list length limit is 100. you can obtain the notification ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). parameters AutoScalingNotificationIds and Filters must not be specified simultaneously.
     */
    public void setAutoScalingNotificationIds(String [] AutoScalingNotificationIds) {
        this.AutoScalingNotificationIds = AutoScalingNotificationIds;
    }

    /**
     * Get Filter criteria

<li> auto-scaling-notification-id - String - required: no - (filter) filter by notification id.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. you can obtain the scaling group id by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingNotificationIds` and `Filters` parameters cannot be specified simultaneously. 
     * @return Filters Filter criteria

<li> auto-scaling-notification-id - String - required: no - (filter) filter by notification id.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. you can obtain the scaling group id by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingNotificationIds` and `Filters` parameters cannot be specified simultaneously.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria

<li> auto-scaling-notification-id - String - required: no - (filter) filter by notification id.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. you can obtain the scaling group id by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingNotificationIds` and `Filters` parameters cannot be specified simultaneously.
     * @param Filters Filter criteria

<li> auto-scaling-notification-id - String - required: no - (filter) filter by notification id.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. you can obtain the scaling group id by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
The maximum number of `Filters` per request is 10, and that of `Filter.Values` is 5. the `AutoScalingNotificationIds` and `Filters` parameters cannot be specified simultaneously.
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

    public DescribeNotificationConfigurationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotificationConfigurationsRequest(DescribeNotificationConfigurationsRequest source) {
        if (source.AutoScalingNotificationIds != null) {
            this.AutoScalingNotificationIds = new String[source.AutoScalingNotificationIds.length];
            for (int i = 0; i < source.AutoScalingNotificationIds.length; i++) {
                this.AutoScalingNotificationIds[i] = new String(source.AutoScalingNotificationIds[i]);
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
        this.setParamArraySimple(map, prefix + "AutoScalingNotificationIds.", this.AutoScalingNotificationIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

