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

public class DescribeAutoScalingActivitiesRequest extends AbstractModel {

    /**
    * Queries by one or more scaling activity IDs in the format of `asa-5l2ejpfo`. The maximum quantity per request is 100. This parameter does not support specifying both `ActivityIds` and `Filters` at the same time.
    */
    @SerializedName("ActivityIds")
    @Expose
    private String [] ActivityIds;

    /**
    * Filter criteria. the filter field value ranges from...to.
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>Filter by [<strong>scaling group id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) or call the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) to obtain the scaling group id from the returned information.</li><li>type: String</li><li>required: no</li><li>example value: asg-kiju7yt5</li></ul></li>  <li><strong>activity-status-code</strong><ul><li>filter by [<strong>scaling activity status</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>INIT: initializing</li><li>RUNNING: RUNNING</li><li>SUCCESSFUL: SUCCESSFUL activity</li><li>PARTIALLY_SUCCESSFUL: PARTIALLY SUCCESSFUL activity</li><li>FAILED: activity FAILED</li><li>CANCELLED: activity CANCELLED</li></ul></ul></li>  <li><strong>activity-type</strong><ul><li>filter by [<strong>scaling activity type</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>SCALE_OUT: SCALE-OUT activity</li><li>SCALE_IN: SCALE-IN activity</li><li>ATTACH_INSTANCES: adding INSTANCES</li><li>REMOVE_INSTANCES: terminating INSTANCES</li><li>DETACH_INSTANCES: REMOVE INSTANCE</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY: TERMINATE INSTANCE IN CVM console</li><li>REPLACE_UNHEALTHY_INSTANCE: REPLACE UNHEALTHY INSTANCES</li><li>START_INSTANCES: START INSTANCES</li><li>STOP_INSTANCES: shut down INSTANCE</li><li>INVOKE_COMMAND: execute COMMAND</li></ul></ul></li>  <li><strong>activity-id</strong><ul><li>filter by [<strong>scaling activity id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) to obtain the scaling activity id.</li><li>type: String</li><li>required: no</li><li>example value: asa-hy6tr4ed</li></ul></li></ul>.
The maximum number of `Filters` per request is 10. the upper limit for `Filter.Values` is 5. parameters must not specify both `ActivityIds` and `Filters` simultaneously.
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
    * The earliest start time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The latest end time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Queries by one or more scaling activity IDs in the format of `asa-5l2ejpfo`. The maximum quantity per request is 100. This parameter does not support specifying both `ActivityIds` and `Filters` at the same time. 
     * @return ActivityIds Queries by one or more scaling activity IDs in the format of `asa-5l2ejpfo`. The maximum quantity per request is 100. This parameter does not support specifying both `ActivityIds` and `Filters` at the same time.
     */
    public String [] getActivityIds() {
        return this.ActivityIds;
    }

    /**
     * Set Queries by one or more scaling activity IDs in the format of `asa-5l2ejpfo`. The maximum quantity per request is 100. This parameter does not support specifying both `ActivityIds` and `Filters` at the same time.
     * @param ActivityIds Queries by one or more scaling activity IDs in the format of `asa-5l2ejpfo`. The maximum quantity per request is 100. This parameter does not support specifying both `ActivityIds` and `Filters` at the same time.
     */
    public void setActivityIds(String [] ActivityIds) {
        this.ActivityIds = ActivityIds;
    }

