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

public class TimerPushConfig extends AbstractModel {

    /**
    * <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | Do not push |<br>| 2 | WeChat official account |<br>| 3 | WeCom AI chatbot |</p>
    */
    @SerializedName("PushChannel")
    @Expose
    private Long PushChannel;

    /**
    * <p>Push session ID</p>
    */
    @SerializedName("PushTargetId")
    @Expose
    private String PushTargetId;

    /**
    * <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | User (WeChat official account openid) |<br>| 2 | Group chat (WeCom chatbot chat_id) |</p>
    */
    @SerializedName("PushTargetType")
    @Expose
    private Long PushTargetType;

    /**
    * <p>url for pushing webhook</p>
    */
    @SerializedName("PushWebhookUrl")
    @Expose
    private String PushWebhookUrl;

    /**
     * Get <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | Do not push |<br>| 2 | WeChat official account |<br>| 3 | WeCom AI chatbot |</p> 
     * @return PushChannel <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | Do not push |<br>| 2 | WeChat official account |<br>| 3 | WeCom AI chatbot |</p>
     */
    public Long getPushChannel() {
        return this.PushChannel;
    }

    /**
     * Set <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | Do not push |<br>| 2 | WeChat official account |<br>| 3 | WeCom AI chatbot |</p>
     * @param PushChannel <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | Do not push |<br>| 2 | WeChat official account |<br>| 3 | WeCom AI chatbot |</p>
     */
    public void setPushChannel(Long PushChannel) {
        this.PushChannel = PushChannel;
    }

    /**
     * Get <p>Push session ID</p> 
     * @return PushTargetId <p>Push session ID</p>
     */
    public String getPushTargetId() {
        return this.PushTargetId;
    }

    /**
     * Set <p>Push session ID</p>
     * @param PushTargetId <p>Push session ID</p>
     */
    public void setPushTargetId(String PushTargetId) {
        this.PushTargetId = PushTargetId;
    }

    /**
     * Get <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | User (WeChat official account openid) |<br>| 2 | Group chat (WeCom chatbot chat_id) |</p> 
     * @return PushTargetType <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | User (WeChat official account openid) |<br>| 2 | Group chat (WeCom chatbot chat_id) |</p>
     */
    public Long getPushTargetType() {
        return this.PushTargetType;
    }

    /**
     * Set <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | User (WeChat official account openid) |<br>| 2 | Group chat (WeCom chatbot chat_id) |</p>
     * @param PushTargetType <p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 |  |<br>| 1 | User (WeChat official account openid) |<br>| 2 | Group chat (WeCom chatbot chat_id) |</p>
     */
    public void setPushTargetType(Long PushTargetType) {
        this.PushTargetType = PushTargetType;
    }

    /**
     * Get <p>url for pushing webhook</p> 
     * @return PushWebhookUrl <p>url for pushing webhook</p>
     */
    public String getPushWebhookUrl() {
        return this.PushWebhookUrl;
    }

    /**
     * Set <p>url for pushing webhook</p>
     * @param PushWebhookUrl <p>url for pushing webhook</p>
     */
    public void setPushWebhookUrl(String PushWebhookUrl) {
        this.PushWebhookUrl = PushWebhookUrl;
    }

    public TimerPushConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerPushConfig(TimerPushConfig source) {
        if (source.PushChannel != null) {
            this.PushChannel = new Long(source.PushChannel);
        }
        if (source.PushTargetId != null) {
            this.PushTargetId = new String(source.PushTargetId);
        }
        if (source.PushTargetType != null) {
            this.PushTargetType = new Long(source.PushTargetType);
        }
        if (source.PushWebhookUrl != null) {
            this.PushWebhookUrl = new String(source.PushWebhookUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushChannel", this.PushChannel);
        this.setParamSimple(map, prefix + "PushTargetId", this.PushTargetId);
        this.setParamSimple(map, prefix + "PushTargetType", this.PushTargetType);
        this.setParamSimple(map, prefix + "PushWebhookUrl", this.PushWebhookUrl);

    }
}

