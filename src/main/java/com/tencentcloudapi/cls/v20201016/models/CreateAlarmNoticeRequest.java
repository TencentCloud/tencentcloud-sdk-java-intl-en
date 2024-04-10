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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmNoticeRequest extends AbstractModel {

    /**
    * Notification group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notification type. Optional Values:<li> Trigger - Alarm triggered </li><li> Recovery - Alarm recovery</li><li> All - Alarm triggered and alarm recovery</li>
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
    * Notification RulesNote: - Type, NoticeReceivers, and WebCallbacks form one set of configurations, and NoticeRules form another set. The two sets of configurations are mutually exclusive.
    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

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
     * Get Notification type. Optional Values:<li> Trigger - Alarm triggered </li><li> Recovery - Alarm recovery</li><li> All - Alarm triggered and alarm recovery</li> 
     * @return Type Notification type. Optional Values:<li> Trigger - Alarm triggered </li><li> Recovery - Alarm recovery</li><li> All - Alarm triggered and alarm recovery</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Notification type. Optional Values:<li> Trigger - Alarm triggered </li><li> Recovery - Alarm recovery</li><li> All - Alarm triggered and alarm recovery</li>
     * @param Type Notification type. Optional Values:<li> Trigger - Alarm triggered </li><li> Recovery - Alarm recovery</li><li> All - Alarm triggered and alarm recovery</li>
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

    /**
     * Get Notification RulesNote: - Type, NoticeReceivers, and WebCallbacks form one set of configurations, and NoticeRules form another set. The two sets of configurations are mutually exclusive. 
     * @return NoticeRules Notification RulesNote: - Type, NoticeReceivers, and WebCallbacks form one set of configurations, and NoticeRules form another set. The two sets of configurations are mutually exclusive.
     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set Notification RulesNote: - Type, NoticeReceivers, and WebCallbacks form one set of configurations, and NoticeRules form another set. The two sets of configurations are mutually exclusive.
     * @param NoticeRules Notification RulesNote: - Type, NoticeReceivers, and WebCallbacks form one set of configurations, and NoticeRules form another set. The two sets of configurations are mutually exclusive.
     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamArrayObj(map, prefix + "NoticeRules.", this.NoticeRules);

    }
}

