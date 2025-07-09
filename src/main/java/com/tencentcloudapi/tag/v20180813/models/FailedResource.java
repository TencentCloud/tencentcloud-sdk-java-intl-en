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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedResource extends AbstractModel {

    /**
    * Six-segment descriptions of failed resources
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Error code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Error message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Six-segment descriptions of failed resources 
     * @return Resource Six-segment descriptions of failed resources
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Six-segment descriptions of failed resources
     * @param Resource Six-segment descriptions of failed resources
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Error code 
     * @return Code Error code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Error code
     * @param Code Error code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Error message 
     * @return Message Error message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message
     * @param Message Error message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public FailedResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailedResource(FailedResource source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
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
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

