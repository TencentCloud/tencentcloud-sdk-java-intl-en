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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateProductDynamicRegisterResponse extends AbstractModel{

    /**
    * Dynamic registration type. Valid values: 0 - disabled; 1 - pre-create device; 2 - auto-create device.
    */
    @SerializedName("RegisterType")
    @Expose
    private Long RegisterType;

    /**
    * Product key for dynamic registration
    */
    @SerializedName("ProductSecret")
    @Expose
    private String ProductSecret;

    /**
    * Maximum dynamically registered devices
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Dynamic registration type. Valid values: 0 - disabled; 1 - pre-create device; 2 - auto-create device. 
     * @return RegisterType Dynamic registration type. Valid values: 0 - disabled; 1 - pre-create device; 2 - auto-create device.
     */
    public Long getRegisterType() {
        return this.RegisterType;
    }

    /**
     * Set Dynamic registration type. Valid values: 0 - disabled; 1 - pre-create device; 2 - auto-create device.
     * @param RegisterType Dynamic registration type. Valid values: 0 - disabled; 1 - pre-create device; 2 - auto-create device.
     */
    public void setRegisterType(Long RegisterType) {
        this.RegisterType = RegisterType;
    }

    /**
     * Get Product key for dynamic registration 
     * @return ProductSecret Product key for dynamic registration
     */
    public String getProductSecret() {
        return this.ProductSecret;
    }

    /**
     * Set Product key for dynamic registration
     * @param ProductSecret Product key for dynamic registration
     */
    public void setProductSecret(String ProductSecret) {
        this.ProductSecret = ProductSecret;
    }

    /**
     * Get Maximum dynamically registered devices 
     * @return RegisterLimit Maximum dynamically registered devices
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set Maximum dynamically registered devices
     * @param RegisterLimit Maximum dynamically registered devices
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UpdateProductDynamicRegisterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProductDynamicRegisterResponse(UpdateProductDynamicRegisterResponse source) {
        if (source.RegisterType != null) {
            this.RegisterType = new Long(source.RegisterType);
        }
        if (source.ProductSecret != null) {
            this.ProductSecret = new String(source.ProductSecret);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterType", this.RegisterType);
        this.setParamSimple(map, prefix + "ProductSecret", this.ProductSecret);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

