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

public class ApplySdkVerificationTokenRequest extends AbstractModel {

    /**
    * The verification mode. Valid values:
1: OCR + liveness detection + face comparison
2: Liveness detection + face comparison
3: Liveness detection
Default value: 1
    */
    @SerializedName("CheckMode")
    @Expose
    private Long CheckMode;

    /**
    * The security level of the verification. Valid values:
1: Video-based liveness detection
2: Motion-based liveness detection
3: Reflection-based liveness detection
4: Motion- and reflection-based liveness detection
Default value: 4
    */
    @SerializedName("SecurityLevel")
    @Expose
    private Long SecurityLevel;

    /**
    * Specifies the identity document type used for authentication. valid values:.  

HK (default): hong kong (china) identity card.
2. ML: malaysian identity card.
Indonesian identity card.
4. PhilippinesVoteID: specifies the voter card in the philippines.
5. PhilippinesDrivingLicense: specifies the driving license in philippines.
6. PhilippinesTinID: specifies the philippines tin id.
7. PhilippinesSSSID: specifies the SSSID in the philippines.
8. philippines UMID: specifies the philippines UMID.
9. MLIDPassport: specifies the passport for hong kong (china), macao (china), and taiwan (china) as well as overseas passports.
ThailandIDCard: specifies the thai identity card.
Mainland id card.
12. SingaporeIDCard: specifies the Singapore id card.
13. HMTPermit: specifies the hong kong, macau and taiwan travel permit.
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * The Base64-encoded value of the photo to compare, which is required only when `CheckMode` is set to `2`.
    */
    @SerializedName("CompareImage")
    @Expose
    private String CompareImage;

    /**
    * Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
    */
    @SerializedName("NeedVerifyIdCard")
    @Expose
    private Boolean NeedVerifyIdCard;

    /**
    * Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed). (Currently, this parameter is not applied.)
    */
    @SerializedName("DisableChangeOcrResult")
    @Expose
    private Boolean DisableChangeOcrResult;

    /**
    * Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning.
This feature applies only to Hong Kong (China) identity cards, Malaysian identity cards, and passports.
    */
    @SerializedName("DisableCheckOcrWarnings")
    @Expose
    private Boolean DisableCheckOcrWarnings;

    /**
    * Customize which alarm codes to block. If left blank, all alarm codes will be blocked by default.
Optional alarm codes are: -9101 (occlusion or incomplete border), -9102 (photocopying), -9103 (screen capture by camera), -9104 (image editing/PS modification), -9107 (glare/reflection), -9108 (blurriness), -9901 (other alarms).
    */
    @SerializedName("SelectedWarningCodes")
    @Expose
    private Long [] SelectedWarningCodes;

    /**
    * A passthrough field, which is returned together with the verification result and can contain up to 1,024 bits.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * BASIC: Basic version (Default).
ENHANCE: Enhance version, enable additional output of device risk level field.
PRO: Pro version, enable additional output of attack type fields.
PLUS: Plus version, enable additional output of device risk level and attack type fields.
Please contact us to access enhance version & plus version.	
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
    */
    @SerializedName("ActionList")
    @Expose
    private String ActionList;

    /**
    * Whether expired identity documents are permitted to proceed to the liveness detection process. This parameter only takes effect when the document type is Hong Kong Identity Card (HKID).
true (default value): Expired HKID is allowed to enter the liveness process.
false : Expired HKID is rejected and cannot enter the liveness process.
    */
    @SerializedName("AllowExpiredDocument")
    @Expose
    private Boolean AllowExpiredDocument;

    /**
    * <p>Whether to display the final result page</p><p>Enumeration values:</p><ul><li>true: Do not display the result page</li><li>false: Display the result page</li></ul><p>Default value: false</p>
    */
    @SerializedName("SkipResultPage")
    @Expose
    private Boolean SkipResultPage;

