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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEKYCWebhooksRequest extends AbstractModel {

    /**
    * <p>Paging offset. Default value: 0</p><p>Value range: [0, 100]</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of results per page. Default value: 20. Maximum value: 100 (automatically truncated to 100 if exceeded)</p><p>Value range: [20, 100]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Paging offset. Default value: 0</p><p>Value range: [0, 100]</p> 
     * @return Offset <p>Paging offset. Default value: 0</p><p>Value range: [0, 100]</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset. Default value: 0</p><p>Value range: [0, 100]</p>
     * @param Offset <p>Paging offset. Default value: 0</p><p>Value range: [0, 100]</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of results per page. Default value: 20. Maximum value: 100 (automatically truncated to 100 if exceeded)</p><p>Value range: [20, 100]</p> 
     * @return Limit <p>Number of results per page. Default value: 20. Maximum value: 100 (automatically truncated to 100 if exceeded)</p><p>Value range: [20, 100]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page. Default value: 20. Maximum value: 100 (automatically truncated to 100 if exceeded)</p><p>Value range: [20, 100]</p>
     * @param Limit <p>Number of results per page. Default value: 20. Maximum value: 100 (automatically truncated to 100 if exceeded)</p><p>Value range: [20, 100]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListEKYCWebhooksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEKYCWebhooksRequest(ListEKYCWebhooksRequest source) {
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

