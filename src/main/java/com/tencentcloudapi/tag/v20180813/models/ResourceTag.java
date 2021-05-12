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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceTag extends AbstractModel{

    /**
    * The resource's region.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Service type.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Resource prefix.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * Unique resource ID.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource tag.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get The resource's region.
Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceRegion The resource's region.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set The resource's region.
Note: This field may return null, indicating that no valid value is found.
     * @param ResourceRegion The resource's region.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Service type.
Note: This field may return null, indicating that no valid value is found. 
     * @return ServiceType Service type.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service type.
Note: This field may return null, indicating that no valid value is found.
     * @param ServiceType Service type.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Resource prefix.
Note: This field may return null, indicating that no valid value is found. 
     * @return ResourcePrefix Resource prefix.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set Resource prefix.
Note: This field may return null, indicating that no valid value is found.
     * @param ResourcePrefix Resource prefix.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Get Unique resource ID.
Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceId Unique resource ID.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Unique resource ID.
Note: This field may return null, indicating that no valid value is found.
     * @param ResourceId Unique resource ID.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource tag.
Note: This field may return null, indicating that no valid value is found. 
     * @return Tags Resource tag.
Note: This field may return null, indicating that no valid value is found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Resource tag.
Note: This field may return null, indicating that no valid value is found.
     * @param Tags Resource tag.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ResourceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceTag(ResourceTag source) {
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
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
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