    /**
     * Get Filter criteria. the filter field value ranges from...to.
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>Filter by [<strong>scaling group id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) or call the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) to obtain the scaling group id from the returned information.</li><li>type: String</li><li>required: no</li><li>example value: asg-kiju7yt5</li></ul></li>  <li><strong>activity-status-code</strong><ul><li>filter by [<strong>scaling activity status</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>INIT: initializing</li><li>RUNNING: RUNNING</li><li>SUCCESSFUL: SUCCESSFUL activity</li><li>PARTIALLY_SUCCESSFUL: PARTIALLY SUCCESSFUL activity</li><li>FAILED: activity FAILED</li><li>CANCELLED: activity CANCELLED</li></ul></ul></li>  <li><strong>activity-type</strong><ul><li>filter by [<strong>scaling activity type</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>SCALE_OUT: SCALE-OUT activity</li><li>SCALE_IN: SCALE-IN activity</li><li>ATTACH_INSTANCES: adding INSTANCES</li><li>REMOVE_INSTANCES: terminating INSTANCES</li><li>DETACH_INSTANCES: REMOVE INSTANCE</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY: TERMINATE INSTANCE IN CVM console</li><li>REPLACE_UNHEALTHY_INSTANCE: REPLACE UNHEALTHY INSTANCES</li><li>START_INSTANCES: START INSTANCES</li><li>STOP_INSTANCES: shut down INSTANCE</li><li>INVOKE_COMMAND: execute COMMAND</li></ul></ul></li>  <li><strong>activity-id</strong><ul><li>filter by [<strong>scaling activity id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) to obtain the scaling activity id.</li><li>type: String</li><li>required: no</li><li>example value: asa-hy6tr4ed</li></ul></li></ul>.
The maximum number of `Filters` per request is 10. the upper limit for `Filter.Values` is 5. parameters must not specify both `ActivityIds` and `Filters` simultaneously. 
     * @return Filters Filter criteria. the filter field value ranges from...to.
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>Filter by [<strong>scaling group id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) or call the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) to obtain the scaling group id from the returned information.</li><li>type: String</li><li>required: no</li><li>example value: asg-kiju7yt5</li></ul></li>  <li><strong>activity-status-code</strong><ul><li>filter by [<strong>scaling activity status</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>INIT: initializing</li><li>RUNNING: RUNNING</li><li>SUCCESSFUL: SUCCESSFUL activity</li><li>PARTIALLY_SUCCESSFUL: PARTIALLY SUCCESSFUL activity</li><li>FAILED: activity FAILED</li><li>CANCELLED: activity CANCELLED</li></ul></ul></li>  <li><strong>activity-type</strong><ul><li>filter by [<strong>scaling activity type</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>SCALE_OUT: SCALE-OUT activity</li><li>SCALE_IN: SCALE-IN activity</li><li>ATTACH_INSTANCES: adding INSTANCES</li><li>REMOVE_INSTANCES: terminating INSTANCES</li><li>DETACH_INSTANCES: REMOVE INSTANCE</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY: TERMINATE INSTANCE IN CVM console</li><li>REPLACE_UNHEALTHY_INSTANCE: REPLACE UNHEALTHY INSTANCES</li><li>START_INSTANCES: START INSTANCES</li><li>STOP_INSTANCES: shut down INSTANCE</li><li>INVOKE_COMMAND: execute COMMAND</li></ul></ul></li>  <li><strong>activity-id</strong><ul><li>filter by [<strong>scaling activity id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) to obtain the scaling activity id.</li><li>type: String</li><li>required: no</li><li>example value: asa-hy6tr4ed</li></ul></li></ul>.
The maximum number of `Filters` per request is 10. the upper limit for `Filter.Values` is 5. parameters must not specify both `ActivityIds` and `Filters` simultaneously.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. the filter field value ranges from...to.
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>Filter by [<strong>scaling group id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) or call the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) to obtain the scaling group id from the returned information.</li><li>type: String</li><li>required: no</li><li>example value: asg-kiju7yt5</li></ul></li>  <li><strong>activity-status-code</strong><ul><li>filter by [<strong>scaling activity status</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>INIT: initializing</li><li>RUNNING: RUNNING</li><li>SUCCESSFUL: SUCCESSFUL activity</li><li>PARTIALLY_SUCCESSFUL: PARTIALLY SUCCESSFUL activity</li><li>FAILED: activity FAILED</li><li>CANCELLED: activity CANCELLED</li></ul></ul></li>  <li><strong>activity-type</strong><ul><li>filter by [<strong>scaling activity type</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>SCALE_OUT: SCALE-OUT activity</li><li>SCALE_IN: SCALE-IN activity</li><li>ATTACH_INSTANCES: adding INSTANCES</li><li>REMOVE_INSTANCES: terminating INSTANCES</li><li>DETACH_INSTANCES: REMOVE INSTANCE</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY: TERMINATE INSTANCE IN CVM console</li><li>REPLACE_UNHEALTHY_INSTANCE: REPLACE UNHEALTHY INSTANCES</li><li>START_INSTANCES: START INSTANCES</li><li>STOP_INSTANCES: shut down INSTANCE</li><li>INVOKE_COMMAND: execute COMMAND</li></ul></ul></li>  <li><strong>activity-id</strong><ul><li>filter by [<strong>scaling activity id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) to obtain the scaling activity id.</li><li>type: String</li><li>required: no</li><li>example value: asa-hy6tr4ed</li></ul></li></ul>.
The maximum number of `Filters` per request is 10. the upper limit for `Filter.Values` is 5. parameters must not specify both `ActivityIds` and `Filters` simultaneously.
     * @param Filters Filter criteria. the filter field value ranges from...to.
<ul>
<li><strong>auto-scaling-group-id</strong><ul><li>Filter by [<strong>scaling group id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) or call the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) to obtain the scaling group id from the returned information.</li><li>type: String</li><li>required: no</li><li>example value: asg-kiju7yt5</li></ul></li>  <li><strong>activity-status-code</strong><ul><li>filter by [<strong>scaling activity status</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>INIT: initializing</li><li>RUNNING: RUNNING</li><li>SUCCESSFUL: SUCCESSFUL activity</li><li>PARTIALLY_SUCCESSFUL: PARTIALLY SUCCESSFUL activity</li><li>FAILED: activity FAILED</li><li>CANCELLED: activity CANCELLED</li></ul></ul></li>  <li><strong>activity-type</strong><ul><li>filter by [<strong>scaling activity type</strong>]</li><li>type: String</li><li>required: no</li><li>options: </li><ul><li>SCALE_OUT: SCALE-OUT activity</li><li>SCALE_IN: SCALE-IN activity</li><li>ATTACH_INSTANCES: adding INSTANCES</li><li>REMOVE_INSTANCES: terminating INSTANCES</li><li>DETACH_INSTANCES: REMOVE INSTANCE</li><li>TERMINATE_INSTANCES_UNEXPECTEDLY: TERMINATE INSTANCE IN CVM console</li><li>REPLACE_UNHEALTHY_INSTANCE: REPLACE UNHEALTHY INSTANCES</li><li>START_INSTANCES: START INSTANCES</li><li>STOP_INSTANCES: shut down INSTANCE</li><li>INVOKE_COMMAND: execute COMMAND</li></ul></ul></li>  <li><strong>activity-id</strong><ul><li>filter by [<strong>scaling activity id</strong>]. you can log IN to the [console](https://console.cloud.tencent.com/autoscaling/group) to obtain the scaling activity id.</li><li>type: String</li><li>required: no</li><li>example value: asa-hy6tr4ed</li></ul></li></ul>.
The maximum number of `Filters` per request is 10. the upper limit for `Filter.Values` is 5. parameters must not specify both `ActivityIds` and `Filters` simultaneously.
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

    /**
     * Get The earliest start time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard. 
     * @return StartTime The earliest start time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The earliest start time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     * @param StartTime The earliest start time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The latest end time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard. 
     * @return EndTime The latest end time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The latest end time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     * @param EndTime The latest end time of the scaling activity, which will be ignored if ActivityIds is specified. The value is in `UTC time` in the format of `YYYY-MM-DDThh:mm:ssZ` according to the `ISO8601` standard.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeAutoScalingActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingActivitiesRequest(DescribeAutoScalingActivitiesRequest source) {
        if (source.ActivityIds != null) {
            this.ActivityIds = new String[source.ActivityIds.length];
            for (int i = 0; i < source.ActivityIds.length; i++) {
                this.ActivityIds[i] = new String(source.ActivityIds[i]);
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ActivityIds.", this.ActivityIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

