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

public class ResponseErrorCodeReq extends AbstractModel{

    /**
    * Custom response configuration error code.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Custom response configuration error message.
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Custom response configuration error code remarks.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Custom error code conversion.
    */
    @SerializedName("ConvertedCode")
    @Expose
    private Long ConvertedCode;

    /**
    * Whether to enable error code conversion.
    */
    @SerializedName("NeedConvert")
    @Expose
    private Boolean NeedConvert;

    /**
     * Get Custom response configuration error code. 
     * @return Code Custom response configuration error code.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Custom response configuration error code.
     * @param Code Custom response configuration error code.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Custom response configuration error message. 
     * @return Msg Custom response configuration error message.
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Custom response configuration error message.
     * @param Msg Custom response configuration error message.
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Custom response configuration error code remarks. 
     * @return Desc Custom response configuration error code remarks.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Custom response configuration error code remarks.
     * @param Desc Custom response configuration error code remarks.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Custom error code conversion. 
     * @return ConvertedCode Custom error code conversion.
     */
    public Long getConvertedCode() {
        return this.ConvertedCode;
    }

    /**
     * Set Custom error code conversion.
     * @param ConvertedCode Custom error code conversion.
     */
    public void setConvertedCode(Long ConvertedCode) {
        this.ConvertedCode = ConvertedCode;
    }

    /**
     * Get Whether to enable error code conversion. 
     * @return NeedConvert Whether to enable error code conversion.
     */
    public Boolean getNeedConvert() {
        return this.NeedConvert;
    }

    /**
     * Set Whether to enable error code conversion.
     * @param NeedConvert Whether to enable error code conversion.
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

