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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ESConfig extends AbstractModel {

    /**
    * <p>Whether storage method modification is supported</p>
    */
    @SerializedName("CanModify")
    @Expose
    private Boolean CanModify;

    /**
    * <p>ES password (encrypted)</p>
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
    * <p>ES cluster ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Storage type: 1=default storage, 2=custom storage<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>Default storage</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>Custom storage</td></tr></tbody></table></p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>ES userName</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get <p>Whether storage method modification is supported</p> 
     * @return CanModify <p>Whether storage method modification is supported</p>
     */
    public Boolean getCanModify() {
        return this.CanModify;
    }

    /**
     * Set <p>Whether storage method modification is supported</p>
     * @param CanModify <p>Whether storage method modification is supported</p>
     */
    public void setCanModify(Boolean CanModify) {
        this.CanModify = CanModify;
    }

    /**
     * Get <p>ES password (encrypted)</p> 
     * @return EncryptedPassword <p>ES password (encrypted)</p>
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set <p>ES password (encrypted)</p>
     * @param EncryptedPassword <p>ES password (encrypted)</p>
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    /**
     * Get <p>ES cluster ID</p> 
     * @return InstanceId <p>ES cluster ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ES cluster ID</p>
     * @param InstanceId <p>ES cluster ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Storage type: 1=default storage, 2=custom storage<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>Default storage</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>Custom storage</td></tr></tbody></table></p> 
     * @return StorageType <p>Storage type: 1=default storage, 2=custom storage<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>Default storage</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>Custom storage</td></tr></tbody></table></p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type: 1=default storage, 2=custom storage<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>Default storage</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>Custom storage</td></tr></tbody></table></p>
     * @param StorageType <p>Storage type: 1=default storage, 2=custom storage<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>Default storage</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>Custom storage</td></tr></tbody></table></p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>ES userName</p> 
     * @return UserName <p>ES userName</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>ES userName</p>
     * @param UserName <p>ES userName</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ESConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESConfig(ESConfig source) {
        if (source.CanModify != null) {
            this.CanModify = new Boolean(source.CanModify);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanModify", this.CanModify);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

