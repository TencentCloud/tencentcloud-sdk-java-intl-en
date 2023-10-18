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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatFwFilter extends AbstractModel {

    /**
    * Filter type, e.g., instance ID
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * Filtered content, separated with ","
    */
    @SerializedName("FilterContent")
    @Expose
    private String FilterContent;

    /**
     * Get Filter type, e.g., instance ID 
     * @return FilterType Filter type, e.g., instance ID
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Filter type, e.g., instance ID
     * @param FilterType Filter type, e.g., instance ID
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Filtered content, separated with "," 
     * @return FilterContent Filtered content, separated with ","
     */
    public String getFilterContent() {
        return this.FilterContent;
    }

    /**
     * Set Filtered content, separated with ","
     * @param FilterContent Filtered content, separated with ","
     */
    public void setFilterContent(String FilterContent) {
        this.FilterContent = FilterContent;
    }

    public NatFwFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatFwFilter(NatFwFilter source) {
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.FilterContent != null) {
            this.FilterContent = new String(source.FilterContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "FilterContent", this.FilterContent);

    }
}

