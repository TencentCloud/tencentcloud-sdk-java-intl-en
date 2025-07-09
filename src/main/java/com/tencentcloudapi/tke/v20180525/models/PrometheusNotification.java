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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusNotification extends AbstractModel {

    /**
    * Whether it is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Convergence time
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * Start time
    */
    @SerializedName("TimeRangeStart")
    @Expose
    private String TimeRangeStart;

    /**
    * End time
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * Alarm delivery method. Valid values: `SMS`, `EMAIL`, `CALL`, and `WECHAT`
It respectively represents SMS, email, phone calls, and WeChat.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * The alarm recipient group (user group)
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private Long [] ReceiverGroups;

    /**
    * The alarm sequence of phone calls
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PhoneNotifyOrder")
    @Expose
    private Long [] PhoneNotifyOrder;

    /**
    * The number of phone call alarms
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PhoneCircleTimes")
    @Expose
    private Long PhoneCircleTimes;

    /**
    * Dialing interval in seconds within one polling
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PhoneInnerInterval")
    @Expose
    private Long PhoneInnerInterval;

    /**
    * Polling interval in seconds
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PhoneCircleInterval")
    @Expose
    private Long PhoneCircleInterval;

    /**
    * Phone call alarm arrival notification
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PhoneArriveNotice")
    @Expose
    private Boolean PhoneArriveNotice;

    /**
    * Channel type. Default value: `amp`. The following channels are supported:
amp
webhook
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This parameter is required if `Type` is `webhook`.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WebHook")
    @Expose
    private String WebHook;

    /**
     * Get Whether it is enabled 
     * @return Enabled Whether it is enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether it is enabled
     * @param Enabled Whether it is enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Convergence time 
     * @return RepeatInterval Convergence time
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set Convergence time
     * @param RepeatInterval Convergence time
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get Start time 
     * @return TimeRangeStart Start time
     */
    public String getTimeRangeStart() {
        return this.TimeRangeStart;
    }

    /**
     * Set Start time
     * @param TimeRangeStart Start time
     */
    public void setTimeRangeStart(String TimeRangeStart) {
        this.TimeRangeStart = TimeRangeStart;
    }

    /**
     * Get End time 
     * @return TimeRangeEnd End time
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set End time
     * @param TimeRangeEnd End time
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get Alarm delivery method. Valid values: `SMS`, `EMAIL`, `CALL`, and `WECHAT`
It respectively represents SMS, email, phone calls, and WeChat.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return NotifyWay Alarm delivery method. Valid values: `SMS`, `EMAIL`, `CALL`, and `WECHAT`
It respectively represents SMS, email, phone calls, and WeChat.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set Alarm delivery method. Valid values: `SMS`, `EMAIL`, `CALL`, and `WECHAT`
It respectively represents SMS, email, phone calls, and WeChat.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param NotifyWay Alarm delivery method. Valid values: `SMS`, `EMAIL`, `CALL`, and `WECHAT`
It respectively represents SMS, email, phone calls, and WeChat.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get The alarm recipient group (user group)
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return ReceiverGroups The alarm recipient group (user group)
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set The alarm recipient group (user group)
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param ReceiverGroups The alarm recipient group (user group)
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setReceiverGroups(Long [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get The alarm sequence of phone calls
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PhoneNotifyOrder The alarm sequence of phone calls
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getPhoneNotifyOrder() {
        return this.PhoneNotifyOrder;
    }

    /**
     * Set The alarm sequence of phone calls
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PhoneNotifyOrder The alarm sequence of phone calls
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPhoneNotifyOrder(Long [] PhoneNotifyOrder) {
        this.PhoneNotifyOrder = PhoneNotifyOrder;
    }

    /**
     * Get The number of phone call alarms
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PhoneCircleTimes The number of phone call alarms
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPhoneCircleTimes() {
        return this.PhoneCircleTimes;
    }

    /**
     * Set The number of phone call alarms
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PhoneCircleTimes The number of phone call alarms
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPhoneCircleTimes(Long PhoneCircleTimes) {
        this.PhoneCircleTimes = PhoneCircleTimes;
    }

    /**
     * Get Dialing interval in seconds within one polling
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PhoneInnerInterval Dialing interval in seconds within one polling
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPhoneInnerInterval() {
        return this.PhoneInnerInterval;
    }

    /**
     * Set Dialing interval in seconds within one polling
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PhoneInnerInterval Dialing interval in seconds within one polling
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPhoneInnerInterval(Long PhoneInnerInterval) {
        this.PhoneInnerInterval = PhoneInnerInterval;
    }

    /**
     * Get Polling interval in seconds
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PhoneCircleInterval Polling interval in seconds
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPhoneCircleInterval() {
        return this.PhoneCircleInterval;
    }

    /**
     * Set Polling interval in seconds
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PhoneCircleInterval Polling interval in seconds
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPhoneCircleInterval(Long PhoneCircleInterval) {
        this.PhoneCircleInterval = PhoneCircleInterval;
    }

    /**
     * Get Phone call alarm arrival notification
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PhoneArriveNotice Phone call alarm arrival notification
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getPhoneArriveNotice() {
        return this.PhoneArriveNotice;
    }

    /**
     * Set Phone call alarm arrival notification
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PhoneArriveNotice Phone call alarm arrival notification
This parameter is used when you specify `CALL` for `NotifyWay`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPhoneArriveNotice(Boolean PhoneArriveNotice) {
        this.PhoneArriveNotice = PhoneArriveNotice;
    }

    /**
     * Get Channel type. Default value: `amp`. The following channels are supported:
amp
webhook
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Type Channel type. Default value: `amp`. The following channels are supported:
amp
webhook
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Channel type. Default value: `amp`. The following channels are supported:
amp
webhook
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Type Channel type. Default value: `amp`. The following channels are supported:
amp
webhook
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter is required if `Type` is `webhook`.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return WebHook This parameter is required if `Type` is `webhook`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getWebHook() {
        return this.WebHook;
    }

    /**
     * Set This parameter is required if `Type` is `webhook`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param WebHook This parameter is required if `Type` is `webhook`.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setWebHook(String WebHook) {
        this.WebHook = WebHook;
    }

    public PrometheusNotification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusNotification(PrometheusNotification source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RepeatInterval != null) {
            this.RepeatInterval = new String(source.RepeatInterval);
        }
        if (source.TimeRangeStart != null) {
            this.TimeRangeStart = new String(source.TimeRangeStart);
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
        }
        if (source.NotifyWay != null) {
            this.NotifyWay = new String[source.NotifyWay.length];
            for (int i = 0; i < source.NotifyWay.length; i++) {
                this.NotifyWay[i] = new String(source.NotifyWay[i]);
            }
        }
        if (source.ReceiverGroups != null) {
            this.ReceiverGroups = new Long[source.ReceiverGroups.length];
            for (int i = 0; i < source.ReceiverGroups.length; i++) {
                this.ReceiverGroups[i] = new Long(source.ReceiverGroups[i]);
            }
        }
        if (source.PhoneNotifyOrder != null) {
            this.PhoneNotifyOrder = new Long[source.PhoneNotifyOrder.length];
            for (int i = 0; i < source.PhoneNotifyOrder.length; i++) {
                this.PhoneNotifyOrder[i] = new Long(source.PhoneNotifyOrder[i]);
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
        if (source.PhoneArriveNotice != null) {
            this.PhoneArriveNotice = new Boolean(source.PhoneArriveNotice);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WebHook != null) {
            this.WebHook = new String(source.WebHook);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RepeatInterval", this.RepeatInterval);
        this.setParamSimple(map, prefix + "TimeRangeStart", this.TimeRangeStart);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "PhoneNotifyOrder.", this.PhoneNotifyOrder);
        this.setParamSimple(map, prefix + "PhoneCircleTimes", this.PhoneCircleTimes);
        this.setParamSimple(map, prefix + "PhoneInnerInterval", this.PhoneInnerInterval);
        this.setParamSimple(map, prefix + "PhoneCircleInterval", this.PhoneCircleInterval);
        this.setParamSimple(map, prefix + "PhoneArriveNotice", this.PhoneArriveNotice);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WebHook", this.WebHook);

    }
}

