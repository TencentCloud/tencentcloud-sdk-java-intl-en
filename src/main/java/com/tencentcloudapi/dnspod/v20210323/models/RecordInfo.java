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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel {

    /**
    * Record ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Subdomain (host record).
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Record type. For more information, see the `DescribeRecordType` API.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * Split zone ID of the DNS record. For more information, see the `DescribeRecordLineList` API.
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * Record value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Record weight.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX record value. It is 0 by default for non-MX records.
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * TTL value of the record.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Record status. Valid values: 0 (disabled); 1 (enabled).
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * D-Monitor status of the record.
"Ok" : The server is normal.
"Warn" : There is an alarm on this record, and the server returns 4XX.
"Down" : The server is down.
"" : D-Monitor is disabled for this record.
    */
    @SerializedName("MonitorStatus")
    @Expose
    private String MonitorStatus;

    /**
    * Record remarks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Last update time of the record.
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * Domain ID.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get Record ID. 
     * @return Id Record ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Record ID.
     * @param Id Record ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Subdomain (host record). 
     * @return SubDomain Subdomain (host record).
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Subdomain (host record).
     * @param SubDomain Subdomain (host record).
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Record type. For more information, see the `DescribeRecordType` API. 
     * @return RecordType Record type. For more information, see the `DescribeRecordType` API.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type. For more information, see the `DescribeRecordType` API.
     * @param RecordType Record type. For more information, see the `DescribeRecordType` API.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API. 
     * @return RecordLine Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
     * @param RecordLine Split zone of the DNS record. For more information, see the `DescribeRecordLineList` API.
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get Split zone ID of the DNS record. For more information, see the `DescribeRecordLineList` API. 
     * @return RecordLineId Split zone ID of the DNS record. For more information, see the `DescribeRecordLineList` API.
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set Split zone ID of the DNS record. For more information, see the `DescribeRecordLineList` API.
     * @param RecordLineId Split zone ID of the DNS record. For more information, see the `DescribeRecordLineList` API.
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get Record value. 
     * @return Value Record value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Record value.
     * @param Value Record value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Record weight.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Record weight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Record weight.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Record weight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX record value. It is 0 by default for non-MX records. 
     * @return MX MX record value. It is 0 by default for non-MX records.
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX record value. It is 0 by default for non-MX records.
     * @param MX MX record value. It is 0 by default for non-MX records.
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get TTL value of the record. 
     * @return TTL TTL value of the record.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL value of the record.
     * @param TTL TTL value of the record.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Record status. Valid values: 0 (disabled); 1 (enabled). 
     * @return Enabled Record status. Valid values: 0 (disabled); 1 (enabled).
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Record status. Valid values: 0 (disabled); 1 (enabled).
     * @param Enabled Record status. Valid values: 0 (disabled); 1 (enabled).
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get D-Monitor status of the record.
"Ok" : The server is normal.
"Warn" : There is an alarm on this record, and the server returns 4XX.
"Down" : The server is down.
"" : D-Monitor is disabled for this record. 
     * @return MonitorStatus D-Monitor status of the record.
"Ok" : The server is normal.
"Warn" : There is an alarm on this record, and the server returns 4XX.
"Down" : The server is down.
"" : D-Monitor is disabled for this record.
     */
    public String getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set D-Monitor status of the record.
"Ok" : The server is normal.
"Warn" : There is an alarm on this record, and the server returns 4XX.
"Down" : The server is down.
"" : D-Monitor is disabled for this record.
     * @param MonitorStatus D-Monitor status of the record.
"Ok" : The server is normal.
"Warn" : There is an alarm on this record, and the server returns 4XX.
"Down" : The server is down.
"" : D-Monitor is disabled for this record.
     */
    public void setMonitorStatus(String MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get Record remarks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Record remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Record remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Record remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Last update time of the record. 
     * @return UpdatedOn Last update time of the record.
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set Last update time of the record.
     * @param UpdatedOn Last update time of the record.
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get Domain ID. 
     * @return DomainId Domain ID.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID.
     * @param DomainId Domain ID.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
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
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new String(source.MonitorStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

