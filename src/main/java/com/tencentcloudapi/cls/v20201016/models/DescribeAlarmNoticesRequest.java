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

public class DescribeAlarmNoticesRequest extends AbstractModel {

    /**
    * name
Filter by [notification channel group name].
Type: String
"Filters":[{"Key":"name","Values":["test-notice"]}]
Required: No
alarmNoticeId
Filter by [notification channel group ID].
Type: String
"Filters": [{Key: "alarmNoticeId", Values: ["notice-5281f1d2-6275-4e56-9ec3-a1eb19d8bc2f"]}]
Required: No
uid
Filter by [recipient user ID].
Type: String
"Filters": [{Key: "uid", Values: ["1137546"]}]
Required: No
groupId
Filter by [recipient user group ID].
Type: String
"Filters": [{Key: "groupId", Values: ["344098"]}]
Required: No

deliverFlag
Filter by [delivery status].
Type: String
Required: No
Available values: "1": disabled, "2": enabled, "3": delivery exception
"Filters":[{"Key":"deliverFlag","Values":["2"]}]
The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Page offset. Default value: 0
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
    * Whether to return the quantity information of alarm silence statistics status in the configured notification channel group.
- true: Need to return.
- false: do not return (default false).
    */
    @SerializedName("HasAlarmShieldCount")
    @Expose
    private Boolean HasAlarmShieldCount;

    /**
     * Get name
Filter by [notification channel group name].
Type: String
"Filters":[{"Key":"name","Values":["test-notice"]}]
Required: No
alarmNoticeId
Filter by [notification channel group ID].
Type: String
"Filters": [{Key: "alarmNoticeId", Values: ["notice-5281f1d2-6275-4e56-9ec3-a1eb19d8bc2f"]}]
Required: No
uid
Filter by [recipient user ID].
Type: String
"Filters": [{Key: "uid", Values: ["1137546"]}]
Required: No
groupId
Filter by [recipient user group ID].
Type: String
"Filters": [{Key: "groupId", Values: ["344098"]}]
Required: No

deliverFlag
Filter by [delivery status].
Type: String
Required: No
Available values: "1": disabled, "2": enabled, "3": delivery exception
"Filters":[{"Key":"deliverFlag","Values":["2"]}]
The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5. 
     * @return Filters name
Filter by [notification channel group name].
Type: String
"Filters":[{"Key":"name","Values":["test-notice"]}]
Required: No
alarmNoticeId
Filter by [notification channel group ID].
Type: String
"Filters": [{Key: "alarmNoticeId", Values: ["notice-5281f1d2-6275-4e56-9ec3-a1eb19d8bc2f"]}]
Required: No
uid
Filter by [recipient user ID].
Type: String
"Filters": [{Key: "uid", Values: ["1137546"]}]
Required: No
groupId
Filter by [recipient user group ID].
Type: String
"Filters": [{Key: "groupId", Values: ["344098"]}]
Required: No

deliverFlag
Filter by [delivery status].
Type: String
Required: No
Available values: "1": disabled, "2": enabled, "3": delivery exception
"Filters":[{"Key":"deliverFlag","Values":["2"]}]
The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set name
Filter by [notification channel group name].
Type: String
"Filters":[{"Key":"name","Values":["test-notice"]}]
Required: No
alarmNoticeId
Filter by [notification channel group ID].
Type: String
"Filters": [{Key: "alarmNoticeId", Values: ["notice-5281f1d2-6275-4e56-9ec3-a1eb19d8bc2f"]}]
Required: No
uid
Filter by [recipient user ID].
Type: String
"Filters": [{Key: "uid", Values: ["1137546"]}]
Required: No
groupId
Filter by [recipient user group ID].
Type: String
"Filters": [{Key: "groupId", Values: ["344098"]}]
Required: No

deliverFlag
Filter by [delivery status].
Type: String
Required: No
Available values: "1": disabled, "2": enabled, "3": delivery exception
"Filters":[{"Key":"deliverFlag","Values":["2"]}]
The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     * @param Filters name
Filter by [notification channel group name].
Type: String
"Filters":[{"Key":"name","Values":["test-notice"]}]
Required: No
alarmNoticeId
Filter by [notification channel group ID].
Type: String
"Filters": [{Key: "alarmNoticeId", Values: ["notice-5281f1d2-6275-4e56-9ec3-a1eb19d8bc2f"]}]
Required: No
uid
Filter by [recipient user ID].
Type: String
"Filters": [{Key: "uid", Values: ["1137546"]}]
Required: No
groupId
Filter by [recipient user group ID].
Type: String
"Filters": [{Key: "groupId", Values: ["344098"]}]
Required: No

deliverFlag
Filter by [delivery status].
Type: String
Required: No
Available values: "1": disabled, "2": enabled, "3": delivery exception
"Filters":[{"Key":"deliverFlag","Values":["2"]}]
The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Page offset. Default value: 0 
     * @return Offset Page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. Default value: 0
     * @param Offset Page offset. Default value: 0
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
     * Get Whether to return the quantity information of alarm silence statistics status in the configured notification channel group.
- true: Need to return.
- false: do not return (default false). 
     * @return HasAlarmShieldCount Whether to return the quantity information of alarm silence statistics status in the configured notification channel group.
- true: Need to return.
- false: do not return (default false).
     */
    public Boolean getHasAlarmShieldCount() {
        return this.HasAlarmShieldCount;
    }

    /**
     * Set Whether to return the quantity information of alarm silence statistics status in the configured notification channel group.
- true: Need to return.
- false: do not return (default false).
     * @param HasAlarmShieldCount Whether to return the quantity information of alarm silence statistics status in the configured notification channel group.
- true: Need to return.
- false: do not return (default false).
     */
    public void setHasAlarmShieldCount(Boolean HasAlarmShieldCount) {
        this.HasAlarmShieldCount = HasAlarmShieldCount;
    }

    public DescribeAlarmNoticesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNoticesRequest(DescribeAlarmNoticesRequest source) {
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
        if (source.HasAlarmShieldCount != null) {
            this.HasAlarmShieldCount = new Boolean(source.HasAlarmShieldCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "HasAlarmShieldCount", this.HasAlarmShieldCount);

    }
}

