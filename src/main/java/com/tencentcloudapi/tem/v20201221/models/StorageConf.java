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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageConf extends AbstractModel{

    /**
    * Storage volume name
    */
    @SerializedName("StorageVolName")
    @Expose
    private String StorageVolName;

    /**
    * Storage volume path
    */
    @SerializedName("StorageVolPath")
    @Expose
    private String StorageVolPath;

    /**
    * Storage volume IP
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageVolIp")
    @Expose
    private String StorageVolIp;

    /**
     * Get Storage volume name 
     * @return StorageVolName Storage volume name
     */
    public String getStorageVolName() {
        return this.StorageVolName;
    }

    /**
     * Set Storage volume name
     * @param StorageVolName Storage volume name
     */
    public void setStorageVolName(String StorageVolName) {
        this.StorageVolName = StorageVolName;
    }

    /**
     * Get Storage volume path 
     * @return StorageVolPath Storage volume path
     */
    public String getStorageVolPath() {
        return this.StorageVolPath;
    }

    /**
     * Set Storage volume path
     * @param StorageVolPath Storage volume path
     */
    public void setStorageVolPath(String StorageVolPath) {
        this.StorageVolPath = StorageVolPath;
    }

    /**
     * Get Storage volume IP
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StorageVolIp Storage volume IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageVolIp() {
        return this.StorageVolIp;
    }

    /**
     * Set Storage volume IP
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StorageVolIp Storage volume IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageVolIp(String StorageVolIp) {
        this.StorageVolIp = StorageVolIp;
    }

    public StorageConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageConf(StorageConf source) {
        if (source.StorageVolName != null) {
            this.StorageVolName = new String(source.StorageVolName);
        }
        if (source.StorageVolPath != null) {
            this.StorageVolPath = new String(source.StorageVolPath);
        }
        if (source.StorageVolIp != null) {
            this.StorageVolIp = new String(source.StorageVolIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageVolName", this.StorageVolName);
        this.setParamSimple(map, prefix + "StorageVolPath", this.StorageVolPath);
        this.setParamSimple(map, prefix + "StorageVolIp", this.StorageVolIp);

    }
}

