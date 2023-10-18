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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFilter extends AbstractModel {

    /**
    * Search field. Valid values: "InstanceId", "ProjectId", "InstanceName", "Vip"
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * Search string
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Whether to use exact match
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
    * Search field
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Search field. Valid values: "InstanceId", "ProjectId", "InstanceName", "Vip" 
     * @return Names Search field. Valid values: "InstanceId", "ProjectId", "InstanceName", "Vip"
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set Search field. Valid values: "InstanceId", "ProjectId", "InstanceName", "Vip"
     * @param Names Search field. Valid values: "InstanceId", "ProjectId", "InstanceName", "Vip"
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get Search string 
     * @return Values Search string
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Search string
     * @param Values Search string
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Whether to use exact match 
     * @return ExactMatch Whether to use exact match
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set Whether to use exact match
     * @param ExactMatch Whether to use exact match
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    /**
     * Get Search field 
     * @return Name Search field
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Search field
     * @param Name Search field
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
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
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
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
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

