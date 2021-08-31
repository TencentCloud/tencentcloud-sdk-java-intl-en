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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateZone extends AbstractModel{

    /**
    * Private domain ID: zone-xxxxxxxx
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain name owner UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Private domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Creation time
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Modification time
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * Number of results
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * Remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * List of bound VPCs
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * Private domain status. Valid values: ENABLED (DNS enabled); SUSPEND (DNS paused); FROZEN (locked)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Subdomain recursive DNS status. Valid values: ENABLED, DISABLED
    */
    @SerializedName("DnsForwardStatus")
    @Expose
    private String DnsForwardStatus;

    /**
    * Set of tag key-value pairs
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Private domain ID: zone-xxxxxxxx 
     * @return ZoneId Private domain ID: zone-xxxxxxxx
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID: zone-xxxxxxxx
     * @param ZoneId Private domain ID: zone-xxxxxxxx
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Domain name owner UIN 
     * @return OwnerUin Domain name owner UIN
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Domain name owner UIN
     * @param OwnerUin Domain name owner UIN
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Private domain 
     * @return Domain Private domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Private domain
     * @param Domain Private domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * @return UpdatedOn Modification time
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set Modification time
     * @param UpdatedOn Modification time
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get Number of results 
     * @return RecordCount Number of results
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set Number of results
     * @param RecordCount Number of results
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get Remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get List of bound VPCs 
     * @return VpcSet List of bound VPCs
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set List of bound VPCs
     * @param VpcSet List of bound VPCs
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get Private domain status. Valid values: ENABLED (DNS enabled); SUSPEND (DNS paused); FROZEN (locked) 
     * @return Status Private domain status. Valid values: ENABLED (DNS enabled); SUSPEND (DNS paused); FROZEN (locked)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Private domain status. Valid values: ENABLED (DNS enabled); SUSPEND (DNS paused); FROZEN (locked)
     * @param Status Private domain status. Valid values: ENABLED (DNS enabled); SUSPEND (DNS paused); FROZEN (locked)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Subdomain recursive DNS status. Valid values: ENABLED, DISABLED 
     * @return DnsForwardStatus Subdomain recursive DNS status. Valid values: ENABLED, DISABLED
     */
    public String getDnsForwardStatus() {
        return this.DnsForwardStatus;
    }

    /**
     * Set Subdomain recursive DNS status. Valid values: ENABLED, DISABLED
     * @param DnsForwardStatus Subdomain recursive DNS status. Valid values: ENABLED, DISABLED
     */
    public void setDnsForwardStatus(String DnsForwardStatus) {
        this.DnsForwardStatus = DnsForwardStatus;
    }

    /**
     * Get Set of tag key-value pairs 
     * @return Tags Set of tag key-value pairs
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Set of tag key-value pairs
     * @param Tags Set of tag key-value pairs
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public PrivateZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateZone(PrivateZone source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DnsForwardStatus != null) {
            this.DnsForwardStatus = new String(source.DnsForwardStatus);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DnsForwardStatus", this.DnsForwardStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

