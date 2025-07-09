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
    * Zone id.<br>note: zoneid is for output parameter use only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DNS record id.
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
    * DNS record type. valid values are:.
<Li>A: point the domain to a public network ipv4 address, such as 8.8.8.8;</li>.
<Li>AAAA: point the domain to a public network ipv6 address;</li>.
<Li>MX: used for email servers. when there are multiple mx records, the lower the priority, the higher the precedence;</li>.
<Li>CNAME: point the domain to another domain name, which will resolve to the final ip address;</li>.
<Li>TXT: identify and describe the domain, commonly used for domain verification and spf records (anti-spam);</li>.
<Li>NS: if you need to delegate the resolution of a subdomain to another dns service provider, you need to add an ns record. ns records cannot be added to the root domain name;</li>.
<Li>CAA: specifies the ca that can issue certificates for this site;</li>.
<Li>SRV: indicates that a server is using a service, commonly seen in microsoft system directory management.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * DNS record resolution route, if not specified, defaults to default, indicating the default resolution route, effective in all regions.<br>resolution route configuration only applies when type (dns record type) is a, aaaa, or cname.<br>for valid values, refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * DNS record content. fill in the corresponding content based on the type value.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Cache time. value range: 60–86400. the smaller the value, the faster the record modification will take effect globally. unit: seconds.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * DNS record weight. value range: -1–100. a value of -1 means no weight is assigned, and 0 means no parsing. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX record priority. value range: 0–50. the smaller the value, the higher the priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * DNS record parsing status. valid values are: <li>enable: takes effect;</li><li>disable: disabled.</li> note: status is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time.<br>note: createdon is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Modification time.<br>note: modifiedon is for output parameter only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get Zone id.<br>note: zoneid is for output parameter use only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored. 
     * @return ZoneId Zone id.<br>note: zoneid is for output parameter use only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id.<br>note: zoneid is for output parameter use only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     * @param ZoneId Zone id.<br>note: zoneid is for output parameter use only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get DNS record id. 
     * @return RecordId DNS record id.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set DNS record id.
     * @param RecordId DNS record id.
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
     * Get DNS record type. valid values are:.
<Li>A: point the domain to a public network ipv4 address, such as 8.8.8.8;</li>.
<Li>AAAA: point the domain to a public network ipv6 address;</li>.
<Li>MX: used for email servers. when there are multiple mx records, the lower the priority, the higher the precedence;</li>.
<Li>CNAME: point the domain to another domain name, which will resolve to the final ip address;</li>.
<Li>TXT: identify and describe the domain, commonly used for domain verification and spf records (anti-spam);</li>.
<Li>NS: if you need to delegate the resolution of a subdomain to another dns service provider, you need to add an ns record. ns records cannot be added to the root domain name;</li>.
<Li>CAA: specifies the ca that can issue certificates for this site;</li>.
<Li>SRV: indicates that a server is using a service, commonly seen in microsoft system directory management.</li>. 
     * @return Type DNS record type. valid values are:.
<Li>A: point the domain to a public network ipv4 address, such as 8.8.8.8;</li>.
<Li>AAAA: point the domain to a public network ipv6 address;</li>.
<Li>MX: used for email servers. when there are multiple mx records, the lower the priority, the higher the precedence;</li>.
<Li>CNAME: point the domain to another domain name, which will resolve to the final ip address;</li>.
<Li>TXT: identify and describe the domain, commonly used for domain verification and spf records (anti-spam);</li>.
<Li>NS: if you need to delegate the resolution of a subdomain to another dns service provider, you need to add an ns record. ns records cannot be added to the root domain name;</li>.
<Li>CAA: specifies the ca that can issue certificates for this site;</li>.
<Li>SRV: indicates that a server is using a service, commonly seen in microsoft system directory management.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DNS record type. valid values are:.
<Li>A: point the domain to a public network ipv4 address, such as 8.8.8.8;</li>.
<Li>AAAA: point the domain to a public network ipv6 address;</li>.
<Li>MX: used for email servers. when there are multiple mx records, the lower the priority, the higher the precedence;</li>.
<Li>CNAME: point the domain to another domain name, which will resolve to the final ip address;</li>.
<Li>TXT: identify and describe the domain, commonly used for domain verification and spf records (anti-spam);</li>.
<Li>NS: if you need to delegate the resolution of a subdomain to another dns service provider, you need to add an ns record. ns records cannot be added to the root domain name;</li>.
<Li>CAA: specifies the ca that can issue certificates for this site;</li>.
<Li>SRV: indicates that a server is using a service, commonly seen in microsoft system directory management.</li>.
     * @param Type DNS record type. valid values are:.
