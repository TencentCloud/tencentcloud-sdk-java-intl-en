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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductMetadata extends AbstractModel {

    /**
    * Product creation time
    */
    @SerializedName("CreationDate")
    @Expose
    private Long CreationDate;

    /**
     * Get Product creation time 
     * @return CreationDate Product creation time
     */
    public Long getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Set Product creation time
     * @param CreationDate Product creation time
     */
    public void setCreationDate(Long CreationDate) {
        this.CreationDate = CreationDate;
    }

    public ProductMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductMetadata(ProductMetadata source) {
        if (source.CreationDate != null) {
            this.CreationDate = new Long(source.CreationDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);

    }
}

