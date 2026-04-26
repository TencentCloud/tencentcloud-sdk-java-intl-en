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

public class PhoneVerificationRequest extends AbstractModel {

    /**
    * Identity card number.
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Mobile number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Users with encryption requirements can import the CiphertextBlob of kms. Read the <a href="https://www.tencentcloud.com/document/product/1007/47180?from_cn_redirect=1">data encryption</a> document about encrypting data.
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * When using the encryption service, fill in the field to be encrypted.
-This API can fill in one or more of encrypted IdCard, Name, and Phone.
    */
    @SerializedName("EncryptList")
    @Expose
    private String [] EncryptList;

    /**
    * Users with encryption requirements import the initial vector for CBC encryption.
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
     * Get Identity card number. 
     * @return IdCard Identity card number.
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set Identity card number.
     * @param IdCard Identity card number.
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

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
     * Get Users with encryption requirements can import the CiphertextBlob of kms. Read the <a href="https://www.tencentcloud.com/document/product/1007/47180?from_cn_redirect=1">data encryption</a> document about encrypting data. 
     * @return CiphertextBlob Users with encryption requirements can import the CiphertextBlob of kms. Read the <a href="https://www.tencentcloud.com/document/product/1007/47180?from_cn_redirect=1">data encryption</a> document about encrypting data.
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set Users with encryption requirements can import the CiphertextBlob of kms. Read the <a href="https://www.tencentcloud.com/document/product/1007/47180?from_cn_redirect=1">data encryption</a> document about encrypting data.
     * @param CiphertextBlob Users with encryption requirements can import the CiphertextBlob of kms. Read the <a href="https://www.tencentcloud.com/document/product/1007/47180?from_cn_redirect=1">data encryption</a> document about encrypting data.
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get When using the encryption service, fill in the field to be encrypted.
-This API can fill in one or more of encrypted IdCard, Name, and Phone. 
     * @return EncryptList When using the encryption service, fill in the field to be encrypted.
-This API can fill in one or more of encrypted IdCard, Name, and Phone.
     */
    public String [] getEncryptList() {
        return this.EncryptList;
    }

    /**
     * Set When using the encryption service, fill in the field to be encrypted.
-This API can fill in one or more of encrypted IdCard, Name, and Phone.
     * @param EncryptList When using the encryption service, fill in the field to be encrypted.
-This API can fill in one or more of encrypted IdCard, Name, and Phone.
     */
    public void setEncryptList(String [] EncryptList) {
        this.EncryptList = EncryptList;
    }

    /**
     * Get Users with encryption requirements import the initial vector for CBC encryption. 
     * @return Iv Users with encryption requirements import the initial vector for CBC encryption.
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set Users with encryption requirements import the initial vector for CBC encryption.
     * @param Iv Users with encryption requirements import the initial vector for CBC encryption.
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    public PhoneVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneVerificationRequest(PhoneVerificationRequest source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.EncryptList != null) {
            this.EncryptList = new String[source.EncryptList.length];
            for (int i = 0; i < source.EncryptList.length; i++) {
                this.EncryptList[i] = new String(source.EncryptList[i]);
            }
        }
        if (source.Iv != null) {
            this.Iv = new String(source.Iv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamArraySimple(map, prefix + "EncryptList.", this.EncryptList);
        this.setParamSimple(map, prefix + "Iv", this.Iv);

    }
}

