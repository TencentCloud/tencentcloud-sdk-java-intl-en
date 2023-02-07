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

public class PrometheusNotificationItem extends AbstractModel{

    /**
    * Whether it is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Channel type. Default value: `amp`. Valid values:
`amp`
`webhook`
`alertmanager`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * If `Type` is `webhook`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebHook")
    @Expose
    private String WebHook;

    /**
    * If `Type` is `alertmanager`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlertManager")
    @Expose
    private PrometheusAlertManagerConfig AlertManager;

    /**
    * Convergence time
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * Effect start time
    */
    @SerializedName("TimeRangeStart")
    @Expose
    private String TimeRangeStart;

    /**
    * Effect end time
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * Alert notification channel. Valid values: `SMS`, `EMAIL`, `CALL`, `WECHAT`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * Alert recipient group (user group)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private String [] ReceiverGroups;

    /**
    * Alert call sequence.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneNotifyOrder")
    @Expose
    private Long [] PhoneNotifyOrder;

    /**
    * Number of alert calls.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneCircleTimes")
    @Expose
    private Long PhoneCircleTimes;

    /**
    * Alert call interval within a cycle in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneInnerInterval")
    @Expose
    private Long PhoneInnerInterval;

    /**
    * Alert call cycle interval in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneCircleInterval")
    @Expose
    private Long PhoneCircleInterval;

    /**
    * Alert call receipt notification
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneArriveNotice")
    @Expose
    private Boolean PhoneArriveNotice;

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
     * Get Channel type. Default value: `amp`. Valid values:
`amp`
`webhook`
`alertmanager` 
     * @return Type Channel type. Default value: `amp`. Valid values:
`amp`
`webhook`
`alertmanager`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Channel type. Default value: `amp`. Valid values:
`amp`
`webhook`
`alertmanager`
     * @param Type Channel type. Default value: `amp`. Valid values:
`amp`
`webhook`
`alertmanager`
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get If `Type` is `webhook`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WebHook If `Type` is `webhook`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWebHook() {
        return this.WebHook;
    }

    /**
     * Set If `Type` is `webhook`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WebHook If `Type` is `webhook`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWebHook(String WebHook) {
        this.WebHook = WebHook;
    }

    /**
     * Get If `Type` is `alertmanager`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlertManager If `Type` is `alertmanager`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusAlertManagerConfig getAlertManager() {
        return this.AlertManager;
    }

    /**
     * Set If `Type` is `alertmanager`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlertManager If `Type` is `alertmanager`, this field is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlertManager(PrometheusAlertManagerConfig AlertManager) {
        this.AlertManager = AlertManager;
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
     * Get Effect start time 
     * @return TimeRangeStart Effect start time
     */
    public String getTimeRangeStart() {
        return this.TimeRangeStart;
    }

    /**
     * Set Effect start time
     * @param TimeRangeStart Effect start time
     */
    public void setTimeRangeStart(String TimeRangeStart) {
        this.TimeRangeStart = TimeRangeStart;
    }

    /**
     * Get Effect end time 
     * @return TimeRangeEnd Effect end time
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set Effect end time
     * @param TimeRangeEnd Effect end time
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get Alert notification channel. Valid values: `SMS`, `EMAIL`, `CALL`, `WECHAT`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NotifyWay Alert notification channel. Valid values: `SMS`, `EMAIL`, `CALL`, `WECHAT`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set Alert notification channel. Valid values: `SMS`, `EMAIL`, `CALL`, `WECHAT`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NotifyWay Alert notification channel. Valid values: `SMS`, `EMAIL`, `CALL`, `WECHAT`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get Alert recipient group (user group)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReceiverGroups Alert recipient group (user group)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set Alert recipient group (user group)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReceiverGroups Alert recipient group (user group)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceiverGroups(String [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get Alert call sequence.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneNotifyOrder Alert call sequence.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPhoneNotifyOrder() {
        return this.PhoneNotifyOrder;
    }

    /**
     * Set Alert call sequence.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneNotifyOrder Alert call sequence.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneNotifyOrder(Long [] PhoneNotifyOrder) {
        this.PhoneNotifyOrder = PhoneNotifyOrder;
    }

    /**
     * Get Number of alert calls.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneCircleTimes Number of alert calls.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPhoneCircleTimes() {
        return this.PhoneCircleTimes;
    }

    /**
     * Set Number of alert calls.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneCircleTimes Number of alert calls.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneCircleTimes(Long PhoneCircleTimes) {
        this.PhoneCircleTimes = PhoneCircleTimes;
    }

    /**
     * Get Alert call interval within a cycle in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneInnerInterval Alert call interval within a cycle in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPhoneInnerInterval() {
        return this.PhoneInnerInterval;
    }

    /**
     * Set Alert call interval within a cycle in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneInnerInterval Alert call interval within a cycle in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneInnerInterval(Long PhoneInnerInterval) {
        this.PhoneInnerInterval = PhoneInnerInterval;
    }

    /**
     * Get Alert call cycle interval in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneCircleInterval Alert call cycle interval in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPhoneCircleInterval() {
        return this.PhoneCircleInterval;
    }

    /**
     * Set Alert call cycle interval in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneCircleInterval Alert call cycle interval in seconds.
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneCircleInterval(Long PhoneCircleInterval) {
        this.PhoneCircleInterval = PhoneCircleInterval;
    }

    /**
     * Get Alert call receipt notification
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneArriveNotice Alert call receipt notification
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPhoneArriveNotice() {
        return this.PhoneArriveNotice;
    }

    /**
     * Set Alert call receipt notification
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneArriveNotice Alert call receipt notification
Note: If `NotifyWay` is `CALL`, this parameter will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneArriveNotice(Boolean PhoneArriveNotice) {
        this.PhoneArriveNotice = PhoneArriveNotice;
    }

    public PrometheusNotificationItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusNotificationItem(PrometheusNotificationItem source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WebHook != null) {
            this.WebHook = new String(source.WebHook);
        }
        if (source.AlertManager != null) {
            this.AlertManager = new PrometheusAlertManagerConfig(source.AlertManager);
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
            this.ReceiverGroups = new String[source.ReceiverGroups.length];
            for (int i = 0; i < source.ReceiverGroups.length; i++) {
                this.ReceiverGroups[i] = new String(source.ReceiverGroups[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WebHook", this.WebHook);
        this.setParamObj(map, prefix + "AlertManager.", this.AlertManager);
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

    }
}

