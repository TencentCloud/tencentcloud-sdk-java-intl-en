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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySmsSignRequest extends AbstractModel {

    /**
    * ID of the signature to be modified.
    */
    @SerializedName("SignId")
    @Expose
    private Long SignId;

    /**
    * Signature name.
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * Signature type. Each of these types is followed by their `DocumentType` (identity certificate type) option:
0: company. Valid values of `DocumentType` include 0 and 1.
1: app. Valid values of `DocumentType` include 0, 1, 2, 3, and 4.
2: website. Valid values of `DocumentType` include 0, 1, 2, 3, and 5.
3: WeChat Official Account. Valid values of `DocumentType` include 0, 1, 2, 3, and 8.
4: trademark. Valid values of `DocumentType` include 7.
5: government/public institution/other. Valid values of `DocumentType` include 2 and 3.
6: WeChat Mini Program. Valid values of `DocumentType` include 0, 1, 2, 3, and 6.
Note: the identity certificate type must be selected according to the correspondence; otherwise, the review will fail.
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * Identity certificate type:
0: three-in-one.
1: business license.
2: organization code certificate.
3: social credit code certificate.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
8: screenshot of WeChat Official Account settings page (for personal WeChat Official Account).
    */
    @SerializedName("DocumentType")
    @Expose
    private Long DocumentType;

    /**
    * A parameter used to specify whether it is Global SMS:
`0`: Chinese mainland SMS.
`1`: Global SMS.
Note: the value of this parameter must be consistent with the `International` value of the signature to be modified. This parameter cannot be used to directly change a Chinese mainland signature to an international signature.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * Signature purpose:
0: for personal use.
1: for others.
    */
    @SerializedName("SignPurpose")
    @Expose
    private Long SignPurpose;

    /**
    * You should Base64-encode the image of the identity certificate corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
    */
    @SerializedName("ProofImage")
    @Expose
    private String ProofImage;

    /**
    * Power of attorney, which should be submitted if `SignPurpose` is for use by others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `SignPurpose` is 1 (for user by others).
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
     * Get ID of the signature to be modified. 
     * @return SignId ID of the signature to be modified.
     */
    public Long getSignId() {
        return this.SignId;
    }

    /**
     * Set ID of the signature to be modified.
     * @param SignId ID of the signature to be modified.
     */
    public void setSignId(Long SignId) {
        this.SignId = SignId;
    }

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
     * Get Signature type. Each of these types is followed by their `DocumentType` (identity certificate type) option:
0: company. Valid values of `DocumentType` include 0 and 1.
1: app. Valid values of `DocumentType` include 0, 1, 2, 3, and 4.
2: website. Valid values of `DocumentType` include 0, 1, 2, 3, and 5.
3: WeChat Official Account. Valid values of `DocumentType` include 0, 1, 2, 3, and 8.
4: trademark. Valid values of `DocumentType` include 7.
5: government/public institution/other. Valid values of `DocumentType` include 2 and 3.
6: WeChat Mini Program. Valid values of `DocumentType` include 0, 1, 2, 3, and 6.
Note: the identity certificate type must be selected according to the correspondence; otherwise, the review will fail. 
     * @return SignType Signature type. Each of these types is followed by their `DocumentType` (identity certificate type) option:
0: company. Valid values of `DocumentType` include 0 and 1.
1: app. Valid values of `DocumentType` include 0, 1, 2, 3, and 4.
2: website. Valid values of `DocumentType` include 0, 1, 2, 3, and 5.
3: WeChat Official Account. Valid values of `DocumentType` include 0, 1, 2, 3, and 8.
4: trademark. Valid values of `DocumentType` include 7.
5: government/public institution/other. Valid values of `DocumentType` include 2 and 3.
6: WeChat Mini Program. Valid values of `DocumentType` include 0, 1, 2, 3, and 6.
Note: the identity certificate type must be selected according to the correspondence; otherwise, the review will fail.
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set Signature type. Each of these types is followed by their `DocumentType` (identity certificate type) option:
0: company. Valid values of `DocumentType` include 0 and 1.
1: app. Valid values of `DocumentType` include 0, 1, 2, 3, and 4.
2: website. Valid values of `DocumentType` include 0, 1, 2, 3, and 5.
3: WeChat Official Account. Valid values of `DocumentType` include 0, 1, 2, 3, and 8.
4: trademark. Valid values of `DocumentType` include 7.
5: government/public institution/other. Valid values of `DocumentType` include 2 and 3.
6: WeChat Mini Program. Valid values of `DocumentType` include 0, 1, 2, 3, and 6.
Note: the identity certificate type must be selected according to the correspondence; otherwise, the review will fail.
     * @param SignType Signature type. Each of these types is followed by their `DocumentType` (identity certificate type) option:
0: company. Valid values of `DocumentType` include 0 and 1.
1: app. Valid values of `DocumentType` include 0, 1, 2, 3, and 4.
2: website. Valid values of `DocumentType` include 0, 1, 2, 3, and 5.
3: WeChat Official Account. Valid values of `DocumentType` include 0, 1, 2, 3, and 8.
4: trademark. Valid values of `DocumentType` include 7.
5: government/public institution/other. Valid values of `DocumentType` include 2 and 3.
6: WeChat Mini Program. Valid values of `DocumentType` include 0, 1, 2, 3, and 6.
Note: the identity certificate type must be selected according to the correspondence; otherwise, the review will fail.
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get Identity certificate type:
0: three-in-one.
1: business license.
2: organization code certificate.
3: social credit code certificate.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
8: screenshot of WeChat Official Account settings page (for personal WeChat Official Account). 
     * @return DocumentType Identity certificate type:
0: three-in-one.
1: business license.
2: organization code certificate.
3: social credit code certificate.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
8: screenshot of WeChat Official Account settings page (for personal WeChat Official Account).
     */
    public Long getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set Identity certificate type:
0: three-in-one.
1: business license.
2: organization code certificate.
3: social credit code certificate.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
8: screenshot of WeChat Official Account settings page (for personal WeChat Official Account).
     * @param DocumentType Identity certificate type:
0: three-in-one.
1: business license.
2: organization code certificate.
3: social credit code certificate.
4: screenshot of application backend management (for personal app).
5: screenshot of website ICP filing backend (for personal website).
6: screenshot of WeChat Mini Program settings page (for personal WeChat Mini Program).
7: trademark registration certificate.
8: screenshot of WeChat Official Account settings page (for personal WeChat Official Account).
     */
    public void setDocumentType(Long DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get A parameter used to specify whether it is Global SMS:
`0`: Chinese mainland SMS.
`1`: Global SMS.
Note: the value of this parameter must be consistent with the `International` value of the signature to be modified. This parameter cannot be used to directly change a Chinese mainland signature to an international signature. 
     * @return International A parameter used to specify whether it is Global SMS:
`0`: Chinese mainland SMS.
`1`: Global SMS.
Note: the value of this parameter must be consistent with the `International` value of the signature to be modified. This parameter cannot be used to directly change a Chinese mainland signature to an international signature.
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set A parameter used to specify whether it is Global SMS:
`0`: Chinese mainland SMS.
`1`: Global SMS.
Note: the value of this parameter must be consistent with the `International` value of the signature to be modified. This parameter cannot be used to directly change a Chinese mainland signature to an international signature.
     * @param International A parameter used to specify whether it is Global SMS:
`0`: Chinese mainland SMS.
`1`: Global SMS.
Note: the value of this parameter must be consistent with the `International` value of the signature to be modified. This parameter cannot be used to directly change a Chinese mainland signature to an international signature.
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get Signature purpose:
0: for personal use.
1: for others. 
     * @return SignPurpose Signature purpose:
0: for personal use.
1: for others.
     */
    public Long getSignPurpose() {
        return this.SignPurpose;
    }

    /**
     * Set Signature purpose:
0: for personal use.
1: for others.
     * @param SignPurpose Signature purpose:
0: for personal use.
1: for others.
     */
    public void setSignPurpose(Long SignPurpose) {
        this.SignPurpose = SignPurpose;
    }

    /**
     * Get You should Base64-encode the image of the identity certificate corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter. 
     * @return ProofImage You should Base64-encode the image of the identity certificate corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
     */
    public String getProofImage() {
        return this.ProofImage;
    }

    /**
     * Set You should Base64-encode the image of the identity certificate corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
     * @param ProofImage You should Base64-encode the image of the identity certificate corresponding to the signature first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
     */
    public void setProofImage(String ProofImage) {
        this.ProofImage = ProofImage;
    }

    /**
     * Get Power of attorney, which should be submitted if `SignPurpose` is for use by others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `SignPurpose` is 1 (for user by others). 
     * @return CommissionImage Power of attorney, which should be submitted if `SignPurpose` is for use by others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `SignPurpose` is 1 (for user by others).
     */
    public String getCommissionImage() {
        return this.CommissionImage;
    }

    /**
     * Set Power of attorney, which should be submitted if `SignPurpose` is for use by others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `SignPurpose` is 1 (for user by others).
     * @param CommissionImage Power of attorney, which should be submitted if `SignPurpose` is for use by others.
You should Base64-encode the image first, remove the prefix `data:image/jpeg;base64,` from the resulted string, and then use it as the value of this parameter.
Note: this field will take effect only when `SignPurpose` is 1 (for user by others).
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

    public ModifySmsSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySmsSignRequest(ModifySmsSignRequest source) {
        if (source.SignId != null) {
            this.SignId = new Long(source.SignId);
        }
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
        if (source.SignPurpose != null) {
            this.SignPurpose = new Long(source.SignPurpose);
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
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "SignPurpose", this.SignPurpose);
        this.setParamSimple(map, prefix + "ProofImage", this.ProofImage);
        this.setParamSimple(map, prefix + "CommissionImage", this.CommissionImage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

