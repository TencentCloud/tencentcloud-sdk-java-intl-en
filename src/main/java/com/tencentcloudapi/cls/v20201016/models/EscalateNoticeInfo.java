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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EscalateNoticeInfo extends AbstractModel {

    /**
    * Alarm notification template recipient information.
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * Callback information of alarm notification template.
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
    */
    @SerializedName("Escalate")
    @Expose
    private Boolean Escalate;

    /**
    * Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Upgrade conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered, defaults to 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Notification channel configuration for the next step after alarm severity escalation. A maximum of five steps can be configured.
    */
    @SerializedName("EscalateNotice")
    @Expose
    private EscalateNoticeInfo EscalateNotice;

    /**
     * Get Alarm notification template recipient information. 
     * @return NoticeReceivers Alarm notification template recipient information.
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set Alarm notification template recipient information.
     * @param NoticeReceivers Alarm notification template recipient information.
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get Callback information of alarm notification template. 
     * @return WebCallbacks Callback information of alarm notification template.
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set Callback information of alarm notification template.
     * @param WebCallbacks Callback information of alarm notification template.
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false. 
     * @return Escalate Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
     */
    public Boolean getEscalate() {
        return this.Escalate;
    }

    /**
     * Set Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
     * @param Escalate Alarm escalation switch. `true`: enable alarm escalation, `false`: disable alarm escalation. Default: false.
     */
    public void setEscalate(Boolean Escalate) {
        this.Escalate = Escalate;
    }

    /**
     * Get Escalate alarms interval. Unit: minutes, range `[1, 14400]`. 
     * @return Interval Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
     * @param Interval Escalate alarms interval. Unit: minutes, range `[1, 14400]`.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Upgrade conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered, defaults to 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.
 
     * @return Type Upgrade conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered, defaults to 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Upgrade conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered, defaults to 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

     * @param Type Upgrade conditions. `1`: Unclaimed and unrecovered, `2`: Unrecovered, defaults to 1.
-Unclaimed and unrecovered: Upgrade if the alert is not restored and no one claims it.
-Unrecovered: Upgrade if the alarm persists without recovery.

     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Notification channel configuration for the next step after alarm severity escalation. A maximum of five steps can be configured. 
     * @return EscalateNotice Notification channel configuration for the next step after alarm severity escalation. A maximum of five steps can be configured.
     */
    public EscalateNoticeInfo getEscalateNotice() {
        return this.EscalateNotice;
    }

    /**
     * Set Notification channel configuration for the next step after alarm severity escalation. A maximum of five steps can be configured.
     * @param EscalateNotice Notification channel configuration for the next step after alarm severity escalation. A maximum of five steps can be configured.
     */
    public void setEscalateNotice(EscalateNoticeInfo EscalateNotice) {
        this.EscalateNotice = EscalateNotice;
    }

    public EscalateNoticeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscalateNoticeInfo(EscalateNoticeInfo source) {
        if (source.NoticeReceivers != null) {
            this.NoticeReceivers = new NoticeReceiver[source.NoticeReceivers.length];
            for (int i = 0; i < source.NoticeReceivers.length; i++) {
                this.NoticeReceivers[i] = new NoticeReceiver(source.NoticeReceivers[i]);
            }
        }
        if (source.WebCallbacks != null) {
            this.WebCallbacks = new WebCallback[source.WebCallbacks.length];
            for (int i = 0; i < source.WebCallbacks.length; i++) {
                this.WebCallbacks[i] = new WebCallback(source.WebCallbacks[i]);
            }
        }
        if (source.Escalate != null) {
            this.Escalate = new Boolean(source.Escalate);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EscalateNotice != null) {
            this.EscalateNotice = new EscalateNoticeInfo(source.EscalateNotice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "Escalate", this.Escalate);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "EscalateNotice.", this.EscalateNotice);

    }
}

