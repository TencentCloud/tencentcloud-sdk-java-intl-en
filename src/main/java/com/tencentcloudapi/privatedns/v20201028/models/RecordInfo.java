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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel {

    /**
    * Record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Private domain ID, which is in zone-xxxxxxxx format.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Subdomain name.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Record type. Valid values: A, AAAA, CNAME, MX, TXT, and PTR.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Record value.
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * Record cache time. The smaller the value, the faster the record will take effect. Value range: 1-86,400s. Default value: 600.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * MX priority, which is required when the record type is mx. valid values: 5, 10, 15, 20, 30, 40, and 50.
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * Record weight. valid values: 1–100.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Record creation time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Record update time.
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 0 suspend 1 enable.
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Record ID. 
     * @return RecordId Record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Record ID.
     * @param RecordId Record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Private domain ID, which is in zone-xxxxxxxx format. 
     * @return ZoneId Private domain ID, which is in zone-xxxxxxxx format.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID, which is in zone-xxxxxxxx format.
     * @param ZoneId Private domain ID, which is in zone-xxxxxxxx format.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Subdomain name. 
     * @return SubDomain Subdomain name.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Subdomain name.
     * @param SubDomain Subdomain name.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Record type. Valid values: A, AAAA, CNAME, MX, TXT, and PTR. 
     * @return RecordType Record type. Valid values: A, AAAA, CNAME, MX, TXT, and PTR.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type. Valid values: A, AAAA, CNAME, MX, TXT, and PTR.
     * @param RecordType Record type. Valid values: A, AAAA, CNAME, MX, TXT, and PTR.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Record value. 
     * @return RecordValue Record value.
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set Record value.
     * @param RecordValue Record value.
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    /**
     * Get Record cache time. The smaller the value, the faster the record will take effect. Value range: 1-86,400s. Default value: 600. 
     * @return TTL Record cache time. The smaller the value, the faster the record will take effect. Value range: 1-86,400s. Default value: 600.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Record cache time. The smaller the value, the faster the record will take effect. Value range: 1-86,400s. Default value: 600.
     * @param TTL Record cache time. The smaller the value, the faster the record will take effect. Value range: 1-86,400s. Default value: 600.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get MX priority, which is required when the record type is mx. valid values: 5, 10, 15, 20, 30, 40, and 50. 
     * @return MX MX priority, which is required when the record type is mx. valid values: 5, 10, 15, 20, 30, 40, and 50.
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX priority, which is required when the record type is mx. valid values: 5, 10, 15, 20, 30, 40, and 50.
     * @param MX MX priority, which is required when the record type is mx. valid values: 5, 10, 15, 20, 30, 40, and 50.
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get Record weight. valid values: 1–100. 
     * @return Weight Record weight. valid values: 1–100.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Record weight. valid values: 1–100.
     * @param Weight Record weight. valid values: 1–100.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Record creation time. 
     * @return CreatedOn Record creation time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Record creation time.
     * @param CreatedOn Record creation time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Record update time. 
     * @return UpdatedOn Record update time.
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set Record update time.
     * @param UpdatedOn Record update time.
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 0 suspend 1 enable. 
     * @return Enabled 0 suspend 1 enable.
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 0 suspend 1 enable.
     * @param Enabled 0 suspend 1 enable.
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
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
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

