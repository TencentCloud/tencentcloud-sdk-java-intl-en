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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConcurrentPackageRequest extends AbstractModel {

    /**
    * Concurrency pack ID.
    */
    @SerializedName("ConcurrentId")
    @Expose
    private String ConcurrentId;

    /**
    * Concurrency pack name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Concurrency pack ID. 
     * @return ConcurrentId Concurrency pack ID.
     */
    public String getConcurrentId() {
        return this.ConcurrentId;
    }

    /**
     * Set Concurrency pack ID.
     * @param ConcurrentId Concurrency pack ID.
     */
    public void setConcurrentId(String ConcurrentId) {
        this.ConcurrentId = ConcurrentId;
    }

    /**
     * Get Concurrency pack name. 
     * @return Name Concurrency pack name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Concurrency pack name.
     * @param Name Concurrency pack name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModifyConcurrentPackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConcurrentPackageRequest(ModifyConcurrentPackageRequest source) {
        if (source.ConcurrentId != null) {
            this.ConcurrentId = new String(source.ConcurrentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConcurrentId", this.ConcurrentId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

