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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowLogStorage extends AbstractModel{

    /**
    * Storage instance ID, which is required when `StorageType` is `ckafka`.
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * Topic ID, which is required when `StorageType` is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("StorageTopic")
    @Expose
    private String StorageTopic;

    /**
     * Get Storage instance ID, which is required when `StorageType` is `ckafka`. 
     * @return StorageId Storage instance ID, which is required when `StorageType` is `ckafka`.
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set Storage instance ID, which is required when `StorageType` is `ckafka`.
     * @param StorageId Storage instance ID, which is required when `StorageType` is `ckafka`.
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get Topic ID, which is required when `StorageType` is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return StorageTopic Topic ID, which is required when `StorageType` is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getStorageTopic() {
        return this.StorageTopic;
    }

    /**
     * Set Topic ID, which is required when `StorageType` is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
     * @param StorageTopic Topic ID, which is required when `StorageType` is `ckafka`.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setStorageTopic(String StorageTopic) {
        this.StorageTopic = StorageTopic;
    }

    public FlowLogStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowLogStorage(FlowLogStorage source) {
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StorageTopic != null) {
            this.StorageTopic = new String(source.StorageTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StorageTopic", this.StorageTopic);

    }
}

