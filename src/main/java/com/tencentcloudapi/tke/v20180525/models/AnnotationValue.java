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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnnotationValue extends AbstractModel {

    /**
    * Annotation Key
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Annotation Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Annotation Key 
     * @return Name Annotation Key
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Annotation Key
     * @param Name Annotation Key
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Annotation Value 
     * @return Value Annotation Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Annotation Value
     * @param Value Annotation Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AnnotationValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnnotationValue(AnnotationValue source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

