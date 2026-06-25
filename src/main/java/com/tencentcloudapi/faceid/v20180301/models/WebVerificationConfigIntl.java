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
    * <p>Whether to skip the start verification webpage when starting verification. If true, directly enter the verification process. Default false. If the degradation policy is triggered, this configuration will not take effect.</p>
    */
    @SerializedName("AutoSkipStartPage")
    @Expose
    private Boolean AutoSkipStartPage;

    /**
    * <p>Whether to skip the result display page and automatically jump to RedirectURL when verification is successful. Default false.</p>
    */
    @SerializedName("AutoSkip")
    @Expose
    private Boolean AutoSkip;

    /**
    * <p>Detection mode. Parameter values are as follows:<br>1: OCR+liveness detection+face comparison;<br>2: liveness detection+face comparison;<br>3: liveness detection;<br>4: OCR;<br>Default value is 2.</p>
    */
    @SerializedName("CheckMode")
    @Expose
    private Long CheckMode;

    /**
    * <p>Identity document type used for authentication. Currently supported:<br>1.HKIDCard: Hong Kong (China) identity card<br>2.MLIDCard: Malaysian identity card<br>3.IndonesiaIDCard: Indonesian Identity Card<br>4.PhilippinesVoteID: Philippines voter card<br>5.PhilippinesDrivingLicense: Philippines driving license<br>6.PhilippinesTinID: Philippines TinID<br>7.PhilippinesSSSID: Philippines SSSID<br>8.PhilippinesUMID: Philippines UMID<br>9.InternationalIDPassport: Passport for Hong Kong (China), Macao (China), and Taiwan (China) as well as overseas passport<br>10.ThailandIDCard: Thai Identity Card<br>11.SingaporeIDCard: Singapore ID card<br>12.MainlandIDCard: Mainland ID card</p>
    */
    @SerializedName("IDCardType")
    @Expose
    private String IDCardType;

    /**
    * <p>Want to close document alarm, false by default (enable alarm detection). When enabled, the identity verification process will intercept based on the document alarm status. If you need to use document anti-counterfeiting functionality, <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
    */
    @SerializedName("DisableCheckOcrWarnings")
    @Expose
    private Boolean DisableCheckOcrWarnings;

    /**
    * <p>Security level of authentication:<br>1: Silent liveness;<br>2: Action liveness;<br>3: Light liveness;<br>4: Action + light liveness;<br>Default value is 3.</p>
    */
    @SerializedName("SecurityLevel")
    @Expose
    private Long SecurityLevel;

    /**
    * <p>Whether to skip the privacy agreement webpage, default false. When SkipPrivacyPolicy is false, the privacy agreement webpage will show and the privacy agreement must be checked. When SkipPrivacyPolicy is true, the privacy agreement webpage will be skipped to directly enter the Live Face Process without the need to check the privacy agreement webpage.</p>
    */
    @SerializedName("SkipPrivacyPolicy")
    @Expose
    private Boolean SkipPrivacyPolicy;

    /**
    * <p>Default false. When false, show the original document image. When true, show the split document image.</p>
    */
    @SerializedName("IdCardCutReturn")
    @Expose
    private Boolean IdCardCutReturn;

    /**
    * <p>Frontend theme color in base 16 RGB format. Defaults to "#2d72f1". Uses default values if the format is incorrect.</p>
    */
    @SerializedName("ThemeColor")
    @Expose
    private String ThemeColor;

    /**
    * <p>Internationalized language, defaults to en (English). Currently supported:<br>th: Thai;<br>en: English;<br>zh-cn: Simplified Chinese;<br>zh-tc: Traditional Chinese;<br>id: Indonesia;</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Automatic downgrade mode. Parameter values as follows:<br>1: Downgrade to silent liveness mode.<br>2: Disable downgrade mode.<br>Default value: 1.</p>
    */
    @SerializedName("AutoDowngrade")
    @Expose
    private Long AutoDowngrade;

    /**
    * <p>Control the action sequence. Action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value: blink<br>Input this parameter only when SecurityLevel is 2, 4, or 5 for different action types to take effect; otherwise, an API error occurs.</p>
    */
    @SerializedName("ActionList")
    @Expose
    private String ActionList;

    /**
    * <p>Maximum liveness verification attempts. Value ranges from 1 to 99. Default value is 99.</p>
    */
    @SerializedName("LivenessRetryLimit")
    @Expose
    private Long LivenessRetryLimit;

    /**
    * <p>Control the liveness detection timeout period in seconds. The value ranges from 0 to 600. Default: 45 seconds.</p>
    */
    @SerializedName("LivenessTimeout")
    @Expose
    private Long LivenessTimeout;

    /**
    * <p>Select OCR alarms that require attention. When an OCR alarm is generated, the identity verification process will be interrupted. The default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the alarm is disabled, this parameter will not be effective.</p><p>Alarm code list and definitions:<br>-9101 Incomplete border alarm<br>-9102 Photocopies alarm<br>-9103 Alarm for rephotographing<br>-9104 ps alarm<br>-9107 Reflective alarm<br>-9108 Blurry alarm<br>-9109 Alarm not enabled</p>
    */
    @SerializedName("SelectedWarningCodes")
    @Expose
    private String SelectedWarningCodes;

    /**
    * <p>Whether to allow expired identity documents to enter the liveness detection process. This parameter is valid only when the document type is Hong Kong identity card (HKID).<br>true (default value): Allow expired Hong Kong identity card to enter the liveness detection process.<br>false: Reject expired Hong Kong identity card, not accessible to the liveness detection process.</p>
    */
    @SerializedName("AllowExpiredDocument")
    @Expose
    private Boolean AllowExpiredDocument;

    /**
    * <p>Service version, including basic version (BASIC) and PLUS version (PLUS).</p><p>Enumeration value:</p><ul><li>BASIC: Basic version</li><li>PLUS: PLUS version</li></ul><p>Default value: BASIC.</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>Whether to skip the start verification webpage when starting verification. If true, directly enter the verification process. Default false. If the degradation policy is triggered, this configuration will not take effect.</p> 
     * @return AutoSkipStartPage <p>Whether to skip the start verification webpage when starting verification. If true, directly enter the verification process. Default false. If the degradation policy is triggered, this configuration will not take effect.</p>
     */
    public Boolean getAutoSkipStartPage() {
        return this.AutoSkipStartPage;
    }

    /**
     * Set <p>Whether to skip the start verification webpage when starting verification. If true, directly enter the verification process. Default false. If the degradation policy is triggered, this configuration will not take effect.</p>
     * @param AutoSkipStartPage <p>Whether to skip the start verification webpage when starting verification. If true, directly enter the verification process. Default false. If the degradation policy is triggered, this configuration will not take effect.</p>
     */
    public void setAutoSkipStartPage(Boolean AutoSkipStartPage) {
        this.AutoSkipStartPage = AutoSkipStartPage;
    }

    /**
     * Get <p>Whether to skip the result display page and automatically jump to RedirectURL when verification is successful. Default false.</p> 
     * @return AutoSkip <p>Whether to skip the result display page and automatically jump to RedirectURL when verification is successful. Default false.</p>
     */
    public Boolean getAutoSkip() {
        return this.AutoSkip;
    }

    /**
     * Set <p>Whether to skip the result display page and automatically jump to RedirectURL when verification is successful. Default false.</p>
     * @param AutoSkip <p>Whether to skip the result display page and automatically jump to RedirectURL when verification is successful. Default false.</p>
     */
    public void setAutoSkip(Boolean AutoSkip) {
        this.AutoSkip = AutoSkip;
    }

    /**
     * Get <p>Detection mode. Parameter values are as follows:<br>1: OCR+liveness detection+face comparison;<br>2: liveness detection+face comparison;<br>3: liveness detection;<br>4: OCR;<br>Default value is 2.</p> 
     * @return CheckMode <p>Detection mode. Parameter values are as follows:<br>1: OCR+liveness detection+face comparison;<br>2: liveness detection+face comparison;<br>3: liveness detection;<br>4: OCR;<br>Default value is 2.</p>
     */
    public Long getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set <p>Detection mode. Parameter values are as follows:<br>1: OCR+liveness detection+face comparison;<br>2: liveness detection+face comparison;<br>3: liveness detection;<br>4: OCR;<br>Default value is 2.</p>
     * @param CheckMode <p>Detection mode. Parameter values are as follows:<br>1: OCR+liveness detection+face comparison;<br>2: liveness detection+face comparison;<br>3: liveness detection;<br>4: OCR;<br>Default value is 2.</p>
     */
    public void setCheckMode(Long CheckMode) {
        this.CheckMode = CheckMode;
    }

    /**
     * Get <p>Identity document type used for authentication. Currently supported:<br>1.HKIDCard: Hong Kong (China) identity card<br>2.MLIDCard: Malaysian identity card<br>3.IndonesiaIDCard: Indonesian Identity Card<br>4.PhilippinesVoteID: Philippines voter card<br>5.PhilippinesDrivingLicense: Philippines driving license<br>6.PhilippinesTinID: Philippines TinID<br>7.PhilippinesSSSID: Philippines SSSID<br>8.PhilippinesUMID: Philippines UMID<br>9.InternationalIDPassport: Passport for Hong Kong (China), Macao (China), and Taiwan (China) as well as overseas passport<br>10.ThailandIDCard: Thai Identity Card<br>11.SingaporeIDCard: Singapore ID card<br>12.MainlandIDCard: Mainland ID card</p> 
     * @return IDCardType <p>Identity document type used for authentication. Currently supported:<br>1.HKIDCard: Hong Kong (China) identity card<br>2.MLIDCard: Malaysian identity card<br>3.IndonesiaIDCard: Indonesian Identity Card<br>4.PhilippinesVoteID: Philippines voter card<br>5.PhilippinesDrivingLicense: Philippines driving license<br>6.PhilippinesTinID: Philippines TinID<br>7.PhilippinesSSSID: Philippines SSSID<br>8.PhilippinesUMID: Philippines UMID<br>9.InternationalIDPassport: Passport for Hong Kong (China), Macao (China), and Taiwan (China) as well as overseas passport<br>10.ThailandIDCard: Thai Identity Card<br>11.SingaporeIDCard: Singapore ID card<br>12.MainlandIDCard: Mainland ID card</p>
     */
    public String getIDCardType() {
        return this.IDCardType;
    }

    /**
     * Set <p>Identity document type used for authentication. Currently supported:<br>1.HKIDCard: Hong Kong (China) identity card<br>2.MLIDCard: Malaysian identity card<br>3.IndonesiaIDCard: Indonesian Identity Card<br>4.PhilippinesVoteID: Philippines voter card<br>5.PhilippinesDrivingLicense: Philippines driving license<br>6.PhilippinesTinID: Philippines TinID<br>7.PhilippinesSSSID: Philippines SSSID<br>8.PhilippinesUMID: Philippines UMID<br>9.InternationalIDPassport: Passport for Hong Kong (China), Macao (China), and Taiwan (China) as well as overseas passport<br>10.ThailandIDCard: Thai Identity Card<br>11.SingaporeIDCard: Singapore ID card<br>12.MainlandIDCard: Mainland ID card</p>
     * @param IDCardType <p>Identity document type used for authentication. Currently supported:<br>1.HKIDCard: Hong Kong (China) identity card<br>2.MLIDCard: Malaysian identity card<br>3.IndonesiaIDCard: Indonesian Identity Card<br>4.PhilippinesVoteID: Philippines voter card<br>5.PhilippinesDrivingLicense: Philippines driving license<br>6.PhilippinesTinID: Philippines TinID<br>7.PhilippinesSSSID: Philippines SSSID<br>8.PhilippinesUMID: Philippines UMID<br>9.InternationalIDPassport: Passport for Hong Kong (China), Macao (China), and Taiwan (China) as well as overseas passport<br>10.ThailandIDCard: Thai Identity Card<br>11.SingaporeIDCard: Singapore ID card<br>12.MainlandIDCard: Mainland ID card</p>
     */
    public void setIDCardType(String IDCardType) {
        this.IDCardType = IDCardType;
    }

    /**
     * Get <p>Want to close document alarm, false by default (enable alarm detection). When enabled, the identity verification process will intercept based on the document alarm status. If you need to use document anti-counterfeiting functionality, <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p> 
     * @return DisableCheckOcrWarnings <p>Want to close document alarm, false by default (enable alarm detection). When enabled, the identity verification process will intercept based on the document alarm status. If you need to use document anti-counterfeiting functionality, <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
     */
    public Boolean getDisableCheckOcrWarnings() {
        return this.DisableCheckOcrWarnings;
    }

    /**
     * Set <p>Want to close document alarm, false by default (enable alarm detection). When enabled, the identity verification process will intercept based on the document alarm status. If you need to use document anti-counterfeiting functionality, <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
     * @param DisableCheckOcrWarnings <p>Want to close document alarm, false by default (enable alarm detection). When enabled, the identity verification process will intercept based on the document alarm status. If you need to use document anti-counterfeiting functionality, <a href="https://www.tencentcloud.com/zh/contact-us">contact us</a>.</p>
     */
    public void setDisableCheckOcrWarnings(Boolean DisableCheckOcrWarnings) {
        this.DisableCheckOcrWarnings = DisableCheckOcrWarnings;
    }

    /**
     * Get <p>Security level of authentication:<br>1: Silent liveness;<br>2: Action liveness;<br>3: Light liveness;<br>4: Action + light liveness;<br>Default value is 3.</p> 
     * @return SecurityLevel <p>Security level of authentication:<br>1: Silent liveness;<br>2: Action liveness;<br>3: Light liveness;<br>4: Action + light liveness;<br>Default value is 3.</p>
     */
    public Long getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set <p>Security level of authentication:<br>1: Silent liveness;<br>2: Action liveness;<br>3: Light liveness;<br>4: Action + light liveness;<br>Default value is 3.</p>
     * @param SecurityLevel <p>Security level of authentication:<br>1: Silent liveness;<br>2: Action liveness;<br>3: Light liveness;<br>4: Action + light liveness;<br>Default value is 3.</p>
     */
    public void setSecurityLevel(Long SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    /**
     * Get <p>Whether to skip the privacy agreement webpage, default false. When SkipPrivacyPolicy is false, the privacy agreement webpage will show and the privacy agreement must be checked. When SkipPrivacyPolicy is true, the privacy agreement webpage will be skipped to directly enter the Live Face Process without the need to check the privacy agreement webpage.</p> 
     * @return SkipPrivacyPolicy <p>Whether to skip the privacy agreement webpage, default false. When SkipPrivacyPolicy is false, the privacy agreement webpage will show and the privacy agreement must be checked. When SkipPrivacyPolicy is true, the privacy agreement webpage will be skipped to directly enter the Live Face Process without the need to check the privacy agreement webpage.</p>
     */
    public Boolean getSkipPrivacyPolicy() {
        return this.SkipPrivacyPolicy;
    }

    /**
     * Set <p>Whether to skip the privacy agreement webpage, default false. When SkipPrivacyPolicy is false, the privacy agreement webpage will show and the privacy agreement must be checked. When SkipPrivacyPolicy is true, the privacy agreement webpage will be skipped to directly enter the Live Face Process without the need to check the privacy agreement webpage.</p>
     * @param SkipPrivacyPolicy <p>Whether to skip the privacy agreement webpage, default false. When SkipPrivacyPolicy is false, the privacy agreement webpage will show and the privacy agreement must be checked. When SkipPrivacyPolicy is true, the privacy agreement webpage will be skipped to directly enter the Live Face Process without the need to check the privacy agreement webpage.</p>
     */
    public void setSkipPrivacyPolicy(Boolean SkipPrivacyPolicy) {
        this.SkipPrivacyPolicy = SkipPrivacyPolicy;
    }

    /**
     * Get <p>Default false. When false, show the original document image. When true, show the split document image.</p> 
     * @return IdCardCutReturn <p>Default false. When false, show the original document image. When true, show the split document image.</p>
     */
    public Boolean getIdCardCutReturn() {
        return this.IdCardCutReturn;
    }

    /**
     * Set <p>Default false. When false, show the original document image. When true, show the split document image.</p>
     * @param IdCardCutReturn <p>Default false. When false, show the original document image. When true, show the split document image.</p>
     */
    public void setIdCardCutReturn(Boolean IdCardCutReturn) {
        this.IdCardCutReturn = IdCardCutReturn;
    }

    /**
     * Get <p>Frontend theme color in base 16 RGB format. Defaults to "#2d72f1". Uses default values if the format is incorrect.</p> 
     * @return ThemeColor <p>Frontend theme color in base 16 RGB format. Defaults to "#2d72f1". Uses default values if the format is incorrect.</p>
     */
    public String getThemeColor() {
        return this.ThemeColor;
    }

    /**
     * Set <p>Frontend theme color in base 16 RGB format. Defaults to "#2d72f1". Uses default values if the format is incorrect.</p>
     * @param ThemeColor <p>Frontend theme color in base 16 RGB format. Defaults to "#2d72f1". Uses default values if the format is incorrect.</p>
     */
    public void setThemeColor(String ThemeColor) {
        this.ThemeColor = ThemeColor;
    }

    /**
     * Get <p>Internationalized language, defaults to en (English). Currently supported:<br>th: Thai;<br>en: English;<br>zh-cn: Simplified Chinese;<br>zh-tc: Traditional Chinese;<br>id: Indonesia;</p> 
     * @return Language <p>Internationalized language, defaults to en (English). Currently supported:<br>th: Thai;<br>en: English;<br>zh-cn: Simplified Chinese;<br>zh-tc: Traditional Chinese;<br>id: Indonesia;</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>Internationalized language, defaults to en (English). Currently supported:<br>th: Thai;<br>en: English;<br>zh-cn: Simplified Chinese;<br>zh-tc: Traditional Chinese;<br>id: Indonesia;</p>
     * @param Language <p>Internationalized language, defaults to en (English). Currently supported:<br>th: Thai;<br>en: English;<br>zh-cn: Simplified Chinese;<br>zh-tc: Traditional Chinese;<br>id: Indonesia;</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Automatic downgrade mode. Parameter values as follows:<br>1: Downgrade to silent liveness mode.<br>2: Disable downgrade mode.<br>Default value: 1.</p> 
     * @return AutoDowngrade <p>Automatic downgrade mode. Parameter values as follows:<br>1: Downgrade to silent liveness mode.<br>2: Disable downgrade mode.<br>Default value: 1.</p>
     */
    public Long getAutoDowngrade() {
        return this.AutoDowngrade;
    }

    /**
     * Set <p>Automatic downgrade mode. Parameter values as follows:<br>1: Downgrade to silent liveness mode.<br>2: Disable downgrade mode.<br>Default value: 1.</p>
     * @param AutoDowngrade <p>Automatic downgrade mode. Parameter values as follows:<br>1: Downgrade to silent liveness mode.<br>2: Disable downgrade mode.<br>Default value: 1.</p>
     */
    public void setAutoDowngrade(Long AutoDowngrade) {
        this.AutoDowngrade = AutoDowngrade;
    }

    /**
     * Get <p>Control the action sequence. Action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value: blink<br>Input this parameter only when SecurityLevel is 2, 4, or 5 for different action types to take effect; otherwise, an API error occurs.</p> 
     * @return ActionList <p>Control the action sequence. Action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value: blink<br>Input this parameter only when SecurityLevel is 2, 4, or 5 for different action types to take effect; otherwise, an API error occurs.</p>
     */
    public String getActionList() {
        return this.ActionList;
    }

    /**
     * Set <p>Control the action sequence. Action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value: blink<br>Input this parameter only when SecurityLevel is 2, 4, or 5 for different action types to take effect; otherwise, an API error occurs.</p>
     * @param ActionList <p>Control the action sequence. Action types are as follows:<br>"blink"<br>"mouth"<br>"nod"<br>"shake"<br>Choose 1-2 actions from the four.<br>Single action example: "blink"<br>Multi-action example: "blink,mouth".<br>Default value: blink<br>Input this parameter only when SecurityLevel is 2, 4, or 5 for different action types to take effect; otherwise, an API error occurs.</p>
     */
    public void setActionList(String ActionList) {
        this.ActionList = ActionList;
    }

    /**
     * Get <p>Maximum liveness verification attempts. Value ranges from 1 to 99. Default value is 99.</p> 
     * @return LivenessRetryLimit <p>Maximum liveness verification attempts. Value ranges from 1 to 99. Default value is 99.</p>
     */
    public Long getLivenessRetryLimit() {
        return this.LivenessRetryLimit;
    }

    /**
     * Set <p>Maximum liveness verification attempts. Value ranges from 1 to 99. Default value is 99.</p>
     * @param LivenessRetryLimit <p>Maximum liveness verification attempts. Value ranges from 1 to 99. Default value is 99.</p>
     */
    public void setLivenessRetryLimit(Long LivenessRetryLimit) {
        this.LivenessRetryLimit = LivenessRetryLimit;
    }

    /**
     * Get <p>Control the liveness detection timeout period in seconds. The value ranges from 0 to 600. Default: 45 seconds.</p> 
     * @return LivenessTimeout <p>Control the liveness detection timeout period in seconds. The value ranges from 0 to 600. Default: 45 seconds.</p>
     */
    public Long getLivenessTimeout() {
        return this.LivenessTimeout;
    }

    /**
     * Set <p>Control the liveness detection timeout period in seconds. The value ranges from 0 to 600. Default: 45 seconds.</p>
     * @param LivenessTimeout <p>Control the liveness detection timeout period in seconds. The value ranges from 0 to 600. Default: 45 seconds.</p>
     */
    public void setLivenessTimeout(Long LivenessTimeout) {
        this.LivenessTimeout = LivenessTimeout;
    }

    /**
     * Get <p>Select OCR alarms that require attention. When an OCR alarm is generated, the identity verification process will be interrupted. The default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the alarm is disabled, this parameter will not be effective.</p><p>Alarm code list and definitions:<br>-9101 Incomplete border alarm<br>-9102 Photocopies alarm<br>-9103 Alarm for rephotographing<br>-9104 ps alarm<br>-9107 Reflective alarm<br>-9108 Blurry alarm<br>-9109 Alarm not enabled</p> 
     * @return SelectedWarningCodes <p>Select OCR alarms that require attention. When an OCR alarm is generated, the identity verification process will be interrupted. The default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the alarm is disabled, this parameter will not be effective.</p><p>Alarm code list and definitions:<br>-9101 Incomplete border alarm<br>-9102 Photocopies alarm<br>-9103 Alarm for rephotographing<br>-9104 ps alarm<br>-9107 Reflective alarm<br>-9108 Blurry alarm<br>-9109 Alarm not enabled</p>
     */
    public String getSelectedWarningCodes() {
        return this.SelectedWarningCodes;
    }

    /**
     * Set <p>Select OCR alarms that require attention. When an OCR alarm is generated, the identity verification process will be interrupted. The default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the alarm is disabled, this parameter will not be effective.</p><p>Alarm code list and definitions:<br>-9101 Incomplete border alarm<br>-9102 Photocopies alarm<br>-9103 Alarm for rephotographing<br>-9104 ps alarm<br>-9107 Reflective alarm<br>-9108 Blurry alarm<br>-9109 Alarm not enabled</p>
     * @param SelectedWarningCodes <p>Select OCR alarms that require attention. When an OCR alarm is generated, the identity verification process will be interrupted. The default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the alarm is disabled, this parameter will not be effective.</p><p>Alarm code list and definitions:<br>-9101 Incomplete border alarm<br>-9102 Photocopies alarm<br>-9103 Alarm for rephotographing<br>-9104 ps alarm<br>-9107 Reflective alarm<br>-9108 Blurry alarm<br>-9109 Alarm not enabled</p>
     */
    public void setSelectedWarningCodes(String SelectedWarningCodes) {
        this.SelectedWarningCodes = SelectedWarningCodes;
    }

    /**
     * Get <p>Whether to allow expired identity documents to enter the liveness detection process. This parameter is valid only when the document type is Hong Kong identity card (HKID).<br>true (default value): Allow expired Hong Kong identity card to enter the liveness detection process.<br>false: Reject expired Hong Kong identity card, not accessible to the liveness detection process.</p> 
     * @return AllowExpiredDocument <p>Whether to allow expired identity documents to enter the liveness detection process. This parameter is valid only when the document type is Hong Kong identity card (HKID).<br>true (default value): Allow expired Hong Kong identity card to enter the liveness detection process.<br>false: Reject expired Hong Kong identity card, not accessible to the liveness detection process.</p>
     */
    public Boolean getAllowExpiredDocument() {
        return this.AllowExpiredDocument;
    }

    /**
     * Set <p>Whether to allow expired identity documents to enter the liveness detection process. This parameter is valid only when the document type is Hong Kong identity card (HKID).<br>true (default value): Allow expired Hong Kong identity card to enter the liveness detection process.<br>false: Reject expired Hong Kong identity card, not accessible to the liveness detection process.</p>
     * @param AllowExpiredDocument <p>Whether to allow expired identity documents to enter the liveness detection process. This parameter is valid only when the document type is Hong Kong identity card (HKID).<br>true (default value): Allow expired Hong Kong identity card to enter the liveness detection process.<br>false: Reject expired Hong Kong identity card, not accessible to the liveness detection process.</p>
     */
    public void setAllowExpiredDocument(Boolean AllowExpiredDocument) {
        this.AllowExpiredDocument = AllowExpiredDocument;
    }

    /**
     * Get <p>Service version, including basic version (BASIC) and PLUS version (PLUS).</p><p>Enumeration value:</p><ul><li>BASIC: Basic version</li><li>PLUS: PLUS version</li></ul><p>Default value: BASIC.</p> 
     * @return Version <p>Service version, including basic version (BASIC) and PLUS version (PLUS).</p><p>Enumeration value:</p><ul><li>BASIC: Basic version</li><li>PLUS: PLUS version</li></ul><p>Default value: BASIC.</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Service version, including basic version (BASIC) and PLUS version (PLUS).</p><p>Enumeration value:</p><ul><li>BASIC: Basic version</li><li>PLUS: PLUS version</li></ul><p>Default value: BASIC.</p>
     * @param Version <p>Service version, including basic version (BASIC) and PLUS version (PLUS).</p><p>Enumeration value:</p><ul><li>BASIC: Basic version</li><li>PLUS: PLUS version</li></ul><p>Default value: BASIC.</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
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

    }
}

