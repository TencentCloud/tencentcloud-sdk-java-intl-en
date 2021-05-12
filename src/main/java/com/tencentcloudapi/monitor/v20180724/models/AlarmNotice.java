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

public class AlarmNotice extends AbstractModel{

    /**
    * Alarm notification template ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Alarm notification template name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Last modified time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Last modified by
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedBy")
    @Expose
    private String UpdatedBy;

    /**
    * Alarm notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeType")
    @Expose
    private String NoticeType;

    /**
    * User notification list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserNotices")
    @Expose
    private UserNotice [] UserNotices;

    /**
    * Callback notification list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("URLNotices")
    @Expose
    private URLNotice [] URLNotices;

    /**
    * Whether it is the system default notification template. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPreset")
    @Expose
    private Long IsPreset;

    /**
    * Notification language. Valid values: zh-CN (Chinese), en-US (English)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeLanguage")
    @Expose
    private String NoticeLanguage;

    /**
    * List of IDs of the alarm policies bound to alarm notification template
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
     * Get Alarm notification template ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Id Alarm notification template ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Alarm notification template ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Id Alarm notification template ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Alarm notification template name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name Alarm notification template name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm notification template name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name Alarm notification template name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Last modified time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Last modified time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Last modified time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Last modified time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Last modified by
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedBy Last modified by
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedBy() {
        return this.UpdatedBy;
    }

    /**
     * Set Last modified by
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdatedBy Last modified by
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedBy(String UpdatedBy) {
        this.UpdatedBy = UpdatedBy;
    }

    /**
     * Get Alarm notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NoticeType Alarm notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set Alarm notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NoticeType Alarm notification type. Valid values: ALARM (for unresolved alarms), OK (for resolved alarms), ALL (for all alarms)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNoticeType(String NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get User notification list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserNotices User notification list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UserNotice [] getUserNotices() {
        return this.UserNotices;
    }

    /**
     * Set User notification list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserNotices User notification list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserNotices(UserNotice [] UserNotices) {
        this.UserNotices = UserNotices;
    }

    /**
     * Get Callback notification list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return URLNotices Callback notification list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public URLNotice [] getURLNotices() {
        return this.URLNotices;
    }

    /**
     * Set Callback notification list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param URLNotices Callback notification list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setURLNotices(URLNotice [] URLNotices) {
        this.URLNotices = URLNotices;
    }

    /**
     * Get Whether it is the system default notification template. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsPreset Whether it is the system default notification template. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsPreset() {
        return this.IsPreset;
    }

    /**
     * Set Whether it is the system default notification template. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsPreset Whether it is the system default notification template. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPreset(Long IsPreset) {
        this.IsPreset = IsPreset;
    }

    /**
     * Get Notification language. Valid values: zh-CN (Chinese), en-US (English)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NoticeLanguage Notification language. Valid values: zh-CN (Chinese), en-US (English)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNoticeLanguage() {
        return this.NoticeLanguage;
    }

    /**
     * Set Notification language. Valid values: zh-CN (Chinese), en-US (English)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NoticeLanguage Notification language. Valid values: zh-CN (Chinese), en-US (English)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNoticeLanguage(String NoticeLanguage) {
        this.NoticeLanguage = NoticeLanguage;
    }

    /**
     * Get List of IDs of the alarm policies bound to alarm notification template
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PolicyIds List of IDs of the alarm policies bound to alarm notification template
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set List of IDs of the alarm policies bound to alarm notification template
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PolicyIds List of IDs of the alarm policies bound to alarm notification template
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public AlarmNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmNotice(AlarmNotice source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.UpdatedBy != null) {
            this.UpdatedBy = new String(source.UpdatedBy);
        }
        if (source.NoticeType != null) {
            this.NoticeType = new String(source.NoticeType);
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
        if (source.IsPreset != null) {
            this.IsPreset = new Long(source.IsPreset);
        }
        if (source.NoticeLanguage != null) {
            this.NoticeLanguage = new String(source.NoticeLanguage);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "UpdatedBy", this.UpdatedBy);
        this.setParamSimple(map, prefix + "NoticeType", this.NoticeType);
        this.setParamArrayObj(map, prefix + "UserNotices.", this.UserNotices);
        this.setParamArrayObj(map, prefix + "URLNotices.", this.URLNotices);
        this.setParamSimple(map, prefix + "IsPreset", this.IsPreset);
        this.setParamSimple(map, prefix + "NoticeLanguage", this.NoticeLanguage);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

