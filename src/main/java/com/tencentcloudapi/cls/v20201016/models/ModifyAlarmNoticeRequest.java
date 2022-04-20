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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmNoticeRequest extends AbstractModel{

    /**
    * Notification group ID
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * Notification group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notification type. Valid values:
<li> `Trigger`: alarm triggered
<li> `Recovery`: alarm cleared
<li> `All`: alarm triggered and alarm cleared
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Notification recipient
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * API callback information (including WeCom)
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
     * Get Notification group ID 
     * @return AlarmNoticeId Notification group ID
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set Notification group ID
     * @param AlarmNoticeId Notification group ID
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get Notification group name 
     * @return Name Notification group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Notification group name
     * @param Name Notification group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Notification type. Valid values:
<li> `Trigger`: alarm triggered
<li> `Recovery`: alarm cleared
<li> `All`: alarm triggered and alarm cleared 
     * @return Type Notification type. Valid values:
<li> `Trigger`: alarm triggered
<li> `Recovery`: alarm cleared
<li> `All`: alarm triggered and alarm cleared
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Notification type. Valid values:
<li> `Trigger`: alarm triggered
<li> `Recovery`: alarm cleared
<li> `All`: alarm triggered and alarm cleared
     * @param Type Notification type. Valid values:
<li> `Trigger`: alarm triggered
<li> `Recovery`: alarm cleared
<li> `All`: alarm triggered and alarm cleared
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Notification recipient 
     * @return NoticeReceivers Notification recipient
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set Notification recipient
     * @param NoticeReceivers Notification recipient
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get API callback information (including WeCom) 
     * @return WebCallbacks API callback information (including WeCom)
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set API callback information (including WeCom)
     * @param WebCallbacks API callback information (including WeCom)
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    public ModifyAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmNoticeRequest(ModifyAlarmNoticeRequest source) {
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);

    }
}

