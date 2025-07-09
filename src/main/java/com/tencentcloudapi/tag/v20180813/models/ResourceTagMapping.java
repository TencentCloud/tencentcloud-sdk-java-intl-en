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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceTagMapping extends AbstractModel {

    /**
    * Six-segment resource description. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * List of tags associated with the resource
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Six-segment resource description. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}. 
     * @return Resource Six-segment resource description. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Six-segment resource description. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
     * @param Resource Six-segment resource description. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get List of tags associated with the resource 
     * @return Tags List of tags associated with the resource
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags associated with the resource
     * @param Tags List of tags associated with the resource
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ResourceTagMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceTagMapping(ResourceTagMapping source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

