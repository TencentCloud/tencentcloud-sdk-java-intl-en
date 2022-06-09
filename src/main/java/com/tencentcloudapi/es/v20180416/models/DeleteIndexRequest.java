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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIndexRequest extends AbstractModel{

    /**
    * ES cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Type of the index to delete. `auto`: Automated; `normal`: General.
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * Name of the index to delete
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * Username for cluster access
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Password for cluster access
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Backing index name
    */
    @SerializedName("BackingIndexName")
    @Expose
    private String BackingIndexName;

    /**
     * Get ES cluster ID 
     * @return InstanceId ES cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES cluster ID
     * @param InstanceId ES cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Type of the index to delete. `auto`: Automated; `normal`: General. 
     * @return IndexType Type of the index to delete. `auto`: Automated; `normal`: General.
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set Type of the index to delete. `auto`: Automated; `normal`: General.
     * @param IndexType Type of the index to delete. `auto`: Automated; `normal`: General.
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get Name of the index to delete 
     * @return IndexName Name of the index to delete
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Name of the index to delete
     * @param IndexName Name of the index to delete
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get Username for cluster access 
     * @return Username Username for cluster access
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username for cluster access
     * @param Username Username for cluster access
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Password for cluster access 
     * @return Password Password for cluster access
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password for cluster access
     * @param Password Password for cluster access
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Backing index name 
     * @return BackingIndexName Backing index name
     */
    public String getBackingIndexName() {
        return this.BackingIndexName;
    }

    /**
     * Set Backing index name
     * @param BackingIndexName Backing index name
     */
    public void setBackingIndexName(String BackingIndexName) {
        this.BackingIndexName = BackingIndexName;
    }

    public DeleteIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIndexRequest(DeleteIndexRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.BackingIndexName != null) {
            this.BackingIndexName = new String(source.BackingIndexName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "BackingIndexName", this.BackingIndexName);

    }
}

