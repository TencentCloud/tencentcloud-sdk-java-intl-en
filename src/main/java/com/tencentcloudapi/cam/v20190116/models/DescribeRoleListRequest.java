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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoleListRequest extends AbstractModel {

    /**
    * Page number, beginning from 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of lines per page, no greater than 200
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * A parameter used to filter the list of roles under a tag.
    */
    @SerializedName("Tags")
    @Expose
    private RoleTags [] Tags;

    /**
     * Get Page number, beginning from 1 
     * @return Page Page number, beginning from 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, beginning from 1
     * @param Page Page number, beginning from 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of lines per page, no greater than 200 
     * @return Rp Number of lines per page, no greater than 200
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set Number of lines per page, no greater than 200
     * @param Rp Number of lines per page, no greater than 200
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get A parameter used to filter the list of roles under a tag. 
     * @return Tags A parameter used to filter the list of roles under a tag.
     */
    public RoleTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set A parameter used to filter the list of roles under a tag.
     * @param Tags A parameter used to filter the list of roles under a tag.
     */
    public void setTags(RoleTags [] Tags) {
        this.Tags = Tags;
    }

    public DescribeRoleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleListRequest(DescribeRoleListRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Tags != null) {
            this.Tags = new RoleTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RoleTags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

