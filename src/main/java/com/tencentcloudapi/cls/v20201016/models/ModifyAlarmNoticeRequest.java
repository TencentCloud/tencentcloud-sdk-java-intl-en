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

public class ModifyAlarmNoticeRequest extends AbstractModel {

    /**
    * Notification channel group ID. Obtain the notification channel group ID by searching the notification channel group list (https://www.tencentcloud.com/document/api/614/56462?from_cn_redirect=1).
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * Tag description list. Tags can be bound to corresponding notification channel groups at the same time by specifying this parameter. It supports up to 10 tag key-value pairs, which cannot be duplicate.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Notification group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notification type. Optional Values:
<li> Trigger - Alarm trigger</li>
<li> Recovery - Alarm recovery</li>
<li> All - Alarm triggered and alarm recovery</li>
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
    * API callback information (including WeCom).
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * Notification rulesNote: - Type, NoticeReceivers, and WebCallbacks are one set of configurations, while NoticeRules is another set of configurations. The two sets are mutually exclusive.- Submitting one set of data will nullify the other set.
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
    * Call link domain name. It must start with http:// or https:// and must not end with /.
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * Delivery log switch.

Parameter value:
1: disabled.

2: Enable 

    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * Log shipping configuration.
    */
    @SerializedName("DeliverConfig")
    @Expose
    private DeliverConfig DeliverConfig;

    /**
    * Login-free operation alarm switch.

Parameter value: 
1: disabled
2: Enable (enabled by default)
    */
    @SerializedName("AlarmShieldStatus")
    @Expose
    private Long AlarmShieldStatus;

    /**
    * Unify the custom callback parameter settings.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
    */
    @SerializedName("CallbackPrioritize")
    @Expose
    private Boolean CallbackPrioritize;

    /**
     * Get Notification channel group ID. Obtain the notification channel group ID by searching the notification channel group list (https://www.tencentcloud.com/document/api/614/56462?from_cn_redirect=1). 
     * @return AlarmNoticeId Notification channel group ID. Obtain the notification channel group ID by searching the notification channel group list (https://www.tencentcloud.com/document/api/614/56462?from_cn_redirect=1).
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set Notification channel group ID. Obtain the notification channel group ID by searching the notification channel group list (https://www.tencentcloud.com/document/api/614/56462?from_cn_redirect=1).
     * @param AlarmNoticeId Notification channel group ID. Obtain the notification channel group ID by searching the notification channel group list (https://www.tencentcloud.com/document/api/614/56462?from_cn_redirect=1).
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get Tag description list. Tags can be bound to corresponding notification channel groups at the same time by specifying this parameter. It supports up to 10 tag key-value pairs, which cannot be duplicate. 
     * @return Tags Tag description list. Tags can be bound to corresponding notification channel groups at the same time by specifying this parameter. It supports up to 10 tag key-value pairs, which cannot be duplicate.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list. Tags can be bound to corresponding notification channel groups at the same time by specifying this parameter. It supports up to 10 tag key-value pairs, which cannot be duplicate.
     * @param Tags Tag description list. Tags can be bound to corresponding notification channel groups at the same time by specifying this parameter. It supports up to 10 tag key-value pairs, which cannot be duplicate.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
     * Get Notification type. Optional Values:
<li> Trigger - Alarm trigger</li>
<li> Recovery - Alarm recovery</li>
<li> All - Alarm triggered and alarm recovery</li> 
     * @return Type Notification type. Optional Values:
<li> Trigger - Alarm trigger</li>
<li> Recovery - Alarm recovery</li>
<li> All - Alarm triggered and alarm recovery</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Notification type. Optional Values:
<li> Trigger - Alarm trigger</li>
<li> Recovery - Alarm recovery</li>
<li> All - Alarm triggered and alarm recovery</li>
     * @param Type Notification type. Optional Values:
<li> Trigger - Alarm trigger</li>
<li> Recovery - Alarm recovery</li>
<li> All - Alarm triggered and alarm recovery</li>
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
     * Get API callback information (including WeCom). 
     * @return WebCallbacks API callback information (including WeCom).
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set API callback information (including WeCom).
     * @param WebCallbacks API callback information (including WeCom).
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get Notification rulesNote: - Type, NoticeReceivers, and WebCallbacks are one set of configurations, while NoticeRules is another set of configurations. The two sets are mutually exclusive.- Submitting one set of data will nullify the other set. 
     * @return NoticeRules Notification rulesNote: - Type, NoticeReceivers, and WebCallbacks are one set of configurations, while NoticeRules is another set of configurations. The two sets are mutually exclusive.- Submitting one set of data will nullify the other set.
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set Notification rulesNote: - Type, NoticeReceivers, and WebCallbacks are one set of configurations, while NoticeRules is another set of configurations. The two sets are mutually exclusive.- Submitting one set of data will nullify the other set.
     * @param NoticeRules Notification rulesNote: - Type, NoticeReceivers, and WebCallbacks are one set of configurations, while NoticeRules is another set of configurations. The two sets are mutually exclusive.- Submitting one set of data will nullify the other set.
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
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
     * Get Delivery log switch.

Parameter value:
1: disabled.

2: Enable 
 
     * @return DeliverStatus Delivery log switch.

Parameter value:
1: disabled.

2: Enable 

     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set Delivery log switch.

Parameter value:
1: disabled.

2: Enable 

     * @param DeliverStatus Delivery log switch.

Parameter value:
1: disabled.

2: Enable 

     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get Log shipping configuration. 
     * @return DeliverConfig Log shipping configuration.
     */
    public DeliverConfig getDeliverConfig() {
        return this.DeliverConfig;
    }

