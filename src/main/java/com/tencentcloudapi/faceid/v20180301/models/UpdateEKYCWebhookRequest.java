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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEKYCWebhookRequest extends AbstractModel {

    /**
    * <p>ID of the Webhook configuration to be updated</p>
    */
    @SerializedName("WebhookId")
    @Expose
    private Long WebhookId;

    /**
    * <p>New Webhook name</p>
    */
    @SerializedName("WebhookName")
    @Expose
    private String WebhookName;

    /**
    * New callback URL, which must use the HTTPS protocol.
    */
    @SerializedName("WebhookURL")
    @Expose
    private String WebhookURL;

    /**
     * Get <p>ID of the Webhook configuration to be updated</p> 
     * @return WebhookId <p>ID of the Webhook configuration to be updated</p>
     */
    public Long getWebhookId() {
        return this.WebhookId;
    }

    /**
     * Set <p>ID of the Webhook configuration to be updated</p>
     * @param WebhookId <p>ID of the Webhook configuration to be updated</p>
     */
    public void setWebhookId(Long WebhookId) {
        this.WebhookId = WebhookId;
    }

    /**
     * Get <p>New Webhook name</p> 
     * @return WebhookName <p>New Webhook name</p>
     */
    public String getWebhookName() {
        return this.WebhookName;
    }

    /**
     * Set <p>New Webhook name</p>
     * @param WebhookName <p>New Webhook name</p>
     */
    public void setWebhookName(String WebhookName) {
        this.WebhookName = WebhookName;
    }

    /**
     * Get New callback URL, which must use the HTTPS protocol. 
     * @return WebhookURL New callback URL, which must use the HTTPS protocol.
     */
    public String getWebhookURL() {
        return this.WebhookURL;
    }

    /**
     * Set New callback URL, which must use the HTTPS protocol.
     * @param WebhookURL New callback URL, which must use the HTTPS protocol.
     */
    public void setWebhookURL(String WebhookURL) {
        this.WebhookURL = WebhookURL;
    }

    public UpdateEKYCWebhookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEKYCWebhookRequest(UpdateEKYCWebhookRequest source) {
        if (source.WebhookId != null) {
            this.WebhookId = new Long(source.WebhookId);
        }
        if (source.WebhookName != null) {
            this.WebhookName = new String(source.WebhookName);
        }
        if (source.WebhookURL != null) {
            this.WebhookURL = new String(source.WebhookURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebhookId", this.WebhookId);
        this.setParamSimple(map, prefix + "WebhookName", this.WebhookName);
        this.setParamSimple(map, prefix + "WebhookURL", this.WebhookURL);

    }
}

