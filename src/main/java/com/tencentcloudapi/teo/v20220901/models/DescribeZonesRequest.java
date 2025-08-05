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

public class DescribeZonesRequest extends AbstractModel {

    /**
    * The page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. the maximum value of Filters.Values is 20. if this parameter is left empty, all site information authorized under the current appid will be returned. detailed filter criteria are as follows:.
<li>zone-name: filter by site name;</li> <li>zone-id: filter by site id. the site id is in the format of zone-2noz78a8ev6k;</li> <li>status: filter by site status;</li> <li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li> <li>alias-zone-name: filter by identical site identifier.</li> when performing a fuzzy query, the fields that support filtering are named zone-name or alias-zone-name.
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * Sort the returned results according to this field. Values include:
<li>`type`: Connection mode</li>
<li>`area`: Acceleration region</li>
<li>`create-time`: Creation time</li>
<li>`zone-name`: Site name</li>
<li>`use-time`: Last used time</li>
<li>`active-status` Effective status</li> Default value: `create-time`
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort direction. If the field value is a number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: From the smallest to largest</li>
<li>`desc`: From the largest to smallest.</li>Default value: `desc`
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get The page offset. Default value: 0 
     * @return Offset The page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The page offset. Default value: 0
     * @param Offset The page offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Default value: 20. Maximum value: 100. 
     * @return Limit Limit on paginated queries. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: 20. Maximum value: 100.
     * @param Limit Limit on paginated queries. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. the maximum value of Filters.Values is 20. if this parameter is left empty, all site information authorized under the current appid will be returned. detailed filter criteria are as follows:.
<li>zone-name: filter by site name;</li> <li>zone-id: filter by site id. the site id is in the format of zone-2noz78a8ev6k;</li> <li>status: filter by site status;</li> <li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li> <li>alias-zone-name: filter by identical site identifier.</li> when performing a fuzzy query, the fields that support filtering are named zone-name or alias-zone-name. 
     * @return Filters Filter criteria. the maximum value of Filters.Values is 20. if this parameter is left empty, all site information authorized under the current appid will be returned. detailed filter criteria are as follows:.
<li>zone-name: filter by site name;</li> <li>zone-id: filter by site id. the site id is in the format of zone-2noz78a8ev6k;</li> <li>status: filter by site status;</li> <li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li> <li>alias-zone-name: filter by identical site identifier.</li> when performing a fuzzy query, the fields that support filtering are named zone-name or alias-zone-name.
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. the maximum value of Filters.Values is 20. if this parameter is left empty, all site information authorized under the current appid will be returned. detailed filter criteria are as follows:.
<li>zone-name: filter by site name;</li> <li>zone-id: filter by site id. the site id is in the format of zone-2noz78a8ev6k;</li> <li>status: filter by site status;</li> <li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li> <li>alias-zone-name: filter by identical site identifier.</li> when performing a fuzzy query, the fields that support filtering are named zone-name or alias-zone-name.
     * @param Filters Filter criteria. the maximum value of Filters.Values is 20. if this parameter is left empty, all site information authorized under the current appid will be returned. detailed filter criteria are as follows:.
<li>zone-name: filter by site name;</li> <li>zone-id: filter by site id. the site id is in the format of zone-2noz78a8ev6k;</li> <li>status: filter by site status;</li> <li>tag-key: filter by tag key;</li> <li>tag-value: filter by tag value;</li> <li>alias-zone-name: filter by identical site identifier.</li> when performing a fuzzy query, the fields that support filtering are named zone-name or alias-zone-name.
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort the returned results according to this field. Values include:
<li>`type`: Connection mode</li>
<li>`area`: Acceleration region</li>
<li>`create-time`: Creation time</li>
<li>`zone-name`: Site name</li>
<li>`use-time`: Last used time</li>
<li>`active-status` Effective status</li> Default value: `create-time` 
     * @return Order Sort the returned results according to this field. Values include:
<li>`type`: Connection mode</li>
<li>`area`: Acceleration region</li>
<li>`create-time`: Creation time</li>
<li>`zone-name`: Site name</li>
<li>`use-time`: Last used time</li>
<li>`active-status` Effective status</li> Default value: `create-time`
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort the returned results according to this field. Values include:
<li>`type`: Connection mode</li>
<li>`area`: Acceleration region</li>
<li>`create-time`: Creation time</li>
<li>`zone-name`: Site name</li>
<li>`use-time`: Last used time</li>
<li>`active-status` Effective status</li> Default value: `create-time`
     * @param Order Sort the returned results according to this field. Values include:
<li>`type`: Connection mode</li>
<li>`area`: Acceleration region</li>
<li>`create-time`: Creation time</li>
<li>`zone-name`: Site name</li>
<li>`use-time`: Last used time</li>
<li>`active-status` Effective status</li> Default value: `create-time`
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort direction. If the field value is a number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: From the smallest to largest</li>
<li>`desc`: From the largest to smallest.</li>Default value: `desc` 
     * @return Direction Sort direction. If the field value is a number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: From the smallest to largest</li>
<li>`desc`: From the largest to smallest.</li>Default value: `desc`
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Sort direction. If the field value is a number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: From the smallest to largest</li>
<li>`desc`: From the largest to smallest.</li>Default value: `desc`
     * @param Direction Sort direction. If the field value is a number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: From the smallest to largest</li>
<li>`desc`: From the largest to smallest.</li>Default value: `desc`
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

