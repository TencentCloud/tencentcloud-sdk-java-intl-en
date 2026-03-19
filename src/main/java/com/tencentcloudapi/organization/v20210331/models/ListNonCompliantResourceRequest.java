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

public class ListNonCompliantResourceRequest extends AbstractModel {

    /**
    * Limit. Value range: 1–50.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Member UIN.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Token value obtained from the previous page response.
If it is the first request, set to empty.
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * Tag key.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
     * Get Limit. Value range: 1–50. 
     * @return MaxResults Limit. Value range: 1–50.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Limit. Value range: 1–50.
     * @param MaxResults Limit. Value range: 1–50.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Member UIN. 
     * @return MemberUin Member UIN.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member UIN.
     * @param MemberUin Member UIN.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Token value obtained from the previous page response.
If it is the first request, set to empty. 
     * @return PaginationToken Token value obtained from the previous page response.
If it is the first request, set to empty.
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set Token value obtained from the previous page response.
If it is the first request, set to empty.
     * @param PaginationToken Token value obtained from the previous page response.
If it is the first request, set to empty.
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get Tag key. 
     * @return TagKey Tag key.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key.
     * @param TagKey Tag key.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    public ListNonCompliantResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListNonCompliantResourceRequest(ListNonCompliantResourceRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);

    }
}

