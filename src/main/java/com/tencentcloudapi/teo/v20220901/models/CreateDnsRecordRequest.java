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
    * Zone id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * DNS record name. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNS record type. valid values are: <li>a: points the domain name to an external ipv4 address, such as 8.8.8.8;</li><li>aaaa: points the domain name to an external ipv6 address;</li><li>mx: used for email servers. when there are multiple mx records, the lower the priority value, the higher the priority;</li><li>cname: points the domain name to another domain name, which then resolves to the final ip address;</li><li>txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);</li><li>ns: if you need to delegate the subdomain to another dns service provider for resolution, you need to add an ns record. the root domain cannot add ns records;</li><li>caa: specifies the ca that can issue certificates for this site;</li><li>srv: identifies a server using a service, commonly used in microsoft's directory management.</li>.
Different record types, such as srv and caa records, have different requirements for host record names and record value formats. for detailed descriptions and format examples of each record type, please refer to: [introduction to dns record types](https://intl.cloud.tencent.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * DNS record content. fill in the corresponding content according to the type value. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * DNS record resolution route. if not specified, the default is default, which means the default resolution route and is effective in all regions.

- resolution route configuration is only applicable when type (dns record type) is a, aaaa, or cname.
- resolution route configuration is only applicable to standard version and enterprise edition packages. for valid values, please refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Cache time. users can specify a value range of 60-86400. the smaller the value, the faster the modification records will take effect in all regions. default value: 300. unit: seconds.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * DNS record weight. users can specify a value range of -1 to 100. a value of 0 means no resolution. if not specified, the default is -1, which means no weight is set. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.<br>note: for the same subdomain, different dns records with the same resolution route should either all have weights set or none have weights set.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX record priority, which takes effect only when type (dns record type) is mx. the smaller the value, the higher the priority. users can specify a value range of 0–50. the default value is 0 if not specified.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

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
     * Get DNS record name. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input. 
     * @return Name DNS record name. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set DNS record name. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
     * @param Name DNS record name. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNS record type. valid values are: <li>a: points the domain name to an external ipv4 address, such as 8.8.8.8;</li><li>aaaa: points the domain name to an external ipv6 address;</li><li>mx: used for email servers. when there are multiple mx records, the lower the priority value, the higher the priority;</li><li>cname: points the domain name to another domain name, which then resolves to the final ip address;</li><li>txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);</li><li>ns: if you need to delegate the subdomain to another dns service provider for resolution, you need to add an ns record. the root domain cannot add ns records;</li><li>caa: specifies the ca that can issue certificates for this site;</li><li>srv: identifies a server using a service, commonly used in microsoft's directory management.</li>.
Different record types, such as srv and caa records, have different requirements for host record names and record value formats. for detailed descriptions and format examples of each record type, please refer to: [introduction to dns record types](https://intl.cloud.tencent.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e). 
     * @return Type DNS record type. valid values are: <li>a: points the domain name to an external ipv4 address, such as 8.8.8.8;</li><li>aaaa: points the domain name to an external ipv6 address;</li><li>mx: used for email servers. when there are multiple mx records, the lower the priority value, the higher the priority;</li><li>cname: points the domain name to another domain name, which then resolves to the final ip address;</li><li>txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);</li><li>ns: if you need to delegate the subdomain to another dns service provider for resolution, you need to add an ns record. the root domain cannot add ns records;</li><li>caa: specifies the ca that can issue certificates for this site;</li><li>srv: identifies a server using a service, commonly used in microsoft's directory management.</li>.
