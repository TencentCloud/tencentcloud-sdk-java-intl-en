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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceAccountsRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * All service accounts
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * Whether to fill in permission information.
    */
    @SerializedName("EmbedPermission")
    @Expose
    private Boolean EmbedPermission;

    /**
    * Filters
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: `0`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of output entries. Default value: `20`. Maximum value: `100`. The maximum value is automatically applied when a value exceeding it is entered.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get All service accounts 
     * @return All All service accounts
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set All service accounts
     * @param All All service accounts
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get Whether to fill in permission information. 
     * @return EmbedPermission Whether to fill in permission information.
     */
    public Boolean getEmbedPermission() {
        return this.EmbedPermission;
    }

    /**
     * Set Whether to fill in permission information.
     * @param EmbedPermission Whether to fill in permission information.
     */
    public void setEmbedPermission(Boolean EmbedPermission) {
        this.EmbedPermission = EmbedPermission;
    }

    /**
     * Get Filters 
     * @return Filters Filters
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
     * @param Filters Filters
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: `0` 
     * @return Offset Offset. Default value: `0`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`
     * @param Offset Offset. Default value: `0`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of output entries. Default value: `20`. Maximum value: `100`. The maximum value is automatically applied when a value exceeding it is entered. 
     * @return Limit Maximum number of output entries. Default value: `20`. Maximum value: `100`. The maximum value is automatically applied when a value exceeding it is entered.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of output entries. Default value: `20`. Maximum value: `100`. The maximum value is automatically applied when a value exceeding it is entered.
     * @param Limit Maximum number of output entries. Default value: `20`. Maximum value: `100`. The maximum value is automatically applied when a value exceeding it is entered.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeServiceAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceAccountsRequest(DescribeServiceAccountsRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.EmbedPermission != null) {
            this.EmbedPermission = new Boolean(source.EmbedPermission);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamSimple(map, prefix + "EmbedPermission", this.EmbedPermission);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

