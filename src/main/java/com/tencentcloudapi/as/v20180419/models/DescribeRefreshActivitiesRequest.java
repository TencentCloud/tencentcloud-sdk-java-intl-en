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

public class DescribeRefreshActivitiesRequest extends AbstractModel {

    /**
    * List of refresh activity IDs. IDs are formatted like: 'asr-5l2ejpfo'. The upper limit per request is 100. Parameters do not support specifying both RefreshActivityIds and Filters simultaneously.
    */
    @SerializedName("RefreshActivityIds")
    @Expose
    private String [] RefreshActivityIds;

    /**
    * Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. obtain the scaling group id by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
<li> refresh-activity-status-code - String - required: no - (filter criteria) filters by refresh activity status. (INIT: initializing | RUNNING: RUNNING | SUCCESSFUL: activity SUCCESSFUL | FAILED_PAUSE: PAUSE on failure | AUTO_PAUSE: AUTO PAUSE | MANUAL_PAUSE: manually PAUSE | CANCELLED: activity CANCELLED | FAILED: activity FAILED)</li>.
<li> refresh-activity-type - String - required: no - (filter) filter by refresh activity types. (NORMAL: regular refresh activity | ROLLBACK: ROLLBACK refresh activity)</li>.
<li> refresh-activity-id - String - required: no - (filter) filter by refresh activity id.</li>.
<li>The upper limit of Filters per request is 10, and that of Filter.Values is 5. The RefreshActivityIds and Filters parameters cannot be specified at the same time.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned pieces. Default value: 20. Maximum value: 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, 0 by default. For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get List of refresh activity IDs. IDs are formatted like: 'asr-5l2ejpfo'. The upper limit per request is 100. Parameters do not support specifying both RefreshActivityIds and Filters simultaneously. 
     * @return RefreshActivityIds List of refresh activity IDs. IDs are formatted like: 'asr-5l2ejpfo'. The upper limit per request is 100. Parameters do not support specifying both RefreshActivityIds and Filters simultaneously.
     */
    public String [] getRefreshActivityIds() {
        return this.RefreshActivityIds;
    }

    /**
     * Set List of refresh activity IDs. IDs are formatted like: 'asr-5l2ejpfo'. The upper limit per request is 100. Parameters do not support specifying both RefreshActivityIds and Filters simultaneously.
     * @param RefreshActivityIds List of refresh activity IDs. IDs are formatted like: 'asr-5l2ejpfo'. The upper limit per request is 100. Parameters do not support specifying both RefreshActivityIds and Filters simultaneously.
     */
    public void setRefreshActivityIds(String [] RefreshActivityIds) {
        this.RefreshActivityIds = RefreshActivityIds;
    }

    /**
     * Get Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. obtain the scaling group id by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
<li> refresh-activity-status-code - String - required: no - (filter criteria) filters by refresh activity status. (INIT: initializing | RUNNING: RUNNING | SUCCESSFUL: activity SUCCESSFUL | FAILED_PAUSE: PAUSE on failure | AUTO_PAUSE: AUTO PAUSE | MANUAL_PAUSE: manually PAUSE | CANCELLED: activity CANCELLED | FAILED: activity FAILED)</li>.
<li> refresh-activity-type - String - required: no - (filter) filter by refresh activity types. (NORMAL: regular refresh activity | ROLLBACK: ROLLBACK refresh activity)</li>.
<li> refresh-activity-id - String - required: no - (filter) filter by refresh activity id.</li>.
<li>The upper limit of Filters per request is 10, and that of Filter.Values is 5. The RefreshActivityIds and Filters parameters cannot be specified at the same time.</li> 
     * @return Filters Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. obtain the scaling group id by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
<li> refresh-activity-status-code - String - required: no - (filter criteria) filters by refresh activity status. (INIT: initializing | RUNNING: RUNNING | SUCCESSFUL: activity SUCCESSFUL | FAILED_PAUSE: PAUSE on failure | AUTO_PAUSE: AUTO PAUSE | MANUAL_PAUSE: manually PAUSE | CANCELLED: activity CANCELLED | FAILED: activity FAILED)</li>.
<li> refresh-activity-type - String - required: no - (filter) filter by refresh activity types. (NORMAL: regular refresh activity | ROLLBACK: ROLLBACK refresh activity)</li>.
<li> refresh-activity-id - String - required: no - (filter) filter by refresh activity id.</li>.
<li>The upper limit of Filters per request is 10, and that of Filter.Values is 5. The RefreshActivityIds and Filters parameters cannot be specified at the same time.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. obtain the scaling group id by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
<li> refresh-activity-status-code - String - required: no - (filter criteria) filters by refresh activity status. (INIT: initializing | RUNNING: RUNNING | SUCCESSFUL: activity SUCCESSFUL | FAILED_PAUSE: PAUSE on failure | AUTO_PAUSE: AUTO PAUSE | MANUAL_PAUSE: manually PAUSE | CANCELLED: activity CANCELLED | FAILED: activity FAILED)</li>.
<li> refresh-activity-type - String - required: no - (filter) filter by refresh activity types. (NORMAL: regular refresh activity | ROLLBACK: ROLLBACK refresh activity)</li>.
<li> refresh-activity-id - String - required: no - (filter) filter by refresh activity id.</li>.
<li>The upper limit of Filters per request is 10, and that of Filter.Values is 5. The RefreshActivityIds and Filters parameters cannot be specified at the same time.</li>
     * @param Filters Filter criteria

<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id. obtain the scaling group id by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
<li> refresh-activity-status-code - String - required: no - (filter criteria) filters by refresh activity status. (INIT: initializing | RUNNING: RUNNING | SUCCESSFUL: activity SUCCESSFUL | FAILED_PAUSE: PAUSE on failure | AUTO_PAUSE: AUTO PAUSE | MANUAL_PAUSE: manually PAUSE | CANCELLED: activity CANCELLED | FAILED: activity FAILED)</li>.
<li> refresh-activity-type - String - required: no - (filter) filter by refresh activity types. (NORMAL: regular refresh activity | ROLLBACK: ROLLBACK refresh activity)</li>.
<li> refresh-activity-id - String - required: no - (filter) filter by refresh activity id.</li>.
<li>The upper limit of Filters per request is 10, and that of Filter.Values is 5. The RefreshActivityIds and Filters parameters cannot be specified at the same time.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned pieces. Default value: 20. Maximum value: 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned pieces. Default value: 20. Maximum value: 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned pieces. Default value: 20. Maximum value: 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned pieces. Default value: 20. Maximum value: 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, 0 by default. For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset, 0 by default. For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, 0 by default. For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset, 0 by default. For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeRefreshActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRefreshActivitiesRequest(DescribeRefreshActivitiesRequest source) {
        if (source.RefreshActivityIds != null) {
            this.RefreshActivityIds = new String[source.RefreshActivityIds.length];
            for (int i = 0; i < source.RefreshActivityIds.length; i++) {
                this.RefreshActivityIds[i] = new String(source.RefreshActivityIds[i]);
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
        this.setParamArraySimple(map, prefix + "RefreshActivityIds.", this.RefreshActivityIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