    /**
    * <p>Identified fields displayed during document OCR</p><p>Parameter format: ["ChineseName","FullName"]</p><p>Input constraints: <strong>Supported field names by document type:</strong><br><strong>HK (Hong Kong Identity Card):</strong> "ChineseName","FullName","LicenseNumber","Birthday","Sex", "IssuedDate", "Permanent", "Symbol", "CurrentIssueDate"<br><strong>ML (Malaysia Identity Card):</strong> "FullName","LicenseNumber","Sex", "Birthday", "Type", "FormattedAddress"<br><strong>IndonesiaIDCard (Indonesia Identity Card):</strong> "LicenseNumber","FullName","Sex", "Birthday", "FormattedAddress", "Nationality", "DueDate", "IssuedDate", "Street", "Village","Area","Province","City","MaritalStatus", "BloodType", "Religion", "Occupation"<br><strong>PhilippinesVoteID (Philippines Voter's ID):</strong> "FirstName","LastName","Birthday"<br><strong>PhilippinesDrivingLicense (Philippines Driving License):</strong> "LastName","FirstName","MiddleName","Sex","Birthday"<br><strong>PhilippinesTinID (Philippines TIN ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesSSSID (Philippines SSS ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesUMID (Philippines UMID):</strong> "Surname", "MiddleName", "GivenName", "Sex", "Birthday"<br><strong>MLIDPassport (Passports of Hong Kong, Macao, Taiwan and overseas regions):</strong> "LicenseNumber","FullName", "Surname", "GivenName", "Birthday", "Sex","DateOfExpiration","IssuingCountry"<br><strong>ThailandIDCard (Thailand Identity Card):</strong> "FullName", "LastName", "FirstName", "FormattedAddress", "LicenseNumber", "Birthday", "ExpirationDate", "IssuedDate", "RegistrationNumber", "Religion", "ThaiBirthday", "ThaiExpirationDate", "ThaiIssueDate"<br><strong>MainlandIDCard (Chinese Mainland Identity Card):</strong> "LicenseNumber", "FullName", "Sex", "Nation", "Birthday", "FormattedAddress"<br><strong>SingaporeIDCard (Singapore Identity Card):</strong> "ChineseName","Sex","Birthday","LicenseNumber","Nationality","FullName","Address"<br><strong>HMTPermit (Mainland Travel Permit for Hong Kong and Macao Residents / Mainland Travel Permit for Taiwan Residents):</strong> "Name", "EnglishName", "Sex", "Number", "ValidDate", "Birthday"</p><p>If no fields are specified, all identified fields will be displayed by default.</p>

    */
    @SerializedName("CardOcrDisplayFields")
    @Expose
    private String [] CardOcrDisplayFields;

    /**
    * <p>Liveness retry attempts</p><p>Value range: [1, 5]</p><p>Default value: 5</p>
    */
    @SerializedName("RetryLimit")
    @Expose
    private Long RetryLimit;

    /**
    * <p>Enable multi-image anti-spoofing for single-angle Identity Document Recognition</p><p>Default value: false</p><p>true - Enabled; false - Disabled</p>
    */
    @SerializedName("EnableForgeryDetectionImages")
    @Expose
    private Boolean EnableForgeryDetectionImages;

    /**
     * Get The verification mode. Valid values:
1: OCR + liveness detection + face comparison
2: Liveness detection + face comparison
3: Liveness detection
Default value: 1 
     * @return CheckMode The verification mode. Valid values:
1: OCR + liveness detection + face comparison
2: Liveness detection + face comparison
3: Liveness detection
Default value: 1
     */
    public Long getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set The verification mode. Valid values:
1: OCR + liveness detection + face comparison
2: Liveness detection + face comparison
3: Liveness detection
Default value: 1
     * @param CheckMode The verification mode. Valid values:
1: OCR + liveness detection + face comparison
2: Liveness detection + face comparison
3: Liveness detection
Default value: 1
     */
    public void setCheckMode(Long CheckMode) {
        this.CheckMode = CheckMode;
    }

