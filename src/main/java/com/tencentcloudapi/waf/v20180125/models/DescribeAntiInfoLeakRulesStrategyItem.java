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

public class DescribeAntiInfoLeakRulesStrategyItem extends AbstractModel {

    /**
    * Field
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Condition
    */
    @SerializedName("CompareFunc")
    @Expose
    private String CompareFunc;

    /**
    * Content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Field 
     * @return Field Field
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Field
     * @param Field Field
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Condition 
     * @return CompareFunc Condition
     */
    public String getCompareFunc() {
        return this.CompareFunc;
    }

    /**
     * Set Condition
     * @param CompareFunc Condition
     */
    public void setCompareFunc(String CompareFunc) {
        this.CompareFunc = CompareFunc;
    }

    /**
     * Get Content 
     * @return Content Content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content
     * @param Content Content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public DescribeAntiInfoLeakRulesStrategyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakRulesStrategyItem(DescribeAntiInfoLeakRulesStrategyItem source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.CompareFunc != null) {
            this.CompareFunc = new String(source.CompareFunc);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "CompareFunc", this.CompareFunc);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

