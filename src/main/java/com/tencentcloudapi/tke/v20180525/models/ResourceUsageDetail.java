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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceUsageDetail extends AbstractModel {

    /**
    * Resource name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Resource usage
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
     * Get Resource name 
     * @return Name Resource name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Resource name
     * @param Name Resource name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Resource usage 
     * @return Usage Resource usage
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set Resource usage
     * @param Usage Resource usage
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    public ResourceUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceUsageDetail(ResourceUsageDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

