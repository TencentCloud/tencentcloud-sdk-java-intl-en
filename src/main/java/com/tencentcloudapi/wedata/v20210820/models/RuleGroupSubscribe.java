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

public class RuleGroupSubscribe extends AbstractModel {

    /**
    * Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Subscription Recipient List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Receivers")
    @Expose
    private SubscribeReceiver [] Receivers;

    /**
    * Subscription Method 1. Email  2. SMS
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubscribeType")
    @Expose
    private Long [] SubscribeType;

    /**
    * Group Robot Configuration's Webhook Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WebHooks")
    @Expose
    private SubscribeWebHook [] WebHooks;

    /**
    * Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Subscription Recipient List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Receivers Subscription Recipient List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SubscribeReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Subscription Recipient List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Receivers Subscription Recipient List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReceivers(SubscribeReceiver [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Subscription Method 1. Email  2. SMS
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubscribeType Subscription Method 1. Email  2. SMS
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getSubscribeType() {
        return this.SubscribeType;
    }

    /**
     * Set Subscription Method 1. Email  2. SMS
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubscribeType Subscription Method 1. Email  2. SMS
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubscribeType(Long [] SubscribeType) {
        this.SubscribeType = SubscribeType;
    }

    /**
     * Get Group Robot Configuration's Webhook Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WebHooks Group Robot Configuration's Webhook Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SubscribeWebHook [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set Group Robot Configuration's Webhook Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WebHooks Group Robot Configuration's Webhook Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWebHooks(SubscribeWebHook [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleId Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleId Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleName Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param RuleName Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public RuleGroupSubscribe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupSubscribe(RuleGroupSubscribe source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.Receivers != null) {
            this.Receivers = new SubscribeReceiver[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new SubscribeReceiver(source.Receivers[i]);
            }
        }
        if (source.SubscribeType != null) {
            this.SubscribeType = new Long[source.SubscribeType.length];
            for (int i = 0; i < source.SubscribeType.length; i++) {
                this.SubscribeType[i] = new Long(source.SubscribeType[i]);
            }
        }
        if (source.WebHooks != null) {
            this.WebHooks = new SubscribeWebHook[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new SubscribeWebHook(source.WebHooks[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamArrayObj(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "SubscribeType.", this.SubscribeType);
        this.setParamArrayObj(map, prefix + "WebHooks.", this.WebHooks);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

