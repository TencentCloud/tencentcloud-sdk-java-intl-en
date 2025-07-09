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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueInfo extends AbstractModel {

    /**
    * Value ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Value type, 0: unknown or empty; 1: string; 2: integer; 3: float; 4: boolean; 5: array (string array); 6: object_array (structure array); 7: object (structure).
    */
    @SerializedName("ValueType")
    @Expose
    private Long ValueType;

    /**
    * String.
    */
    @SerializedName("ValueStr")
    @Expose
    private String ValueStr;

    /**
    * Int (return as a string to avoid precision loss).
    */
    @SerializedName("ValueInt")
    @Expose
    private String ValueInt;

    /**
    * Float.
    */
    @SerializedName("ValueFloat")
    @Expose
    private Float ValueFloat;

    /**
    * Bool.
    */
    @SerializedName("ValueBool")
    @Expose
    private Boolean ValueBool;

    /**
    * Array.
    */
    @SerializedName("ValueStrArray")
    @Expose
    private String [] ValueStrArray;

    /**
     * Get Value ID. 
     * @return Id Value ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Value ID.
     * @param Id Value ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Value type, 0: unknown or empty; 1: string; 2: integer; 3: float; 4: boolean; 5: array (string array); 6: object_array (structure array); 7: object (structure). 
     * @return ValueType Value type, 0: unknown or empty; 1: string; 2: integer; 3: float; 4: boolean; 5: array (string array); 6: object_array (structure array); 7: object (structure).
     */
    public Long getValueType() {
        return this.ValueType;
    }

    /**
     * Set Value type, 0: unknown or empty; 1: string; 2: integer; 3: float; 4: boolean; 5: array (string array); 6: object_array (structure array); 7: object (structure).
     * @param ValueType Value type, 0: unknown or empty; 1: string; 2: integer; 3: float; 4: boolean; 5: array (string array); 6: object_array (structure array); 7: object (structure).
     */
    public void setValueType(Long ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get String. 
     * @return ValueStr String.
     */
    public String getValueStr() {
        return this.ValueStr;
    }

    /**
     * Set String.
     * @param ValueStr String.
     */
    public void setValueStr(String ValueStr) {
        this.ValueStr = ValueStr;
    }

    /**
     * Get Int (return as a string to avoid precision loss). 
     * @return ValueInt Int (return as a string to avoid precision loss).
     */
    public String getValueInt() {
        return this.ValueInt;
    }

    /**
     * Set Int (return as a string to avoid precision loss).
     * @param ValueInt Int (return as a string to avoid precision loss).
     */
    public void setValueInt(String ValueInt) {
        this.ValueInt = ValueInt;
    }

    /**
     * Get Float. 
     * @return ValueFloat Float.
     */
    public Float getValueFloat() {
        return this.ValueFloat;
    }

    /**
     * Set Float.
     * @param ValueFloat Float.
     */
    public void setValueFloat(Float ValueFloat) {
        this.ValueFloat = ValueFloat;
    }

    /**
     * Get Bool. 
     * @return ValueBool Bool.
     */
    public Boolean getValueBool() {
        return this.ValueBool;
    }

    /**
     * Set Bool.
     * @param ValueBool Bool.
     */
    public void setValueBool(Boolean ValueBool) {
        this.ValueBool = ValueBool;
    }

    /**
     * Get Array. 
     * @return ValueStrArray Array.
     */
    public String [] getValueStrArray() {
        return this.ValueStrArray;
    }

    /**
     * Set Array.
     * @param ValueStrArray Array.
     */
    public void setValueStrArray(String [] ValueStrArray) {
        this.ValueStrArray = ValueStrArray;
    }

    public ValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueInfo(ValueInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueType != null) {
            this.ValueType = new Long(source.ValueType);
        }
        if (source.ValueStr != null) {
            this.ValueStr = new String(source.ValueStr);
        }
        if (source.ValueInt != null) {
            this.ValueInt = new String(source.ValueInt);
        }
        if (source.ValueFloat != null) {
            this.ValueFloat = new Float(source.ValueFloat);
        }
        if (source.ValueBool != null) {
            this.ValueBool = new Boolean(source.ValueBool);
        }
        if (source.ValueStrArray != null) {
            this.ValueStrArray = new String[source.ValueStrArray.length];
            for (int i = 0; i < source.ValueStrArray.length; i++) {
                this.ValueStrArray[i] = new String(source.ValueStrArray[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "ValueStr", this.ValueStr);
        this.setParamSimple(map, prefix + "ValueInt", this.ValueInt);
        this.setParamSimple(map, prefix + "ValueFloat", this.ValueFloat);
        this.setParamSimple(map, prefix + "ValueBool", this.ValueBool);
        this.setParamArraySimple(map, prefix + "ValueStrArray.", this.ValueStrArray);

    }
}

