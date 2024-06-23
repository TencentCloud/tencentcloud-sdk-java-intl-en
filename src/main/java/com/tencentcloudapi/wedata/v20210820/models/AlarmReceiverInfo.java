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

public class AlarmReceiverInfo extends AbstractModel {

    /**
    * Alert ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Alarm Recipient ID
    */
    @SerializedName("AlarmReceiver")
    @Expose
    private String AlarmReceiver;

    /**
    * Email,0: Not set,1: Success,2: Failure
    */
    @SerializedName("Email")
    @Expose
    private Long Email;

    /**
    * SMS,0: Not set,1: Success,2: Failure
    */
    @SerializedName("Sms")
    @Expose
    private Long Sms;

    /**
    * WeChat,0: Not set,1: Success,2: Failure
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * Telephone,0: Not set,1: Success,2: Failure
    */
    @SerializedName("Voice")
    @Expose
    private Long Voice;

    /**
    * WeCom,0: Not set,1: Success,2: Failure
    */
    @SerializedName("Wecom")
    @Expose
    private Long Wecom;

    /**
    * http,0: Not set,1: Success,2: Failure
    */
    @SerializedName("Http")
    @Expose
    private Long Http;

    /**
    * Enterprise WeChat group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WecomGroup")
    @Expose
    private Long WecomGroup;

    /**
    * FeiShu Group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LarkGroup")
    @Expose
    private Long LarkGroup;

    /**
     * Get Alert ID 
     * @return AlarmId Alert ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set Alert ID
     * @param AlarmId Alert ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get Alarm Recipient ID 
     * @return AlarmReceiver Alarm Recipient ID
     */
    public String getAlarmReceiver() {
        return this.AlarmReceiver;
    }

    /**
     * Set Alarm Recipient ID
     * @param AlarmReceiver Alarm Recipient ID
     */
    public void setAlarmReceiver(String AlarmReceiver) {
        this.AlarmReceiver = AlarmReceiver;
    }

    /**
     * Get Email,0: Not set,1: Success,2: Failure 
     * @return Email Email,0: Not set,1: Success,2: Failure
     */
    public Long getEmail() {
        return this.Email;
    }

    /**
     * Set Email,0: Not set,1: Success,2: Failure
     * @param Email Email,0: Not set,1: Success,2: Failure
     */
    public void setEmail(Long Email) {
        this.Email = Email;
    }

    /**
     * Get SMS,0: Not set,1: Success,2: Failure 
     * @return Sms SMS,0: Not set,1: Success,2: Failure
     */
    public Long getSms() {
        return this.Sms;
    }

    /**
     * Set SMS,0: Not set,1: Success,2: Failure
     * @param Sms SMS,0: Not set,1: Success,2: Failure
     */
    public void setSms(Long Sms) {
        this.Sms = Sms;
    }

    /**
     * Get WeChat,0: Not set,1: Success,2: Failure 
     * @return Wechat WeChat,0: Not set,1: Success,2: Failure
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set WeChat,0: Not set,1: Success,2: Failure
     * @param Wechat WeChat,0: Not set,1: Success,2: Failure
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get Telephone,0: Not set,1: Success,2: Failure 
     * @return Voice Telephone,0: Not set,1: Success,2: Failure
     */
    public Long getVoice() {
        return this.Voice;
    }

    /**
     * Set Telephone,0: Not set,1: Success,2: Failure
     * @param Voice Telephone,0: Not set,1: Success,2: Failure
     */
    public void setVoice(Long Voice) {
        this.Voice = Voice;
    }

    /**
     * Get WeCom,0: Not set,1: Success,2: Failure 
     * @return Wecom WeCom,0: Not set,1: Success,2: Failure
     */
    public Long getWecom() {
        return this.Wecom;
    }

    /**
     * Set WeCom,0: Not set,1: Success,2: Failure
     * @param Wecom WeCom,0: Not set,1: Success,2: Failure
     */
    public void setWecom(Long Wecom) {
        this.Wecom = Wecom;
    }

    /**
     * Get http,0: Not set,1: Success,2: Failure 
     * @return Http http,0: Not set,1: Success,2: Failure
     */
    public Long getHttp() {
        return this.Http;
    }

    /**
     * Set http,0: Not set,1: Success,2: Failure
     * @param Http http,0: Not set,1: Success,2: Failure
     */
    public void setHttp(Long Http) {
        this.Http = Http;
    }

    /**
     * Get Enterprise WeChat group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WecomGroup Enterprise WeChat group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getWecomGroup() {
        return this.WecomGroup;
    }

    /**
     * Set Enterprise WeChat group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WecomGroup Enterprise WeChat group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWecomGroup(Long WecomGroup) {
        this.WecomGroup = WecomGroup;
    }

    /**
     * Get FeiShu Group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LarkGroup FeiShu Group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLarkGroup() {
        return this.LarkGroup;
    }

    /**
     * Set FeiShu Group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LarkGroup FeiShu Group,0: Not set,1: Success,2: Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLarkGroup(Long LarkGroup) {
        this.LarkGroup = LarkGroup;
    }

    public AlarmReceiverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmReceiverInfo(AlarmReceiverInfo source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.AlarmReceiver != null) {
            this.AlarmReceiver = new String(source.AlarmReceiver);
        }
        if (source.Email != null) {
            this.Email = new Long(source.Email);
        }
        if (source.Sms != null) {
            this.Sms = new Long(source.Sms);
        }
        if (source.Wechat != null) {
            this.Wechat = new Long(source.Wechat);
        }
        if (source.Voice != null) {
            this.Voice = new Long(source.Voice);
        }
        if (source.Wecom != null) {
            this.Wecom = new Long(source.Wecom);
        }
        if (source.Http != null) {
            this.Http = new Long(source.Http);
        }
        if (source.WecomGroup != null) {
            this.WecomGroup = new Long(source.WecomGroup);
        }
        if (source.LarkGroup != null) {
            this.LarkGroup = new Long(source.LarkGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "AlarmReceiver", this.AlarmReceiver);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Sms", this.Sms);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);
        this.setParamSimple(map, prefix + "Voice", this.Voice);
        this.setParamSimple(map, prefix + "Wecom", this.Wecom);
        this.setParamSimple(map, prefix + "Http", this.Http);
        this.setParamSimple(map, prefix + "WecomGroup", this.WecomGroup);
        this.setParamSimple(map, prefix + "LarkGroup", this.LarkGroup);

    }
}