Different record types, such as srv and caa records, have different requirements for host record names and record value formats. for detailed descriptions and format examples of each record type, please refer to: [introduction to dns record types](https://intl.cloud.tencent.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DNS record type. valid values are: <li>a: points the domain name to an external ipv4 address, such as 8.8.8.8;</li><li>aaaa: points the domain name to an external ipv6 address;</li><li>mx: used for email servers. when there are multiple mx records, the lower the priority value, the higher the priority;</li><li>cname: points the domain name to another domain name, which then resolves to the final ip address;</li><li>txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);</li><li>ns: if you need to delegate the subdomain to another dns service provider for resolution, you need to add an ns record. the root domain cannot add ns records;</li><li>caa: specifies the ca that can issue certificates for this site;</li><li>srv: identifies a server using a service, commonly used in microsoft's directory management.</li>.
Different record types, such as srv and caa records, have different requirements for host record names and record value formats. for detailed descriptions and format examples of each record type, please refer to: [introduction to dns record types](https://intl.cloud.tencent.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     * @param Type DNS record type. valid values are: <li>a: points the domain name to an external ipv4 address, such as 8.8.8.8;</li><li>aaaa: points the domain name to an external ipv6 address;</li><li>mx: used for email servers. when there are multiple mx records, the lower the priority value, the higher the priority;</li><li>cname: points the domain name to another domain name, which then resolves to the final ip address;</li><li>txt: identifies and describes the domain name, commonly used for domain verification and spf records (anti-spam);</li><li>ns: if you need to delegate the subdomain to another dns service provider for resolution, you need to add an ns record. the root domain cannot add ns records;</li><li>caa: specifies the ca that can issue certificates for this site;</li><li>srv: identifies a server using a service, commonly used in microsoft's directory management.</li>.
Different record types, such as srv and caa records, have different requirements for host record names and record value formats. for detailed descriptions and format examples of each record type, please refer to: [introduction to dns record types](https://intl.cloud.tencent.com/document/product/1552/90453?from_cn_redirect=1#2f681022-91ab-4a9e-ac3d-0a6c454d954e).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get DNS record content. fill in the corresponding content according to the type value. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input. 
     * @return Content DNS record content. fill in the corresponding content according to the type value. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set DNS record content. fill in the corresponding content according to the type value. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
     * @param Content DNS record content. fill in the corresponding content according to the type value. if the domain name is in chinese, korean, or japanese, it needs to be converted to punycode before input.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get DNS record resolution route. if not specified, the default is default, which means the default resolution route and is effective in all regions.

- resolution route configuration is only applicable when type (dns record type) is a, aaaa, or cname.
- resolution route configuration is only applicable to standard version and enterprise edition packages. for valid values, please refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1). 
     * @return Location DNS record resolution route. if not specified, the default is default, which means the default resolution route and is effective in all regions.

- resolution route configuration is only applicable when type (dns record type) is a, aaaa, or cname.
- resolution route configuration is only applicable to standard version and enterprise edition packages. for valid values, please refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set DNS record resolution route. if not specified, the default is default, which means the default resolution route and is effective in all regions.

- resolution route configuration is only applicable when type (dns record type) is a, aaaa, or cname.
- resolution route configuration is only applicable to standard version and enterprise edition packages. for valid values, please refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
     * @param Location DNS record resolution route. if not specified, the default is default, which means the default resolution route and is effective in all regions.

- resolution route configuration is only applicable when type (dns record type) is a, aaaa, or cname.
- resolution route configuration is only applicable to standard version and enterprise edition packages. for valid values, please refer to: [resolution routes and corresponding code enumeration](https://intl.cloud.tencent.com/document/product/1552/112542?from_cn_redirect=1).
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Cache time. users can specify a value range of 60-86400. the smaller the value, the faster the modification records will take effect in all regions. default value: 300. unit: seconds. 
     * @return TTL Cache time. users can specify a value range of 60-86400. the smaller the value, the faster the modification records will take effect in all regions. default value: 300. unit: seconds.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Cache time. users can specify a value range of 60-86400. the smaller the value, the faster the modification records will take effect in all regions. default value: 300. unit: seconds.
     * @param TTL Cache time. users can specify a value range of 60-86400. the smaller the value, the faster the modification records will take effect in all regions. default value: 300. unit: seconds.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get DNS record weight. users can specify a value range of -1 to 100. a value of 0 means no resolution. if not specified, the default is -1, which means no weight is set. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.<br>note: for the same subdomain, different dns records with the same resolution route should either all have weights set or none have weights set. 
     * @return Weight DNS record weight. users can specify a value range of -1 to 100. a value of 0 means no resolution. if not specified, the default is -1, which means no weight is set. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.<br>note: for the same subdomain, different dns records with the same resolution route should either all have weights set or none have weights set.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set DNS record weight. users can specify a value range of -1 to 100. a value of 0 means no resolution. if not specified, the default is -1, which means no weight is set. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.<br>note: for the same subdomain, different dns records with the same resolution route should either all have weights set or none have weights set.
     * @param Weight DNS record weight. users can specify a value range of -1 to 100. a value of 0 means no resolution. if not specified, the default is -1, which means no weight is set. weight configuration is only applicable when type (dns record type) is a, aaaa, or cname.<br>note: for the same subdomain, different dns records with the same resolution route should either all have weights set or none have weights set.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX record priority, which takes effect only when type (dns record type) is mx. the smaller the value, the higher the priority. users can specify a value range of 0–50. the default value is 0 if not specified. 
     * @return Priority MX record priority, which takes effect only when type (dns record type) is mx. the smaller the value, the higher the priority. users can specify a value range of 0–50. the default value is 0 if not specified.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set MX record priority, which takes effect only when type (dns record type) is mx. the smaller the value, the higher the priority. users can specify a value range of 0–50. the default value is 0 if not specified.
     * @param Priority MX record priority, which takes effect only when type (dns record type) is mx. the smaller the value, the higher the priority. users can specify a value range of 0–50. the default value is 0 if not specified.
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

