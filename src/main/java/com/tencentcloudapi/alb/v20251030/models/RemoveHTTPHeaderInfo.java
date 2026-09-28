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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveHTTPHeaderInfo extends AbstractModel {

    /**
    * Key of the HTTP Header to delete. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, x-forwarded-port, and server.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get Key of the HTTP Header to delete. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, x-forwarded-port, and server. 
     * @return Key Key of the HTTP Header to delete. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, x-forwarded-port, and server.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of the HTTP Header to delete. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, x-forwarded-port, and server.
     * @param Key Key of the HTTP Header to delete. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, x-forwarded-port, and server.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public RemoveHTTPHeaderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveHTTPHeaderInfo(RemoveHTTPHeaderInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

