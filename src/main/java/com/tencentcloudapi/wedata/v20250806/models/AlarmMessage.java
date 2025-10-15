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

public class AlarmMessage extends AbstractModel {

    /**
    * Alarm message Id.
    */
    @SerializedName("AlarmMessageId")
    @Expose
    private Long AlarmMessageId;

    /**
    * Alarm time. the same Alarm may be sent multiple times, only the latest Alarm time is displayed.
    */
    @SerializedName("AlarmTime")
    @Expose
    private String AlarmTime;

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Instance data time of the task.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Indicates the Alarm cause.
    */
    @SerializedName("AlarmReason")
    @Expose
    private String AlarmReason;

    /**
    * Alarm level. 1. ordinary, 2. important, 3. critical.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Specifies the Id of the Alarm rule.
    */
    @SerializedName("AlarmRuleId")
    @Expose
    private String AlarmRuleId;

    /**
    * Alarm channel specifies the notification methods: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail).
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * Alarm recipient
    */
    @SerializedName("AlarmRecipients")
    @Expose
    private String [] AlarmRecipients;

    /**
     * Get Alarm message Id. 
     * @return AlarmMessageId Alarm message Id.
     */
    public Long getAlarmMessageId() {
        return this.AlarmMessageId;
    }

    /**
     * Set Alarm message Id.
     * @param AlarmMessageId Alarm message Id.
     */
    public void setAlarmMessageId(Long AlarmMessageId) {
        this.AlarmMessageId = AlarmMessageId;
    }

    /**
     * Get Alarm time. the same Alarm may be sent multiple times, only the latest Alarm time is displayed. 
     * @return AlarmTime Alarm time. the same Alarm may be sent multiple times, only the latest Alarm time is displayed.
     */
    public String getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set Alarm time. the same Alarm may be sent multiple times, only the latest Alarm time is displayed.
     * @param AlarmTime Alarm time. the same Alarm may be sent multiple times, only the latest Alarm time is displayed.
     */
    public void setAlarmTime(String AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    /**
     * Get Task name. 
     * @return TaskName Task name.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
     * @param TaskName Task name.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Instance data time of the task. 
     * @return CurRunDate Instance data time of the task.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Instance data time of the task.
     * @param CurRunDate Instance data time of the task.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Indicates the Alarm cause. 
     * @return AlarmReason Indicates the Alarm cause.
     */
    public String getAlarmReason() {
        return this.AlarmReason;
    }

    /**
     * Set Indicates the Alarm cause.
     * @param AlarmReason Indicates the Alarm cause.
     */
    public void setAlarmReason(String AlarmReason) {
        this.AlarmReason = AlarmReason;
    }

    /**
     * Get Alarm level. 1. ordinary, 2. important, 3. critical. 
     * @return AlarmLevel Alarm level. 1. ordinary, 2. important, 3. critical.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. 1. ordinary, 2. important, 3. critical.
     * @param AlarmLevel Alarm level. 1. ordinary, 2. important, 3. critical.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Specifies the Id of the Alarm rule. 
     * @return AlarmRuleId Specifies the Id of the Alarm rule.
     */
    public String getAlarmRuleId() {
        return this.AlarmRuleId;
    }

    /**
     * Set Specifies the Id of the Alarm rule.
     * @param AlarmRuleId Specifies the Id of the Alarm rule.
     */
    public void setAlarmRuleId(String AlarmRuleId) {
        this.AlarmRuleId = AlarmRuleId;
    }

    /**
     * Get Alarm channel specifies the notification methods: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail). 
     * @return AlarmWays Alarm channel specifies the notification methods: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail).
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set Alarm channel specifies the notification methods: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail).
     * @param AlarmWays Alarm channel specifies the notification methods: 1. mail, 2. sms, 3. wechat, 4. voice, 5. wecom, 6. Http, 7. wecom group, 8. lark group, 9. dingtalk group, 10. Slack group, 11. Teams group (default: 1. mail).
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get Alarm recipient 
     * @return AlarmRecipients Alarm recipient
     */
    public String [] getAlarmRecipients() {
        return this.AlarmRecipients;
    }

    /**
     * Set Alarm recipient
     * @param AlarmRecipients Alarm recipient
     */
    public void setAlarmRecipients(String [] AlarmRecipients) {
        this.AlarmRecipients = AlarmRecipients;
    }

    public AlarmMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmMessage(AlarmMessage source) {
        if (source.AlarmMessageId != null) {
            this.AlarmMessageId = new Long(source.AlarmMessageId);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new String(source.AlarmTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.AlarmReason != null) {
            this.AlarmReason = new String(source.AlarmReason);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmRuleId != null) {
            this.AlarmRuleId = new String(source.AlarmRuleId);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String[source.AlarmWays.length];
            for (int i = 0; i < source.AlarmWays.length; i++) {
                this.AlarmWays[i] = new String(source.AlarmWays[i]);
            }
        }
        if (source.AlarmRecipients != null) {
            this.AlarmRecipients = new String[source.AlarmRecipients.length];
            for (int i = 0; i < source.AlarmRecipients.length; i++) {
                this.AlarmRecipients[i] = new String(source.AlarmRecipients[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmMessageId", this.AlarmMessageId);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "AlarmReason", this.AlarmReason);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmRuleId", this.AlarmRuleId);
        this.setParamArraySimple(map, prefix + "AlarmWays.", this.AlarmWays);
        this.setParamArraySimple(map, prefix + "AlarmRecipients.", this.AlarmRecipients);

    }
}

