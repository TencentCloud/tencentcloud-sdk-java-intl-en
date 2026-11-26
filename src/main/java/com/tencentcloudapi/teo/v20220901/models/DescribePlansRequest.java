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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlansRequest extends AbstractModel {

    /**
    * Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:<li>plan-type<br>  Filter by <strong>package type</strong>.<br>  Selectable types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan; <br>  plan-standard: Standard Edition Plan; <br>  plan-enterprise: enterprise plan. </li><li>plan-id<br>  Filter by <strong>Package ID</strong>. The package ID format is: edgeone-268z103ob0sx.</li><li>area<br>  Filter by <strong>package acceleration region</strong>.</li>  Service area. Selectable types:<br>  mainland: Chinese mainland;<br>  overseas: global (excluding Chinese mainland);<br>  global: global (including Chinese mainland).<br><li>status<br>  Filter by <strong>package status</strong>.<br>  Selectable statuses:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting field. Valid values:
<li> enable-time: effective time;</li>
<li> expire-time: expiration time.</li>Use the default value enable-time if not specified.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting order. Valid values:
<li>asc: sort in ascending order;</li>
<li>desc: descending order.</li>Use default value desc if not specified.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Number limit of paginated query. Default value: 20. Maximum value: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:<li>plan-type<br>  Filter by <strong>package type</strong>.<br>  Selectable types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan; <br>  plan-standard: Standard Edition Plan; <br>  plan-enterprise: enterprise plan. </li><li>plan-id<br>  Filter by <strong>Package ID</strong>. The package ID format is: edgeone-268z103ob0sx.</li><li>area<br>  Filter by <strong>package acceleration region</strong>.</li>  Service area. Selectable types:<br>  mainland: Chinese mainland;<br>  overseas: global (excluding Chinese mainland);<br>  global: global (including Chinese mainland).<br><li>status<br>  Filter by <strong>package status</strong>.<br>  Selectable statuses:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li> 
     * @return Filters Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:<li>plan-type<br>  Filter by <strong>package type</strong>.<br>  Selectable types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan; <br>  plan-standard: Standard Edition Plan; <br>  plan-enterprise: enterprise plan. </li><li>plan-id<br>  Filter by <strong>Package ID</strong>. The package ID format is: edgeone-268z103ob0sx.</li><li>area<br>  Filter by <strong>package acceleration region</strong>.</li>  Service area. Selectable types:<br>  mainland: Chinese mainland;<br>  overseas: global (excluding Chinese mainland);<br>  global: global (including Chinese mainland).<br><li>status<br>  Filter by <strong>package status</strong>.<br>  Selectable statuses:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:<li>plan-type<br>  Filter by <strong>package type</strong>.<br>  Selectable types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan; <br>  plan-standard: Standard Edition Plan; <br>  plan-enterprise: enterprise plan. </li><li>plan-id<br>  Filter by <strong>Package ID</strong>. The package ID format is: edgeone-268z103ob0sx.</li><li>area<br>  Filter by <strong>package acceleration region</strong>.</li>  Service area. Selectable types:<br>  mainland: Chinese mainland;<br>  overseas: global (excluding Chinese mainland);<br>  global: global (including Chinese mainland).<br><li>status<br>  Filter by <strong>package status</strong>.<br>  Selectable statuses:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>
     * @param Filters Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:<li>plan-type<br>  Filter by <strong>package type</strong>.<br>  Selectable types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan; <br>  plan-standard: Standard Edition Plan; <br>  plan-enterprise: enterprise plan. </li><li>plan-id<br>  Filter by <strong>Package ID</strong>. The package ID format is: edgeone-268z103ob0sx.</li><li>area<br>  Filter by <strong>package acceleration region</strong>.</li>  Service area. Selectable types:<br>  mainland: Chinese mainland;<br>  overseas: global (excluding Chinese mainland);<br>  global: global (including Chinese mainland).<br><li>status<br>  Filter by <strong>package status</strong>.<br>  Selectable statuses:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field. Valid values:
<li> enable-time: effective time;</li>
<li> expire-time: expiration time.</li>Use the default value enable-time if not specified. 
     * @return Order Sorting field. Valid values:
<li> enable-time: effective time;</li>
<li> expire-time: expiration time.</li>Use the default value enable-time if not specified.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting field. Valid values:
<li> enable-time: effective time;</li>
<li> expire-time: expiration time.</li>Use the default value enable-time if not specified.
     * @param Order Sorting field. Valid values:
<li> enable-time: effective time;</li>
<li> expire-time: expiration time.</li>Use the default value enable-time if not specified.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting order. Valid values:
<li>asc: sort in ascending order;</li>
<li>desc: descending order.</li>Use default value desc if not specified. 
     * @return Direction Sorting order. Valid values:
<li>asc: sort in ascending order;</li>
<li>desc: descending order.</li>Use default value desc if not specified.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Sorting order. Valid values:
<li>asc: sort in ascending order;</li>
<li>desc: descending order.</li>Use default value desc if not specified.
     * @param Direction Sorting order. Valid values:
<li>asc: sort in ascending order;</li>
<li>desc: descending order.</li>Use default value desc if not specified.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Number limit of paginated query. Default value: 20. Maximum value: 200. 
     * @return Limit Number limit of paginated query. Default value: 20. Maximum value: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Maximum value: 200.
     * @param Limit Number limit of paginated query. Default value: 20. Maximum value: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The offset of paginated query. Default value: 0. 
     * @return Offset The offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset of paginated query. Default value: 0.
     * @param Offset The offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribePlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlansRequest(DescribePlansRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

