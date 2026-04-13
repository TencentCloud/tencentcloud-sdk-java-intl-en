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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFunctionComponentBindingsRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Operation type. Valid values:
<li>bind: bind component;</li>
<li>bind-override: Bind a component. If the binding already exists, it is a rebind action; otherwise, it is a bind action.</li>
<li>unbind: Unbind a component;</li>
<li>rebind: Reset the binding relationship. Clear all existing bindings and set to the passed in bound list. If an empty list is passed in, clear all bindings.</li>

    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Bound list of function components to operate. When Operation is rebind and an empty list is input, it means to clear ALL bindings.
    */
    @SerializedName("FunctionComponentBindings")
    @Expose
    private FunctionComponentBinding [] FunctionComponentBindings;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Function ID. 
     * @return FunctionId Function ID.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID.
     * @param FunctionId Function ID.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Operation type. Valid values:
<li>bind: bind component;</li>
<li>bind-override: Bind a component. If the binding already exists, it is a rebind action; otherwise, it is a bind action.</li>
<li>unbind: Unbind a component;</li>
<li>rebind: Reset the binding relationship. Clear all existing bindings and set to the passed in bound list. If an empty list is passed in, clear all bindings.</li>
 
     * @return Operation Operation type. Valid values:
<li>bind: bind component;</li>
<li>bind-override: Bind a component. If the binding already exists, it is a rebind action; otherwise, it is a bind action.</li>
<li>unbind: Unbind a component;</li>
<li>rebind: Reset the binding relationship. Clear all existing bindings and set to the passed in bound list. If an empty list is passed in, clear all bindings.</li>

     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type. Valid values:
<li>bind: bind component;</li>
<li>bind-override: Bind a component. If the binding already exists, it is a rebind action; otherwise, it is a bind action.</li>
<li>unbind: Unbind a component;</li>
<li>rebind: Reset the binding relationship. Clear all existing bindings and set to the passed in bound list. If an empty list is passed in, clear all bindings.</li>

     * @param Operation Operation type. Valid values:
<li>bind: bind component;</li>
<li>bind-override: Bind a component. If the binding already exists, it is a rebind action; otherwise, it is a bind action.</li>
<li>unbind: Unbind a component;</li>
<li>rebind: Reset the binding relationship. Clear all existing bindings and set to the passed in bound list. If an empty list is passed in, clear all bindings.</li>

     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Bound list of function components to operate. When Operation is rebind and an empty list is input, it means to clear ALL bindings. 
     * @return FunctionComponentBindings Bound list of function components to operate. When Operation is rebind and an empty list is input, it means to clear ALL bindings.
     */
    public FunctionComponentBinding [] getFunctionComponentBindings() {
        return this.FunctionComponentBindings;
    }

    /**
     * Set Bound list of function components to operate. When Operation is rebind and an empty list is input, it means to clear ALL bindings.
     * @param FunctionComponentBindings Bound list of function components to operate. When Operation is rebind and an empty list is input, it means to clear ALL bindings.
     */
    public void setFunctionComponentBindings(FunctionComponentBinding [] FunctionComponentBindings) {
        this.FunctionComponentBindings = FunctionComponentBindings;
    }

    public ModifyFunctionComponentBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionComponentBindingsRequest(ModifyFunctionComponentBindingsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.FunctionComponentBindings != null) {
            this.FunctionComponentBindings = new FunctionComponentBinding[source.FunctionComponentBindings.length];
            for (int i = 0; i < source.FunctionComponentBindings.length; i++) {
                this.FunctionComponentBindings[i] = new FunctionComponentBinding(source.FunctionComponentBindings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "FunctionComponentBindings.", this.FunctionComponentBindings);

    }
}

