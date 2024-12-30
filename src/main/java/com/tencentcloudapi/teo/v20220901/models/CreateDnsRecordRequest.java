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

public class CreateDnsRecordRequest extends AbstractModel {

    /**
    * The site ID of the DNS record.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The DNS record name.If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNS record types include:

- A:Points the domain to an external IPv4 address, such as 8.8.8.8.
- AAAA: Points the domain to an external IPv6 address.
- MX: Used for mail servers. When multiple MX records exist, the one with the lowest priority value is preferred.
- CNAME: Points the domain to another domain, which then resolves to the final IP address.
- TXT: Provides identification and description for the domain, commonly used for domain verification and SPF records (anti-spam).
- NS: If you need to delegate a subdomain to another DNS service provider, you need to add an NS record. NS records cannot be added to the root domain.
- CAA: Specifies which Certificate Authorities (CAs) are allowed to issue certificates for the site.
- SRV: Indicates that a specific server is using a particular service, commonly used in Microsoft's directory management systems.

Different record types, such as SRV and CAA, have specific requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, please refer to: [Introduction to DNS Record Types](https://www.tencentcloud.com/zh/document/product/1145/54764#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * DNS record content should be filled in according to the corresponding Type value. If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * DNS record resolution location, if not specified, default to "Default," which means the default resolution location and is effective for all regions.
- Resolution location configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.
- Resolution location configuration is only available for Standard and Enterprise packages.

For the values, please refer to: [Resolution Lines and Corresponding Codes Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * TTL (in seconds). The smaller the value, the faster the record changes take effect. Default value: 300
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * DNS record weight can be specified within the range of -1 to 100. Setting the weight to 0 means the record will not be resolved. If not specified, the default value is -1, indicating that no weight is set.

Weight configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.

Note: For the same subdomain, different DNS records on the same resolution line should either all have weights set or none should have weights set.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * The MX record priority parameter is only effective when the Type (DNS record type) is MX. The smaller the value, the higher the priority. Users can specify a value in the range of 0 to 50. If not specified, the default value is 0.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

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
     * Get The DNS record name.If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered. 
     * @return Name The DNS record name.If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The DNS record name.If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
     * @param Name The DNS record name.If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNS record types include:

- A:Points the domain to an external IPv4 address, such as 8.8.8.8.
- AAAA: Points the domain to an external IPv6 address.
- MX: Used for mail servers. When multiple MX records exist, the one with the lowest priority value is preferred.
- CNAME: Points the domain to another domain, which then resolves to the final IP address.
- TXT: Provides identification and description for the domain, commonly used for domain verification and SPF records (anti-spam).
- NS: If you need to delegate a subdomain to another DNS service provider, you need to add an NS record. NS records cannot be added to the root domain.
- CAA: Specifies which Certificate Authorities (CAs) are allowed to issue certificates for the site.
- SRV: Indicates that a specific server is using a particular service, commonly used in Microsoft's directory management systems.

Different record types, such as SRV and CAA, have specific requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, please refer to: [Introduction to DNS Record Types](https://www.tencentcloud.com/zh/document/product/1145/54764#2f681022-91ab-4a9e-ac3d-0a6c454d954e). 
     * @return Type DNS record types include:

- A:Points the domain to an external IPv4 address, such as 8.8.8.8.
- AAAA: Points the domain to an external IPv6 address.
- MX: Used for mail servers. When multiple MX records exist, the one with the lowest priority value is preferred.
- CNAME: Points the domain to another domain, which then resolves to the final IP address.
- TXT: Provides identification and description for the domain, commonly used for domain verification and SPF records (anti-spam).
- NS: If you need to delegate a subdomain to another DNS service provider, you need to add an NS record. NS records cannot be added to the root domain.
- CAA: Specifies which Certificate Authorities (CAs) are allowed to issue certificates for the site.
- SRV: Indicates that a specific server is using a particular service, commonly used in Microsoft's directory management systems.

Different record types, such as SRV and CAA, have specific requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, please refer to: [Introduction to DNS Record Types](https://www.tencentcloud.com/zh/document/product/1145/54764#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DNS record types include:

- A:Points the domain to an external IPv4 address, such as 8.8.8.8.
- AAAA: Points the domain to an external IPv6 address.
- MX: Used for mail servers. When multiple MX records exist, the one with the lowest priority value is preferred.
- CNAME: Points the domain to another domain, which then resolves to the final IP address.
- TXT: Provides identification and description for the domain, commonly used for domain verification and SPF records (anti-spam).
- NS: If you need to delegate a subdomain to another DNS service provider, you need to add an NS record. NS records cannot be added to the root domain.
- CAA: Specifies which Certificate Authorities (CAs) are allowed to issue certificates for the site.
- SRV: Indicates that a specific server is using a particular service, commonly used in Microsoft's directory management systems.

Different record types, such as SRV and CAA, have specific requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, please refer to: [Introduction to DNS Record Types](https://www.tencentcloud.com/zh/document/product/1145/54764#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     * @param Type DNS record types include:

- A:Points the domain to an external IPv4 address, such as 8.8.8.8.
- AAAA: Points the domain to an external IPv6 address.
- MX: Used for mail servers. When multiple MX records exist, the one with the lowest priority value is preferred.
- CNAME: Points the domain to another domain, which then resolves to the final IP address.
- TXT: Provides identification and description for the domain, commonly used for domain verification and SPF records (anti-spam).
- NS: If you need to delegate a subdomain to another DNS service provider, you need to add an NS record. NS records cannot be added to the root domain.
- CAA: Specifies which Certificate Authorities (CAs) are allowed to issue certificates for the site.
- SRV: Indicates that a specific server is using a particular service, commonly used in Microsoft's directory management systems.

Different record types, such as SRV and CAA, have specific requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, please refer to: [Introduction to DNS Record Types](https://www.tencentcloud.com/zh/document/product/1145/54764#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get DNS record content should be filled in according to the corresponding Type value. If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered. 
     * @return Content DNS record content should be filled in according to the corresponding Type value. If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS record content should be filled in according to the corresponding Type value. If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
     * @param Content DNS record content should be filled in according to the corresponding Type value. If the domain name is in Chinese, Korean, or Japanese, it needs to be converted to Punycode before being entered.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get DNS record resolution location, if not specified, default to "Default," which means the default resolution location and is effective for all regions.
- Resolution location configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.
- Resolution location configuration is only available for Standard and Enterprise packages.

For the values, please refer to: [Resolution Lines and Corresponding Codes Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229). 
     * @return Location DNS record resolution location, if not specified, default to "Default," which means the default resolution location and is effective for all regions.
- Resolution location configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.
- Resolution location configuration is only available for Standard and Enterprise packages.

For the values, please refer to: [Resolution Lines and Corresponding Codes Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set DNS record resolution location, if not specified, default to "Default," which means the default resolution location and is effective for all regions.
- Resolution location configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.
- Resolution location configuration is only available for Standard and Enterprise packages.

For the values, please refer to: [Resolution Lines and Corresponding Codes Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
     * @param Location DNS record resolution location, if not specified, default to "Default," which means the default resolution location and is effective for all regions.
- Resolution location configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.
- Resolution location configuration is only available for Standard and Enterprise packages.

For the values, please refer to: [Resolution Lines and Corresponding Codes Enumeration](https://www.tencentcloud.com/zh/document/product/1145/67229).
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get TTL (in seconds). The smaller the value, the faster the record changes take effect. Default value: 300 
     * @return TTL TTL (in seconds). The smaller the value, the faster the record changes take effect. Default value: 300
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL (in seconds). The smaller the value, the faster the record changes take effect. Default value: 300
     * @param TTL TTL (in seconds). The smaller the value, the faster the record changes take effect. Default value: 300
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get DNS record weight can be specified within the range of -1 to 100. Setting the weight to 0 means the record will not be resolved. If not specified, the default value is -1, indicating that no weight is set.

Weight configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.

Note: For the same subdomain, different DNS records on the same resolution line should either all have weights set or none should have weights set. 
     * @return Weight DNS record weight can be specified within the range of -1 to 100. Setting the weight to 0 means the record will not be resolved. If not specified, the default value is -1, indicating that no weight is set.

Weight configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.

Note: For the same subdomain, different DNS records on the same resolution line should either all have weights set or none should have weights set.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set DNS record weight can be specified within the range of -1 to 100. Setting the weight to 0 means the record will not be resolved. If not specified, the default value is -1, indicating that no weight is set.

Weight configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.

Note: For the same subdomain, different DNS records on the same resolution line should either all have weights set or none should have weights set.
     * @param Weight DNS record weight can be specified within the range of -1 to 100. Setting the weight to 0 means the record will not be resolved. If not specified, the default value is -1, indicating that no weight is set.

Weight configuration is only applicable when the Type (DNS record type) is A, AAAA, or CNAME.

Note: For the same subdomain, different DNS records on the same resolution line should either all have weights set or none should have weights set.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get The MX record priority parameter is only effective when the Type (DNS record type) is MX. The smaller the value, the higher the priority. Users can specify a value in the range of 0 to 50. If not specified, the default value is 0. 
     * @return Priority The MX record priority parameter is only effective when the Type (DNS record type) is MX. The smaller the value, the higher the priority. Users can specify a value in the range of 0 to 50. If not specified, the default value is 0.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set The MX record priority parameter is only effective when the Type (DNS record type) is MX. The smaller the value, the higher the priority. Users can specify a value in the range of 0 to 50. If not specified, the default value is 0.
     * @param Priority The MX record priority parameter is only effective when the Type (DNS record type) is MX. The smaller the value, the higher the priority. Users can specify a value in the range of 0 to 50. If not specified, the default value is 0.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CreateDnsRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDnsRecordRequest(CreateDnsRecordRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

