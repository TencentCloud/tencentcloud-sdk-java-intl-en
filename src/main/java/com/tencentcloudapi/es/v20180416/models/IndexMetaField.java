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

public class IndexMetaField extends AbstractModel {

    /**
    * Index type
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * Index name
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * JSON-formatted index metadata
    */
    @SerializedName("IndexMetaJson")
    @Expose
    private String IndexMetaJson;

    /**
    * Index status
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * Index storage size in bytes
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * Index creation time
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
    * Backup index
    */
    @SerializedName("BackingIndices")
    @Expose
    private BackingIndexMetaField [] BackingIndices;

    /**
    * Cluster ID of the index
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name of the index
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Version number of the cluster to which the index belongs
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Index lifecycle field
    */
    @SerializedName("IndexPolicyField")
    @Expose
    private IndexPolicyField IndexPolicyField;

    /**
    * Index autonomous field
    */
    @SerializedName("IndexOptionsField")
    @Expose
    private IndexOptionsField IndexOptionsField;

    /**
    * Index configuration field
    */
    @SerializedName("IndexSettingsField")
    @Expose
    private IndexSettingsField IndexSettingsField;

    /**
    * Index alias field
    */
    @SerializedName("IndexAliasesField")
    @Expose
    private String [] IndexAliasesField;

    /**
    * APP ID of the cluster to which the index belongs
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Number of indexed documents
    */
    @SerializedName("IndexDocs")
    @Expose
    private Long IndexDocs;

    /**
     * Get Index type 
     * @return IndexType Index type
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set Index type
     * @param IndexType Index type
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get Index name 
     * @return IndexName Index name
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Index name
     * @param IndexName Index name
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get JSON-formatted index metadata 
     * @return IndexMetaJson JSON-formatted index metadata
     */
    public String getIndexMetaJson() {
        return this.IndexMetaJson;
    }

    /**
     * Set JSON-formatted index metadata
     * @param IndexMetaJson JSON-formatted index metadata
     */
    public void setIndexMetaJson(String IndexMetaJson) {
        this.IndexMetaJson = IndexMetaJson;
    }

    /**
     * Get Index status 
     * @return IndexStatus Index status
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set Index status
     * @param IndexStatus Index status
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get Index storage size in bytes 
     * @return IndexStorage Index storage size in bytes
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set Index storage size in bytes
     * @param IndexStorage Index storage size in bytes
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get Index creation time 
     * @return IndexCreateTime Index creation time
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set Index creation time
     * @param IndexCreateTime Index creation time
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
    }

    /**
     * Get Backup index 
     * @return BackingIndices Backup index
     */
    public BackingIndexMetaField [] getBackingIndices() {
        return this.BackingIndices;
    }

    /**
     * Set Backup index
     * @param BackingIndices Backup index
     */
    public void setBackingIndices(BackingIndexMetaField [] BackingIndices) {
        this.BackingIndices = BackingIndices;
    }

    /**
     * Get Cluster ID of the index 
     * @return ClusterId Cluster ID of the index
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID of the index
     * @param ClusterId Cluster ID of the index
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name of the index 
     * @return ClusterName Cluster name of the index
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name of the index
     * @param ClusterName Cluster name of the index
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Version number of the cluster to which the index belongs 
     * @return ClusterVersion Version number of the cluster to which the index belongs
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Version number of the cluster to which the index belongs
     * @param ClusterVersion Version number of the cluster to which the index belongs
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Index lifecycle field 
     * @return IndexPolicyField Index lifecycle field
     */
    public IndexPolicyField getIndexPolicyField() {
        return this.IndexPolicyField;
    }

    /**
     * Set Index lifecycle field
     * @param IndexPolicyField Index lifecycle field
     */
    public void setIndexPolicyField(IndexPolicyField IndexPolicyField) {
        this.IndexPolicyField = IndexPolicyField;
    }

    /**
     * Get Index autonomous field 
     * @return IndexOptionsField Index autonomous field
     */
    public IndexOptionsField getIndexOptionsField() {
        return this.IndexOptionsField;
    }

