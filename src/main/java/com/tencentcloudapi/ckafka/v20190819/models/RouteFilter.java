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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteFilter extends AbstractModel {

    /**
    * Filters by name. currently supports security-group-id. filters by security group association.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter value. when the filter name is security-group-id, only supports transmission of one value.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Filter relationship. supports IN and NOT_IN. default is IN.
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
     * Get Filters by name. currently supports security-group-id. filters by security group association. 
     * @return Name Filters by name. currently supports security-group-id. filters by security group association.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filters by name. currently supports security-group-id. filters by security group association.
     * @param Name Filters by name. currently supports security-group-id. filters by security group association.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter value. when the filter name is security-group-id, only supports transmission of one value. 
     * @return Values Filter value. when the filter name is security-group-id, only supports transmission of one value.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter value. when the filter name is security-group-id, only supports transmission of one value.
     * @param Values Filter value. when the filter name is security-group-id, only supports transmission of one value.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Filter relationship. supports IN and NOT_IN. default is IN. 
     * @return Relation Filter relationship. supports IN and NOT_IN. default is IN.
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set Filter relationship. supports IN and NOT_IN. default is IN.
     * @param Relation Filter relationship. supports IN and NOT_IN. default is IN.
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    public RouteFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteFilter(RouteFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Relation", this.Relation);

    }
}

