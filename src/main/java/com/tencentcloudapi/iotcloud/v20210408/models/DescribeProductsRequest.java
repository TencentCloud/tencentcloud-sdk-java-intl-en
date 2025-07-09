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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductsRequest extends AbstractModel {

    /**
    * Offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries returned per page. Valid range: 10–250.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Offset, starting from 0 
     * @return Offset Offset, starting from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, starting from 0
     * @param Offset Offset, starting from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries returned per page. Valid range: 10–250. 
     * @return Limit Number of entries returned per page. Valid range: 10–250.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per page. Valid range: 10–250.
     * @param Limit Number of entries returned per page. Valid range: 10–250.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeProductsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductsRequest(DescribeProductsRequest source) {
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

