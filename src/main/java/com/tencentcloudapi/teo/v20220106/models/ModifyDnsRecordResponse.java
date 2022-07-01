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

public class ModifyDnsRecordResponse extends AbstractModel{

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
    * Record name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Record content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Proxy mode
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Resolution status
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
    * Whether the DNS record is locked
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

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
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Record name 
     * @return Name Record name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Record name
     * @param Name Record name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Record content 
     * @return Content Record content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Record content
     * @param Content Record content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get  
     * @return Ttl 
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set 
     * @param Ttl 
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get Priority 
     * @return Priority Priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority
     * @param Priority Priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
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
     * Get Resolution status 
     * @return Status Resolution status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Resolution status
     * @param Status Resolution status
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
     * Get Whether the DNS record is locked 
     * @return Locked Whether the DNS record is locked
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set Whether the DNS record is locked
     * @param Locked Whether the DNS record is locked
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
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
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyDnsRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDnsRecordResponse(ModifyDnsRecordResponse source) {
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
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Locked != null) {
            this.Locked = new Boolean(source.Locked);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

