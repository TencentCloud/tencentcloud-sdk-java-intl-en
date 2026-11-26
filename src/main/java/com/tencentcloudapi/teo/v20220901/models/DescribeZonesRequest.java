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
    * The offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Paginated query limit. Default value: 20, maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all site information authorized under the current appid will be returned. The detailed filter criteria are as follows: <li>zone-name: Filter by site name.</li><li>zone-type: Filter by site type. Options:<br>        full: NS access type<br>        partial: CNAME access type<br>        partialComposite: domainless access<br>        dnsPodAccess: DNSPod managed access<br>        pages: Pages access type<br>        ai: edge reasoning access type.</li><li>zone-id: Filter by site ID in the format like zone-2noz78a8ev6k.</li><li>status: Filter by site status. Options:<br>        active: NS switched<br>        pending: NS to be switched<br>        deleted: deleted.</li><li>tag-key: Filter by tag key.</li><li>tag-value: Filter by tag value.</li><li>alias-zone-name: Filter by identical site identifier.</li>Fuzzy query supports filtering fields named zone-name or alias-zone-name.
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * Sort returned results based on this field. Valid values:
<li> type: access type;</li>
<li> area: acceleration region;</li>
<li> create-time: creation time;</li>
<li> zone-name: site name;</li>
<li> use-time: last used time;</li>
<li> active-status: effective status.</li>If left empty, the returned results are sorted by create-time by default.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting order. If the field value is a number, sort by number size. If the field value is text, sort by ASCII code size. Valid values:
<li> asc: sort in ascending order;</li>
<li> desc: in descending order.</li>Use default value desc if not specified.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

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

    /**
     * Get Paginated query limit. Default value: 20, maximum value: 100. 
     * @return Limit Paginated query limit. Default value: 20, maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paginated query limit. Default value: 20, maximum value: 100.
     * @param Limit Paginated query limit. Default value: 20, maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all site information authorized under the current appid will be returned. The detailed filter criteria are as follows: <li>zone-name: Filter by site name.</li><li>zone-type: Filter by site type. Options:<br>        full: NS access type<br>        partial: CNAME access type<br>        partialComposite: domainless access<br>        dnsPodAccess: DNSPod managed access<br>        pages: Pages access type<br>        ai: edge reasoning access type.</li><li>zone-id: Filter by site ID in the format like zone-2noz78a8ev6k.</li><li>status: Filter by site status. Options:<br>        active: NS switched<br>        pending: NS to be switched<br>        deleted: deleted.</li><li>tag-key: Filter by tag key.</li><li>tag-value: Filter by tag value.</li><li>alias-zone-name: Filter by identical site identifier.</li>Fuzzy query supports filtering fields named zone-name or alias-zone-name. 
     * @return Filters Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all site information authorized under the current appid will be returned. The detailed filter criteria are as follows: <li>zone-name: Filter by site name.</li><li>zone-type: Filter by site type. Options:<br>        full: NS access type<br>        partial: CNAME access type<br>        partialComposite: domainless access<br>        dnsPodAccess: DNSPod managed access<br>        pages: Pages access type<br>        ai: edge reasoning access type.</li><li>zone-id: Filter by site ID in the format like zone-2noz78a8ev6k.</li><li>status: Filter by site status. Options:<br>        active: NS switched<br>        pending: NS to be switched<br>        deleted: deleted.</li><li>tag-key: Filter by tag key.</li><li>tag-value: Filter by tag value.</li><li>alias-zone-name: Filter by identical site identifier.</li>Fuzzy query supports filtering fields named zone-name or alias-zone-name.
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all site information authorized under the current appid will be returned. The detailed filter criteria are as follows: <li>zone-name: Filter by site name.</li><li>zone-type: Filter by site type. Options:<br>        full: NS access type<br>        partial: CNAME access type<br>        partialComposite: domainless access<br>        dnsPodAccess: DNSPod managed access<br>        pages: Pages access type<br>        ai: edge reasoning access type.</li><li>zone-id: Filter by site ID in the format like zone-2noz78a8ev6k.</li><li>status: Filter by site status. Options:<br>        active: NS switched<br>        pending: NS to be switched<br>        deleted: deleted.</li><li>tag-key: Filter by tag key.</li><li>tag-value: Filter by tag value.</li><li>alias-zone-name: Filter by identical site identifier.</li>Fuzzy query supports filtering fields named zone-name or alias-zone-name.
     * @param Filters Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all site information authorized under the current appid will be returned. The detailed filter criteria are as follows: <li>zone-name: Filter by site name.</li><li>zone-type: Filter by site type. Options:<br>        full: NS access type<br>        partial: CNAME access type<br>        partialComposite: domainless access<br>        dnsPodAccess: DNSPod managed access<br>        pages: Pages access type<br>        ai: edge reasoning access type.</li><li>zone-id: Filter by site ID in the format like zone-2noz78a8ev6k.</li><li>status: Filter by site status. Options:<br>        active: NS switched<br>        pending: NS to be switched<br>        deleted: deleted.</li><li>tag-key: Filter by tag key.</li><li>tag-value: Filter by tag value.</li><li>alias-zone-name: Filter by identical site identifier.</li>Fuzzy query supports filtering fields named zone-name or alias-zone-name.
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort returned results based on this field. Valid values:
<li> type: access type;</li>
<li> area: acceleration region;</li>
<li> create-time: creation time;</li>
<li> zone-name: site name;</li>
<li> use-time: last used time;</li>
<li> active-status: effective status.</li>If left empty, the returned results are sorted by create-time by default. 
     * @return Order Sort returned results based on this field. Valid values:
<li> type: access type;</li>
<li> area: acceleration region;</li>
<li> create-time: creation time;</li>
<li> zone-name: site name;</li>
<li> use-time: last used time;</li>
<li> active-status: effective status.</li>If left empty, the returned results are sorted by create-time by default.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort returned results based on this field. Valid values:
<li> type: access type;</li>
<li> area: acceleration region;</li>
<li> create-time: creation time;</li>
<li> zone-name: site name;</li>
<li> use-time: last used time;</li>
<li> active-status: effective status.</li>If left empty, the returned results are sorted by create-time by default.
     * @param Order Sort returned results based on this field. Valid values:
<li> type: access type;</li>
<li> area: acceleration region;</li>
<li> create-time: creation time;</li>
<li> zone-name: site name;</li>
<li> use-time: last used time;</li>
<li> active-status: effective status.</li>If left empty, the returned results are sorted by create-time by default.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting order. If the field value is a number, sort by number size. If the field value is text, sort by ASCII code size. Valid values:
<li> asc: sort in ascending order;</li>
<li> desc: in descending order.</li>Use default value desc if not specified. 
     * @return Direction Sorting order. If the field value is a number, sort by number size. If the field value is text, sort by ASCII code size. Valid values:
<li> asc: sort in ascending order;</li>
<li> desc: in descending order.</li>Use default value desc if not specified.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Sorting order. If the field value is a number, sort by number size. If the field value is text, sort by ASCII code size. Valid values:
<li> asc: sort in ascending order;</li>
<li> desc: in descending order.</li>Use default value desc if not specified.
     * @param Direction Sorting order. If the field value is a number, sort by number size. If the field value is text, sort by ASCII code size. Valid values:
<li> asc: sort in ascending order;</li>
<li> desc: in descending order.</li>Use default value desc if not specified.
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

