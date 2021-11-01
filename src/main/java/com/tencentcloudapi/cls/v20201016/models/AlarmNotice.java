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

public class AlarmNotice extends AbstractModel{

    /**
    * Alarm notification template name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Alarm template type. Valid values:
<br><li> `Trigger`: alarm triggered
<br><li> `Recovery`: alarm cleared
<br><li> `All`: alarm triggered and alarm cleared
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Information of the recipient in alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * Callback information of alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * Alarm notification template ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Alarm notification template name 
     * @return Name Alarm notification template name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm notification template name
     * @param Name Alarm notification template name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Alarm template type. Valid values:
<br><li> `Trigger`: alarm triggered
<br><li> `Recovery`: alarm cleared
<br><li> `All`: alarm triggered and alarm cleared 
     * @return Type Alarm template type. Valid values:
<br><li> `Trigger`: alarm triggered
<br><li> `Recovery`: alarm cleared
<br><li> `All`: alarm triggered and alarm cleared
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Alarm template type. Valid values:
<br><li> `Trigger`: alarm triggered
<br><li> `Recovery`: alarm cleared
<br><li> `All`: alarm triggered and alarm cleared
     * @param Type Alarm template type. Valid values:
<br><li> `Trigger`: alarm triggered
<br><li> `Recovery`: alarm cleared
<br><li> `All`: alarm triggered and alarm cleared
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Information of the recipient in alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NoticeReceivers Information of the recipient in alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set Information of the recipient in alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NoticeReceivers Information of the recipient in alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get Callback information of alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WebCallbacks Callback information of alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set Callback information of alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WebCallbacks Callback information of alarm notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get Alarm notification template ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AlarmNoticeId Alarm notification template ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set Alarm notification template ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AlarmNoticeId Alarm notification template ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get Creation time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UpdateTime Last update time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UpdateTime Last update time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AlarmNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmNotice(AlarmNotice source) {
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
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

