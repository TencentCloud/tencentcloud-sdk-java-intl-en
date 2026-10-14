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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIndexRequest extends AbstractModel {

    /**
    * <p>ES cluster ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Deleted index type. auto: autonomous index; normal: general index</p>
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * <p>Name of the deleted index</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>Cluster access username.</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Cluster access password</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Backing index name</p>
    */
    @SerializedName("BackingIndexName")
    @Expose
    private String BackingIndexName;

    /**
    * <p>Index life cycle</p>
    */
    @SerializedName("IndexPhrase")
    @Expose
    private String IndexPhrase;

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
     * Get <p>Deleted index type. auto: autonomous index; normal: general index</p> 
     * @return IndexType <p>Deleted index type. auto: autonomous index; normal: general index</p>
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set <p>Deleted index type. auto: autonomous index; normal: general index</p>
     * @param IndexType <p>Deleted index type. auto: autonomous index; normal: general index</p>
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get <p>Name of the deleted index</p> 
     * @return IndexName <p>Name of the deleted index</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>Name of the deleted index</p>
     * @param IndexName <p>Name of the deleted index</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>Cluster access username.</p> 
     * @return Username <p>Cluster access username.</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Cluster access username.</p>
     * @param Username <p>Cluster access username.</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Cluster access password</p> 
     * @return Password <p>Cluster access password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Cluster access password</p>
     * @param Password <p>Cluster access password</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Backing index name</p> 
     * @return BackingIndexName <p>Backing index name</p>
     */
    public String getBackingIndexName() {
        return this.BackingIndexName;
    }

    /**
     * Set <p>Backing index name</p>
     * @param BackingIndexName <p>Backing index name</p>
     */
    public void setBackingIndexName(String BackingIndexName) {
        this.BackingIndexName = BackingIndexName;
    }

    /**
     * Get <p>Index life cycle</p> 
     * @return IndexPhrase <p>Index life cycle</p>
     */
    public String getIndexPhrase() {
        return this.IndexPhrase;
    }

    /**
     * Set <p>Index life cycle</p>
     * @param IndexPhrase <p>Index life cycle</p>
     */
    public void setIndexPhrase(String IndexPhrase) {
        this.IndexPhrase = IndexPhrase;
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
        if (source.IndexPhrase != null) {
            this.IndexPhrase = new String(source.IndexPhrase);
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
        this.setParamSimple(map, prefix + "IndexPhrase", this.IndexPhrase);

    }
}

