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
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * Index name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * Index status
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * Index size (in byte)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * Index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
    * Backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("BackingIndices")
    @Expose
    private BackingIndexMetaField [] BackingIndices;

    /**
    * Cluster ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster version
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Index lifecycle policy field
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexPolicyField")
    @Expose
    private IndexPolicyField IndexPolicyField;

    /**
    * Index automation field
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexOptionsField")
    @Expose
    private IndexOptionsField IndexOptionsField;

    /**
    * Index setting field
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexSettingsField")
    @Expose
    private IndexSettingsField IndexSettingsField;

    /**
    * Cluster APP ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * The number of index docs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexDocs")
    @Expose
    private Long IndexDocs;

    /**
     * Get Index type
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexType Index type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set Index type
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexType Index type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get Index name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexName Index name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Index name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexName Index name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get Index status
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexStatus Index status
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set Index status
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexStatus Index status
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get Index size (in byte)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexStorage Index size (in byte)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set Index size (in byte)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexStorage Index size (in byte)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get Index creation time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexCreateTime Index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set Index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexCreateTime Index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
    }

    /**
     * Get Backing index
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return BackingIndices Backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public BackingIndexMetaField [] getBackingIndices() {
        return this.BackingIndices;
    }

    /**
     * Set Backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param BackingIndices Backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBackingIndices(BackingIndexMetaField [] BackingIndices) {
        this.BackingIndices = BackingIndices;
    }

    /**
     * Get Cluster ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClusterId Cluster ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClusterId Cluster ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClusterName Cluster name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClusterName Cluster name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster version
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClusterVersion Cluster version
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Cluster version
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClusterVersion Cluster version
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Index lifecycle policy field
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexPolicyField Index lifecycle policy field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IndexPolicyField getIndexPolicyField() {
        return this.IndexPolicyField;
    }

    /**
     * Set Index lifecycle policy field
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexPolicyField Index lifecycle policy field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexPolicyField(IndexPolicyField IndexPolicyField) {
        this.IndexPolicyField = IndexPolicyField;
    }

    /**
     * Get Index automation field
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexOptionsField Index automation field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IndexOptionsField getIndexOptionsField() {
        return this.IndexOptionsField;
    }

    /**
     * Set Index automation field
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexOptionsField Index automation field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexOptionsField(IndexOptionsField IndexOptionsField) {
        this.IndexOptionsField = IndexOptionsField;
    }

    /**
     * Get Index setting field
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexSettingsField Index setting field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IndexSettingsField getIndexSettingsField() {
        return this.IndexSettingsField;
    }

    /**
     * Set Index setting field
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexSettingsField Index setting field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexSettingsField(IndexSettingsField IndexSettingsField) {
        this.IndexSettingsField = IndexSettingsField;
    }

    /**
     * Get Cluster APP ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AppId Cluster APP ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Cluster APP ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AppId Cluster APP ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get The number of index docs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndexDocs The number of index docs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIndexDocs() {
        return this.IndexDocs;
    }

    /**
     * Set The number of index docs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndexDocs The number of index docs.
Note: This field may return null, indicating that no valid values can be obtained.
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IndexDocs", this.IndexDocs);

    }
}

