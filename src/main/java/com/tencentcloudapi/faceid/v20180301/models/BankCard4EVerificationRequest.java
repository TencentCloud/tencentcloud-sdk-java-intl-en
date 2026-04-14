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

public class BankCard4EVerificationRequest extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Bank card.
    */
    @SerializedName("BankCard")
    @Expose
    private String BankCard;

    /**
    * Mobile number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * ID number for account opening.
-The document type must match the Type parameter, for example: input the ID card number for an identity card.
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * Document type.
-Please confirm this document is the document type used when opening an account. Document information not used for account opening is not supported for verification.
-Currently defaults to 0: ID card. Other document types are not currently supported.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number, mobile number, bank card number) can use this parameter. For details, please click the left-side link.
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Bank card. 
     * @return BankCard Bank card.
     */
    public String getBankCard() {
        return this.BankCard;
    }

    /**
     * Set Bank card.
     * @param BankCard Bank card.
     */
    public void setBankCard(String BankCard) {
        this.BankCard = BankCard;
    }

    /**
     * Get Mobile number. 
     * @return Phone Mobile number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Mobile number.
     * @param Phone Mobile number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get ID number for account opening.
-The document type must match the Type parameter, for example: input the ID card number for an identity card. 
     * @return IdCard ID number for account opening.
-The document type must match the Type parameter, for example: input the ID card number for an identity card.
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set ID number for account opening.
-The document type must match the Type parameter, for example: input the ID card number for an identity card.
     * @param IdCard ID number for account opening.
-The document type must match the Type parameter, for example: input the ID card number for an identity card.
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get Document type.
-Please confirm this document is the document type used when opening an account. Document information not used for account opening is not supported for verification.
-Currently defaults to 0: ID card. Other document types are not currently supported. 
     * @return CertType Document type.
-Please confirm this document is the document type used when opening an account. Document information not used for account opening is not supported for verification.
-Currently defaults to 0: ID card. Other document types are not currently supported.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Document type.
-Please confirm this document is the document type used when opening an account. Document information not used for account opening is not supported for verification.
-Currently defaults to 0: ID card. Other document types are not currently supported.
     * @param CertType Document type.
-Please confirm this document is the document type used when opening an account. Document information not used for account opening is not supported for verification.
-Currently defaults to 0: ID card. Other document types are not currently supported.
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number, mobile number, bank card number) can use this parameter. For details, please click the left-side link. 
     * @return Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number, mobile number, bank card number) can use this parameter. For details, please click the left-side link.
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number, mobile number, bank card number) can use this parameter. For details, please click the left-side link.
     * @param Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number, mobile number, bank card number) can use this parameter. For details, please click the left-side link.
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public BankCard4EVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BankCard4EVerificationRequest(BankCard4EVerificationRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BankCard != null) {
            this.BankCard = new String(source.BankCard);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BankCard", this.BankCard);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

