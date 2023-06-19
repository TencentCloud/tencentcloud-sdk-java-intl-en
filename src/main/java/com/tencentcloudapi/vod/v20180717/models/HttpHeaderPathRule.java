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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderPathRule extends AbstractModel{

    /**
    * HTTP header setting methods: <li>set: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.</li> <li>del: deletes a header parameter.</li> <li>add: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.</li>
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * HTTP header name. Up to 100 characters can be set.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * HTTP header value. Up to 1000 characters can be set.<li>Not required when Mode is del.</li> <li>Required when Mode is add/set.</li>
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
    * Rule types:<li>all: Apply to all files.</li> <li>file: Apply to files with the specified suffixes.</li> <li>directory: Apply to specified paths.</li> <li>path: Apply to specified absolute paths.</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Content for each RuleType:<li>For all, enter a wildcard *.</li> <li>For file, enter a suffix, e.g., jpg or txt.</li> <li>For directory, enter a path, e.g., /xxx/test/.</li> <li>For path, enter an absolute path, e.g., /xxx/test.html.</li>
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get HTTP header setting methods: <li>set: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.</li> <li>del: deletes a header parameter.</li> <li>add: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.</li> 
     * @return HeaderMode HTTP header setting methods: <li>set: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.</li> <li>del: deletes a header parameter.</li> <li>add: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.</li>
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set HTTP header setting methods: <li>set: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.</li> <li>del: deletes a header parameter.</li> <li>add: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.</li>
     * @param HeaderMode HTTP header setting methods: <li>set: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.</li> <li>del: deletes a header parameter.</li> <li>add: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.</li>
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get HTTP header name. Up to 100 characters can be set. 
     * @return HeaderName HTTP header name. Up to 100 characters can be set.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set HTTP header name. Up to 100 characters can be set.
     * @param HeaderName HTTP header name. Up to 100 characters can be set.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get HTTP header value. Up to 1000 characters can be set.<li>Not required when Mode is del.</li> <li>Required when Mode is add/set.</li> 
     * @return HeaderValue HTTP header value. Up to 1000 characters can be set.<li>Not required when Mode is del.</li> <li>Required when Mode is add/set.</li>
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set HTTP header value. Up to 1000 characters can be set.<li>Not required when Mode is del.</li> <li>Required when Mode is add/set.</li>
     * @param HeaderValue HTTP header value. Up to 1000 characters can be set.<li>Not required when Mode is del.</li> <li>Required when Mode is add/set.</li>
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Get Rule types:<li>all: Apply to all files.</li> <li>file: Apply to files with the specified suffixes.</li> <li>directory: Apply to specified paths.</li> <li>path: Apply to specified absolute paths.</li> 
     * @return RuleType Rule types:<li>all: Apply to all files.</li> <li>file: Apply to files with the specified suffixes.</li> <li>directory: Apply to specified paths.</li> <li>path: Apply to specified absolute paths.</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:<li>all: Apply to all files.</li> <li>file: Apply to files with the specified suffixes.</li> <li>directory: Apply to specified paths.</li> <li>path: Apply to specified absolute paths.</li>
     * @param RuleType Rule types:<li>all: Apply to all files.</li> <li>file: Apply to files with the specified suffixes.</li> <li>directory: Apply to specified paths.</li> <li>path: Apply to specified absolute paths.</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Content for each RuleType:<li>For all, enter a wildcard *.</li> <li>For file, enter a suffix, e.g., jpg or txt.</li> <li>For directory, enter a path, e.g., /xxx/test/.</li> <li>For path, enter an absolute path, e.g., /xxx/test.html.</li> 
     * @return RulePaths Content for each RuleType:<li>For all, enter a wildcard *.</li> <li>For file, enter a suffix, e.g., jpg or txt.</li> <li>For directory, enter a path, e.g., /xxx/test/.</li> <li>For path, enter an absolute path, e.g., /xxx/test.html.</li>
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each RuleType:<li>For all, enter a wildcard *.</li> <li>For file, enter a suffix, e.g., jpg or txt.</li> <li>For directory, enter a path, e.g., /xxx/test/.</li> <li>For path, enter an absolute path, e.g., /xxx/test.html.</li>
     * @param RulePaths Content for each RuleType:<li>For all, enter a wildcard *.</li> <li>For file, enter a suffix, e.g., jpg or txt.</li> <li>For directory, enter a path, e.g., /xxx/test/.</li> <li>For path, enter an absolute path, e.g., /xxx/test.html.</li>
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

