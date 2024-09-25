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

public class DescribeCCRuleRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Page number
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of pages
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sort parameters
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * clb-waf or sparta-waf
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Filter criteria.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
     * Get Page number 
     * @return Offset Page number
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number
     * @param Offset Page number
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of pages 
     * @return Limit Number of pages
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of pages
     * @param Limit Number of pages
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sort parameters 
     * @return Sort Sort parameters
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sort parameters
     * @param Sort Sort parameters
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get clb-waf or sparta-waf 
     * @return Edition clb-waf or sparta-waf
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set clb-waf or sparta-waf
     * @param Edition clb-waf or sparta-waf
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Filter criteria. 
     * @return Name Filter criteria.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter criteria.
     * @param Name Filter criteria.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeCCRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCRuleRequest(DescribeCCRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

