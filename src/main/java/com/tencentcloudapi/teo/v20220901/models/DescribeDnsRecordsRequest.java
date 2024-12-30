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
    * The site ID of the DNS record.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The paginated query limit. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The upper limit of Filters.Values is 20. The detailed filtering conditions are as follows: <li>id: Filter by DNS record ID, supports fuzzy query;</li><li>name: Filter by DNS record name, supports fuzzy query;</li><li>content: Filter by DNS record content, supports fuzzy query;</li><li>type: Filter by DNS record type, does not support fuzzy query. Options:<br> A: Point the domain name to an external IPv4 address, such as 8.8.8.8;<br> AAAA: Point the domain name to an external IPv6 address;<br> CNAME: Point the domain name to another domain name, which then resolves to the final IP address;<br> TXT: Identify and describe the domain name, often used for domain verification and SPF records (anti-spam);<br> NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. Root domains cannot add NS records;<br> CAA: Specify the CA that can issue certificates for this site;<br> SRV: Identify a server using a specific service, commonly used in Microsoft's directory management;<br> MX: Specify the recipient's mail server.</li><li>ttl: Filter by the time-to-live (TTL) of the record, does not support fuzzy query.</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * Sort criteria, with possible values:
<li>content: DNS record content;</li>
<li>created-on: DNS record creation time;</li>
<li>name: DNS record name;</li>
<li>ttl: Time-to-live (TTL);</li>
<li>type: DNS record type.</li>
The default sorting is based on a combination of type and name attributes.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * List sorting order, with possible values:
<li>asc: Ascending order;</li>
<li>desc: Descending order.</li>
The default value is asc.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * The match mode. Values:
<li>`all`: Return all records that match the specified filter.</li>
<li>`any`: Return any record that matches the specified filter.</li>Default value: all.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
     * Get The site ID of the DNS record. 
     * @return ZoneId The site ID of the DNS record.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID of the DNS record.
     * @param ZoneId The site ID of the DNS record.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

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
     * Get The paginated query limit. Default value: 20. Maximum value: 1000. 
     * @return Limit The paginated query limit. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The paginated query limit. Default value: 20. Maximum value: 1000.
     * @param Limit The paginated query limit. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The upper limit of Filters.Values is 20. The detailed filtering conditions are as follows: <li>id: Filter by DNS record ID, supports fuzzy query;</li><li>name: Filter by DNS record name, supports fuzzy query;</li><li>content: Filter by DNS record content, supports fuzzy query;</li><li>type: Filter by DNS record type, does not support fuzzy query. Options:<br> A: Point the domain name to an external IPv4 address, such as 8.8.8.8;<br> AAAA: Point the domain name to an external IPv6 address;<br> CNAME: Point the domain name to another domain name, which then resolves to the final IP address;<br> TXT: Identify and describe the domain name, often used for domain verification and SPF records (anti-spam);<br> NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. Root domains cannot add NS records;<br> CAA: Specify the CA that can issue certificates for this site;<br> SRV: Identify a server using a specific service, commonly used in Microsoft's directory management;<br> MX: Specify the recipient's mail server.</li><li>ttl: Filter by the time-to-live (TTL) of the record, does not support fuzzy query.</li> 
     * @return Filters The upper limit of Filters.Values is 20. The detailed filtering conditions are as follows: <li>id: Filter by DNS record ID, supports fuzzy query;</li><li>name: Filter by DNS record name, supports fuzzy query;</li><li>content: Filter by DNS record content, supports fuzzy query;</li><li>type: Filter by DNS record type, does not support fuzzy query. Options:<br> A: Point the domain name to an external IPv4 address, such as 8.8.8.8;<br> AAAA: Point the domain name to an external IPv6 address;<br> CNAME: Point the domain name to another domain name, which then resolves to the final IP address;<br> TXT: Identify and describe the domain name, often used for domain verification and SPF records (anti-spam);<br> NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. Root domains cannot add NS records;<br> CAA: Specify the CA that can issue certificates for this site;<br> SRV: Identify a server using a specific service, commonly used in Microsoft's directory management;<br> MX: Specify the recipient's mail server.</li><li>ttl: Filter by the time-to-live (TTL) of the record, does not support fuzzy query.</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The upper limit of Filters.Values is 20. The detailed filtering conditions are as follows: <li>id: Filter by DNS record ID, supports fuzzy query;</li><li>name: Filter by DNS record name, supports fuzzy query;</li><li>content: Filter by DNS record content, supports fuzzy query;</li><li>type: Filter by DNS record type, does not support fuzzy query. Options:<br> A: Point the domain name to an external IPv4 address, such as 8.8.8.8;<br> AAAA: Point the domain name to an external IPv6 address;<br> CNAME: Point the domain name to another domain name, which then resolves to the final IP address;<br> TXT: Identify and describe the domain name, often used for domain verification and SPF records (anti-spam);<br> NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. Root domains cannot add NS records;<br> CAA: Specify the CA that can issue certificates for this site;<br> SRV: Identify a server using a specific service, commonly used in Microsoft's directory management;<br> MX: Specify the recipient's mail server.</li><li>ttl: Filter by the time-to-live (TTL) of the record, does not support fuzzy query.</li>
     * @param Filters The upper limit of Filters.Values is 20. The detailed filtering conditions are as follows: <li>id: Filter by DNS record ID, supports fuzzy query;</li><li>name: Filter by DNS record name, supports fuzzy query;</li><li>content: Filter by DNS record content, supports fuzzy query;</li><li>type: Filter by DNS record type, does not support fuzzy query. Options:<br> A: Point the domain name to an external IPv4 address, such as 8.8.8.8;<br> AAAA: Point the domain name to an external IPv6 address;<br> CNAME: Point the domain name to another domain name, which then resolves to the final IP address;<br> TXT: Identify and describe the domain name, often used for domain verification and SPF records (anti-spam);<br> NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. Root domains cannot add NS records;<br> CAA: Specify the CA that can issue certificates for this site;<br> SRV: Identify a server using a specific service, commonly used in Microsoft's directory management;<br> MX: Specify the recipient's mail server.</li><li>ttl: Filter by the time-to-live (TTL) of the record, does not support fuzzy query.</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort criteria, with possible values:
