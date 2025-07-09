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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWarningHostConfigRequest extends AbstractModel {

    /**
    * Alarm type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Limit per Page, 0 for no paging.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset. The default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Alarm type 
     * @return Type Alarm type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Alarm type
     * @param Type Alarm type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Limit per Page, 0 for no paging. 
     * @return Limit Limit per Page, 0 for no paging.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit per Page, 0 for no paging.
     * @param Limit Limit per Page, 0 for no paging.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. The default is 0. 
     * @return Offset Pagination offset. The default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. The default is 0.
     * @param Offset Pagination offset. The default is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeWarningHostConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWarningHostConfigRequest(DescribeWarningHostConfigRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

