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

public class CreateDnsRecordRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DNS record name. If it is a Chinese, Korean, or Japanese domain name, it needs to be converted to punycode before input.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNS record type. Valid values: <li>A: point the domain to an external IPv4 address, for example 8.8.8.8;</li><li>AAAA: point the domain to an external IPv6 address;</li><li>MX: for email servers. If multiple MX records exist, a lower priority value indicates a higher priority;</li><li>CNAME: point the domain to another domain, which is then resolved to the final IP address;</li><li>TXT: identify and describe the domain, commonly used for domain verification and SPF records (anti-spam);</li><li>NS: if you need to use another DNS service provider to resolve a subdomain, an NS record needs to be added. An NS record cannot be added for the root domain;</li><li>CAA: specify the CA that can issue certificates for this site;</li><li>SRV: identify that a server uses a service, commonly used for directory management in Microsoft systems.</li>
Different record types, such as SRV and CAA records, have different requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, see [DNS Record Type Introduction](https://www.tencentcloud.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * DNS record content. Fill in the corresponding content based on the Type value. If it is a Chinese, Korean, or Japanese domain name, convert it to punycode before input.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * DNS record resolution route. If not specified, it defaults to Default, which means the default parsing route and takes effect in all regions.

-Resolution line configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
- Route parsing line configuration is applicable only to the standard and enterprise plans. For values, see [Resolution Routes and Corresponding Code Enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Cache time. You can specify a range of 60–86400. A smaller value means modification records take effect faster in each region. Default value: 300. Unit: seconds.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * DNS record weight. Users can specify a value range of -1 to 100. When set to 0, it means no parsing. If not specified, it defaults to -1, indicating no weight is set. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>Note: For different DNS records under the same subdomain and resolution route, set weight for all of them simultaneously or leave all of them unset.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX record priority. This parameter is valid only when Type (DNS record type) is MX. A smaller value indicates higher priority. You can specify a value from 0 to 50. If not specified, the default is 0.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

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
     * Get DNS record name. If it is a Chinese, Korean, or Japanese domain name, it needs to be converted to punycode before input. 
     * @return Name DNS record name. If it is a Chinese, Korean, or Japanese domain name, it needs to be converted to punycode before input.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set DNS record name. If it is a Chinese, Korean, or Japanese domain name, it needs to be converted to punycode before input.
     * @param Name DNS record name. If it is a Chinese, Korean, or Japanese domain name, it needs to be converted to punycode before input.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNS record type. Valid values: <li>A: point the domain to an external IPv4 address, for example 8.8.8.8;</li><li>AAAA: point the domain to an external IPv6 address;</li><li>MX: for email servers. If multiple MX records exist, a lower priority value indicates a higher priority;</li><li>CNAME: point the domain to another domain, which is then resolved to the final IP address;</li><li>TXT: identify and describe the domain, commonly used for domain verification and SPF records (anti-spam);</li><li>NS: if you need to use another DNS service provider to resolve a subdomain, an NS record needs to be added. An NS record cannot be added for the root domain;</li><li>CAA: specify the CA that can issue certificates for this site;</li><li>SRV: identify that a server uses a service, commonly used for directory management in Microsoft systems.</li>
Different record types, such as SRV and CAA records, have different requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, see [DNS Record Type Introduction](https://www.tencentcloud.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e). 
     * @return Type DNS record type. Valid values: <li>A: point the domain to an external IPv4 address, for example 8.8.8.8;</li><li>AAAA: point the domain to an external IPv6 address;</li><li>MX: for email servers. If multiple MX records exist, a lower priority value indicates a higher priority;</li><li>CNAME: point the domain to another domain, which is then resolved to the final IP address;</li><li>TXT: identify and describe the domain, commonly used for domain verification and SPF records (anti-spam);</li><li>NS: if you need to use another DNS service provider to resolve a subdomain, an NS record needs to be added. An NS record cannot be added for the root domain;</li><li>CAA: specify the CA that can issue certificates for this site;</li><li>SRV: identify that a server uses a service, commonly used for directory management in Microsoft systems.</li>
Different record types, such as SRV and CAA records, have different requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, see [DNS Record Type Introduction](https://www.tencentcloud.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DNS record type. Valid values: <li>A: point the domain to an external IPv4 address, for example 8.8.8.8;</li><li>AAAA: point the domain to an external IPv6 address;</li><li>MX: for email servers. If multiple MX records exist, a lower priority value indicates a higher priority;</li><li>CNAME: point the domain to another domain, which is then resolved to the final IP address;</li><li>TXT: identify and describe the domain, commonly used for domain verification and SPF records (anti-spam);</li><li>NS: if you need to use another DNS service provider to resolve a subdomain, an NS record needs to be added. An NS record cannot be added for the root domain;</li><li>CAA: specify the CA that can issue certificates for this site;</li><li>SRV: identify that a server uses a service, commonly used for directory management in Microsoft systems.</li>
Different record types, such as SRV and CAA records, have different requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, see [DNS Record Type Introduction](https://www.tencentcloud.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     * @param Type DNS record type. Valid values: <li>A: point the domain to an external IPv4 address, for example 8.8.8.8;</li><li>AAAA: point the domain to an external IPv6 address;</li><li>MX: for email servers. If multiple MX records exist, a lower priority value indicates a higher priority;</li><li>CNAME: point the domain to another domain, which is then resolved to the final IP address;</li><li>TXT: identify and describe the domain, commonly used for domain verification and SPF records (anti-spam);</li><li>NS: if you need to use another DNS service provider to resolve a subdomain, an NS record needs to be added. An NS record cannot be added for the root domain;</li><li>CAA: specify the CA that can issue certificates for this site;</li><li>SRV: identify that a server uses a service, commonly used for directory management in Microsoft systems.</li>
Different record types, such as SRV and CAA records, have different requirements for the host record name and record value format. For detailed descriptions and format examples of each record type, see [DNS Record Type Introduction](https://www.tencentcloud.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get DNS record content. Fill in the corresponding content based on the Type value. If it is a Chinese, Korean, or Japanese domain name, convert it to punycode before input. 
     * @return Content DNS record content. Fill in the corresponding content based on the Type value. If it is a Chinese, Korean, or Japanese domain name, convert it to punycode before input.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS record content. Fill in the corresponding content based on the Type value. If it is a Chinese, Korean, or Japanese domain name, convert it to punycode before input.
     * @param Content DNS record content. Fill in the corresponding content based on the Type value. If it is a Chinese, Korean, or Japanese domain name, convert it to punycode before input.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get DNS record resolution route. If not specified, it defaults to Default, which means the default parsing route and takes effect in all regions.

-Resolution line configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
- Route parsing line configuration is applicable only to the standard and enterprise plans. For values, see [Resolution Routes and Corresponding Code Enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1). 
     * @return Location DNS record resolution route. If not specified, it defaults to Default, which means the default parsing route and takes effect in all regions.

-Resolution line configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
- Route parsing line configuration is applicable only to the standard and enterprise plans. For values, see [Resolution Routes and Corresponding Code Enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set DNS record resolution route. If not specified, it defaults to Default, which means the default parsing route and takes effect in all regions.

-Resolution line configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
- Route parsing line configuration is applicable only to the standard and enterprise plans. For values, see [Resolution Routes and Corresponding Code Enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
     * @param Location DNS record resolution route. If not specified, it defaults to Default, which means the default parsing route and takes effect in all regions.

-Resolution line configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.
- Route parsing line configuration is applicable only to the standard and enterprise plans. For values, see [Resolution Routes and Corresponding Code Enumeration](https://www.tencentcloud.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Cache time. You can specify a range of 60–86400. A smaller value means modification records take effect faster in each region. Default value: 300. Unit: seconds. 
     * @return TTL Cache time. You can specify a range of 60–86400. A smaller value means modification records take effect faster in each region. Default value: 300. Unit: seconds.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Cache time. You can specify a range of 60–86400. A smaller value means modification records take effect faster in each region. Default value: 300. Unit: seconds.
     * @param TTL Cache time. You can specify a range of 60–86400. A smaller value means modification records take effect faster in each region. Default value: 300. Unit: seconds.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get DNS record weight. Users can specify a value range of -1 to 100. When set to 0, it means no parsing. If not specified, it defaults to -1, indicating no weight is set. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>Note: For different DNS records under the same subdomain and resolution route, set weight for all of them simultaneously or leave all of them unset. 
     * @return Weight DNS record weight. Users can specify a value range of -1 to 100. When set to 0, it means no parsing. If not specified, it defaults to -1, indicating no weight is set. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>Note: For different DNS records under the same subdomain and resolution route, set weight for all of them simultaneously or leave all of them unset.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set DNS record weight. Users can specify a value range of -1 to 100. When set to 0, it means no parsing. If not specified, it defaults to -1, indicating no weight is set. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>Note: For different DNS records under the same subdomain and resolution route, set weight for all of them simultaneously or leave all of them unset.
     * @param Weight DNS record weight. Users can specify a value range of -1 to 100. When set to 0, it means no parsing. If not specified, it defaults to -1, indicating no weight is set. Weight configuration is applicable only when Type (DNS record type) is A, AAAA, or CNAME.<br>Note: For different DNS records under the same subdomain and resolution route, set weight for all of them simultaneously or leave all of them unset.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX record priority. This parameter is valid only when Type (DNS record type) is MX. A smaller value indicates higher priority. You can specify a value from 0 to 50. If not specified, the default is 0. 
     * @return Priority MX record priority. This parameter is valid only when Type (DNS record type) is MX. A smaller value indicates higher priority. You can specify a value from 0 to 50. If not specified, the default is 0.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set MX record priority. This parameter is valid only when Type (DNS record type) is MX. A smaller value indicates higher priority. You can specify a value from 0 to 50. If not specified, the default is 0.
     * @param Priority MX record priority. This parameter is valid only when Type (DNS record type) is MX. A smaller value indicates higher priority. You can specify a value from 0 to 50. If not specified, the default is 0.
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

