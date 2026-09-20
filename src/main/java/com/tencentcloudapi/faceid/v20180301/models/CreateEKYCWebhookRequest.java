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

public class CreateEKYCWebhookRequest extends AbstractModel {

    /**
    * <p>Webhook name, used for console display</p>
    */
    @SerializedName("WebhookName")
    @Expose
    private String WebhookName;

    /**
    * <p>Callback URL, which must use the HTTPS protocol</p>
    */
    @SerializedName("WebhookURL")
    @Expose
    private String WebhookURL;

    /**
     * Get <p>Webhook name, used for console display</p> 
     * @return WebhookName <p>Webhook name, used for console display</p>
     */
    public String getWebhookName() {
        return this.WebhookName;
    }

    /**
     * Set <p>Webhook name, used for console display</p>
     * @param WebhookName <p>Webhook name, used for console display</p>
     */
    public void setWebhookName(String WebhookName) {
        this.WebhookName = WebhookName;
    }

    /**
     * Get <p>Callback URL, which must use the HTTPS protocol</p> 
     * @return WebhookURL <p>Callback URL, which must use the HTTPS protocol</p>
     */
    public String getWebhookURL() {
        return this.WebhookURL;
    }

    /**
     * Set <p>Callback URL, which must use the HTTPS protocol</p>
     * @param WebhookURL <p>Callback URL, which must use the HTTPS protocol</p>
     */
    public void setWebhookURL(String WebhookURL) {
        this.WebhookURL = WebhookURL;
    }

    public CreateEKYCWebhookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEKYCWebhookRequest(CreateEKYCWebhookRequest source) {
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
        this.setParamSimple(map, prefix + "WebhookName", this.WebhookName);
        this.setParamSimple(map, prefix + "WebhookURL", this.WebhookURL);

    }
}

