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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerStatus extends AbstractModel {

    /**
    * <p>Timer status.</p>
    */
    @SerializedName("ScheduledStatus")
    @Expose
    private AppTriggerScheduleStatus ScheduledStatus;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Visitor id</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>Webhook status</p>
    */
    @SerializedName("WebhookStatus")
    @Expose
    private AppTriggerWebhookStatus WebhookStatus;

    /**
     * Get <p>Timer status.</p> 
     * @return ScheduledStatus <p>Timer status.</p>
     */
    public AppTriggerScheduleStatus getScheduledStatus() {
        return this.ScheduledStatus;
    }

    /**
     * Set <p>Timer status.</p>
     * @param ScheduledStatus <p>Timer status.</p>
     */
    public void setScheduledStatus(AppTriggerScheduleStatus ScheduledStatus) {
        this.ScheduledStatus = ScheduledStatus;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> 
     * @return Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     * @param Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Visitor id</p> 
     * @return UserId <p>Visitor id</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Visitor id</p>
     * @param UserId <p>Visitor id</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>Webhook status</p> 
     * @return WebhookStatus <p>Webhook status</p>
     */
    public AppTriggerWebhookStatus getWebhookStatus() {
        return this.WebhookStatus;
    }

    /**
     * Set <p>Webhook status</p>
     * @param WebhookStatus <p>Webhook status</p>
     */
    public void setWebhookStatus(AppTriggerWebhookStatus WebhookStatus) {
        this.WebhookStatus = WebhookStatus;
    }

    public TriggerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerStatus(TriggerStatus source) {
        if (source.ScheduledStatus != null) {
            this.ScheduledStatus = new AppTriggerScheduleStatus(source.ScheduledStatus);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.WebhookStatus != null) {
            this.WebhookStatus = new AppTriggerWebhookStatus(source.WebhookStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScheduledStatus.", this.ScheduledStatus);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "WebhookStatus.", this.WebhookStatus);

    }
}

