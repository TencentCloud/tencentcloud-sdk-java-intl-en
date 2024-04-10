/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * <li> name
Filter by Notification Channel Group Name.Type: String
Required: No</li>
<li> alarmNoticeId
Filter by Notification Channel Group ID.Type: String
Required: No</li>
<li> uid
Filter by Receiving User ID.Type: String
Required: No</li>
<li> groupId
Filter by Receiving User Group ID.Type: String
Required: No</li>

<li> deliverFlag
Filter by Delivery Status.Type: String
Required: No
Optional Values: "1": Not Enabled, "2": Enabled, "3": Delivery Exception</li>The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
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
     * Get <li> name
Filter by Notification Channel Group Name.Type: String
Required: No</li>
<li> alarmNoticeId
Filter by Notification Channel Group ID.Type: String
Required: No</li>
<li> uid
Filter by Receiving User ID.Type: String
Required: No</li>
<li> groupId
Filter by Receiving User Group ID.Type: String
Required: No</li>

<li> deliverFlag
Filter by Delivery Status.Type: String
Required: No
Optional Values: "1": Not Enabled, "2": Enabled, "3": Delivery Exception</li>The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5. 
     * @return Filters <li> name
Filter by Notification Channel Group Name.Type: String
Required: No</li>
<li> alarmNoticeId
Filter by Notification Channel Group ID.Type: String
Required: No</li>
<li> uid
Filter by Receiving User ID.Type: String
Required: No</li>
<li> groupId
Filter by Receiving User Group ID.Type: String
Required: No</li>

<li> deliverFlag
Filter by Delivery Status.Type: String
Required: No
Optional Values: "1": Not Enabled, "2": Enabled, "3": Delivery Exception</li>The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li> name
Filter by Notification Channel Group Name.Type: String
Required: No</li>
<li> alarmNoticeId
Filter by Notification Channel Group ID.Type: String
Required: No</li>
<li> uid
Filter by Receiving User ID.Type: String
Required: No</li>
<li> groupId
Filter by Receiving User Group ID.Type: String
Required: No</li>

<li> deliverFlag
Filter by Delivery Status.Type: String
Required: No
Optional Values: "1": Not Enabled, "2": Enabled, "3": Delivery Exception</li>The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     * @param Filters <li> name
Filter by Notification Channel Group Name.Type: String
Required: No</li>
<li> alarmNoticeId
Filter by Notification Channel Group ID.Type: String
Required: No</li>
<li> uid
Filter by Receiving User ID.Type: String
Required: No</li>
<li> groupId
Filter by Receiving User Group ID.Type: String
Required: No</li>

<li> deliverFlag
Filter by Delivery Status.Type: String
Required: No
Optional Values: "1": Not Enabled, "2": Enabled, "3": Delivery Exception</li>The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

