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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagResourceInfo extends AbstractModel {

    /**
    * Resource types:
`Proxy`: Connection
`ProxyGroup`: Connection group
`RealServer`: Origin server
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Instance ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get Resource types:
`Proxy`: Connection
`ProxyGroup`: Connection group
`RealServer`: Origin server 
     * @return ResourceType Resource types:
`Proxy`: Connection
`ProxyGroup`: Connection group
`RealServer`: Origin server
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource types:
`Proxy`: Connection
`ProxyGroup`: Connection group
`RealServer`: Origin server
     * @param ResourceType Resource types:
`Proxy`: Connection
`ProxyGroup`: Connection group
`RealServer`: Origin server
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Instance ID 
     * @return ResourceId Instance ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Instance ID
     * @param ResourceId Instance ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public TagResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagResourceInfo(TagResourceInfo source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

