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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccelerationDomainsRequest extends AbstractModel{

    /**
    * Site ID of the accelerated domain name. If it’s not specified, all accelerated domain names under the site are returned.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filters. Each filter can have up to 20 entries. See below for details: 
<li>`domain-name`:<br>   <strong>Accelerated domain name</strong><br>   Type: String<br>Required: No 
<li>`origin-type`:<br>   <strong>Type of the origin</strong><br>   Type: String<br>   Required: No 
<li>`origin`:<br>   <strong>Primary origin</strong><br>   Type: String<br>   Required: No 
<li>`backup-origin`:<br>   <strong>Secondary origin</strong><br>   Type: String<br>   Required: No 
<li>`domain-cname`:<br>   <strong>Accelerated CNAME</strong><br>   Type: String<br>   Required: No 
<li>`share-cname`:<br>   <strong> Shared CNAME</strong><br>   Type: String<br>   Required: No
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * The sorting order. Values:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li>Default value: `asc`.
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
    * Limit on paginated queries. Default value: 20. Maximum value: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset for paginated queries. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The sorting criteria. Values:
<li>`created_on`: Creation time of the accelerated domain name.</li>
<li>`domain-name`: Acceleration domain name.</li>
</li>Default value: `domain-name`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Site ID of the accelerated domain name. If it’s not specified, all accelerated domain names under the site are returned. 
     * @return ZoneId Site ID of the accelerated domain name. If it’s not specified, all accelerated domain names under the site are returned.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID of the accelerated domain name. If it’s not specified, all accelerated domain names under the site are returned.
     * @param ZoneId Site ID of the accelerated domain name. If it’s not specified, all accelerated domain names under the site are returned.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filters. Each filter can have up to 20 entries. See below for details: 
<li>`domain-name`:<br>   <strong>Accelerated domain name</strong><br>   Type: String<br>Required: No 
<li>`origin-type`:<br>   <strong>Type of the origin</strong><br>   Type: String<br>   Required: No 
<li>`origin`:<br>   <strong>Primary origin</strong><br>   Type: String<br>   Required: No 
<li>`backup-origin`:<br>   <strong>Secondary origin</strong><br>   Type: String<br>   Required: No 
<li>`domain-cname`:<br>   <strong>Accelerated CNAME</strong><br>   Type: String<br>   Required: No 
<li>`share-cname`:<br>   <strong> Shared CNAME</strong><br>   Type: String<br>   Required: No 
     * @return Filters Filters. Each filter can have up to 20 entries. See below for details: 
<li>`domain-name`:<br>   <strong>Accelerated domain name</strong><br>   Type: String<br>Required: No 
<li>`origin-type`:<br>   <strong>Type of the origin</strong><br>   Type: String<br>   Required: No 
<li>`origin`:<br>   <strong>Primary origin</strong><br>   Type: String<br>   Required: No 
<li>`backup-origin`:<br>   <strong>Secondary origin</strong><br>   Type: String<br>   Required: No 
<li>`domain-cname`:<br>   <strong>Accelerated CNAME</strong><br>   Type: String<br>   Required: No 
<li>`share-cname`:<br>   <strong> Shared CNAME</strong><br>   Type: String<br>   Required: No
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters. Each filter can have up to 20 entries. See below for details: 
<li>`domain-name`:<br>   <strong>Accelerated domain name</strong><br>   Type: String<br>Required: No 
<li>`origin-type`:<br>   <strong>Type of the origin</strong><br>   Type: String<br>   Required: No 
<li>`origin`:<br>   <strong>Primary origin</strong><br>   Type: String<br>   Required: No 
<li>`backup-origin`:<br>   <strong>Secondary origin</strong><br>   Type: String<br>   Required: No 
<li>`domain-cname`:<br>   <strong>Accelerated CNAME</strong><br>   Type: String<br>   Required: No 
<li>`share-cname`:<br>   <strong> Shared CNAME</strong><br>   Type: String<br>   Required: No
     * @param Filters Filters. Each filter can have up to 20 entries. See below for details: 
<li>`domain-name`:<br>   <strong>Accelerated domain name</strong><br>   Type: String<br>Required: No 
<li>`origin-type`:<br>   <strong>Type of the origin</strong><br>   Type: String<br>   Required: No 
<li>`origin`:<br>   <strong>Primary origin</strong><br>   Type: String<br>   Required: No 
<li>`backup-origin`:<br>   <strong>Secondary origin</strong><br>   Type: String<br>   Required: No 
<li>`domain-cname`:<br>   <strong>Accelerated CNAME</strong><br>   Type: String<br>   Required: No 
<li>`share-cname`:<br>   <strong> Shared CNAME</strong><br>   Type: String<br>   Required: No
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The sorting order. Values:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li>Default value: `asc`. 
     * @return Direction The sorting order. Values:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li>Default value: `asc`.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set The sorting order. Values:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li>Default value: `asc`.
     * @param Direction The sorting order. Values:
<li>`asc`: Ascending order.</li>
<li>`desc`: Descending order.</li>Default value: `asc`.
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
     * Get The sorting criteria. Values:
<li>`created_on`: Creation time of the accelerated domain name.</li>
<li>`domain-name`: Acceleration domain name.</li>
</li>Default value: `domain-name`. 
     * @return Order The sorting criteria. Values:
<li>`created_on`: Creation time of the accelerated domain name.</li>
<li>`domain-name`: Acceleration domain name.</li>
</li>Default value: `domain-name`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set The sorting criteria. Values:
<li>`created_on`: Creation time of the accelerated domain name.</li>
<li>`domain-name`: Acceleration domain name.</li>
</li>Default value: `domain-name`.
     * @param Order The sorting criteria. Values:
<li>`created_on`: Creation time of the accelerated domain name.</li>
<li>`domain-name`: Acceleration domain name.</li>
</li>Default value: `domain-name`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
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
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

