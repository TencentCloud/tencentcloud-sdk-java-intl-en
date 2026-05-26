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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstanceInfo extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Enabled</p><p>Enumeration value:</p><ul><li>OFF: Off</li><li>ON: On</li></ul>
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * <p>Log storage validity period</p><p>Unit: day</p>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>Hot storage period</p><p>Unit: day</p>
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
    * <p>Cold storage period</p><p>Unit: day</p>
    */
    @SerializedName("ColdLogExpireDay")
    @Expose
    private Long ColdLogExpireDay;

    /**
    * <p>Hot storage size</p><p>Unit: MB</p>
    */
    @SerializedName("HotLogSize")
    @Expose
    private Float HotLogSize;

    /**
    * <p>Cold storage size</p><p>Unit: MB</p>
    */
    @SerializedName("ColdLogSize")
    @Expose
    private Float ColdLogSize;

    /**
    * <p>Start time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Delivery status</p>
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
    * <p>Shipping information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
    * <p>Instance information</p>
    */
    @SerializedName("InstanceInfo")
    @Expose
    private LogInstanceInfo InstanceInfo;

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Enabled</p><p>Enumeration value:</p><ul><li>OFF: Off</li><li>ON: On</li></ul> 
     * @return AuditStatus <p>Enabled</p><p>Enumeration value:</p><ul><li>OFF: Off</li><li>ON: On</li></ul>
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set <p>Enabled</p><p>Enumeration value:</p><ul><li>OFF: Off</li><li>ON: On</li></ul>
     * @param AuditStatus <p>Enabled</p><p>Enumeration value:</p><ul><li>OFF: Off</li><li>ON: On</li></ul>
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get <p>Log storage validity period</p><p>Unit: day</p> 
     * @return LogExpireDay <p>Log storage validity period</p><p>Unit: day</p>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>Log storage validity period</p><p>Unit: day</p>
     * @param LogExpireDay <p>Log storage validity period</p><p>Unit: day</p>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>Hot storage period</p><p>Unit: day</p> 
     * @return HotLogExpireDay <p>Hot storage period</p><p>Unit: day</p>
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set <p>Hot storage period</p><p>Unit: day</p>
     * @param HotLogExpireDay <p>Hot storage period</p><p>Unit: day</p>
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    /**
     * Get <p>Cold storage period</p><p>Unit: day</p> 
     * @return ColdLogExpireDay <p>Cold storage period</p><p>Unit: day</p>
     */
    public Long getColdLogExpireDay() {
        return this.ColdLogExpireDay;
    }

    /**
     * Set <p>Cold storage period</p><p>Unit: day</p>
     * @param ColdLogExpireDay <p>Cold storage period</p><p>Unit: day</p>
     */
    public void setColdLogExpireDay(Long ColdLogExpireDay) {
        this.ColdLogExpireDay = ColdLogExpireDay;
    }

    /**
     * Get <p>Hot storage size</p><p>Unit: MB</p> 
     * @return HotLogSize <p>Hot storage size</p><p>Unit: MB</p>
     */
    public Float getHotLogSize() {
        return this.HotLogSize;
    }

    /**
     * Set <p>Hot storage size</p><p>Unit: MB</p>
     * @param HotLogSize <p>Hot storage size</p><p>Unit: MB</p>
     */
    public void setHotLogSize(Float HotLogSize) {
        this.HotLogSize = HotLogSize;
    }

    /**
     * Get <p>Cold storage size</p><p>Unit: MB</p> 
     * @return ColdLogSize <p>Cold storage size</p><p>Unit: MB</p>
     */
    public Float getColdLogSize() {
        return this.ColdLogSize;
    }

    /**
     * Set <p>Cold storage size</p><p>Unit: MB</p>
     * @param ColdLogSize <p>Cold storage size</p><p>Unit: MB</p>
     */
    public void setColdLogSize(Float ColdLogSize) {
        this.ColdLogSize = ColdLogSize;
    }

    /**
     * Get <p>Start time</p> 
     * @return CreateTime <p>Start time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Start time</p>
     * @param CreateTime <p>Start time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Delivery status</p> 
     * @return Deliver <p>Delivery status</p>
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set <p>Delivery status</p>
     * @param Deliver <p>Delivery status</p>
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get <p>Shipping information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeliverSummary <p>Shipping information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set <p>Shipping information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeliverSummary <p>Shipping information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    /**
     * Get <p>Instance information</p> 
     * @return InstanceInfo <p>Instance information</p>
     */
    public LogInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set <p>Instance information</p>
     * @param InstanceInfo <p>Instance information</p>
     */
    public void setInstanceInfo(LogInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    public AuditInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceInfo(AuditInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
        if (source.ColdLogExpireDay != null) {
            this.ColdLogExpireDay = new Long(source.ColdLogExpireDay);
        }
        if (source.HotLogSize != null) {
            this.HotLogSize = new Float(source.HotLogSize);
        }
        if (source.ColdLogSize != null) {
            this.ColdLogSize = new Float(source.ColdLogSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Deliver != null) {
            this.Deliver = new String(source.Deliver);
        }
        if (source.DeliverSummary != null) {
            this.DeliverSummary = new DeliverSummary[source.DeliverSummary.length];
            for (int i = 0; i < source.DeliverSummary.length; i++) {
                this.DeliverSummary[i] = new DeliverSummary(source.DeliverSummary[i]);
            }
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new LogInstanceInfo(source.InstanceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);
        this.setParamSimple(map, prefix + "ColdLogExpireDay", this.ColdLogExpireDay);
        this.setParamSimple(map, prefix + "HotLogSize", this.HotLogSize);
        this.setParamSimple(map, prefix + "ColdLogSize", this.ColdLogSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamArrayObj(map, prefix + "DeliverSummary.", this.DeliverSummary);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);

    }
}

