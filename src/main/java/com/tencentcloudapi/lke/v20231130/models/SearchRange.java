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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchRange extends AbstractModel {

    /**
    * Search criteria and/or.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Custom variable and label relational data.
    */
    @SerializedName("ApiVarAttrInfos")
    @Expose
    private ApiVarAttrInfo [] ApiVarAttrInfos;

    /**
     * Get Search criteria and/or. 
     * @return Condition Search criteria and/or.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Search criteria and/or.
     * @param Condition Search criteria and/or.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Custom variable and label relational data. 
     * @return ApiVarAttrInfos Custom variable and label relational data.
     */
    public ApiVarAttrInfo [] getApiVarAttrInfos() {
        return this.ApiVarAttrInfos;
    }

    /**
     * Set Custom variable and label relational data.
     * @param ApiVarAttrInfos Custom variable and label relational data.
     */
    public void setApiVarAttrInfos(ApiVarAttrInfo [] ApiVarAttrInfos) {
        this.ApiVarAttrInfos = ApiVarAttrInfos;
    }

    public SearchRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchRange(SearchRange source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.ApiVarAttrInfos != null) {
            this.ApiVarAttrInfos = new ApiVarAttrInfo[source.ApiVarAttrInfos.length];
            for (int i = 0; i < source.ApiVarAttrInfos.length; i++) {
                this.ApiVarAttrInfos[i] = new ApiVarAttrInfo(source.ApiVarAttrInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "ApiVarAttrInfos.", this.ApiVarAttrInfos);

    }
}

