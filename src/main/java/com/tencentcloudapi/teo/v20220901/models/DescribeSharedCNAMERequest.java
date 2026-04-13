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

public class DescribeSharedCNAMERequest extends AbstractModel {

    /**
    * Shared CNAME associated site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>shared-cname<br>   Filter by [<strong>shared CNAME</strong>].<br>   Type: String<br>   Required: No</li>
<li>type<br>   Filter by [<strong>shared CNAME type</strong>].<br>   type: String<br>   Required: No</li>
<li>Description<br>   Filter by [<strong>description</strong>].<br>   Type: String<br>   Required: No</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * List sort method. Valid values:
<li>asc: ascending order;</li>
<li>desc: Sort in descending order.</li>The default value is `asc`.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Match mode. Valid values:
<li>all: Returns the shared CNAME that matches all query conditions.</li>
<li>any: Returns the shared CNAME that matches any query condition.</li> Default value is all.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
    * Sorting basis. Valid values:
<li>create-time: Creation time;</li>
<li>shared-cname: Shared CNAME.</li> Default sorting order is based on the shared-cname attribute.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number limit of paginated query. Default value: 20. Upper limit: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Shared CNAME associated site ID. 
     * @return ZoneId Shared CNAME associated site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Shared CNAME associated site ID.
     * @param ZoneId Shared CNAME associated site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>shared-cname<br>   Filter by [<strong>shared CNAME</strong>].<br>   Type: String<br>   Required: No</li>
<li>type<br>   Filter by [<strong>shared CNAME type</strong>].<br>   type: String<br>   Required: No</li>
<li>Description<br>   Filter by [<strong>description</strong>].<br>   Type: String<br>   Required: No</li> 
     * @return Filters Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>shared-cname<br>   Filter by [<strong>shared CNAME</strong>].<br>   Type: String<br>   Required: No</li>
<li>type<br>   Filter by [<strong>shared CNAME type</strong>].<br>   type: String<br>   Required: No</li>
<li>Description<br>   Filter by [<strong>description</strong>].<br>   Type: String<br>   Required: No</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>shared-cname<br>   Filter by [<strong>shared CNAME</strong>].<br>   Type: String<br>   Required: No</li>
<li>type<br>   Filter by [<strong>shared CNAME type</strong>].<br>   type: String<br>   Required: No</li>
<li>Description<br>   Filter by [<strong>description</strong>].<br>   Type: String<br>   Required: No</li>
     * @param Filters Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>shared-cname<br>   Filter by [<strong>shared CNAME</strong>].<br>   Type: String<br>   Required: No</li>
<li>type<br>   Filter by [<strong>shared CNAME type</strong>].<br>   type: String<br>   Required: No</li>
<li>Description<br>   Filter by [<strong>description</strong>].<br>   Type: String<br>   Required: No</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get List sort method. Valid values:
<li>asc: ascending order;</li>
<li>desc: Sort in descending order.</li>The default value is `asc`. 
     * @return Direction List sort method. Valid values:
<li>asc: ascending order;</li>
<li>desc: Sort in descending order.</li>The default value is `asc`.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set List sort method. Valid values:
<li>asc: ascending order;</li>
<li>desc: Sort in descending order.</li>The default value is `asc`.
     * @param Direction List sort method. Valid values:
<li>asc: ascending order;</li>
<li>desc: Sort in descending order.</li>The default value is `asc`.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Match mode. Valid values:
<li>all: Returns the shared CNAME that matches all query conditions.</li>
<li>any: Returns the shared CNAME that matches any query condition.</li> Default value is all. 
     * @return Match Match mode. Valid values:
<li>all: Returns the shared CNAME that matches all query conditions.</li>
<li>any: Returns the shared CNAME that matches any query condition.</li> Default value is all.
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set Match mode. Valid values:
<li>all: Returns the shared CNAME that matches all query conditions.</li>
<li>any: Returns the shared CNAME that matches any query condition.</li> Default value is all.
     * @param Match Match mode. Valid values:
<li>all: Returns the shared CNAME that matches all query conditions.</li>
<li>any: Returns the shared CNAME that matches any query condition.</li> Default value is all.
     */
    public void setMatch(String Match) {
        this.Match = Match;
    }

    /**
     * Get Sorting basis. Valid values:
<li>create-time: Creation time;</li>
<li>shared-cname: Shared CNAME.</li> Default sorting order is based on the shared-cname attribute. 
     * @return Order Sorting basis. Valid values:
<li>create-time: Creation time;</li>
<li>shared-cname: Shared CNAME.</li> Default sorting order is based on the shared-cname attribute.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting basis. Valid values:
<li>create-time: Creation time;</li>
<li>shared-cname: Shared CNAME.</li> Default sorting order is based on the shared-cname attribute.
     * @param Order Sorting basis. Valid values:
<li>create-time: Creation time;</li>
<li>shared-cname: Shared CNAME.</li> Default sorting order is based on the shared-cname attribute.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Offset of paginated query. Default value: 0. 
     * @return Offset Offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of paginated query. Default value: 0.
     * @param Offset Offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number limit of paginated query. Default value: 20. Upper limit: 200. 
     * @return Limit Number limit of paginated query. Default value: 20. Upper limit: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Upper limit: 200.
     * @param Limit Number limit of paginated query. Default value: 20. Upper limit: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSharedCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSharedCNAMERequest(DescribeSharedCNAMERequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Match != null) {
            this.Match = new String(source.Match);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Match", this.Match);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

