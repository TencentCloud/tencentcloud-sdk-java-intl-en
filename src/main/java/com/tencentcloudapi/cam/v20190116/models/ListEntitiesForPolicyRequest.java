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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEntitiesForPolicyRequest extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Page number, which starts from 1. Default is 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of entries per page; 20 by default
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * Valid values: `All`, `User`, `Group`, and `Role`. `All` means all entity types will be returned; `User` means only sub-accounts will be returned; `Group` means only User Groups will be returned; `Role` means only roles will be returned. `All` is the default value.
    */
    @SerializedName("EntityFilter")
    @Expose
    private String EntityFilter;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Page number, which starts from 1. Default is 1 
     * @return Page Page number, which starts from 1. Default is 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, which starts from 1. Default is 1
     * @param Page Page number, which starts from 1. Default is 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of entries per page; 20 by default 
     * @return Rp Number of entries per page; 20 by default
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set Number of entries per page; 20 by default
     * @param Rp Number of entries per page; 20 by default
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get Valid values: `All`, `User`, `Group`, and `Role`. `All` means all entity types will be returned; `User` means only sub-accounts will be returned; `Group` means only User Groups will be returned; `Role` means only roles will be returned. `All` is the default value. 
     * @return EntityFilter Valid values: `All`, `User`, `Group`, and `Role`. `All` means all entity types will be returned; `User` means only sub-accounts will be returned; `Group` means only User Groups will be returned; `Role` means only roles will be returned. `All` is the default value.
     */
    public String getEntityFilter() {
        return this.EntityFilter;
    }

    /**
     * Set Valid values: `All`, `User`, `Group`, and `Role`. `All` means all entity types will be returned; `User` means only sub-accounts will be returned; `Group` means only User Groups will be returned; `Role` means only roles will be returned. `All` is the default value.
     * @param EntityFilter Valid values: `All`, `User`, `Group`, and `Role`. `All` means all entity types will be returned; `User` means only sub-accounts will be returned; `Group` means only User Groups will be returned; `Role` means only roles will be returned. `All` is the default value.
     */
    public void setEntityFilter(String EntityFilter) {
        this.EntityFilter = EntityFilter;
    }

    public ListEntitiesForPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEntitiesForPolicyRequest(ListEntitiesForPolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.EntityFilter != null) {
            this.EntityFilter = new String(source.EntityFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "EntityFilter", this.EntityFilter);

    }
}

