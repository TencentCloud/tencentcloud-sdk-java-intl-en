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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookTarget extends AbstractModel{

    /**
    * Target address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Custom headers
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
     * Get Target address 
     * @return Address Target address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Target address
     * @param Address Target address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Custom headers 
     * @return Headers Custom headers
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Custom headers
     * @param Headers Custom headers
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    public WebhookTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookTarget(WebhookTarget source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Headers != null) {
            this.Headers = new Header[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new Header(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

