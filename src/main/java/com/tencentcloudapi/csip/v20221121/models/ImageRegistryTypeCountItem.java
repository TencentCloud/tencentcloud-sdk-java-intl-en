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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRegistryTypeCountItem extends AbstractModel {

    /**
    * <p>Repository type</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>Number of warehouses</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>Repository type</p> 
     * @return RegistryType <p>Repository type</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>Repository type</p>
     * @param RegistryType <p>Repository type</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>Number of warehouses</p> 
     * @return Count <p>Number of warehouses</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Number of warehouses</p>
     * @param Count <p>Number of warehouses</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ImageRegistryTypeCountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryTypeCountItem(ImageRegistryTypeCountItem source) {
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

