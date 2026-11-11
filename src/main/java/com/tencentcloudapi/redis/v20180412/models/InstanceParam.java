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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceParam extends AbstractModel {

    /**
    * Parameter name. For example, timeout. For customizable parameters, see <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">Parameter Configuration</a>.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Set the running value corresponding to the parameter name. For example, the running value corresponding to timeout can be set to 120, in seconds (s). When the client connection idle time reaches 120 s, the connection closed. For more parameter value information, please refer to <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">parameter configuration</a>.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Parameter name. For example, timeout. For customizable parameters, see <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">Parameter Configuration</a>. 
     * @return Key Parameter name. For example, timeout. For customizable parameters, see <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">Parameter Configuration</a>.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Parameter name. For example, timeout. For customizable parameters, see <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">Parameter Configuration</a>.
     * @param Key Parameter name. For example, timeout. For customizable parameters, see <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">Parameter Configuration</a>.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Set the running value corresponding to the parameter name. For example, the running value corresponding to timeout can be set to 120, in seconds (s). When the client connection idle time reaches 120 s, the connection closed. For more parameter value information, please refer to <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">parameter configuration</a>. 
     * @return Value Set the running value corresponding to the parameter name. For example, the running value corresponding to timeout can be set to 120, in seconds (s). When the client connection idle time reaches 120 s, the connection closed. For more parameter value information, please refer to <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">parameter configuration</a>.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Set the running value corresponding to the parameter name. For example, the running value corresponding to timeout can be set to 120, in seconds (s). When the client connection idle time reaches 120 s, the connection closed. For more parameter value information, please refer to <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">parameter configuration</a>.
     * @param Value Set the running value corresponding to the parameter name. For example, the running value corresponding to timeout can be set to 120, in seconds (s). When the client connection idle time reaches 120 s, the connection closed. For more parameter value information, please refer to <a href="https://www.tencentcloud.com/document/product/239/49925?from_cn_redirect=1">parameter configuration</a>.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public InstanceParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceParam(InstanceParam source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

