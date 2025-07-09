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

public class ListOrganizationIdentityRequest extends AbstractModel {

    /**
    * Offset.  It must be an integer multiple of the value of `Limit`.  Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The limit for the number of query results.  Value range:  1-50.  Default value:  `10`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search by name.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Identity ID, which can be searched by identity ID.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Identity type.  Valid values: `1` (Preset), `2` (Custom).
    */
    @SerializedName("IdentityType")
    @Expose
    private Long IdentityType;

    /**
     * Get Offset.  It must be an integer multiple of the value of `Limit`.  Default value: `0`. 
     * @return Offset Offset.  It must be an integer multiple of the value of `Limit`.  Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.  It must be an integer multiple of the value of `Limit`.  Default value: `0`.
     * @param Offset Offset.  It must be an integer multiple of the value of `Limit`.  Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The limit for the number of query results.  Value range:  1-50.  Default value:  `10`. 
     * @return Limit The limit for the number of query results.  Value range:  1-50.  Default value:  `10`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The limit for the number of query results.  Value range:  1-50.  Default value:  `10`.
     * @param Limit The limit for the number of query results.  Value range:  1-50.  Default value:  `10`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search by name. 
     * @return SearchKey Search by name.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search by name.
     * @param SearchKey Search by name.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Identity ID, which can be searched by identity ID. 
     * @return IdentityId Identity ID, which can be searched by identity ID.
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Identity ID, which can be searched by identity ID.
     * @param IdentityId Identity ID, which can be searched by identity ID.
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get Identity type.  Valid values: `1` (Preset), `2` (Custom). 
     * @return IdentityType Identity type.  Valid values: `1` (Preset), `2` (Custom).
     */
    public Long getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set Identity type.  Valid values: `1` (Preset), `2` (Custom).
     * @param IdentityType Identity type.  Valid values: `1` (Preset), `2` (Custom).
     */
    public void setIdentityType(Long IdentityType) {
        this.IdentityType = IdentityType;
    }

    public ListOrganizationIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrganizationIdentityRequest(ListOrganizationIdentityRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityType != null) {
            this.IdentityType = new Long(source.IdentityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);

    }
}

