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

public class RecordListItem extends AbstractModel {

    /**
    * The record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * The record value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * The record status. Valid values: `ENABLE` (enabled), `DISABLE` (disabled).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The update time.
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * The host name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The record split zone.
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * The split zone ID.
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * The record type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The record weight, which is required for round-robin DNS records.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * The monitoring status of the record. Valid values: `OK` (normal), `WARN` (warning), and `DOWN` (downtime). It is empty if no monitoring is set or the monitoring is suspended.
    */
    @SerializedName("MonitorStatus")
    @Expose
    private String MonitorStatus;

    /**
    * The record remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The record cache time.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * The MX value, applicable to the MX record only.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * Whether it is a default NS record.
    */
    @SerializedName("DefaultNS")
    @Expose
    private Boolean DefaultNS;

    /**
     * Get The record ID. 
     * @return RecordId The record ID.
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set The record ID.
     * @param RecordId The record ID.
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get The record value. 
     * @return Value The record value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set The record value.
     * @param Value The record value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get The record status. Valid values: `ENABLE` (enabled), `DISABLE` (disabled). 
     * @return Status The record status. Valid values: `ENABLE` (enabled), `DISABLE` (disabled).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The record status. Valid values: `ENABLE` (enabled), `DISABLE` (disabled).
     * @param Status The record status. Valid values: `ENABLE` (enabled), `DISABLE` (disabled).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The update time. 
     * @return UpdatedOn The update time.
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set The update time.
     * @param UpdatedOn The update time.
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get The host name. 
     * @return Name The host name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The host name.
     * @param Name The host name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The record split zone. 
     * @return Line The record split zone.
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set The record split zone.
     * @param Line The record split zone.
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get The split zone ID. 
     * @return LineId The split zone ID.
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set The split zone ID.
     * @param LineId The split zone ID.
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get The record type. 
     * @return Type The record type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The record type.
     * @param Type The record type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The record weight, which is required for round-robin DNS records.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight The record weight, which is required for round-robin DNS records.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set The record weight, which is required for round-robin DNS records.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight The record weight, which is required for round-robin DNS records.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get The monitoring status of the record. Valid values: `OK` (normal), `WARN` (warning), and `DOWN` (downtime). It is empty if no monitoring is set or the monitoring is suspended. 
     * @return MonitorStatus The monitoring status of the record. Valid values: `OK` (normal), `WARN` (warning), and `DOWN` (downtime). It is empty if no monitoring is set or the monitoring is suspended.
     */
    public String getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set The monitoring status of the record. Valid values: `OK` (normal), `WARN` (warning), and `DOWN` (downtime). It is empty if no monitoring is set or the monitoring is suspended.
     * @param MonitorStatus The monitoring status of the record. Valid values: `OK` (normal), `WARN` (warning), and `DOWN` (downtime). It is empty if no monitoring is set or the monitoring is suspended.
     */
    public void setMonitorStatus(String MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get The record remarks. 
     * @return Remark The record remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set The record remarks.
     * @param Remark The record remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get The record cache time. 
     * @return TTL The record cache time.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set The record cache time.
     * @param TTL The record cache time.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get The MX value, applicable to the MX record only.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MX The MX value, applicable to the MX record only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set The MX value, applicable to the MX record only.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MX The MX value, applicable to the MX record only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get Whether it is a default NS record. 
     * @return DefaultNS Whether it is a default NS record.
     */
    public Boolean getDefaultNS() {
        return this.DefaultNS;
    }

    /**
     * Set Whether it is a default NS record.
     * @param DefaultNS Whether it is a default NS record.
     */
    public void setDefaultNS(Boolean DefaultNS) {
        this.DefaultNS = DefaultNS;
    }

    public RecordListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordListItem(RecordListItem source) {
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new String(source.MonitorStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.DefaultNS != null) {
            this.DefaultNS = new Boolean(source.DefaultNS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "DefaultNS", this.DefaultNS);

    }
}

