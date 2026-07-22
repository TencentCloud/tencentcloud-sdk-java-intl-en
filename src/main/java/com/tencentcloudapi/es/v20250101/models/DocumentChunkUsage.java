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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocumentChunkUsage extends AbstractModel {

    /**
    * Parse page count
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * token consumption
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get Parse page count 
     * @return PageNumber Parse page count
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Parse page count
     * @param PageNumber Parse page count
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get token consumption 
     * @return TotalTokens token consumption
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set token consumption
     * @param TotalTokens token consumption
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public DocumentChunkUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentChunkUsage(DocumentChunkUsage source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

