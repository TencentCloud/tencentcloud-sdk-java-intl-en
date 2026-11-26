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

public class DescribeAccelerationDomainsRequest extends AbstractModel {

    /**
    * <p>Zone ID of the acceleration domain name.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

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
    * <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all domain information under the current zone-id is returned. The detailed filter criteria are as follows:</p><li>domain-name: Filter by acceleration domain name;</li><li>origin-type: Filter by origin server type;</li><li>origin: Filter by primary origin server address;</li><li>backup-origin: Filter by secondary origin server address;</li><li>domain-cname: Filter by CNAME;</li><li>share-cname: Filter by shared CNAME;</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>Sort returned results by this field. Valid values:</p><li>created_on: acceleration domain name creation time;</li><li>domain-name: acceleration domain name.</li>If left empty, returned results are sorted by domain-name by default.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting order. If the field value is a number, sort by its size. If the field value is text, sort by ASCII code size. Valid values:</p><li>asc: ascending order;</li><li>desc: descending order.</li>Use default value asc if not specified.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * <p>Match mode. Valid values:</p><li>all: return acceleration domain names that match all query conditions;</li><li>any: return acceleration domain names that match any query condition.</li>If left empty, the default value is all.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
     * Get <p>Zone ID of the acceleration domain name.</p> 
     * @return ZoneId <p>Zone ID of the acceleration domain name.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone ID of the acceleration domain name.</p>
     * @param ZoneId <p>Zone ID of the acceleration domain name.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all domain information under the current zone-id is returned. The detailed filter criteria are as follows:</p><li>domain-name: Filter by acceleration domain name;</li><li>origin-type: Filter by origin server type;</li><li>origin: Filter by primary origin server address;</li><li>backup-origin: Filter by secondary origin server address;</li><li>domain-cname: Filter by CNAME;</li><li>share-cname: Filter by shared CNAME;</li> 
     * @return Filters <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all domain information under the current zone-id is returned. The detailed filter criteria are as follows:</p><li>domain-name: Filter by acceleration domain name;</li><li>origin-type: Filter by origin server type;</li><li>origin: Filter by primary origin server address;</li><li>backup-origin: Filter by secondary origin server address;</li><li>domain-cname: Filter by CNAME;</li><li>share-cname: Filter by shared CNAME;</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all domain information under the current zone-id is returned. The detailed filter criteria are as follows:</p><li>domain-name: Filter by acceleration domain name;</li><li>origin-type: Filter by origin server type;</li><li>origin: Filter by primary origin server address;</li><li>backup-origin: Filter by secondary origin server address;</li><li>domain-cname: Filter by CNAME;</li><li>share-cname: Filter by shared CNAME;</li>
     * @param Filters <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, all domain information under the current zone-id is returned. The detailed filter criteria are as follows:</p><li>domain-name: Filter by acceleration domain name;</li><li>origin-type: Filter by origin server type;</li><li>origin: Filter by primary origin server address;</li><li>backup-origin: Filter by secondary origin server address;</li><li>domain-cname: Filter by CNAME;</li><li>share-cname: Filter by shared CNAME;</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sort returned results by this field. Valid values:</p><li>created_on: acceleration domain name creation time;</li><li>domain-name: acceleration domain name.</li>If left empty, returned results are sorted by domain-name by default. 
     * @return Order <p>Sort returned results by this field. Valid values:</p><li>created_on: acceleration domain name creation time;</li><li>domain-name: acceleration domain name.</li>If left empty, returned results are sorted by domain-name by default.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sort returned results by this field. Valid values:</p><li>created_on: acceleration domain name creation time;</li><li>domain-name: acceleration domain name.</li>If left empty, returned results are sorted by domain-name by default.
     * @param Order <p>Sort returned results by this field. Valid values:</p><li>created_on: acceleration domain name creation time;</li><li>domain-name: acceleration domain name.</li>If left empty, returned results are sorted by domain-name by default.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting order. If the field value is a number, sort by its size. If the field value is text, sort by ASCII code size. Valid values:</p><li>asc: ascending order;</li><li>desc: descending order.</li>Use default value asc if not specified. 
     * @return Direction <p>Sorting order. If the field value is a number, sort by its size. If the field value is text, sort by ASCII code size. Valid values:</p><li>asc: ascending order;</li><li>desc: descending order.</li>Use default value asc if not specified.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Sorting order. If the field value is a number, sort by its size. If the field value is text, sort by ASCII code size. Valid values:</p><li>asc: ascending order;</li><li>desc: descending order.</li>Use default value asc if not specified.
     * @param Direction <p>Sorting order. If the field value is a number, sort by its size. If the field value is text, sort by ASCII code size. Valid values:</p><li>asc: ascending order;</li><li>desc: descending order.</li>Use default value asc if not specified.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>Match mode. Valid values:</p><li>all: return acceleration domain names that match all query conditions;</li><li>any: return acceleration domain names that match any query condition.</li>If left empty, the default value is all. 
     * @return Match <p>Match mode. Valid values:</p><li>all: return acceleration domain names that match all query conditions;</li><li>any: return acceleration domain names that match any query condition.</li>If left empty, the default value is all.
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set <p>Match mode. Valid values:</p><li>all: return acceleration domain names that match all query conditions;</li><li>any: return acceleration domain names that match any query condition.</li>If left empty, the default value is all.
     * @param Match <p>Match mode. Valid values:</p><li>all: return acceleration domain names that match all query conditions;</li><li>any: return acceleration domain names that match any query condition.</li>If left empty, the default value is all.
     */
    public void setMatch(String Match) {
        this.Match = Match;
    }

    public DescribeAccelerationDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccelerationDomainsRequest(DescribeAccelerationDomainsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
        if (source.Match != null) {
            this.Match = new String(source.Match);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Match", this.Match);

    }
}

