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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveDomainRefererRequest extends AbstractModel{

    /**
    * Playback domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to enable referer allowlist/blocklist authentication for the current domain name
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * List type. Valid values: `0` (blocklist), `1` (allowlist)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Whether to allow empty referer. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("AllowEmpty")
    @Expose
    private Long AllowEmpty;

    /**
    * Referer list. Separate items in it with semicolons (;).
    */
    @SerializedName("Rules")
    @Expose
    private String Rules;

    /**
     * Get Playback domain name 
     * @return DomainName Playback domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Playback domain name
     * @param DomainName Playback domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether to enable referer allowlist/blocklist authentication for the current domain name 
     * @return Enable Whether to enable referer allowlist/blocklist authentication for the current domain name
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable referer allowlist/blocklist authentication for the current domain name
     * @param Enable Whether to enable referer allowlist/blocklist authentication for the current domain name
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get List type. Valid values: `0` (blocklist), `1` (allowlist) 
     * @return Type List type. Valid values: `0` (blocklist), `1` (allowlist)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set List type. Valid values: `0` (blocklist), `1` (allowlist)
     * @param Type List type. Valid values: `0` (blocklist), `1` (allowlist)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to allow empty referer. Valid values: `0` (no), `1` (yes) 
     * @return AllowEmpty Whether to allow empty referer. Valid values: `0` (no), `1` (yes)
     */
    public Long getAllowEmpty() {
        return this.AllowEmpty;
    }

    /**
     * Set Whether to allow empty referer. Valid values: `0` (no), `1` (yes)
     * @param AllowEmpty Whether to allow empty referer. Valid values: `0` (no), `1` (yes)
     */
    public void setAllowEmpty(Long AllowEmpty) {
        this.AllowEmpty = AllowEmpty;
    }

    /**
     * Get Referer list. Separate items in it with semicolons (;). 
     * @return Rules Referer list. Separate items in it with semicolons (;).
     */
    public String getRules() {
        return this.Rules;
    }

    /**
     * Set Referer list. Separate items in it with semicolons (;).
     * @param Rules Referer list. Separate items in it with semicolons (;).
     */
    public void setRules(String Rules) {
        this.Rules = Rules;
    }

    public ModifyLiveDomainRefererRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveDomainRefererRequest(ModifyLiveDomainRefererRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AllowEmpty != null) {
            this.AllowEmpty = new Long(source.AllowEmpty);
        }
        if (source.Rules != null) {
            this.Rules = new String(source.Rules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AllowEmpty", this.AllowEmpty);
        this.setParamSimple(map, prefix + "Rules", this.Rules);

    }
}

