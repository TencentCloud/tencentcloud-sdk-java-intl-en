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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityVerificationEvent extends AbstractModel {

    /**
    * <p>The event type being verified</p><p>Enumeration values:</p><ul><li>register</li><li>login</li><li>modify_account</li><li>modify_password</li><li>create_order</li><li>transaction</li><li>modify_order</li><li>withdraw</li><li>add_promotion</li><li>redeem</li></ul>
    */
    @SerializedName("VerificationEvent")
    @Expose
    private String VerificationEvent;

    /**
    * <p>The type of security verification: sms, phone call, email, captcha, shared knowledge, human face, fingerprint, etc</p>
    */
    @SerializedName("VerificationType")
    @Expose
    private String VerificationType;

    /**
    * <p>The content of the security verifcation.This value should be passed when the verification type is set to sms, phone_call, email captcha or shared_knowledge</p>
    */
    @SerializedName("VerificationContent")
    @Expose
    private String VerificationContent;

    /**
    * <p>The result of security verification</p>
    */
    @SerializedName("VerificationResult")
    @Expose
    private Result VerificationResult;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The event type being verified</p><p>Enumeration values:</p><ul><li>register</li><li>login</li><li>modify_account</li><li>modify_password</li><li>create_order</li><li>transaction</li><li>modify_order</li><li>withdraw</li><li>add_promotion</li><li>redeem</li></ul> 
     * @return VerificationEvent <p>The event type being verified</p><p>Enumeration values:</p><ul><li>register</li><li>login</li><li>modify_account</li><li>modify_password</li><li>create_order</li><li>transaction</li><li>modify_order</li><li>withdraw</li><li>add_promotion</li><li>redeem</li></ul>
     */
    public String getVerificationEvent() {
        return this.VerificationEvent;
    }

    /**
     * Set <p>The event type being verified</p><p>Enumeration values:</p><ul><li>register</li><li>login</li><li>modify_account</li><li>modify_password</li><li>create_order</li><li>transaction</li><li>modify_order</li><li>withdraw</li><li>add_promotion</li><li>redeem</li></ul>
     * @param VerificationEvent <p>The event type being verified</p><p>Enumeration values:</p><ul><li>register</li><li>login</li><li>modify_account</li><li>modify_password</li><li>create_order</li><li>transaction</li><li>modify_order</li><li>withdraw</li><li>add_promotion</li><li>redeem</li></ul>
     */
    public void setVerificationEvent(String VerificationEvent) {
        this.VerificationEvent = VerificationEvent;
    }

    /**
     * Get <p>The type of security verification: sms, phone call, email, captcha, shared knowledge, human face, fingerprint, etc</p> 
     * @return VerificationType <p>The type of security verification: sms, phone call, email, captcha, shared knowledge, human face, fingerprint, etc</p>
     */
    public String getVerificationType() {
        return this.VerificationType;
    }

    /**
     * Set <p>The type of security verification: sms, phone call, email, captcha, shared knowledge, human face, fingerprint, etc</p>
     * @param VerificationType <p>The type of security verification: sms, phone call, email, captcha, shared knowledge, human face, fingerprint, etc</p>
     */
    public void setVerificationType(String VerificationType) {
        this.VerificationType = VerificationType;
    }

    /**
     * Get <p>The content of the security verifcation.This value should be passed when the verification type is set to sms, phone_call, email captcha or shared_knowledge</p> 
     * @return VerificationContent <p>The content of the security verifcation.This value should be passed when the verification type is set to sms, phone_call, email captcha or shared_knowledge</p>
     */
    public String getVerificationContent() {
        return this.VerificationContent;
    }

    /**
     * Set <p>The content of the security verifcation.This value should be passed when the verification type is set to sms, phone_call, email captcha or shared_knowledge</p>
     * @param VerificationContent <p>The content of the security verifcation.This value should be passed when the verification type is set to sms, phone_call, email captcha or shared_knowledge</p>
     */
    public void setVerificationContent(String VerificationContent) {
        this.VerificationContent = VerificationContent;
    }

    /**
     * Get <p>The result of security verification</p> 
     * @return VerificationResult <p>The result of security verification</p>
     */
    public Result getVerificationResult() {
        return this.VerificationResult;
    }

    /**
     * Set <p>The result of security verification</p>
     * @param VerificationResult <p>The result of security verification</p>
     */
    public void setVerificationResult(Result VerificationResult) {
        this.VerificationResult = VerificationResult;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public SecurityVerificationEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityVerificationEvent(SecurityVerificationEvent source) {
        if (source.VerificationEvent != null) {
            this.VerificationEvent = new String(source.VerificationEvent);
        }
        if (source.VerificationType != null) {
            this.VerificationType = new String(source.VerificationType);
        }
        if (source.VerificationContent != null) {
            this.VerificationContent = new String(source.VerificationContent);
        }
        if (source.VerificationResult != null) {
            this.VerificationResult = new Result(source.VerificationResult);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerificationEvent", this.VerificationEvent);
        this.setParamSimple(map, prefix + "VerificationType", this.VerificationType);
        this.setParamSimple(map, prefix + "VerificationContent", this.VerificationContent);
        this.setParamObj(map, prefix + "VerificationResult.", this.VerificationResult);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

