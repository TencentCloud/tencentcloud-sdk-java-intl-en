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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMatchCodesRequest extends AbstractModel {

    /**
    * Offset, number of pages.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of MatchCodes per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query by the MatchCode value (a string).
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
     * Get Offset, number of pages. 
     * @return Offset Offset, number of pages.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, number of pages.
     * @param Offset Offset, number of pages.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of MatchCodes per page 
     * @return Limit The number of MatchCodes per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of MatchCodes per page
     * @param Limit The number of MatchCodes per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query by the MatchCode value (a string). 
     * @return MatchCode Query by the MatchCode value (a string).
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set Query by the MatchCode value (a string).
     * @param MatchCode Query by the MatchCode value (a string).
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    public DescribeMatchCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMatchCodesRequest(DescribeMatchCodesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);

    }
}

