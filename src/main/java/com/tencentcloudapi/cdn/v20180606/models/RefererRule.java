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

public class RefererRule extends AbstractModel {

    /**
    * Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
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
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * Referer configuration types
`whitelist`: Allowlist
`blacklist`: Blocklist
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
`true`: Allow empty referer when `RefererType = whitelist`.
`false`: Reject empty refer when `RefererType = blacklist`.
    */
    @SerializedName("AllowEmpty")
    @Expose
    private Boolean AllowEmpty;

    /**
     * Get Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths. 
     * @return RuleType Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
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
     * @param RuleType Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
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
     * @return RulePaths Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
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
     * @param RulePaths Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get Referer configuration types
`whitelist`: Allowlist
`blacklist`: Blocklist 
     * @return RefererType Referer configuration types
`whitelist`: Allowlist
`blacklist`: Blocklist
     */
    public String getRefererType() {
        return this.RefererType;
    }

    /**
     * Set Referer configuration types
`whitelist`: Allowlist
`blacklist`: Blocklist
     * @param RefererType Referer configuration types
`whitelist`: Allowlist
`blacklist`: Blocklist
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
`true`: Allow empty referer when `RefererType = whitelist`.
`false`: Reject empty refer when `RefererType = blacklist`. 
     * @return AllowEmpty Whether to allow empty referer
`true`: Allow empty referer when `RefererType = whitelist`.
`false`: Reject empty refer when `RefererType = blacklist`.
     */
    public Boolean getAllowEmpty() {
        return this.AllowEmpty;
    }

    /**
     * Set Whether to allow empty referer
`true`: Allow empty referer when `RefererType = whitelist`.
`false`: Reject empty refer when `RefererType = blacklist`.
     * @param AllowEmpty Whether to allow empty referer
`true`: Allow empty referer when `RefererType = whitelist`.
`false`: Reject empty refer when `RefererType = blacklist`.
     */
    public void setAllowEmpty(Boolean AllowEmpty) {
        this.AllowEmpty = AllowEmpty;
    }

    public RefererRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefererRule(RefererRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.RefererType != null) {
            this.RefererType = new String(source.RefererType);
        }
        if (source.Referers != null) {
            this.Referers = new String[source.Referers.length];
            for (int i = 0; i < source.Referers.length; i++) {
                this.Referers[i] = new String(source.Referers[i]);
            }
        }
        if (source.AllowEmpty != null) {
            this.AllowEmpty = new Boolean(source.AllowEmpty);
        }
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

