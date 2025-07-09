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

public class DescribeRiskCenterServerRiskListRequest extends AbstractModel {

    /**
    * Filter conditions
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * Asset tags
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
     * Get Filter conditions 
     * @return Filter Filter conditions
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter conditions
     * @param Filter Filter conditions
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
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

    public DescribeRiskCenterServerRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskCenterServerRiskListRequest(DescribeRiskCenterServerRiskListRequest source) {
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

