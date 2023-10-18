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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendIntlPhoneEmailCodeRequest extends AbstractModel {

    /**
    * The type. Valid values: `1` (mobile number), `2` (email address).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * The mobile number or email address.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get The type. Valid values: `1` (mobile number), `2` (email address). 
     * @return Type The type. Valid values: `1` (mobile number), `2` (email address).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set The type. Valid values: `1` (mobile number), `2` (email address).
     * @param Type The type. Valid values: `1` (mobile number), `2` (email address).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get The mobile number or email address. 
     * @return Code The mobile number or email address.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set The mobile number or email address.
     * @param Code The mobile number or email address.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public SendIntlPhoneEmailCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendIntlPhoneEmailCodeRequest(SendIntlPhoneEmailCodeRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

