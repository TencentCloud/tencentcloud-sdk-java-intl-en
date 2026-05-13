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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpCallbackConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("HeaderParams")
    @Expose
    private HeaderParams [] HeaderParams;

    /**
    * 
    */
    @SerializedName("Params")
    @Expose
    private HttpParams [] Params;

    /**
    * 
    */
    @SerializedName("Returns")
    @Expose
    private ReturnKey [] Returns;

    /**
    * 
    */
    @SerializedName("Async")
    @Expose
    private Boolean Async;

    /**
    * 
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 
    */
    @SerializedName("BasicAuth")
    @Expose
    private BasicAuth BasicAuth;

    /**
    * 
    */
    @SerializedName("BearerAuth")
    @Expose
    private BearerAuth BearerAuth;

    /**
    * 
    */
    @SerializedName("CustomAuth")
    @Expose
    private HttpParams CustomAuth;

    /**
    * 
    */
    @SerializedName("Oauth2Auth")
    @Expose
    private OauthConfig Oauth2Auth;

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return HeaderParams 
     */
    public HeaderParams [] getHeaderParams() {
        return this.HeaderParams;
    }

    /**
     * Set 
     * @param HeaderParams 
     */
    public void setHeaderParams(HeaderParams [] HeaderParams) {
        this.HeaderParams = HeaderParams;
    }

    /**
     * Get  
     * @return Params 
     */
    public HttpParams [] getParams() {
        return this.Params;
    }

    /**
     * Set 
     * @param Params 
     */
    public void setParams(HttpParams [] Params) {
        this.Params = Params;
    }

    /**
     * Get  
     * @return Returns 
     */
    public ReturnKey [] getReturns() {
        return this.Returns;
    }

    /**
     * Set 
     * @param Returns 
     */
    public void setReturns(ReturnKey [] Returns) {
        this.Returns = Returns;
    }

    /**
     * Get  
     * @return Async 
     */
    public Boolean getAsync() {
        return this.Async;
    }

    /**
     * Set 
     * @param Async 
     */
    public void setAsync(Boolean Async) {
        this.Async = Async;
    }

    /**
     * Get  
     * @return AuthType 
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 
     * @param AuthType 
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get  
     * @return BasicAuth 
     */
    public BasicAuth getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set 
     * @param BasicAuth 
     */
    public void setBasicAuth(BasicAuth BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get  
     * @return BearerAuth 
     */
    public BearerAuth getBearerAuth() {
        return this.BearerAuth;
    }

    /**
     * Set 
     * @param BearerAuth 
     */
    public void setBearerAuth(BearerAuth BearerAuth) {
        this.BearerAuth = BearerAuth;
    }

    /**
     * Get  
     * @return CustomAuth 
     */
    public HttpParams getCustomAuth() {
        return this.CustomAuth;
    }

    /**
     * Set 
     * @param CustomAuth 
     */
    public void setCustomAuth(HttpParams CustomAuth) {
        this.CustomAuth = CustomAuth;
    }

    /**
     * Get  
     * @return Oauth2Auth 
     */
    public OauthConfig getOauth2Auth() {
        return this.Oauth2Auth;
    }

    /**
     * Set 
     * @param Oauth2Auth 
     */
    public void setOauth2Auth(OauthConfig Oauth2Auth) {
        this.Oauth2Auth = Oauth2Auth;
    }

    public HttpCallbackConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpCallbackConfig(HttpCallbackConfig source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.HeaderParams != null) {
            this.HeaderParams = new HeaderParams[source.HeaderParams.length];
            for (int i = 0; i < source.HeaderParams.length; i++) {
                this.HeaderParams[i] = new HeaderParams(source.HeaderParams[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new HttpParams[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new HttpParams(source.Params[i]);
            }
        }
        if (source.Returns != null) {
            this.Returns = new ReturnKey[source.Returns.length];
            for (int i = 0; i < source.Returns.length; i++) {
                this.Returns[i] = new ReturnKey(source.Returns[i]);
            }
        }
        if (source.Async != null) {
            this.Async = new Boolean(source.Async);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.BasicAuth != null) {
            this.BasicAuth = new BasicAuth(source.BasicAuth);
        }
        if (source.BearerAuth != null) {
            this.BearerAuth = new BearerAuth(source.BearerAuth);
        }
        if (source.CustomAuth != null) {
            this.CustomAuth = new HttpParams(source.CustomAuth);
        }
        if (source.Oauth2Auth != null) {
            this.Oauth2Auth = new OauthConfig(source.Oauth2Auth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "HeaderParams.", this.HeaderParams);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamArrayObj(map, prefix + "Returns.", this.Returns);
        this.setParamSimple(map, prefix + "Async", this.Async);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "BasicAuth.", this.BasicAuth);
        this.setParamObj(map, prefix + "BearerAuth.", this.BearerAuth);
        this.setParamObj(map, prefix + "CustomAuth.", this.CustomAuth);
        this.setParamObj(map, prefix + "Oauth2Auth.", this.Oauth2Auth);

    }
}

