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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CfwStatusMonitorFilter extends AbstractModel {

    /**
    * Filter field name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter value list, up to 10.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Operator type, optional; only supported for backend permission types.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
     * Get Filter field name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Filter field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter field name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Filter field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter value list, up to 10.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Values Filter value list, up to 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter value list, up to 10.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Values Filter value list, up to 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Operator type, optional; only supported for backend permission types.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperatorType Operator type, optional; only supported for backend permission types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set Operator type, optional; only supported for backend permission types.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperatorType Operator type, optional; only supported for backend permission types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    public CfwStatusMonitorFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CfwStatusMonitorFilter(CfwStatusMonitorFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);

    }
}

