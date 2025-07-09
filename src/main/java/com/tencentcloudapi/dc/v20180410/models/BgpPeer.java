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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BgpPeer extends AbstractModel {

    /**
    * User-side BGP Asn.
    */
    @SerializedName("Asn")
    @Expose
    private Long Asn;

    /**
    * User-side BGP key.
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
     * Get User-side BGP Asn. 
     * @return Asn User-side BGP Asn.
     */
    public Long getAsn() {
        return this.Asn;
    }

    /**
     * Set User-side BGP Asn.
     * @param Asn User-side BGP Asn.
     */
    public void setAsn(Long Asn) {
        this.Asn = Asn;
    }

    /**
     * Get User-side BGP key. 
     * @return AuthKey User-side BGP key.
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set User-side BGP key.
     * @param AuthKey User-side BGP key.
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    public BgpPeer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BgpPeer(BgpPeer source) {
        if (source.Asn != null) {
            this.Asn = new Long(source.Asn);
        }
        if (source.AuthKey != null) {
            this.AuthKey = new String(source.AuthKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Asn", this.Asn);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);

    }
}

