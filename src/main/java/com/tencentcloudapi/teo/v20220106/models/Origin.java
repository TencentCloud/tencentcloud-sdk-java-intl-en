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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel {

    /**
    * Origin-pull protocol.
`http`: Switch HTTPS requests to HTTP
`follow`: Follow the protocol of the request.
`https`: Switch HTTP requests to HTTPS. This only supports port 443 on the origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
     * Get Origin-pull protocol.
`http`: Switch HTTPS requests to HTTP
`follow`: Follow the protocol of the request.
`https`: Switch HTTP requests to HTTPS. This only supports port 443 on the origin server.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginPullProtocol Origin-pull protocol.
`http`: Switch HTTPS requests to HTTP
`follow`: Follow the protocol of the request.
`https`: Switch HTTP requests to HTTPS. This only supports port 443 on the origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Origin-pull protocol.
`http`: Switch HTTPS requests to HTTP
`follow`: Follow the protocol of the request.
`https`: Switch HTTP requests to HTTPS. This only supports port 443 on the origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginPullProtocol Origin-pull protocol.
`http`: Switch HTTPS requests to HTTP
`follow`: Follow the protocol of the request.
`https`: Switch HTTP requests to HTTPS. This only supports port 443 on the origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    public Origin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Origin(Origin source) {
        if (source.OriginPullProtocol != null) {
            this.OriginPullProtocol = new String(source.OriginPullProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginPullProtocol", this.OriginPullProtocol);

    }
}

