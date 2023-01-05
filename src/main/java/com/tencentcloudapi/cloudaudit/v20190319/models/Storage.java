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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Storage extends AbstractModel{

    /**
    * Storage type (Valid values: cos, cls)
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Storage region
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Storage name. For COS, the storage name is the custom bucket name, which can contain up to 50 lowercase letters, digits, and hyphens. It cannot contain "-APPID" and cannot start or end with a hyphen. For CLS, the storage name is the log topic ID, which can contain 1-50 characters.
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * Storage directory prefix. The COS log file prefix can only contain 3-40 letters and digits.
    */
    @SerializedName("StoragePrefix")
    @Expose
    private String StoragePrefix;

    /**
     * Get Storage type (Valid values: cos, cls) 
     * @return StorageType Storage type (Valid values: cos, cls)
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type (Valid values: cos, cls)
     * @param StorageType Storage type (Valid values: cos, cls)
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Storage region 
     * @return StorageRegion Storage region
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Storage region
     * @param StorageRegion Storage region
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Storage name. For COS, the storage name is the custom bucket name, which can contain up to 50 lowercase letters, digits, and hyphens. It cannot contain "-APPID" and cannot start or end with a hyphen. For CLS, the storage name is the log topic ID, which can contain 1-50 characters. 
     * @return StorageName Storage name. For COS, the storage name is the custom bucket name, which can contain up to 50 lowercase letters, digits, and hyphens. It cannot contain "-APPID" and cannot start or end with a hyphen. For CLS, the storage name is the log topic ID, which can contain 1-50 characters.
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set Storage name. For COS, the storage name is the custom bucket name, which can contain up to 50 lowercase letters, digits, and hyphens. It cannot contain "-APPID" and cannot start or end with a hyphen. For CLS, the storage name is the log topic ID, which can contain 1-50 characters.
     * @param StorageName Storage name. For COS, the storage name is the custom bucket name, which can contain up to 50 lowercase letters, digits, and hyphens. It cannot contain "-APPID" and cannot start or end with a hyphen. For CLS, the storage name is the log topic ID, which can contain 1-50 characters.
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get Storage directory prefix. The COS log file prefix can only contain 3-40 letters and digits. 
     * @return StoragePrefix Storage directory prefix. The COS log file prefix can only contain 3-40 letters and digits.
     */
    public String getStoragePrefix() {
        return this.StoragePrefix;
    }

    /**
     * Set Storage directory prefix. The COS log file prefix can only contain 3-40 letters and digits.
     * @param StoragePrefix Storage directory prefix. The COS log file prefix can only contain 3-40 letters and digits.
     */
    public void setStoragePrefix(String StoragePrefix) {
        this.StoragePrefix = StoragePrefix;
    }

    public Storage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Storage(Storage source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.StoragePrefix != null) {
            this.StoragePrefix = new String(source.StoragePrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);
        this.setParamSimple(map, prefix + "StoragePrefix", this.StoragePrefix);

    }
}

