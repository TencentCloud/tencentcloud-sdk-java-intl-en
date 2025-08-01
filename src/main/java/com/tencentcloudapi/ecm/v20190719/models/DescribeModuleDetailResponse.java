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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModuleDetailResponse extends AbstractModel {

    /**
    * Module details. For more information, see `ModuleInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Module")
    @Expose
    private Module Module;

    /**
    * Module statistics. For more information, see `ModuleCounterInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModuleCounter")
    @Expose
    private ModuleCounter ModuleCounter;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Module details. For more information, see `ModuleInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Module Module details. For more information, see `ModuleInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Module getModule() {
        return this.Module;
    }

    /**
     * Set Module details. For more information, see `ModuleInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Module Module details. For more information, see `ModuleInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModule(Module Module) {
        this.Module = Module;
    }

    /**
     * Get Module statistics. For more information, see `ModuleCounterInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModuleCounter Module statistics. For more information, see `ModuleCounterInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ModuleCounter getModuleCounter() {
        return this.ModuleCounter;
    }

    /**
     * Set Module statistics. For more information, see `ModuleCounterInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModuleCounter Module statistics. For more information, see `ModuleCounterInfo` in the data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModuleCounter(ModuleCounter ModuleCounter) {
        this.ModuleCounter = ModuleCounter;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeModuleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModuleDetailResponse(DescribeModuleDetailResponse source) {
        if (source.Module != null) {
            this.Module = new Module(source.Module);
        }
        if (source.ModuleCounter != null) {
            this.ModuleCounter = new ModuleCounter(source.ModuleCounter);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Module.", this.Module);
        this.setParamObj(map, prefix + "ModuleCounter.", this.ModuleCounter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

