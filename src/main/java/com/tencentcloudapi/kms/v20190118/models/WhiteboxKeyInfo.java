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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteboxKeyInfo extends AbstractModel{

    /**
    * Globally unique white-box key ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Unique alias that makes a key more recognizable and understandable. This parameter should be 1 to 60 letters, digits, `-`, and `_`; it must begin with a letter or digit and cannot be left empty.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Creator
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * Key description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Key creation time in Unix timestamp
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * White-box key status. Valid values: Enabled, Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creator
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Key algorithm type
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * Base64-encoded white-box encryption key
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * Base64-encoded white-box decryption key
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get Globally unique white-box key ID 
     * @return KeyId Globally unique white-box key ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique white-box key ID
     * @param KeyId Globally unique white-box key ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Unique alias that makes a key more recognizable and understandable. This parameter should be 1 to 60 letters, digits, `-`, and `_`; it must begin with a letter or digit and cannot be left empty. 
     * @return Alias Unique alias that makes a key more recognizable and understandable. This parameter should be 1 to 60 letters, digits, `-`, and `_`; it must begin with a letter or digit and cannot be left empty.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Unique alias that makes a key more recognizable and understandable. This parameter should be 1 to 60 letters, digits, `-`, and `_`; it must begin with a letter or digit and cannot be left empty.
     * @param Alias Unique alias that makes a key more recognizable and understandable. This parameter should be 1 to 60 letters, digits, `-`, and `_`; it must begin with a letter or digit and cannot be left empty.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Creator 
     * @return CreatorUin Creator
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator
     * @param CreatorUin Creator
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Key description information 
     * @return Description Key description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Key description information
     * @param Description Key description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Key creation time in Unix timestamp 
     * @return CreateTime Key creation time in Unix timestamp
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Key creation time in Unix timestamp
     * @param CreateTime Key creation time in Unix timestamp
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get White-box key status. Valid values: Enabled, Disabled 
     * @return Status White-box key status. Valid values: Enabled, Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set White-box key status. Valid values: Enabled, Disabled
     * @param Status White-box key status. Valid values: Enabled, Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creator 
     * @return OwnerUin Creator
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Creator
     * @param OwnerUin Creator
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Key algorithm type 
     * @return Algorithm Key algorithm type
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Key algorithm type
     * @param Algorithm Key algorithm type
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get Base64-encoded white-box encryption key 
     * @return EncryptKey Base64-encoded white-box encryption key
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set Base64-encoded white-box encryption key
     * @param EncryptKey Base64-encoded white-box encryption key
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get Base64-encoded white-box decryption key 
     * @return DecryptKey Base64-encoded white-box decryption key
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set Base64-encoded white-box decryption key
     * @param DecryptKey Base64-encoded white-box decryption key
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

    /**
     * Get Resource ID in the format of `creatorUin/$creatorUin/$keyId`. 
     * @return ResourceId Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     * @param ResourceId Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "DecryptKey", this.DecryptKey);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

