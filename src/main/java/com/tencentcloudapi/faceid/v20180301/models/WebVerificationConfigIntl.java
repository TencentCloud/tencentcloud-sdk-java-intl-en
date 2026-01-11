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
    * When starting verification, whether to skip the starting verification page. If true, enter the verification process directly. This configuration will not take effect if the downgrade policy is triggered. The default is false.
Example: false
    */
    @SerializedName("AutoSkipStartPage")
    @Expose
    private Boolean AutoSkipStartPage;

    /**
    * When the verification passed, whether to skip the result page and automatically jump to RedirectURL. The default value is false.
Example: false
    */
    @SerializedName("AutoSkip")
    @Expose
    private Boolean AutoSkip;

    /**
    * Detection mode, parameter values are as follows:
1: OCR+liveness detection & face comparison;
2: Liveness detection & face comparison;
3: Liveness detection;
4: OCR;
The default value is 2.
Example: 3
    */
    @SerializedName("CheckMode")
    @Expose
    private Long CheckMode;

    /**
    * Card Type for verification. The following types are supported:
1.HKIDCard: Hong Kong (China) ID card
2.MLIDCard: Malaysia ID card
3.IndonesialDCard: Indonesia ID card
4.PhilippinesVoteID: Philippines Vote lD card
5.PhilippinesDrivingLicense: Philippines driving license
6.PhilippinesTinID: Philippines TinID card
7.PhilippinesSSSID: Philippines SSSID card
8.PhilippinesUMID: Philippines UMID card
9.InternationallDPassport: ID cards of Hong Kong (China), Macao (China) and Taiwan (China), and international passport.
10.ThailandIDCard: Thailand ID card
11.SingaporelDCard: Singapore ID card
12.MainlandIDCard: Mainland (China) ID card
Example: HKIDCard
    */
    @SerializedName("IDCardType")
    @Expose
    private String IDCardType;

    /**
    * Whether to turn off document alarms, the default is false (the alarm detection function is turned on). When enabled, the identity authentication process will be intercepted based on the alarm status of the certificate. If you need to use the document authentication function, please contact us.
Example: false
    */
    @SerializedName("DisableCheckOcrWarnings")
    @Expose
    private Boolean DisableCheckOcrWarnings;

    /**
    * Liveness security level, the default value is 3. The currently supported security level are as follows:
1:Silent mode;
2:Action mode;
3:Lighting mode;
4:Action+Lighting mode;
5:Action+Lighting(High security) mode.
Example: 4
    */
    @SerializedName("SecurityLevel")
    @Expose
    private Long SecurityLevel;

    /**
    * Whether to skip the agreement page. When SkipPrivacyPolicy is false, the agreement page will be displayed and the privacy agreement needs to be checked; when SkipPrivacyPolicy is true, the agreement page will be skipped and the liveness process will be entered directly without checking the privacy agreement page. The default is false.
Example: false
    */
    @SerializedName("SkipPrivacyPolicy")
    @Expose
    private Boolean SkipPrivacyPolicy;

    /**
    * whether to display the cropped ID card image. When set to false, the original ID card image is displayed. When set to true, the cropped version is displayed. The default value is false. 
Example: false
    */
    @SerializedName("IdCardCutReturn")
    @Expose
    private Boolean IdCardCutReturn;

    /**
    * Front-end theme color, in the format of RGB hexadecimal color code. If the format is incorrect, the default value color will be used. The default value is "#2d72f1".
Example: #2d72f1
    */
    @SerializedName("ThemeColor")
    @Expose
    private String ThemeColor;

    /**
    * International language, the default value is en (English). The currently supported language are as follows: 
th: Thai; 
en: English; 
zh-cn: Simplified Chinese; 
zh-tc: Tradionnal Chinese; 
id: Bahasa Indonesia.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Automatic downgrade mode, the following parameter are supported: 
1: Downgrade to silent live mode; 
2: Disable downgrade mode. 
The default value is 1.
    */
    @SerializedName("AutoDowngrade")
    @Expose
    private Long AutoDowngrade;

    /**
    * This interface is used to control th action sequences.
The supported action types are as follows:
"blink";
"mouth";
"nod";
"shake".
You can choose 1-2 actions out of the four. Single action example: "blink". Multiple action example: "blink,mouth". The different action types passed in this parameter take effect only when the SecurityLevel is 2, 4, or 5; otherwise, the interface reports an error.
The default value is blink.
    */
    @SerializedName("ActionList")
    @Expose
    private String ActionList;

    /**
    * Control liveness retry number.The value range is 1-99.
The default value is 99.
    */
    @SerializedName("LivenessRetryLimit")
    @Expose
    private Long LivenessRetryLimit;

    /**
    * Specifies the liveness detection timeout period in seconds. value range: (0,600].
The default value is 45.
    */
    @SerializedName("LivenessTimeout")
    @Expose
    private Long LivenessTimeout;

    /**
    * Selects OCR alarms requiring attention. When an OCR Alarm occurs, the identity verification process will be interrupted. Default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the Alarm is disabled, this parameter will not be effective. The supported alarm types are as follows:
-9101: Incomplete Border Alert;
-9102: Copy Document Alert;
-9103: Remediated Document Alert;
-9104: PS-altered Document Alert;
-9107: Glare Alert;
-9108: Blurriness Alert;
-9109: Alert Not Activated.
    */
    @SerializedName("SelectedWarningCodes")
    @Expose
    private String SelectedWarningCodes;

    /**
    * Whether expired identity documents are permitted to proceed to the liveness detection process. This parameter only takes effect when the document type is Hong Kong Identity Card (HKID).
true (default value): Expired HKID is allowed to enter the liveness process.
false : Expired HKID is rejected and cannot enter the liveness process.
    */
    @SerializedName("AllowExpiredDocument")
    @Expose
    private Boolean AllowExpiredDocument;

    /**
     * Get When starting verification, whether to skip the starting verification page. If true, enter the verification process directly. This configuration will not take effect if the downgrade policy is triggered. The default is false.
Example: false 
     * @return AutoSkipStartPage When starting verification, whether to skip the starting verification page. If true, enter the verification process directly. This configuration will not take effect if the downgrade policy is triggered. The default is false.
Example: false
     */
    public Boolean getAutoSkipStartPage() {
        return this.AutoSkipStartPage;
    }

    /**
     * Set When starting verification, whether to skip the starting verification page. If true, enter the verification process directly. This configuration will not take effect if the downgrade policy is triggered. The default is false.
Example: false
     * @param AutoSkipStartPage When starting verification, whether to skip the starting verification page. If true, enter the verification process directly. This configuration will not take effect if the downgrade policy is triggered. The default is false.
Example: false
     */
    public void setAutoSkipStartPage(Boolean AutoSkipStartPage) {
        this.AutoSkipStartPage = AutoSkipStartPage;
    }

    /**
     * Get When the verification passed, whether to skip the result page and automatically jump to RedirectURL. The default value is false.
Example: false 
     * @return AutoSkip When the verification passed, whether to skip the result page and automatically jump to RedirectURL. The default value is false.
Example: false
     */
    public Boolean getAutoSkip() {
        return this.AutoSkip;
    }

    /**
     * Set When the verification passed, whether to skip the result page and automatically jump to RedirectURL. The default value is false.
Example: false
     * @param AutoSkip When the verification passed, whether to skip the result page and automatically jump to RedirectURL. The default value is false.
Example: false
     */
    public void setAutoSkip(Boolean AutoSkip) {
        this.AutoSkip = AutoSkip;
    }

    /**
     * Get Detection mode, parameter values are as follows:
1: OCR+liveness detection & face comparison;
2: Liveness detection & face comparison;
3: Liveness detection;
4: OCR;
The default value is 2.
Example: 3 
     * @return CheckMode Detection mode, parameter values are as follows:
1: OCR+liveness detection & face comparison;
2: Liveness detection & face comparison;
3: Liveness detection;
4: OCR;
The default value is 2.
Example: 3
     */
    public Long getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set Detection mode, parameter values are as follows:
