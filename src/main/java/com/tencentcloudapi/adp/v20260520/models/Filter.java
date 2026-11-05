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

public class Filter extends AbstractModel {

    /**
    * Filter field name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Operator, default IN (backward compatibility)<table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>FILTER_OPERATOR_IN</td><td>0</td><td>Belongs to value_list (default value, backward compatibility; value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_NOT_IN</td><td>1</td><td>Does not belong to value_list (value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_BETWEEN</td><td>2</td><td>Between (inclusive interval [start, end]; value_list must contain exactly 2 elements, one of which can be empty to indicate a unilateral open interval)</td></tr></table>
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * Filter value array
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
     * Get Filter field name 
     * @return Name Filter field name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter field name
     * @param Name Filter field name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Operator, default IN (backward compatibility)<table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>FILTER_OPERATOR_IN</td><td>0</td><td>Belongs to value_list (default value, backward compatibility; value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_NOT_IN</td><td>1</td><td>Does not belong to value_list (value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_BETWEEN</td><td>2</td><td>Between (inclusive interval [start, end]; value_list must contain exactly 2 elements, one of which can be empty to indicate a unilateral open interval)</td></tr></table> 
     * @return Operator Operator, default IN (backward compatibility)<table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>FILTER_OPERATOR_IN</td><td>0</td><td>Belongs to value_list (default value, backward compatibility; value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_NOT_IN</td><td>1</td><td>Does not belong to value_list (value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_BETWEEN</td><td>2</td><td>Between (inclusive interval [start, end]; value_list must contain exactly 2 elements, one of which can be empty to indicate a unilateral open interval)</td></tr></table>
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator, default IN (backward compatibility)<table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>FILTER_OPERATOR_IN</td><td>0</td><td>Belongs to value_list (default value, backward compatibility; value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_NOT_IN</td><td>1</td><td>Does not belong to value_list (value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_BETWEEN</td><td>2</td><td>Between (inclusive interval [start, end]; value_list must contain exactly 2 elements, one of which can be empty to indicate a unilateral open interval)</td></tr></table>
     * @param Operator Operator, default IN (backward compatibility)<table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>FILTER_OPERATOR_IN</td><td>0</td><td>Belongs to value_list (default value, backward compatibility; value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_NOT_IN</td><td>1</td><td>Does not belong to value_list (value_list cannot be empty)</td></tr><tr><td>FILTER_OPERATOR_BETWEEN</td><td>2</td><td>Between (inclusive interval [start, end]; value_list must contain exactly 2 elements, one of which can be empty to indicate a unilateral open interval)</td></tr></table>
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Filter value array 
     * @return ValueList Filter value array
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set Filter value array
     * @param ValueList Filter value array
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.ValueList != null) {
            this.ValueList = new String[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new String(source.ValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "ValueList.", this.ValueList);

    }
}

