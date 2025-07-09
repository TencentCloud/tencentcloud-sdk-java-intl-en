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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWebVerificationResultRequest extends AbstractModel {

    /**
    * The token for the web-based verification, which is generated with the `ApplyWebVerificationToken` API.
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
     * Get The token for the web-based verification, which is generated with the `ApplyWebVerificationToken` API. 
     * @return BizToken The token for the web-based verification, which is generated with the `ApplyWebVerificationToken` API.
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set The token for the web-based verification, which is generated with the `ApplyWebVerificationToken` API.
     * @param BizToken The token for the web-based verification, which is generated with the `ApplyWebVerificationToken` API.
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    public GetWebVerificationResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWebVerificationResultRequest(GetWebVerificationResultRequest source) {
        if (source.BizToken != null) {
            this.BizToken = new String(source.BizToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);

    }
}