1: OCR+liveness detection & face comparison;
2: Liveness detection & face comparison;
3: Liveness detection;
4: OCR;
The default value is 2.
Example: 3
     * @param CheckMode Detection mode, parameter values are as follows:
1: OCR+liveness detection & face comparison;
2: Liveness detection & face comparison;
3: Liveness detection;
4: OCR;
The default value is 2.
Example: 3
     */
    public void setCheckMode(Long CheckMode) {
        this.CheckMode = CheckMode;
    }

    /**
     * Get Card Type for verification. The following types are supported:
1.HKIDCard: Hong Kong (China) ID card
2.MLIDCard: Malaysia ID card
3.IndonesialDCard: Indonesia ID card
4.PhilippinesVoteID: Philippines Vote lD card
5.PhilippinesDrivingLicense: Philippines driving license
6.PhilippinesTinID: Philippines TinID card
7.PhilippinesSSSID: Philippines SSSID card
8.PhilippinesUMID: Philippines UMID card
9.InternationallDPassport: ID cards of Hong Kong (China), Macao (China) and Taiwan (China), and international passport.
10.ThailandIDCard: Thailand ID card
11.SingaporelDCard: Singapore ID card
12.MainlandIDCard: Mainland (China) ID card
Example: HKIDCard 
     * @return IDCardType Card Type for verification. The following types are supported:
1.HKIDCard: Hong Kong (China) ID card
2.MLIDCard: Malaysia ID card
3.IndonesialDCard: Indonesia ID card
4.PhilippinesVoteID: Philippines Vote lD card
5.PhilippinesDrivingLicense: Philippines driving license
6.PhilippinesTinID: Philippines TinID card
7.PhilippinesSSSID: Philippines SSSID card
8.PhilippinesUMID: Philippines UMID card
9.InternationallDPassport: ID cards of Hong Kong (China), Macao (China) and Taiwan (China), and international passport.
10.ThailandIDCard: Thailand ID card
11.SingaporelDCard: Singapore ID card
12.MainlandIDCard: Mainland (China) ID card
Example: HKIDCard
     */
    public String getIDCardType() {
        return this.IDCardType;
    }

    /**
     * Set Card Type for verification. The following types are supported:
1.HKIDCard: Hong Kong (China) ID card
2.MLIDCard: Malaysia ID card
3.IndonesialDCard: Indonesia ID card
4.PhilippinesVoteID: Philippines Vote lD card
5.PhilippinesDrivingLicense: Philippines driving license
6.PhilippinesTinID: Philippines TinID card
7.PhilippinesSSSID: Philippines SSSID card
8.PhilippinesUMID: Philippines UMID card
9.InternationallDPassport: ID cards of Hong Kong (China), Macao (China) and Taiwan (China), and international passport.
10.ThailandIDCard: Thailand ID card
11.SingaporelDCard: Singapore ID card
12.MainlandIDCard: Mainland (China) ID card
Example: HKIDCard
     * @param IDCardType Card Type for verification. The following types are supported:
1.HKIDCard: Hong Kong (China) ID card
2.MLIDCard: Malaysia ID card
3.IndonesialDCard: Indonesia ID card
4.PhilippinesVoteID: Philippines Vote lD card
5.PhilippinesDrivingLicense: Philippines driving license
6.PhilippinesTinID: Philippines TinID card
7.PhilippinesSSSID: Philippines SSSID card
8.PhilippinesUMID: Philippines UMID card
9.InternationallDPassport: ID cards of Hong Kong (China), Macao (China) and Taiwan (China), and international passport.
10.ThailandIDCard: Thailand ID card
11.SingaporelDCard: Singapore ID card
12.MainlandIDCard: Mainland (China) ID card
Example: HKIDCard
     */
    public void setIDCardType(String IDCardType) {
        this.IDCardType = IDCardType;
    }

    /**
     * Get Whether to turn off document alarms, the default is false (the alarm detection function is turned on). When enabled, the identity authentication process will be intercepted based on the alarm status of the certificate. If you need to use the document authentication function, please contact us.
Example: false 
     * @return DisableCheckOcrWarnings Whether to turn off document alarms, the default is false (the alarm detection function is turned on). When enabled, the identity authentication process will be intercepted based on the alarm status of the certificate. If you need to use the document authentication function, please contact us.
Example: false
     */
    public Boolean getDisableCheckOcrWarnings() {
        return this.DisableCheckOcrWarnings;
    }

    /**
     * Set Whether to turn off document alarms, the default is false (the alarm detection function is turned on). When enabled, the identity authentication process will be intercepted based on the alarm status of the certificate. If you need to use the document authentication function, please contact us.
Example: false
     * @param DisableCheckOcrWarnings Whether to turn off document alarms, the default is false (the alarm detection function is turned on). When enabled, the identity authentication process will be intercepted based on the alarm status of the certificate. If you need to use the document authentication function, please contact us.
Example: false
     */
    public void setDisableCheckOcrWarnings(Boolean DisableCheckOcrWarnings) {
        this.DisableCheckOcrWarnings = DisableCheckOcrWarnings;
    }

    /**
     * Get Liveness security level, the default value is 3. The currently supported security level are as follows:
1:Silent mode;
2:Action mode;
3:Lighting mode;
4:Action+Lighting mode;
5:Action+Lighting(High security) mode.
Example: 4 
     * @return SecurityLevel Liveness security level, the default value is 3. The currently supported security level are as follows:
1:Silent mode;
2:Action mode;
3:Lighting mode;
4:Action+Lighting mode;
5:Action+Lighting(High security) mode.
Example: 4
     */
    public Long getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set Liveness security level, the default value is 3. The currently supported security level are as follows:
