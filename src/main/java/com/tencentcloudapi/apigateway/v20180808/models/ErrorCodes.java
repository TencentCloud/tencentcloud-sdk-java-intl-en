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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorCodes extends AbstractModel{

    /**
    * Custom response configuration error code.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Custom response configuration error message.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Custom response configuration error code remarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Custom error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConvertedCode")
    @Expose
    private Long ConvertedCode;

    /**
    * Whether to enable error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NeedConvert")
    @Expose
    private Boolean NeedConvert;

    /**
     * Get Custom response configuration error code.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Code Custom response configuration error code.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Custom response configuration error code.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Code Custom response configuration error code.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Custom response configuration error message.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Msg Custom response configuration error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Custom response configuration error message.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Msg Custom response configuration error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Custom response configuration error code remarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Desc Custom response configuration error code remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Custom response configuration error code remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Desc Custom response configuration error code remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Custom error code conversion.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConvertedCode Custom error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getConvertedCode() {
        return this.ConvertedCode;
    }

    /**
     * Set Custom error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConvertedCode Custom error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConvertedCode(Long ConvertedCode) {
        this.ConvertedCode = ConvertedCode;
    }

    /**
     * Get Whether to enable error code conversion.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NeedConvert Whether to enable error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getNeedConvert() {
        return this.NeedConvert;
    }

    /**
     * Set Whether to enable error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NeedConvert Whether to enable error code conversion.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNeedConvert(Boolean NeedConvert) {
        this.NeedConvert = NeedConvert;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ConvertedCode", this.ConvertedCode);
        this.setParamSimple(map, prefix + "NeedConvert", this.NeedConvert);

    }
}

