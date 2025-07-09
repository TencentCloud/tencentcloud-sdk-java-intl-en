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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderPathRule extends AbstractModel {

    /**
    * HTTP header setting method. Valid values: add (add header), set (set header), del (delete header).
Request header currently does not support `set`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * HTTP header name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * HTTP header value, which is optional when it is `del`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
    * Type of effective URL path rule. Valid values: all (all paths), file (file extension), directory (directory), path (absolute path).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * URL path or file type list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get HTTP header setting method. Valid values: add (add header), set (set header), del (delete header).
Request header currently does not support `set`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeaderMode HTTP header setting method. Valid values: add (add header), set (set header), del (delete header).
Request header currently does not support `set`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set HTTP header setting method. Valid values: add (add header), set (set header), del (delete header).
Request header currently does not support `set`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeaderMode HTTP header setting method. Valid values: add (add header), set (set header), del (delete header).
Request header currently does not support `set`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get HTTP header name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeaderName HTTP header name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set HTTP header name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeaderName HTTP header name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get HTTP header value, which is optional when it is `del`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeaderValue HTTP header value, which is optional when it is `del`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set HTTP header value, which is optional when it is `del`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeaderValue HTTP header value, which is optional when it is `del`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Get Type of effective URL path rule. Valid values: all (all paths), file (file extension), directory (directory), path (absolute path).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RuleType Type of effective URL path rule. Valid values: all (all paths), file (file extension), directory (directory), path (absolute path).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Type of effective URL path rule. Valid values: all (all paths), file (file extension), directory (directory), path (absolute path).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RuleType Type of effective URL path rule. Valid values: all (all paths), file (file extension), directory (directory), path (absolute path).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get URL path or file type list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RulePaths URL path or file type list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set URL path or file type list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RulePaths URL path or file type list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    public HttpHeaderPathRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpHeaderPathRule(HttpHeaderPathRule source) {
        if (source.HeaderMode != null) {
            this.HeaderMode = new String(source.HeaderMode);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
        if (source.HeaderValue != null) {
            this.HeaderValue = new String(source.HeaderValue);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderMode", this.HeaderMode);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

