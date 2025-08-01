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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCustomMFATokenInfoRequest extends AbstractModel {

    /**
    * Custom multi-factor verification Token
    */
    @SerializedName("MFAToken")
    @Expose
    private String MFAToken;

    /**
     * Get Custom multi-factor verification Token 
     * @return MFAToken Custom multi-factor verification Token
     */
    public String getMFAToken() {
        return this.MFAToken;
    }

    /**
     * Set Custom multi-factor verification Token
     * @param MFAToken Custom multi-factor verification Token
     */
    public void setMFAToken(String MFAToken) {
        this.MFAToken = MFAToken;
    }

    public GetCustomMFATokenInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCustomMFATokenInfoRequest(GetCustomMFATokenInfoRequest source) {
        if (source.MFAToken != null) {
            this.MFAToken = new String(source.MFAToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MFAToken", this.MFAToken);

    }
}

