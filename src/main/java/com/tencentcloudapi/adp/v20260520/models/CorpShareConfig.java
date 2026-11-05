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

public class CorpShareConfig extends AbstractModel {

    /**
    * <p>Business shared switch</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Share scope type. 1: all business staff, 2: designated account, 3: designated space</p>
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
    * <p>Business shared application tag</p>
    */
    @SerializedName("TagIdList")
    @Expose
    private String [] TagIdList;

    /**
    * <p>Shared range information (for users, StrId is uin and Name is username; for spaces, StrId is space ID and Name is space Name)</p>
    */
    @SerializedName("ShareScopeList")
    @Expose
    private Identity [] ShareScopeList;

    /**
     * Get <p>Business shared switch</p> 
     * @return Enabled <p>Business shared switch</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Business shared switch</p>
     * @param Enabled <p>Business shared switch</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Share scope type. 1: all business staff, 2: designated account, 3: designated space</p> 
     * @return ShareScope <p>Share scope type. 1: all business staff, 2: designated account, 3: designated space</p>
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set <p>Share scope type. 1: all business staff, 2: designated account, 3: designated space</p>
     * @param ShareScope <p>Share scope type. 1: all business staff, 2: designated account, 3: designated space</p>
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    /**
     * Get <p>Business shared application tag</p> 
     * @return TagIdList <p>Business shared application tag</p>
     */
    public String [] getTagIdList() {
        return this.TagIdList;
    }

    /**
     * Set <p>Business shared application tag</p>
     * @param TagIdList <p>Business shared application tag</p>
     */
    public void setTagIdList(String [] TagIdList) {
        this.TagIdList = TagIdList;
    }

    /**
     * Get <p>Shared range information (for users, StrId is uin and Name is username; for spaces, StrId is space ID and Name is space Name)</p> 
     * @return ShareScopeList <p>Shared range information (for users, StrId is uin and Name is username; for spaces, StrId is space ID and Name is space Name)</p>
     */
    public Identity [] getShareScopeList() {
        return this.ShareScopeList;
    }

    /**
     * Set <p>Shared range information (for users, StrId is uin and Name is username; for spaces, StrId is space ID and Name is space Name)</p>
     * @param ShareScopeList <p>Shared range information (for users, StrId is uin and Name is username; for spaces, StrId is space ID and Name is space Name)</p>
     */
    public void setShareScopeList(Identity [] ShareScopeList) {
        this.ShareScopeList = ShareScopeList;
    }

    public CorpShareConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CorpShareConfig(CorpShareConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ShareScope != null) {
            this.ShareScope = new Long(source.ShareScope);
        }
        if (source.TagIdList != null) {
            this.TagIdList = new String[source.TagIdList.length];
            for (int i = 0; i < source.TagIdList.length; i++) {
                this.TagIdList[i] = new String(source.TagIdList[i]);
            }
        }
        if (source.ShareScopeList != null) {
            this.ShareScopeList = new Identity[source.ShareScopeList.length];
            for (int i = 0; i < source.ShareScopeList.length; i++) {
                this.ShareScopeList[i] = new Identity(source.ShareScopeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "ShareScope", this.ShareScope);
        this.setParamArraySimple(map, prefix + "TagIdList.", this.TagIdList);
        this.setParamArrayObj(map, prefix + "ShareScopeList.", this.ShareScopeList);

    }
}

