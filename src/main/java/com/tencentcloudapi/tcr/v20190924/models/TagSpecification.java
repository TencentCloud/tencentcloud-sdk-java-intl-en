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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagSpecification extends AbstractModel {

    /**
    * Default value: instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Cloud tag array
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Default value: instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Default value: instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Default value: instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Default value: instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Cloud tag array
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Cloud tag array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Cloud tag array
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Cloud tag array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public TagSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagSpecification(TagSpecification source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
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
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

