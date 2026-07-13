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

public class BudgetSendInfoDto extends AbstractModel {

    /**
    * Notification cycle, separated by commas.
Enumeration values:
Monday:1
Tuesday:2
Sunday: 7
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WeekDays")
    @Expose
    private Long [] WeekDays;

    /**
    * Reception type.
Enumeration values:
UIN default mode
USER
GROUP User group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Sending and receiving window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Budget configuration id (budget name)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BudgetId")
    @Expose
    private Long BudgetId;

    /**
    * receiving channel, separated by commas
Enumeration values:
TITLE
Message Center
mail
SMS
WECHAT
VOICE
WeCom
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeWays")
    @Expose
    private String [] NoticeWays;

    /**
    * Send start window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * user id, user group id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverIds")
    @Expose
    private Long [] ReceiverIds;

    /**
     * Get Notification cycle, separated by commas.
Enumeration values:
Monday:1
Tuesday:2
Sunday: 7
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WeekDays Notification cycle, separated by commas.
Enumeration values:
Monday:1
Tuesday:2
Sunday: 7
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Notification cycle, separated by commas.
Enumeration values:
Monday:1
Tuesday:2
Sunday: 7
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WeekDays Notification cycle, separated by commas.
Enumeration values:
Monday:1
Tuesday:2
Sunday: 7
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeekDays(Long [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get Reception type.
Enumeration values:
UIN default mode
USER
GROUP User group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReceiverType Reception type.
Enumeration values:
UIN default mode
USER
GROUP User group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Reception type.
Enumeration values:
UIN default mode
USER
GROUP User group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReceiverType Reception type.
Enumeration values:
UIN default mode
USER
GROUP User group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Sending and receiving window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Sending and receiving window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Sending and receiving window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Sending and receiving window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Budget configuration id (budget name)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BudgetId Budget configuration id (budget name)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set Budget configuration id (budget name)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BudgetId Budget configuration id (budget name)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBudgetId(Long BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get receiving channel, separated by commas
Enumeration values:
TITLE
Message Center
mail
SMS
WECHAT
VOICE
WeCom
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NoticeWays receiving channel, separated by commas
Enumeration values:
TITLE
Message Center
mail
SMS
WECHAT
VOICE
WeCom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNoticeWays() {
        return this.NoticeWays;
    }

    /**
     * Set receiving channel, separated by commas
Enumeration values:
TITLE
Message Center
mail
SMS
WECHAT
VOICE
WeCom
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NoticeWays receiving channel, separated by commas
Enumeration values:
TITLE
Message Center
mail
SMS
WECHAT
VOICE
WeCom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoticeWays(String [] NoticeWays) {
        this.NoticeWays = NoticeWays;
    }

    /**
     * Get Send start window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Send start window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Send start window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Send start window HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get user id, user group id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReceiverIds user id, user group id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getReceiverIds() {
        return this.ReceiverIds;
    }

    /**
     * Set user id, user group id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReceiverIds user id, user group id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceiverIds(Long [] ReceiverIds) {
        this.ReceiverIds = ReceiverIds;
    }

    public BudgetSendInfoDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetSendInfoDto(BudgetSendInfoDto source) {
        if (source.WeekDays != null) {
            this.WeekDays = new Long[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new Long(source.WeekDays[i]);
            }
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new Long(source.BudgetId);
        }
        if (source.NoticeWays != null) {
            this.NoticeWays = new String[source.NoticeWays.length];
            for (int i = 0; i < source.NoticeWays.length; i++) {
                this.NoticeWays[i] = new String(source.NoticeWays[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ReceiverIds != null) {
            this.ReceiverIds = new Long[source.ReceiverIds.length];
            for (int i = 0; i < source.ReceiverIds.length; i++) {
                this.ReceiverIds[i] = new Long(source.ReceiverIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamArraySimple(map, prefix + "NoticeWays.", this.NoticeWays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "ReceiverIds.", this.ReceiverIds);

    }
}

