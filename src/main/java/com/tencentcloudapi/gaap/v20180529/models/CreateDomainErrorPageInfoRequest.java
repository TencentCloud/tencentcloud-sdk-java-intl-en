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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainErrorPageInfoRequest extends AbstractModel {

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Original error code
    */
    @SerializedName("ErrorNos")
    @Expose
    private Long [] ErrorNos;

    /**
    * New response packet
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * New error code
    */
    @SerializedName("NewErrorNo")
    @Expose
    private Long NewErrorNo;

    /**
    * Response header to be deleted
    */
    @SerializedName("ClearHeaders")
    @Expose
    private String [] ClearHeaders;

    /**
    * Response header to be set
    */
    @SerializedName("SetHeaders")
    @Expose
    private HttpHeaderParam [] SetHeaders;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Original error code 
     * @return ErrorNos Original error code
     */
    public Long [] getErrorNos() {
        return this.ErrorNos;
    }

    /**
     * Set Original error code
     * @param ErrorNos Original error code
     */
    public void setErrorNos(Long [] ErrorNos) {
        this.ErrorNos = ErrorNos;
    }

    /**
     * Get New response packet 
     * @return Body New response packet
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set New response packet
     * @param Body New response packet
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get New error code 
     * @return NewErrorNo New error code
     */
    public Long getNewErrorNo() {
        return this.NewErrorNo;
    }

    /**
     * Set New error code
     * @param NewErrorNo New error code
     */
    public void setNewErrorNo(Long NewErrorNo) {
        this.NewErrorNo = NewErrorNo;
    }

    /**
     * Get Response header to be deleted 
     * @return ClearHeaders Response header to be deleted
     */
    public String [] getClearHeaders() {
        return this.ClearHeaders;
    }

    /**
     * Set Response header to be deleted
     * @param ClearHeaders Response header to be deleted
     */
    public void setClearHeaders(String [] ClearHeaders) {
        this.ClearHeaders = ClearHeaders;
    }

    /**
     * Get Response header to be set 
     * @return SetHeaders Response header to be set
     */
    public HttpHeaderParam [] getSetHeaders() {
        return this.SetHeaders;
    }

    /**
     * Set Response header to be set
     * @param SetHeaders Response header to be set
     */
    public void setSetHeaders(HttpHeaderParam [] SetHeaders) {
        this.SetHeaders = SetHeaders;
    }

    public CreateDomainErrorPageInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainErrorPageInfoRequest(CreateDomainErrorPageInfoRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ErrorNos != null) {
            this.ErrorNos = new Long[source.ErrorNos.length];
            for (int i = 0; i < source.ErrorNos.length; i++) {
                this.ErrorNos[i] = new Long(source.ErrorNos[i]);
            }
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.NewErrorNo != null) {
            this.NewErrorNo = new Long(source.NewErrorNo);
        }
        if (source.ClearHeaders != null) {
            this.ClearHeaders = new String[source.ClearHeaders.length];
            for (int i = 0; i < source.ClearHeaders.length; i++) {
                this.ClearHeaders[i] = new String(source.ClearHeaders[i]);
            }
        }
        if (source.SetHeaders != null) {
            this.SetHeaders = new HttpHeaderParam[source.SetHeaders.length];
            for (int i = 0; i < source.SetHeaders.length; i++) {
                this.SetHeaders[i] = new HttpHeaderParam(source.SetHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ErrorNos.", this.ErrorNos);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "NewErrorNo", this.NewErrorNo);
        this.setParamArraySimple(map, prefix + "ClearHeaders.", this.ClearHeaders);
        this.setParamArrayObj(map, prefix + "SetHeaders.", this.SetHeaders);

    }
}

