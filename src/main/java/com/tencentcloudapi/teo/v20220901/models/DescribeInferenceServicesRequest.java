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

public class DescribeInferenceServicesRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Filter criteria. Up to 20 criteria are supported, and multiple criteria are in AND relationship. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li>For fuzzy query, only filtering by the field name service-name is supported.</p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>The offset of paginated query. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Paginated query limit. Default value: 20, maximum value: 200.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Returned results can be sorted by this field. Valid values: <li>create-time: creation time.</li>If left empty, results are sorted by create-time by default.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting order. If the field value is a number, sort by numeric size; if the field value is text, sort by ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value desc if not specified.</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Filter criteria. Up to 20 criteria are supported, and multiple criteria are in AND relationship. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li>For fuzzy query, only filtering by the field name service-name is supported.</p> 
     * @return Filters <p>Filter criteria. Up to 20 criteria are supported, and multiple criteria are in AND relationship. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li>For fuzzy query, only filtering by the field name service-name is supported.</p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. Up to 20 criteria are supported, and multiple criteria are in AND relationship. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li>For fuzzy query, only filtering by the field name service-name is supported.</p>
     * @param Filters <p>Filter criteria. Up to 20 criteria are supported, and multiple criteria are in AND relationship. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li>For fuzzy query, only filtering by the field name service-name is supported.</p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>The offset of paginated query. Default value: 0.</p> 
     * @return Offset <p>The offset of paginated query. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>The offset of paginated query. Default value: 0.</p>
     * @param Offset <p>The offset of paginated query. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Paginated query limit. Default value: 20, maximum value: 200.</p> 
     * @return Limit <p>Paginated query limit. Default value: 20, maximum value: 200.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Paginated query limit. Default value: 20, maximum value: 200.</p>
     * @param Limit <p>Paginated query limit. Default value: 20, maximum value: 200.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Returned results can be sorted by this field. Valid values: <li>create-time: creation time.</li>If left empty, results are sorted by create-time by default.</p> 
     * @return Order <p>Returned results can be sorted by this field. Valid values: <li>create-time: creation time.</li>If left empty, results are sorted by create-time by default.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Returned results can be sorted by this field. Valid values: <li>create-time: creation time.</li>If left empty, results are sorted by create-time by default.</p>
     * @param Order <p>Returned results can be sorted by this field. Valid values: <li>create-time: creation time.</li>If left empty, results are sorted by create-time by default.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting order. If the field value is a number, sort by numeric size; if the field value is text, sort by ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value desc if not specified.</p> 
     * @return Direction <p>Sorting order. If the field value is a number, sort by numeric size; if the field value is text, sort by ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value desc if not specified.</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Sorting order. If the field value is a number, sort by numeric size; if the field value is text, sort by ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value desc if not specified.</p>
     * @param Direction <p>Sorting order. If the field value is a number, sort by numeric size; if the field value is text, sort by ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value desc if not specified.</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public DescribeInferenceServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceServicesRequest(DescribeInferenceServicesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
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
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

