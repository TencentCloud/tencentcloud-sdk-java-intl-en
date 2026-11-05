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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRuleAutoUpdate extends AbstractModel {

    /**
    * Whether automatic update to the latest version is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
    */
    @SerializedName("AutoUpdateToLatestVersion")
    @Expose
    private String AutoUpdateToLatestVersion;

    /**
    * Currently used version in ISO 8601 format, for example, 2023-12-21T12:00:32Z. Empty by default. Output only.
    */
    @SerializedName("RulesetVersion")
    @Expose
    private String RulesetVersion;

    /**
     * Get Whether automatic update to the latest version is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li> 
     * @return AutoUpdateToLatestVersion Whether automatic update to the latest version is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
     */
    public String getAutoUpdateToLatestVersion() {
        return this.AutoUpdateToLatestVersion;
    }

    /**
     * Set Whether automatic update to the latest version is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
     * @param AutoUpdateToLatestVersion Whether automatic update to the latest version is enabled. Valid values: <li>on: enabled</li><li>off: disabled</li>
     */
    public void setAutoUpdateToLatestVersion(String AutoUpdateToLatestVersion) {
        this.AutoUpdateToLatestVersion = AutoUpdateToLatestVersion;
    }

    /**
     * Get Currently used version in ISO 8601 format, for example, 2023-12-21T12:00:32Z. Empty by default. Output only. 
     * @return RulesetVersion Currently used version in ISO 8601 format, for example, 2023-12-21T12:00:32Z. Empty by default. Output only.
     */
    public String getRulesetVersion() {
        return this.RulesetVersion;
    }

    /**
     * Set Currently used version in ISO 8601 format, for example, 2023-12-21T12:00:32Z. Empty by default. Output only.
     * @param RulesetVersion Currently used version in ISO 8601 format, for example, 2023-12-21T12:00:32Z. Empty by default. Output only.
     */
    public void setRulesetVersion(String RulesetVersion) {
        this.RulesetVersion = RulesetVersion;
    }

    public ManagedRuleAutoUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleAutoUpdate(ManagedRuleAutoUpdate source) {
        if (source.AutoUpdateToLatestVersion != null) {
            this.AutoUpdateToLatestVersion = new String(source.AutoUpdateToLatestVersion);
        }
        if (source.RulesetVersion != null) {
            this.RulesetVersion = new String(source.RulesetVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoUpdateToLatestVersion", this.AutoUpdateToLatestVersion);
        this.setParamSimple(map, prefix + "RulesetVersion", this.RulesetVersion);

    }
}

