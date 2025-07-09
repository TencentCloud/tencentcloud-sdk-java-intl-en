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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceBundle extends AbstractModel {

    /**
    * Resource package name.
    */
    @SerializedName("ResourceBundleName")
    @Expose
    private String ResourceBundleName;

    /**
    * Saleable memory. Unit: GB.
    */
    @SerializedName("AvailableMemory")
    @Expose
    private Long AvailableMemory;

    /**
    * Number of resource packages.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Resource package name. 
     * @return ResourceBundleName Resource package name.
     */
    public String getResourceBundleName() {
        return this.ResourceBundleName;
    }

    /**
     * Set Resource package name.
     * @param ResourceBundleName Resource package name.
     */
    public void setResourceBundleName(String ResourceBundleName) {
        this.ResourceBundleName = ResourceBundleName;
    }

    /**
     * Get Saleable memory. Unit: GB. 
     * @return AvailableMemory Saleable memory. Unit: GB.
     */
    public Long getAvailableMemory() {
        return this.AvailableMemory;
    }

    /**
     * Set Saleable memory. Unit: GB.
     * @param AvailableMemory Saleable memory. Unit: GB.
     */
    public void setAvailableMemory(Long AvailableMemory) {
        this.AvailableMemory = AvailableMemory;
    }

    /**
     * Get Number of resource packages. 
     * @return Count Number of resource packages.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of resource packages.
     * @param Count Number of resource packages.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ResourceBundle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceBundle(ResourceBundle source) {
        if (source.ResourceBundleName != null) {
            this.ResourceBundleName = new String(source.ResourceBundleName);
        }
        if (source.AvailableMemory != null) {
            this.AvailableMemory = new Long(source.AvailableMemory);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceBundleName", this.ResourceBundleName);
        this.setParamSimple(map, prefix + "AvailableMemory", this.AvailableMemory);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

