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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebCallback extends AbstractModel{

    /**
    * Callback address
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Callback type. Valid values:
<br><li> WeCom
<br><li> Http
    */
    @SerializedName("CallbackType")
    @Expose
    private String CallbackType;

    /**
    * Callback method. Valid values:
<br><li> POST
<br><li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Request header
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * Request content, which is required when `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * Number
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get Callback address 
     * @return Url Callback address
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Callback address
     * @param Url Callback address
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Callback type. Valid values:
<br><li> WeCom
<br><li> Http 
     * @return CallbackType Callback type. Valid values:
<br><li> WeCom
<br><li> Http
     */
    public String getCallbackType() {
        return this.CallbackType;
    }

    /**
     * Set Callback type. Valid values:
<br><li> WeCom
<br><li> Http
     * @param CallbackType Callback type. Valid values:
<br><li> WeCom
<br><li> Http
     */
    public void setCallbackType(String CallbackType) {
        this.CallbackType = CallbackType;
    }

    /**
     * Get Callback method. Valid values:
<br><li> POST
<br><li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Method Callback method. Valid values:
<br><li> POST
<br><li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Callback method. Valid values:
<br><li> POST
<br><li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Method Callback method. Valid values:
<br><li> POST
<br><li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Request header
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Headers Request header
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Request header
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Headers Request header
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Request content, which is required when `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Body Request content, which is required when `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Request content, which is required when `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Body Request content, which is required when `CallbackType` is `Http`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get Number 
     * @return Index Number
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Number
     * @param Index Number
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public WebCallback() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebCallback(WebCallback source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CallbackType != null) {
            this.CallbackType = new String(source.CallbackType);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CallbackType", this.CallbackType);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

