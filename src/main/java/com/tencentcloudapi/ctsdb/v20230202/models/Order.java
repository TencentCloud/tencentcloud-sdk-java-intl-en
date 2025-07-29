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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Order extends AbstractModel {

    /**
    * Sorting field.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sorting method.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Sorting field. 
     * @return Name Sorting field.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sorting field.
     * @param Name Sorting field.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sorting method. 
     * @return Type Sorting method.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Sorting method.
     * @param Type Sorting method.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Order() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Order(Order source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

