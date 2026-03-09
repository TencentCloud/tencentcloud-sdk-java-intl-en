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

public class PrivilegeResource extends AbstractModel {

    /**
    * Resource type, Catalog, Schema.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource URI.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceUri")
    @Expose
    private String ResourceUri;

    /**
     * Get Resource type, Catalog, Schema.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Resource type, Catalog, Schema.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type, Catalog, Schema.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Resource type, Catalog, Schema.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource URI.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceUri Resource URI.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceUri() {
        return this.ResourceUri;
    }

    /**
     * Set Resource URI.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceUri Resource URI.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceUri(String ResourceUri) {
        this.ResourceUri = ResourceUri;
    }

    public PrivilegeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeResource(PrivilegeResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceUri != null) {
            this.ResourceUri = new String(source.ResourceUri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceUri", this.ResourceUri);

    }
}

