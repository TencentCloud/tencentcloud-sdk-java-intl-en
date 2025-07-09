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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlRule extends AbstractModel {

    /**
    * requestHeader: access control over request header
url: access control over access URL
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Blocked content
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * on: regular match
off: exact match
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * This parameter is required only if `RuleType` is `requestHeader`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleHeader")
    @Expose
    private String RuleHeader;

    /**
     * Get requestHeader: access control over request header
url: access control over access URL
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleType requestHeader: access control over request header
url: access control over access URL
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set requestHeader: access control over request header
url: access control over access URL
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleType requestHeader: access control over request header
url: access control over access URL
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Blocked content
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleContent Blocked content
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set Blocked content
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleContent Blocked content
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get on: regular match
off: exact match
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Regex on: regular match
off: exact match
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set on: regular match
off: exact match
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Regex on: regular match
off: exact match
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get This parameter is required only if `RuleType` is `requestHeader`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleHeader This parameter is required only if `RuleType` is `requestHeader`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleHeader() {
        return this.RuleHeader;
    }

    /**
     * Set This parameter is required only if `RuleType` is `requestHeader`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleHeader This parameter is required only if `RuleType` is `requestHeader`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleHeader(String RuleHeader) {
        this.RuleHeader = RuleHeader;
    }

    public AccessControlRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlRule(AccessControlRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.RuleHeader != null) {
            this.RuleHeader = new String(source.RuleHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "RuleHeader", this.RuleHeader);

    }
}

