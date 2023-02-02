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

public class ModifyAlarmNoticeRequest extends AbstractModel{

    /**
    * Module name. Enter "monitor" here
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Alarm notification rule name, which can contain up to 60 characters
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
    */
    @SerializedName("NoticeType")
    @Expose
    private String NoticeType;

    /**
    * Notification language. Valid values: zh-CN (Chinese), en-US (English)
    */
    @SerializedName("NoticeLanguage")
    @Expose
    private String NoticeLanguage;

    /**
    * Alarm notification template ID
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * User notifications (up to 5)
    */
    @SerializedName("UserNotices")
    @Expose
    private UserNotice [] UserNotices;

    /**
    * Callback notifications (up to 3)
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
    * The operation of pushing alarm notifications to CLS. Up to one CLS log topic can be configured.
    */
    @SerializedName("CLSNotices")
    @Expose
    private CLSNotice [] CLSNotices;

    /**
    * List of IDs of the alerting rules bound to an alarm notification template
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
     * Get Module name. Enter "monitor" here 
     * @return Module Module name. Enter "monitor" here
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module name. Enter "monitor" here
     * @param Module Module name. Enter "monitor" here
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Alarm notification rule name, which can contain up to 60 characters 
     * @return Name Alarm notification rule name, which can contain up to 60 characters
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm notification rule name, which can contain up to 60 characters
     * @param Name Alarm notification rule name, which can contain up to 60 characters
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms) 
     * @return NoticeType Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
     */
    public String getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
     * @param NoticeType Notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
     */
    public void setNoticeType(String NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get Notification language. Valid values: zh-CN (Chinese), en-US (English) 
     * @return NoticeLanguage Notification language. Valid values: zh-CN (Chinese), en-US (English)
     */
    public String getNoticeLanguage() {
        return this.NoticeLanguage;
    }

    /**
     * Set Notification language. Valid values: zh-CN (Chinese), en-US (English)
     * @param NoticeLanguage Notification language. Valid values: zh-CN (Chinese), en-US (English)
     */
    public void setNoticeLanguage(String NoticeLanguage) {
        this.NoticeLanguage = NoticeLanguage;
    }

    /**
     * Get Alarm notification template ID 
     * @return NoticeId Alarm notification template ID
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set Alarm notification template ID
     * @param NoticeId Alarm notification template ID
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get User notifications (up to 5) 
     * @return UserNotices User notifications (up to 5)
     */
    public UserNotice [] getUserNotices() {
        return this.UserNotices;
    }

    /**
     * Set User notifications (up to 5)
     * @param UserNotices User notifications (up to 5)
     */
    public void setUserNotices(UserNotice [] UserNotices) {
        this.UserNotices = UserNotices;
    }

    /**
     * Get Callback notifications (up to 3) 
     * @return URLNotices Callback notifications (up to 3)
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set Callback notifications (up to 3)
     * @param URLNotices Callback notifications (up to 3)
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
    }

    /**
     * Get The operation of pushing alarm notifications to CLS. Up to one CLS log topic can be configured. 
     * @return CLSNotices The operation of pushing alarm notifications to CLS. Up to one CLS log topic can be configured.
     */
    public CLSNotice [] getCLSNotices() {
        return this.CLSNotices;
    }

    /**
     * Set The operation of pushing alarm notifications to CLS. Up to one CLS log topic can be configured.
     * @param CLSNotices The operation of pushing alarm notifications to CLS. Up to one CLS log topic can be configured.
     */
    public void setCLSNotices(CLSNotice [] CLSNotices) {
        this.CLSNotices = CLSNotices;
    }

    /**
     * Get List of IDs of the alerting rules bound to an alarm notification template 
     * @return PolicyIds List of IDs of the alerting rules bound to an alarm notification template
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set List of IDs of the alerting rules bound to an alarm notification template
     * @param PolicyIds List of IDs of the alerting rules bound to an alarm notification template
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public ModifyAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmNoticeRequest(ModifyAlarmNoticeRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NoticeType != null) {
            this.NoticeType = new String(source.NoticeType);
        }
        if (source.NoticeLanguage != null) {
            this.NoticeLanguage = new String(source.NoticeLanguage);
        }
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.UserNotices != null) {
            this.UserNotices = new UserNotice[source.UserNotices.length];
            for (int i = 0; i < source.UserNotices.length; i++) {
                this.UserNotices[i] = new UserNotice(source.UserNotices[i]);
            }
        }
        if (source.URLNotices != null) {
            this.URLNotices = new URLNotice[source.URLNotices.length];
            for (int i = 0; i < source.URLNotices.length; i++) {
                this.URLNotices[i] = new URLNotice(source.URLNotices[i]);
            }
        }
        if (source.CLSNotices != null) {
            this.CLSNotices = new CLSNotice[source.CLSNotices.length];
            for (int i = 0; i < source.CLSNotices.length; i++) {
                this.CLSNotices[i] = new CLSNotice(source.CLSNotices[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NoticeType", this.NoticeType);
        this.setParamSimple(map, prefix + "NoticeLanguage", this.NoticeLanguage);
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamArrayObj(map, prefix + "UserNotices.", this.UserNotices);
        this.setParamArrayObj(map, prefix + "URLNotices.", this.URLNotices);
        this.setParamArrayObj(map, prefix + "CLSNotices.", this.CLSNotices);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