    /**
     * Set Log shipping configuration.
     * @param DeliverConfig Log shipping configuration.
     */
    public void setDeliverConfig(DeliverConfig DeliverConfig) {
        this.DeliverConfig = DeliverConfig;
    }

    /**
     * Get Login-free operation alarm switch.

Parameter value: 
1: disabled
2: Enable (enabled by default) 
     * @return AlarmShieldStatus Login-free operation alarm switch.

Parameter value: 
1: disabled
2: Enable (enabled by default)
     */
    public Long getAlarmShieldStatus() {
        return this.AlarmShieldStatus;
    }

    /**
     * Set Login-free operation alarm switch.

Parameter value: 
1: disabled
2: Enable (enabled by default)
     * @param AlarmShieldStatus Login-free operation alarm switch.

Parameter value: 
1: disabled
2: Enable (enabled by default)
     */
    public void setAlarmShieldStatus(Long AlarmShieldStatus) {
        this.AlarmShieldStatus = AlarmShieldStatus;
    }

    /**
     * Get Unify the custom callback parameter settings.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy. 
     * @return CallbackPrioritize Unify the custom callback parameter settings.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
     */
    public Boolean getCallbackPrioritize() {
        return this.CallbackPrioritize;
    }

    /**
     * Set Unify the custom callback parameter settings.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
     * @param CallbackPrioritize Unify the custom callback parameter settings.
-true: Use the custom callback parameters in the notification content template to override the request header and request body separately configured in the alarm policy.
-false: Prioritize using the request header and request body separately configured in the alarm policy.
     */
    public void setCallbackPrioritize(Boolean CallbackPrioritize) {
        this.CallbackPrioritize = CallbackPrioritize;
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        if (source.NoticeRules != null) {
            this.NoticeRules = new NoticeRule[source.NoticeRules.length];
            for (int i = 0; i < source.NoticeRules.length; i++) {
                this.NoticeRules[i] = new NoticeRule(source.NoticeRules[i]);
            }
        }
        if (source.JumpDomain != null) {
            this.JumpDomain = new String(source.JumpDomain);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new Long(source.DeliverStatus);
        }
        if (source.DeliverConfig != null) {
            this.DeliverConfig = new DeliverConfig(source.DeliverConfig);
        }
        if (source.AlarmShieldStatus != null) {
            this.AlarmShieldStatus = new Long(source.AlarmShieldStatus);
        }
        if (source.CallbackPrioritize != null) {
            this.CallbackPrioritize = new Boolean(source.CallbackPrioritize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamArrayObj(map, prefix + "NoticeRules.", this.NoticeRules);
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamObj(map, prefix + "DeliverConfig.", this.DeliverConfig);
        this.setParamSimple(map, prefix + "AlarmShieldStatus", this.AlarmShieldStatus);
        this.setParamSimple(map, prefix + "CallbackPrioritize", this.CallbackPrioritize);

    }
}

