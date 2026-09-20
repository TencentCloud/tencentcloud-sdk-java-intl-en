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

public class WebhookList extends AbstractModel {

    /**
    * <p>Callback unique ID</p>
    */
    @SerializedName("WebhookId")
    @Expose
    private Long WebhookId;

    /**
    * <p>Callback URL name</p>
    */
    @SerializedName("WebhookName")
    @Expose
    private String WebhookName;

    /**
    * <p>Callback enumeration scenario.</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * <p>Callback URL, must use HTTPS</p>
    */
    @SerializedName("WebhookURL")
    @Expose
    private String WebhookURL;

    /**
    * <p>Addition Time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>Update time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * <p>Callback request key</p>
    */
    @SerializedName("SignatureKey")
    @Expose
    private String SignatureKey;

    /**
    * <p>Existence of callback API key</p>
    */
    @SerializedName("HasSignatureKey")
    @Expose
    private Boolean HasSignatureKey;

    /**
     * Get <p>Callback unique ID</p> 
     * @return WebhookId <p>Callback unique ID</p>
     */
    public Long getWebhookId() {
        return this.WebhookId;
    }

    /**
     * Set <p>Callback unique ID</p>
     * @param WebhookId <p>Callback unique ID</p>
     */
    public void setWebhookId(Long WebhookId) {
        this.WebhookId = WebhookId;
    }

    /**
     * Get <p>Callback URL name</p> 
     * @return WebhookName <p>Callback URL name</p>
     */
    public String getWebhookName() {
        return this.WebhookName;
    }

    /**
     * Set <p>Callback URL name</p>
     * @param WebhookName <p>Callback URL name</p>
     */
    public void setWebhookName(String WebhookName) {
        this.WebhookName = WebhookName;
    }

    /**
     * Get <p>Callback enumeration scenario.</p> 
     * @return Scene <p>Callback enumeration scenario.</p>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>Callback enumeration scenario.</p>
     * @param Scene <p>Callback enumeration scenario.</p>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>Callback URL, must use HTTPS</p> 
     * @return WebhookURL <p>Callback URL, must use HTTPS</p>
     */
    public String getWebhookURL() {
        return this.WebhookURL;
    }

    /**
     * Set <p>Callback URL, must use HTTPS</p>
     * @param WebhookURL <p>Callback URL, must use HTTPS</p>
     */
    public void setWebhookURL(String WebhookURL) {
        this.WebhookURL = WebhookURL;
    }

    /**
     * Get <p>Addition Time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p> 
     * @return AddTime <p>Addition Time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>Addition Time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
     * @param AddTime <p>Addition Time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>Update time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p> 
     * @return ModTime <p>Update time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set <p>Update time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
     * @param ModTime <p>Update time</p><p>Parameter format: Format example: 2026-09-09 14:33:41</p>
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get <p>Callback request key</p> 
     * @return SignatureKey <p>Callback request key</p>
     */
    public String getSignatureKey() {
        return this.SignatureKey;
    }

    /**
     * Set <p>Callback request key</p>
     * @param SignatureKey <p>Callback request key</p>
     */
    public void setSignatureKey(String SignatureKey) {
        this.SignatureKey = SignatureKey;
    }

    /**
     * Get <p>Existence of callback API key</p> 
     * @return HasSignatureKey <p>Existence of callback API key</p>
     */
    public Boolean getHasSignatureKey() {
        return this.HasSignatureKey;
    }

    /**
     * Set <p>Existence of callback API key</p>
     * @param HasSignatureKey <p>Existence of callback API key</p>
     */
    public void setHasSignatureKey(Boolean HasSignatureKey) {
        this.HasSignatureKey = HasSignatureKey;
    }

    public WebhookList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookList(WebhookList source) {
        if (source.WebhookId != null) {
            this.WebhookId = new Long(source.WebhookId);
        }
        if (source.WebhookName != null) {
            this.WebhookName = new String(source.WebhookName);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.WebhookURL != null) {
            this.WebhookURL = new String(source.WebhookURL);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.SignatureKey != null) {
            this.SignatureKey = new String(source.SignatureKey);
        }
        if (source.HasSignatureKey != null) {
            this.HasSignatureKey = new Boolean(source.HasSignatureKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebhookId", this.WebhookId);
        this.setParamSimple(map, prefix + "WebhookName", this.WebhookName);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "WebhookURL", this.WebhookURL);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "SignatureKey", this.SignatureKey);
        this.setParamSimple(map, prefix + "HasSignatureKey", this.HasSignatureKey);

    }
}

