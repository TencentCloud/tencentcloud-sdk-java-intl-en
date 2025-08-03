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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyEmbedTokenInfo extends AbstractModel {

    /**
    * Request result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
     * Get Request result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Result Request result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Request result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Result Request result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    public ApplyEmbedTokenInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyEmbedTokenInfo(ApplyEmbedTokenInfo source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

