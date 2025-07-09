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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectSecurityGroupsRequest extends AbstractModel {

    /**
    * Database engine name, which is `redis` for this API.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Offset, which is an integral multiple of `Limit`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of security groups to be pulled. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search criteria. You can enter a security group ID or name.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get Database engine name, which is `redis` for this API. 
     * @return Product Database engine name, which is `redis` for this API.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Database engine name, which is `redis` for this API.
     * @param Product Database engine name, which is `redis` for this API.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**. 
     * @return ProjectId Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
     * @param ProjectId Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Offset, which is an integral multiple of `Limit`. 
     * @return Offset Offset, which is an integral multiple of `Limit`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integral multiple of `Limit`.
     * @param Offset Offset, which is an integral multiple of `Limit`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of security groups to be pulled. Default value: `20`. 
     * @return Limit The number of security groups to be pulled. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of security groups to be pulled. Default value: `20`.
     * @param Limit The number of security groups to be pulled. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search criteria. You can enter a security group ID or name. 
     * @return SearchKey Search criteria. You can enter a security group ID or name.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search criteria. You can enter a security group ID or name.
     * @param SearchKey Search criteria. You can enter a security group ID or name.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeProjectSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectSecurityGroupsRequest(DescribeProjectSecurityGroupsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

