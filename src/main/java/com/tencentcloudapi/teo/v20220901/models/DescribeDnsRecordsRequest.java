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

public class DescribeDnsRecordsRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number limit of paginated query. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>id: Filter by DNS record ID. Fuzzy query is supported.</li><li>name: Filter by DNS record name. Fuzzy query is supported.</li><li>content: Filter by DNS record content. Fuzzy query is supported.</li><li>type: Filter by DNS record type. Fuzzy query is not supported. Options:<br>        A: Point the domain to an external IPv4 address, such as 8.8.8.8.<br>        AAAA: Point the domain to an external IPv6 address.<br>        CNAME: Point the domain to another domain, which then resolves to the final IP address.<br>        TXT: Identify and describe the domain. Commonly used for domain verification and SPF records (anti-spam).<br>        NS: If you need to delegate a subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added for root domains.<br>        CAA: Specify the CA that can issue certificates for this site.<br>        SRV: Identify that a server uses a service. Commonly used for directory management in Microsoft systems.<br>        MX: Specify the recipient mail server.</li><li>ttl: Filter by resolution time. Fuzzy query is not supported.</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * Sorting basis. Valid values: <li>content: DNS record content;</li><li>created-on: DNS record creation time;</li><li>name: DNS record name;</li><li>ttl: cache time;</li><li>type: DNS record type.</li>Default sorting order: by the combination of type and name attributes.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * List sort method. Valid values: <li>asc: ascending sort;</li><li>desc: descending sort.</li> Default value: asc.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Match mode. Valid values: <li>all: return records that match all query conditions;</li><li>any: return records that match any query condition.</li> Default value: all.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get Number limit of paginated query. Default value: 20. Maximum value: 1000. 
     * @return Limit Number limit of paginated query. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Maximum value: 1000.
     * @param Limit Number limit of paginated query. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>id: Filter by DNS record ID. Fuzzy query is supported.</li><li>name: Filter by DNS record name. Fuzzy query is supported.</li><li>content: Filter by DNS record content. Fuzzy query is supported.</li><li>type: Filter by DNS record type. Fuzzy query is not supported. Options:<br>        A: Point the domain to an external IPv4 address, such as 8.8.8.8.<br>        AAAA: Point the domain to an external IPv6 address.<br>        CNAME: Point the domain to another domain, which then resolves to the final IP address.<br>        TXT: Identify and describe the domain. Commonly used for domain verification and SPF records (anti-spam).<br>        NS: If you need to delegate a subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added for root domains.<br>        CAA: Specify the CA that can issue certificates for this site.<br>        SRV: Identify that a server uses a service. Commonly used for directory management in Microsoft systems.<br>        MX: Specify the recipient mail server.</li><li>ttl: Filter by resolution time. Fuzzy query is not supported.</li> 
     * @return Filters Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>id: Filter by DNS record ID. Fuzzy query is supported.</li><li>name: Filter by DNS record name. Fuzzy query is supported.</li><li>content: Filter by DNS record content. Fuzzy query is supported.</li><li>type: Filter by DNS record type. Fuzzy query is not supported. Options:<br>        A: Point the domain to an external IPv4 address, such as 8.8.8.8.<br>        AAAA: Point the domain to an external IPv6 address.<br>        CNAME: Point the domain to another domain, which then resolves to the final IP address.<br>        TXT: Identify and describe the domain. Commonly used for domain verification and SPF records (anti-spam).<br>        NS: If you need to delegate a subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added for root domains.<br>        CAA: Specify the CA that can issue certificates for this site.<br>        SRV: Identify that a server uses a service. Commonly used for directory management in Microsoft systems.<br>        MX: Specify the recipient mail server.</li><li>ttl: Filter by resolution time. Fuzzy query is not supported.</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>id: Filter by DNS record ID. Fuzzy query is supported.</li><li>name: Filter by DNS record name. Fuzzy query is supported.</li><li>content: Filter by DNS record content. Fuzzy query is supported.</li><li>type: Filter by DNS record type. Fuzzy query is not supported. Options:<br>        A: Point the domain to an external IPv4 address, such as 8.8.8.8.<br>        AAAA: Point the domain to an external IPv6 address.<br>        CNAME: Point the domain to another domain, which then resolves to the final IP address.<br>        TXT: Identify and describe the domain. Commonly used for domain verification and SPF records (anti-spam).<br>        NS: If you need to delegate a subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added for root domains.<br>        CAA: Specify the CA that can issue certificates for this site.<br>        SRV: Identify that a server uses a service. Commonly used for directory management in Microsoft systems.<br>        MX: Specify the recipient mail server.</li><li>ttl: Filter by resolution time. Fuzzy query is not supported.</li>
     * @param Filters Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>id: Filter by DNS record ID. Fuzzy query is supported.</li><li>name: Filter by DNS record name. Fuzzy query is supported.</li><li>content: Filter by DNS record content. Fuzzy query is supported.</li><li>type: Filter by DNS record type. Fuzzy query is not supported. Options:<br>        A: Point the domain to an external IPv4 address, such as 8.8.8.8.<br>        AAAA: Point the domain to an external IPv6 address.<br>        CNAME: Point the domain to another domain, which then resolves to the final IP address.<br>        TXT: Identify and describe the domain. Commonly used for domain verification and SPF records (anti-spam).<br>        NS: If you need to delegate a subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added for root domains.<br>        CAA: Specify the CA that can issue certificates for this site.<br>        SRV: Identify that a server uses a service. Commonly used for directory management in Microsoft systems.<br>        MX: Specify the recipient mail server.</li><li>ttl: Filter by resolution time. Fuzzy query is not supported.</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting basis. Valid values: <li>content: DNS record content;</li><li>created-on: DNS record creation time;</li><li>name: DNS record name;</li><li>ttl: cache time;</li><li>type: DNS record type.</li>Default sorting order: by the combination of type and name attributes. 
     * @return SortBy Sorting basis. Valid values: <li>content: DNS record content;</li><li>created-on: DNS record creation time;</li><li>name: DNS record name;</li><li>ttl: cache time;</li><li>type: DNS record type.</li>Default sorting order: by the combination of type and name attributes.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting basis. Valid values: <li>content: DNS record content;</li><li>created-on: DNS record creation time;</li><li>name: DNS record name;</li><li>ttl: cache time;</li><li>type: DNS record type.</li>Default sorting order: by the combination of type and name attributes.
     * @param SortBy Sorting basis. Valid values: <li>content: DNS record content;</li><li>created-on: DNS record creation time;</li><li>name: DNS record name;</li><li>ttl: cache time;</li><li>type: DNS record type.</li>Default sorting order: by the combination of type and name attributes.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get List sort method. Valid values: <li>asc: ascending sort;</li><li>desc: descending sort.</li> Default value: asc. 
     * @return SortOrder List sort method. Valid values: <li>asc: ascending sort;</li><li>desc: descending sort.</li> Default value: asc.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set List sort method. Valid values: <li>asc: ascending sort;</li><li>desc: descending sort.</li> Default value: asc.
     * @param SortOrder List sort method. Valid values: <li>asc: ascending sort;</li><li>desc: descending sort.</li> Default value: asc.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Match mode. Valid values: <li>all: return records that match all query conditions;</li><li>any: return records that match any query condition.</li> Default value: all. 
     * @return Match Match mode. Valid values: <li>all: return records that match all query conditions;</li><li>any: return records that match any query condition.</li> Default value: all.
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set Match mode. Valid values: <li>all: return records that match all query conditions;</li><li>any: return records that match any query condition.</li> Default value: all.
     * @param Match Match mode. Valid values: <li>all: return records that match all query conditions;</li><li>any: return records that match any query condition.</li> Default value: all.
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

