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

public class SearchFilter extends AbstractModel {

    /**
    * <p>Search filter type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>User-customized tag value</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>User-customized tag value ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>Retrieve by specified document ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>Retrieve by specified document classification ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>Retrieve by specified database table ID</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>Specified knowledge base schema ID</td></tr></tbody></table></p>
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * <p>Filter value list. According to SearchFilterType, take value 1: pass a custom tag value; 2: pass a custom tag value ID; 3: pass a document ID; 4: pass a category ID</p>
    */
    @SerializedName("FilterValueList")
    @Expose
    private String [] FilterValueList;

    /**
    * <p>User-customized tag ID</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>Logical operator: AND or OR<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
    */
    @SerializedName("LogicOp")
    @Expose
    private Long LogicOp;

    /**
    * <p>Nested search filter</p>
    */
    @SerializedName("SearchFilterList")
    @Expose
    private SearchFilter [] SearchFilterList;

    /**
     * Get <p>Search filter type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>User-customized tag value</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>User-customized tag value ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>Retrieve by specified document ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>Retrieve by specified document classification ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>Retrieve by specified database table ID</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>Specified knowledge base schema ID</td></tr></tbody></table></p> 
     * @return FilterType <p>Search filter type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>User-customized tag value</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>User-customized tag value ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>Retrieve by specified document ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>Retrieve by specified document classification ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>Retrieve by specified database table ID</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>Specified knowledge base schema ID</td></tr></tbody></table></p>
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set <p>Search filter type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>User-customized tag value</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>User-customized tag value ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>Retrieve by specified document ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>Retrieve by specified document classification ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>Retrieve by specified database table ID</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>Specified knowledge base schema ID</td></tr></tbody></table></p>
     * @param FilterType <p>Search filter type<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>User-customized tag value</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>User-customized tag value ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>Retrieve by specified document ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>Retrieve by specified document classification ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>Retrieve by specified database table ID</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>Specified knowledge base schema ID</td></tr></tbody></table></p>
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get <p>Filter value list. According to SearchFilterType, take value 1: pass a custom tag value; 2: pass a custom tag value ID; 3: pass a document ID; 4: pass a category ID</p> 
     * @return FilterValueList <p>Filter value list. According to SearchFilterType, take value 1: pass a custom tag value; 2: pass a custom tag value ID; 3: pass a document ID; 4: pass a category ID</p>
     */
    public String [] getFilterValueList() {
        return this.FilterValueList;
    }

    /**
     * Set <p>Filter value list. According to SearchFilterType, take value 1: pass a custom tag value; 2: pass a custom tag value ID; 3: pass a document ID; 4: pass a category ID</p>
     * @param FilterValueList <p>Filter value list. According to SearchFilterType, take value 1: pass a custom tag value; 2: pass a custom tag value ID; 3: pass a document ID; 4: pass a category ID</p>
     */
    public void setFilterValueList(String [] FilterValueList) {
        this.FilterValueList = FilterValueList;
    }

    /**
     * Get <p>User-customized tag ID</p> 
     * @return LabelId <p>User-customized tag ID</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>User-customized tag ID</p>
     * @param LabelId <p>User-customized tag ID</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>Logical operator: AND or OR<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p> 
     * @return LogicOp <p>Logical operator: AND or OR<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
     */
    public Long getLogicOp() {
        return this.LogicOp;
    }

    /**
     * Set <p>Logical operator: AND or OR<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
     * @param LogicOp <p>Logical operator: AND or OR<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
     */
    public void setLogicOp(Long LogicOp) {
        this.LogicOp = LogicOp;
    }

    /**
     * Get <p>Nested search filter</p> 
     * @return SearchFilterList <p>Nested search filter</p>
     */
    public SearchFilter [] getSearchFilterList() {
        return this.SearchFilterList;
    }

    /**
     * Set <p>Nested search filter</p>
     * @param SearchFilterList <p>Nested search filter</p>
     */
    public void setSearchFilterList(SearchFilter [] SearchFilterList) {
        this.SearchFilterList = SearchFilterList;
    }

    public SearchFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFilter(SearchFilter source) {
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.FilterValueList != null) {
            this.FilterValueList = new String[source.FilterValueList.length];
            for (int i = 0; i < source.FilterValueList.length; i++) {
                this.FilterValueList[i] = new String(source.FilterValueList[i]);
            }
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LogicOp != null) {
            this.LogicOp = new Long(source.LogicOp);
        }
        if (source.SearchFilterList != null) {
            this.SearchFilterList = new SearchFilter[source.SearchFilterList.length];
            for (int i = 0; i < source.SearchFilterList.length; i++) {
                this.SearchFilterList[i] = new SearchFilter(source.SearchFilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "FilterValueList.", this.FilterValueList);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LogicOp", this.LogicOp);
        this.setParamArrayObj(map, prefix + "SearchFilterList.", this.SearchFilterList);

    }
}

