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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyPair extends AbstractModel {

    /**
    * Key pair ID, which is the unique identifier of a key pair.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key pair name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * Project ID of the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Key pair description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Public key (in plain text) of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Private key (in plaintext) of a key pair. Tencent Cloud do not store private keys. Therefore, keep them secure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * List of IDs of the instances associated with the key.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociatedInstanceIds")
    @Expose
    private String [] AssociatedInstanceIds;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Key pair ID, which is the unique identifier of a key pair.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyId Key pair ID, which is the unique identifier of a key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key pair ID, which is the unique identifier of a key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyId Key pair ID, which is the unique identifier of a key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key pair name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyName Key pair name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set Key pair name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyName Key pair name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get Project ID of the key pair.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID of the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID of the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Key pair description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Key pair description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Key pair description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Key pair description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Public key (in plain text) of key pair.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicKey Public key (in plain text) of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key (in plain text) of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicKey Public key (in plain text) of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Private key (in plaintext) of a key pair. Tencent Cloud do not store private keys. Therefore, keep them secure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateKey Private key (in plaintext) of a key pair. Tencent Cloud do not store private keys. Therefore, keep them secure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Private key (in plaintext) of a key pair. Tencent Cloud do not store private keys. Therefore, keep them secure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateKey Private key (in plaintext) of a key pair. Tencent Cloud do not store private keys. Therefore, keep them secure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get List of IDs of the instances associated with the key.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AssociatedInstanceIds List of IDs of the instances associated with the key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAssociatedInstanceIds() {
        return this.AssociatedInstanceIds;
    }

    /**
     * Set List of IDs of the instances associated with the key.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AssociatedInstanceIds List of IDs of the instances associated with the key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociatedInstanceIds(String [] AssociatedInstanceIds) {
        this.AssociatedInstanceIds = AssociatedInstanceIds;
    }

    /**
     * Get Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public KeyPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyPair(KeyPair source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.AssociatedInstanceIds != null) {
            this.AssociatedInstanceIds = new String[source.AssociatedInstanceIds.length];
            for (int i = 0; i < source.AssociatedInstanceIds.length; i++) {
                this.AssociatedInstanceIds[i] = new String(source.AssociatedInstanceIds[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIds.", this.AssociatedInstanceIds);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

