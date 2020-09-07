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
    * 
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * 
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * 
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Whether there is a device fingerprint bound to the current key
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceFingerprintBind")
    @Expose
    private Boolean DeviceFingerprintBind;

    /**
     * Get  
     * @return KeyId 
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 
     * @param KeyId 
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get  
     * @return Alias 
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 
     * @param Alias 
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get  
     * @return CreatorUin 
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 
     * @param CreatorUin 
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return OwnerUin 
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 
     * @param OwnerUin 
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get  
     * @return Algorithm 
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 
     * @param Algorithm 
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get  
     * @return EncryptKey 
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set 
     * @param EncryptKey 
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get  
     * @return DecryptKey 
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set 
     * @param DecryptKey 
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

    /**
     * Get  
     * @return ResourceId 
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 
     * @param ResourceId 
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Whether there is a device fingerprint bound to the current key
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeviceFingerprintBind Whether there is a device fingerprint bound to the current key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getDeviceFingerprintBind() {
        return this.DeviceFingerprintBind;
    }

    /**
     * Set Whether there is a device fingerprint bound to the current key
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeviceFingerprintBind Whether there is a device fingerprint bound to the current key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeviceFingerprintBind(Boolean DeviceFingerprintBind) {
        this.DeviceFingerprintBind = DeviceFingerprintBind;
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
        this.setParamSimple(map, prefix + "DeviceFingerprintBind", this.DeviceFingerprintBind);

    }
}

