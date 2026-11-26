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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateContentIdentifierRequest extends AbstractModel {

    /**
    * Description of the content identifier. Length limited to 20 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Target bundle ID to be bound. Enterprise edition only.<li>If a package already exists under your account, go to [Plan management](https://console.cloud.tencent.com/edgeone/package) to get the package ID, and bind the content identifier to that package directly;</li><li>If you currently have no bindable package, purchase an enterprise edition package first.</li>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Tag. This parameter is used for authority control over content identifiers. Go to the tag console (https://console.cloud.tencent.com/tag/taglist) first to create tags before you can input the corresponding tag key and tag value here.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Description of the content identifier. Length limited to 20 characters. 
     * @return Description Description of the content identifier. Length limited to 20 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the content identifier. Length limited to 20 characters.
     * @param Description Description of the content identifier. Length limited to 20 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Target bundle ID to be bound. Enterprise edition only.<li>If a package already exists under your account, go to [Plan management](https://console.cloud.tencent.com/edgeone/package) to get the package ID, and bind the content identifier to that package directly;</li><li>If you currently have no bindable package, purchase an enterprise edition package first.</li> 
     * @return PlanId Target bundle ID to be bound. Enterprise edition only.<li>If a package already exists under your account, go to [Plan management](https://console.cloud.tencent.com/edgeone/package) to get the package ID, and bind the content identifier to that package directly;</li><li>If you currently have no bindable package, purchase an enterprise edition package first.</li>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Target bundle ID to be bound. Enterprise edition only.<li>If a package already exists under your account, go to [Plan management](https://console.cloud.tencent.com/edgeone/package) to get the package ID, and bind the content identifier to that package directly;</li><li>If you currently have no bindable package, purchase an enterprise edition package first.</li>
     * @param PlanId Target bundle ID to be bound. Enterprise edition only.<li>If a package already exists under your account, go to [Plan management](https://console.cloud.tencent.com/edgeone/package) to get the package ID, and bind the content identifier to that package directly;</li><li>If you currently have no bindable package, purchase an enterprise edition package first.</li>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Tag. This parameter is used for authority control over content identifiers. Go to the tag console (https://console.cloud.tencent.com/tag/taglist) first to create tags before you can input the corresponding tag key and tag value here. 
     * @return Tags Tag. This parameter is used for authority control over content identifiers. Go to the tag console (https://console.cloud.tencent.com/tag/taglist) first to create tags before you can input the corresponding tag key and tag value here.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag. This parameter is used for authority control over content identifiers. Go to the tag console (https://console.cloud.tencent.com/tag/taglist) first to create tags before you can input the corresponding tag key and tag value here.
     * @param Tags Tag. This parameter is used for authority control over content identifiers. Go to the tag console (https://console.cloud.tencent.com/tag/taglist) first to create tags before you can input the corresponding tag key and tag value here.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateContentIdentifierRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateContentIdentifierRequest(CreateContentIdentifierRequest source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

