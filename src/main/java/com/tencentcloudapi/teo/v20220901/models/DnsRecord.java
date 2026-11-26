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

public class DnsRecord extends AbstractModel {

    /**
    * Site ID.<br>Note: ZoneId is for output usage only. It cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DNS record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * DNS record name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNS record type. Valid values:
<li>A: Point the domain name to a public IPv4 address, for example 8.8.8.8;</li>
<li>AAAA: point the domain name to a public IPv6 address;</li>
<li>MX: for email servers. When multiple MX records exist, lower priority means higher preference;</li>
<li>CNAME: Point the domain to another domain, which then resolves the final IP;</li>
<li>TXT: Identifies and describes a domain name, commonly used for domain name verification and SPF records (anti-spam);</li>
<li>NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. NS records cannot be added for the root domain;</li>
<li>CAA: specify the CA that can issue certificates for this site;</li>
<li>SRV: identifies that a server used a service, commonly seen in directory management of Microsoft systems.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * DNS record resolution route. If not specified, it defaults to Default, which means the default resolution route and represents that it takes effect in all regions.<br>Route configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>For values, see [Resolution routes and corresponding code enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * DNS record content. Fill in the corresponding content based on the Type value.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Cache time. Value range: 60–86400. A smaller value means the modification record takes effect faster in each region. Unit: seconds.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * DNS record weight. Value range: -1 to 100. -1 means no weight is assigned, and 0 indicates no parsing. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX record priority. Value range: 0–50. A smaller value indicates a higher priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * DNS record resolution status. Valid values: <li>enable: effective;</li><li>disable: disabled.</li>Note: Status is for output only. It cannot be used as an input parameter in ModifyDnsRecords and will be ignored if provided.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time.<br>Note: CreatedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Last modified.<br>Note: ModifiedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get Site ID.<br>Note: ZoneId is for output usage only. It cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored. 
     * @return ZoneId Site ID.<br>Note: ZoneId is for output usage only. It cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.<br>Note: ZoneId is for output usage only. It cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     * @param ZoneId Site ID.<br>Note: ZoneId is for output usage only. It cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get DNS record ID. 
     * @return RecordId DNS record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set DNS record ID.
     * @param RecordId DNS record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get DNS record name. 
     * @return Name DNS record name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set DNS record name.
     * @param Name DNS record name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNS record type. Valid values:
<li>A: Point the domain name to a public IPv4 address, for example 8.8.8.8;</li>
<li>AAAA: point the domain name to a public IPv6 address;</li>
<li>MX: for email servers. When multiple MX records exist, lower priority means higher preference;</li>
<li>CNAME: Point the domain to another domain, which then resolves the final IP;</li>
<li>TXT: Identifies and describes a domain name, commonly used for domain name verification and SPF records (anti-spam);</li>
<li>NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. NS records cannot be added for the root domain;</li>
<li>CAA: specify the CA that can issue certificates for this site;</li>
<li>SRV: identifies that a server used a service, commonly seen in directory management of Microsoft systems.</li> 
     * @return Type DNS record type. Valid values:
<li>A: Point the domain name to a public IPv4 address, for example 8.8.8.8;</li>
<li>AAAA: point the domain name to a public IPv6 address;</li>
<li>MX: for email servers. When multiple MX records exist, lower priority means higher preference;</li>
<li>CNAME: Point the domain to another domain, which then resolves the final IP;</li>
<li>TXT: Identifies and describes a domain name, commonly used for domain name verification and SPF records (anti-spam);</li>
<li>NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. NS records cannot be added for the root domain;</li>
<li>CAA: specify the CA that can issue certificates for this site;</li>
<li>SRV: identifies that a server used a service, commonly seen in directory management of Microsoft systems.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DNS record type. Valid values:
<li>A: Point the domain name to a public IPv4 address, for example 8.8.8.8;</li>
<li>AAAA: point the domain name to a public IPv6 address;</li>
<li>MX: for email servers. When multiple MX records exist, lower priority means higher preference;</li>
<li>CNAME: Point the domain to another domain, which then resolves the final IP;</li>
<li>TXT: Identifies and describes a domain name, commonly used for domain name verification and SPF records (anti-spam);</li>
<li>NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. NS records cannot be added for the root domain;</li>
<li>CAA: specify the CA that can issue certificates for this site;</li>
<li>SRV: identifies that a server used a service, commonly seen in directory management of Microsoft systems.</li>
     * @param Type DNS record type. Valid values:
<li>A: Point the domain name to a public IPv4 address, for example 8.8.8.8;</li>
<li>AAAA: point the domain name to a public IPv6 address;</li>
<li>MX: for email servers. When multiple MX records exist, lower priority means higher preference;</li>
<li>CNAME: Point the domain to another domain, which then resolves the final IP;</li>
<li>TXT: Identifies and describes a domain name, commonly used for domain name verification and SPF records (anti-spam);</li>
<li>NS: If you need to delegate subdomain resolution to another DNS service provider, you need to add an NS record. NS records cannot be added for the root domain;</li>
<li>CAA: specify the CA that can issue certificates for this site;</li>
<li>SRV: identifies that a server used a service, commonly seen in directory management of Microsoft systems.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get DNS record resolution route. If not specified, it defaults to Default, which means the default resolution route and represents that it takes effect in all regions.<br>Route configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>For values, see [Resolution routes and corresponding code enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1). 
     * @return Location DNS record resolution route. If not specified, it defaults to Default, which means the default resolution route and represents that it takes effect in all regions.<br>Route configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>For values, see [Resolution routes and corresponding code enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set DNS record resolution route. If not specified, it defaults to Default, which means the default resolution route and represents that it takes effect in all regions.<br>Route configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>For values, see [Resolution routes and corresponding code enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
     * @param Location DNS record resolution route. If not specified, it defaults to Default, which means the default resolution route and represents that it takes effect in all regions.<br>Route configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>For values, see [Resolution routes and corresponding code enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get DNS record content. Fill in the corresponding content based on the Type value. 
     * @return Content DNS record content. Fill in the corresponding content based on the Type value.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS record content. Fill in the corresponding content based on the Type value.
     * @param Content DNS record content. Fill in the corresponding content based on the Type value.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Cache time. Value range: 60–86400. A smaller value means the modification record takes effect faster in each region. Unit: seconds. 
     * @return TTL Cache time. Value range: 60–86400. A smaller value means the modification record takes effect faster in each region. Unit: seconds.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Cache time. Value range: 60–86400. A smaller value means the modification record takes effect faster in each region. Unit: seconds.
     * @param TTL Cache time. Value range: 60–86400. A smaller value means the modification record takes effect faster in each region. Unit: seconds.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get DNS record weight. Value range: -1 to 100. -1 means no weight is assigned, and 0 indicates no parsing. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME. 
     * @return Weight DNS record weight. Value range: -1 to 100. -1 means no weight is assigned, and 0 indicates no parsing. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set DNS record weight. Value range: -1 to 100. -1 means no weight is assigned, and 0 indicates no parsing. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
     * @param Weight DNS record weight. Value range: -1 to 100. -1 means no weight is assigned, and 0 indicates no parsing. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX record priority. Value range: 0–50. A smaller value indicates a higher priority. 
     * @return Priority MX record priority. Value range: 0–50. A smaller value indicates a higher priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set MX record priority. Value range: 0–50. A smaller value indicates a higher priority.
     * @param Priority MX record priority. Value range: 0–50. A smaller value indicates a higher priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get DNS record resolution status. Valid values: <li>enable: effective;</li><li>disable: disabled.</li>Note: Status is for output only. It cannot be used as an input parameter in ModifyDnsRecords and will be ignored if provided. 
     * @return Status DNS record resolution status. Valid values: <li>enable: effective;</li><li>disable: disabled.</li>Note: Status is for output only. It cannot be used as an input parameter in ModifyDnsRecords and will be ignored if provided.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DNS record resolution status. Valid values: <li>enable: effective;</li><li>disable: disabled.</li>Note: Status is for output only. It cannot be used as an input parameter in ModifyDnsRecords and will be ignored if provided.
     * @param Status DNS record resolution status. Valid values: <li>enable: effective;</li><li>disable: disabled.</li>Note: Status is for output only. It cannot be used as an input parameter in ModifyDnsRecords and will be ignored if provided.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time.<br>Note: CreatedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored. 
     * @return CreatedOn Creation time.<br>Note: CreatedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time.<br>Note: CreatedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     * @param CreatedOn Creation time.<br>Note: CreatedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Last modified.<br>Note: ModifiedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored. 
     * @return ModifiedOn Last modified.<br>Note: ModifiedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Last modified.<br>Note: ModifiedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     * @param ModifiedOn Last modified.<br>Note: ModifiedOn is for output only and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is input, it will be ignored.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public DnsRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsRecord(DnsRecord source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

