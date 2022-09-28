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

public class DnsRecord extends AbstractModel{

    /**
    * The record ID.
    */
    @SerializedName("DnsRecordId")
    @Expose
    private String DnsRecordId;

    /**
    * The DNS record type. Values:
<li>`A`: Point a domain name to an IPv4 address, such as 8.8.8.8.</li>
<li>`AAAA`: Point a domain name to an IPv6 address.</li>
<li>`MX`: It is used for email servers. The record value and priority parameters are provided by email service providers. If there are multiple MX records, the lower the priority value, the higher the priority.</li>
<li>`CNAME`: Point a domain name to another domain name that can be resolved to an IP address.</li>
<li>`TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).</li>
<li>`NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.</li>
<li>`CAA`: Specify CAs to issue certificates for sites.</li>
<li>`SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.</li>
    */
    @SerializedName("DnsRecordType")
    @Expose
    private String DnsRecordType;

    /**
    * The record name.
    */
    @SerializedName("DnsRecordName")
    @Expose
    private String DnsRecordName;

    /**
    * The record value.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * TTL (in seconds). The smaller the value, the faster the record changes take effect.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * The MX record priority. The smaller the value, the higher the priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * The creation time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The modification time.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * The lock status of the domain name.
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * The DNS record status. Values:
<li>`active`: Activated</li>
<li>`pending`: Deactivated</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * The service used by the domain name. Values:
<li>`lb`: Load balancing</li>
<li>`security`: Security protection</li>
<li>`l4`: L4 proxy</li>
    */
    @SerializedName("DomainStatus")
    @Expose
    private String [] DomainStatus;

    /**
     * Get The record ID. 
     * @return DnsRecordId The record ID.
     */
    public String getDnsRecordId() {
        return this.DnsRecordId;
    }

    /**
     * Set The record ID.
     * @param DnsRecordId The record ID.
     */
    public void setDnsRecordId(String DnsRecordId) {
        this.DnsRecordId = DnsRecordId;
    }

    /**
     * Get The DNS record type. Values:
<li>`A`: Point a domain name to an IPv4 address, such as 8.8.8.8.</li>
<li>`AAAA`: Point a domain name to an IPv6 address.</li>
<li>`MX`: It is used for email servers. The record value and priority parameters are provided by email service providers. If there are multiple MX records, the lower the priority value, the higher the priority.</li>
<li>`CNAME`: Point a domain name to another domain name that can be resolved to an IP address.</li>
<li>`TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).</li>
<li>`NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.</li>
<li>`CAA`: Specify CAs to issue certificates for sites.</li>
<li>`SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.</li> 
     * @return DnsRecordType The DNS record type. Values:
<li>`A`: Point a domain name to an IPv4 address, such as 8.8.8.8.</li>
<li>`AAAA`: Point a domain name to an IPv6 address.</li>
<li>`MX`: It is used for email servers. The record value and priority parameters are provided by email service providers. If there are multiple MX records, the lower the priority value, the higher the priority.</li>
<li>`CNAME`: Point a domain name to another domain name that can be resolved to an IP address.</li>
<li>`TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).</li>
<li>`NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.</li>
<li>`CAA`: Specify CAs to issue certificates for sites.</li>
<li>`SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.</li>
     */
    public String getDnsRecordType() {
        return this.DnsRecordType;
    }

    /**
     * Set The DNS record type. Values:
<li>`A`: Point a domain name to an IPv4 address, such as 8.8.8.8.</li>
<li>`AAAA`: Point a domain name to an IPv6 address.</li>
<li>`MX`: It is used for email servers. The record value and priority parameters are provided by email service providers. If there are multiple MX records, the lower the priority value, the higher the priority.</li>
<li>`CNAME`: Point a domain name to another domain name that can be resolved to an IP address.</li>
<li>`TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).</li>
<li>`NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.</li>
<li>`CAA`: Specify CAs to issue certificates for sites.</li>
<li>`SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.</li>
     * @param DnsRecordType The DNS record type. Values:
<li>`A`: Point a domain name to an IPv4 address, such as 8.8.8.8.</li>
<li>`AAAA`: Point a domain name to an IPv6 address.</li>
<li>`MX`: It is used for email servers. The record value and priority parameters are provided by email service providers. If there are multiple MX records, the lower the priority value, the higher the priority.</li>
<li>`CNAME`: Point a domain name to another domain name that can be resolved to an IP address.</li>
<li>`TXT`: Identify and describe a domain name. It is usually used for domain verification and as SPF records (for anti-spam).</li>
<li>`NS`: If you need to authorize a subdomain name to another DNS service provider for DNS resolution, you need to add an NS record. You cannot add an NS record for a root domain name.</li>
<li>`CAA`: Specify CAs to issue certificates for sites.</li>
<li>`SRV`: Identify a service used by a server. It is commonly used in Microsoft directory management.</li>
     */
    public void setDnsRecordType(String DnsRecordType) {
        this.DnsRecordType = DnsRecordType;
    }

