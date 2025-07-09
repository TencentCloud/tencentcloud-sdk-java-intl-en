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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralTaskParam extends AbstractModel {

    /**
    * Common Task Parameter Type, for example: SPARK_SQL
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Common Task Parameter Content, parameters that directly apply to the task. Separate different parameters with;
Split
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Common Task Parameter Type, for example: SPARK_SQL 
     * @return Type Common Task Parameter Type, for example: SPARK_SQL
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Common Task Parameter Type, for example: SPARK_SQL
     * @param Type Common Task Parameter Type, for example: SPARK_SQL
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Common Task Parameter Content, parameters that directly apply to the task. Separate different parameters with;
Split 
     * @return Value Common Task Parameter Content, parameters that directly apply to the task. Separate different parameters with;
Split
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Common Task Parameter Content, parameters that directly apply to the task. Separate different parameters with;
Split
     * @param Value Common Task Parameter Content, parameters that directly apply to the task. Separate different parameters with;
Split
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public GeneralTaskParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralTaskParam(GeneralTaskParam source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

