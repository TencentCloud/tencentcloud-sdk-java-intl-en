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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainAssetsRequest extends AbstractModel {

    /**
    * u200c-
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * CSC tags of the asset
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
     * Get u200c- 
     * @return Filter u200c-
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set u200c-
     * @param Filter u200c-
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get CSC tags of the asset 
     * @return Tags CSC tags of the asset
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set CSC tags of the asset
     * @param Tags CSC tags of the asset
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    public DescribeDomainAssetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainAssetsRequest(DescribeDomainAssetsRequest source) {
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
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
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

