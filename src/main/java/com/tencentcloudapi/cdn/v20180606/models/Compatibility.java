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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Compatibility extends AbstractModel {

    /**
    * Compatibility flag status code.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
     * Get Compatibility flag status code.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Code Compatibility flag status code.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Compatibility flag status code.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Code Compatibility flag status code.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    public Compatibility() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Compatibility(Compatibility source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

