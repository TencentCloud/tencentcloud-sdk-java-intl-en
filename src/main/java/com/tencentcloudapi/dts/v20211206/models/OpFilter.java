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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpFilter extends AbstractModel {

    /**
    * DML allowlist
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * DDL allowlist
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
     * Get DML allowlist 
     * @return OpTypes DML allowlist
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set DML allowlist
     * @param OpTypes DML allowlist
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get DDL allowlist 
     * @return DdlOptions DDL allowlist
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set DDL allowlist
     * @param DdlOptions DDL allowlist
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    public OpFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpFilter(OpFilter source) {
        if (source.OpTypes != null) {
            this.OpTypes = new String[source.OpTypes.length];
            for (int i = 0; i < source.OpTypes.length; i++) {
                this.OpTypes[i] = new String(source.OpTypes[i]);
            }
        }
        if (source.DdlOptions != null) {
            this.DdlOptions = new DdlOption[source.DdlOptions.length];
            for (int i = 0; i < source.DdlOptions.length; i++) {
                this.DdlOptions[i] = new DdlOption(source.DdlOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OpTypes.", this.OpTypes);
        this.setParamArrayObj(map, prefix + "DdlOptions.", this.DdlOptions);

    }
}

