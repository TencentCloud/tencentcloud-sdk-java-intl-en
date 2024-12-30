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

public class DnsRecord extends AbstractModel {

    /**
    * Site ID. 
Note: ZoneId is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
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
    * DNS record type, with possible values: <li>A: Points the domain name to an external IPv4 address, such as 8.8.8.8;</li> <li>AAAA: Points the domain name to an external IPv6 address;</li> <li>MX: Used for mail servers. When there are multiple MX records, the lower the priority value, the higher the priority;</li> <li>CNAME: Points the domain name to another domain name, which then resolves to the final IP address;</li> <li>TXT: Identifies and describes the domain name, commonly used for domain verification and SPF records (anti-spam);</li> <li>NS: If you need to delegate the subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added to the root domain;</li> <li>CAA: Specifies the CA that can issue certificates for this site;</li> <li>SRV: Identifies a server that uses a specific service, commonly used in Microsoft's directory management.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * DNS record resolution line. If not specified, the default is Default, which means the default resolution line and is effective for all regions. The resolution line configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME. For values, please refer to: [Resolution Line and Corresponding Code Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * DNS record content. Fill in the corresponding content according to the Type value.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Cache time, with a range of 60~86400. The smaller the value, the faster the record modification takes effect in various regions. Unit: seconds.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * DNS record weight, with a range of -1~100. A value of -1 means no weight is assigned, and a value of 0 means no resolution. Weight configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX record priority, with a range of 0~50. The smaller the value, the higher the priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * DNS record resolution status, with possible values: <li>enable: Effective;</li> <li>disable: Disabled.</li> Note: Status is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The creation time.
Note: CreatedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The modification time.
Note: ModifiedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get Site ID. 
Note: ZoneId is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored. 
     * @return ZoneId Site ID. 
Note: ZoneId is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID. 
Note: ZoneId is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     * @param ZoneId Site ID. 
Note: ZoneId is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
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
     * Get DNS record type, with possible values: <li>A: Points the domain name to an external IPv4 address, such as 8.8.8.8;</li> <li>AAAA: Points the domain name to an external IPv6 address;</li> <li>MX: Used for mail servers. When there are multiple MX records, the lower the priority value, the higher the priority;</li> <li>CNAME: Points the domain name to another domain name, which then resolves to the final IP address;</li> <li>TXT: Identifies and describes the domain name, commonly used for domain verification and SPF records (anti-spam);</li> <li>NS: If you need to delegate the subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added to the root domain;</li> <li>CAA: Specifies the CA that can issue certificates for this site;</li> <li>SRV: Identifies a server that uses a specific service, commonly used in Microsoft's directory management.</li> 
     * @return Type DNS record type, with possible values: <li>A: Points the domain name to an external IPv4 address, such as 8.8.8.8;</li> <li>AAAA: Points the domain name to an external IPv6 address;</li> <li>MX: Used for mail servers. When there are multiple MX records, the lower the priority value, the higher the priority;</li> <li>CNAME: Points the domain name to another domain name, which then resolves to the final IP address;</li> <li>TXT: Identifies and describes the domain name, commonly used for domain verification and SPF records (anti-spam);</li> <li>NS: If you need to delegate the subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added to the root domain;</li> <li>CAA: Specifies the CA that can issue certificates for this site;</li> <li>SRV: Identifies a server that uses a specific service, commonly used in Microsoft's directory management.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DNS record type, with possible values: <li>A: Points the domain name to an external IPv4 address, such as 8.8.8.8;</li> <li>AAAA: Points the domain name to an external IPv6 address;</li> <li>MX: Used for mail servers. When there are multiple MX records, the lower the priority value, the higher the priority;</li> <li>CNAME: Points the domain name to another domain name, which then resolves to the final IP address;</li> <li>TXT: Identifies and describes the domain name, commonly used for domain verification and SPF records (anti-spam);</li> <li>NS: If you need to delegate the subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added to the root domain;</li> <li>CAA: Specifies the CA that can issue certificates for this site;</li> <li>SRV: Identifies a server that uses a specific service, commonly used in Microsoft's directory management.</li>
     * @param Type DNS record type, with possible values: <li>A: Points the domain name to an external IPv4 address, such as 8.8.8.8;</li> <li>AAAA: Points the domain name to an external IPv6 address;</li> <li>MX: Used for mail servers. When there are multiple MX records, the lower the priority value, the higher the priority;</li> <li>CNAME: Points the domain name to another domain name, which then resolves to the final IP address;</li> <li>TXT: Identifies and describes the domain name, commonly used for domain verification and SPF records (anti-spam);</li> <li>NS: If you need to delegate the subdomain to another DNS service provider for resolution, you need to add an NS record. NS records cannot be added to the root domain;</li> <li>CAA: Specifies the CA that can issue certificates for this site;</li> <li>SRV: Identifies a server that uses a specific service, commonly used in Microsoft's directory management.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get DNS record resolution line. If not specified, the default is Default, which means the default resolution line and is effective for all regions. The resolution line configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME. For values, please refer to: [Resolution Line and Corresponding Code Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229). 
     * @return Location DNS record resolution line. If not specified, the default is Default, which means the default resolution line and is effective for all regions. The resolution line configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME. For values, please refer to: [Resolution Line and Corresponding Code Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set DNS record resolution line. If not specified, the default is Default, which means the default resolution line and is effective for all regions. The resolution line configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME. For values, please refer to: [Resolution Line and Corresponding Code Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
     * @param Location DNS record resolution line. If not specified, the default is Default, which means the default resolution line and is effective for all regions. The resolution line configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME. For values, please refer to: [Resolution Line and Corresponding Code Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get DNS record content. Fill in the corresponding content according to the Type value. 
     * @return Content DNS record content. Fill in the corresponding content according to the Type value.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS record content. Fill in the corresponding content according to the Type value.
     * @param Content DNS record content. Fill in the corresponding content according to the Type value.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Cache time, with a range of 60~86400. The smaller the value, the faster the record modification takes effect in various regions. Unit: seconds. 
     * @return TTL Cache time, with a range of 60~86400. The smaller the value, the faster the record modification takes effect in various regions. Unit: seconds.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Cache time, with a range of 60~86400. The smaller the value, the faster the record modification takes effect in various regions. Unit: seconds.
     * @param TTL Cache time, with a range of 60~86400. The smaller the value, the faster the record modification takes effect in various regions. Unit: seconds.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get DNS record weight, with a range of -1~100. A value of -1 means no weight is assigned, and a value of 0 means no resolution. Weight configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME. 
     * @return Weight DNS record weight, with a range of -1~100. A value of -1 means no weight is assigned, and a value of 0 means no resolution. Weight configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set DNS record weight, with a range of -1~100. A value of -1 means no weight is assigned, and a value of 0 means no resolution. Weight configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME.
     * @param Weight DNS record weight, with a range of -1~100. A value of -1 means no weight is assigned, and a value of 0 means no resolution. Weight configuration is only applicable when Type (DNS record type) is A, AAAA, or CNAME.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX record priority, with a range of 0~50. The smaller the value, the higher the priority. 
     * @return Priority MX record priority, with a range of 0~50. The smaller the value, the higher the priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set MX record priority, with a range of 0~50. The smaller the value, the higher the priority.
     * @param Priority MX record priority, with a range of 0~50. The smaller the value, the higher the priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get DNS record resolution status, with possible values: <li>enable: Effective;</li> <li>disable: Disabled.</li> Note: Status is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored. 
     * @return Status DNS record resolution status, with possible values: <li>enable: Effective;</li> <li>disable: Disabled.</li> Note: Status is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DNS record resolution status, with possible values: <li>enable: Effective;</li> <li>disable: Disabled.</li> Note: Status is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     * @param Status DNS record resolution status, with possible values: <li>enable: Effective;</li> <li>disable: Disabled.</li> Note: Status is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The creation time.
Note: CreatedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored. 
     * @return CreatedOn The creation time.
Note: CreatedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The creation time.
Note: CreatedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     * @param CreatedOn The creation time.
Note: CreatedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The modification time.
Note: ModifiedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored. 
     * @return ModifiedOn The modification time.
Note: ModifiedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set The modification time.
Note: ModifiedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
     * @param ModifiedOn The modification time.
Note: ModifiedOn is only used as an output parameter and cannot be used as an input parameter in ModifyDnsRecords. If this parameter is passed, it will be ignored.
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

