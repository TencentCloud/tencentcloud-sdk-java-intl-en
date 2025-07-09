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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebCallback extends AbstractModel {

    /**
    * Callback address
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Callback type. Valid values:
<li> WeCom
<li> Http
    */
    @SerializedName("CallbackType")
    @Expose
    private String CallbackType;

    /**
    * Callback method. Valid values:
<li> POST
<li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Request header
Note: This parameter is disused. To specify request headers, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * Request content
Note: This parameter is disused. To specify request content, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
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
<li> WeCom
<li> Http 
     * @return CallbackType Callback type. Valid values:
<li> WeCom
<li> Http
     */
    public String getCallbackType() {
        return this.CallbackType;
    }

    /**
     * Set Callback type. Valid values:
<li> WeCom
<li> Http
     * @param CallbackType Callback type. Valid values:
<li> WeCom
<li> Http
     */
    public void setCallbackType(String CallbackType) {
        this.CallbackType = CallbackType;
    }

    /**
     * Get Callback method. Valid values:
<li> POST
<li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Method Callback method. Valid values:
<li> POST
<li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Callback method. Valid values:
<li> POST
<li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Method Callback method. Valid values:
<li> POST
<li> PUT
Default value: `POST`. This parameter is required if `CallbackType` is `Http`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Request header
Note: This parameter is disused. To specify request headers, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Headers Request header
Note: This parameter is disused. To specify request headers, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Request header
Note: This parameter is disused. To specify request headers, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Headers Request header
Note: This parameter is disused. To specify request headers, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Request content
Note: This parameter is disused. To specify request content, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Body Request content
Note: This parameter is disused. To specify request content, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Request content
Note: This parameter is disused. To specify request content, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Body Request content
Note: This parameter is disused. To specify request content, see `CallBack` in <a href="https://intl.cloud.tencent.com/document/product/614/56466?from_cn_redirect=1">CreateAlarmNotice</a>.
Note: This field may return `null`, indicating that no valid value was found.
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

