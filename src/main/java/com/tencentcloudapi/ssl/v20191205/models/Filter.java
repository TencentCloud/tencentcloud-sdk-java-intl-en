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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * The key of the filter parameter.
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * u200cThe value of the filter parameter.
    */
    @SerializedName("FilterValue")
    @Expose
    private String FilterValue;

    /**
     * Get The key of the filter parameter. 
     * @return FilterKey The key of the filter parameter.
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set The key of the filter parameter.
     * @param FilterKey The key of the filter parameter.
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get u200cThe value of the filter parameter. 
     * @return FilterValue u200cThe value of the filter parameter.
     */
    public String getFilterValue() {
        return this.FilterValue;
    }

    /**
     * Set u200cThe value of the filter parameter.
     * @param FilterValue u200cThe value of the filter parameter.
     */
    public void setFilterValue(String FilterValue) {
        this.FilterValue = FilterValue;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.FilterKey != null) {
            this.FilterKey = new String(source.FilterKey);
        }
        if (source.FilterValue != null) {
            this.FilterValue = new String(source.FilterValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamSimple(map, prefix + "FilterValue", this.FilterValue);

    }
}

