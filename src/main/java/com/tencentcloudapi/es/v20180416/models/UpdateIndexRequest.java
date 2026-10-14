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

public class UpdateIndexRequest extends AbstractModel {

    /**
    * <p>ES cluster ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Updated index type. auto: autonomous index; normal: general index</p>
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * <p>Updated index name</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>Updated JSON-formatted index metadata, such as mappings and settings</p>
    */
    @SerializedName("UpdateMetaJson")
    @Expose
    private String UpdateMetaJson;

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
    * <p>Whether to scroll the backup index</p>
    */
    @SerializedName("RolloverBackingIndex")
    @Expose
    private Boolean RolloverBackingIndex;

    /**
    * <p>Whether to retrieve the full uninstall index</p>
    */
    @SerializedName("MountIndex")
    @Expose
    private Boolean MountIndex;

    /**
    * <p>Index Uuid</p>
    */
    @SerializedName("IndexUuid")
    @Expose
    private String IndexUuid;

    /**
    * <p>Backing index name</p>
    */
    @SerializedName("BackingIndexName")
    @Expose
    private String BackingIndexName;

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
     * Get <p>Updated index type. auto: autonomous index; normal: general index</p> 
     * @return IndexType <p>Updated index type. auto: autonomous index; normal: general index</p>
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set <p>Updated index type. auto: autonomous index; normal: general index</p>
     * @param IndexType <p>Updated index type. auto: autonomous index; normal: general index</p>
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get <p>Updated index name</p> 
     * @return IndexName <p>Updated index name</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>Updated index name</p>
     * @param IndexName <p>Updated index name</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>Updated JSON-formatted index metadata, such as mappings and settings</p> 
     * @return UpdateMetaJson <p>Updated JSON-formatted index metadata, such as mappings and settings</p>
     */
    public String getUpdateMetaJson() {
        return this.UpdateMetaJson;
    }

    /**
     * Set <p>Updated JSON-formatted index metadata, such as mappings and settings</p>
     * @param UpdateMetaJson <p>Updated JSON-formatted index metadata, such as mappings and settings</p>
     */
    public void setUpdateMetaJson(String UpdateMetaJson) {
        this.UpdateMetaJson = UpdateMetaJson;
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
     * Get <p>Whether to scroll the backup index</p> 
     * @return RolloverBackingIndex <p>Whether to scroll the backup index</p>
     */
    public Boolean getRolloverBackingIndex() {
        return this.RolloverBackingIndex;
    }

    /**
     * Set <p>Whether to scroll the backup index</p>
     * @param RolloverBackingIndex <p>Whether to scroll the backup index</p>
     */
    public void setRolloverBackingIndex(Boolean RolloverBackingIndex) {
        this.RolloverBackingIndex = RolloverBackingIndex;
    }

    /**
     * Get <p>Whether to retrieve the full uninstall index</p> 
     * @return MountIndex <p>Whether to retrieve the full uninstall index</p>
     */
    public Boolean getMountIndex() {
        return this.MountIndex;
    }

    /**
     * Set <p>Whether to retrieve the full uninstall index</p>
     * @param MountIndex <p>Whether to retrieve the full uninstall index</p>
     */
    public void setMountIndex(Boolean MountIndex) {
        this.MountIndex = MountIndex;
    }

    /**
     * Get <p>Index Uuid</p> 
     * @return IndexUuid <p>Index Uuid</p>
     */
    public String getIndexUuid() {
        return this.IndexUuid;
    }

    /**
     * Set <p>Index Uuid</p>
     * @param IndexUuid <p>Index Uuid</p>
     */
    public void setIndexUuid(String IndexUuid) {
        this.IndexUuid = IndexUuid;
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

    public UpdateIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateIndexRequest(UpdateIndexRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.UpdateMetaJson != null) {
            this.UpdateMetaJson = new String(source.UpdateMetaJson);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.RolloverBackingIndex != null) {
            this.RolloverBackingIndex = new Boolean(source.RolloverBackingIndex);
        }
        if (source.MountIndex != null) {
            this.MountIndex = new Boolean(source.MountIndex);
        }
        if (source.IndexUuid != null) {
            this.IndexUuid = new String(source.IndexUuid);
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
        this.setParamSimple(map, prefix + "UpdateMetaJson", this.UpdateMetaJson);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "RolloverBackingIndex", this.RolloverBackingIndex);
        this.setParamSimple(map, prefix + "MountIndex", this.MountIndex);
        this.setParamSimple(map, prefix + "IndexUuid", this.IndexUuid);
        this.setParamSimple(map, prefix + "BackingIndexName", this.BackingIndexName);

    }
}