    /**
     * Get The record name. 
     * @return DnsRecordName The record name.
     */
    public String getDnsRecordName() {
        return this.DnsRecordName;
    }

    /**
     * Set The record name.
     * @param DnsRecordName The record name.
     */
    public void setDnsRecordName(String DnsRecordName) {
        this.DnsRecordName = DnsRecordName;
    }

    /**
     * Get The record value. 
     * @return Content The record value.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set The record value.
     * @param Content The record value.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li> 
     * @return Mode The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
     * @param Mode The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get TTL (in seconds). The smaller the value, the faster the record changes take effect. 
     * @return TTL TTL (in seconds). The smaller the value, the faster the record changes take effect.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL (in seconds). The smaller the value, the faster the record changes take effect.
     * @param TTL TTL (in seconds). The smaller the value, the faster the record changes take effect.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get The MX record priority. The smaller the value, the higher the priority. 
     * @return Priority The MX record priority. The smaller the value, the higher the priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set The MX record priority. The smaller the value, the higher the priority.
     * @param Priority The MX record priority. The smaller the value, the higher the priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get The creation time. 
     * @return CreatedOn The creation time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The creation time.
     * @param CreatedOn The creation time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The modification time. 
     * @return ModifiedOn The modification time.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set The modification time.
     * @param ModifiedOn The modification time.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get The lock status of the domain name. 
     * @return Locked The lock status of the domain name.
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set The lock status of the domain name.
     * @param Locked The lock status of the domain name.
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
    }

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get The DNS record status. Values:
<li>`active`: Activated</li>
<li>`pending`: Deactivated</li> 
     * @return Status The DNS record status. Values:
<li>`active`: Activated</li>
<li>`pending`: Deactivated</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The DNS record status. Values:
<li>`active`: Activated</li>
<li>`pending`: Deactivated</li>
     * @param Status The DNS record status. Values:
<li>`active`: Activated</li>
<li>`pending`: Deactivated</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cname The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cname The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get The service used by the domain name. Values:
<li>`lb`: Load balancing</li>
<li>`security`: Security protection</li>
<li>`l4`: L4 proxy</li> 
     * @return DomainStatus The service used by the domain name. Values:
<li>`lb`: Load balancing</li>
<li>`security`: Security protection</li>
<li>`l4`: L4 proxy</li>
     */
    public String [] getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set The service used by the domain name. Values:
<li>`lb`: Load balancing</li>
<li>`security`: Security protection</li>
<li>`l4`: L4 proxy</li>
     * @param DomainStatus The service used by the domain name. Values:
<li>`lb`: Load balancing</li>
<li>`security`: Security protection</li>
<li>`l4`: L4 proxy</li>
     */
    public void setDomainStatus(String [] DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    public DnsRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsRecord(DnsRecord source) {
        if (source.DnsRecordId != null) {
            this.DnsRecordId = new String(source.DnsRecordId);
        }
        if (source.DnsRecordType != null) {
            this.DnsRecordType = new String(source.DnsRecordType);
        }
        if (source.DnsRecordName != null) {
            this.DnsRecordName = new String(source.DnsRecordName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.Locked != null) {
            this.Locked = new Boolean(source.Locked);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String[source.DomainStatus.length];
            for (int i = 0; i < source.DomainStatus.length; i++) {
                this.DomainStatus[i] = new String(source.DomainStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsRecordId", this.DnsRecordId);
        this.setParamSimple(map, prefix + "DnsRecordType", this.DnsRecordType);
        this.setParamSimple(map, prefix + "DnsRecordName", this.DnsRecordName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamArraySimple(map, prefix + "DomainStatus.", this.DomainStatus);

    }
}

