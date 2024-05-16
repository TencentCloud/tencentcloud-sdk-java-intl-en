/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * The identity document type. Valid values: 
1. `HK` (default): Identity card of Hong Kong (China)
2. `ML`: Malaysian identity card
3. `IndonesiaIDCard`: Indonesian identity card
4. `PhilippinesVoteID`: Philippine voters ID card
5. `PhilippinesDrivingLicense`: Philippine driver's license
6. `PhilippinesTinID`: Philippine TIN ID card
7. `PhilippinesSSSID`: Philippine SSS ID card
8. `PhilippinesUMID`: Philippine UMID card
9. `MLIDPassport`: Passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions
10..MacaoIDCard: Macao ID Card
11.ThailandIDCard: Thailand ID Card
12.MainlandIDCard: Mainland ID Card
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
     * Get The identity document type. Valid values: 
1. `HK` (default): Identity card of Hong Kong (China)
2. `ML`: Malaysian identity card
3. `IndonesiaIDCard`: Indonesian identity card
4. `PhilippinesVoteID`: Philippine voters ID card
5. `PhilippinesDrivingLicense`: Philippine driver's license
6. `PhilippinesTinID`: Philippine TIN ID card
7. `PhilippinesSSSID`: Philippine SSS ID card
8. `PhilippinesUMID`: Philippine UMID card
9. `MLIDPassport`: Passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions
10..MacaoIDCard: Macao ID Card
11.ThailandIDCard: Thailand ID Card
12.MainlandIDCard: Mainland ID Card 
     * @return IdCardType The identity document type. Valid values: 
1. `HK` (default): Identity card of Hong Kong (China)
2. `ML`: Malaysian identity card
3. `IndonesiaIDCard`: Indonesian identity card
4. `PhilippinesVoteID`: Philippine voters ID card
5. `PhilippinesDrivingLicense`: Philippine driver's license
6. `PhilippinesTinID`: Philippine TIN ID card
7. `PhilippinesSSSID`: Philippine SSS ID card
8. `PhilippinesUMID`: Philippine UMID card
9. `MLIDPassport`: Passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions
10..MacaoIDCard: Macao ID Card
11.ThailandIDCard: Thailand ID Card
12.MainlandIDCard: Mainland ID Card
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set The identity document type. Valid values: 
1. `HK` (default): Identity card of Hong Kong (China)
2. `ML`: Malaysian identity card
3. `IndonesiaIDCard`: Indonesian identity card
4. `PhilippinesVoteID`: Philippine voters ID card
5. `PhilippinesDrivingLicense`: Philippine driver's license
6. `PhilippinesTinID`: Philippine TIN ID card
7. `PhilippinesSSSID`: Philippine SSS ID card
8. `PhilippinesUMID`: Philippine UMID card
9. `MLIDPassport`: Passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions
10..MacaoIDCard: Macao ID Card
11.ThailandIDCard: Thailand ID Card
12.MainlandIDCard: Mainland ID Card
     * @param IdCardType The identity document type. Valid values: 
1. `HK` (default): Identity card of Hong Kong (China)
2. `ML`: Malaysian identity card
3. `IndonesiaIDCard`: Indonesian identity card
4. `PhilippinesVoteID`: Philippine voters ID card
5. `PhilippinesDrivingLicense`: Philippine driver's license
6. `PhilippinesTinID`: Philippine TIN ID card
7. `PhilippinesSSSID`: Philippine SSS ID card
8. `PhilippinesUMID`: Philippine UMID card
9. `MLIDPassport`: Passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions
10..MacaoIDCard: Macao ID Card
11.ThailandIDCard: Thailand ID Card
12.MainlandIDCard: Mainland ID Card
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

    }
}

