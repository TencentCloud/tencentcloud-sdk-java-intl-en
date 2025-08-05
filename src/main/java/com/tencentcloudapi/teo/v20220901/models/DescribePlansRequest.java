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
    * Filter criteria: the maximum number of Filters.Values is 20. detailed filter criteria are as follows: <li>plan-type<br>  filter by <strong>package type</strong>.<br>  available types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan;<br>  plan-standard: standard edition plan;<br>  plan-enterprise: enterprise plan.</li> <li>plan-id<br>  filter by <strong>package id</strong>. the package id format is: edgeone-268z103ob0sx.</li> <li>area<br>  filter by <strong>acceleration region</strong>.</li> service area. available types:<br>  mainland: chinese mainland;<br>  overseas: worldwide (excluding chinese mainland);<br>  global: global (including chinese mainland). <li>status<br>  filter by <strong>status</strong>.<br>  available states:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Specifies the sorting field. valid values:.
<li>enable-time: effective time;</li>.
<Li> expire-time: expiration time.</li>use default value enable-time if not specified.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting order. valid values:.
<Li>`Asc`: sort in ascending order</li>.
<Li>`Desc`: from the largest to smallest.</li>default value: `desc`.
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
     * Get Filter criteria: the maximum number of Filters.Values is 20. detailed filter criteria are as follows: <li>plan-type<br>  filter by <strong>package type</strong>.<br>  available types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan;<br>  plan-standard: standard edition plan;<br>  plan-enterprise: enterprise plan.</li> <li>plan-id<br>  filter by <strong>package id</strong>. the package id format is: edgeone-268z103ob0sx.</li> <li>area<br>  filter by <strong>acceleration region</strong>.</li> service area. available types:<br>  mainland: chinese mainland;<br>  overseas: worldwide (excluding chinese mainland);<br>  global: global (including chinese mainland). <li>status<br>  filter by <strong>status</strong>.<br>  available states:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>. 
     * @return Filters Filter criteria: the maximum number of Filters.Values is 20. detailed filter criteria are as follows: <li>plan-type<br>  filter by <strong>package type</strong>.<br>  available types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan;<br>  plan-standard: standard edition plan;<br>  plan-enterprise: enterprise plan.</li> <li>plan-id<br>  filter by <strong>package id</strong>. the package id format is: edgeone-268z103ob0sx.</li> <li>area<br>  filter by <strong>acceleration region</strong>.</li> service area. available types:<br>  mainland: chinese mainland;<br>  overseas: worldwide (excluding chinese mainland);<br>  global: global (including chinese mainland). <li>status<br>  filter by <strong>status</strong>.<br>  available states:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria: the maximum number of Filters.Values is 20. detailed filter criteria are as follows: <li>plan-type<br>  filter by <strong>package type</strong>.<br>  available types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan;<br>  plan-standard: standard edition plan;<br>  plan-enterprise: enterprise plan.</li> <li>plan-id<br>  filter by <strong>package id</strong>. the package id format is: edgeone-268z103ob0sx.</li> <li>area<br>  filter by <strong>acceleration region</strong>.</li> service area. available types:<br>  mainland: chinese mainland;<br>  overseas: worldwide (excluding chinese mainland);<br>  global: global (including chinese mainland). <li>status<br>  filter by <strong>status</strong>.<br>  available states:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>.
     * @param Filters Filter criteria: the maximum number of Filters.Values is 20. detailed filter criteria are as follows: <li>plan-type<br>  filter by <strong>package type</strong>.<br>  available types:<br>  plan-trial: trial package;<br>  plan-personal: personal plan;<br>  plan-basic: basic plan;<br>  plan-standard: standard edition plan;<br>  plan-enterprise: enterprise plan.</li> <li>plan-id<br>  filter by <strong>package id</strong>. the package id format is: edgeone-268z103ob0sx.</li> <li>area<br>  filter by <strong>acceleration region</strong>.</li> service area. available types:<br>  mainland: chinese mainland;<br>  overseas: worldwide (excluding chinese mainland);<br>  global: global (including chinese mainland). <li>status<br>  filter by <strong>status</strong>.<br>  available states:<br>  normal: normal status;<br>  expiring-soon: expiring soon;<br>  expired: expired;<br>  isolated: isolated.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Specifies the sorting field. valid values:.
<li>enable-time: effective time;</li>.
<Li> expire-time: expiration time.</li>use default value enable-time if not specified. 
     * @return Order Specifies the sorting field. valid values:.
<li>enable-time: effective time;</li>.
<Li> expire-time: expiration time.</li>use default value enable-time if not specified.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Specifies the sorting field. valid values:.
<li>enable-time: effective time;</li>.
<Li> expire-time: expiration time.</li>use default value enable-time if not specified.
     * @param Order Specifies the sorting field. valid values:.
<li>enable-time: effective time;</li>.
<Li> expire-time: expiration time.</li>use default value enable-time if not specified.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting order. valid values:.
<Li>`Asc`: sort in ascending order</li>.
<Li>`Desc`: from the largest to smallest.</li>default value: `desc`. 
     * @return Direction Sorting order. valid values:.
<Li>`Asc`: sort in ascending order</li>.
<Li>`Desc`: from the largest to smallest.</li>default value: `desc`.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Sorting order. valid values:.
<Li>`Asc`: sort in ascending order</li>.
<Li>`Desc`: from the largest to smallest.</li>default value: `desc`.
     * @param Direction Sorting order. valid values:.
<Li>`Asc`: sort in ascending order</li>.
<Li>`Desc`: from the largest to smallest.</li>default value: `desc`.
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