<Li>A: point the domain to a public network ipv4 address, such as 8.8.8.8;</li>.
<Li>AAAA: point the domain to a public network ipv6 address;</li>.
<Li>MX: used for email servers. when there are multiple mx records, the lower the priority, the higher the precedence;</li>.
<Li>CNAME: point the domain to another domain name, which will resolve to the final ip address;</li>.
<Li>TXT: identify and describe the domain, commonly used for domain verification and spf records (anti-spam);</li>.
<Li>NS: if you need to delegate the resolution of a subdomain to another dns service provider, you need to add an ns record. ns records cannot be added to the root domain name;</li>.
<Li>CAA: specifies the ca that can issue certificates for this site;</li>.
<Li>SRV: indicates that a server is using a service, commonly seen in microsoft system directory management.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get DNS record resolution route, if not specified, defaults to default, indicating the default resolution route, effective in all regions.<br>resolution route configuration only applies when type (dns record type) is a, aaaa, or cname.<br>for valid values, refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1). 
     * @return Location DNS record resolution route, if not specified, defaults to default, indicating the default resolution route, effective in all regions.<br>resolution route configuration only applies when type (dns record type) is a, aaaa, or cname.<br>for valid values, refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set DNS record resolution route, if not specified, defaults to default, indicating the default resolution route, effective in all regions.<br>resolution route configuration only applies when type (dns record type) is a, aaaa, or cname.<br>for valid values, refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
     * @param Location DNS record resolution route, if not specified, defaults to default, indicating the default resolution route, effective in all regions.<br>resolution route configuration only applies when type (dns record type) is a, aaaa, or cname.<br>for valid values, refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get DNS record content. fill in the corresponding content based on the type value. 
     * @return Content DNS record content. fill in the corresponding content based on the type value.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS record content. fill in the corresponding content based on the type value.
     * @param Content DNS record content. fill in the corresponding content based on the type value.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Cache time. value range: 60–86400. the smaller the value, the faster the record modification will take effect globally. unit: seconds. 
     * @return TTL Cache time. value range: 60–86400. the smaller the value, the faster the record modification will take effect globally. unit: seconds.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Cache time. value range: 60–86400. the smaller the value, the faster the record modification will take effect globally. unit: seconds.
     * @param TTL Cache time. value range: 60–86400. the smaller the value, the faster the record modification will take effect globally. unit: seconds.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get DNS record weight. value range: -1–100. a value of -1 means no weight is assigned, and 0 means no parsing. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname. 
     * @return Weight DNS record weight. value range: -1–100. a value of -1 means no weight is assigned, and 0 means no parsing. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set DNS record weight. value range: -1–100. a value of -1 means no weight is assigned, and 0 means no parsing. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.
     * @param Weight DNS record weight. value range: -1–100. a value of -1 means no weight is assigned, and 0 means no parsing. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX record priority. value range: 0–50. the smaller the value, the higher the priority. 
     * @return Priority MX record priority. value range: 0–50. the smaller the value, the higher the priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set MX record priority. value range: 0–50. the smaller the value, the higher the priority.
     * @param Priority MX record priority. value range: 0–50. the smaller the value, the higher the priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get DNS record parsing status. valid values are: <li>enable: takes effect;</li><li>disable: disabled.</li> note: status is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored. 
     * @return Status DNS record parsing status. valid values are: <li>enable: takes effect;</li><li>disable: disabled.</li> note: status is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DNS record parsing status. valid values are: <li>enable: takes effect;</li><li>disable: disabled.</li> note: status is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     * @param Status DNS record parsing status. valid values are: <li>enable: takes effect;</li><li>disable: disabled.</li> note: status is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time.<br>note: createdon is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored. 
     * @return CreatedOn Creation time.<br>note: createdon is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time.<br>note: createdon is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     * @param CreatedOn Creation time.<br>note: createdon is only used as an output parameter and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Modification time.<br>note: modifiedon is for output parameter only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored. 
     * @return ModifiedOn Modification time.<br>note: modifiedon is for output parameter only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Modification time.<br>note: modifiedon is for output parameter only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
     * @param ModifiedOn Modification time.<br>note: modifiedon is for output parameter only and cannot be used as an input parameter in modifydnsrecords. if this parameter is passed, it will be ignored.
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

