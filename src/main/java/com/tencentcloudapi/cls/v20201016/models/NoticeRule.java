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

public class NoticeRule extends AbstractModel {

    /**
    * Alarms notification template recipient informationNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * Alarms notification template callback informationNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * Matching rules.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
     * Get Alarms notification template recipient informationNote: This field may return null, indicating that no valid values can be obtained. 
     * @return NoticeReceivers Alarms notification template recipient informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set Alarms notification template recipient informationNote: This field may return null, indicating that no valid values can be obtained.
     * @param NoticeReceivers Alarms notification template recipient informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get Alarms notification template callback informationNote: This field may return null, indicating that no valid values can be obtained. 
     * @return WebCallbacks Alarms notification template callback informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set Alarms notification template callback informationNote: This field may return null, indicating that no valid values can be obtained.
     * @param WebCallbacks Alarms notification template callback informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get Matching rules.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rule Matching rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Matching rules.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rule Matching rules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    public NoticeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeRule(NoticeRule source) {
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
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "Rule", this.Rule);

    }
}

