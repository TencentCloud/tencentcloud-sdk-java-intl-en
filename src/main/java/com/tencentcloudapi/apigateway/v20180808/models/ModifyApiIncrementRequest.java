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

public class ModifyApiIncrementRequest extends AbstractModel{

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * Authorization type of the API to be modified (you can select `OAUTH`, i.e., authorization API)
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * Public key value to be modified by OAuth API
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * OAuth API redirect address
    */
    @SerializedName("LoginRedirectUrl")
    @Expose
    private String LoginRedirectUrl;

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API ID 
     * @return ApiId API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
     * @param ApiId API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get Authorization type of the API to be modified (you can select `OAUTH`, i.e., authorization API) 
     * @return BusinessType Authorization type of the API to be modified (you can select `OAUTH`, i.e., authorization API)
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set Authorization type of the API to be modified (you can select `OAUTH`, i.e., authorization API)
     * @param BusinessType Authorization type of the API to be modified (you can select `OAUTH`, i.e., authorization API)
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get Public key value to be modified by OAuth API 
     * @return PublicKey Public key value to be modified by OAuth API
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key value to be modified by OAuth API
     * @param PublicKey Public key value to be modified by OAuth API
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get OAuth API redirect address 
     * @return LoginRedirectUrl OAuth API redirect address
     */
    public String getLoginRedirectUrl() {
        return this.LoginRedirectUrl;
    }

    /**
     * Set OAuth API redirect address
     * @param LoginRedirectUrl OAuth API redirect address
     */
    public void setLoginRedirectUrl(String LoginRedirectUrl) {
        this.LoginRedirectUrl = LoginRedirectUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "LoginRedirectUrl", this.LoginRedirectUrl);

    }
}

