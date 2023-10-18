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

public class CreatePrivateZoneRecordRequest extends AbstractModel {

    /**
    * Private domain ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Record type. Valid values: "A", "AAAA", "CNAME", "MX", "TXT", "PTR"
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Subdomain, such as "www", "m", and "@"
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Record value, such as IP: 192.168.10.2, CNAME: cname.qcloud.com., and MX: mail.qcloud.com.
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * Record weight. Value range: 1–100
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * Record cache time. The smaller the value, the faster the record will take effect. Value range: 1–86400s. Default value: 600
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
     * Get Private domain ID 
     * @return ZoneId Private domain ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID
     * @param ZoneId Private domain ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get Subdomain, such as "www", "m", and "@" 
     * @return SubDomain Subdomain, such as "www", "m", and "@"
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Subdomain, such as "www", "m", and "@"
     * @param SubDomain Subdomain, such as "www", "m", and "@"
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Record value, such as IP: 192.168.10.2, CNAME: cname.qcloud.com., and MX: mail.qcloud.com. 
     * @return RecordValue Record value, such as IP: 192.168.10.2, CNAME: cname.qcloud.com., and MX: mail.qcloud.com.
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set Record value, such as IP: 192.168.10.2, CNAME: cname.qcloud.com., and MX: mail.qcloud.com.
     * @param RecordValue Record value, such as IP: 192.168.10.2, CNAME: cname.qcloud.com., and MX: mail.qcloud.com.
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    /**
     * Get Record weight. Value range: 1–100 
     * @return Weight Record weight. Value range: 1–100
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Record weight. Value range: 1–100
     * @param Weight Record weight. Value range: 1–100
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50 
     * @return MX MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
     * @param MX MX priority, which is required when the record type is MX. Valid values: 5, 10, 15, 20, 30, 40, 50
     */
    public void setMX(Long MX) {
        this.MX = MX;
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

    public CreatePrivateZoneRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrivateZoneRecordRequest(CreatePrivateZoneRecordRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);

    }
}

