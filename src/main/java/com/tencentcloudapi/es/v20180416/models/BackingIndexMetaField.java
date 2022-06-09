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

public class BackingIndexMetaField extends AbstractModel{

    /**
    * Backing index name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * Backing index status
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * Backing index size
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * Current lifecycle phase of backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexPhrase")
    @Expose
    private String IndexPhrase;

    /**
    * Backing index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
     * Get Backing index name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexName Backing index name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Backing index name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexName Backing index name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get Backing index status
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexStatus Backing index status
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set Backing index status
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexStatus Backing index status
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get Backing index size
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexStorage Backing index size
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set Backing index size
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexStorage Backing index size
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get Current lifecycle phase of backing index
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexPhrase Current lifecycle phase of backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexPhrase() {
        return this.IndexPhrase;
    }

    /**
     * Set Current lifecycle phase of backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexPhrase Current lifecycle phase of backing index
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexPhrase(String IndexPhrase) {
        this.IndexPhrase = IndexPhrase;
    }

    /**
     * Get Backing index creation time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IndexCreateTime Backing index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set Backing index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IndexCreateTime Backing index creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
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

    }
}

