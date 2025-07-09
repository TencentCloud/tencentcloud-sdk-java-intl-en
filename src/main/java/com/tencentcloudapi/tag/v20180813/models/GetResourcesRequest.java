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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResourcesRequest extends AbstractModel {

    /**
    * Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
If this parameter is passed in, the list of all matching resources will be returned, and the specified `MaxResults` will become invalid.
Value range of N: 0–9
    */
    @SerializedName("ResourceList")
    @Expose
    private String [] ResourceList;

    /**
    * Tag key and value.
If multiple tags are specified, resources bound to all such tags will be queried.
Value range of N: 0–5
There can be up to 10 `TagValues` in each `TagFilters`.
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * Number of data entries to return per page (up to 200).
Default value: 50.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
     * Get Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
If this parameter is passed in, the list of all matching resources will be returned, and the specified `MaxResults` will become invalid.
Value range of N: 0–9 
     * @return ResourceList Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
If this parameter is passed in, the list of all matching resources will be returned, and the specified `MaxResults` will become invalid.
Value range of N: 0–9
     */
    public String [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
If this parameter is passed in, the list of all matching resources will be returned, and the specified `MaxResults` will become invalid.
Value range of N: 0–9
     * @param ResourceList Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
If this parameter is passed in, the list of all matching resources will be returned, and the specified `MaxResults` will become invalid.
Value range of N: 0–9
     */
    public void setResourceList(String [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    /**
     * Get Tag key and value.
If multiple tags are specified, resources bound to all such tags will be queried.
Value range of N: 0–5
There can be up to 10 `TagValues` in each `TagFilters`. 
     * @return TagFilters Tag key and value.
If multiple tags are specified, resources bound to all such tags will be queried.
Value range of N: 0–5
There can be up to 10 `TagValues` in each `TagFilters`.
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag key and value.
If multiple tags are specified, resources bound to all such tags will be queried.
Value range of N: 0–5
There can be up to 10 `TagValues` in each `TagFilters`.
     * @param TagFilters Tag key and value.
If multiple tags are specified, resources bound to all such tags will be queried.
Value range of N: 0–5
There can be up to 10 `TagValues` in each `TagFilters`.
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request. 
     * @return PaginationToken The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
     * @param PaginationToken The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get Number of data entries to return per page (up to 200).
Default value: 50. 
     * @return MaxResults Number of data entries to return per page (up to 200).
Default value: 50.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Number of data entries to return per page (up to 200).
Default value: 50.
     * @param MaxResults Number of data entries to return per page (up to 200).
Default value: 50.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    public GetResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourcesRequest(GetResourcesRequest source) {
        if (source.ResourceList != null) {
            this.ResourceList = new String[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new String(source.ResourceList[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceList.", this.ResourceList);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);

    }
}

