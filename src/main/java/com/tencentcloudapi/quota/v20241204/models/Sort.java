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
package com.tencentcloudapi.quota.v20241204.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel {

    /**
    * Ascending Descending Order
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Field
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
     * Get Ascending Descending Order 
     * @return Type Ascending Descending Order
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Ascending Descending Order
     * @param Type Ascending Descending Order
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Field 
     * @return Field Field
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Field
     * @param Field Field
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    public Sort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sort(Sort source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Field", this.Field);

    }
}

