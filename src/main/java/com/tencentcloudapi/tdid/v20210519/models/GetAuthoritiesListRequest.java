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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAuthoritiesListRequest extends AbstractModel{

    /**
    * The page number, beginning from 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * The number of records per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * The DID.
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * Whether to query certified or uncertified authorities. `1`: Certified; `2`: Uncertified.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get The page number, beginning from 1. 
     * @return PageNumber The page number, beginning from 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The page number, beginning from 1.
     * @param PageNumber The page number, beginning from 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get The number of records per page. 
     * @return PageSize The number of records per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of records per page.
     * @param PageSize The number of records per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get The DID. 
     * @return Did The DID.
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set The DID.
     * @param Did The DID.
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get Whether to query certified or uncertified authorities. `1`: Certified; `2`: Uncertified. 
     * @return Status Whether to query certified or uncertified authorities. `1`: Certified; `2`: Uncertified.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to query certified or uncertified authorities. `1`: Certified; `2`: Uncertified.
     * @param Status Whether to query certified or uncertified authorities. `1`: Certified; `2`: Uncertified.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GetAuthoritiesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAuthoritiesListRequest(GetAuthoritiesListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

