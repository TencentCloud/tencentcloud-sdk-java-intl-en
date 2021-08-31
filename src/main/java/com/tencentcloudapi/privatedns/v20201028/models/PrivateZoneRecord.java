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

public class PrivateZoneRecord extends AbstractModel{

    /**
    * Record ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Private domain ID: zone-xxxxxxxx
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Subdomain
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Record type. Valid values: "A", "AAAA", "CNAME", "MX", "TXT", "PTR"
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Record value
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * Record cache time. The smaller the value, the faster the record will take effect. Value range: 1–86400s. Default value: 600
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * Record status: ENABLED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Record weight. Value range: 1–100
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Record creation time
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Record update time
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * Additional information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get Record ID 
     * @return RecordId Record ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Record ID
     * @param RecordId Record ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

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
     * Get Subdomain 
     * @return SubDomain Subdomain
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Subdomain
     * @param SubDomain Subdomain
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Record type. Valid values: "A", "AAAA", "CNAME", "MX", "TXT", "PTR" 
     * @return RecordType Record type. Valid values: "A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type. Valid values: "A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     * @param RecordType Record type. Valid values: "A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Record value 
     * @return RecordValue Record value
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set Record value
     * @param RecordValue Record value
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    /**
     * Get Record cache time. The smaller the value, the faster the record will take effect. Value range: 1–86400s. Default value: 600 
     * @return TTL Record cache time. The smaller the value, the faster the record will take effect. Value range: 1–86400s. Default value: 600
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Record cache time. The smaller the value, the faster the record will take effect. Value range: 1–86400s. Default value: 600
     * @param TTL Record cache time. The smaller the value, the faster the record will take effect. Value range: 1–86400s. Default value: 600
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MX MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MX MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get Record status: ENABLED 
     * @return Status Record status: ENABLED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Record status: ENABLED
     * @param Status Record status: ENABLED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Record weight. Value range: 1–100
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Weight Record weight. Value range: 1–100
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Record weight. Value range: 1–100
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Weight Record weight. Value range: 1–100
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Record creation time 
     * @return CreatedOn Record creation time
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Record creation time
     * @param CreatedOn Record creation time
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Record update time 
     * @return UpdatedOn Record update time
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set Record update time
     * @param UpdatedOn Record update time
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get Additional information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Extra Additional information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set Additional information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Extra Additional information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public PrivateZoneRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateZoneRecord(PrivateZoneRecord source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

