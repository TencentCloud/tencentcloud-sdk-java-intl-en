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

public class CheckIdNameDateRequest extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Identity card number.
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * ID card validity start time.
-Format: YYYYMMDD, for example: 20210701.
    */
    @SerializedName("ValidityBegin")
    @Expose
    private String ValidityBegin;

    /**
    * ID card expiration time.
Format: YYYYMMDD, use "00000000" for long-term, for example: 20210701.
    */
    @SerializedName("ValidityEnd")
    @Expose
    private String ValidityEnd;

    /**
    * Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
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
     * Get ID card validity start time.
-Format: YYYYMMDD, for example: 20210701. 
     * @return ValidityBegin ID card validity start time.
-Format: YYYYMMDD, for example: 20210701.
     */
    public String getValidityBegin() {
        return this.ValidityBegin;
    }

    /**
     * Set ID card validity start time.
-Format: YYYYMMDD, for example: 20210701.
     * @param ValidityBegin ID card validity start time.
-Format: YYYYMMDD, for example: 20210701.
     */
    public void setValidityBegin(String ValidityBegin) {
        this.ValidityBegin = ValidityBegin;
    }

    /**
     * Get ID card expiration time.
Format: YYYYMMDD, use "00000000" for long-term, for example: 20210701. 
     * @return ValidityEnd ID card expiration time.
Format: YYYYMMDD, use "00000000" for long-term, for example: 20210701.
     */
    public String getValidityEnd() {
        return this.ValidityEnd;
    }

    /**
     * Set ID card expiration time.
Format: YYYYMMDD, use "00000000" for long-term, for example: 20210701.
     * @param ValidityEnd ID card expiration time.
Format: YYYYMMDD, use "00000000" for long-term, for example: 20210701.
     */
    public void setValidityEnd(String ValidityEnd) {
        this.ValidityEnd = ValidityEnd;
    }

    /**
     * Get Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link. 
     * @return Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
     * @param Encryption Sensitive data encryption info.
-Users with encryption requirements for incoming information (name, identity card number) can use this parameter. For details, please click the left-side link.
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public CheckIdNameDateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIdNameDateRequest(CheckIdNameDateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.ValidityBegin != null) {
            this.ValidityBegin = new String(source.ValidityBegin);
        }
        if (source.ValidityEnd != null) {
            this.ValidityEnd = new String(source.ValidityEnd);
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
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "ValidityBegin", this.ValidityBegin);
        this.setParamSimple(map, prefix + "ValidityEnd", this.ValidityEnd);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

