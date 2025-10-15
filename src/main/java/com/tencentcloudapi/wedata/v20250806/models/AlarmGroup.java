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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmGroup extends AbstractModel {

    /**
    * Specifies the list of Alarm escalation recipient ids.
If the Alarm recipient or supervisor does not confirm the Alarm within the Alarm interval, an Alarm will be sent to the next-level superior.
    */
    @SerializedName("AlarmEscalationRecipientIds")
    @Expose
    private String [] AlarmEscalationRecipientIds;

    /**
    * Escalation interval for alarms.
    */
    @SerializedName("AlarmEscalationInterval")
    @Expose
    private Long AlarmEscalationInterval;

    /**
    * Alarm notification fatigue configuration.
    */
    @SerializedName("NotificationFatigue")
    @Expose
    private NotificationFatigue NotificationFatigue;

    /**
    * Alarm channel. valid values: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail). only select one channel.
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * webhook url list for wecom group/lark group/dingtalk group/Slack group/Teams group.
    */
    @SerializedName("WebHooks")
    @Expose
    private AlarmWayWebHook [] WebHooks;

    /**
    * Alarm recipient type: 1. specified personnel, 2. task owner, 3. duty schedule (default: 1. specified personnel).
    */
    @SerializedName("AlarmRecipientType")
    @Expose
    private Long AlarmRecipientType;

    /**
    * Specifies different business ids based on AlarmRecipientType. valid values: 1 (designated personnel): Alarm recipient id list. 2 (task owner): no configuration required. 3 (duty schedule): schedule id list.
    */
    @SerializedName("AlarmRecipientIds")
    @Expose
    private String [] AlarmRecipientIds;

    /**
     * Get Specifies the list of Alarm escalation recipient ids.
If the Alarm recipient or supervisor does not confirm the Alarm within the Alarm interval, an Alarm will be sent to the next-level superior. 
     * @return AlarmEscalationRecipientIds Specifies the list of Alarm escalation recipient ids.
If the Alarm recipient or supervisor does not confirm the Alarm within the Alarm interval, an Alarm will be sent to the next-level superior.
     */
    public String [] getAlarmEscalationRecipientIds() {
        return this.AlarmEscalationRecipientIds;
    }

    /**
     * Set Specifies the list of Alarm escalation recipient ids.
If the Alarm recipient or supervisor does not confirm the Alarm within the Alarm interval, an Alarm will be sent to the next-level superior.
     * @param AlarmEscalationRecipientIds Specifies the list of Alarm escalation recipient ids.
If the Alarm recipient or supervisor does not confirm the Alarm within the Alarm interval, an Alarm will be sent to the next-level superior.
     */
    public void setAlarmEscalationRecipientIds(String [] AlarmEscalationRecipientIds) {
        this.AlarmEscalationRecipientIds = AlarmEscalationRecipientIds;
    }

    /**
     * Get Escalation interval for alarms. 
     * @return AlarmEscalationInterval Escalation interval for alarms.
     */
    public Long getAlarmEscalationInterval() {
        return this.AlarmEscalationInterval;
    }

    /**
     * Set Escalation interval for alarms.
     * @param AlarmEscalationInterval Escalation interval for alarms.
     */
    public void setAlarmEscalationInterval(Long AlarmEscalationInterval) {
        this.AlarmEscalationInterval = AlarmEscalationInterval;
    }

    /**
     * Get Alarm notification fatigue configuration. 
     * @return NotificationFatigue Alarm notification fatigue configuration.
     */
    public NotificationFatigue getNotificationFatigue() {
        return this.NotificationFatigue;
    }

    /**
     * Set Alarm notification fatigue configuration.
     * @param NotificationFatigue Alarm notification fatigue configuration.
     */
    public void setNotificationFatigue(NotificationFatigue NotificationFatigue) {
        this.NotificationFatigue = NotificationFatigue;
    }

    /**
     * Get Alarm channel. valid values: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail). only select one channel. 
     * @return AlarmWays Alarm channel. valid values: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail). only select one channel.
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set Alarm channel. valid values: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail). only select one channel.
     * @param AlarmWays Alarm channel. valid values: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail). only select one channel.
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get webhook url list for wecom group/lark group/dingtalk group/Slack group/Teams group. 
     * @return WebHooks webhook url list for wecom group/lark group/dingtalk group/Slack group/Teams group.
     */
    public AlarmWayWebHook [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set webhook url list for wecom group/lark group/dingtalk group/Slack group/Teams group.
     * @param WebHooks webhook url list for wecom group/lark group/dingtalk group/Slack group/Teams group.
     */
    public void setWebHooks(AlarmWayWebHook [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    /**
     * Get Alarm recipient type: 1. specified personnel, 2. task owner, 3. duty schedule (default: 1. specified personnel). 
     * @return AlarmRecipientType Alarm recipient type: 1. specified personnel, 2. task owner, 3. duty schedule (default: 1. specified personnel).
     */
    public Long getAlarmRecipientType() {
        return this.AlarmRecipientType;
    }

    /**
     * Set Alarm recipient type: 1. specified personnel, 2. task owner, 3. duty schedule (default: 1. specified personnel).
     * @param AlarmRecipientType Alarm recipient type: 1. specified personnel, 2. task owner, 3. duty schedule (default: 1. specified personnel).
     */
    public void setAlarmRecipientType(Long AlarmRecipientType) {
        this.AlarmRecipientType = AlarmRecipientType;
    }

    /**
     * Get Specifies different business ids based on AlarmRecipientType. valid values: 1 (designated personnel): Alarm recipient id list. 2 (task owner): no configuration required. 3 (duty schedule): schedule id list. 
     * @return AlarmRecipientIds Specifies different business ids based on AlarmRecipientType. valid values: 1 (designated personnel): Alarm recipient id list. 2 (task owner): no configuration required. 3 (duty schedule): schedule id list.
     */
    public String [] getAlarmRecipientIds() {
        return this.AlarmRecipientIds;
    }

    /**
     * Set Specifies different business ids based on AlarmRecipientType. valid values: 1 (designated personnel): Alarm recipient id list. 2 (task owner): no configuration required. 3 (duty schedule): schedule id list.
     * @param AlarmRecipientIds Specifies different business ids based on AlarmRecipientType. valid values: 1 (designated personnel): Alarm recipient id list. 2 (task owner): no configuration required. 3 (duty schedule): schedule id list.
     */
    public void setAlarmRecipientIds(String [] AlarmRecipientIds) {
        this.AlarmRecipientIds = AlarmRecipientIds;
    }

    public AlarmGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmGroup(AlarmGroup source) {
        if (source.AlarmEscalationRecipientIds != null) {
            this.AlarmEscalationRecipientIds = new String[source.AlarmEscalationRecipientIds.length];
            for (int i = 0; i < source.AlarmEscalationRecipientIds.length; i++) {
                this.AlarmEscalationRecipientIds[i] = new String(source.AlarmEscalationRecipientIds[i]);
            }
        }
        if (source.AlarmEscalationInterval != null) {
            this.AlarmEscalationInterval = new Long(source.AlarmEscalationInterval);
        }
        if (source.NotificationFatigue != null) {
            this.NotificationFatigue = new NotificationFatigue(source.NotificationFatigue);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String[source.AlarmWays.length];
            for (int i = 0; i < source.AlarmWays.length; i++) {
                this.AlarmWays[i] = new String(source.AlarmWays[i]);
            }
        }
        if (source.WebHooks != null) {
            this.WebHooks = new AlarmWayWebHook[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new AlarmWayWebHook(source.WebHooks[i]);
            }
        }
        if (source.AlarmRecipientType != null) {
            this.AlarmRecipientType = new Long(source.AlarmRecipientType);
        }
        if (source.AlarmRecipientIds != null) {
            this.AlarmRecipientIds = new String[source.AlarmRecipientIds.length];
            for (int i = 0; i < source.AlarmRecipientIds.length; i++) {
                this.AlarmRecipientIds[i] = new String(source.AlarmRecipientIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AlarmEscalationRecipientIds.", this.AlarmEscalationRecipientIds);
        this.setParamSimple(map, prefix + "AlarmEscalationInterval", this.AlarmEscalationInterval);
        this.setParamObj(map, prefix + "NotificationFatigue.", this.NotificationFatigue);
        this.setParamArraySimple(map, prefix + "AlarmWays.", this.AlarmWays);
        this.setParamArrayObj(map, prefix + "WebHooks.", this.WebHooks);
        this.setParamSimple(map, prefix + "AlarmRecipientType", this.AlarmRecipientType);
        this.setParamArraySimple(map, prefix + "AlarmRecipientIds.", this.AlarmRecipientIds);

    }
}

