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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTawAreasRequest extends AbstractModel {

    /**
    * Region ID
    */
    @SerializedName("AreaIds")
    @Expose
    private Long [] AreaIds;

    /**
    * Region key
    */
    @SerializedName("AreaKeys")
    @Expose
    private String [] AreaKeys;

    /**
    * Pagination limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Region status (1: valid; 2: invalid)
    */
    @SerializedName("AreaStatuses")
    @Expose
    private Long [] AreaStatuses;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Region ID 
     * @return AreaIds Region ID
     */
    public Long [] getAreaIds() {
        return this.AreaIds;
    }

    /**
     * Set Region ID
     * @param AreaIds Region ID
     */
    public void setAreaIds(Long [] AreaIds) {
        this.AreaIds = AreaIds;
    }

    /**
     * Get Region key 
     * @return AreaKeys Region key
     */
    public String [] getAreaKeys() {
        return this.AreaKeys;
    }

    /**
     * Set Region key
     * @param AreaKeys Region key
     */
    public void setAreaKeys(String [] AreaKeys) {
        this.AreaKeys = AreaKeys;
    }

    /**
     * Get Pagination limit 
     * @return Limit Pagination limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit
     * @param Limit Pagination limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Region status (1: valid; 2: invalid) 
     * @return AreaStatuses Region status (1: valid; 2: invalid)
     */
    public Long [] getAreaStatuses() {
        return this.AreaStatuses;
    }

    /**
     * Set Region status (1: valid; 2: invalid)
     * @param AreaStatuses Region status (1: valid; 2: invalid)
     */
    public void setAreaStatuses(Long [] AreaStatuses) {
        this.AreaStatuses = AreaStatuses;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTawAreasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTawAreasRequest(DescribeTawAreasRequest source) {
        if (source.AreaIds != null) {
            this.AreaIds = new Long[source.AreaIds.length];
            for (int i = 0; i < source.AreaIds.length; i++) {
                this.AreaIds[i] = new Long(source.AreaIds[i]);
            }
        }
        if (source.AreaKeys != null) {
            this.AreaKeys = new String[source.AreaKeys.length];
            for (int i = 0; i < source.AreaKeys.length; i++) {
                this.AreaKeys[i] = new String(source.AreaKeys[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AreaStatuses != null) {
            this.AreaStatuses = new Long[source.AreaStatuses.length];
            for (int i = 0; i < source.AreaStatuses.length; i++) {
                this.AreaStatuses[i] = new Long(source.AreaStatuses[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AreaIds.", this.AreaIds);
        this.setParamArraySimple(map, prefix + "AreaKeys.", this.AreaKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "AreaStatuses.", this.AreaStatuses);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