    /**
     * Get The security level of the verification. Valid values:
1: Video-based liveness detection
2: Motion-based liveness detection
3: Reflection-based liveness detection
4: Motion- and reflection-based liveness detection
Default value: 4 
     * @return SecurityLevel The security level of the verification. Valid values:
1: Video-based liveness detection
2: Motion-based liveness detection
3: Reflection-based liveness detection
4: Motion- and reflection-based liveness detection
Default value: 4
     */
    public Long getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set The security level of the verification. Valid values:
1: Video-based liveness detection
2: Motion-based liveness detection
3: Reflection-based liveness detection
4: Motion- and reflection-based liveness detection
Default value: 4
     * @param SecurityLevel The security level of the verification. Valid values:
1: Video-based liveness detection
2: Motion-based liveness detection
3: Reflection-based liveness detection
4: Motion- and reflection-based liveness detection
Default value: 4
     */
    public void setSecurityLevel(Long SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    /**
     * Get Specifies the identity document type used for authentication. valid values:.  

HK (default): hong kong (china) identity card.
2. ML: malaysian identity card.
Indonesian identity card.
4. PhilippinesVoteID: specifies the voter card in the philippines.
5. PhilippinesDrivingLicense: specifies the driving license in philippines.
6. PhilippinesTinID: specifies the philippines tin id.
7. PhilippinesSSSID: specifies the SSSID in the philippines.
8. philippines UMID: specifies the philippines UMID.
9. MLIDPassport: specifies the passport for hong kong (china), macao (china), and taiwan (china) as well as overseas passports.
ThailandIDCard: specifies the thai identity card.
Mainland id card.
12. SingaporeIDCard: specifies the Singapore id card.
13. HMTPermit: specifies the hong kong, macau and taiwan travel permit. 
     * @return IdCardType Specifies the identity document type used for authentication. valid values:.  

HK (default): hong kong (china) identity card.
2. ML: malaysian identity card.
Indonesian identity card.
4. PhilippinesVoteID: specifies the voter card in the philippines.
5. PhilippinesDrivingLicense: specifies the driving license in philippines.
6. PhilippinesTinID: specifies the philippines tin id.
7. PhilippinesSSSID: specifies the SSSID in the philippines.
8. philippines UMID: specifies the philippines UMID.
9. MLIDPassport: specifies the passport for hong kong (china), macao (china), and taiwan (china) as well as overseas passports.
ThailandIDCard: specifies the thai identity card.
Mainland id card.
12. SingaporeIDCard: specifies the Singapore id card.
13. HMTPermit: specifies the hong kong, macau and taiwan travel permit.
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set Specifies the identity document type used for authentication. valid values:.  

HK (default): hong kong (china) identity card.
2. ML: malaysian identity card.
Indonesian identity card.
4. PhilippinesVoteID: specifies the voter card in the philippines.
5. PhilippinesDrivingLicense: specifies the driving license in philippines.
6. PhilippinesTinID: specifies the philippines tin id.
7. PhilippinesSSSID: specifies the SSSID in the philippines.
8. philippines UMID: specifies the philippines UMID.
9. MLIDPassport: specifies the passport for hong kong (china), macao (china), and taiwan (china) as well as overseas passports.
ThailandIDCard: specifies the thai identity card.
Mainland id card.
12. SingaporeIDCard: specifies the Singapore id card.
13. HMTPermit: specifies the hong kong, macau and taiwan travel permit.
     * @param IdCardType Specifies the identity document type used for authentication. valid values:.  

HK (default): hong kong (china) identity card.
2. ML: malaysian identity card.
Indonesian identity card.
4. PhilippinesVoteID: specifies the voter card in the philippines.
5. PhilippinesDrivingLicense: specifies the driving license in philippines.
6. PhilippinesTinID: specifies the philippines tin id.
7. PhilippinesSSSID: specifies the SSSID in the philippines.
8. philippines UMID: specifies the philippines UMID.
9. MLIDPassport: specifies the passport for hong kong (china), macao (china), and taiwan (china) as well as overseas passports.
ThailandIDCard: specifies the thai identity card.
Mainland id card.
12. SingaporeIDCard: specifies the Singapore id card.
13. HMTPermit: specifies the hong kong, macau and taiwan travel permit.
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get The Base64-encoded value of the photo to compare, which is required only when `CheckMode` is set to `2`. 
     * @return CompareImage The Base64-encoded value of the photo to compare, which is required only when `CheckMode` is set to `2`.
     */
    public String getCompareImage() {
        return this.CompareImage;
    }

    /**
     * Set The Base64-encoded value of the photo to compare, which is required only when `CheckMode` is set to `2`.
     * @param CompareImage The Base64-encoded value of the photo to compare, which is required only when `CheckMode` is set to `2`.
     */
    public void setCompareImage(String CompareImage) {
        this.CompareImage = CompareImage;
    }

    /**
     * Get Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`. 
     * @return NeedVerifyIdCard Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
     * @deprecated
     */
    @Deprecated
    public Boolean getNeedVerifyIdCard() {
        return this.NeedVerifyIdCard;
    }

    /**
     * Set Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
     * @param NeedVerifyIdCard Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
     * @deprecated
     */
    @Deprecated
    public void setNeedVerifyIdCard(Boolean NeedVerifyIdCard) {
        this.NeedVerifyIdCard = NeedVerifyIdCard;
    }

    /**
     * Get Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed). (Currently, this parameter is not applied.) 
     * @return DisableChangeOcrResult Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed). (Currently, this parameter is not applied.)
     */
    public Boolean getDisableChangeOcrResult() {
        return this.DisableChangeOcrResult;
    }

    /**
     * Set Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed). (Currently, this parameter is not applied.)
     * @param DisableChangeOcrResult Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed). (Currently, this parameter is not applied.)
     */
    public void setDisableChangeOcrResult(Boolean DisableChangeOcrResult) {
        this.DisableChangeOcrResult = DisableChangeOcrResult;
    }

    /**
     * Get Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning.
This feature applies only to Hong Kong (China) identity cards, Malaysian identity cards, and passports. 
     * @return DisableCheckOcrWarnings Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning.
This feature applies only to Hong Kong (China) identity cards, Malaysian identity cards, and passports.
     */
    public Boolean getDisableCheckOcrWarnings() {
        return this.DisableCheckOcrWarnings;
    }

    /**
     * Set Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning.
This feature applies only to Hong Kong (China) identity cards, Malaysian identity cards, and passports.
     * @param DisableCheckOcrWarnings Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning.
This feature applies only to Hong Kong (China) identity cards, Malaysian identity cards, and passports.
     */
    public void setDisableCheckOcrWarnings(Boolean DisableCheckOcrWarnings) {
        this.DisableCheckOcrWarnings = DisableCheckOcrWarnings;
    }

    /**
     * Get Customize which alarm codes to block. If left blank, all alarm codes will be blocked by default.
Optional alarm codes are: -9101 (occlusion or incomplete border), -9102 (photocopying), -9103 (screen capture by camera), -9104 (image editing/PS modification), -9107 (glare/reflection), -9108 (blurriness), -9901 (other alarms). 
     * @return SelectedWarningCodes Customize which alarm codes to block. If left blank, all alarm codes will be blocked by default.
Optional alarm codes are: -9101 (occlusion or incomplete border), -9102 (photocopying), -9103 (screen capture by camera), -9104 (image editing/PS modification), -9107 (glare/reflection), -9108 (blurriness), -9901 (other alarms).
     */
    public Long [] getSelectedWarningCodes() {
        return this.SelectedWarningCodes;
    }

    /**
     * Set Customize which alarm codes to block. If left blank, all alarm codes will be blocked by default.
Optional alarm codes are: -9101 (occlusion or incomplete border), -9102 (photocopying), -9103 (screen capture by camera), -9104 (image editing/PS modification), -9107 (glare/reflection), -9108 (blurriness), -9901 (other alarms).
     * @param SelectedWarningCodes Customize which alarm codes to block. If left blank, all alarm codes will be blocked by default.
Optional alarm codes are: -9101 (occlusion or incomplete border), -9102 (photocopying), -9103 (screen capture by camera), -9104 (image editing/PS modification), -9107 (glare/reflection), -9108 (blurriness), -9901 (other alarms).
     */
    public void setSelectedWarningCodes(Long [] SelectedWarningCodes) {
        this.SelectedWarningCodes = SelectedWarningCodes;
    }

    /**
     * Get A passthrough field, which is returned together with the verification result and can contain up to 1,024 bits. 
     * @return Extra A passthrough field, which is returned together with the verification result and can contain up to 1,024 bits.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set A passthrough field, which is returned together with the verification result and can contain up to 1,024 bits.
     * @param Extra A passthrough field, which is returned together with the verification result and can contain up to 1,024 bits.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get BASIC: Basic version (Default).
ENHANCE: Enhance version, enable additional output of device risk level field.
PRO: Pro version, enable additional output of attack type fields.
PLUS: Plus version, enable additional output of device risk level and attack type fields.
Please contact us to access enhance version & plus version.	 
     * @return SdkVersion BASIC: Basic version (Default).
ENHANCE: Enhance version, enable additional output of device risk level field.
PRO: Pro version, enable additional output of attack type fields.
PLUS: Plus version, enable additional output of device risk level and attack type fields.
Please contact us to access enhance version & plus version.	
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set BASIC: Basic version (Default).
ENHANCE: Enhance version, enable additional output of device risk level field.
PRO: Pro version, enable additional output of attack type fields.
PLUS: Plus version, enable additional output of device risk level and attack type fields.
Please contact us to access enhance version & plus version.	
     * @param SdkVersion BASIC: Basic version (Default).
ENHANCE: Enhance version, enable additional output of device risk level field.
PRO: Pro version, enable additional output of attack type fields.
PLUS: Plus version, enable additional output of device risk level and attack type fields.
Please contact us to access enhance version & plus version.	
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error. 
     * @return ActionList This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
     */
    public String getActionList() {
        return this.ActionList;
    }

    /**
     * Set This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
     * @param ActionList This interface is used to control th action sequences.
Action types are as follows:
"blink"
"mouth"
"nod"
"shake"
You can choose 1-2 actions out of the four.
Single action example: "blink"
Multiple action example: "blink,mouth"
The default value is blink. The different action types passed in this parameter take effect only when the SecurityLevel is 2 or 4; otherwise, the interface reports an error.
     */
    public void setActionList(String ActionList) {
        this.ActionList = ActionList;
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

    /**
     * Get <p>Whether to display the final result page</p><p>Enumeration values:</p><ul><li>true: Do not display the result page</li><li>false: Display the result page</li></ul><p>Default value: false</p> 
     * @return SkipResultPage <p>Whether to display the final result page</p><p>Enumeration values:</p><ul><li>true: Do not display the result page</li><li>false: Display the result page</li></ul><p>Default value: false</p>
     */
    public Boolean getSkipResultPage() {
        return this.SkipResultPage;
    }

    /**
     * Set <p>Whether to display the final result page</p><p>Enumeration values:</p><ul><li>true: Do not display the result page</li><li>false: Display the result page</li></ul><p>Default value: false</p>
     * @param SkipResultPage <p>Whether to display the final result page</p><p>Enumeration values:</p><ul><li>true: Do not display the result page</li><li>false: Display the result page</li></ul><p>Default value: false</p>
     */
    public void setSkipResultPage(Boolean SkipResultPage) {
        this.SkipResultPage = SkipResultPage;
    }

    /**
     * Get <p>Identified fields displayed during document OCR</p><p>Parameter format: ["ChineseName","FullName"]</p><p>Input constraints: <strong>Supported field names by document type:</strong><br><strong>HK (Hong Kong Identity Card):</strong> "ChineseName","FullName","LicenseNumber","Birthday","Sex", "IssuedDate", "Permanent", "Symbol", "CurrentIssueDate"<br><strong>ML (Malaysia Identity Card):</strong> "FullName","LicenseNumber","Sex", "Birthday", "Type", "FormattedAddress"<br><strong>IndonesiaIDCard (Indonesia Identity Card):</strong> "LicenseNumber","FullName","Sex", "Birthday", "FormattedAddress", "Nationality", "DueDate", "IssuedDate", "Street", "Village","Area","Province","City","MaritalStatus", "BloodType", "Religion", "Occupation"<br><strong>PhilippinesVoteID (Philippines Voter's ID):</strong> "FirstName","LastName","Birthday"<br><strong>PhilippinesDrivingLicense (Philippines Driving License):</strong> "LastName","FirstName","MiddleName","Sex","Birthday"<br><strong>PhilippinesTinID (Philippines TIN ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesSSSID (Philippines SSS ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesUMID (Philippines UMID):</strong> "Surname", "MiddleName", "GivenName", "Sex", "Birthday"<br><strong>MLIDPassport (Passports of Hong Kong, Macao, Taiwan and overseas regions):</strong> "LicenseNumber","FullName", "Surname", "GivenName", "Birthday", "Sex","DateOfExpiration","IssuingCountry"<br><strong>ThailandIDCard (Thailand Identity Card):</strong> "FullName", "LastName", "FirstName", "FormattedAddress", "LicenseNumber", "Birthday", "ExpirationDate", "IssuedDate", "RegistrationNumber", "Religion", "ThaiBirthday", "ThaiExpirationDate", "ThaiIssueDate"<br><strong>MainlandIDCard (Chinese Mainland Identity Card):</strong> "LicenseNumber", "FullName", "Sex", "Nation", "Birthday", "FormattedAddress"<br><strong>SingaporeIDCard (Singapore Identity Card):</strong> "ChineseName","Sex","Birthday","LicenseNumber","Nationality","FullName","Address"<br><strong>HMTPermit (Mainland Travel Permit for Hong Kong and Macao Residents / Mainland Travel Permit for Taiwan Residents):</strong> "Name", "EnglishName", "Sex", "Number", "ValidDate", "Birthday"</p><p>If no fields are specified, all identified fields will be displayed by default.</p>
 
     * @return CardOcrDisplayFields <p>Identified fields displayed during document OCR</p><p>Parameter format: ["ChineseName","FullName"]</p><p>Input constraints: <strong>Supported field names by document type:</strong><br><strong>HK (Hong Kong Identity Card):</strong> "ChineseName","FullName","LicenseNumber","Birthday","Sex", "IssuedDate", "Permanent", "Symbol", "CurrentIssueDate"<br><strong>ML (Malaysia Identity Card):</strong> "FullName","LicenseNumber","Sex", "Birthday", "Type", "FormattedAddress"<br><strong>IndonesiaIDCard (Indonesia Identity Card):</strong> "LicenseNumber","FullName","Sex", "Birthday", "FormattedAddress", "Nationality", "DueDate", "IssuedDate", "Street", "Village","Area","Province","City","MaritalStatus", "BloodType", "Religion", "Occupation"<br><strong>PhilippinesVoteID (Philippines Voter's ID):</strong> "FirstName","LastName","Birthday"<br><strong>PhilippinesDrivingLicense (Philippines Driving License):</strong> "LastName","FirstName","MiddleName","Sex","Birthday"<br><strong>PhilippinesTinID (Philippines TIN ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesSSSID (Philippines SSS ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesUMID (Philippines UMID):</strong> "Surname", "MiddleName", "GivenName", "Sex", "Birthday"<br><strong>MLIDPassport (Passports of Hong Kong, Macao, Taiwan and overseas regions):</strong> "LicenseNumber","FullName", "Surname", "GivenName", "Birthday", "Sex","DateOfExpiration","IssuingCountry"<br><strong>ThailandIDCard (Thailand Identity Card):</strong> "FullName", "LastName", "FirstName", "FormattedAddress", "LicenseNumber", "Birthday", "ExpirationDate", "IssuedDate", "RegistrationNumber", "Religion", "ThaiBirthday", "ThaiExpirationDate", "ThaiIssueDate"<br><strong>MainlandIDCard (Chinese Mainland Identity Card):</strong> "LicenseNumber", "FullName", "Sex", "Nation", "Birthday", "FormattedAddress"<br><strong>SingaporeIDCard (Singapore Identity Card):</strong> "ChineseName","Sex","Birthday","LicenseNumber","Nationality","FullName","Address"<br><strong>HMTPermit (Mainland Travel Permit for Hong Kong and Macao Residents / Mainland Travel Permit for Taiwan Residents):</strong> "Name", "EnglishName", "Sex", "Number", "ValidDate", "Birthday"</p><p>If no fields are specified, all identified fields will be displayed by default.</p>

     */
    public String [] getCardOcrDisplayFields() {
        return this.CardOcrDisplayFields;
    }

    /**
     * Set <p>Identified fields displayed during document OCR</p><p>Parameter format: ["ChineseName","FullName"]</p><p>Input constraints: <strong>Supported field names by document type:</strong><br><strong>HK (Hong Kong Identity Card):</strong> "ChineseName","FullName","LicenseNumber","Birthday","Sex", "IssuedDate", "Permanent", "Symbol", "CurrentIssueDate"<br><strong>ML (Malaysia Identity Card):</strong> "FullName","LicenseNumber","Sex", "Birthday", "Type", "FormattedAddress"<br><strong>IndonesiaIDCard (Indonesia Identity Card):</strong> "LicenseNumber","FullName","Sex", "Birthday", "FormattedAddress", "Nationality", "DueDate", "IssuedDate", "Street", "Village","Area","Province","City","MaritalStatus", "BloodType", "Religion", "Occupation"<br><strong>PhilippinesVoteID (Philippines Voter's ID):</strong> "FirstName","LastName","Birthday"<br><strong>PhilippinesDrivingLicense (Philippines Driving License):</strong> "LastName","FirstName","MiddleName","Sex","Birthday"<br><strong>PhilippinesTinID (Philippines TIN ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesSSSID (Philippines SSS ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesUMID (Philippines UMID):</strong> "Surname", "MiddleName", "GivenName", "Sex", "Birthday"<br><strong>MLIDPassport (Passports of Hong Kong, Macao, Taiwan and overseas regions):</strong> "LicenseNumber","FullName", "Surname", "GivenName", "Birthday", "Sex","DateOfExpiration","IssuingCountry"<br><strong>ThailandIDCard (Thailand Identity Card):</strong> "FullName", "LastName", "FirstName", "FormattedAddress", "LicenseNumber", "Birthday", "ExpirationDate", "IssuedDate", "RegistrationNumber", "Religion", "ThaiBirthday", "ThaiExpirationDate", "ThaiIssueDate"<br><strong>MainlandIDCard (Chinese Mainland Identity Card):</strong> "LicenseNumber", "FullName", "Sex", "Nation", "Birthday", "FormattedAddress"<br><strong>SingaporeIDCard (Singapore Identity Card):</strong> "ChineseName","Sex","Birthday","LicenseNumber","Nationality","FullName","Address"<br><strong>HMTPermit (Mainland Travel Permit for Hong Kong and Macao Residents / Mainland Travel Permit for Taiwan Residents):</strong> "Name", "EnglishName", "Sex", "Number", "ValidDate", "Birthday"</p><p>If no fields are specified, all identified fields will be displayed by default.</p>

     * @param CardOcrDisplayFields <p>Identified fields displayed during document OCR</p><p>Parameter format: ["ChineseName","FullName"]</p><p>Input constraints: <strong>Supported field names by document type:</strong><br><strong>HK (Hong Kong Identity Card):</strong> "ChineseName","FullName","LicenseNumber","Birthday","Sex", "IssuedDate", "Permanent", "Symbol", "CurrentIssueDate"<br><strong>ML (Malaysia Identity Card):</strong> "FullName","LicenseNumber","Sex", "Birthday", "Type", "FormattedAddress"<br><strong>IndonesiaIDCard (Indonesia Identity Card):</strong> "LicenseNumber","FullName","Sex", "Birthday", "FormattedAddress", "Nationality", "DueDate", "IssuedDate", "Street", "Village","Area","Province","City","MaritalStatus", "BloodType", "Religion", "Occupation"<br><strong>PhilippinesVoteID (Philippines Voter's ID):</strong> "FirstName","LastName","Birthday"<br><strong>PhilippinesDrivingLicense (Philippines Driving License):</strong> "LastName","FirstName","MiddleName","Sex","Birthday"<br><strong>PhilippinesTinID (Philippines TIN ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesSSSID (Philippines SSS ID):</strong> "LicenseNumber", "FullName", "Birthday"<br><strong>PhilippinesUMID (Philippines UMID):</strong> "Surname", "MiddleName", "GivenName", "Sex", "Birthday"<br><strong>MLIDPassport (Passports of Hong Kong, Macao, Taiwan and overseas regions):</strong> "LicenseNumber","FullName", "Surname", "GivenName", "Birthday", "Sex","DateOfExpiration","IssuingCountry"<br><strong>ThailandIDCard (Thailand Identity Card):</strong> "FullName", "LastName", "FirstName", "FormattedAddress", "LicenseNumber", "Birthday", "ExpirationDate", "IssuedDate", "RegistrationNumber", "Religion", "ThaiBirthday", "ThaiExpirationDate", "ThaiIssueDate"<br><strong>MainlandIDCard (Chinese Mainland Identity Card):</strong> "LicenseNumber", "FullName", "Sex", "Nation", "Birthday", "FormattedAddress"<br><strong>SingaporeIDCard (Singapore Identity Card):</strong> "ChineseName","Sex","Birthday","LicenseNumber","Nationality","FullName","Address"<br><strong>HMTPermit (Mainland Travel Permit for Hong Kong and Macao Residents / Mainland Travel Permit for Taiwan Residents):</strong> "Name", "EnglishName", "Sex", "Number", "ValidDate", "Birthday"</p><p>If no fields are specified, all identified fields will be displayed by default.</p>

     */
    public void setCardOcrDisplayFields(String [] CardOcrDisplayFields) {
        this.CardOcrDisplayFields = CardOcrDisplayFields;
    }

    /**
     * Get <p>Liveness retry attempts</p><p>Value range: [1, 5]</p><p>Default value: 5</p> 
     * @return RetryLimit <p>Liveness retry attempts</p><p>Value range: [1, 5]</p><p>Default value: 5</p>
     */
    public Long getRetryLimit() {
        return this.RetryLimit;
    }

    /**
     * Set <p>Liveness retry attempts</p><p>Value range: [1, 5]</p><p>Default value: 5</p>
     * @param RetryLimit <p>Liveness retry attempts</p><p>Value range: [1, 5]</p><p>Default value: 5</p>
     */
    public void setRetryLimit(Long RetryLimit) {
        this.RetryLimit = RetryLimit;
    }

    /**
     * Get <p>Enable multi-image anti-spoofing for single-angle Identity Document Recognition</p><p>Default value: false</p><p>true - Enabled; false - Disabled</p> 
     * @return EnableForgeryDetectionImages <p>Enable multi-image anti-spoofing for single-angle Identity Document Recognition</p><p>Default value: false</p><p>true - Enabled; false - Disabled</p>
     */
    public Boolean getEnableForgeryDetectionImages() {
        return this.EnableForgeryDetectionImages;
    }

    /**
     * Set <p>Enable multi-image anti-spoofing for single-angle Identity Document Recognition</p><p>Default value: false</p><p>true - Enabled; false - Disabled</p>
     * @param EnableForgeryDetectionImages <p>Enable multi-image anti-spoofing for single-angle Identity Document Recognition</p><p>Default value: false</p><p>true - Enabled; false - Disabled</p>
     */
    public void setEnableForgeryDetectionImages(Boolean EnableForgeryDetectionImages) {
        this.EnableForgeryDetectionImages = EnableForgeryDetectionImages;
    }

    public ApplySdkVerificationTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplySdkVerificationTokenRequest(ApplySdkVerificationTokenRequest source) {
        if (source.CheckMode != null) {
            this.CheckMode = new Long(source.CheckMode);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new Long(source.SecurityLevel);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.CompareImage != null) {
            this.CompareImage = new String(source.CompareImage);
        }
        if (source.NeedVerifyIdCard != null) {
            this.NeedVerifyIdCard = new Boolean(source.NeedVerifyIdCard);
        }
        if (source.DisableChangeOcrResult != null) {
            this.DisableChangeOcrResult = new Boolean(source.DisableChangeOcrResult);
        }
        if (source.DisableCheckOcrWarnings != null) {
            this.DisableCheckOcrWarnings = new Boolean(source.DisableCheckOcrWarnings);
        }
        if (source.SelectedWarningCodes != null) {
            this.SelectedWarningCodes = new Long[source.SelectedWarningCodes.length];
            for (int i = 0; i < source.SelectedWarningCodes.length; i++) {
                this.SelectedWarningCodes[i] = new Long(source.SelectedWarningCodes[i]);
            }
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.ActionList != null) {
            this.ActionList = new String(source.ActionList);
        }
        if (source.AllowExpiredDocument != null) {
            this.AllowExpiredDocument = new Boolean(source.AllowExpiredDocument);
        }
        if (source.SkipResultPage != null) {
            this.SkipResultPage = new Boolean(source.SkipResultPage);
        }
        if (source.CardOcrDisplayFields != null) {
            this.CardOcrDisplayFields = new String[source.CardOcrDisplayFields.length];
            for (int i = 0; i < source.CardOcrDisplayFields.length; i++) {
                this.CardOcrDisplayFields[i] = new String(source.CardOcrDisplayFields[i]);
            }
        }
        if (source.RetryLimit != null) {
            this.RetryLimit = new Long(source.RetryLimit);
        }
        if (source.EnableForgeryDetectionImages != null) {
            this.EnableForgeryDetectionImages = new Boolean(source.EnableForgeryDetectionImages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckMode", this.CheckMode);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "CompareImage", this.CompareImage);
        this.setParamSimple(map, prefix + "NeedVerifyIdCard", this.NeedVerifyIdCard);
        this.setParamSimple(map, prefix + "DisableChangeOcrResult", this.DisableChangeOcrResult);
        this.setParamSimple(map, prefix + "DisableCheckOcrWarnings", this.DisableCheckOcrWarnings);
        this.setParamArraySimple(map, prefix + "SelectedWarningCodes.", this.SelectedWarningCodes);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "ActionList", this.ActionList);
        this.setParamSimple(map, prefix + "AllowExpiredDocument", this.AllowExpiredDocument);
        this.setParamSimple(map, prefix + "SkipResultPage", this.SkipResultPage);
        this.setParamArraySimple(map, prefix + "CardOcrDisplayFields.", this.CardOcrDisplayFields);
        this.setParamSimple(map, prefix + "RetryLimit", this.RetryLimit);
        this.setParamSimple(map, prefix + "EnableForgeryDetectionImages", this.EnableForgeryDetectionImages);

    }
}

