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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryUserFilter extends AbstractModel {

    /**
    * Property key
    */
    @SerializedName("PropertyKey")
    @Expose
    private String PropertyKey;

    /**
    * Property value
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

    /**
    * Logic value. `True` or `False`
    */
    @SerializedName("Logic")
    @Expose
    private Boolean Logic;

    /**
    * Operator. Values: `>`, `<`, `=`, `>=`, `<=`, `!=` and `between`. 
    */
    @SerializedName("OperateLogic")
    @Expose
    private String OperateLogic;

    /**
     * Get Property key 
     * @return PropertyKey Property key
     */
    public String getPropertyKey() {
        return this.PropertyKey;
    }

    /**
     * Set Property key
     * @param PropertyKey Property key
     */
    public void setPropertyKey(String PropertyKey) {
        this.PropertyKey = PropertyKey;
    }

    /**
     * Get Property value 
     * @return PropertyValue Property value
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set Property value
     * @param PropertyValue Property value
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    /**
     * Get Logic value. `True` or `False` 
     * @return Logic Logic value. `True` or `False`
     */
    public Boolean getLogic() {
        return this.Logic;
    }

    /**
     * Set Logic value. `True` or `False`
     * @param Logic Logic value. `True` or `False`
     */
    public void setLogic(Boolean Logic) {
        this.Logic = Logic;
    }

    /**
     * Get Operator. Values: `>`, `<`, `=`, `>=`, `<=`, `!=` and `between`.  
     * @return OperateLogic Operator. Values: `>`, `<`, `=`, `>=`, `<=`, `!=` and `between`. 
     */
    public String getOperateLogic() {
        return this.OperateLogic;
    }

    /**
     * Set Operator. Values: `>`, `<`, `=`, `>=`, `<=`, `!=` and `between`. 
     * @param OperateLogic Operator. Values: `>`, `<`, `=`, `>=`, `<=`, `!=` and `between`. 
     */
    public void setOperateLogic(String OperateLogic) {
        this.OperateLogic = OperateLogic;
    }

    public QueryUserFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryUserFilter(QueryUserFilter source) {
        if (source.PropertyKey != null) {
            this.PropertyKey = new String(source.PropertyKey);
        }
        if (source.PropertyValue != null) {
            this.PropertyValue = new String(source.PropertyValue);
        }
        if (source.Logic != null) {
            this.Logic = new Boolean(source.Logic);
        }
        if (source.OperateLogic != null) {
            this.OperateLogic = new String(source.OperateLogic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropertyKey", this.PropertyKey);
        this.setParamSimple(map, prefix + "PropertyValue", this.PropertyValue);
        this.setParamSimple(map, prefix + "Logic", this.Logic);
        this.setParamSimple(map, prefix + "OperateLogic", this.OperateLogic);

    }
}

