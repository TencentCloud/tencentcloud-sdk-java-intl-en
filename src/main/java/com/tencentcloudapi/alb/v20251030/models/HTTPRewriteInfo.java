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

public class HTTPRewriteInfo extends AbstractModel {

    /**
    * <p>Rewritten host address. Default value: ${host}. Length: 3-128 characters. Supported character sets: a-z 0-9 _ . -.</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Rewrite path. Default value: ${path}. Length: 1–128 characters. Supported character sets: a-z A-Z 0-9 ? = _ . - / : .</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Rewritten query string. Default value: ${query}. Length: 1–128 characters. Supports printable characters. Does not support #[]{}|&lt;&gt;&amp; or spaces.</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>Rewritten host address. Default value: ${host}. Length: 3-128 characters. Supported character sets: a-z 0-9 _ . -.</p> 
     * @return Host <p>Rewritten host address. Default value: ${host}. Length: 3-128 characters. Supported character sets: a-z 0-9 _ . -.</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Rewritten host address. Default value: ${host}. Length: 3-128 characters. Supported character sets: a-z 0-9 _ . -.</p>
     * @param Host <p>Rewritten host address. Default value: ${host}. Length: 3-128 characters. Supported character sets: a-z 0-9 _ . -.</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Rewrite path. Default value: ${path}. Length: 1–128 characters. Supported character sets: a-z A-Z 0-9 ? = _ . - / : .</p> 
     * @return Path <p>Rewrite path. Default value: ${path}. Length: 1–128 characters. Supported character sets: a-z A-Z 0-9 ? = _ . - / : .</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Rewrite path. Default value: ${path}. Length: 1–128 characters. Supported character sets: a-z A-Z 0-9 ? = _ . - / : .</p>
     * @param Path <p>Rewrite path. Default value: ${path}. Length: 1–128 characters. Supported character sets: a-z A-Z 0-9 ? = _ . - / : .</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Rewritten query string. Default value: ${query}. Length: 1–128 characters. Supports printable characters. Does not support #[]{}|&lt;&gt;&amp; or spaces.</p> 
     * @return Query <p>Rewritten query string. Default value: ${query}. Length: 1–128 characters. Supports printable characters. Does not support #[]{}|&lt;&gt;&amp; or spaces.</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Rewritten query string. Default value: ${query}. Length: 1–128 characters. Supports printable characters. Does not support #[]{}|&lt;&gt;&amp; or spaces.</p>
     * @param Query <p>Rewritten query string. Default value: ${query}. Length: 1–128 characters. Supports printable characters. Does not support #[]{}|&lt;&gt;&amp; or spaces.</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public HTTPRewriteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPRewriteInfo(HTTPRewriteInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

