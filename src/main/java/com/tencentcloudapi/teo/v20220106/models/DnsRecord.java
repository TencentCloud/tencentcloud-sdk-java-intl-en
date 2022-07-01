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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnsRecord extends AbstractModel{

    /**
    * Record ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Record type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Host record
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Record value
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Proxy mode
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * TTL value
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * Priority
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Creation time
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Modification time
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * Domain name lock
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Resolution status
`active`: Activated
`pending`: Not activated
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Specifies whether to enable load balancing, layer-4 proxy, or security protection for the domain name.
- `lb`: Load balancing.
- `security`: Security protection.
- `l4`: Layer-4 proxy.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DomainStatus")
    @Expose
    private String [] DomainStatus;

    /**
     * Get Record ID 
     * @return Id Record ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Record ID
     * @param Id Record ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Record type 
     * @return Type Record type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Record type
     * @param Type Record type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Host record 
     * @return Name Host record
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Host record
     * @param Name Host record
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Record value 
     * @return Content Record value
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Record value
     * @param Content Record value
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Proxy mode 
     * @return Mode Proxy mode
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Proxy mode
     * @param Mode Proxy mode
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get TTL value 
     * @return Ttl TTL value
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set TTL value
     * @param Ttl TTL value
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get Priority
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Priority Priority
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Priority Priority
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Creation time 
     * @return CreatedOn Creation time
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time
     * @param CreatedOn Creation time
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Modification time 
     * @return ModifiedOn Modification time
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Modification time
     * @param ModifiedOn Modification time
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get Domain name lock 
     * @return Locked Domain name lock
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set Domain name lock
     * @param Locked Domain name lock
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
    }

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Site name 
     * @return ZoneName Site name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name
     * @param ZoneName Site name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Resolution status
`active`: Activated
`pending`: Not activated 
     * @return Status Resolution status
`active`: Activated
`pending`: Not activated
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Resolution status
`active`: Activated
`pending`: Not activated
     * @param Status Resolution status
`active`: Activated
`pending`: Not activated
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Cname CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Cname CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Specifies whether to enable load balancing, layer-4 proxy, or security protection for the domain name.
- `lb`: Load balancing.
- `security`: Security protection.
- `l4`: Layer-4 proxy.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DomainStatus Specifies whether to enable load balancing, layer-4 proxy, or security protection for the domain name.
- `lb`: Load balancing.
- `security`: Security protection.
- `l4`: Layer-4 proxy.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set Specifies whether to enable load balancing, layer-4 proxy, or security protection for the domain name.
- `lb`: Load balancing.
- `security`: Security protection.
- `l4`: Layer-4 proxy.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DomainStatus Specifies whether to enable load balancing, layer-4 proxy, or security protection for the domain name.
- `lb`: Load balancing.
- `security`: Security protection.
- `l4`: Layer-4 proxy.
Note: This field may return `null`, indicating that no valid value can be obtained.
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
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

