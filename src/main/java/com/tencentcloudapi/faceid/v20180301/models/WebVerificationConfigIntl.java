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

public class WebVerificationConfigIntl extends AbstractModel {

    /**
    * <p>Indicates whether to skip the start verification page when starting verification. If set to true, the verification process starts directly. The default value is false. If a fallback policy is triggered, this configuration does not take effect.</p>
    */
    @SerializedName("AutoSkipStartPage")
    @Expose
    private Boolean AutoSkipStartPage;

    /**
    * <p>Indicates whether to skip the result display page and automatically redirect to RedirectURL when verification succeeds. The default value is false.</p>
    */
    @SerializedName("AutoSkip")
    @Expose
    private Boolean AutoSkip;

    /**
    * <p>Detection mode. Valid values: <br>1: OCR + liveness detection + face comparison; <br>2: Liveness detection + face comparison; <br>3: Liveness detection; <br>4: OCR. <br>The default value is 2.</p>
    */
    @SerializedName("CheckMode")
    @Expose
    private Long CheckMode;

    /**
    * <p>The type of card used for authentication. Currently supported types: <br>1. HKIDCard: Hong Kong (China) ID card <br>2. MLIDCard: Malaysian ID card <br>3. IndonesiaIDCard: Indonesian ID card <br>4. PhilippinesVoteID: Philippine voter's card <br>5. PhilippinesDrivingLicense: Philippine driving license <br>6. PhilippinesTinID: Philippine TIN ID <br>7. PhilippinesSSSID: Philippine SSS ID <br>8. PhilippinesUMID: Philippine UMID <br>9. InternationalIDPassport: Passports from Hong Kong/Macao/Taiwan (China) and overseas <br>10. ThailandIDCard: Thai ID card <br>11. SingaporeIDCard: Singaporean ID card <br>12. MainlandIDCard: Mainland ID card</p>
    */
    @SerializedName("IDCardType")
    @Expose
    private String IDCardType;

    /**
    * <p>Indicates whether to disable document alerts. The default value is false, which means the alert detection feature is enabled. When enabled, the identity authentication process will be blocked based on document alerts. If you need to use the document authentication feature, please <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
    */
    @SerializedName("DisableCheckOcrWarnings")
    @Expose
    private Boolean DisableCheckOcrWarnings;

    /**
    * <p>Security level of authentication: <br>1: Silent liveness; <br>2: Motion liveness; <br>3: Light liveness; <br>4: Motion + light liveness; <br>The default value is 3.</p>
    */
    @SerializedName("SecurityLevel")
    @Expose
    private Long SecurityLevel;

    /**
    * <p>Indicates whether to skip the agreement page. The default value is false. When SkipPrivacyPolicy is false, the agreement page is displayed and the privacy agreement must be selected. When SkipPrivacyPolicy is true, the agreement page is skipped and the liveness process starts directly without selecting the privacy agreement.</p>
    */
    @SerializedName("SkipPrivacyPolicy")
    @Expose
    private Boolean SkipPrivacyPolicy;

    /**
    * <p>The default value is false. When set to false, the original document image is displayed. When set to true, the cropped document image is displayed.</p>
    */
    @SerializedName("IdCardCutReturn")
    @Expose
    private Boolean IdCardCutReturn;

    /**
    * <p>Frontend theme color, in the format of an RGB hexadecimal color code. The default value is "#2d72f1". If the format is incorrect, the default color is used.</p>
    */
    @SerializedName("ThemeColor")
    @Expose
    private String ThemeColor;

    /**
    * <p>Internationalization language. The default value is en (English). Currently supported languages: <br>th: Thai; <br>en: English; <br>zh-cn: Simplified Chinese; <br>zh-tc: Traditional Chinese; <br>id: Indonesian.</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Automatic fallback mode. Valid values: <br>1: Fall back to silent liveness mode; <br>2: Disable fallback mode. <br>The default value is 1.</p>
    */
    @SerializedName("AutoDowngrade")
    @Expose
    private Long AutoDowngrade;

    /**
    * <p>Controls the action sequence. The action types are as follows: <br>"blink" <br>"mouth" <br>"nod" <br>"shake" <br>You can select 1 to 2 actions from the four. <br>Single action example: "blink" <br>Multiple actions example: "blink,mouth". <br>The default value is blink. <br>This parameter takes effect only when SecurityLevel is 2, 4, or 5. Otherwise, an error is reported.</p>
    */
    @SerializedName("ActionList")
    @Expose
    private String ActionList;

