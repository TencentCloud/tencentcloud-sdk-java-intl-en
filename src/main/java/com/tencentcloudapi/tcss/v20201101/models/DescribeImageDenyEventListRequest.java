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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageDenyEventListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>EventType - String - Required: No - Event type. EVENT_RISK: Risk event type. EVENT_PRIVILEGE: Privilege.</li>
<li>DealBehavior - String - required: no - execution action, BEHAVIOR_ALERT: alert, BEHAVIOR_HOLDUP_SUCCESSED: block.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>NodeName- string - required: no - node name.</li>
<li>NodeIP - string - required: no - private and public IP.</li>
<li>PublicIP - string - required: no - public IP address.</li>
<li>ImageName- string - required: no - image name.</li>
<li>ImageID - string - required: no - image ID.</li>
<li>TimeRange - String - required: no - time range, the first value represents the start time, second value represents end time</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Number of entries to be returned. Default value: 10. Maximum value: 100.
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
    * Sort Mode: DESC, ACS
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort field. EventCount: Alarm quantity; LatestFoundTime: Most recent generation time
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter criteria
<li>EventType - String - Required: No - Event type. EVENT_RISK: Risk event type. EVENT_PRIVILEGE: Privilege.</li>
<li>DealBehavior - String - required: no - execution action, BEHAVIOR_ALERT: alert, BEHAVIOR_HOLDUP_SUCCESSED: block.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>NodeName- string - required: no - node name.</li>
<li>NodeIP - string - required: no - private and public IP.</li>
<li>PublicIP - string - required: no - public IP address.</li>
<li>ImageName- string - required: no - image name.</li>
<li>ImageID - string - required: no - image ID.</li>
<li>TimeRange - String - required: no - time range, the first value represents the start time, second value represents end time</li> 
     * @return Filters Filter criteria
<li>EventType - String - Required: No - Event type. EVENT_RISK: Risk event type. EVENT_PRIVILEGE: Privilege.</li>
<li>DealBehavior - String - required: no - execution action, BEHAVIOR_ALERT: alert, BEHAVIOR_HOLDUP_SUCCESSED: block.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>NodeName- string - required: no - node name.</li>
<li>NodeIP - string - required: no - private and public IP.</li>
<li>PublicIP - string - required: no - public IP address.</li>
<li>ImageName- string - required: no - image name.</li>
<li>ImageID - string - required: no - image ID.</li>
<li>TimeRange - String - required: no - time range, the first value represents the start time, second value represents end time</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>EventType - String - Required: No - Event type. EVENT_RISK: Risk event type. EVENT_PRIVILEGE: Privilege.</li>
<li>DealBehavior - String - required: no - execution action, BEHAVIOR_ALERT: alert, BEHAVIOR_HOLDUP_SUCCESSED: block.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>NodeName- string - required: no - node name.</li>
<li>NodeIP - string - required: no - private and public IP.</li>
<li>PublicIP - string - required: no - public IP address.</li>
<li>ImageName- string - required: no - image name.</li>
<li>ImageID - string - required: no - image ID.</li>
<li>TimeRange - String - required: no - time range, the first value represents the start time, second value represents end time</li>
     * @param Filters Filter criteria
<li>EventType - String - Required: No - Event type. EVENT_RISK: Risk event type. EVENT_PRIVILEGE: Privilege.</li>
<li>DealBehavior - String - required: no - execution action, BEHAVIOR_ALERT: alert, BEHAVIOR_HOLDUP_SUCCESSED: block.</li>
<li>RuleName - string - required: no - rule name.</li>
<li>NodeName- string - required: no - node name.</li>
<li>NodeIP - string - required: no - private and public IP.</li>
<li>PublicIP - string - required: no - public IP address.</li>
<li>ImageName- string - required: no - image name.</li>
<li>ImageID - string - required: no - image ID.</li>
<li>TimeRange - String - required: no - time range, the first value represents the start time, second value represents end time</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of entries to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
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

    /**
     * Get Sort Mode: DESC, ACS 
     * @return Order Sort Mode: DESC, ACS
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort Mode: DESC, ACS
     * @param Order Sort Mode: DESC, ACS
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort field. EventCount: Alarm quantity; LatestFoundTime: Most recent generation time 
     * @return By Sort field. EventCount: Alarm quantity; LatestFoundTime: Most recent generation time
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort field. EventCount: Alarm quantity; LatestFoundTime: Most recent generation time
     * @param By Sort field. EventCount: Alarm quantity; LatestFoundTime: Most recent generation time
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeImageDenyEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageDenyEventListRequest(DescribeImageDenyEventListRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

