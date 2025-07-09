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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntOrString extends AbstractModel {

    /**
    * Numerical type, 0: int, 1: string
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Integer
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("IntVal")
    @Expose
    private Long IntVal;

    /**
    * String
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("StrVal")
    @Expose
    private String StrVal;

    /**
     * Get Numerical type, 0: int, 1: string
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Type Numerical type, 0: int, 1: string
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Numerical type, 0: int, 1: string
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Type Numerical type, 0: int, 1: string
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Integer
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return IntVal Integer
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getIntVal() {
        return this.IntVal;
    }

    /**
     * Set Integer
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param IntVal Integer
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setIntVal(Long IntVal) {
        this.IntVal = IntVal;
    }

    /**
     * Get String
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return StrVal String
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getStrVal() {
        return this.StrVal;
    }

    /**
     * Set String
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param StrVal String
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setStrVal(String StrVal) {
        this.StrVal = StrVal;
    }

    public IntOrString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntOrString(IntOrString source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IntVal != null) {
            this.IntVal = new Long(source.IntVal);
        }
        if (source.StrVal != null) {
            this.StrVal = new String(source.StrVal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IntVal", this.IntVal);
        this.setParamSimple(map, prefix + "StrVal", this.StrVal);

    }
}

