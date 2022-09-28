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

public class DescribeDnsRecordsRequest extends AbstractModel{

    /**
    * The site ID of the DNS record. All sites’ DNS records will be returned if this field is not specified.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter criteria. Each filter criteria can have up to 20 entries.
<li>`record-id`:<br>   Filter by <strong>DNS record ID</strong>, such as record-1a8df68z<br>   Type: String<br>Required: No
<li>`record-name`:<br>   Filter by <strong>DNS record name</strong><br>   Type: String<br>Required: No
<li>`record-type`:<br>   Filter by <strong>DNS record type</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `A`: Point a domain name to an IPv4 address, such as 8.8.8.8.<br>   `AAAA`: Point a domain name to an IPv6 address.<br>   `CNAME`: Point a domain name to another domain name that can be resolved to an IP address.<br>   `TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).<br>   `NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.<br>   `CAA`: Specify CAs to issue certificates for sites.<br>   `SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.<br>  `MX`: Specify the mail server for receiving emails.
<li>`mode`:<br>   Filter by <strong>proxy mode</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `dns_only`: Only DNS<br>   `proxied`: Proxied
<li>`ttl`:<br>   Filter by <strong>TTL</strong><br>   Type: String<br>Required: No
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * The sorting order. Values:
<li>`ASC`: Ascending order</li>
<li>`desc`: Descending order</li> Default value: asc
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * The match mode. Values:
<li>`all`: Return all records that match the specified filter.</li>
<li>`any`: Return any record that matches the specified filter.</li>Default value: all.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
    * The paginated query limit. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The sorting criteria. Values:
<li>`content`: DNS record content.</li>
<li>`created_on`: Creation time of the DNS record.</li>
<li>`mode`: Proxy mode.</li>
<li>`record-name`: DNS record name.</li>
<li>`ttl`: DNS TTL.</li>
<li>`record-type`: DNS record type.</li>If this field is not specified, the DNS records are sorted based on `record-type` and `recrod-name`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get The site ID of the DNS record. All sites’ DNS records will be returned if this field is not specified. 
     * @return ZoneId The site ID of the DNS record. All sites’ DNS records will be returned if this field is not specified.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID of the DNS record. All sites’ DNS records will be returned if this field is not specified.
     * @param ZoneId The site ID of the DNS record. All sites’ DNS records will be returned if this field is not specified.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter criteria. Each filter criteria can have up to 20 entries.
<li>`record-id`:<br>   Filter by <strong>DNS record ID</strong>, such as record-1a8df68z<br>   Type: String<br>Required: No
<li>`record-name`:<br>   Filter by <strong>DNS record name</strong><br>   Type: String<br>Required: No
<li>`record-type`:<br>   Filter by <strong>DNS record type</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `A`: Point a domain name to an IPv4 address, such as 8.8.8.8.<br>   `AAAA`: Point a domain name to an IPv6 address.<br>   `CNAME`: Point a domain name to another domain name that can be resolved to an IP address.<br>   `TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).<br>   `NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.<br>   `CAA`: Specify CAs to issue certificates for sites.<br>   `SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.<br>  `MX`: Specify the mail server for receiving emails.
<li>`mode`:<br>   Filter by <strong>proxy mode</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `dns_only`: Only DNS<br>   `proxied`: Proxied
<li>`ttl`:<br>   Filter by <strong>TTL</strong><br>   Type: String<br>Required: No 
     * @return Filters Filter criteria. Each filter criteria can have up to 20 entries.
<li>`record-id`:<br>   Filter by <strong>DNS record ID</strong>, such as record-1a8df68z<br>   Type: String<br>Required: No
<li>`record-name`:<br>   Filter by <strong>DNS record name</strong><br>   Type: String<br>Required: No
<li>`record-type`:<br>   Filter by <strong>DNS record type</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `A`: Point a domain name to an IPv4 address, such as 8.8.8.8.<br>   `AAAA`: Point a domain name to an IPv6 address.<br>   `CNAME`: Point a domain name to another domain name that can be resolved to an IP address.<br>   `TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).<br>   `NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.<br>   `CAA`: Specify CAs to issue certificates for sites.<br>   `SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.<br>  `MX`: Specify the mail server for receiving emails.
<li>`mode`:<br>   Filter by <strong>proxy mode</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `dns_only`: Only DNS<br>   `proxied`: Proxied
<li>`ttl`:<br>   Filter by <strong>TTL</strong><br>   Type: String<br>Required: No
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. Each filter criteria can have up to 20 entries.
<li>`record-id`:<br>   Filter by <strong>DNS record ID</strong>, such as record-1a8df68z<br>   Type: String<br>Required: No
<li>`record-name`:<br>   Filter by <strong>DNS record name</strong><br>   Type: String<br>Required: No
<li>`record-type`:<br>   Filter by <strong>DNS record type</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `A`: Point a domain name to an IPv4 address, such as 8.8.8.8.<br>   `AAAA`: Point a domain name to an IPv6 address.<br>   `CNAME`: Point a domain name to another domain name that can be resolved to an IP address.<br>   `TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).<br>   `NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.<br>   `CAA`: Specify CAs to issue certificates for sites.<br>   `SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.<br>  `MX`: Specify the mail server for receiving emails.
<li>`mode`:<br>   Filter by <strong>proxy mode</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `dns_only`: Only DNS<br>   `proxied`: Proxied
<li>`ttl`:<br>   Filter by <strong>TTL</strong><br>   Type: String<br>Required: No
     * @param Filters Filter criteria. Each filter criteria can have up to 20 entries.
<li>`record-id`:<br>   Filter by <strong>DNS record ID</strong>, such as record-1a8df68z<br>   Type: String<br>Required: No
<li>`record-name`:<br>   Filter by <strong>DNS record name</strong><br>   Type: String<br>Required: No
<li>`record-type`:<br>   Filter by <strong>DNS record type</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `A`: Point a domain name to an IPv4 address, such as 8.8.8.8.<br>   `AAAA`: Point a domain name to an IPv6 address.<br>   `CNAME`: Point a domain name to another domain name that can be resolved to an IP address.<br>   `TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).<br>   `NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.<br>   `CAA`: Specify CAs to issue certificates for sites.<br>   `SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.<br>  `MX`: Specify the mail server for receiving emails.
<li>`mode`:<br>   Filter by <strong>proxy mode</strong><br>   Type: String<br>Required: No<br>   Values:<br>   `dns_only`: Only DNS<br>   `proxied`: Proxied
<li>`ttl`:<br>   Filter by <strong>TTL</strong><br>   Type: String<br>Required: No
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The sorting order. Values:
<li>`ASC`: Ascending order</li>
<li>`desc`: Descending order</li> Default value: asc 
     * @return Direction The sorting order. Values:
<li>`ASC`: Ascending order</li>
<li>`desc`: Descending order</li> Default value: asc
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set The sorting order. Values:
<li>`ASC`: Ascending order</li>
<li>`desc`: Descending order</li> Default value: asc
     * @param Direction The sorting order. Values:
<li>`ASC`: Ascending order</li>
<li>`desc`: Descending order</li> Default value: asc
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
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
     * Get The sorting criteria. Values:
<li>`content`: DNS record content.</li>
<li>`created_on`: Creation time of the DNS record.</li>
<li>`mode`: Proxy mode.</li>
<li>`record-name`: DNS record name.</li>
<li>`ttl`: DNS TTL.</li>
<li>`record-type`: DNS record type.</li>If this field is not specified, the DNS records are sorted based on `record-type` and `recrod-name`. 
     * @return Order The sorting criteria. Values:
<li>`content`: DNS record content.</li>
<li>`created_on`: Creation time of the DNS record.</li>
<li>`mode`: Proxy mode.</li>
<li>`record-name`: DNS record name.</li>
<li>`ttl`: DNS TTL.</li>
<li>`record-type`: DNS record type.</li>If this field is not specified, the DNS records are sorted based on `record-type` and `recrod-name`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set The sorting criteria. Values:
<li>`content`: DNS record content.</li>
<li>`created_on`: Creation time of the DNS record.</li>
<li>`mode`: Proxy mode.</li>
<li>`record-name`: DNS record name.</li>
<li>`ttl`: DNS TTL.</li>
<li>`record-type`: DNS record type.</li>If this field is not specified, the DNS records are sorted based on `record-type` and `recrod-name`.
     * @param Order The sorting criteria. Values:
<li>`content`: DNS record content.</li>
<li>`created_on`: Creation time of the DNS record.</li>
<li>`mode`: Proxy mode.</li>
<li>`record-name`: DNS record name.</li>
<li>`ttl`: DNS TTL.</li>
<li>`record-type`: DNS record type.</li>If this field is not specified, the DNS records are sorted based on `record-type` and `recrod-name`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
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

