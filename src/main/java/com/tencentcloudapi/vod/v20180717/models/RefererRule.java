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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefererRule extends AbstractModel {

    /**
    * Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: The specified path takes effect;</li>
<li>path: The absolute path takes effect.</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * referer configuration type. Value:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
    */
    @SerializedName("RefererType")
    @Expose
    private String RefererType;

    /**
    * referer list.
    */
    @SerializedName("Referers")
    @Expose
    private String [] Referers;

    /**
    * Whether to allow empty referer:
When the anti-hotlinking type is allowlist, true indicates that empty referer is allowed, and false indicates that empty referer is not allowed;
If the anti-hotlinking type is blocklist, true indicates to deny empty referers, and false indicates not to deny empty referers.
    */
    @SerializedName("AllowEmpty")
    @Expose
    private Boolean AllowEmpty;

    /**
     * Get Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: The specified path takes effect;</li>
<li>path: The absolute path takes effect.</li> 
     * @return RuleType Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: The specified path takes effect;</li>
<li>path: The absolute path takes effect.</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: The specified path takes effect;</li>
<li>path: The absolute path takes effect.</li>
     * @param RuleType Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: The specified path takes effect;</li>
<li>path: The absolute path takes effect.</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li> 
     * @return RulePaths Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
     * @param RulePaths Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get referer configuration type. Value:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li> 
     * @return RefererType referer configuration type. Value:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
     */
    public String getRefererType() {
        return this.RefererType;
    }

    /**
     * Set referer configuration type. Value:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
     * @param RefererType referer configuration type. Value:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
     */
    public void setRefererType(String RefererType) {
        this.RefererType = RefererType;
    }

    /**
     * Get referer list. 
     * @return Referers referer list.
     */
    public String [] getReferers() {
        return this.Referers;
    }

    /**
     * Set referer list.
     * @param Referers referer list.
     */
    public void setReferers(String [] Referers) {
        this.Referers = Referers;
    }

    /**
     * Get Whether to allow empty referer:
When the anti-hotlinking type is allowlist, true indicates that empty referer is allowed, and false indicates that empty referer is not allowed;
If the anti-hotlinking type is blocklist, true indicates to deny empty referers, and false indicates not to deny empty referers. 
     * @return AllowEmpty Whether to allow empty referer:
When the anti-hotlinking type is allowlist, true indicates that empty referer is allowed, and false indicates that empty referer is not allowed;
If the anti-hotlinking type is blocklist, true indicates to deny empty referers, and false indicates not to deny empty referers.
     */
    public Boolean getAllowEmpty() {
        return this.AllowEmpty;
    }

    /**
     * Set Whether to allow empty referer:
When the anti-hotlinking type is allowlist, true indicates that empty referer is allowed, and false indicates that empty referer is not allowed;
If the anti-hotlinking type is blocklist, true indicates to deny empty referers, and false indicates not to deny empty referers.
     * @param AllowEmpty Whether to allow empty referer:
When the anti-hotlinking type is allowlist, true indicates that empty referer is allowed, and false indicates that empty referer is not allowed;
If the anti-hotlinking type is blocklist, true indicates to deny empty referers, and false indicates not to deny empty referers.
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

