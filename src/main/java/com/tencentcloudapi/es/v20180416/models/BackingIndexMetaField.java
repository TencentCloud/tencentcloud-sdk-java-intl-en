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

public class BackingIndexMetaField extends AbstractModel {

    /**
    * <p>Backing index name</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>Backup index status</p>
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * <p>Backup index storage size</p>
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * <p>Backup index current lifecycle</p>
    */
    @SerializedName("IndexPhrase")
    @Expose
    private String IndexPhrase;

    /**
    * <p>Backup index creation time</p>
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
    * <p>Index Uuid</p>
    */
    @SerializedName("IndexUuid")
    @Expose
    private String IndexUuid;

    /**
     * Get <p>Backing index name</p> 
     * @return IndexName <p>Backing index name</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>Backing index name</p>
     * @param IndexName <p>Backing index name</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>Backup index status</p> 
     * @return IndexStatus <p>Backup index status</p>
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set <p>Backup index status</p>
     * @param IndexStatus <p>Backup index status</p>
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get <p>Backup index storage size</p> 
     * @return IndexStorage <p>Backup index storage size</p>
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set <p>Backup index storage size</p>
     * @param IndexStorage <p>Backup index storage size</p>
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get <p>Backup index current lifecycle</p> 
     * @return IndexPhrase <p>Backup index current lifecycle</p>
     */
    public String getIndexPhrase() {
        return this.IndexPhrase;
    }

    /**
     * Set <p>Backup index current lifecycle</p>
     * @param IndexPhrase <p>Backup index current lifecycle</p>
     */
    public void setIndexPhrase(String IndexPhrase) {
        this.IndexPhrase = IndexPhrase;
    }

    /**
     * Get <p>Backup index creation time</p> 
     * @return IndexCreateTime <p>Backup index creation time</p>
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set <p>Backup index creation time</p>
     * @param IndexCreateTime <p>Backup index creation time</p>
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
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

    public BackingIndexMetaField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackingIndexMetaField(BackingIndexMetaField source) {
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.IndexStatus != null) {
            this.IndexStatus = new String(source.IndexStatus);
        }
        if (source.IndexStorage != null) {
            this.IndexStorage = new Long(source.IndexStorage);
        }
        if (source.IndexPhrase != null) {
            this.IndexPhrase = new String(source.IndexPhrase);
        }
        if (source.IndexCreateTime != null) {
            this.IndexCreateTime = new String(source.IndexCreateTime);
        }
        if (source.IndexUuid != null) {
            this.IndexUuid = new String(source.IndexUuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);
        this.setParamSimple(map, prefix + "IndexStorage", this.IndexStorage);
        this.setParamSimple(map, prefix + "IndexPhrase", this.IndexPhrase);
        this.setParamSimple(map, prefix + "IndexCreateTime", this.IndexCreateTime);
        this.setParamSimple(map, prefix + "IndexUuid", this.IndexUuid);

    }
}

