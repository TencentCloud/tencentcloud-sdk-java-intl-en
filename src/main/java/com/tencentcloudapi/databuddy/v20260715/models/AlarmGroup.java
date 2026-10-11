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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmGroup extends AbstractModel {

    /**
    * <p>Notification channel ID, which can be obtained through the notification channel APIs of the basic platform</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>Notification channel name, which can be a user group name or email address</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>Whether to enable the email channel. Default value: false</p>
    */
    @SerializedName("IsEmailChannel")
    @Expose
    private Boolean IsEmailChannel;

    /**
    * <p>Alarm condition list. Value: <br>START: Start up<br>SUCCESS: Success<br>FAILURE: Failure<br>MONITOR_INDICATOR_ALARM: Monitoring metric alarm</p>
    */
    @SerializedName("AlarmConditions")
    @Expose
    private String [] AlarmConditions;

    /**
    * <p>Notification channel type. Value: 0 unspecified, 1 Email, 2 Webhook, 3 Teams, 4 Slack</p>
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
     * Get <p>Notification channel ID, which can be obtained through the notification channel APIs of the basic platform</p> 
     * @return ChannelId <p>Notification channel ID, which can be obtained through the notification channel APIs of the basic platform</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>Notification channel ID, which can be obtained through the notification channel APIs of the basic platform</p>
     * @param ChannelId <p>Notification channel ID, which can be obtained through the notification channel APIs of the basic platform</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>Notification channel name, which can be a user group name or email address</p> 
     * @return ChannelName <p>Notification channel name, which can be a user group name or email address</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>Notification channel name, which can be a user group name or email address</p>
     * @param ChannelName <p>Notification channel name, which can be a user group name or email address</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>Whether to enable the email channel. Default value: false</p> 
     * @return IsEmailChannel <p>Whether to enable the email channel. Default value: false</p>
     */
    public Boolean getIsEmailChannel() {
        return this.IsEmailChannel;
    }

    /**
     * Set <p>Whether to enable the email channel. Default value: false</p>
     * @param IsEmailChannel <p>Whether to enable the email channel. Default value: false</p>
     */
    public void setIsEmailChannel(Boolean IsEmailChannel) {
        this.IsEmailChannel = IsEmailChannel;
    }

    /**
     * Get <p>Alarm condition list. Value: <br>START: Start up<br>SUCCESS: Success<br>FAILURE: Failure<br>MONITOR_INDICATOR_ALARM: Monitoring metric alarm</p> 
     * @return AlarmConditions <p>Alarm condition list. Value: <br>START: Start up<br>SUCCESS: Success<br>FAILURE: Failure<br>MONITOR_INDICATOR_ALARM: Monitoring metric alarm</p>
     */
    public String [] getAlarmConditions() {
        return this.AlarmConditions;
    }

    /**
     * Set <p>Alarm condition list. Value: <br>START: Start up<br>SUCCESS: Success<br>FAILURE: Failure<br>MONITOR_INDICATOR_ALARM: Monitoring metric alarm</p>
     * @param AlarmConditions <p>Alarm condition list. Value: <br>START: Start up<br>SUCCESS: Success<br>FAILURE: Failure<br>MONITOR_INDICATOR_ALARM: Monitoring metric alarm</p>
     */
    public void setAlarmConditions(String [] AlarmConditions) {
        this.AlarmConditions = AlarmConditions;
    }

    /**
     * Get <p>Notification channel type. Value: 0 unspecified, 1 Email, 2 Webhook, 3 Teams, 4 Slack</p> 
     * @return ChannelType <p>Notification channel type. Value: 0 unspecified, 1 Email, 2 Webhook, 3 Teams, 4 Slack</p>
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set <p>Notification channel type. Value: 0 unspecified, 1 Email, 2 Webhook, 3 Teams, 4 Slack</p>
     * @param ChannelType <p>Notification channel type. Value: 0 unspecified, 1 Email, 2 Webhook, 3 Teams, 4 Slack</p>
     */
    public void setChannelType(Long ChannelType) {
        this.ChannelType = ChannelType;
    }

    public AlarmGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmGroup(AlarmGroup source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.IsEmailChannel != null) {
            this.IsEmailChannel = new Boolean(source.IsEmailChannel);
        }
        if (source.AlarmConditions != null) {
            this.AlarmConditions = new String[source.AlarmConditions.length];
            for (int i = 0; i < source.AlarmConditions.length; i++) {
                this.AlarmConditions[i] = new String(source.AlarmConditions[i]);
            }
        }
        if (source.ChannelType != null) {
            this.ChannelType = new Long(source.ChannelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "IsEmailChannel", this.IsEmailChannel);
        this.setParamArraySimple(map, prefix + "AlarmConditions.", this.AlarmConditions);
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);

    }
}

