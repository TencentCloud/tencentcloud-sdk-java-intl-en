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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetRemindRecords extends AbstractModel {

    /**
    * budget period
    */
    @SerializedName("DateDesc")
    @Expose
    private String DateDesc;

    /**
    * actual fee
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * Budget amount limit
    */
    @SerializedName("BudgetQuota")
    @Expose
    private String BudgetQuota;

    /**
    * Reminder type.
Enumeration values:
BUDGET reminder
Fluctuation alert
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * message content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageContent")
    @Expose
    private String MessageContent;

    /**
    * Send time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get budget period 
     * @return DateDesc budget period
     */
    public String getDateDesc() {
        return this.DateDesc;
    }

    /**
     * Set budget period
     * @param DateDesc budget period
     */
    public void setDateDesc(String DateDesc) {
        this.DateDesc = DateDesc;
    }

    /**
     * Get actual fee 
     * @return RealCost actual fee
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set actual fee
     * @param RealCost actual fee
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Budget amount limit 
     * @return BudgetQuota Budget amount limit
     */
    public String getBudgetQuota() {
        return this.BudgetQuota;
    }

    /**
     * Set Budget amount limit
     * @param BudgetQuota Budget amount limit
     */
    public void setBudgetQuota(String BudgetQuota) {
        this.BudgetQuota = BudgetQuota;
    }

    /**
     * Get Reminder type.
Enumeration values:
BUDGET reminder
Fluctuation alert
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmType Reminder type.
Enumeration values:
BUDGET reminder
Fluctuation alert
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Reminder type.
Enumeration values:
BUDGET reminder
Fluctuation alert
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmType Reminder type.
Enumeration values:
BUDGET reminder
Fluctuation alert
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get message content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MessageContent message content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessageContent() {
        return this.MessageContent;
    }

    /**
     * Set message content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MessageContent message content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageContent(String MessageContent) {
        this.MessageContent = MessageContent;
    }

    /**
     * Get Send time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SendTime Send time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set Send time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SendTime Send time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public BudgetRemindRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetRemindRecords(BudgetRemindRecords source) {
        if (source.DateDesc != null) {
            this.DateDesc = new String(source.DateDesc);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.BudgetQuota != null) {
            this.BudgetQuota = new String(source.BudgetQuota);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.MessageContent != null) {
            this.MessageContent = new String(source.MessageContent);
        }
        if (source.SendTime != null) {
            this.SendTime = new Long(source.SendTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateDesc", this.DateDesc);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "BudgetQuota", this.BudgetQuota);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "MessageContent", this.MessageContent);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