    /**
    * <p>Maximum number of liveness verification attempts. The valid range is 1–99. The default value is 99.</p>
    */
    @SerializedName("LivenessRetryLimit")
    @Expose
    private Long LivenessRetryLimit;

    /**
    * <p>Controls the liveness detection timeout in seconds. The valid range is (0, 600]. The default value is 45 seconds.</p>
    */
    @SerializedName("LivenessTimeout")
    @Expose
    private Long LivenessTimeout;

    /**
    * <p>Selects the OCR alerts to pay attention to. When a selected OCR alert occurs, the identity authentication process is interrupted. The default value is empty, indicating that all alerts are selected. This feature requires the parameter DisableCheckOcrWarnings=false. If alerts are disabled, this parameter does not take effect.</p><p>List of alert codes and their meanings: <br>-9101 Incomplete border alert <br>-9102 Photocopy alert <br>-9103 Recapture alert <br>-9104 Photoshop alert <br>-9107 Reflection alert <br>-9108 Blur alert <br>-9109 Alert not enabled</p>
    */
    @SerializedName("SelectedWarningCodes")
    @Expose
    private String SelectedWarningCodes;

    /**
    * <p>Indicates whether expired identity documents are allowed to enter the liveness detection process. This parameter takes effect only when the document type is Hong Kong (China) identity card (HKID). <br>true (default): Expired Hong Kong (China) identity cards are allowed to enter the liveness detection process. <br>false: Expired Hong Kong (China) identity cards are rejected and cannot enter the liveness detection process.</p>
    */
    @SerializedName("AllowExpiredDocument")
    @Expose
    private Boolean AllowExpiredDocument;

    /**
    * <p>Service edition, including the basic edition (BASIC) and the PLUS edition (PLUS).</p><p>Valid values:</p><ul><li>BASIC: Basic edition</li><li>PLUS: PLUS edition</li></ul><p>Default value: BASIC</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>When <code>CheckMode = 1</code>, this parameter defines the waiting policy for the OCR recognition result.</p><p>Valid values:</p><ul><li>required: Wait until the OCR verification result is confirmed before proceeding to liveness detection.</li><li>skip: Proceed to liveness detection directly after the document photo is submitted.</li></ul><p>Default value: required</p>
    */
    @SerializedName("OcrWaitPolicy")
    @Expose
    private String OcrWaitPolicy;

    /**
    * <p>Verification status callback URL. After this URL is configured, the service actively pushes notifications to this URL when the process ends. Leave it empty to disable the callback capability. As callbacks cannot be guaranteed to be 100% reliable, it is recommended to use them together with a polling mechanism to ensure that the final status is obtained.</p>
    */
    @SerializedName("WebhookUrl")
    @Expose
    private String WebhookUrl;

    /**
     * Get <p>Indicates whether to skip the start verification page when starting verification. If set to true, the verification process starts directly. The default value is false. If a fallback policy is triggered, this configuration does not take effect.</p> 
     * @return AutoSkipStartPage <p>Indicates whether to skip the start verification page when starting verification. If set to true, the verification process starts directly. The default value is false. If a fallback policy is triggered, this configuration does not take effect.</p>
     */
    public Boolean getAutoSkipStartPage() {
        return this.AutoSkipStartPage;
    }

    /**
     * Set <p>Indicates whether to skip the start verification page when starting verification. If set to true, the verification process starts directly. The default value is false. If a fallback policy is triggered, this configuration does not take effect.</p>
     * @param AutoSkipStartPage <p>Indicates whether to skip the start verification page when starting verification. If set to true, the verification process starts directly. The default value is false. If a fallback policy is triggered, this configuration does not take effect.</p>
     */
    public void setAutoSkipStartPage(Boolean AutoSkipStartPage) {
        this.AutoSkipStartPage = AutoSkipStartPage;
    }

    /**
     * Get <p>Indicates whether to skip the result display page and automatically redirect to RedirectURL when verification succeeds. The default value is false.</p> 
     * @return AutoSkip <p>Indicates whether to skip the result display page and automatically redirect to RedirectURL when verification succeeds. The default value is false.</p>
     */
    public Boolean getAutoSkip() {
        return this.AutoSkip;
    }

    /**
     * Set <p>Indicates whether to skip the result display page and automatically redirect to RedirectURL when verification succeeds. The default value is false.</p>
     * @param AutoSkip <p>Indicates whether to skip the result display page and automatically redirect to RedirectURL when verification succeeds. The default value is false.</p>
     */
    public void setAutoSkip(Boolean AutoSkip) {
        this.AutoSkip = AutoSkip;
    }

