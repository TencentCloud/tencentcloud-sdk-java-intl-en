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

public class DescribeJavaMemShellListRequest extends AbstractModel {

    /**
    * Filtering criteria: InstanceID and IP

MachineName host name for fuzzy query; Type, status for precise match; CreateBeginTime, CreateEndTime for time period
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Offset, which defaults to 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items to be returned. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting method (case insensitive): asc for ascending order; desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort column, strictly equal: Latest detection time RecentFoundTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filtering criteria: InstanceID and IP

MachineName host name for fuzzy query; Type, status for precise match; CreateBeginTime, CreateEndTime for time period 
     * @return Filters Filtering criteria: InstanceID and IP

MachineName host name for fuzzy query; Type, status for precise match; CreateBeginTime, CreateEndTime for time period
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria: InstanceID and IP

MachineName host name for fuzzy query; Type, status for precise match; CreateBeginTime, CreateEndTime for time period
     * @param Filters Filtering criteria: InstanceID and IP

MachineName host name for fuzzy query; Type, status for precise match; CreateBeginTime, CreateEndTime for time period
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset, which defaults to 0 
     * @return Offset Offset, which defaults to 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which defaults to 0
     * @param Offset Offset, which defaults to 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items to be returned. It is 10 by default, and the maximum value is 100. 
     * @return Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be returned. It is 10 by default, and the maximum value is 100.
     * @param Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting method (case insensitive): asc for ascending order; desc for descending order 
     * @return Order Sorting method (case insensitive): asc for ascending order; desc for descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method (case insensitive): asc for ascending order; desc for descending order
     * @param Order Sorting method (case insensitive): asc for ascending order; desc for descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort column, strictly equal: Latest detection time RecentFoundTime 
     * @return By Sort column, strictly equal: Latest detection time RecentFoundTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort column, strictly equal: Latest detection time RecentFoundTime
     * @param By Sort column, strictly equal: Latest detection time RecentFoundTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeJavaMemShellListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJavaMemShellListRequest(DescribeJavaMemShellListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

