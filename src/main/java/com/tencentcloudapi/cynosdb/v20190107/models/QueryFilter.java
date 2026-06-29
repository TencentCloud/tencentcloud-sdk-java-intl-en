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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFilter extends AbstractModel {

    /**
    * Field value list, in one-to-one correspondence with Names. InstanceId/ClusterId uses exact matching, and InstanceName uses fuzzy matching by default.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Search field name list, support the following 3 fields (case-insensitive, multiple values are OR relationship): ClusterId (filter by cluster ID, exact match), InstanceId (reverse-check cluster by instance ID), InstanceName (reverse-check cluster by instance name, default LIKE fuzzy matching, exact match when ExactMatch=true). Take the intersection when InstanceId and InstanceName are input at the same time (AND semantics).
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * Exact match. Only applicable to InstanceName: true for exact matching, false (default) for LIKE fuzzy matching.
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
    * Search field name (single field mode, choose between this and Names). ClusterId, InstanceId, and InstanceName are supported.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Operator (reserved field, currently disabled). Available values: >, >=, !=, =, <, <=
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Field value list, in one-to-one correspondence with Names. InstanceId/ClusterId uses exact matching, and InstanceName uses fuzzy matching by default. 
     * @return Values Field value list, in one-to-one correspondence with Names. InstanceId/ClusterId uses exact matching, and InstanceName uses fuzzy matching by default.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Field value list, in one-to-one correspondence with Names. InstanceId/ClusterId uses exact matching, and InstanceName uses fuzzy matching by default.
     * @param Values Field value list, in one-to-one correspondence with Names. InstanceId/ClusterId uses exact matching, and InstanceName uses fuzzy matching by default.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Search field name list, support the following 3 fields (case-insensitive, multiple values are OR relationship): ClusterId (filter by cluster ID, exact match), InstanceId (reverse-check cluster by instance ID), InstanceName (reverse-check cluster by instance name, default LIKE fuzzy matching, exact match when ExactMatch=true). Take the intersection when InstanceId and InstanceName are input at the same time (AND semantics). 
     * @return Names Search field name list, support the following 3 fields (case-insensitive, multiple values are OR relationship): ClusterId (filter by cluster ID, exact match), InstanceId (reverse-check cluster by instance ID), InstanceName (reverse-check cluster by instance name, default LIKE fuzzy matching, exact match when ExactMatch=true). Take the intersection when InstanceId and InstanceName are input at the same time (AND semantics).
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set Search field name list, support the following 3 fields (case-insensitive, multiple values are OR relationship): ClusterId (filter by cluster ID, exact match), InstanceId (reverse-check cluster by instance ID), InstanceName (reverse-check cluster by instance name, default LIKE fuzzy matching, exact match when ExactMatch=true). Take the intersection when InstanceId and InstanceName are input at the same time (AND semantics).
     * @param Names Search field name list, support the following 3 fields (case-insensitive, multiple values are OR relationship): ClusterId (filter by cluster ID, exact match), InstanceId (reverse-check cluster by instance ID), InstanceName (reverse-check cluster by instance name, default LIKE fuzzy matching, exact match when ExactMatch=true). Take the intersection when InstanceId and InstanceName are input at the same time (AND semantics).
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get Exact match. Only applicable to InstanceName: true for exact matching, false (default) for LIKE fuzzy matching. 
     * @return ExactMatch Exact match. Only applicable to InstanceName: true for exact matching, false (default) for LIKE fuzzy matching.
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set Exact match. Only applicable to InstanceName: true for exact matching, false (default) for LIKE fuzzy matching.
     * @param ExactMatch Exact match. Only applicable to InstanceName: true for exact matching, false (default) for LIKE fuzzy matching.
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    /**
     * Get Search field name (single field mode, choose between this and Names). ClusterId, InstanceId, and InstanceName are supported. 
     * @return Name Search field name (single field mode, choose between this and Names). ClusterId, InstanceId, and InstanceName are supported.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Search field name (single field mode, choose between this and Names). ClusterId, InstanceId, and InstanceName are supported.
     * @param Name Search field name (single field mode, choose between this and Names). ClusterId, InstanceId, and InstanceName are supported.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Operator (reserved field, currently disabled). Available values: >, >=, !=, =, <, <= 
     * @return Operator Operator (reserved field, currently disabled). Available values: >, >=, !=, =, <, <=
     * @deprecated
     */
    @Deprecated
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator (reserved field, currently disabled). Available values: >, >=, !=, =, <, <=
     * @param Operator Operator (reserved field, currently disabled). Available values: >, >=, !=, =, <, <=
     * @deprecated
     */
    @Deprecated
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public QueryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFilter(QueryFilter source) {
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