    /**
     * Get <p>Detection mode. Valid values: <br>1: OCR + liveness detection + face comparison; <br>2: Liveness detection + face comparison; <br>3: Liveness detection; <br>4: OCR. <br>The default value is 2.</p> 
     * @return CheckMode <p>Detection mode. Valid values: <br>1: OCR + liveness detection + face comparison; <br>2: Liveness detection + face comparison; <br>3: Liveness detection; <br>4: OCR. <br>The default value is 2.</p>
     */
    public Long getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set <p>Detection mode. Valid values: <br>1: OCR + liveness detection + face comparison; <br>2: Liveness detection + face comparison; <br>3: Liveness detection; <br>4: OCR. <br>The default value is 2.</p>
     * @param CheckMode <p>Detection mode. Valid values: <br>1: OCR + liveness detection + face comparison; <br>2: Liveness detection + face comparison; <br>3: Liveness detection; <br>4: OCR. <br>The default value is 2.</p>
     */
    public void setCheckMode(Long CheckMode) {
        this.CheckMode = CheckMode;
    }

    /**
     * Get <p>The type of card used for authentication. Currently supported types: <br>1. HKIDCard: Hong Kong (China) ID card <br>2. MLIDCard: Malaysian ID card <br>3. IndonesiaIDCard: Indonesian ID card <br>4. PhilippinesVoteID: Philippine voter's card <br>5. PhilippinesDrivingLicense: Philippine driving license <br>6. PhilippinesTinID: Philippine TIN ID <br>7. PhilippinesSSSID: Philippine SSS ID <br>8. PhilippinesUMID: Philippine UMID <br>9. InternationalIDPassport: Passports from Hong Kong/Macao/Taiwan (China) and overseas <br>10. ThailandIDCard: Thai ID card <br>11. SingaporeIDCard: Singaporean ID card <br>12. MainlandIDCard: Mainland ID card</p> 
     * @return IDCardType <p>The type of card used for authentication. Currently supported types: <br>1. HKIDCard: Hong Kong (China) ID card <br>2. MLIDCard: Malaysian ID card <br>3. IndonesiaIDCard: Indonesian ID card <br>4. PhilippinesVoteID: Philippine voter's card <br>5. PhilippinesDrivingLicense: Philippine driving license <br>6. PhilippinesTinID: Philippine TIN ID <br>7. PhilippinesSSSID: Philippine SSS ID <br>8. PhilippinesUMID: Philippine UMID <br>9. InternationalIDPassport: Passports from Hong Kong/Macao/Taiwan (China) and overseas <br>10. ThailandIDCard: Thai ID card <br>11. SingaporeIDCard: Singaporean ID card <br>12. MainlandIDCard: Mainland ID card</p>
     */
    public String getIDCardType() {
        return this.IDCardType;
    }

    /**
     * Set <p>The type of card used for authentication. Currently supported types: <br>1. HKIDCard: Hong Kong (China) ID card <br>2. MLIDCard: Malaysian ID card <br>3. IndonesiaIDCard: Indonesian ID card <br>4. PhilippinesVoteID: Philippine voter's card <br>5. PhilippinesDrivingLicense: Philippine driving license <br>6. PhilippinesTinID: Philippine TIN ID <br>7. PhilippinesSSSID: Philippine SSS ID <br>8. PhilippinesUMID: Philippine UMID <br>9. InternationalIDPassport: Passports from Hong Kong/Macao/Taiwan (China) and overseas <br>10. ThailandIDCard: Thai ID card <br>11. SingaporeIDCard: Singaporean ID card <br>12. MainlandIDCard: Mainland ID card</p>
     * @param IDCardType <p>The type of card used for authentication. Currently supported types: <br>1. HKIDCard: Hong Kong (China) ID card <br>2. MLIDCard: Malaysian ID card <br>3. IndonesiaIDCard: Indonesian ID card <br>4. PhilippinesVoteID: Philippine voter's card <br>5. PhilippinesDrivingLicense: Philippine driving license <br>6. PhilippinesTinID: Philippine TIN ID <br>7. PhilippinesSSSID: Philippine SSS ID <br>8. PhilippinesUMID: Philippine UMID <br>9. InternationalIDPassport: Passports from Hong Kong/Macao/Taiwan (China) and overseas <br>10. ThailandIDCard: Thai ID card <br>11. SingaporeIDCard: Singaporean ID card <br>12. MainlandIDCard: Mainland ID card</p>
     */
    public void setIDCardType(String IDCardType) {
        this.IDCardType = IDCardType;
    }

