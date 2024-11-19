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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendVerifyCodeRequest extends AbstractModel {

    /**
    * Country code.
Parameter value is not allowed to be 7,380,86.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Mobile number.
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
     * Get Country code.
Parameter value is not allowed to be 7,380,86. 
     * @return CountryCode Country code.
Parameter value is not allowed to be 7,380,86.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country code.
Parameter value is not allowed to be 7,380,86.
     * @param CountryCode Country code.
Parameter value is not allowed to be 7,380,86.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get Mobile number. 
     * @return PhoneNum Mobile number.
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Mobile number.
     * @param PhoneNum Mobile number.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public SendVerifyCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendVerifyCodeRequest(SendVerifyCodeRequest source) {
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);

    }
}

