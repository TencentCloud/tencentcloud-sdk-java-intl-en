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
    * Card Types Supported for Authentication: Currently supported types are as follows:
1.HK (Default): Hong Kong (China) Identity Card
2.ML: Malaysia Identity Card
3.IndonesiaIDCard: Indonesia Identity Card
4.PhilippinesVoteID: Philippines Voter ID
5.PhilippinesDrivingLicense: Philippines Driving License
6.PhilippinesTinID: Philippines Tin ID
7.PhilippinesSSSID: Philippines SSS ID
8.PhilippinesUMID: Philippines UMID
9.MLIDPassport: Passports of Hong Kong, Macao, Taiwan Regions (China) and Foreign Countries
10.ThailandIDCard: Thailand Identity Card
11.MainlandIDCard: Mainland China Identity Card
12.SingaporeIDCard: Singapore Identity Card
13.HMTPermit: Exit-Entry Permit for Travel to and from Hong Kong, Macao and Taiwan (China)
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
    * A passthrough field, which is returned together with the verification result and can contain up to 1,024 bits.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * ENHANCED: Enhanced Version, BASIC: Basic Version (Default)
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
     * Get Card Types Supported for Authentication: Currently supported types are as follows:
1.HK (Default): Hong Kong (China) Identity Card
2.ML: Malaysia Identity Card
3.IndonesiaIDCard: Indonesia Identity Card
4.PhilippinesVoteID: Philippines Voter ID
5.PhilippinesDrivingLicense: Philippines Driving License
6.PhilippinesTinID: Philippines Tin ID
7.PhilippinesSSSID: Philippines SSS ID
8.PhilippinesUMID: Philippines UMID
9.MLIDPassport: Passports of Hong Kong, Macao, Taiwan Regions (China) and Foreign Countries
10.ThailandIDCard: Thailand Identity Card
11.MainlandIDCard: Mainland China Identity Card
12.SingaporeIDCard: Singapore Identity Card
13.HMTPermit: Exit-Entry Permit for Travel to and from Hong Kong, Macao and Taiwan (China) 
     * @return IdCardType Card Types Supported for Authentication: Currently supported types are as follows:
1.HK (Default): Hong Kong (China) Identity Card
2.ML: Malaysia Identity Card
3.IndonesiaIDCard: Indonesia Identity Card
4.PhilippinesVoteID: Philippines Voter ID
5.PhilippinesDrivingLicense: Philippines Driving License
6.PhilippinesTinID: Philippines Tin ID
7.PhilippinesSSSID: Philippines SSS ID
8.PhilippinesUMID: Philippines UMID
9.MLIDPassport: Passports of Hong Kong, Macao, Taiwan Regions (China) and Foreign Countries
10.ThailandIDCard: Thailand Identity Card
11.MainlandIDCard: Mainland China Identity Card
12.SingaporeIDCard: Singapore Identity Card
13.HMTPermit: Exit-Entry Permit for Travel to and from Hong Kong, Macao and Taiwan (China)
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set Card Types Supported for Authentication: Currently supported types are as follows:
1.HK (Default): Hong Kong (China) Identity Card
2.ML: Malaysia Identity Card
3.IndonesiaIDCard: Indonesia Identity Card
4.PhilippinesVoteID: Philippines Voter ID
5.PhilippinesDrivingLicense: Philippines Driving License
6.PhilippinesTinID: Philippines Tin ID
7.PhilippinesSSSID: Philippines SSS ID
8.PhilippinesUMID: Philippines UMID
9.MLIDPassport: Passports of Hong Kong, Macao, Taiwan Regions (China) and Foreign Countries
10.ThailandIDCard: Thailand Identity Card
11.MainlandIDCard: Mainland China Identity Card
12.SingaporeIDCard: Singapore Identity Card
13.HMTPermit: Exit-Entry Permit for Travel to and from Hong Kong, Macao and Taiwan (China)
     * @param IdCardType Card Types Supported for Authentication: Currently supported types are as follows:
1.HK (Default): Hong Kong (China) Identity Card
2.ML: Malaysia Identity Card
3.IndonesiaIDCard: Indonesia Identity Card
4.PhilippinesVoteID: Philippines Voter ID
5.PhilippinesDrivingLicense: Philippines Driving License
6.PhilippinesTinID: Philippines Tin ID
7.PhilippinesSSSID: Philippines SSS ID
8.PhilippinesUMID: Philippines UMID
9.MLIDPassport: Passports of Hong Kong, Macao, Taiwan Regions (China) and Foreign Countries
10.ThailandIDCard: Thailand Identity Card
11.MainlandIDCard: Mainland China Identity Card
12.SingaporeIDCard: Singapore Identity Card
13.HMTPermit: Exit-Entry Permit for Travel to and from Hong Kong, Macao and Taiwan (China)
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
     * Get ENHANCED: Enhanced Version, BASIC: Basic Version (Default) 
     * @return SdkVersion ENHANCED: Enhanced Version, BASIC: Basic Version (Default)
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set ENHANCED: Enhanced Version, BASIC: Basic Version (Default)
     * @param SdkVersion ENHANCED: Enhanced Version, BASIC: Basic Version (Default)
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
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.ActionList != null) {
            this.ActionList = new String(source.ActionList);
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
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "ActionList", this.ActionList);

    }
}

