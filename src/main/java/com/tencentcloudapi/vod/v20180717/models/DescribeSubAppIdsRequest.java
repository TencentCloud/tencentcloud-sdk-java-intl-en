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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubAppIdsRequest extends AbstractModel {

    /**
    * Application name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag information. Query the application list with a specified tag.
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
    * Starting offset for pagination pull. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of results returned for pagination pull. Default value: 200; maximum value: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Application name 
     * @return Name Application name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Application name
     * @param Name Application name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag information. Query the application list with a specified tag. 
     * @return Tags Tag information. Query the application list with a specified tag.
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information. Query the application list with a specified tag.
     * @param Tags Tag information. Query the application list with a specified tag.
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Starting offset for pagination pull. Default value: 0. 
     * @return Offset Starting offset for pagination pull. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset for pagination pull. Default value: 0.
     * @param Offset Starting offset for pagination pull. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of results returned for pagination pull. Default value: 200; maximum value: 200. 
     * @return Limit Maximum number of results returned for pagination pull. Default value: 200; maximum value: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results returned for pagination pull. Default value: 200; maximum value: 200.
     * @param Limit Maximum number of results returned for pagination pull. Default value: 200; maximum value: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSubAppIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubAppIdsRequest(DescribeSubAppIdsRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

