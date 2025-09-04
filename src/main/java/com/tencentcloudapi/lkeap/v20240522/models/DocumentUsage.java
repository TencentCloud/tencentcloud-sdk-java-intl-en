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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocumentUsage extends AbstractModel {

    /**
    * Page number of the document splitting task.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Total number of tokens consumed by the document splitting task.
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * Total number of tokens consumed by the document splitting task.
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get Page number of the document splitting task. 
     * @return PageNumber Page number of the document splitting task.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number of the document splitting task.
     * @param PageNumber Page number of the document splitting task.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Total number of tokens consumed by the document splitting task. 
     * @return TotalToken Total number of tokens consumed by the document splitting task.
     * @deprecated
     */
    @Deprecated
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set Total number of tokens consumed by the document splitting task.
     * @param TotalToken Total number of tokens consumed by the document splitting task.
     * @deprecated
     */
    @Deprecated
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get Total number of tokens consumed by the document splitting task. 
     * @return TotalTokens Total number of tokens consumed by the document splitting task.
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set Total number of tokens consumed by the document splitting task.
     * @param TotalTokens Total number of tokens consumed by the document splitting task.
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public DocumentUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentUsage(DocumentUsage source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
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
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

