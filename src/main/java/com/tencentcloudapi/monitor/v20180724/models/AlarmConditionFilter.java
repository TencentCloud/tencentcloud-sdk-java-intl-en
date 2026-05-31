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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmConditionFilter extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
    * 
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Expression 
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set 
     * @param Expression 
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Get  
     * @return Dimensions 
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 
     * @param Dimensions 
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    public AlarmConditionFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmConditionFilter(AlarmConditionFilter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Expression", this.Expression);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);

    }
}

