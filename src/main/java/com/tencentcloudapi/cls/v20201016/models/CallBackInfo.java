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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallBackInfo extends AbstractModel {

    /**
    * `Body` during callback
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * `Headers` during callback
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
     * Get `Body` during callback 
     * @return Body `Body` during callback
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set `Body` during callback
     * @param Body `Body` during callback
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get `Headers` during callback
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Headers `Headers` during callback
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set `Headers` during callback
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Headers `Headers` during callback
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    public CallBackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallBackInfo(CallBackInfo source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);

    }
}

