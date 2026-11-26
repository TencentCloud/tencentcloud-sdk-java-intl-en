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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginAuthenticationParameters extends AbstractModel {

    /**
    * Origin-pull authentication request attributes.
    */
    @SerializedName("RequestProperties")
    @Expose
    private OriginAuthenticationRequestProperties [] RequestProperties;

    /**
     * Get Origin-pull authentication request attributes. 
     * @return RequestProperties Origin-pull authentication request attributes.
     */
    public OriginAuthenticationRequestProperties [] getRequestProperties() {
        return this.RequestProperties;
    }

    /**
     * Set Origin-pull authentication request attributes.
     * @param RequestProperties Origin-pull authentication request attributes.
     */
    public void setRequestProperties(OriginAuthenticationRequestProperties [] RequestProperties) {
        this.RequestProperties = RequestProperties;
    }

    public OriginAuthenticationParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginAuthenticationParameters(OriginAuthenticationParameters source) {
        if (source.RequestProperties != null) {
            this.RequestProperties = new OriginAuthenticationRequestProperties[source.RequestProperties.length];
            for (int i = 0; i < source.RequestProperties.length; i++) {
                this.RequestProperties[i] = new OriginAuthenticationRequestProperties(source.RequestProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RequestProperties.", this.RequestProperties);

    }
}

