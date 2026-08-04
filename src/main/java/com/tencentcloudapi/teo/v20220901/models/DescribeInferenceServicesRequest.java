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
    * <p>Filtering Conditions, maximum 20, multiple conditions have an AND relationship, the maximum for Filters.Values is 20. Detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li> Only the field named service-name supports filtering during a fuzzy query.</p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>Paginated query offset. Default value: 0.</p>
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
    * <p>Sort returned results based on this field. Valid values: <li>create-time: Creation time.</li>Default sorting order is by create-time if left empty.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting order. If the field value is a number, sort based on its size; if the field value is text, sort based on ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value if not specified.</p>
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
     * Get <p>Filtering Conditions, maximum 20, multiple conditions have an AND relationship, the maximum for Filters.Values is 20. Detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li> Only the field named service-name supports filtering during a fuzzy query.</p> 
     * @return Filters <p>Filtering Conditions, maximum 20, multiple conditions have an AND relationship, the maximum for Filters.Values is 20. Detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li> Only the field named service-name supports filtering during a fuzzy query.</p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filtering Conditions, maximum 20, multiple conditions have an AND relationship, the maximum for Filters.Values is 20. Detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li> Only the field named service-name supports filtering during a fuzzy query.</p>
     * @param Filters <p>Filtering Conditions, maximum 20, multiple conditions have an AND relationship, the maximum for Filters.Values is 20. Detailed filter criteria are as follows: <li>service-name: filter by service name;</li><li>service-id: filter by service ID;</li><li>status: filter by service status.</li> Only the field named service-name supports filtering during a fuzzy query.</p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Paginated query offset. Default value: 0.</p> 
     * @return Offset <p>Paginated query offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paginated query offset. Default value: 0.</p>
     * @param Offset <p>Paginated query offset. Default value: 0.</p>
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
     * Get <p>Sort returned results based on this field. Valid values: <li>create-time: Creation time.</li>Default sorting order is by create-time if left empty.</p> 
     * @return Order <p>Sort returned results based on this field. Valid values: <li>create-time: Creation time.</li>Default sorting order is by create-time if left empty.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sort returned results based on this field. Valid values: <li>create-time: Creation time.</li>Default sorting order is by create-time if left empty.</p>
     * @param Order <p>Sort returned results based on this field. Valid values: <li>create-time: Creation time.</li>Default sorting order is by create-time if left empty.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting order. If the field value is a number, sort based on its size; if the field value is text, sort based on ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value if not specified.</p> 
     * @return Direction <p>Sorting order. If the field value is a number, sort based on its size; if the field value is text, sort based on ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value if not specified.</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Sorting order. If the field value is a number, sort based on its size; if the field value is text, sort based on ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value if not specified.</p>
     * @param Direction <p>Sorting order. If the field value is a number, sort based on its size; if the field value is text, sort based on ASCII code size. Valid values: <li>asc: sort in ascending order;</li><li>desc: sort in descending order.</li>Use default value if not specified.</p>
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

