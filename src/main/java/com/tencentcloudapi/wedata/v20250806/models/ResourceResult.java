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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceResult extends AbstractModel {

    /**
    * Success status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Resource group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
     * Get Success status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Success status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Success status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Success status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Resource group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupId Resource group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set Resource group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupId Resource group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    public ResourceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceResult(ResourceResult source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);

    }
}

