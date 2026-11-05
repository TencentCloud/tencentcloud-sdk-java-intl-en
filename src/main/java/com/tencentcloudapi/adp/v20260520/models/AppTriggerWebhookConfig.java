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

public class AppTriggerWebhookConfig extends AbstractModel {

    /**
    * <p>Trigger webhook parameter configuration</p>
    */
    @SerializedName("ParamSchemaConfig")
    @Expose
    private AppTriggerWebhookParamSchemaConfig ParamSchemaConfig;

    /**
    * <p>key of the webhook</p>
    */
    @SerializedName("WebhookKey")
    @Expose
    private String WebhookKey;

    /**
    * <p>webhook key</p>
    */
    @SerializedName("WebhookToken")
    @Expose
    private String WebhookToken;

    /**
    * <p>webhook domain name or IP address</p>
    */
    @SerializedName("WebhookUrl")
    @Expose
    private String WebhookUrl;

    /**
     * Get <p>Trigger webhook parameter configuration</p> 
     * @return ParamSchemaConfig <p>Trigger webhook parameter configuration</p>
     */
    public AppTriggerWebhookParamSchemaConfig getParamSchemaConfig() {
        return this.ParamSchemaConfig;
    }

    /**
     * Set <p>Trigger webhook parameter configuration</p>
     * @param ParamSchemaConfig <p>Trigger webhook parameter configuration</p>
     */
    public void setParamSchemaConfig(AppTriggerWebhookParamSchemaConfig ParamSchemaConfig) {
        this.ParamSchemaConfig = ParamSchemaConfig;
    }

    /**
     * Get <p>key of the webhook</p> 
     * @return WebhookKey <p>key of the webhook</p>
     */
    public String getWebhookKey() {
        return this.WebhookKey;
    }

    /**
     * Set <p>key of the webhook</p>
     * @param WebhookKey <p>key of the webhook</p>
     */
    public void setWebhookKey(String WebhookKey) {
        this.WebhookKey = WebhookKey;
    }

    /**
     * Get <p>webhook key</p> 
     * @return WebhookToken <p>webhook key</p>
     */
    public String getWebhookToken() {
        return this.WebhookToken;
    }

    /**
     * Set <p>webhook key</p>
     * @param WebhookToken <p>webhook key</p>
     */
    public void setWebhookToken(String WebhookToken) {
        this.WebhookToken = WebhookToken;
    }

    /**
     * Get <p>webhook domain name or IP address</p> 
     * @return WebhookUrl <p>webhook domain name or IP address</p>
     */
    public String getWebhookUrl() {
        return this.WebhookUrl;
    }

    /**
     * Set <p>webhook domain name or IP address</p>
     * @param WebhookUrl <p>webhook domain name or IP address</p>
     */
    public void setWebhookUrl(String WebhookUrl) {
        this.WebhookUrl = WebhookUrl;
    }

    public AppTriggerWebhookConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerWebhookConfig(AppTriggerWebhookConfig source) {
        if (source.ParamSchemaConfig != null) {
            this.ParamSchemaConfig = new AppTriggerWebhookParamSchemaConfig(source.ParamSchemaConfig);
        }
        if (source.WebhookKey != null) {
            this.WebhookKey = new String(source.WebhookKey);
        }
        if (source.WebhookToken != null) {
            this.WebhookToken = new String(source.WebhookToken);
        }
        if (source.WebhookUrl != null) {
            this.WebhookUrl = new String(source.WebhookUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ParamSchemaConfig.", this.ParamSchemaConfig);
        this.setParamSimple(map, prefix + "WebhookKey", this.WebhookKey);
        this.setParamSimple(map, prefix + "WebhookToken", this.WebhookToken);
        this.setParamSimple(map, prefix + "WebhookUrl", this.WebhookUrl);

    }
}

