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

public class PluginOperation extends AbstractModel {

    /**
    * Whether external calls are allowed
    */
    @SerializedName("AllowExternalAccess")
    @Expose
    private Boolean AllowExternalAccess;

    /**
    * <p>Billing type.</p><p>Valid values:</p><ul><li>0: free</li><li>1: open beta</li><li>2: official fees</li></ul>
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * Plug-in category identifier
    */
    @SerializedName("CategoryKey")
    @Expose
    private String CategoryKey;

    /**
    * Plug-in overview
    */
    @SerializedName("Introduction")
    @Expose
    private String Introduction;

    /**
    * Whether it is a selection
    */
    @SerializedName("IsRecommended")
    @Expose
    private Boolean IsRecommended;

    /**
     * Get Whether external calls are allowed 
     * @return AllowExternalAccess Whether external calls are allowed
     */
    public Boolean getAllowExternalAccess() {
        return this.AllowExternalAccess;
    }

    /**
     * Set Whether external calls are allowed
     * @param AllowExternalAccess Whether external calls are allowed
     */
    public void setAllowExternalAccess(Boolean AllowExternalAccess) {
        this.AllowExternalAccess = AllowExternalAccess;
    }

    /**
     * Get <p>Billing type.</p><p>Valid values:</p><ul><li>0: free</li><li>1: open beta</li><li>2: official fees</li></ul> 
     * @return BillingType <p>Billing type.</p><p>Valid values:</p><ul><li>0: free</li><li>1: open beta</li><li>2: official fees</li></ul>
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set <p>Billing type.</p><p>Valid values:</p><ul><li>0: free</li><li>1: open beta</li><li>2: official fees</li></ul>
     * @param BillingType <p>Billing type.</p><p>Valid values:</p><ul><li>0: free</li><li>1: open beta</li><li>2: official fees</li></ul>
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get Plug-in category identifier 
     * @return CategoryKey Plug-in category identifier
     */
    public String getCategoryKey() {
        return this.CategoryKey;
    }

    /**
     * Set Plug-in category identifier
     * @param CategoryKey Plug-in category identifier
     */
    public void setCategoryKey(String CategoryKey) {
        this.CategoryKey = CategoryKey;
    }

    /**
     * Get Plug-in overview 
     * @return Introduction Plug-in overview
     */
    public String getIntroduction() {
        return this.Introduction;
    }

    /**
     * Set Plug-in overview
     * @param Introduction Plug-in overview
     */
    public void setIntroduction(String Introduction) {
        this.Introduction = Introduction;
    }

    /**
     * Get Whether it is a selection 
     * @return IsRecommended Whether it is a selection
     */
    public Boolean getIsRecommended() {
        return this.IsRecommended;
    }

    /**
     * Set Whether it is a selection
     * @param IsRecommended Whether it is a selection
     */
    public void setIsRecommended(Boolean IsRecommended) {
        this.IsRecommended = IsRecommended;
    }

    public PluginOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginOperation(PluginOperation source) {
        if (source.AllowExternalAccess != null) {
            this.AllowExternalAccess = new Boolean(source.AllowExternalAccess);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.CategoryKey != null) {
            this.CategoryKey = new String(source.CategoryKey);
        }
        if (source.Introduction != null) {
            this.Introduction = new String(source.Introduction);
        }
        if (source.IsRecommended != null) {
            this.IsRecommended = new Boolean(source.IsRecommended);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllowExternalAccess", this.AllowExternalAccess);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "CategoryKey", this.CategoryKey);
        this.setParamSimple(map, prefix + "Introduction", this.Introduction);
        this.setParamSimple(map, prefix + "IsRecommended", this.IsRecommended);

    }
}

