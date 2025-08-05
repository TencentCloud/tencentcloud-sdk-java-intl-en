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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientAttester extends AbstractModel {

    /**
    * Authentication option ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Specifies the authentication option name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Authentication rule type. only returned in the response. valid values:.
<li>PRESET: system PRESET rule. only AttesterDuration can be modified.</li>.
<Li>CUSTOM: user-defined rules.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Authentication method. valid values:.
<Li>TC-RCE: uses the full-stack risk control engine for authentication.</li>.
<Li>TC-CAPTCHA-Intl: specifies authentication using captcha-intl.</li>.
    */
    @SerializedName("AttesterSource")
    @Expose
    private String AttesterSource;

    /**
    * Validity time of the authentication. defaults to 60s. supported measurement units:.
<Li>S: specifies seconds. value range: 60–43200.</li>.
<Li>M: specifies minutes. value range: 1–720.</li>.
<Li>H. specifies the hour. value range: 1–12.</li>.
    */
    @SerializedName("AttesterDuration")
    @Expose
    private String AttesterDuration;

    /**
    * TC-RCE authentication configuration message.
<li>Specifies the required field when the AttesterSource parameter value is TC-RCE.</li>.
    */
    @SerializedName("TCRCEOption")
    @Expose
    private TCRCEOption TCRCEOption;

    /**
    * Specifies the configuration message for TC-CAPTCHA certification.
<li>Specifies the required field when the AttesterSource parameter value is TC-CAPTCHA.</li>.
    */
    @SerializedName("TCCaptchaOption")
    @Expose
    private TCCaptchaOption TCCaptchaOption;

    /**
     * Get Authentication option ID. 
     * @return Id Authentication option ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Authentication option ID.
     * @param Id Authentication option ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies the authentication option name. 
     * @return Name Specifies the authentication option name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the authentication option name.
     * @param Name Specifies the authentication option name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Authentication rule type. only returned in the response. valid values:.
<li>PRESET: system PRESET rule. only AttesterDuration can be modified.</li>.
<Li>CUSTOM: user-defined rules.</li>. 
     * @return Type Authentication rule type. only returned in the response. valid values:.
<li>PRESET: system PRESET rule. only AttesterDuration can be modified.</li>.
<Li>CUSTOM: user-defined rules.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Authentication rule type. only returned in the response. valid values:.
<li>PRESET: system PRESET rule. only AttesterDuration can be modified.</li>.
<Li>CUSTOM: user-defined rules.</li>.
     * @param Type Authentication rule type. only returned in the response. valid values:.
<li>PRESET: system PRESET rule. only AttesterDuration can be modified.</li>.
<Li>CUSTOM: user-defined rules.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Authentication method. valid values:.
<Li>TC-RCE: uses the full-stack risk control engine for authentication.</li>.
<Li>TC-CAPTCHA-Intl: specifies authentication using captcha-intl.</li>. 
     * @return AttesterSource Authentication method. valid values:.
<Li>TC-RCE: uses the full-stack risk control engine for authentication.</li>.
<Li>TC-CAPTCHA-Intl: specifies authentication using captcha-intl.</li>.
     */
    public String getAttesterSource() {
        return this.AttesterSource;
    }

    /**
     * Set Authentication method. valid values:.
<Li>TC-RCE: uses the full-stack risk control engine for authentication.</li>.
<Li>TC-CAPTCHA-Intl: specifies authentication using captcha-intl.</li>.
     * @param AttesterSource Authentication method. valid values:.
<Li>TC-RCE: uses the full-stack risk control engine for authentication.</li>.
<Li>TC-CAPTCHA-Intl: specifies authentication using captcha-intl.</li>.
     */
    public void setAttesterSource(String AttesterSource) {
        this.AttesterSource = AttesterSource;
    }

    /**
     * Get Validity time of the authentication. defaults to 60s. supported measurement units:.
<Li>S: specifies seconds. value range: 60–43200.</li>.
<Li>M: specifies minutes. value range: 1–720.</li>.
<Li>H. specifies the hour. value range: 1–12.</li>. 
     * @return AttesterDuration Validity time of the authentication. defaults to 60s. supported measurement units:.
<Li>S: specifies seconds. value range: 60–43200.</li>.
<Li>M: specifies minutes. value range: 1–720.</li>.
<Li>H. specifies the hour. value range: 1–12.</li>.
     */
    public String getAttesterDuration() {
        return this.AttesterDuration;
    }

    /**
     * Set Validity time of the authentication. defaults to 60s. supported measurement units:.
<Li>S: specifies seconds. value range: 60–43200.</li>.
<Li>M: specifies minutes. value range: 1–720.</li>.
<Li>H. specifies the hour. value range: 1–12.</li>.
     * @param AttesterDuration Validity time of the authentication. defaults to 60s. supported measurement units:.
<Li>S: specifies seconds. value range: 60–43200.</li>.
<Li>M: specifies minutes. value range: 1–720.</li>.
<Li>H. specifies the hour. value range: 1–12.</li>.
     */
    public void setAttesterDuration(String AttesterDuration) {
        this.AttesterDuration = AttesterDuration;
    }

    /**
     * Get TC-RCE authentication configuration message.
<li>Specifies the required field when the AttesterSource parameter value is TC-RCE.</li>. 
     * @return TCRCEOption TC-RCE authentication configuration message.
<li>Specifies the required field when the AttesterSource parameter value is TC-RCE.</li>.
     */
    public TCRCEOption getTCRCEOption() {
        return this.TCRCEOption;
    }

    /**
     * Set TC-RCE authentication configuration message.
<li>Specifies the required field when the AttesterSource parameter value is TC-RCE.</li>.
     * @param TCRCEOption TC-RCE authentication configuration message.
<li>Specifies the required field when the AttesterSource parameter value is TC-RCE.</li>.
     */
    public void setTCRCEOption(TCRCEOption TCRCEOption) {
        this.TCRCEOption = TCRCEOption;
    }

    /**
     * Get Specifies the configuration message for TC-CAPTCHA certification.
<li>Specifies the required field when the AttesterSource parameter value is TC-CAPTCHA.</li>. 
     * @return TCCaptchaOption Specifies the configuration message for TC-CAPTCHA certification.
<li>Specifies the required field when the AttesterSource parameter value is TC-CAPTCHA.</li>.
     */
    public TCCaptchaOption getTCCaptchaOption() {
        return this.TCCaptchaOption;
    }

    /**
     * Set Specifies the configuration message for TC-CAPTCHA certification.
<li>Specifies the required field when the AttesterSource parameter value is TC-CAPTCHA.</li>.
     * @param TCCaptchaOption Specifies the configuration message for TC-CAPTCHA certification.
<li>Specifies the required field when the AttesterSource parameter value is TC-CAPTCHA.</li>.
     */
    public void setTCCaptchaOption(TCCaptchaOption TCCaptchaOption) {
        this.TCCaptchaOption = TCCaptchaOption;
    }

    public ClientAttester() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientAttester(ClientAttester source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AttesterSource != null) {
            this.AttesterSource = new String(source.AttesterSource);
        }
        if (source.AttesterDuration != null) {
            this.AttesterDuration = new String(source.AttesterDuration);
        }
        if (source.TCRCEOption != null) {
            this.TCRCEOption = new TCRCEOption(source.TCRCEOption);
        }
        if (source.TCCaptchaOption != null) {
            this.TCCaptchaOption = new TCCaptchaOption(source.TCCaptchaOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AttesterSource", this.AttesterSource);
        this.setParamSimple(map, prefix + "AttesterDuration", this.AttesterDuration);
        this.setParamObj(map, prefix + "TCRCEOption.", this.TCRCEOption);
        this.setParamObj(map, prefix + "TCCaptchaOption.", this.TCCaptchaOption);

    }
}

