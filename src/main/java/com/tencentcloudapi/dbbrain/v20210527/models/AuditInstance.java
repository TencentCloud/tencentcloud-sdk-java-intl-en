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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstance extends AbstractModel {

    /**
    * Audit status. Valid values: `ON` (Enabled), `OFF` (Not enabled).
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * Audit log size. This parameter is only used for the free trial edition of Database Audit.
    */
    @SerializedName("BillingAmount")
    @Expose
    private Long BillingAmount;

    /**
    * Billing confirmation status. Valid values: `0` (Unconfirmed), `1` (Confirmed).
    */
    @SerializedName("BillingConfirmed")
    @Expose
    private Long BillingConfirmed;

    /**
    * Infrequent access storage period
    */
    @SerializedName("ColdLogExpireDay")
    @Expose
    private Long ColdLogExpireDay;

    /**
    * Storage size of infrequently accessed logs in MB
    */
    @SerializedName("ColdLogSize")
    @Expose
    private Long ColdLogSize;

    /**
    * Storage period of frequently accessed logs in days
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
    * Storage size of frequently accessed logs in MB
    */
    @SerializedName("HotLogSize")
    @Expose
    private Long HotLogSize;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log retention period in days, which is the sum of the frequent and infrequent access storage periods.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance details
    */
    @SerializedName("InstanceInfo")
    @Expose
    private AuditInstanceInfo InstanceInfo;

    /**
     * Get Audit status. Valid values: `ON` (Enabled), `OFF` (Not enabled). 
     * @return AuditStatus Audit status. Valid values: `ON` (Enabled), `OFF` (Not enabled).
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Audit status. Valid values: `ON` (Enabled), `OFF` (Not enabled).
     * @param AuditStatus Audit status. Valid values: `ON` (Enabled), `OFF` (Not enabled).
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Audit log size. This parameter is only used for the free trial edition of Database Audit. 
     * @return BillingAmount Audit log size. This parameter is only used for the free trial edition of Database Audit.
     */
    public Long getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set Audit log size. This parameter is only used for the free trial edition of Database Audit.
     * @param BillingAmount Audit log size. This parameter is only used for the free trial edition of Database Audit.
     */
    public void setBillingAmount(Long BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get Billing confirmation status. Valid values: `0` (Unconfirmed), `1` (Confirmed). 
     * @return BillingConfirmed Billing confirmation status. Valid values: `0` (Unconfirmed), `1` (Confirmed).
     */
    public Long getBillingConfirmed() {
        return this.BillingConfirmed;
    }

    /**
     * Set Billing confirmation status. Valid values: `0` (Unconfirmed), `1` (Confirmed).
     * @param BillingConfirmed Billing confirmation status. Valid values: `0` (Unconfirmed), `1` (Confirmed).
     */
    public void setBillingConfirmed(Long BillingConfirmed) {
        this.BillingConfirmed = BillingConfirmed;
    }

    /**
     * Get Infrequent access storage period 
     * @return ColdLogExpireDay Infrequent access storage period
     */
    public Long getColdLogExpireDay() {
        return this.ColdLogExpireDay;
    }

    /**
     * Set Infrequent access storage period
     * @param ColdLogExpireDay Infrequent access storage period
     */
    public void setColdLogExpireDay(Long ColdLogExpireDay) {
        this.ColdLogExpireDay = ColdLogExpireDay;
    }

    /**
     * Get Storage size of infrequently accessed logs in MB 
     * @return ColdLogSize Storage size of infrequently accessed logs in MB
     */
    public Long getColdLogSize() {
        return this.ColdLogSize;
    }

    /**
     * Set Storage size of infrequently accessed logs in MB
     * @param ColdLogSize Storage size of infrequently accessed logs in MB
     */
    public void setColdLogSize(Long ColdLogSize) {
        this.ColdLogSize = ColdLogSize;
    }

    /**
     * Get Storage period of frequently accessed logs in days 
     * @return HotLogExpireDay Storage period of frequently accessed logs in days
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set Storage period of frequently accessed logs in days
     * @param HotLogExpireDay Storage period of frequently accessed logs in days
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    /**
     * Get Storage size of frequently accessed logs in MB 
     * @return HotLogSize Storage size of frequently accessed logs in MB
     */
    public Long getHotLogSize() {
        return this.HotLogSize;
    }

    /**
     * Set Storage size of frequently accessed logs in MB
     * @param HotLogSize Storage size of frequently accessed logs in MB
     */
    public void setHotLogSize(Long HotLogSize) {
        this.HotLogSize = HotLogSize;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log retention period in days, which is the sum of the frequent and infrequent access storage periods. 
     * @return LogExpireDay Log retention period in days, which is the sum of the frequent and infrequent access storage periods.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Log retention period in days, which is the sum of the frequent and infrequent access storage periods.
     * @param LogExpireDay Log retention period in days, which is the sum of the frequent and infrequent access storage periods.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get Instance creation time 
     * @return CreateTime Instance creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time
     * @param CreateTime Instance creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance details 
     * @return InstanceInfo Instance details
     */
    public AuditInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set Instance details
     * @param InstanceInfo Instance details
     */
    public void setInstanceInfo(AuditInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    public AuditInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstance(AuditInstance source) {
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.BillingAmount != null) {
            this.BillingAmount = new Long(source.BillingAmount);
        }
        if (source.BillingConfirmed != null) {
            this.BillingConfirmed = new Long(source.BillingConfirmed);
        }
        if (source.ColdLogExpireDay != null) {
            this.ColdLogExpireDay = new Long(source.ColdLogExpireDay);
        }
        if (source.ColdLogSize != null) {
            this.ColdLogSize = new Long(source.ColdLogSize);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
        if (source.HotLogSize != null) {
            this.HotLogSize = new Long(source.HotLogSize);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new AuditInstanceInfo(source.InstanceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "BillingAmount", this.BillingAmount);
        this.setParamSimple(map, prefix + "BillingConfirmed", this.BillingConfirmed);
        this.setParamSimple(map, prefix + "ColdLogExpireDay", this.ColdLogExpireDay);
        this.setParamSimple(map, prefix + "ColdLogSize", this.ColdLogSize);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);
        this.setParamSimple(map, prefix + "HotLogSize", this.HotLogSize);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);

    }
}

