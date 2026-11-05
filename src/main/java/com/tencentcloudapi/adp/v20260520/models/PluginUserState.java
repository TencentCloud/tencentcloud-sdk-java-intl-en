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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginUserState extends AbstractModel {

    /**
    * Whether the plug-in has been bookmarked
    */
    @SerializedName("IsFavorite")
    @Expose
    private Boolean IsFavorite;

    /**
    * Whether it is in the plug-in allowlist
    */
    @SerializedName("IsInWhiteList")
    @Expose
    private Boolean IsInWhiteList;

    /**
    * <p>Allowlist type, used to represent whether the current user can use this plug-in directly.</p><p>Enumeration values:</p><ul><li>0: Not on the allowlist, fully available</li><li>1: Current user in allowlist</li><li>2: Current user not in allowlist, submit an application</li></ul>
    */
    @SerializedName("WhiteListType")
    @Expose
    private Long WhiteListType;

    /**
     * Get Whether the plug-in has been bookmarked 
     * @return IsFavorite Whether the plug-in has been bookmarked
     */
    public Boolean getIsFavorite() {
        return this.IsFavorite;
    }

    /**
     * Set Whether the plug-in has been bookmarked
     * @param IsFavorite Whether the plug-in has been bookmarked
     */
    public void setIsFavorite(Boolean IsFavorite) {
        this.IsFavorite = IsFavorite;
    }

    /**
     * Get Whether it is in the plug-in allowlist 
     * @return IsInWhiteList Whether it is in the plug-in allowlist
     */
    public Boolean getIsInWhiteList() {
        return this.IsInWhiteList;
    }

    /**
     * Set Whether it is in the plug-in allowlist
     * @param IsInWhiteList Whether it is in the plug-in allowlist
     */
    public void setIsInWhiteList(Boolean IsInWhiteList) {
        this.IsInWhiteList = IsInWhiteList;
    }

    /**
     * Get <p>Allowlist type, used to represent whether the current user can use this plug-in directly.</p><p>Enumeration values:</p><ul><li>0: Not on the allowlist, fully available</li><li>1: Current user in allowlist</li><li>2: Current user not in allowlist, submit an application</li></ul> 
     * @return WhiteListType <p>Allowlist type, used to represent whether the current user can use this plug-in directly.</p><p>Enumeration values:</p><ul><li>0: Not on the allowlist, fully available</li><li>1: Current user in allowlist</li><li>2: Current user not in allowlist, submit an application</li></ul>
     */
    public Long getWhiteListType() {
        return this.WhiteListType;
    }

    /**
     * Set <p>Allowlist type, used to represent whether the current user can use this plug-in directly.</p><p>Enumeration values:</p><ul><li>0: Not on the allowlist, fully available</li><li>1: Current user in allowlist</li><li>2: Current user not in allowlist, submit an application</li></ul>
     * @param WhiteListType <p>Allowlist type, used to represent whether the current user can use this plug-in directly.</p><p>Enumeration values:</p><ul><li>0: Not on the allowlist, fully available</li><li>1: Current user in allowlist</li><li>2: Current user not in allowlist, submit an application</li></ul>
     */
    public void setWhiteListType(Long WhiteListType) {
        this.WhiteListType = WhiteListType;
    }

    public PluginUserState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginUserState(PluginUserState source) {
        if (source.IsFavorite != null) {
            this.IsFavorite = new Boolean(source.IsFavorite);
        }
        if (source.IsInWhiteList != null) {
            this.IsInWhiteList = new Boolean(source.IsInWhiteList);
        }
        if (source.WhiteListType != null) {
            this.WhiteListType = new Long(source.WhiteListType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsFavorite", this.IsFavorite);
        this.setParamSimple(map, prefix + "IsInWhiteList", this.IsInWhiteList);
        this.setParamSimple(map, prefix + "WhiteListType", this.WhiteListType);

    }
}

