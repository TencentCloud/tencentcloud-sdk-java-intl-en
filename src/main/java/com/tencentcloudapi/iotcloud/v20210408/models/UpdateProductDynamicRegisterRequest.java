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

public class UpdateProductDynamicRegisterRequest extends AbstractModel{

    /**
    * Product ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Dynamic registration type. Valid values: 0 - disabled; 1 - pre-create device; 2 - auto-create device.
    */
    @SerializedName("RegisterType")
    @Expose
    private Long RegisterType;

    /**
    * Maximum dynamically registered devices
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
     * Get Product ID 
     * @return ProductId Product ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID
     * @param ProductId Product ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

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

    public UpdateProductDynamicRegisterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProductDynamicRegisterRequest(UpdateProductDynamicRegisterRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.RegisterType != null) {
            this.RegisterType = new Long(source.RegisterType);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "RegisterType", this.RegisterType);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);

    }
}

