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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderPathRule extends AbstractModel {

    /**
    * HTTP header setting methods
`set`: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.
`del`: deletes a header parameter.
`add`: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * HTTP header name. Up to 100 characters can be set.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * HTTP header value. Up to 1000 characters can be set.
Not required when Mode is del
Required when Mode is add/set
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
    * Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get HTTP header setting methods
`set`: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.
`del`: deletes a header parameter.
`add`: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return HeaderMode HTTP header setting methods
`set`: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.
`del`: deletes a header parameter.
`add`: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set HTTP header setting methods
`set`: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.
`del`: deletes a header parameter.
`add`: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param HeaderMode HTTP header setting methods
`set`: sets a value for an existing header parameter, a new header parameter, or multiple header parameters. Multiple header parameters will be merged into one.
`del`: deletes a header parameter.
`add`: adds a header parameter. By default, you can repeat the same action to add the same header parameter, which may affect browser response. Please consider the set operation first.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get HTTP header name. Up to 100 characters can be set.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HeaderName HTTP header name. Up to 100 characters can be set.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set HTTP header name. Up to 100 characters can be set.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HeaderName HTTP header name. Up to 100 characters can be set.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get HTTP header value. Up to 1000 characters can be set.
Not required when Mode is del
Required when Mode is add/set
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HeaderValue HTTP header value. Up to 1000 characters can be set.
Not required when Mode is del
Required when Mode is add/set
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set HTTP header value. Up to 1000 characters can be set.
Not required when Mode is del
Required when Mode is add/set
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HeaderValue HTTP header value. Up to 1000 characters can be set.
Not required when Mode is del
Required when Mode is add/set
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Get Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleType Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleType Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RulePaths Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RulePaths Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
Note: This field may return `null`, indicating that no valid value can be obtained.
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

