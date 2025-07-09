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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSmsSignRequest extends AbstractModel {

    /**
    * Signature name.
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * Signature type. Each of these types is followed by their `DocumentType` (identity document type) option:
0: company (0, 1, 2, 3).
1: app (0, 1, 2, 3, 4).
2: website (0, 1, 2, 3, 5).
3: WeChat Official Account or WeChat Mini Program (0, 1, 2, 3, 6).
4: trademark (7).
5: governmental/public institution or others (2, 3).
Note: the identity document type must be selected according to the correspondence; otherwise, the review will fail.
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * Identity document type:
0: 3-in-1 license.
1: business license.
2: organization code certificate.
3: certificate of unified social credit code.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
    */
    @SerializedName("DocumentType")
    @Expose
    private Long DocumentType;

    /**
    * Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * Signature use:
0: for self-use.
1: for others.
    */
    @SerializedName("UsedMethod")
    @Expose
    private Long UsedMethod;

    /**
    * You should Base64-encode the image of the identity document corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
    */
    @SerializedName("ProofImage")
    @Expose
    private String ProofImage;

    /**
    * Authorization letter, which should be submitted if `UsedMethod` is for others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `UsedMethod` is 1 (for others).
    */
    @SerializedName("CommissionImage")
    @Expose
    private String CommissionImage;

    /**
    * Signature application remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Signature name. 
     * @return SignName Signature name.
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set Signature name.
     * @param SignName Signature name.
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get Signature type. Each of these types is followed by their `DocumentType` (identity document type) option:
0: company (0, 1, 2, 3).
1: app (0, 1, 2, 3, 4).
2: website (0, 1, 2, 3, 5).
3: WeChat Official Account or WeChat Mini Program (0, 1, 2, 3, 6).
4: trademark (7).
5: governmental/public institution or others (2, 3).
Note: the identity document type must be selected according to the correspondence; otherwise, the review will fail. 
     * @return SignType Signature type. Each of these types is followed by their `DocumentType` (identity document type) option:
0: company (0, 1, 2, 3).
1: app (0, 1, 2, 3, 4).
2: website (0, 1, 2, 3, 5).
3: WeChat Official Account or WeChat Mini Program (0, 1, 2, 3, 6).
4: trademark (7).
5: governmental/public institution or others (2, 3).
Note: the identity document type must be selected according to the correspondence; otherwise, the review will fail.
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set Signature type. Each of these types is followed by their `DocumentType` (identity document type) option:
0: company (0, 1, 2, 3).
1: app (0, 1, 2, 3, 4).
2: website (0, 1, 2, 3, 5).
3: WeChat Official Account or WeChat Mini Program (0, 1, 2, 3, 6).
4: trademark (7).
5: governmental/public institution or others (2, 3).
Note: the identity document type must be selected according to the correspondence; otherwise, the review will fail.
     * @param SignType Signature type. Each of these types is followed by their `DocumentType` (identity document type) option:
0: company (0, 1, 2, 3).
1: app (0, 1, 2, 3, 4).
2: website (0, 1, 2, 3, 5).
3: WeChat Official Account or WeChat Mini Program (0, 1, 2, 3, 6).
4: trademark (7).
5: governmental/public institution or others (2, 3).
Note: the identity document type must be selected according to the correspondence; otherwise, the review will fail.
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get Identity document type:
0: 3-in-1 license.
1: business license.
2: organization code certificate.
3: certificate of unified social credit code.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate. 
     * @return DocumentType Identity document type:
0: 3-in-1 license.
1: business license.
2: organization code certificate.
3: certificate of unified social credit code.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
     */
    public Long getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set Identity document type:
0: 3-in-1 license.
1: business license.
2: organization code certificate.
3: certificate of unified social credit code.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
     * @param DocumentType Identity document type:
0: 3-in-1 license.
1: business license.
2: organization code certificate.
3: certificate of unified social credit code.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
     */
    public void setDocumentType(Long DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS. 
     * @return International Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     * @param International Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get Signature use:
0: for self-use.
1: for others. 
     * @return UsedMethod Signature use:
0: for self-use.
1: for others.
     */
    public Long getUsedMethod() {
        return this.UsedMethod;
    }

    /**
     * Set Signature use:
0: for self-use.
1: for others.
     * @param UsedMethod Signature use:
0: for self-use.
1: for others.
     */
    public void setUsedMethod(Long UsedMethod) {
        this.UsedMethod = UsedMethod;
    }

    /**
     * Get You should Base64-encode the image of the identity document corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter. 
     * @return ProofImage You should Base64-encode the image of the identity document corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
     */
    public String getProofImage() {
        return this.ProofImage;
    }

    /**
     * Set You should Base64-encode the image of the identity document corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
     * @param ProofImage You should Base64-encode the image of the identity document corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
     */
    public void setProofImage(String ProofImage) {
        this.ProofImage = ProofImage;
    }

    /**
     * Get Authorization letter, which should be submitted if `UsedMethod` is for others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `UsedMethod` is 1 (for others). 
     * @return CommissionImage Authorization letter, which should be submitted if `UsedMethod` is for others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `UsedMethod` is 1 (for others).
     */
    public String getCommissionImage() {
        return this.CommissionImage;
    }

    /**
     * Set Authorization letter, which should be submitted if `UsedMethod` is for others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `UsedMethod` is 1 (for others).
     * @param CommissionImage Authorization letter, which should be submitted if `UsedMethod` is for others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `UsedMethod` is 1 (for others).
     */
    public void setCommissionImage(String CommissionImage) {
        this.CommissionImage = CommissionImage;
    }

    /**
     * Get Signature application remarks. 
     * @return Remark Signature application remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Signature application remarks.
     * @param Remark Signature application remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AddSmsSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSmsSignRequest(AddSmsSignRequest source) {
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.SignType != null) {
            this.SignType = new Long(source.SignType);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new Long(source.DocumentType);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.UsedMethod != null) {
            this.UsedMethod = new Long(source.UsedMethod);
        }
        if (source.ProofImage != null) {
            this.ProofImage = new String(source.ProofImage);
        }
        if (source.CommissionImage != null) {
            this.CommissionImage = new String(source.CommissionImage);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "UsedMethod", this.UsedMethod);
        this.setParamSimple(map, prefix + "ProofImage", this.ProofImage);
        this.setParamSimple(map, prefix + "CommissionImage", this.CommissionImage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

