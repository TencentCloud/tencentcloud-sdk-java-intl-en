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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlobalDomainModifyRespResp extends AbstractModel {

    /**
    * Operation result. Valid values: 0: Succeeded; 1: Exists in the allowlist; 2: Exists in the blocklist. 
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get Operation result. Valid values: 0: Succeeded; 1: Exists in the allowlist; 2: Exists in the blocklist.  
     * @return Result Operation result. Valid values: 0: Succeeded; 1: Exists in the allowlist; 2: Exists in the blocklist. 
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set Operation result. Valid values: 0: Succeeded; 1: Exists in the allowlist; 2: Exists in the blocklist. 
     * @param Result Operation result. Valid values: 0: Succeeded; 1: Exists in the allowlist; 2: Exists in the blocklist. 
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public GlobalDomainModifyRespResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalDomainModifyRespResp(GlobalDomainModifyRespResp source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

