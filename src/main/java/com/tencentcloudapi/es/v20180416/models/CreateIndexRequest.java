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

public class CreateIndexRequest extends AbstractModel {

    /**
    * ES cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Index type of the created index. auto: autonomous index; normal: general index
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * Index name of the created index
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * [Required] JSON-formatted index metadata created, such as mappings and settings
    */
    @SerializedName("IndexMetaJson")
    @Expose
    private String IndexMetaJson;

    /**
    * Cluster access username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Cluster access password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * Get Index type of the created index. auto: autonomous index; normal: general index 
     * @return IndexType Index type of the created index. auto: autonomous index; normal: general index
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set Index type of the created index. auto: autonomous index; normal: general index
     * @param IndexType Index type of the created index. auto: autonomous index; normal: general index
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get Index name of the created index 
     * @return IndexName Index name of the created index
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Index name of the created index
     * @param IndexName Index name of the created index
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get [Required] JSON-formatted index metadata created, such as mappings and settings 
     * @return IndexMetaJson [Required] JSON-formatted index metadata created, such as mappings and settings
     */
    public String getIndexMetaJson() {
        return this.IndexMetaJson;
    }

    /**
     * Set [Required] JSON-formatted index metadata created, such as mappings and settings
     * @param IndexMetaJson [Required] JSON-formatted index metadata created, such as mappings and settings
     */
    public void setIndexMetaJson(String IndexMetaJson) {
        this.IndexMetaJson = IndexMetaJson;
    }

    /**
     * Get Cluster access username. 
     * @return Username Cluster access username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Cluster access username.
     * @param Username Cluster access username.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Cluster access password 
     * @return Password Cluster access password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Cluster access password
     * @param Password Cluster access password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public CreateIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIndexRequest(CreateIndexRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.IndexMetaJson != null) {
            this.IndexMetaJson = new String(source.IndexMetaJson);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "IndexMetaJson", this.IndexMetaJson);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

