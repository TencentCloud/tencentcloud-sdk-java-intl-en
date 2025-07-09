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

public class ApiVarAttrInfo extends AbstractModel {

    /**
    * Custom variable ID.
    */
    @SerializedName("ApiVarId")
    @Expose
    private String ApiVarId;

    /**
    * Label ID.
    */
    @SerializedName("AttrBizId")
    @Expose
    private String AttrBizId;

    /**
     * Get Custom variable ID. 
     * @return ApiVarId Custom variable ID.
     */
    public String getApiVarId() {
        return this.ApiVarId;
    }

    /**
     * Set Custom variable ID.
     * @param ApiVarId Custom variable ID.
     */
    public void setApiVarId(String ApiVarId) {
        this.ApiVarId = ApiVarId;
    }

    /**
     * Get Label ID. 
     * @return AttrBizId Label ID.
     */
    public String getAttrBizId() {
        return this.AttrBizId;
    }

    /**
     * Set Label ID.
     * @param AttrBizId Label ID.
     */
    public void setAttrBizId(String AttrBizId) {
        this.AttrBizId = AttrBizId;
    }

    public ApiVarAttrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiVarAttrInfo(ApiVarAttrInfo source) {
        if (source.ApiVarId != null) {
            this.ApiVarId = new String(source.ApiVarId);
        }
        if (source.AttrBizId != null) {
            this.AttrBizId = new String(source.AttrBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiVarId", this.ApiVarId);
        this.setParamSimple(map, prefix + "AttrBizId", this.AttrBizId);

    }
}

