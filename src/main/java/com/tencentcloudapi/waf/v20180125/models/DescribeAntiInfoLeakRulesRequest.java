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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiInfoLeakRulesRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Action type
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * Page turning
    */
    @SerializedName("PageInfo")
    @Expose
    private PageInfo PageInfo;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Action type 
     * @return ActionType Action type
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action type
     * @param ActionType Action type
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Page turning 
     * @return PageInfo Page turning
     */
    public PageInfo getPageInfo() {
        return this.PageInfo;
    }

    /**
     * Set Page turning
     * @param PageInfo Page turning
     */
    public void setPageInfo(PageInfo PageInfo) {
        this.PageInfo = PageInfo;
    }

    public DescribeAntiInfoLeakRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakRulesRequest(DescribeAntiInfoLeakRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.PageInfo != null) {
            this.PageInfo = new PageInfo(source.PageInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamObj(map, prefix + "PageInfo.", this.PageInfo);

    }
}

