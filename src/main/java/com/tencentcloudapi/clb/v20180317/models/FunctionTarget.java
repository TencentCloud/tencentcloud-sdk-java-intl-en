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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionTarget extends AbstractModel {

    /**
    * SCF related information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Function")
    @Expose
    private FunctionInfo Function;

    /**
    * Weight
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get SCF related information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Function SCF related information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public FunctionInfo getFunction() {
        return this.Function;
    }

    /**
     * Set SCF related information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Function SCF related information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFunction(FunctionInfo Function) {
        this.Function = Function;
    }

    /**
     * Get Weight 
     * @return Weight Weight
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight
     * @param Weight Weight
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public FunctionTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionTarget(FunctionTarget source) {
        if (source.Function != null) {
            this.Function = new FunctionInfo(source.Function);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Function.", this.Function);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

