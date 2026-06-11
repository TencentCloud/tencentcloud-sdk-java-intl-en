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

public class AlarmNotice extends AbstractModel {

    /**
    * Alarm notification channel group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag information bound to the alarm notification channel group.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Alarm template type. Optional values:<br><li> Trigger - Alarm Trigger </li><br><li> Recovery - Alarm Recovery </li><br><li> All - Alarm Trigger and Alarm Recovery </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Alarm notification template recipient information.
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * Callback information of alarm notification template.
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * Alarm notification template ID.
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * Notification rules.
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
    * Login-free operation alarm switch.
Parameter value: 1: Turn off 2: Turn on (enabled by default)
    */
    @SerializedName("AlarmShieldStatus")
    @Expose
    private Long AlarmShieldStatus;

    /**
    * Call link domain name. It must start with http:// or https:// and must not end with /.
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * Shipping-related information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmNoticeDeliverConfig")
    @Expose
    private AlarmNoticeDeliverConfig AlarmNoticeDeliverConfig;

    /**
    * Creation time. Format: YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest update time. Format: YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Delivery log switch.

Parameter value:

1: Disabled

2: enable 

    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * Delivery log flag.

Parameter value:

1: Disabled

2: Enabled

3: Delivery exception
    */
    @SerializedName("DeliverFlag")
    @Expose
    private Long DeliverFlag;

    /**
    * Alarm silence status quantity information configured for a notification channel group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmShieldCount")
    @Expose
    private AlarmShieldCount AlarmShieldCount;

    /**
    * Unify the setting of custom callback parameters.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
    */
    @SerializedName("CallbackPrioritize")
    @Expose
    private Boolean CallbackPrioritize;

    /**
     * Get Alarm notification channel group name. 
     * @return Name Alarm notification channel group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm notification channel group name.
     * @param Name Alarm notification channel group name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag information bound to the alarm notification channel group. 
     * @return Tags Tag information bound to the alarm notification channel group.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information bound to the alarm notification channel group.
     * @param Tags Tag information bound to the alarm notification channel group.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Alarm template type. Optional values:<br><li> Trigger - Alarm Trigger </li><br><li> Recovery - Alarm Recovery </li><br><li> All - Alarm Trigger and Alarm Recovery </li> 
     * @return Type Alarm template type. Optional values:<br><li> Trigger - Alarm Trigger </li><br><li> Recovery - Alarm Recovery </li><br><li> All - Alarm Trigger and Alarm Recovery </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Alarm template type. Optional values:<br><li> Trigger - Alarm Trigger </li><br><li> Recovery - Alarm Recovery </li><br><li> All - Alarm Trigger and Alarm Recovery </li>
     * @param Type Alarm template type. Optional values:<br><li> Trigger - Alarm Trigger </li><br><li> Recovery - Alarm Recovery </li><br><li> All - Alarm Trigger and Alarm Recovery </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm notification template recipient information. 
     * @return NoticeReceivers Alarm notification template recipient information.
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set Alarm notification template recipient information.
     * @param NoticeReceivers Alarm notification template recipient information.
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get Callback information of alarm notification template. 
     * @return WebCallbacks Callback information of alarm notification template.
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set Callback information of alarm notification template.
     * @param WebCallbacks Callback information of alarm notification template.
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get Alarm notification template ID. 
     * @return AlarmNoticeId Alarm notification template ID.
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set Alarm notification template ID.
     * @param AlarmNoticeId Alarm notification template ID.
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get Notification rules. 
     * @return NoticeRules Notification rules.
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set Notification rules.
     * @param NoticeRules Notification rules.
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
    }

    /**
     * Get Login-free operation alarm switch.
Parameter value: 1: Turn off 2: Turn on (enabled by default) 
     * @return AlarmShieldStatus Login-free operation alarm switch.
Parameter value: 1: Turn off 2: Turn on (enabled by default)
     */
    public Long getAlarmShieldStatus() {
        return this.AlarmShieldStatus;
    }

    /**
     * Set Login-free operation alarm switch.
Parameter value: 1: Turn off 2: Turn on (enabled by default)
     * @param AlarmShieldStatus Login-free operation alarm switch.
Parameter value: 1: Turn off 2: Turn on (enabled by default)
     */
    public void setAlarmShieldStatus(Long AlarmShieldStatus) {
        this.AlarmShieldStatus = AlarmShieldStatus;
    }

    /**
     * Get Call link domain name. It must start with http:// or https:// and must not end with /. 
     * @return JumpDomain Call link domain name. It must start with http:// or https:// and must not end with /.
     */
    public String getJumpDomain() {
        return this.JumpDomain;
    }

    /**
     * Set Call link domain name. It must start with http:// or https:// and must not end with /.
     * @param JumpDomain Call link domain name. It must start with http:// or https:// and must not end with /.
     */
    public void setJumpDomain(String JumpDomain) {
        this.JumpDomain = JumpDomain;
    }

