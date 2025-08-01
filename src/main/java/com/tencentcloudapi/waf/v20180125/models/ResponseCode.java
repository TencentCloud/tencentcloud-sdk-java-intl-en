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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseCode extends AbstractModel {

    /**
    * If successful, return a success; if failed, return Cloud API Defined Error Codes
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * If successful, return a success; if failed, return the secondary error code of WAF Definition
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get If successful, return a success; if failed, return Cloud API Defined Error Codes 
     * @return Code If successful, return a success; if failed, return Cloud API Defined Error Codes
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set If successful, return a success; if failed, return Cloud API Defined Error Codes
     * @param Code If successful, return a success; if failed, return Cloud API Defined Error Codes
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get If successful, return a success; if failed, return the secondary error code of WAF Definition 
     * @return Message If successful, return a success; if failed, return the secondary error code of WAF Definition
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set If successful, return a success; if failed, return the secondary error code of WAF Definition
     * @param Message If successful, return a success; if failed, return the secondary error code of WAF Definition
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ResponseCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseCode(ResponseCode source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

