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

public class GetWxNFCResultRequest extends AbstractModel {

    /**
    * <p>Unique identifier ID returned by the frontend NFC SDK</p>
    */
    @SerializedName("NFCToken")
    @Expose
    private String NFCToken;

    /**
     * Get <p>Unique identifier ID returned by the frontend NFC SDK</p> 
     * @return NFCToken <p>Unique identifier ID returned by the frontend NFC SDK</p>
     */
    public String getNFCToken() {
        return this.NFCToken;
    }

    /**
     * Set <p>Unique identifier ID returned by the frontend NFC SDK</p>
     * @param NFCToken <p>Unique identifier ID returned by the frontend NFC SDK</p>
     */
    public void setNFCToken(String NFCToken) {
        this.NFCToken = NFCToken;
    }

    public GetWxNFCResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWxNFCResultRequest(GetWxNFCResultRequest source) {
        if (source.NFCToken != null) {
            this.NFCToken = new String(source.NFCToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NFCToken", this.NFCToken);

    }
}

