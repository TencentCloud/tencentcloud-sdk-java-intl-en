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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMKeywordLibraryRequest extends AbstractModel {

    /**
    * Lexicon type filter.
Valid values:
custom: custom blacklist
builtin: built-in lexicon
all: all lexicons
white: custom whitelist
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Pagination offset
Value range: [0, +∞)
Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries returned per page
Value range: [1, 1000]
Default value: 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting field
Valid values:
UpdateTime: sort by update time
CreateTime: sort by creation time
Name: sort by name
Default value: UpdateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting order
Valid values:
ASC: ascending order
DESC: descending order
Default value: DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Lexicon type filter.
Valid values:
custom: custom blacklist
builtin: built-in lexicon
all: all lexicons
white: custom whitelist 
     * @return Type Lexicon type filter.
Valid values:
custom: custom blacklist
builtin: built-in lexicon
all: all lexicons
white: custom whitelist
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Lexicon type filter.
Valid values:
custom: custom blacklist
builtin: built-in lexicon
all: all lexicons
white: custom whitelist
     * @param Type Lexicon type filter.
Valid values:
custom: custom blacklist
builtin: built-in lexicon
all: all lexicons
white: custom whitelist
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Pagination offset
Value range: [0, +∞)
Default value: 0 
     * @return Offset Pagination offset
Value range: [0, +∞)
Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
Value range: [0, +∞)
Default value: 0
     * @param Offset Pagination offset
Value range: [0, +∞)
Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries returned per page
Value range: [1, 1000]
Default value: 10 
     * @return Limit Number of entries returned per page
Value range: [1, 1000]
Default value: 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per page
Value range: [1, 1000]
Default value: 10
     * @param Limit Number of entries returned per page
Value range: [1, 1000]
Default value: 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting field
Valid values:
UpdateTime: sort by update time
CreateTime: sort by creation time
Name: sort by name
Default value: UpdateTime 
     * @return By Sorting field
Valid values:
UpdateTime: sort by update time
CreateTime: sort by creation time
Name: sort by name
Default value: UpdateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
Valid values:
UpdateTime: sort by update time
CreateTime: sort by creation time
Name: sort by name
Default value: UpdateTime
     * @param By Sorting field
Valid values:
UpdateTime: sort by update time
CreateTime: sort by creation time
Name: sort by name
Default value: UpdateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting order
Valid values:
ASC: ascending order
DESC: descending order
Default value: DESC 
     * @return Order Sorting order
Valid values:
ASC: ascending order
DESC: descending order
Default value: DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order
Valid values:
ASC: ascending order
DESC: descending order
Default value: DESC
     * @param Order Sorting order
Valid values:
ASC: ascending order
DESC: descending order
Default value: DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeLLMKeywordLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMKeywordLibraryRequest(DescribeLLMKeywordLibraryRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

