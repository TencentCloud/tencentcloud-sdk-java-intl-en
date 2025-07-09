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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralResourceQuota extends AbstractModel {

    /**
    * Resource name.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Number of available resources.
    */
    @SerializedName("ResourceQuotaAvailable")
    @Expose
    private Long ResourceQuotaAvailable;

    /**
    * Total number of resources.
    */
    @SerializedName("ResourceQuotaTotal")
    @Expose
    private Long ResourceQuotaTotal;

    /**
     * Get Resource name. 
     * @return ResourceName Resource name.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name.
     * @param ResourceName Resource name.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Number of available resources. 
     * @return ResourceQuotaAvailable Number of available resources.
     */
    public Long getResourceQuotaAvailable() {
        return this.ResourceQuotaAvailable;
    }

    /**
     * Set Number of available resources.
     * @param ResourceQuotaAvailable Number of available resources.
     */
    public void setResourceQuotaAvailable(Long ResourceQuotaAvailable) {
        this.ResourceQuotaAvailable = ResourceQuotaAvailable;
    }

    /**
     * Get Total number of resources. 
     * @return ResourceQuotaTotal Total number of resources.
     */
    public Long getResourceQuotaTotal() {
        return this.ResourceQuotaTotal;
    }

    /**
     * Set Total number of resources.
     * @param ResourceQuotaTotal Total number of resources.
     */
    public void setResourceQuotaTotal(Long ResourceQuotaTotal) {
        this.ResourceQuotaTotal = ResourceQuotaTotal;
    }

    public GeneralResourceQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralResourceQuota(GeneralResourceQuota source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceQuotaAvailable != null) {
            this.ResourceQuotaAvailable = new Long(source.ResourceQuotaAvailable);
        }
        if (source.ResourceQuotaTotal != null) {
            this.ResourceQuotaTotal = new Long(source.ResourceQuotaTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceQuotaAvailable", this.ResourceQuotaAvailable);
        this.setParamSimple(map, prefix + "ResourceQuotaTotal", this.ResourceQuotaTotal);

    }
}