    /**
     * Get <p>Indicates whether to disable document alerts. The default value is false, which means the alert detection feature is enabled. When enabled, the identity authentication process will be blocked based on document alerts. If you need to use the document authentication feature, please <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p> 
     * @return DisableCheckOcrWarnings <p>Indicates whether to disable document alerts. The default value is false, which means the alert detection feature is enabled. When enabled, the identity authentication process will be blocked based on document alerts. If you need to use the document authentication feature, please <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
     */
    public Boolean getDisableCheckOcrWarnings() {
        return this.DisableCheckOcrWarnings;
    }

    /**
     * Set <p>Indicates whether to disable document alerts. The default value is false, which means the alert detection feature is enabled. When enabled, the identity authentication process will be blocked based on document alerts. If you need to use the document authentication feature, please <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
     * @param DisableCheckOcrWarnings <p>Indicates whether to disable document alerts. The default value is false, which means the alert detection feature is enabled. When enabled, the identity authentication process will be blocked based on document alerts. If you need to use the document authentication feature, please <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
     */
    public void setDisableCheckOcrWarnings(Boolean DisableCheckOcrWarnings) {
        this.DisableCheckOcrWarnings = DisableCheckOcrWarnings;
    }

    /**
     * Get <p>Security level of authentication: <br>1: Silent liveness; <br>2: Motion liveness; <br>3: Light liveness; <br>4: Motion + light liveness; <br>The default value is 3.</p> 
     * @return SecurityLevel <p>Security level of authentication: <br>1: Silent liveness; <br>2: Motion liveness; <br>3: Light liveness; <br>4: Motion + light liveness; <br>The default value is 3.</p>
     */
    public Long getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set <p>Security level of authentication: <br>1: Silent liveness; <br>2: Motion liveness; <br>3: Light liveness; <br>4: Motion + light liveness; <br>The default value is 3.</p>
     * @param SecurityLevel <p>Security level of authentication: <br>1: Silent liveness; <br>2: Motion liveness; <br>3: Light liveness; <br>4: Motion + light liveness; <br>The default value is 3.</p>
     */
    public void setSecurityLevel(Long SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    /**
     * Get <p>Indicates whether to skip the agreement page. The default value is false. When SkipPrivacyPolicy is false, the agreement page is displayed and the privacy agreement must be selected. When SkipPrivacyPolicy is true, the agreement page is skipped and the liveness process starts directly without selecting the privacy agreement.</p> 
     * @return SkipPrivacyPolicy <p>Indicates whether to skip the agreement page. The default value is false. When SkipPrivacyPolicy is false, the agreement page is displayed and the privacy agreement must be selected. When SkipPrivacyPolicy is true, the agreement page is skipped and the liveness process starts directly without selecting the privacy agreement.</p>
     */
    public Boolean getSkipPrivacyPolicy() {
        return this.SkipPrivacyPolicy;
    }

    /**
     * Set <p>Indicates whether to skip the agreement page. The default value is false. When SkipPrivacyPolicy is false, the agreement page is displayed and the privacy agreement must be selected. When SkipPrivacyPolicy is true, the agreement page is skipped and the liveness process starts directly without selecting the privacy agreement.</p>
     * @param SkipPrivacyPolicy <p>Indicates whether to skip the agreement page. The default value is false. When SkipPrivacyPolicy is false, the agreement page is displayed and the privacy agreement must be selected. When SkipPrivacyPolicy is true, the agreement page is skipped and the liveness process starts directly without selecting the privacy agreement.</p>
     */
    public void setSkipPrivacyPolicy(Boolean SkipPrivacyPolicy) {
        this.SkipPrivacyPolicy = SkipPrivacyPolicy;
    }

    /**
     * Get <p>The default value is false. When set to false, the original document image is displayed. When set to true, the cropped document image is displayed.</p> 
     * @return IdCardCutReturn <p>The default value is false. When set to false, the original document image is displayed. When set to true, the cropped document image is displayed.</p>
     */
    public Boolean getIdCardCutReturn() {
        return this.IdCardCutReturn;
    }

    /**
     * Set <p>The default value is false. When set to false, the original document image is displayed. When set to true, the cropped document image is displayed.</p>
     * @param IdCardCutReturn <p>The default value is false. When set to false, the original document image is displayed. When set to true, the cropped document image is displayed.</p>
     */
    public void setIdCardCutReturn(Boolean IdCardCutReturn) {
        this.IdCardCutReturn = IdCardCutReturn;
    }

    /**
     * Get <p>Frontend theme color, in the format of an RGB hexadecimal color code. The default value is "#2d72f1". If the format is incorrect, the default color is used.</p> 
     * @return ThemeColor <p>Frontend theme color, in the format of an RGB hexadecimal color code. The default value is "#2d72f1". If the format is incorrect, the default color is used.</p>
     */
    public String getThemeColor() {
        return this.ThemeColor;
    }

    /**
     * Set <p>Frontend theme color, in the format of an RGB hexadecimal color code. The default value is "#2d72f1". If the format is incorrect, the default color is used.</p>
     * @param ThemeColor <p>Frontend theme color, in the format of an RGB hexadecimal color code. The default value is "#2d72f1". If the format is incorrect, the default color is used.</p>
     */
    public void setThemeColor(String ThemeColor) {
        this.ThemeColor = ThemeColor;
    }

    /**
     * Get <p>Internationalization language. The default value is en (English). Currently supported languages: <br>th: Thai; <br>en: English; <br>zh-cn: Simplified Chinese; <br>zh-tc: Traditional Chinese; <br>id: Indonesian.</p> 
     * @return Language <p>Internationalization language. The default value is en (English). Currently supported languages: <br>th: Thai; <br>en: English; <br>zh-cn: Simplified Chinese; <br>zh-tc: Traditional Chinese; <br>id: Indonesian.</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>Internationalization language. The default value is en (English). Currently supported languages: <br>th: Thai; <br>en: English; <br>zh-cn: Simplified Chinese; <br>zh-tc: Traditional Chinese; <br>id: Indonesian.</p>
     * @param Language <p>Internationalization language. The default value is en (English). Currently supported languages: <br>th: Thai; <br>en: English; <br>zh-cn: Simplified Chinese; <br>zh-tc: Traditional Chinese; <br>id: Indonesian.</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Automatic fallback mode. Valid values: <br>1: Fall back to silent liveness mode; <br>2: Disable fallback mode. <br>The default value is 1.</p> 
     * @return AutoDowngrade <p>Automatic fallback mode. Valid values: <br>1: Fall back to silent liveness mode; <br>2: Disable fallback mode. <br>The default value is 1.</p>
     */
    public Long getAutoDowngrade() {
        return this.AutoDowngrade;
    }

    /**
     * Set <p>Automatic fallback mode. Valid values: <br>1: Fall back to silent liveness mode; <br>2: Disable fallback mode. <br>The default value is 1.</p>
     * @param AutoDowngrade <p>Automatic fallback mode. Valid values: <br>1: Fall back to silent liveness mode; <br>2: Disable fallback mode. <br>The default value is 1.</p>
     */
    public void setAutoDowngrade(Long AutoDowngrade) {
        this.AutoDowngrade = AutoDowngrade;
    }

    /**
     * Get <p>Controls the action sequence. The action types are as follows: <br>"blink" <br>"mouth" <br>"nod" <br>"shake" <br>You can select 1 to 2 actions from the four. <br>Single action example: "blink" <br>Multiple actions example: "blink,mouth". <br>The default value is blink. <br>This parameter takes effect only when SecurityLevel is 2, 4, or 5. Otherwise, an error is reported.</p> 
     * @return ActionList <p>Controls the action sequence. The action types are as follows: <br>"blink" <br>"mouth" <br>"nod" <br>"shake" <br>You can select 1 to 2 actions from the four. <br>Single action example: "blink" <br>Multiple actions example: "blink,mouth". <br>The default value is blink. <br>This parameter takes effect only when SecurityLevel is 2, 4, or 5. Otherwise, an error is reported.</p>
     */
    public String getActionList() {
        return this.ActionList;
    }

    /**
     * Set <p>Controls the action sequence. The action types are as follows: <br>"blink" <br>"mouth" <br>"nod" <br>"shake" <br>You can select 1 to 2 actions from the four. <br>Single action example: "blink" <br>Multiple actions example: "blink,mouth". <br>The default value is blink. <br>This parameter takes effect only when SecurityLevel is 2, 4, or 5. Otherwise, an error is reported.</p>
     * @param ActionList <p>Controls the action sequence. The action types are as follows: <br>"blink" <br>"mouth" <br>"nod" <br>"shake" <br>You can select 1 to 2 actions from the four. <br>Single action example: "blink" <br>Multiple actions example: "blink,mouth". <br>The default value is blink. <br>This parameter takes effect only when SecurityLevel is 2, 4, or 5. Otherwise, an error is reported.</p>
     */
    public void setActionList(String ActionList) {
        this.ActionList = ActionList;
    }

    /**
     * Get <p>Maximum number of liveness verification attempts. The valid range is 1–99. The default value is 99.</p> 
     * @return LivenessRetryLimit <p>Maximum number of liveness verification attempts. The valid range is 1–99. The default value is 99.</p>
     */
    public Long getLivenessRetryLimit() {
        return this.LivenessRetryLimit;
    }

    /**
     * Set <p>Maximum number of liveness verification attempts. The valid range is 1–99. The default value is 99.</p>
     * @param LivenessRetryLimit <p>Maximum number of liveness verification attempts. The valid range is 1–99. The default value is 99.</p>
     */
    public void setLivenessRetryLimit(Long LivenessRetryLimit) {
        this.LivenessRetryLimit = LivenessRetryLimit;
    }

    /**
     * Get <p>Controls the liveness detection timeout in seconds. The valid range is (0, 600]. The default value is 45 seconds.</p> 
     * @return LivenessTimeout <p>Controls the liveness detection timeout in seconds. The valid range is (0, 600]. The default value is 45 seconds.</p>
     */
    public Long getLivenessTimeout() {
        return this.LivenessTimeout;
    }

    /**
     * Set <p>Controls the liveness detection timeout in seconds. The valid range is (0, 600]. The default value is 45 seconds.</p>
     * @param LivenessTimeout <p>Controls the liveness detection timeout in seconds. The valid range is (0, 600]. The default value is 45 seconds.</p>
     */
    public void setLivenessTimeout(Long LivenessTimeout) {
        this.LivenessTimeout = LivenessTimeout;
    }

    /**
     * Get <p>Selects the OCR alerts to pay attention to. When a selected OCR alert occurs, the identity authentication process is interrupted. The default value is empty, indicating that all alerts are selected. This feature requires the parameter DisableCheckOcrWarnings=false. If alerts are disabled, this parameter does not take effect.</p><p>List of alert codes and their meanings: <br>-9101 Incomplete border alert <br>-9102 Photocopy alert <br>-9103 Recapture alert <br>-9104 Photoshop alert <br>-9107 Reflection alert <br>-9108 Blur alert <br>-9109 Alert not enabled</p> 
     * @return SelectedWarningCodes <p>Selects the OCR alerts to pay attention to. When a selected OCR alert occurs, the identity authentication process is interrupted. The default value is empty, indicating that all alerts are selected. This feature requires the parameter DisableCheckOcrWarnings=false. If alerts are disabled, this parameter does not take effect.</p><p>List of alert codes and their meanings: <br>-9101 Incomplete border alert <br>-9102 Photocopy alert <br>-9103 Recapture alert <br>-9104 Photoshop alert <br>-9107 Reflection alert <br>-9108 Blur alert <br>-9109 Alert not enabled</p>
     */
    public String getSelectedWarningCodes() {
        return this.SelectedWarningCodes;
    }

    /**
     * Set <p>Selects the OCR alerts to pay attention to. When a selected OCR alert occurs, the identity authentication process is interrupted. The default value is empty, indicating that all alerts are selected. This feature requires the parameter DisableCheckOcrWarnings=false. If alerts are disabled, this parameter does not take effect.</p><p>List of alert codes and their meanings: <br>-9101 Incomplete border alert <br>-9102 Photocopy alert <br>-9103 Recapture alert <br>-9104 Photoshop alert <br>-9107 Reflection alert <br>-9108 Blur alert <br>-9109 Alert not enabled</p>
     * @param SelectedWarningCodes <p>Selects the OCR alerts to pay attention to. When a selected OCR alert occurs, the identity authentication process is interrupted. The default value is empty, indicating that all alerts are selected. This feature requires the parameter DisableCheckOcrWarnings=false. If alerts are disabled, this parameter does not take effect.</p><p>List of alert codes and their meanings: <br>-9101 Incomplete border alert <br>-9102 Photocopy alert <br>-9103 Recapture alert <br>-9104 Photoshop alert <br>-9107 Reflection alert <br>-9108 Blur alert <br>-9109 Alert not enabled</p>
     */
    public void setSelectedWarningCodes(String SelectedWarningCodes) {
        this.SelectedWarningCodes = SelectedWarningCodes;
    }

    /**
     * Get <p>Indicates whether expired identity documents are allowed to enter the liveness detection process. This parameter takes effect only when the document type is Hong Kong (China) identity card (HKID). <br>true (default): Expired Hong Kong (China) identity cards are allowed to enter the liveness detection process. <br>false: Expired Hong Kong (China) identity cards are rejected and cannot enter the liveness detection process.</p> 
     * @return AllowExpiredDocument <p>Indicates whether expired identity documents are allowed to enter the liveness detection process. This parameter takes effect only when the document type is Hong Kong (China) identity card (HKID). <br>true (default): Expired Hong Kong (China) identity cards are allowed to enter the liveness detection process. <br>false: Expired Hong Kong (China) identity cards are rejected and cannot enter the liveness detection process.</p>
     */
    public Boolean getAllowExpiredDocument() {
        return this.AllowExpiredDocument;
    }

    /**
     * Set <p>Indicates whether expired identity documents are allowed to enter the liveness detection process. This parameter takes effect only when the document type is Hong Kong (China) identity card (HKID). <br>true (default): Expired Hong Kong (China) identity cards are allowed to enter the liveness detection process. <br>false: Expired Hong Kong (China) identity cards are rejected and cannot enter the liveness detection process.</p>
     * @param AllowExpiredDocument <p>Indicates whether expired identity documents are allowed to enter the liveness detection process. This parameter takes effect only when the document type is Hong Kong (China) identity card (HKID). <br>true (default): Expired Hong Kong (China) identity cards are allowed to enter the liveness detection process. <br>false: Expired Hong Kong (China) identity cards are rejected and cannot enter the liveness detection process.</p>
     */
    public void setAllowExpiredDocument(Boolean AllowExpiredDocument) {
        this.AllowExpiredDocument = AllowExpiredDocument;
    }

    /**
     * Get <p>Service edition, including the basic edition (BASIC) and the PLUS edition (PLUS).</p><p>Valid values:</p><ul><li>BASIC: Basic edition</li><li>PLUS: PLUS edition</li></ul><p>Default value: BASIC</p> 
     * @return Version <p>Service edition, including the basic edition (BASIC) and the PLUS edition (PLUS).</p><p>Valid values:</p><ul><li>BASIC: Basic edition</li><li>PLUS: PLUS edition</li></ul><p>Default value: BASIC</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Service edition, including the basic edition (BASIC) and the PLUS edition (PLUS).</p><p>Valid values:</p><ul><li>BASIC: Basic edition</li><li>PLUS: PLUS edition</li></ul><p>Default value: BASIC</p>
     * @param Version <p>Service edition, including the basic edition (BASIC) and the PLUS edition (PLUS).</p><p>Valid values:</p><ul><li>BASIC: Basic edition</li><li>PLUS: PLUS edition</li></ul><p>Default value: BASIC</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>When <code>CheckMode = 1</code>, this parameter defines the waiting policy for the OCR recognition result.</p><p>Valid values:</p><ul><li>required: Wait until the OCR verification result is confirmed before proceeding to liveness detection.</li><li>skip: Proceed to liveness detection directly after the document photo is submitted.</li></ul><p>Default value: required</p> 
     * @return OcrWaitPolicy <p>When <code>CheckMode = 1</code>, this parameter defines the waiting policy for the OCR recognition result.</p><p>Valid values:</p><ul><li>required: Wait until the OCR verification result is confirmed before proceeding to liveness detection.</li><li>skip: Proceed to liveness detection directly after the document photo is submitted.</li></ul><p>Default value: required</p>
     */
    public String getOcrWaitPolicy() {
        return this.OcrWaitPolicy;
    }

    /**
     * Set <p>When <code>CheckMode = 1</code>, this parameter defines the waiting policy for the OCR recognition result.</p><p>Valid values:</p><ul><li>required: Wait until the OCR verification result is confirmed before proceeding to liveness detection.</li><li>skip: Proceed to liveness detection directly after the document photo is submitted.</li></ul><p>Default value: required</p>
     * @param OcrWaitPolicy <p>When <code>CheckMode = 1</code>, this parameter defines the waiting policy for the OCR recognition result.</p><p>Valid values:</p><ul><li>required: Wait until the OCR verification result is confirmed before proceeding to liveness detection.</li><li>skip: Proceed to liveness detection directly after the document photo is submitted.</li></ul><p>Default value: required</p>
     */
    public void setOcrWaitPolicy(String OcrWaitPolicy) {
        this.OcrWaitPolicy = OcrWaitPolicy;
    }

    /**
     * Get <p>Verification status callback URL. After this URL is configured, the service actively pushes notifications to this URL when the process ends. Leave it empty to disable the callback capability. As callbacks cannot be guaranteed to be 100% reliable, it is recommended to use them together with a polling mechanism to ensure that the final status is obtained.</p> 
     * @return WebhookUrl <p>Verification status callback URL. After this URL is configured, the service actively pushes notifications to this URL when the process ends. Leave it empty to disable the callback capability. As callbacks cannot be guaranteed to be 100% reliable, it is recommended to use them together with a polling mechanism to ensure that the final status is obtained.</p>
     */
    public String getWebhookUrl() {
        return this.WebhookUrl;
    }

    /**
     * Set <p>Verification status callback URL. After this URL is configured, the service actively pushes notifications to this URL when the process ends. Leave it empty to disable the callback capability. As callbacks cannot be guaranteed to be 100% reliable, it is recommended to use them together with a polling mechanism to ensure that the final status is obtained.</p>
     * @param WebhookUrl <p>Verification status callback URL. After this URL is configured, the service actively pushes notifications to this URL when the process ends. Leave it empty to disable the callback capability. As callbacks cannot be guaranteed to be 100% reliable, it is recommended to use them together with a polling mechanism to ensure that the final status is obtained.</p>
     */
    public void setWebhookUrl(String WebhookUrl) {
        this.WebhookUrl = WebhookUrl;
    }

    public WebVerificationConfigIntl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebVerificationConfigIntl(WebVerificationConfigIntl source) {
        if (source.AutoSkipStartPage != null) {
            this.AutoSkipStartPage = new Boolean(source.AutoSkipStartPage);
        }
        if (source.AutoSkip != null) {
            this.AutoSkip = new Boolean(source.AutoSkip);
        }
        if (source.CheckMode != null) {
            this.CheckMode = new Long(source.CheckMode);
        }
        if (source.IDCardType != null) {
            this.IDCardType = new String(source.IDCardType);
        }
        if (source.DisableCheckOcrWarnings != null) {
            this.DisableCheckOcrWarnings = new Boolean(source.DisableCheckOcrWarnings);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new Long(source.SecurityLevel);
        }
        if (source.SkipPrivacyPolicy != null) {
            this.SkipPrivacyPolicy = new Boolean(source.SkipPrivacyPolicy);
        }
        if (source.IdCardCutReturn != null) {
            this.IdCardCutReturn = new Boolean(source.IdCardCutReturn);
        }
        if (source.ThemeColor != null) {
            this.ThemeColor = new String(source.ThemeColor);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.AutoDowngrade != null) {
            this.AutoDowngrade = new Long(source.AutoDowngrade);
        }
        if (source.ActionList != null) {
            this.ActionList = new String(source.ActionList);
        }
        if (source.LivenessRetryLimit != null) {
            this.LivenessRetryLimit = new Long(source.LivenessRetryLimit);
        }
        if (source.LivenessTimeout != null) {
            this.LivenessTimeout = new Long(source.LivenessTimeout);
        }
        if (source.SelectedWarningCodes != null) {
            this.SelectedWarningCodes = new String(source.SelectedWarningCodes);
        }
        if (source.AllowExpiredDocument != null) {
            this.AllowExpiredDocument = new Boolean(source.AllowExpiredDocument);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.OcrWaitPolicy != null) {
            this.OcrWaitPolicy = new String(source.OcrWaitPolicy);
        }
        if (source.WebhookUrl != null) {
            this.WebhookUrl = new String(source.WebhookUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSkipStartPage", this.AutoSkipStartPage);
        this.setParamSimple(map, prefix + "AutoSkip", this.AutoSkip);
        this.setParamSimple(map, prefix + "CheckMode", this.CheckMode);
        this.setParamSimple(map, prefix + "IDCardType", this.IDCardType);
        this.setParamSimple(map, prefix + "DisableCheckOcrWarnings", this.DisableCheckOcrWarnings);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);
        this.setParamSimple(map, prefix + "SkipPrivacyPolicy", this.SkipPrivacyPolicy);
        this.setParamSimple(map, prefix + "IdCardCutReturn", this.IdCardCutReturn);
        this.setParamSimple(map, prefix + "ThemeColor", this.ThemeColor);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "AutoDowngrade", this.AutoDowngrade);
        this.setParamSimple(map, prefix + "ActionList", this.ActionList);
        this.setParamSimple(map, prefix + "LivenessRetryLimit", this.LivenessRetryLimit);
        this.setParamSimple(map, prefix + "LivenessTimeout", this.LivenessTimeout);
        this.setParamSimple(map, prefix + "SelectedWarningCodes", this.SelectedWarningCodes);
        this.setParamSimple(map, prefix + "AllowExpiredDocument", this.AllowExpiredDocument);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "OcrWaitPolicy", this.OcrWaitPolicy);
        this.setParamSimple(map, prefix + "WebhookUrl", this.WebhookUrl);

    }
}

