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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListMigrationProjectRequest extends AbstractModel {

    /**
    * The initial number of records, default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of records returned, default value: 500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The initial number of records, default value: 0 
     * @return Offset The initial number of records, default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The initial number of records, default value: 0
     * @param Offset The initial number of records, default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of records returned, default value: 500 
     * @return Limit The number of records returned, default value: 500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records returned, default value: 500
     * @param Limit The number of records returned, default value: 500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListMigrationProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListMigrationProjectRequest(ListMigrationProjectRequest source) {
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

