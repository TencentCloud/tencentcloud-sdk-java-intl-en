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

public class NoticeContent extends AbstractModel {

    /**
    * Channel type

Email: mail; Sms: Sms; WeChat: WeChat; Phone: call; WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Alarm trigger notification content template.
    */
    @SerializedName("TriggerContent")
    @Expose
    private NoticeContentInfo TriggerContent;

    /**
    * Alarm clearing notification content template.
    */
    @SerializedName("RecoveryContent")
    @Expose
    private NoticeContentInfo RecoveryContent;

    /**
     * Get Channel type

Email: mail; Sms: Sms; WeChat: WeChat; Phone: call; WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback 
     * @return Type Channel type

Email: mail; Sms: Sms; WeChat: WeChat; Phone: call; WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Channel type

Email: mail; Sms: Sms; WeChat: WeChat; Phone: call; WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback
     * @param Type Channel type

Email: mail; Sms: Sms; WeChat: WeChat; Phone: call; WeCom: WeCom; DingTalk: DingTalk; Lark: Lark; Http: Custom Callback
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm trigger notification content template. 
     * @return TriggerContent Alarm trigger notification content template.
     */
    public NoticeContentInfo getTriggerContent() {
        return this.TriggerContent;
    }

    /**
     * Set Alarm trigger notification content template.
     * @param TriggerContent Alarm trigger notification content template.
     */
    public void setTriggerContent(NoticeContentInfo TriggerContent) {
        this.TriggerContent = TriggerContent;
    }

    /**
     * Get Alarm clearing notification content template. 
     * @return RecoveryContent Alarm clearing notification content template.
     */
    public NoticeContentInfo getRecoveryContent() {
        return this.RecoveryContent;
    }

    /**
     * Set Alarm clearing notification content template.
     * @param RecoveryContent Alarm clearing notification content template.
     */
    public void setRecoveryContent(NoticeContentInfo RecoveryContent) {
        this.RecoveryContent = RecoveryContent;
    }

    public NoticeContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContent(NoticeContent source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TriggerContent != null) {
            this.TriggerContent = new NoticeContentInfo(source.TriggerContent);
        }
        if (source.RecoveryContent != null) {
            this.RecoveryContent = new NoticeContentInfo(source.RecoveryContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "TriggerContent.", this.TriggerContent);
        this.setParamObj(map, prefix + "RecoveryContent.", this.RecoveryContent);

    }
}

