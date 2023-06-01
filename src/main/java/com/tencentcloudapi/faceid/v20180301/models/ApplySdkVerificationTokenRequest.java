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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplySdkVerificationTokenRequest extends AbstractModel{

    /**
    * Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
    */
    @SerializedName("NeedVerifyIdCard")
    @Expose
    private Boolean NeedVerifyIdCard;

    /**
    * The identity document type. Valid values: `HK` (identity card of Hong Kong (China)) (default), `ML` (Malaysian identity card), `IndonesiaIDCard` (Indonesian identity card), `PhilippinesVoteID` (Philippine voters ID card), `PhilippinesDrivingLicense` (Philippine driver's license), `PhilippinesTinID` (Philippine TIN ID card), `PhilippinesSSSID` (Philippine SSS ID card), and `MLIDPassport` (passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions).
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed).
    */
    @SerializedName("DisableChangeOcrResult")
    @Expose
    private Boolean DisableChangeOcrResult;

    /**
    * Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning. If `NeedVerifyIdCard` is set to `true`, this parameter must also be set to `true`.
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
     * Get Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`. 
     * @return NeedVerifyIdCard Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
     */
    public Boolean getNeedVerifyIdCard() {
        return this.NeedVerifyIdCard;
    }

    /**
     * Set Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
     * @param NeedVerifyIdCard Whether ID card authentication is required. If not, only document OCR will be performed. Currently, authentication is available only when the value of `IdCardType` is `HK`.
     */
    public void setNeedVerifyIdCard(Boolean NeedVerifyIdCard) {
        this.NeedVerifyIdCard = NeedVerifyIdCard;
    }

    /**
     * Get The identity document type. Valid values: `HK` (identity card of Hong Kong (China)) (default), `ML` (Malaysian identity card), `IndonesiaIDCard` (Indonesian identity card), `PhilippinesVoteID` (Philippine voters ID card), `PhilippinesDrivingLicense` (Philippine driver's license), `PhilippinesTinID` (Philippine TIN ID card), `PhilippinesSSSID` (Philippine SSS ID card), and `MLIDPassport` (passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions). 
     * @return IdCardType The identity document type. Valid values: `HK` (identity card of Hong Kong (China)) (default), `ML` (Malaysian identity card), `IndonesiaIDCard` (Indonesian identity card), `PhilippinesVoteID` (Philippine voters ID card), `PhilippinesDrivingLicense` (Philippine driver's license), `PhilippinesTinID` (Philippine TIN ID card), `PhilippinesSSSID` (Philippine SSS ID card), and `MLIDPassport` (passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions).
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set The identity document type. Valid values: `HK` (identity card of Hong Kong (China)) (default), `ML` (Malaysian identity card), `IndonesiaIDCard` (Indonesian identity card), `PhilippinesVoteID` (Philippine voters ID card), `PhilippinesDrivingLicense` (Philippine driver's license), `PhilippinesTinID` (Philippine TIN ID card), `PhilippinesSSSID` (Philippine SSS ID card), and `MLIDPassport` (passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions).
     * @param IdCardType The identity document type. Valid values: `HK` (identity card of Hong Kong (China)) (default), `ML` (Malaysian identity card), `IndonesiaIDCard` (Indonesian identity card), `PhilippinesVoteID` (Philippine voters ID card), `PhilippinesDrivingLicense` (Philippine driver's license), `PhilippinesTinID` (Philippine TIN ID card), `PhilippinesSSSID` (Philippine SSS ID card), and `MLIDPassport` (passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions).
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed). 
     * @return DisableChangeOcrResult Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed).
     */
    public Boolean getDisableChangeOcrResult() {
        return this.DisableChangeOcrResult;
    }

    /**
     * Set Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed).
     * @param DisableChangeOcrResult Whether to forbid the modification of the OCR result by users. Default value: `false` (modification allowed).
     */
    public void setDisableChangeOcrResult(Boolean DisableChangeOcrResult) {
        this.DisableChangeOcrResult = DisableChangeOcrResult;
    }

    /**
     * Get Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning. If `NeedVerifyIdCard` is set to `true`, this parameter must also be set to `true`. 
     * @return DisableCheckOcrWarnings Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning. If `NeedVerifyIdCard` is set to `true`, this parameter must also be set to `true`.
     */
    public Boolean getDisableCheckOcrWarnings() {
        return this.DisableCheckOcrWarnings;
    }

    /**
     * Set Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning. If `NeedVerifyIdCard` is set to `true`, this parameter must also be set to `true`.
     * @param DisableCheckOcrWarnings Whether to disable the OCR warnings. Default value: `false` (not disable), where OCR warnings are enabled and the OCR result will not be returned if there is a warning. If `NeedVerifyIdCard` is set to `true`, this parameter must also be set to `true`.
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
        if (source.NeedVerifyIdCard != null) {
            this.NeedVerifyIdCard = new Boolean(source.NeedVerifyIdCard);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
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
        this.setParamSimple(map, prefix + "NeedVerifyIdCard", this.NeedVerifyIdCard);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "DisableChangeOcrResult", this.DisableChangeOcrResult);
        this.setParamSimple(map, prefix + "DisableCheckOcrWarnings", this.DisableCheckOcrWarnings);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

