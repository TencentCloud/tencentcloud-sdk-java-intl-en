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

public class RefererRule extends AbstractModel{

    /**
    * Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
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
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * Referer configuration types
whitelist: whitelist
blacklist: blacklist
    */
    @SerializedName("RefererType")
    @Expose
    private String RefererType;

    /**
    * Referer content list
    */
    @SerializedName("Referers")
    @Expose
    private String [] Referers;

    /**
    * Whether to allow empty referer
true: allow empty referer
false: do not allow empty referer
    */
    @SerializedName("AllowEmpty")
    @Expose
    private Boolean AllowEmpty;

    /**
     * Get Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect 
     * @return RuleType Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
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
     * @param RuleType Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
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
     * @return RulePaths Matching content under the corresponding types for RuleType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
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
     * @param RulePaths Matching content under the corresponding types for RuleType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get Referer configuration types
whitelist: whitelist
blacklist: blacklist 
     * @return RefererType Referer configuration types
whitelist: whitelist
blacklist: blacklist
     */
    public String getRefererType() {
        return this.RefererType;
    }

    /**
     * Set Referer configuration types
whitelist: whitelist
blacklist: blacklist
     * @param RefererType Referer configuration types
whitelist: whitelist
blacklist: blacklist
     */
    public void setRefererType(String RefererType) {
        this.RefererType = RefererType;
    }

    /**
     * Get Referer content list 
     * @return Referers Referer content list
     */
    public String [] getReferers() {
        return this.Referers;
    }

    /**
     * Set Referer content list
     * @param Referers Referer content list
     */
    public void setReferers(String [] Referers) {
        this.Referers = Referers;
    }

    /**
     * Get Whether to allow empty referer
true: allow empty referer
false: do not allow empty referer 
     * @return AllowEmpty Whether to allow empty referer
true: allow empty referer
false: do not allow empty referer
     */
    public Boolean getAllowEmpty() {
        return this.AllowEmpty;
    }

    /**
     * Set Whether to allow empty referer
true: allow empty referer
false: do not allow empty referer
     * @param AllowEmpty Whether to allow empty referer
true: allow empty referer
false: do not allow empty referer
     */
    public void setAllowEmpty(Boolean AllowEmpty) {
        this.AllowEmpty = AllowEmpty;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "RefererType", this.RefererType);
        this.setParamArraySimple(map, prefix + "Referers.", this.Referers);
        this.setParamSimple(map, prefix + "AllowEmpty", this.AllowEmpty);

    }
}