    /**
     * Set Index autonomous field
     * @param IndexOptionsField Index autonomous field
     */
    public void setIndexOptionsField(IndexOptionsField IndexOptionsField) {
        this.IndexOptionsField = IndexOptionsField;
    }

    /**
     * Get Index configuration field 
     * @return IndexSettingsField Index configuration field
     */
    public IndexSettingsField getIndexSettingsField() {
        return this.IndexSettingsField;
    }

    /**
     * Set Index configuration field
     * @param IndexSettingsField Index configuration field
     */
    public void setIndexSettingsField(IndexSettingsField IndexSettingsField) {
        this.IndexSettingsField = IndexSettingsField;
    }

    /**
     * Get Index alias field 
     * @return IndexAliasesField Index alias field
     */
    public String [] getIndexAliasesField() {
        return this.IndexAliasesField;
    }

    /**
     * Set Index alias field
     * @param IndexAliasesField Index alias field
     */
    public void setIndexAliasesField(String [] IndexAliasesField) {
        this.IndexAliasesField = IndexAliasesField;
    }

    /**
     * Get APP ID of the cluster to which the index belongs 
     * @return AppId APP ID of the cluster to which the index belongs
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID of the cluster to which the index belongs
     * @param AppId APP ID of the cluster to which the index belongs
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Number of indexed documents 
     * @return IndexDocs Number of indexed documents
     */
    public Long getIndexDocs() {
        return this.IndexDocs;
    }

    /**
     * Set Number of indexed documents
     * @param IndexDocs Number of indexed documents
     */
    public void setIndexDocs(Long IndexDocs) {
        this.IndexDocs = IndexDocs;
    }

    public IndexMetaField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexMetaField(IndexMetaField source) {
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.IndexMetaJson != null) {
            this.IndexMetaJson = new String(source.IndexMetaJson);
        }
        if (source.IndexStatus != null) {
            this.IndexStatus = new String(source.IndexStatus);
        }
        if (source.IndexStorage != null) {
            this.IndexStorage = new Long(source.IndexStorage);
        }
        if (source.IndexCreateTime != null) {
            this.IndexCreateTime = new String(source.IndexCreateTime);
        }
        if (source.BackingIndices != null) {
            this.BackingIndices = new BackingIndexMetaField[source.BackingIndices.length];
            for (int i = 0; i < source.BackingIndices.length; i++) {
                this.BackingIndices[i] = new BackingIndexMetaField(source.BackingIndices[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.IndexPolicyField != null) {
            this.IndexPolicyField = new IndexPolicyField(source.IndexPolicyField);
        }
        if (source.IndexOptionsField != null) {
            this.IndexOptionsField = new IndexOptionsField(source.IndexOptionsField);
        }
        if (source.IndexSettingsField != null) {
            this.IndexSettingsField = new IndexSettingsField(source.IndexSettingsField);
        }
        if (source.IndexAliasesField != null) {
            this.IndexAliasesField = new String[source.IndexAliasesField.length];
            for (int i = 0; i < source.IndexAliasesField.length; i++) {
                this.IndexAliasesField[i] = new String(source.IndexAliasesField[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.IndexDocs != null) {
            this.IndexDocs = new Long(source.IndexDocs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "IndexMetaJson", this.IndexMetaJson);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);
        this.setParamSimple(map, prefix + "IndexStorage", this.IndexStorage);
        this.setParamSimple(map, prefix + "IndexCreateTime", this.IndexCreateTime);
        this.setParamArrayObj(map, prefix + "BackingIndices.", this.BackingIndices);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamObj(map, prefix + "IndexPolicyField.", this.IndexPolicyField);
        this.setParamObj(map, prefix + "IndexOptionsField.", this.IndexOptionsField);
        this.setParamObj(map, prefix + "IndexSettingsField.", this.IndexSettingsField);
        this.setParamArraySimple(map, prefix + "IndexAliasesField.", this.IndexAliasesField);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IndexDocs", this.IndexDocs);

    }
}

