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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainAndIpRequest extends AbstractModel {

    /**
    * Public IP/domain name
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
    * Asset tags
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
     * Get Public IP/domain name 
     * @return Content Public IP/domain name
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set Public IP/domain name
     * @param Content Public IP/domain name
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    /**
     * Get Asset tags 
     * @return Tags Asset tags
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Asset tags
     * @param Tags Asset tags
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDomainAndIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainAndIpRequest(CreateDomainAndIpRequest source) {
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Content.", this.Content);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

