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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogSearchContext extends AbstractModel{

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Log record number
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Log keyword
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Log type. The value is `Application` (default) or `Platform`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Log record number 
     * @return Limit Log record number
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Log record number
     * @param Limit Log record number
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Log keyword 
     * @return Keyword Log keyword
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Log keyword
     * @param Keyword Log keyword
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Log type. The value is `Application` (default) or `Platform`. 
     * @return Type Log type. The value is `Application` (default) or `Platform`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Log type. The value is `Application` (default) or `Platform`.
     * @param Type Log type. The value is `Application` (default) or `Platform`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public LogSearchContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSearchContext(LogSearchContext source) {
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

