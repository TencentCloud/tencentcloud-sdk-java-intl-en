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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplatesRequest extends AbstractModel{

    /**
    * Database engine version number
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * Template name
    */
    @SerializedName("TemplateNames")
    @Expose
    private String [] TemplateNames;

    /**
    * Template ID
    */
    @SerializedName("TemplateIds")
    @Expose
    private Long [] TemplateIds;

    /**
    * Database Type. Valid values: `NORMAL`, `SERVERLESS`.
    */
    @SerializedName("DbModes")
    @Expose
    private String [] DbModes;

    /**
    * Offset for query
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on queries
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Product type of the queried template
    */
    @SerializedName("Products")
    @Expose
    private String [] Products;

    /**
    * Template type
    */
    @SerializedName("TemplateTypes")
    @Expose
    private String [] TemplateTypes;

    /**
    * Version type
    */
    @SerializedName("EngineTypes")
    @Expose
    private String [] EngineTypes;

    /**
    * The sorting order of the returned results
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: `desc`, `asc `.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get Database engine version number 
     * @return EngineVersions Database engine version number
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set Database engine version number
     * @param EngineVersions Database engine version number
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get Template name 
     * @return TemplateNames Template name
     */
    public String [] getTemplateNames() {
        return this.TemplateNames;
    }

    /**
     * Set Template name
     * @param TemplateNames Template name
     */
    public void setTemplateNames(String [] TemplateNames) {
        this.TemplateNames = TemplateNames;
    }

    /**
     * Get Template ID 
     * @return TemplateIds Template ID
     */
    public Long [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set Template ID
     * @param TemplateIds Template ID
     */
    public void setTemplateIds(Long [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get Database Type. Valid values: `NORMAL`, `SERVERLESS`. 
     * @return DbModes Database Type. Valid values: `NORMAL`, `SERVERLESS`.
     */
    public String [] getDbModes() {
        return this.DbModes;
    }

    /**
     * Set Database Type. Valid values: `NORMAL`, `SERVERLESS`.
     * @param DbModes Database Type. Valid values: `NORMAL`, `SERVERLESS`.
     */
    public void setDbModes(String [] DbModes) {
        this.DbModes = DbModes;
    }

    /**
     * Get Offset for query 
     * @return Offset Offset for query
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for query
     * @param Offset Offset for query
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on queries 
     * @return Limit Limit on queries
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on queries
     * @param Limit Limit on queries
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Product type of the queried template 
     * @return Products Product type of the queried template
     */
    public String [] getProducts() {
        return this.Products;
    }

    /**
     * Set Product type of the queried template
     * @param Products Product type of the queried template
     */
    public void setProducts(String [] Products) {
        this.Products = Products;
    }

    /**
     * Get Template type 
     * @return TemplateTypes Template type
     */
    public String [] getTemplateTypes() {
        return this.TemplateTypes;
    }

    /**
     * Set Template type
     * @param TemplateTypes Template type
     */
    public void setTemplateTypes(String [] TemplateTypes) {
        this.TemplateTypes = TemplateTypes;
    }

    /**
     * Get Version type 
     * @return EngineTypes Version type
     */
    public String [] getEngineTypes() {
        return this.EngineTypes;
    }

    /**
     * Set Version type
     * @param EngineTypes Version type
     */
    public void setEngineTypes(String [] EngineTypes) {
        this.EngineTypes = EngineTypes;
    }

    /**
     * Get The sorting order of the returned results 
     * @return OrderBy The sorting order of the returned results
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set The sorting order of the returned results
     * @param OrderBy The sorting order of the returned results
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: `desc`, `asc `. 
     * @return OrderDirection Sorting order. Valid values: `desc`, `asc `.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting order. Valid values: `desc`, `asc `.
     * @param OrderDirection Sorting order. Valid values: `desc`, `asc `.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeParamTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplatesRequest(DescribeParamTemplatesRequest source) {
        if (source.EngineVersions != null) {
            this.EngineVersions = new String[source.EngineVersions.length];
            for (int i = 0; i < source.EngineVersions.length; i++) {
                this.EngineVersions[i] = new String(source.EngineVersions[i]);
            }
        }
        if (source.TemplateNames != null) {
            this.TemplateNames = new String[source.TemplateNames.length];
            for (int i = 0; i < source.TemplateNames.length; i++) {
                this.TemplateNames[i] = new String(source.TemplateNames[i]);
            }
        }
        if (source.TemplateIds != null) {
            this.TemplateIds = new Long[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new Long(source.TemplateIds[i]);
            }
        }
        if (source.DbModes != null) {
            this.DbModes = new String[source.DbModes.length];
            for (int i = 0; i < source.DbModes.length; i++) {
                this.DbModes[i] = new String(source.DbModes[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Products != null) {
            this.Products = new String[source.Products.length];
            for (int i = 0; i < source.Products.length; i++) {
                this.Products[i] = new String(source.Products[i]);
            }
        }
        if (source.TemplateTypes != null) {
            this.TemplateTypes = new String[source.TemplateTypes.length];
            for (int i = 0; i < source.TemplateTypes.length; i++) {
                this.TemplateTypes[i] = new String(source.TemplateTypes[i]);
            }
        }
        if (source.EngineTypes != null) {
            this.EngineTypes = new String[source.EngineTypes.length];
            for (int i = 0; i < source.EngineTypes.length; i++) {
                this.EngineTypes[i] = new String(source.EngineTypes[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EngineVersions.", this.EngineVersions);
        this.setParamArraySimple(map, prefix + "TemplateNames.", this.TemplateNames);
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamArraySimple(map, prefix + "DbModes.", this.DbModes);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Products.", this.Products);
        this.setParamArraySimple(map, prefix + "TemplateTypes.", this.TemplateTypes);
        this.setParamArraySimple(map, prefix + "EngineTypes.", this.EngineTypes);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

