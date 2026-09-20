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

public class DescribeKnowledgeBasesRequest extends AbstractModel {

    /**
    * <p>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services from December 25, 2023, this field must be filled in with the app ID when accessing resources in VOD applications, whether default or newly created.</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Paging offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter by knowledge base name with exact matching. If not specified, all knowledge bases will be returned.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services from December 25, 2023, this field must be filled in with the app ID when accessing resources in VOD applications, whether default or newly created.</p> 
     * @return SubAppId <p>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services from December 25, 2023, this field must be filled in with the app ID when accessing resources in VOD applications, whether default or newly created.</p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services from December 25, 2023, this field must be filled in with the app ID when accessing resources in VOD applications, whether default or newly created.</p>
     * @param SubAppId <p>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate VOD services from December 25, 2023, this field must be filled in with the app ID when accessing resources in VOD applications, whether default or newly created.</p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Paging offset. Default value: 0.</p> 
     * @return Offset <p>Paging offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset. Default value: 0.</p>
     * @param Offset <p>Paging offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned entries. Default value: 100. Maximum value: 100.</p> 
     * @return Limit <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
     * @param Limit <p>Number of returned entries. Default value: 100. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter by knowledge base name with exact matching. If not specified, all knowledge bases will be returned.</p> 
     * @return Name <p>Filter by knowledge base name with exact matching. If not specified, all knowledge bases will be returned.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Filter by knowledge base name with exact matching. If not specified, all knowledge bases will be returned.</p>
     * @param Name <p>Filter by knowledge base name with exact matching. If not specified, all knowledge bases will be returned.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeKnowledgeBasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeBasesRequest(DescribeKnowledgeBasesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

