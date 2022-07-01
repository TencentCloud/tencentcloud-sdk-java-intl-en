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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnssecInfo extends AbstractModel{

    /**
    * Flag
    */
    @SerializedName("Flags")
    @Expose
    private Long Flags;

    /**
    * Encryption algorithm
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * Encryption type
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * Digest type
    */
    @SerializedName("DigestType")
    @Expose
    private String DigestType;

    /**
    * Digest algorithm
    */
    @SerializedName("DigestAlgorithm")
    @Expose
    private String DigestAlgorithm;

    /**
    * Digest message
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * DS record value
    */
    @SerializedName("DS")
    @Expose
    private String DS;

    /**
    * Key tag
    */
    @SerializedName("KeyTag")
    @Expose
    private Long KeyTag;

    /**
    * Public key
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get Flag 
     * @return Flags Flag
     */
    public Long getFlags() {
        return this.Flags;
    }

    /**
     * Set Flag
     * @param Flags Flag
     */
    public void setFlags(Long Flags) {
        this.Flags = Flags;
    }

    /**
     * Get Encryption algorithm 
     * @return Algorithm Encryption algorithm
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Encryption algorithm
     * @param Algorithm Encryption algorithm
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get Encryption type 
     * @return KeyType Encryption type
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set Encryption type
     * @param KeyType Encryption type
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get Digest type 
     * @return DigestType Digest type
     */
    public String getDigestType() {
        return this.DigestType;
    }

    /**
     * Set Digest type
     * @param DigestType Digest type
     */
    public void setDigestType(String DigestType) {
        this.DigestType = DigestType;
    }

    /**
     * Get Digest algorithm 
     * @return DigestAlgorithm Digest algorithm
     */
    public String getDigestAlgorithm() {
        return this.DigestAlgorithm;
    }

    /**
     * Set Digest algorithm
     * @param DigestAlgorithm Digest algorithm
     */
    public void setDigestAlgorithm(String DigestAlgorithm) {
        this.DigestAlgorithm = DigestAlgorithm;
    }

    /**
     * Get Digest message 
     * @return Digest Digest message
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set Digest message
     * @param Digest Digest message
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get DS record value 
     * @return DS DS record value
     */
    public String getDS() {
        return this.DS;
    }

    /**
     * Set DS record value
     * @param DS DS record value
     */
    public void setDS(String DS) {
        this.DS = DS;
    }

    /**
     * Get Key tag 
     * @return KeyTag Key tag
     */
    public Long getKeyTag() {
        return this.KeyTag;
    }

    /**
     * Set Key tag
     * @param KeyTag Key tag
     */
    public void setKeyTag(Long KeyTag) {
        this.KeyTag = KeyTag;
    }

    /**
     * Get Public key 
     * @return PublicKey Public key
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key
     * @param PublicKey Public key
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public DnssecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnssecInfo(DnssecInfo source) {
        if (source.Flags != null) {
            this.Flags = new Long(source.Flags);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.DigestType != null) {
            this.DigestType = new String(source.DigestType);
        }
        if (source.DigestAlgorithm != null) {
            this.DigestAlgorithm = new String(source.DigestAlgorithm);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.DS != null) {
            this.DS = new String(source.DS);
        }
        if (source.KeyTag != null) {
            this.KeyTag = new Long(source.KeyTag);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flags", this.Flags);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "DigestType", this.DigestType);
        this.setParamSimple(map, prefix + "DigestAlgorithm", this.DigestAlgorithm);
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "DS", this.DS);
        this.setParamSimple(map, prefix + "KeyTag", this.KeyTag);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

