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

public class DescribeVariableListRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Filter criteria (supported: VariableIdList - variable ID list, VariableType - variable type)
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * Module type. Enumeration values: 1: environment parameter, 2: application parameter, 3: system parameter, -1: ALL parameters.
    */
    @SerializedName("ModuleType")
    @Expose
    private Long ModuleType;

    /**
    * Whether internal variables are required
    */
    @SerializedName("NeedInternalVariable")
    @Expose
    private Boolean NeedInternalVariable;

    /**
    * Page number, starting from 0.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page. Maximum: 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query keyword.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get Application ID 
     * @return AppId Application ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Filter criteria (supported: VariableIdList - variable ID list, VariableType - variable type) 
     * @return FilterList Filter criteria (supported: VariableIdList - variable ID list, VariableType - variable type)
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set Filter criteria (supported: VariableIdList - variable ID list, VariableType - variable type)
     * @param FilterList Filter criteria (supported: VariableIdList - variable ID list, VariableType - variable type)
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get Module type. Enumeration values: 1: environment parameter, 2: application parameter, 3: system parameter, -1: ALL parameters. 
     * @return ModuleType Module type. Enumeration values: 1: environment parameter, 2: application parameter, 3: system parameter, -1: ALL parameters.
     */
    public Long getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set Module type. Enumeration values: 1: environment parameter, 2: application parameter, 3: system parameter, -1: ALL parameters.
     * @param ModuleType Module type. Enumeration values: 1: environment parameter, 2: application parameter, 3: system parameter, -1: ALL parameters.
     */
    public void setModuleType(Long ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get Whether internal variables are required 
     * @return NeedInternalVariable Whether internal variables are required
     */
    public Boolean getNeedInternalVariable() {
        return this.NeedInternalVariable;
    }

    /**
     * Set Whether internal variables are required
     * @param NeedInternalVariable Whether internal variables are required
     */
    public void setNeedInternalVariable(Boolean NeedInternalVariable) {
        this.NeedInternalVariable = NeedInternalVariable;
    }

    /**
     * Get Page number, starting from 0. 
     * @return PageNumber Page number, starting from 0.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, starting from 0.
     * @param PageNumber Page number, starting from 0.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. Maximum: 100. 
     * @return PageSize Number of items per page. Maximum: 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. Maximum: 100.
     * @param PageSize Number of items per page. Maximum: 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query keyword. 
     * @return Query Query keyword.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query keyword.
     * @param Query Query keyword.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeVariableListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVariableListRequest(DescribeVariableListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.ModuleType != null) {
            this.ModuleType = new Long(source.ModuleType);
        }
        if (source.NeedInternalVariable != null) {
            this.NeedInternalVariable = new Boolean(source.NeedInternalVariable);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "NeedInternalVariable", this.NeedInternalVariable);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