    /**
     * Get Shipping-related information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmNoticeDeliverConfig Shipping-related information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AlarmNoticeDeliverConfig getAlarmNoticeDeliverConfig() {
        return this.AlarmNoticeDeliverConfig;
    }

    /**
     * Set Shipping-related information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmNoticeDeliverConfig Shipping-related information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmNoticeDeliverConfig(AlarmNoticeDeliverConfig AlarmNoticeDeliverConfig) {
        this.AlarmNoticeDeliverConfig = AlarmNoticeDeliverConfig;
    }

    /**
     * Get Creation time. Format: YYYY-MM-DD HH:MM:SS 
     * @return CreateTime Creation time. Format: YYYY-MM-DD HH:MM:SS
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. Format: YYYY-MM-DD HH:MM:SS
     * @param CreateTime Creation time. Format: YYYY-MM-DD HH:MM:SS
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest update time. Format: YYYY-MM-DD HH:MM:SS 
     * @return UpdateTime Latest update time. Format: YYYY-MM-DD HH:MM:SS
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest update time. Format: YYYY-MM-DD HH:MM:SS
     * @param UpdateTime Latest update time. Format: YYYY-MM-DD HH:MM:SS
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Delivery log switch.

Parameter value:

1: Disabled

2: enable 
 
     * @return DeliverStatus Delivery log switch.

Parameter value:

1: Disabled

2: enable 

     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set Delivery log switch.

Parameter value:

1: Disabled

2: enable 

     * @param DeliverStatus Delivery log switch.

Parameter value:

1: Disabled

2: enable 

     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get Delivery log flag.

Parameter value:

1: Disabled

2: Enabled

3: Delivery exception 
     * @return DeliverFlag Delivery log flag.

Parameter value:

1: Disabled

2: Enabled

3: Delivery exception
     */
    public Long getDeliverFlag() {
        return this.DeliverFlag;
    }

    /**
     * Set Delivery log flag.

Parameter value:

1: Disabled

2: Enabled

3: Delivery exception
     * @param DeliverFlag Delivery log flag.

Parameter value:

1: Disabled

2: Enabled

3: Delivery exception
     */
    public void setDeliverFlag(Long DeliverFlag) {
        this.DeliverFlag = DeliverFlag;
    }

    /**
     * Get Alarm silence status quantity information configured for a notification channel group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmShieldCount Alarm silence status quantity information configured for a notification channel group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AlarmShieldCount getAlarmShieldCount() {
        return this.AlarmShieldCount;
    }

    /**
     * Set Alarm silence status quantity information configured for a notification channel group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmShieldCount Alarm silence status quantity information configured for a notification channel group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmShieldCount(AlarmShieldCount AlarmShieldCount) {
        this.AlarmShieldCount = AlarmShieldCount;
    }

    /**
     * Get Unify the setting of custom callback parameters.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy. 
     * @return CallbackPrioritize Unify the setting of custom callback parameters.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
     */
    public Boolean getCallbackPrioritize() {
        return this.CallbackPrioritize;
    }

    /**
     * Set Unify the setting of custom callback parameters.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
     * @param CallbackPrioritize Unify the setting of custom callback parameters.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
     */
    public void setCallbackPrioritize(Boolean CallbackPrioritize) {
        this.CallbackPrioritize = CallbackPrioritize;
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        if (source.NoticeRules != null) {
            this.NoticeRules = new NoticeRule[source.NoticeRules.length];
            for (int i = 0; i < source.NoticeRules.length; i++) {
                this.NoticeRules[i] = new NoticeRule(source.NoticeRules[i]);
            }
        }
        if (source.AlarmShieldStatus != null) {
            this.AlarmShieldStatus = new Long(source.AlarmShieldStatus);
        }
        if (source.JumpDomain != null) {
            this.JumpDomain = new String(source.JumpDomain);
        }
        if (source.AlarmNoticeDeliverConfig != null) {
            this.AlarmNoticeDeliverConfig = new AlarmNoticeDeliverConfig(source.AlarmNoticeDeliverConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new Long(source.DeliverStatus);
        }
        if (source.DeliverFlag != null) {
            this.DeliverFlag = new Long(source.DeliverFlag);
        }
        if (source.AlarmShieldCount != null) {
            this.AlarmShieldCount = new AlarmShieldCount(source.AlarmShieldCount);
        }
        if (source.CallbackPrioritize != null) {
            this.CallbackPrioritize = new Boolean(source.CallbackPrioritize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamArrayObj(map, prefix + "NoticeRules.", this.NoticeRules);
        this.setParamSimple(map, prefix + "AlarmShieldStatus", this.AlarmShieldStatus);
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamObj(map, prefix + "AlarmNoticeDeliverConfig.", this.AlarmNoticeDeliverConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamSimple(map, prefix + "DeliverFlag", this.DeliverFlag);
        this.setParamObj(map, prefix + "AlarmShieldCount.", this.AlarmShieldCount);
        this.setParamSimple(map, prefix + "CallbackPrioritize", this.CallbackPrioritize);

    }
}

