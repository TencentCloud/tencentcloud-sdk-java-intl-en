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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDomainOperateErrors extends AbstractModel {

    /**
    * The domain that the API failed to operate.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The API 3.0 error code.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * The API 3.0 error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get The domain that the API failed to operate. 
     * @return DomainName The domain that the API failed to operate.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The domain that the API failed to operate.
     * @param DomainName The domain that the API failed to operate.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The API 3.0 error code. 
     * @return Code The API 3.0 error code.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set The API 3.0 error code.
     * @param Code The API 3.0 error code.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get The API 3.0 error message. 
     * @return Message The API 3.0 error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The API 3.0 error message.
     * @param Message The API 3.0 error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public BatchDomainOperateErrors() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDomainOperateErrors(BatchDomainOperateErrors source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
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
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

