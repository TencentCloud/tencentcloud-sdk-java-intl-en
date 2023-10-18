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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSdkVerificationResultRequest extends AbstractModel {

    /**
    * The token used to identify an SDK-based verification process.
    */
    @SerializedName("SdkToken")
    @Expose
    private String SdkToken;

    /**
     * Get The token used to identify an SDK-based verification process. 
     * @return SdkToken The token used to identify an SDK-based verification process.
     */
    public String getSdkToken() {
        return this.SdkToken;
    }

    /**
     * Set The token used to identify an SDK-based verification process.
     * @param SdkToken The token used to identify an SDK-based verification process.
     */
    public void setSdkToken(String SdkToken) {
        this.SdkToken = SdkToken;
    }

    public GetSdkVerificationResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSdkVerificationResultRequest(GetSdkVerificationResultRequest source) {
        if (source.SdkToken != null) {
            this.SdkToken = new String(source.SdkToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkToken", this.SdkToken);

    }
}