<li>content: DNS record content;</li>
<li>created-on: DNS record creation time;</li>
<li>name: DNS record name;</li>
<li>ttl: Time-to-live (TTL);</li>
<li>type: DNS record type.</li>
The default sorting is based on a combination of type and name attributes. 
     * @return SortBy Sort criteria, with possible values:
<li>content: DNS record content;</li>
<li>created-on: DNS record creation time;</li>
<li>name: DNS record name;</li>
<li>ttl: Time-to-live (TTL);</li>
<li>type: DNS record type.</li>
The default sorting is based on a combination of type and name attributes.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sort criteria, with possible values:
<li>content: DNS record content;</li>
<li>created-on: DNS record creation time;</li>
<li>name: DNS record name;</li>
<li>ttl: Time-to-live (TTL);</li>
<li>type: DNS record type.</li>
The default sorting is based on a combination of type and name attributes.
     * @param SortBy Sort criteria, with possible values:
<li>content: DNS record content;</li>
<li>created-on: DNS record creation time;</li>
<li>name: DNS record name;</li>
<li>ttl: Time-to-live (TTL);</li>
<li>type: DNS record type.</li>
The default sorting is based on a combination of type and name attributes.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get List sorting order, with possible values:
<li>asc: Ascending order;</li>
<li>desc: Descending order.</li>
The default value is asc. 
     * @return SortOrder List sorting order, with possible values:
<li>asc: Ascending order;</li>
<li>desc: Descending order.</li>
The default value is asc.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set List sorting order, with possible values:
<li>asc: Ascending order;</li>
<li>desc: Descending order.</li>
The default value is asc.
     * @param SortOrder List sorting order, with possible values:
<li>asc: Ascending order;</li>
<li>desc: Descending order.</li>
The default value is asc.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get The match mode. Values:
<li>`all`: Return all records that match the specified filter.</li>
<li>`any`: Return any record that matches the specified filter.</li>Default value: all. 
     * @return Match The match mode. Values:
<li>`all`: Return all records that match the specified filter.</li>
<li>`any`: Return any record that matches the specified filter.</li>Default value: all.
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set The match mode. Values:
<li>`all`: Return all records that match the specified filter.</li>
<li>`any`: Return any record that matches the specified filter.</li>Default value: all.
     * @param Match The match mode. Values:
<li>`all`: Return all records that match the specified filter.</li>
<li>`any`: Return any record that matches the specified filter.</li>Default value: all.
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

