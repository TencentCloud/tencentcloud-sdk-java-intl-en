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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmInfo extends AbstractModel {

    /**
    * Associated Task ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String TaskIds;

    /**
    * Alert Categories; 'failure' indicates failure alert; 'overtime' indicates timeout alert
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * Alert Method; 'SMS' indicates SMS; 'Email' indicates email; 'HTTP' indicates an interface method; 'Wechat' indicates WeChat method
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * Alert Recipient, multiple recipients separated by ;
    */
    @SerializedName("AlarmRecipient")
    @Expose
    private String AlarmRecipient;

    /**
    * Alert Recipient ID, multiple recipient IDs separated by ;
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * Estimated Running Hours, value range 0-23
    */
    @SerializedName("Hours")
    @Expose
    private Long Hours;

    /**
    * Estimated Running Minutes, value range 0-59
    */
    @SerializedName("Minutes")
    @Expose
    private Long Minutes;

    /**
    * Alert Trigger Moment; '1' means first run failure; '2' means failure after all retries;
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Alert Information ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Alert Status Setting; '1' indicates available; '0' indicates unavailable, default is available
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Associated Task ID 
     * @return TaskIds Associated Task ID
     */
    public String getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Associated Task ID
     * @param TaskIds Associated Task ID
     */
    public void setTaskIds(String TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Alert Categories; 'failure' indicates failure alert; 'overtime' indicates timeout alert 
     * @return AlarmType Alert Categories; 'failure' indicates failure alert; 'overtime' indicates timeout alert
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alert Categories; 'failure' indicates failure alert; 'overtime' indicates timeout alert
     * @param AlarmType Alert Categories; 'failure' indicates failure alert; 'overtime' indicates timeout alert
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Alert Method; 'SMS' indicates SMS; 'Email' indicates email; 'HTTP' indicates an interface method; 'Wechat' indicates WeChat method 
     * @return AlarmWay Alert Method; 'SMS' indicates SMS; 'Email' indicates email; 'HTTP' indicates an interface method; 'Wechat' indicates WeChat method
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set Alert Method; 'SMS' indicates SMS; 'Email' indicates email; 'HTTP' indicates an interface method; 'Wechat' indicates WeChat method
     * @param AlarmWay Alert Method; 'SMS' indicates SMS; 'Email' indicates email; 'HTTP' indicates an interface method; 'Wechat' indicates WeChat method
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get Alert Recipient, multiple recipients separated by ; 
     * @return AlarmRecipient Alert Recipient, multiple recipients separated by ;
     */
    public String getAlarmRecipient() {
        return this.AlarmRecipient;
    }

    /**
     * Set Alert Recipient, multiple recipients separated by ;
     * @param AlarmRecipient Alert Recipient, multiple recipients separated by ;
     */
    public void setAlarmRecipient(String AlarmRecipient) {
        this.AlarmRecipient = AlarmRecipient;
    }

    /**
     * Get Alert Recipient ID, multiple recipient IDs separated by ; 
     * @return AlarmRecipientId Alert Recipient ID, multiple recipient IDs separated by ;
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set Alert Recipient ID, multiple recipient IDs separated by ;
     * @param AlarmRecipientId Alert Recipient ID, multiple recipient IDs separated by ;
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get Estimated Running Hours, value range 0-23 
     * @return Hours Estimated Running Hours, value range 0-23
     */
    public Long getHours() {
        return this.Hours;
    }

    /**
     * Set Estimated Running Hours, value range 0-23
     * @param Hours Estimated Running Hours, value range 0-23
     */
    public void setHours(Long Hours) {
        this.Hours = Hours;
    }

    /**
     * Get Estimated Running Minutes, value range 0-59 
     * @return Minutes Estimated Running Minutes, value range 0-59
     */
    public Long getMinutes() {
        return this.Minutes;
    }

    /**
     * Set Estimated Running Minutes, value range 0-59
     * @param Minutes Estimated Running Minutes, value range 0-59
     */
    public void setMinutes(Long Minutes) {
        this.Minutes = Minutes;
    }

    /**
     * Get Alert Trigger Moment; '1' means first run failure; '2' means failure after all retries; 
     * @return TriggerType Alert Trigger Moment; '1' means first run failure; '2' means failure after all retries;
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Alert Trigger Moment; '1' means first run failure; '2' means failure after all retries;
     * @param TriggerType Alert Trigger Moment; '1' means first run failure; '2' means failure after all retries;
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Alert Information ID 
     * @return AlarmId Alert Information ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set Alert Information ID
     * @param AlarmId Alert Information ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get Alert Status Setting; '1' indicates available; '0' indicates unavailable, default is available 
     * @return Status Alert Status Setting; '1' indicates available; '0' indicates unavailable, default is available
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Alert Status Setting; '1' indicates available; '0' indicates unavailable, default is available
     * @param Status Alert Status Setting; '1' indicates available; '0' indicates unavailable, default is available
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmInfo(AlarmInfo source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String(source.TaskIds);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.AlarmRecipient != null) {
            this.AlarmRecipient = new String(source.AlarmRecipient);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.Hours != null) {
            this.Hours = new Long(source.Hours);
        }
        if (source.Minutes != null) {
            this.Minutes = new Long(source.Minutes);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskIds", this.TaskIds);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamSimple(map, prefix + "AlarmRecipient", this.AlarmRecipient);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "Hours", this.Hours);
        this.setParamSimple(map, prefix + "Minutes", this.Minutes);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

