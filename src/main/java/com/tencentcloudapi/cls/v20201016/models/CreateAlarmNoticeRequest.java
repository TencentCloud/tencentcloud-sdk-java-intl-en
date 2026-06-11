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

public class CreateAlarmNoticeRequest extends AbstractModel {

    /**
    * Notification channel group name. Supports a maximum of 255 bytes. Does not support '|'.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag description list. By specifying this parameter, you can bind multiple tags to the corresponding notification channel group. A maximum of 50 tag key-value pairs are supported, and there should not be duplicate key-value pairs.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Alarm types that require sending notifications. Available values:
- Trigger - Alarm trigger
-Alarm Recovery
-All - Alarm trigger and alarm recovery
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Notification recipients
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Interface callback information (including WeCom, DingTalk, Lark).
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * [Advanced mode] (Choose between easy mode and alarm mode, and configure corresponding parameters)
Notification rules.
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
    * Query data link. It should start with http:// or https:// and should not end with /.
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * Delivery log switch. Values are as follows:
1: Off (default value).
2: Enable 
When the delivery log switch is enabled, the DeliverConfig parameter is required.
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * Log shipping configuration parameter. It is required when DeliverStatus is enabled.
    */
    @SerializedName("DeliverConfig")
    @Expose
    private DeliverConfig DeliverConfig;

    /**
    * Login-free operation alarm switch. Values are as follows:
- 1: disabled.
-2: Enable (default value)
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
     * Get Notification channel group name. Supports a maximum of 255 bytes. Does not support '|'. 
     * @return Name Notification channel group name. Supports a maximum of 255 bytes. Does not support '|'.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Notification channel group name. Supports a maximum of 255 bytes. Does not support '|'.
     * @param Name Notification channel group name. Supports a maximum of 255 bytes. Does not support '|'.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag description list. By specifying this parameter, you can bind multiple tags to the corresponding notification channel group. A maximum of 50 tag key-value pairs are supported, and there should not be duplicate key-value pairs. 
     * @return Tags Tag description list. By specifying this parameter, you can bind multiple tags to the corresponding notification channel group. A maximum of 50 tag key-value pairs are supported, and there should not be duplicate key-value pairs.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list. By specifying this parameter, you can bind multiple tags to the corresponding notification channel group. A maximum of 50 tag key-value pairs are supported, and there should not be duplicate key-value pairs.
     * @param Tags Tag description list. By specifying this parameter, you can bind multiple tags to the corresponding notification channel group. A maximum of 50 tag key-value pairs are supported, and there should not be duplicate key-value pairs.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Alarm types that require sending notifications. Available values:
- Trigger - Alarm trigger
-Alarm Recovery
-All - Alarm trigger and alarm recovery 
     * @return Type [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Alarm types that require sending notifications. Available values:
- Trigger - Alarm trigger
-Alarm Recovery
-All - Alarm trigger and alarm recovery
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Alarm types that require sending notifications. Available values:
- Trigger - Alarm trigger
-Alarm Recovery
-All - Alarm trigger and alarm recovery
     * @param Type [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Alarm types that require sending notifications. Available values:
- Trigger - Alarm trigger
-Alarm Recovery
-All - Alarm trigger and alarm recovery
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Notification recipients 
     * @return NoticeReceivers [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Notification recipients
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Notification recipients
     * @param NoticeReceivers [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Notification recipients
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Interface callback information (including WeCom, DingTalk, Lark). 
     * @return WebCallbacks [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Interface callback information (including WeCom, DingTalk, Lark).
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Interface callback information (including WeCom, DingTalk, Lark).
     * @param WebCallbacks [Easy mode] (Select either easy mode or alarm mode and configure corresponding parameters)
Interface callback information (including WeCom, DingTalk, Lark).
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get [Advanced mode] (Choose between easy mode and alarm mode, and configure corresponding parameters)
Notification rules. 
     * @return NoticeRules [Advanced mode] (Choose between easy mode and alarm mode, and configure corresponding parameters)
Notification rules.
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set [Advanced mode] (Choose between easy mode and alarm mode, and configure corresponding parameters)
Notification rules.
     * @param NoticeRules [Advanced mode] (Choose between easy mode and alarm mode, and configure corresponding parameters)
Notification rules.
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
    }

    /**
     * Get Query data link. It should start with http:// or https:// and should not end with /. 
     * @return JumpDomain Query data link. It should start with http:// or https:// and should not end with /.
     */
    public String getJumpDomain() {
        return this.JumpDomain;
    }

    /**
     * Set Query data link. It should start with http:// or https:// and should not end with /.
     * @param JumpDomain Query data link. It should start with http:// or https:// and should not end with /.
     */
    public void setJumpDomain(String JumpDomain) {
        this.JumpDomain = JumpDomain;
    }

    /**
     * Get Delivery log switch. Values are as follows:
1: Off (default value).
2: Enable 
When the delivery log switch is enabled, the DeliverConfig parameter is required. 
     * @return DeliverStatus Delivery log switch. Values are as follows:
1: Off (default value).
2: Enable 
When the delivery log switch is enabled, the DeliverConfig parameter is required.
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set Delivery log switch. Values are as follows:
1: Off (default value).
2: Enable 
When the delivery log switch is enabled, the DeliverConfig parameter is required.
     * @param DeliverStatus Delivery log switch. Values are as follows:
1: Off (default value).
2: Enable 
When the delivery log switch is enabled, the DeliverConfig parameter is required.
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get Log shipping configuration parameter. It is required when DeliverStatus is enabled. 
     * @return DeliverConfig Log shipping configuration parameter. It is required when DeliverStatus is enabled.
     */
    public DeliverConfig getDeliverConfig() {
        return this.DeliverConfig;
    }

    /**
     * Set Log shipping configuration parameter. It is required when DeliverStatus is enabled.
     * @param DeliverConfig Log shipping configuration parameter. It is required when DeliverStatus is enabled.
     */
    public void setDeliverConfig(DeliverConfig DeliverConfig) {
        this.DeliverConfig = DeliverConfig;
    }

    /**
     * Get Login-free operation alarm switch. Values are as follows:
- 1: disabled.
-2: Enable (default value) 
     * @return AlarmShieldStatus Login-free operation alarm switch. Values are as follows:
- 1: disabled.
-2: Enable (default value)
     */
    public Long getAlarmShieldStatus() {
        return this.AlarmShieldStatus;
    }

    /**
     * Set Login-free operation alarm switch. Values are as follows:
- 1: disabled.
-2: Enable (default value)
     * @param AlarmShieldStatus Login-free operation alarm switch. Values are as follows:
- 1: disabled.
-2: Enable (default value)
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

    public CreateAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmNoticeRequest(CreateAlarmNoticeRequest source) {
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
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