1:Silent mode;
2:Action mode;
3:Lighting mode;
4:Action+Lighting mode;
5:Action+Lighting(High security) mode.
Example: 4
     * @param SecurityLevel Liveness security level, the default value is 3. The currently supported security level are as follows:
1:Silent mode;
2:Action mode;
3:Lighting mode;
4:Action+Lighting mode;
5:Action+Lighting(High security) mode.
Example: 4
     */
    public void setSecurityLevel(Long SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    /**
     * Get Whether to skip the agreement page. When SkipPrivacyPolicy is false, the agreement page will be displayed and the privacy agreement needs to be checked; when SkipPrivacyPolicy is true, the agreement page will be skipped and the liveness process will be entered directly without checking the privacy agreement page. The default is false.
Example: false 
     * @return SkipPrivacyPolicy Whether to skip the agreement page. When SkipPrivacyPolicy is false, the agreement page will be displayed and the privacy agreement needs to be checked; when SkipPrivacyPolicy is true, the agreement page will be skipped and the liveness process will be entered directly without checking the privacy agreement page. The default is false.
Example: false
     */
    public Boolean getSkipPrivacyPolicy() {
        return this.SkipPrivacyPolicy;
    }

    /**
     * Set Whether to skip the agreement page. When SkipPrivacyPolicy is false, the agreement page will be displayed and the privacy agreement needs to be checked; when SkipPrivacyPolicy is true, the agreement page will be skipped and the liveness process will be entered directly without checking the privacy agreement page. The default is false.
Example: false
     * @param SkipPrivacyPolicy Whether to skip the agreement page. When SkipPrivacyPolicy is false, the agreement page will be displayed and the privacy agreement needs to be checked; when SkipPrivacyPolicy is true, the agreement page will be skipped and the liveness process will be entered directly without checking the privacy agreement page. The default is false.
Example: false
     */
    public void setSkipPrivacyPolicy(Boolean SkipPrivacyPolicy) {
        this.SkipPrivacyPolicy = SkipPrivacyPolicy;
    }

    /**
     * Get whether to display the cropped ID card image. When set to false, the original ID card image is displayed. When set to true, the cropped version is displayed. The default value is false. 
Example: false 
     * @return IdCardCutReturn whether to display the cropped ID card image. When set to false, the original ID card image is displayed. When set to true, the cropped version is displayed. The default value is false. 
Example: false
     */
    public Boolean getIdCardCutReturn() {
        return this.IdCardCutReturn;
    }

    /**
     * Set whether to display the cropped ID card image. When set to false, the original ID card image is displayed. When set to true, the cropped version is displayed. The default value is false. 
Example: false
     * @param IdCardCutReturn whether to display the cropped ID card image. When set to false, the original ID card image is displayed. When set to true, the cropped version is displayed. The default value is false. 
Example: false
     */
    public void setIdCardCutReturn(Boolean IdCardCutReturn) {
        this.IdCardCutReturn = IdCardCutReturn;
    }

    /**
     * Get Front-end theme color, in the format of RGB hexadecimal color code. If the format is incorrect, the default value color will be used. The default value is "#2d72f1".
Example: #2d72f1 
     * @return ThemeColor Front-end theme color, in the format of RGB hexadecimal color code. If the format is incorrect, the default value color will be used. The default value is "#2d72f1".
Example: #2d72f1
     */
    public String getThemeColor() {
        return this.ThemeColor;
    }

    /**
     * Set Front-end theme color, in the format of RGB hexadecimal color code. If the format is incorrect, the default value color will be used. The default value is "#2d72f1".
Example: #2d72f1
     * @param ThemeColor Front-end theme color, in the format of RGB hexadecimal color code. If the format is incorrect, the default value color will be used. The default value is "#2d72f1".
Example: #2d72f1
     */
    public void setThemeColor(String ThemeColor) {
        this.ThemeColor = ThemeColor;
    }

    /**
     * Get International language, the default value is en (English). The currently supported language are as follows: 
th: Thai; 
en: English; 
zh-cn: Simplified Chinese; 
zh-tc: Tradionnal Chinese; 
id: Bahasa Indonesia. 
     * @return Language International language, the default value is en (English). The currently supported language are as follows: 
th: Thai; 
en: English; 
zh-cn: Simplified Chinese; 
zh-tc: Tradionnal Chinese; 
id: Bahasa Indonesia.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set International language, the default value is en (English). The currently supported language are as follows: 
th: Thai; 
en: English; 
zh-cn: Simplified Chinese; 
zh-tc: Tradionnal Chinese; 
id: Bahasa Indonesia.
     * @param Language International language, the default value is en (English). The currently supported language are as follows: 
th: Thai; 
en: English; 
zh-cn: Simplified Chinese; 
zh-tc: Tradionnal Chinese; 
id: Bahasa Indonesia.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Automatic downgrade mode, the following parameter are supported: 
1: Downgrade to silent live mode; 
2: Disable downgrade mode. 
The default value is 1. 
     * @return AutoDowngrade Automatic downgrade mode, the following parameter are supported: 
1: Downgrade to silent live mode; 
2: Disable downgrade mode. 
The default value is 1.
     */
    public Long getAutoDowngrade() {
        return this.AutoDowngrade;
    }

    /**
     * Set Automatic downgrade mode, the following parameter are supported: 
1: Downgrade to silent live mode; 
2: Disable downgrade mode. 
The default value is 1.
     * @param AutoDowngrade Automatic downgrade mode, the following parameter are supported: 
1: Downgrade to silent live mode; 
2: Disable downgrade mode. 
The default value is 1.
     */
    public void setAutoDowngrade(Long AutoDowngrade) {
        this.AutoDowngrade = AutoDowngrade;
    }

    /**
     * Get This interface is used to control th action sequences.
The supported action types are as follows:
"blink";
"mouth";
"nod";
"shake".
You can choose 1-2 actions out of the four. Single action example: "blink". Multiple action example: "blink,mouth". The different action types passed in this parameter take effect only when the SecurityLevel is 2, 4, or 5; otherwise, the interface reports an error.
The default value is blink. 
     * @return ActionList This interface is used to control th action sequences.
The supported action types are as follows:
"blink";
"mouth";
"nod";
"shake".
You can choose 1-2 actions out of the four. Single action example: "blink". Multiple action example: "blink,mouth". The different action types passed in this parameter take effect only when the SecurityLevel is 2, 4, or 5; otherwise, the interface reports an error.
The default value is blink.
     */
    public String getActionList() {
        return this.ActionList;
    }

    /**
     * Set This interface is used to control th action sequences.
The supported action types are as follows:
"blink";
"mouth";
"nod";
"shake".
You can choose 1-2 actions out of the four. Single action example: "blink". Multiple action example: "blink,mouth". The different action types passed in this parameter take effect only when the SecurityLevel is 2, 4, or 5; otherwise, the interface reports an error.
The default value is blink.
     * @param ActionList This interface is used to control th action sequences.
The supported action types are as follows:
"blink";
"mouth";
"nod";
"shake".
You can choose 1-2 actions out of the four. Single action example: "blink". Multiple action example: "blink,mouth". The different action types passed in this parameter take effect only when the SecurityLevel is 2, 4, or 5; otherwise, the interface reports an error.
The default value is blink.
     */
    public void setActionList(String ActionList) {
        this.ActionList = ActionList;
    }

    /**
     * Get Control liveness retry number.The value range is 1-99.
The default value is 99. 
     * @return LivenessRetryLimit Control liveness retry number.The value range is 1-99.
The default value is 99.
     */
    public Long getLivenessRetryLimit() {
        return this.LivenessRetryLimit;
    }

    /**
     * Set Control liveness retry number.The value range is 1-99.
The default value is 99.
     * @param LivenessRetryLimit Control liveness retry number.The value range is 1-99.
The default value is 99.
     */
    public void setLivenessRetryLimit(Long LivenessRetryLimit) {
        this.LivenessRetryLimit = LivenessRetryLimit;
    }

    /**
     * Get Specifies the liveness detection timeout period in seconds. value range: (0,600].
The default value is 45. 
     * @return LivenessTimeout Specifies the liveness detection timeout period in seconds. value range: (0,600].
The default value is 45.
     */
    public Long getLivenessTimeout() {
        return this.LivenessTimeout;
    }

    /**
     * Set Specifies the liveness detection timeout period in seconds. value range: (0,600].
The default value is 45.
     * @param LivenessTimeout Specifies the liveness detection timeout period in seconds. value range: (0,600].
The default value is 45.
     */
    public void setLivenessTimeout(Long LivenessTimeout) {
        this.LivenessTimeout = LivenessTimeout;
    }

    /**
     * Get Selects OCR alarms requiring attention. When an OCR Alarm occurs, the identity verification process will be interrupted. Default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the Alarm is disabled, this parameter will not be effective. The supported alarm types are as follows:
-9101: Incomplete Border Alert;
-9102: Copy Document Alert;
-9103: Remediated Document Alert;
-9104: PS-altered Document Alert;
-9107: Glare Alert;
-9108: Blurriness Alert;
-9109: Alert Not Activated. 
     * @return SelectedWarningCodes Selects OCR alarms requiring attention. When an OCR Alarm occurs, the identity verification process will be interrupted. Default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the Alarm is disabled, this parameter will not be effective. The supported alarm types are as follows:
-9101: Incomplete Border Alert;
-9102: Copy Document Alert;
-9103: Remediated Document Alert;
-9104: PS-altered Document Alert;
-9107: Glare Alert;
-9108: Blurriness Alert;
-9109: Alert Not Activated.
     */
    public String getSelectedWarningCodes() {
        return this.SelectedWarningCodes;
    }

    /**
     * Set Selects OCR alarms requiring attention. When an OCR Alarm occurs, the identity verification process will be interrupted. Default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the Alarm is disabled, this parameter will not be effective. The supported alarm types are as follows:
-9101: Incomplete Border Alert;
-9102: Copy Document Alert;
-9103: Remediated Document Alert;
-9104: PS-altered Document Alert;
-9107: Glare Alert;
-9108: Blurriness Alert;
-9109: Alert Not Activated.
     * @param SelectedWarningCodes Selects OCR alarms requiring attention. When an OCR Alarm occurs, the identity verification process will be interrupted. Default value is empty, indicating all alarms are monitored. This feature requires the parameter DisableCheckOcrWarnings=false. If the Alarm is disabled, this parameter will not be effective. The supported alarm types are as follows:
-9101: Incomplete Border Alert;
-9102: Copy Document Alert;
-9103: Remediated Document Alert;
-9104: PS-altered Document Alert;
-9107: Glare Alert;
-9108: Blurriness Alert;
-9109: Alert Not Activated.
     */
    public void setSelectedWarningCodes(String SelectedWarningCodes) {
        this.SelectedWarningCodes = SelectedWarningCodes;
    }

    /**
     * Get Whether expired identity documents are permitted to proceed to the liveness detection process. This parameter only takes effect when the document type is Hong Kong Identity Card (HKID).
true (default value): Expired HKID is allowed to enter the liveness process.
false : Expired HKID is rejected and cannot enter the liveness process. 
     * @return AllowExpiredDocument Whether expired identity documents are permitted to proceed to the liveness detection process. This parameter only takes effect when the document type is Hong Kong Identity Card (HKID).
true (default value): Expired HKID is allowed to enter the liveness process.
false : Expired HKID is rejected and cannot enter the liveness process.
     */
    public Boolean getAllowExpiredDocument() {
        return this.AllowExpiredDocument;
    }

    /**
     * Set Whether expired identity documents are permitted to proceed to the liveness detection process. This parameter only takes effect when the document type is Hong Kong Identity Card (HKID).
true (default value): Expired HKID is allowed to enter the liveness process.
false : Expired HKID is rejected and cannot enter the liveness process.
     * @param AllowExpiredDocument Whether expired identity documents are permitted to proceed to the liveness detection process. This parameter only takes effect when the document type is Hong Kong Identity Card (HKID).
true (default value): Expired HKID is allowed to enter the liveness process.
false : Expired HKID is rejected and cannot enter the liveness process.
     */
    public void setAllowExpiredDocument(Boolean AllowExpiredDocument) {
        this.AllowExpiredDocument = AllowExpiredDocument;
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

    }
}

