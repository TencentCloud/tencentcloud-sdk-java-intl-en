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

public class SessionIdAffinityConfig extends AbstractModel {

    /**
    * <p>Transmission location of the session ID parameter. If left empty, it defaults to Header.</p><p>Enumeration values:</p><ul><li>Header: Pass the parameter in the request header.</li></ul><p>Default value: Header.</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Request header name for transmitting the session ID. Required when Source is Header.<br>If left empty, it defaults to EO-Infer-Session-Id.</p><p>Input limits: 1-64 characters in length. Only letters, digits, and hyphens are supported.</p><p>Default value: EO-Infer-Session-Id.</p>
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
     * Get <p>Transmission location of the session ID parameter. If left empty, it defaults to Header.</p><p>Enumeration values:</p><ul><li>Header: Pass the parameter in the request header.</li></ul><p>Default value: Header.</p> 
     * @return Source <p>Transmission location of the session ID parameter. If left empty, it defaults to Header.</p><p>Enumeration values:</p><ul><li>Header: Pass the parameter in the request header.</li></ul><p>Default value: Header.</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Transmission location of the session ID parameter. If left empty, it defaults to Header.</p><p>Enumeration values:</p><ul><li>Header: Pass the parameter in the request header.</li></ul><p>Default value: Header.</p>
     * @param Source <p>Transmission location of the session ID parameter. If left empty, it defaults to Header.</p><p>Enumeration values:</p><ul><li>Header: Pass the parameter in the request header.</li></ul><p>Default value: Header.</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Request header name for transmitting the session ID. Required when Source is Header.<br>If left empty, it defaults to EO-Infer-Session-Id.</p><p>Input limits: 1-64 characters in length. Only letters, digits, and hyphens are supported.</p><p>Default value: EO-Infer-Session-Id.</p> 
     * @return HeaderName <p>Request header name for transmitting the session ID. Required when Source is Header.<br>If left empty, it defaults to EO-Infer-Session-Id.</p><p>Input limits: 1-64 characters in length. Only letters, digits, and hyphens are supported.</p><p>Default value: EO-Infer-Session-Id.</p>
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set <p>Request header name for transmitting the session ID. Required when Source is Header.<br>If left empty, it defaults to EO-Infer-Session-Id.</p><p>Input limits: 1-64 characters in length. Only letters, digits, and hyphens are supported.</p><p>Default value: EO-Infer-Session-Id.</p>
     * @param HeaderName <p>Request header name for transmitting the session ID. Required when Source is Header.<br>If left empty, it defaults to EO-Infer-Session-Id.</p><p>Input limits: 1-64 characters in length. Only letters, digits, and hyphens are supported.</p><p>Default value: EO-Infer-Session-Id.</p>
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    public SessionIdAffinityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionIdAffinityConfig(SessionIdAffinityConfig source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);

    }
}

