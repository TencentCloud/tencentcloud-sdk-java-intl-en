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
    * <p>Business scenario. Default if not passed: AML_SCREENING_RESULT_CHANGE. For parameter values, see the enumeration below.</p><p>Enumeration values:</p><ul><li>AML_SCREENING_RESULT_CHANGE: AML anti-money laundering screening result change notification (default value)    </li><li>NONDOC_VERIFICATION_RESULT: Non-document (NonDoc) verification result notification</li></ul>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not passed, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32</p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate an HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature by the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
    */
    @SerializedName("SignatureKey")
    @Expose
    private String SignatureKey;

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

    /**
     * Get <p>Business scenario. Default if not passed: AML_SCREENING_RESULT_CHANGE. For parameter values, see the enumeration below.</p><p>Enumeration values:</p><ul><li>AML_SCREENING_RESULT_CHANGE: AML anti-money laundering screening result change notification (default value)    </li><li>NONDOC_VERIFICATION_RESULT: Non-document (NonDoc) verification result notification</li></ul> 
     * @return Scene <p>Business scenario. Default if not passed: AML_SCREENING_RESULT_CHANGE. For parameter values, see the enumeration below.</p><p>Enumeration values:</p><ul><li>AML_SCREENING_RESULT_CHANGE: AML anti-money laundering screening result change notification (default value)    </li><li>NONDOC_VERIFICATION_RESULT: Non-document (NonDoc) verification result notification</li></ul>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>Business scenario. Default if not passed: AML_SCREENING_RESULT_CHANGE. For parameter values, see the enumeration below.</p><p>Enumeration values:</p><ul><li>AML_SCREENING_RESULT_CHANGE: AML anti-money laundering screening result change notification (default value)    </li><li>NONDOC_VERIFICATION_RESULT: Non-document (NonDoc) verification result notification</li></ul>
     * @param Scene <p>Business scenario. Default if not passed: AML_SCREENING_RESULT_CHANGE. For parameter values, see the enumeration below.</p><p>Enumeration values:</p><ul><li>AML_SCREENING_RESULT_CHANGE: AML anti-money laundering screening result change notification (default value)    </li><li>NONDOC_VERIFICATION_RESULT: Non-document (NonDoc) verification result notification</li></ul>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not passed, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32</p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate an HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature by the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote> 
     * @return SignatureKey <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not passed, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32</p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate an HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature by the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
     */
    public String getSignatureKey() {
        return this.SignatureKey;
    }

    /**
     * Set <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not passed, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32</p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate an HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature by the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
     * @param SignatureKey <p>Callback signature key, up to 128 characters. Used for HMAC-SHA256 signature verification of subsequent callback messages. If not passed, signature is not enabled. We recommend using OpenSSL random bytes to generate the key. Recommended command: openssl rand -base64 32</p><blockquote><p>Our side uses your configured <code>SignatureKey</code> to calculate an HMAC-SHA256 signature over "timestamp (<code>X-Webhook-Timestamp</code>) + <code>.</code> + request body", and puts the hexadecimal result in the request header <code>X-Webhook-Signature</code>. The message itself is unencrypted and transmitted over HTTPS. Use the same key to recalculate and compare the signature by the same rule to confirm that the notification source is trustworthy and the content has not been tampered with.</p></blockquote>
     */
    public void setSignatureKey(String SignatureKey) {
        this.SignatureKey = SignatureKey;
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
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.SignatureKey != null) {
            this.SignatureKey = new String(source.SignatureKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebhookName", this.WebhookName);
        this.setParamSimple(map, prefix + "WebhookURL", this.WebhookURL);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "SignatureKey", this.SignatureKey);

    }
}

