/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * ID of the site related with the acceleration domain name.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Offset for paginated queries. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Default value: 20. Maximum value: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions. The maximum value of Filters.Values is 20. If it is not specified, all domains related with the specific zone-id are returned.
<li>domain-name: Filtering based on the acceleration domain name</li>
<li>origin-type: Filtering based on the type of the origin server</li>
<li>origin: Filtering based on the primary origin server address</li>
<li>backup-origin: Filtering based on the secondary origin server address</li>
<li>domain-cname: Filtering based on the CNAME</li>
<li>share-cname: Filtering based on the shared CNAME</li>
<li>vodeo-sub-app-id: Filtering based on [vodeo sub-application ID]</li>
<li>vodeo-distribution-range: Filtering based on [vodeo distribution range]</li>
<li>vodeo-bucket-id: Filtering based on [vodeo storage bucket ID];</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * Sort the returned results according to this field. Values include:
<li>`created_on`: Creation time of the acceleration domain name</li>
<li>`domain-name`: (Default) Acceleration domain name.</li> 
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort direction. If the field value is number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li> Default value: `asc`.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * The match mode. Values:
<li>`all`: Return all matches.</li>
<li>`any`: Return any match.</li>Default value: `all`.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
     * Get ID of the site related with the acceleration domain name. 
     * @return ZoneId ID of the site related with the acceleration domain name.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site related with the acceleration domain name.
     * @param ZoneId ID of the site related with the acceleration domain name.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Offset for paginated queries. Default value: 0. 
     * @return Offset Offset for paginated queries. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: 0.
     * @param Offset Offset for paginated queries. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Default value: 20. Maximum value: 200. 
     * @return Limit Limit on paginated queries. Default value: 20. Maximum value: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: 20. Maximum value: 200.
     * @param Limit Limit on paginated queries. Default value: 20. Maximum value: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions. The maximum value of Filters.Values is 20. If it is not specified, all domains related with the specific zone-id are returned.
<li>domain-name: Filtering based on the acceleration domain name</li>
<li>origin-type: Filtering based on the type of the origin server</li>
<li>origin: Filtering based on the primary origin server address</li>
<li>backup-origin: Filtering based on the secondary origin server address</li>
<li>domain-cname: Filtering based on the CNAME</li>
<li>share-cname: Filtering based on the shared CNAME</li>
<li>vodeo-sub-app-id: Filtering based on [vodeo sub-application ID]</li>
<li>vodeo-distribution-range: Filtering based on [vodeo distribution range]</li>
<li>vodeo-bucket-id: Filtering based on [vodeo storage bucket ID];</li> 
     * @return Filters Filter conditions. The maximum value of Filters.Values is 20. If it is not specified, all domains related with the specific zone-id are returned.
<li>domain-name: Filtering based on the acceleration domain name</li>
<li>origin-type: Filtering based on the type of the origin server</li>
<li>origin: Filtering based on the primary origin server address</li>
<li>backup-origin: Filtering based on the secondary origin server address</li>
<li>domain-cname: Filtering based on the CNAME</li>
<li>share-cname: Filtering based on the shared CNAME</li>
<li>vodeo-sub-app-id: Filtering based on [vodeo sub-application ID]</li>
<li>vodeo-distribution-range: Filtering based on [vodeo distribution range]</li>
<li>vodeo-bucket-id: Filtering based on [vodeo storage bucket ID];</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. The maximum value of Filters.Values is 20. If it is not specified, all domains related with the specific zone-id are returned.
<li>domain-name: Filtering based on the acceleration domain name</li>
<li>origin-type: Filtering based on the type of the origin server</li>
<li>origin: Filtering based on the primary origin server address</li>
<li>backup-origin: Filtering based on the secondary origin server address</li>
<li>domain-cname: Filtering based on the CNAME</li>
<li>share-cname: Filtering based on the shared CNAME</li>
<li>vodeo-sub-app-id: Filtering based on [vodeo sub-application ID]</li>
<li>vodeo-distribution-range: Filtering based on [vodeo distribution range]</li>
<li>vodeo-bucket-id: Filtering based on [vodeo storage bucket ID];</li>
     * @param Filters Filter conditions. The maximum value of Filters.Values is 20. If it is not specified, all domains related with the specific zone-id are returned.
<li>domain-name: Filtering based on the acceleration domain name</li>
<li>origin-type: Filtering based on the type of the origin server</li>
<li>origin: Filtering based on the primary origin server address</li>
<li>backup-origin: Filtering based on the secondary origin server address</li>
<li>domain-cname: Filtering based on the CNAME</li>
<li>share-cname: Filtering based on the shared CNAME</li>
<li>vodeo-sub-app-id: Filtering based on [vodeo sub-application ID]</li>
<li>vodeo-distribution-range: Filtering based on [vodeo distribution range]</li>
<li>vodeo-bucket-id: Filtering based on [vodeo storage bucket ID];</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort the returned results according to this field. Values include:
<li>`created_on`: Creation time of the acceleration domain name</li>
<li>`domain-name`: (Default) Acceleration domain name.</li>  
     * @return Order Sort the returned results according to this field. Values include:
<li>`created_on`: Creation time of the acceleration domain name</li>
<li>`domain-name`: (Default) Acceleration domain name.</li> 
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort the returned results according to this field. Values include:
<li>`created_on`: Creation time of the acceleration domain name</li>
<li>`domain-name`: (Default) Acceleration domain name.</li> 
     * @param Order Sort the returned results according to this field. Values include:
<li>`created_on`: Creation time of the acceleration domain name</li>
<li>`domain-name`: (Default) Acceleration domain name.</li> 
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort direction. If the field value is number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li> Default value: `asc`. 
     * @return Direction Sort direction. If the field value is number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li> Default value: `asc`.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Sort direction. If the field value is number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li> Default value: `asc`.
     * @param Direction Sort direction. If the field value is number, sort by the numeric value. If the field value is text, sort by the ascill code. Values include:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li> Default value: `asc`.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get The match mode. Values:
<li>`all`: Return all matches.</li>
<li>`any`: Return any match.</li>Default value: `all`. 
     * @return Match The match mode. Values:
<li>`all`: Return all matches.</li>
<li>`any`: Return any match.</li>Default value: `all`.
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set The match mode. Values:
<li>`all`: Return all matches.</li>
<li>`any`: Return any match.</li>Default value: `all`.
     * @param Match The match mode. Values:
<li>`all`: Return all matches.</li>
<li>`any`: Return any match.</li>Default value: `all`.
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

