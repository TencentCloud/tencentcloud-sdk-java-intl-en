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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceTagMapping extends AbstractModel {

    /**
    * Six-Segment resource format. tencent cloud uses the six-segment resource format to describe a resource.
For example: qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Compliance details.
    */
    @SerializedName("ComplianceDetails")
    @Expose
    private TagComplianceDetails ComplianceDetails;

    /**
    * Resource tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
     * Get Six-Segment resource format. tencent cloud uses the six-segment resource format to describe a resource.
For example: qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}. 
     * @return Resource Six-Segment resource format. tencent cloud uses the six-segment resource format to describe a resource.
For example: qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Six-Segment resource format. tencent cloud uses the six-segment resource format to describe a resource.
For example: qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
     * @param Resource Six-Segment resource format. tencent cloud uses the six-segment resource format to describe a resource.
For example: qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Compliance details. 
     * @return ComplianceDetails Compliance details.
     */
    public TagComplianceDetails getComplianceDetails() {
        return this.ComplianceDetails;
    }

    /**
     * Set Compliance details.
     * @param ComplianceDetails Compliance details.
     */
    public void setComplianceDetails(TagComplianceDetails ComplianceDetails) {
        this.ComplianceDetails = ComplianceDetails;
    }

    /**
     * Get Resource tag. 
     * @return Tags Resource tag.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Resource tag.
     * @param Tags Resource tag.
     */
    public void setTags(Tags [] Tags) {
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
        if (source.ComplianceDetails != null) {
            this.ComplianceDetails = new TagComplianceDetails(source.ComplianceDetails);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamObj(map, prefix + "ComplianceDetails.", this.ComplianceDetails);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

