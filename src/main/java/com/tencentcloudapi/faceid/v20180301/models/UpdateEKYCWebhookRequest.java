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
    * <p>New callback URL, must be HTTPS protocol</p>
    */
    @SerializedName("WebhookURL")
    @Expose
    private String WebhookURL;

    /**
    * <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not provided, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32    </p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate the HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature following the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
    */
    @SerializedName("SignatureKey")
    @Expose
    private String SignatureKey;

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
     * Get <p>New callback URL, must be HTTPS protocol</p> 
     * @return WebhookURL <p>New callback URL, must be HTTPS protocol</p>
     */
    public String getWebhookURL() {
        return this.WebhookURL;
    }

    /**
     * Set <p>New callback URL, must be HTTPS protocol</p>
     * @param WebhookURL <p>New callback URL, must be HTTPS protocol</p>
     */
    public void setWebhookURL(String WebhookURL) {
        this.WebhookURL = WebhookURL;
    }

    /**
     * Get <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not provided, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32    </p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate the HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature following the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote> 
     * @return SignatureKey <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not provided, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32    </p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate the HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature following the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
     */
    public String getSignatureKey() {
        return this.SignatureKey;
    }

    /**
     * Set <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not provided, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32    </p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate the HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature following the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
     * @param SignatureKey <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not provided, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32    </p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate the HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature following the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
     */
    public void setSignatureKey(String SignatureKey) {
        this.SignatureKey = SignatureKey;
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
        if (source.SignatureKey != null) {
            this.SignatureKey = new String(source.SignatureKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebhookId", this.WebhookId);
        this.setParamSimple(map, prefix + "WebhookName", this.WebhookName);
        this.setParamSimple(map, prefix + "WebhookURL", this.WebhookURL);
        this.setParamSimple(map, prefix + "SignatureKey", this.SignatureKey);

    }
}

