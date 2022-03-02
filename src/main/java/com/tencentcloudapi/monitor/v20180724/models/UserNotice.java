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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserNotice extends AbstractModel{

    /**
    * Recipient type. Valid values: USER (user), GROUP (user group)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Notification start time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Notification end time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Notification channel list. Valid values: `EMAIL` (email), `SMS` (SMS), `CALL` (phone), `WECHAT` (WeChat), `RTX` (WeCom)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeWay")
    @Expose
    private String [] NoticeWay;

    /**
    * User `uid` list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserIds")
    @Expose
    private Long [] UserIds;

    /**
    * User group ID list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * Phone polling list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneOrder")
    @Expose
    private Long [] PhoneOrder;

    /**
    * Number of phone pollings. Value range: 1–5
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneCircleTimes")
    @Expose
    private Long PhoneCircleTimes;

    /**
    * Call interval in seconds within one polling. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneInnerInterval")
    @Expose
    private Long PhoneInnerInterval;

    /**
    * Polling interval in seconds. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneCircleInterval")
    @Expose
    private Long PhoneCircleInterval;

    /**
    * Whether receipt notification is required. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NeedPhoneArriveNotice")
    @Expose
    private Long NeedPhoneArriveNotice;

    /**
    * Dial type. `SYNC` (simultaneous dial), `CIRCLE` (polled dial). Default value: `CIRCLE`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneCallType")
    @Expose
    private String PhoneCallType;

    /**
     * Get Recipient type. Valid values: USER (user), GROUP (user group)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReceiverType Recipient type. Valid values: USER (user), GROUP (user group)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Recipient type. Valid values: USER (user), GROUP (user group)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReceiverType Recipient type. Valid values: USER (user), GROUP (user group)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Notification start time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Notification start time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Notification start time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StartTime Notification start time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Notification end time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Notification end time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Notification end time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndTime Notification end time, which is expressed by the number of seconds since 00:00:00. Value range: 0–86399
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Notification channel list. Valid values: `EMAIL` (email), `SMS` (SMS), `CALL` (phone), `WECHAT` (WeChat), `RTX` (WeCom)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return NoticeWay Notification channel list. Valid values: `EMAIL` (email), `SMS` (SMS), `CALL` (phone), `WECHAT` (WeChat), `RTX` (WeCom)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getNoticeWay() {
        return this.NoticeWay;
    }

    /**
     * Set Notification channel list. Valid values: `EMAIL` (email), `SMS` (SMS), `CALL` (phone), `WECHAT` (WeChat), `RTX` (WeCom)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param NoticeWay Notification channel list. Valid values: `EMAIL` (email), `SMS` (SMS), `CALL` (phone), `WECHAT` (WeChat), `RTX` (WeCom)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNoticeWay(String [] NoticeWay) {
        this.NoticeWay = NoticeWay;
    }

    /**
     * Get User `uid` list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserIds User `uid` list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set User `uid` list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserIds User `uid` list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserIds(Long [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get User group ID list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GroupIds User group ID list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set User group ID list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GroupIds User group ID list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get Phone polling list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PhoneOrder Phone polling list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPhoneOrder() {
        return this.PhoneOrder;
    }

    /**
     * Set Phone polling list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PhoneOrder Phone polling list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneOrder(Long [] PhoneOrder) {
        this.PhoneOrder = PhoneOrder;
    }

    /**
     * Get Number of phone pollings. Value range: 1–5
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PhoneCircleTimes Number of phone pollings. Value range: 1–5
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPhoneCircleTimes() {
        return this.PhoneCircleTimes;
    }

    /**
     * Set Number of phone pollings. Value range: 1–5
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PhoneCircleTimes Number of phone pollings. Value range: 1–5
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneCircleTimes(Long PhoneCircleTimes) {
        this.PhoneCircleTimes = PhoneCircleTimes;
    }

    /**
     * Get Call interval in seconds within one polling. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PhoneInnerInterval Call interval in seconds within one polling. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPhoneInnerInterval() {
        return this.PhoneInnerInterval;
    }

    /**
     * Set Call interval in seconds within one polling. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PhoneInnerInterval Call interval in seconds within one polling. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneInnerInterval(Long PhoneInnerInterval) {
        this.PhoneInnerInterval = PhoneInnerInterval;
    }

    /**
     * Get Polling interval in seconds. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PhoneCircleInterval Polling interval in seconds. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPhoneCircleInterval() {
        return this.PhoneCircleInterval;
    }

    /**
     * Set Polling interval in seconds. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PhoneCircleInterval Polling interval in seconds. Value range: 60–900
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneCircleInterval(Long PhoneCircleInterval) {
        this.PhoneCircleInterval = PhoneCircleInterval;
    }

    /**
     * Get Whether receipt notification is required. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NeedPhoneArriveNotice Whether receipt notification is required. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNeedPhoneArriveNotice() {
        return this.NeedPhoneArriveNotice;
    }

    /**
     * Set Whether receipt notification is required. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NeedPhoneArriveNotice Whether receipt notification is required. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNeedPhoneArriveNotice(Long NeedPhoneArriveNotice) {
        this.NeedPhoneArriveNotice = NeedPhoneArriveNotice;
    }

    /**
     * Get Dial type. `SYNC` (simultaneous dial), `CIRCLE` (polled dial). Default value: `CIRCLE`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PhoneCallType Dial type. `SYNC` (simultaneous dial), `CIRCLE` (polled dial). Default value: `CIRCLE`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPhoneCallType() {
        return this.PhoneCallType;
    }

    /**
     * Set Dial type. `SYNC` (simultaneous dial), `CIRCLE` (polled dial). Default value: `CIRCLE`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PhoneCallType Dial type. `SYNC` (simultaneous dial), `CIRCLE` (polled dial). Default value: `CIRCLE`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPhoneCallType(String PhoneCallType) {
        this.PhoneCallType = PhoneCallType;
    }

    public UserNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserNotice(UserNotice source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NoticeWay != null) {
            this.NoticeWay = new String[source.NoticeWay.length];
            for (int i = 0; i < source.NoticeWay.length; i++) {
                this.NoticeWay[i] = new String(source.NoticeWay[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new Long[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new Long(source.UserIds[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.PhoneOrder != null) {
            this.PhoneOrder = new Long[source.PhoneOrder.length];
            for (int i = 0; i < source.PhoneOrder.length; i++) {
                this.PhoneOrder[i] = new Long(source.PhoneOrder[i]);
            }
        }
        if (source.PhoneCircleTimes != null) {
            this.PhoneCircleTimes = new Long(source.PhoneCircleTimes);
        }
        if (source.PhoneInnerInterval != null) {
            this.PhoneInnerInterval = new Long(source.PhoneInnerInterval);
        }
        if (source.PhoneCircleInterval != null) {
            this.PhoneCircleInterval = new Long(source.PhoneCircleInterval);
        }
        if (source.NeedPhoneArriveNotice != null) {
            this.NeedPhoneArriveNotice = new Long(source.NeedPhoneArriveNotice);
        }
        if (source.PhoneCallType != null) {
            this.PhoneCallType = new String(source.PhoneCallType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NoticeWay.", this.NoticeWay);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "PhoneOrder.", this.PhoneOrder);
        this.setParamSimple(map, prefix + "PhoneCircleTimes", this.PhoneCircleTimes);
        this.setParamSimple(map, prefix + "PhoneInnerInterval", this.PhoneInnerInterval);
        this.setParamSimple(map, prefix + "PhoneCircleInterval", this.PhoneCircleInterval);
        this.setParamSimple(map, prefix + "NeedPhoneArriveNotice", this.NeedPhoneArriveNotice);
        this.setParamSimple(map, prefix + "PhoneCallType", this.PhoneCallType);

    }
}

