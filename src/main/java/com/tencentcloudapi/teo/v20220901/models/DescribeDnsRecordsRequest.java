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

public class DescribeDnsRecordsRequest extends AbstractModel {

    /**
    * Zone id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Offset of paginated query. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number limit of paginated query. default value: 20. maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions. up to 20 values for each filter. detailed filter conditions are as follows: <li>id: filter by dns record id, supports fuzzy search;</li><li>name: filter by dns record name, supports fuzzy search;</li><li>content: filter by dns record content, supports fuzzy search;</li><li>type: filter by dns record type, does not support fuzzy search. valid values:<br>   a: points the domain name to an external ipv4 address, such as 8.8.8.8;<br>   aaaa: points the domain name to an external ipv6 address;<br>   cname: points the domain name to another domain name, which then resolves to the final ip address;<br>   txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);<br>   ns: if you need to delegate the subdomain to another dns service provider, you need to add an ns record. root domain cannot add ns records;<br>   caa: specifies the ca that can issue certificates for this site;<br>   srv: identifies a server using a specific service, commonly used in microsoft's directory management;<br>   mx: specifies the recipient's mail server.</li><li>ttl: filter by resolution effective time, does not support fuzzy search.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * Sorting basis. values include: <li>`content`: dns record content</li><li>`created-on`: dns record creation time</li><li>`name`: dns record name</li><li>`ttl`: cache time</li><li>`type`: dns record type</li> default sorting is by the combination of `type`, `name`.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * List sort method. values: <li>`asc`: ascending order</li><li>`desc`: sort in descending order</li> default value: `asc`.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Match method. values: <li>`all`: return records that match all query conditions</li><li>`any`: return records that match any query condition</li> default value: `all`.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
     * Get Zone id. 
     * @return ZoneId Zone id.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id.
     * @param ZoneId Zone id.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Offset of paginated query. default value: 0. 
     * @return Offset Offset of paginated query. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of paginated query. default value: 0.
     * @param Offset Offset of paginated query. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number limit of paginated query. default value: 20. maximum value: 1000. 
     * @return Limit Number limit of paginated query. default value: 20. maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. default value: 20. maximum value: 1000.
     * @param Limit Number limit of paginated query. default value: 20. maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions. up to 20 values for each filter. detailed filter conditions are as follows: <li>id: filter by dns record id, supports fuzzy search;</li><li>name: filter by dns record name, supports fuzzy search;</li><li>content: filter by dns record content, supports fuzzy search;</li><li>type: filter by dns record type, does not support fuzzy search. valid values:<br>   a: points the domain name to an external ipv4 address, such as 8.8.8.8;<br>   aaaa: points the domain name to an external ipv6 address;<br>   cname: points the domain name to another domain name, which then resolves to the final ip address;<br>   txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);<br>   ns: if you need to delegate the subdomain to another dns service provider, you need to add an ns record. root domain cannot add ns records;<br>   caa: specifies the ca that can issue certificates for this site;<br>   srv: identifies a server using a specific service, commonly used in microsoft's directory management;<br>   mx: specifies the recipient's mail server.</li><li>ttl: filter by resolution effective time, does not support fuzzy search.</li>. 
     * @return Filters Filter conditions. up to 20 values for each filter. detailed filter conditions are as follows: <li>id: filter by dns record id, supports fuzzy search;</li><li>name: filter by dns record name, supports fuzzy search;</li><li>content: filter by dns record content, supports fuzzy search;</li><li>type: filter by dns record type, does not support fuzzy search. valid values:<br>   a: points the domain name to an external ipv4 address, such as 8.8.8.8;<br>   aaaa: points the domain name to an external ipv6 address;<br>   cname: points the domain name to another domain name, which then resolves to the final ip address;<br>   txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);<br>   ns: if you need to delegate the subdomain to another dns service provider, you need to add an ns record. root domain cannot add ns records;<br>   caa: specifies the ca that can issue certificates for this site;<br>   srv: identifies a server using a specific service, commonly used in microsoft's directory management;<br>   mx: specifies the recipient's mail server.</li><li>ttl: filter by resolution effective time, does not support fuzzy search.</li>.
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. up to 20 values for each filter. detailed filter conditions are as follows: <li>id: filter by dns record id, supports fuzzy search;</li><li>name: filter by dns record name, supports fuzzy search;</li><li>content: filter by dns record content, supports fuzzy search;</li><li>type: filter by dns record type, does not support fuzzy search. valid values:<br>   a: points the domain name to an external ipv4 address, such as 8.8.8.8;<br>   aaaa: points the domain name to an external ipv6 address;<br>   cname: points the domain name to another domain name, which then resolves to the final ip address;<br>   txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);<br>   ns: if you need to delegate the subdomain to another dns service provider, you need to add an ns record. root domain cannot add ns records;<br>   caa: specifies the ca that can issue certificates for this site;<br>   srv: identifies a server using a specific service, commonly used in microsoft's directory management;<br>   mx: specifies the recipient's mail server.</li><li>ttl: filter by resolution effective time, does not support fuzzy search.</li>.
     * @param Filters Filter conditions. up to 20 values for each filter. detailed filter conditions are as follows: <li>id: filter by dns record id, supports fuzzy search;</li><li>name: filter by dns record name, supports fuzzy search;</li><li>content: filter by dns record content, supports fuzzy search;</li><li>type: filter by dns record type, does not support fuzzy search. valid values:<br>   a: points the domain name to an external ipv4 address, such as 8.8.8.8;<br>   aaaa: points the domain name to an external ipv6 address;<br>   cname: points the domain name to another domain name, which then resolves to the final ip address;<br>   txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);<br>   ns: if you need to delegate the subdomain to another dns service provider, you need to add an ns record. root domain cannot add ns records;<br>   caa: specifies the ca that can issue certificates for this site;<br>   srv: identifies a server using a specific service, commonly used in microsoft's directory management;<br>   mx: specifies the recipient's mail server.</li><li>ttl: filter by resolution effective time, does not support fuzzy search.</li>.
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting basis. values include: <li>`content`: dns record content</li><li>`created-on`: dns record creation time</li><li>`name`: dns record name</li><li>`ttl`: cache time</li><li>`type`: dns record type</li> default sorting is by the combination of `type`, `name`. 
     * @return SortBy Sorting basis. values include: <li>`content`: dns record content</li><li>`created-on`: dns record creation time</li><li>`name`: dns record name</li><li>`ttl`: cache time</li><li>`type`: dns record type</li> default sorting is by the combination of `type`, `name`.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting basis. values include: <li>`content`: dns record content</li><li>`created-on`: dns record creation time</li><li>`name`: dns record name</li><li>`ttl`: cache time</li><li>`type`: dns record type</li> default sorting is by the combination of `type`, `name`.
     * @param SortBy Sorting basis. values include: <li>`content`: dns record content</li><li>`created-on`: dns record creation time</li><li>`name`: dns record name</li><li>`ttl`: cache time</li><li>`type`: dns record type</li> default sorting is by the combination of `type`, `name`.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get List sort method. values: <li>`asc`: ascending order</li><li>`desc`: sort in descending order</li> default value: `asc`. 
     * @return SortOrder List sort method. values: <li>`asc`: ascending order</li><li>`desc`: sort in descending order</li> default value: `asc`.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set List sort method. values: <li>`asc`: ascending order</li><li>`desc`: sort in descending order</li> default value: `asc`.
     * @param SortOrder List sort method. values: <li>`asc`: ascending order</li><li>`desc`: sort in descending order</li> default value: `asc`.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Match method. values: <li>`all`: return records that match all query conditions</li><li>`any`: return records that match any query condition</li> default value: `all`. 
     * @return Match Match method. values: <li>`all`: return records that match all query conditions</li><li>`any`: return records that match any query condition</li> default value: `all`.
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set Match method. values: <li>`all`: return records that match all query conditions</li><li>`any`: return records that match any query condition</li> default value: `all`.
     * @param Match Match method. values: <li>`all`: return records that match all query conditions</li><li>`any`: return records that match any query condition</li> default value: `all`.
     */
    public void setMatch(String Match) {
        this.Match = Match;
    }

    public DescribeDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnsRecordsRequest(DescribeDnsRecordsRequest source) {
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
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
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
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Match", this.Match);

    }
}

