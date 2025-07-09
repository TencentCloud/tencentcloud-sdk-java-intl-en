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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Proof extends AbstractModel {

    /**
    * The creation time.
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * The DID of the creator.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * The salt value.
    */
    @SerializedName("SaltJson")
    @Expose
    private String SaltJson;

    /**
    * The signature.
    */
    @SerializedName("SignatureValue")
    @Expose
    private String SignatureValue;

    /**
    * The type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get The creation time. 
     * @return Created The creation time.
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set The creation time.
     * @param Created The creation time.
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get The DID of the creator. 
     * @return Creator The DID of the creator.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set The DID of the creator.
     * @param Creator The DID of the creator.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get The salt value. 
     * @return SaltJson The salt value.
     */
    public String getSaltJson() {
        return this.SaltJson;
    }

    /**
     * Set The salt value.
     * @param SaltJson The salt value.
     */
    public void setSaltJson(String SaltJson) {
        this.SaltJson = SaltJson;
    }

    /**
     * Get The signature. 
     * @return SignatureValue The signature.
     */
    public String getSignatureValue() {
        return this.SignatureValue;
    }

    /**
     * Set The signature.
     * @param SignatureValue The signature.
     */
    public void setSignatureValue(String SignatureValue) {
        this.SignatureValue = SignatureValue;
    }

    /**
     * Get The type. 
     * @return Type The type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type.
     * @param Type The type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Proof() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Proof(Proof source) {
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.SaltJson != null) {
            this.SaltJson = new String(source.SaltJson);
        }
        if (source.SignatureValue != null) {
            this.SignatureValue = new String(source.SignatureValue);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "SaltJson", this.SaltJson);
        this.setParamSimple(map, prefix + "SignatureValue", this.SignatureValue);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

