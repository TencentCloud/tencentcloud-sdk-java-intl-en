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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpHeaderPathRule extends AbstractModel{

    /**
    * HTTP header setting method
add: add header. If a header exists, then there will be a repeated header.
set: only supports origin-pull header configuration. If a header exists, it will be overwritten. If one does not exist, then the header will be added.
del: delete header
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * HTTP header name. Up to 100 characters can be set.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * HTTP header value. Up to 1000 characters can be set.
It is not required when Mode is del
It is required when Mode is add/set
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
    * Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Matching content under the corresponding types for RuleType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get HTTP header setting method
add: add header. If a header exists, then there will be a repeated header.
set: only supports origin-pull header configuration. If a header exists, it will be overwritten. If one does not exist, then the header will be added.
del: delete header
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeaderMode HTTP header setting method
add: add header. If a header exists, then there will be a repeated header.
set: only supports origin-pull header configuration. If a header exists, it will be overwritten. If one does not exist, then the header will be added.
del: delete header
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set HTTP header setting method
add: add header. If a header exists, then there will be a repeated header.
set: only supports origin-pull header configuration. If a header exists, it will be overwritten. If one does not exist, then the header will be added.
del: delete header
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeaderMode HTTP header setting method
add: add header. If a header exists, then there will be a repeated header.
set: only supports origin-pull header configuration. If a header exists, it will be overwritten. If one does not exist, then the header will be added.
del: delete header
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get HTTP header name. Up to 100 characters can be set.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeaderName HTTP header name. Up to 100 characters can be set.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set HTTP header name. Up to 100 characters can be set.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeaderName HTTP header name. Up to 100 characters can be set.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get HTTP header value. Up to 1000 characters can be set.
It is not required when Mode is del
It is required when Mode is add/set
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeaderValue HTTP header value. Up to 1000 characters can be set.
It is not required when Mode is del
It is required when Mode is add/set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set HTTP header value. Up to 1000 characters can be set.
It is not required when Mode is del
It is required when Mode is add/set
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeaderValue HTTP header value. Up to 1000 characters can be set.
It is not required when Mode is del
It is required when Mode is add/set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Get Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RuleType Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RuleType Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Matching content under the corresponding types for RuleType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RulePaths Matching content under the corresponding types for RuleType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Matching content under the corresponding types for RuleType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RulePaths Matching content under the corresponding types for RuleType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
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

