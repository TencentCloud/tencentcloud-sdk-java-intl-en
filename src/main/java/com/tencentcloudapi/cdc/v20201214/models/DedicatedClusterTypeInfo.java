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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterTypeInfo extends AbstractModel {

    /**
    * Cluster type id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Cluster type count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Cluster type id 
     * @return Id Cluster type id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Cluster type id
     * @param Id Cluster type id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Cluster type count 
     * @return Count Cluster type count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Cluster type count
     * @param Count Cluster type count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DedicatedClusterTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterTypeInfo(DedicatedClusterTypeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

