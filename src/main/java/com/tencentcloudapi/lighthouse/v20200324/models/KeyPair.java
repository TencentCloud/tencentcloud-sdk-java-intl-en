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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyPair extends AbstractModel{

    /**
    * Key pair ID, which is the unique identifier of a key pair.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key pair name.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * Public key (in plain text) of key pair.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * List of IDs of instances associated with the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociatedInstanceIds")
    @Expose
    private String [] AssociatedInstanceIds;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Private key of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
     * Get Key pair ID, which is the unique identifier of a key pair. 
     * @return KeyId Key pair ID, which is the unique identifier of a key pair.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key pair ID, which is the unique identifier of a key pair.
     * @param KeyId Key pair ID, which is the unique identifier of a key pair.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key pair name. 
     * @return KeyName Key pair name.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set Key pair name.
     * @param KeyName Key pair name.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get Public key (in plain text) of key pair. 
     * @return PublicKey Public key (in plain text) of key pair.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key (in plain text) of key pair.
     * @param PublicKey Public key (in plain text) of key pair.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get List of IDs of instances associated with the key pair.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AssociatedInstanceIds List of IDs of instances associated with the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAssociatedInstanceIds() {
        return this.AssociatedInstanceIds;
    }

    /**
     * Set List of IDs of instances associated with the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AssociatedInstanceIds List of IDs of instances associated with the key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociatedInstanceIds(String [] AssociatedInstanceIds) {
        this.AssociatedInstanceIds = AssociatedInstanceIds;
    }

    /**
     * Get Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Private key of key pair.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateKey Private key of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Private key of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateKey Private key of key pair.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
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
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
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
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIds.", this.AssociatedInstanceIds);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);

    }
}

