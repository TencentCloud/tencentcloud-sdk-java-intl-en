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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagResourceInfo extends AbstractModel{

    /**
    * Resource types:
`Proxy`: connections;
`ProxyGroup`: connection groups;
`RealServer`: origin servers.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get Resource types:
`Proxy`: connections;
`ProxyGroup`: connection groups;
`RealServer`: origin servers. 
     * @return ResourceType Resource types:
`Proxy`: connections;
`ProxyGroup`: connection groups;
`RealServer`: origin servers.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource types:
`Proxy`: connections;
`ProxyGroup`: connection groups;
`RealServer`: origin servers.
     * @param ResourceType Resource types:
`Proxy`: connections;
`ProxyGroup`: connection groups;
`RealServer`: origin servers.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

