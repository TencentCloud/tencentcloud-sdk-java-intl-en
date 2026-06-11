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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRansomDefenseEventsListRequest extends AbstractModel {

    /**
    * Pagination parameters (The maximum quantity is 100)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting method: ASC / DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field, supporting CreateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Event Creation Start Time
    */
    @SerializedName("CreateBeginTime")
    @Expose
    private String CreateBeginTime;

    /**
    * Incident creation end time
    */
    @SerializedName("CreateEndTime")
    @Expose
    private String CreateEndTime;

    /**
     * Get Pagination parameters (The maximum quantity is 100) 
     * @return Limit Pagination parameters (The maximum quantity is 100)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters (The maximum quantity is 100)
     * @param Limit Pagination parameters (The maximum quantity is 100)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li> 
     * @return Filters Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
     * @param Filters Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: ASC / DESC 
     * @return Order Sorting method: ASC / DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: ASC / DESC
     * @param Order Sorting method: ASC / DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field, supporting CreateTime 
     * @return By Sorting field, supporting CreateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field, supporting CreateTime
     * @param By Sorting field, supporting CreateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Event Creation Start Time 
     * @return CreateBeginTime Event Creation Start Time
     */
    public String getCreateBeginTime() {
        return this.CreateBeginTime;
    }

    /**
     * Set Event Creation Start Time
     * @param CreateBeginTime Event Creation Start Time
     */
    public void setCreateBeginTime(String CreateBeginTime) {
        this.CreateBeginTime = CreateBeginTime;
    }

    /**
     * Get Incident creation end time 
     * @return CreateEndTime Incident creation end time
     */
    public String getCreateEndTime() {
        return this.CreateEndTime;
    }

    /**
     * Set Incident creation end time
     * @param CreateEndTime Incident creation end time
     */
    public void setCreateEndTime(String CreateEndTime) {
        this.CreateEndTime = CreateEndTime;
    }

    public DescribeRansomDefenseEventsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRansomDefenseEventsListRequest(DescribeRansomDefenseEventsListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.CreateBeginTime != null) {
            this.CreateBeginTime = new String(source.CreateBeginTime);
        }
        if (source.CreateEndTime != null) {
            this.CreateEndTime = new String(source.CreateEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "CreateBeginTime", this.CreateBeginTime);
        this.setParamSimple(map, prefix + "CreateEndTime", this.CreateEndTime);

    }
}

