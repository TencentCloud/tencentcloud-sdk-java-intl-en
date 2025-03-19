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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDedicatedClusterOrderRequest extends AbstractModel {

    /**
    * CDC id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * Array of order-related CDC types
    */
    @SerializedName("DedicatedClusterTypes")
    @Expose
    private DedicatedClusterTypeInfo [] DedicatedClusterTypes;

    /**
    * Order-related COS storage information
    */
    @SerializedName("CosInfo")
    @Expose
    private CosInfo CosInfo;

    /**
    * Order-related CBS storage information
    */
    @SerializedName("CbsInfo")
    @Expose
    private CbsInfo CbsInfo;

    /**
    * Purchase source, cloudApi by default
    */
    @SerializedName("PurchaseSource")
    @Expose
    private String PurchaseSource;

    /**
    * DedicatedClusterOrderId needs to be submitted when API is invoked to submit an order.
    */
    @SerializedName("DedicatedClusterOrderId")
    @Expose
    private String DedicatedClusterOrderId;

    /**
     * Get CDC id 
     * @return DedicatedClusterId CDC id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC id
     * @param DedicatedClusterId CDC id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get Array of order-related CDC types 
     * @return DedicatedClusterTypes Array of order-related CDC types
     */
    public DedicatedClusterTypeInfo [] getDedicatedClusterTypes() {
        return this.DedicatedClusterTypes;
    }

    /**
     * Set Array of order-related CDC types
     * @param DedicatedClusterTypes Array of order-related CDC types
     */
    public void setDedicatedClusterTypes(DedicatedClusterTypeInfo [] DedicatedClusterTypes) {
        this.DedicatedClusterTypes = DedicatedClusterTypes;
    }

    /**
     * Get Order-related COS storage information 
     * @return CosInfo Order-related COS storage information
     */
    public CosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set Order-related COS storage information
     * @param CosInfo Order-related COS storage information
     */
    public void setCosInfo(CosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Get Order-related CBS storage information 
     * @return CbsInfo Order-related CBS storage information
     */
    public CbsInfo getCbsInfo() {
        return this.CbsInfo;
    }

    /**
     * Set Order-related CBS storage information
     * @param CbsInfo Order-related CBS storage information
     */
    public void setCbsInfo(CbsInfo CbsInfo) {
        this.CbsInfo = CbsInfo;
    }

    /**
     * Get Purchase source, cloudApi by default 
     * @return PurchaseSource Purchase source, cloudApi by default
     */
    public String getPurchaseSource() {
        return this.PurchaseSource;
    }

    /**
     * Set Purchase source, cloudApi by default
     * @param PurchaseSource Purchase source, cloudApi by default
     */
    public void setPurchaseSource(String PurchaseSource) {
        this.PurchaseSource = PurchaseSource;
    }

    /**
     * Get DedicatedClusterOrderId needs to be submitted when API is invoked to submit an order. 
     * @return DedicatedClusterOrderId DedicatedClusterOrderId needs to be submitted when API is invoked to submit an order.
     */
    public String getDedicatedClusterOrderId() {
        return this.DedicatedClusterOrderId;
    }

    /**
     * Set DedicatedClusterOrderId needs to be submitted when API is invoked to submit an order.
     * @param DedicatedClusterOrderId DedicatedClusterOrderId needs to be submitted when API is invoked to submit an order.
     */
    public void setDedicatedClusterOrderId(String DedicatedClusterOrderId) {
        this.DedicatedClusterOrderId = DedicatedClusterOrderId;
    }

    public CreateDedicatedClusterOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDedicatedClusterOrderRequest(CreateDedicatedClusterOrderRequest source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.DedicatedClusterTypes != null) {
            this.DedicatedClusterTypes = new DedicatedClusterTypeInfo[source.DedicatedClusterTypes.length];
            for (int i = 0; i < source.DedicatedClusterTypes.length; i++) {
                this.DedicatedClusterTypes[i] = new DedicatedClusterTypeInfo(source.DedicatedClusterTypes[i]);
            }
        }
        if (source.CosInfo != null) {
            this.CosInfo = new CosInfo(source.CosInfo);
        }
        if (source.CbsInfo != null) {
            this.CbsInfo = new CbsInfo(source.CbsInfo);
        }
        if (source.PurchaseSource != null) {
            this.PurchaseSource = new String(source.PurchaseSource);
        }
        if (source.DedicatedClusterOrderId != null) {
            this.DedicatedClusterOrderId = new String(source.DedicatedClusterOrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamArrayObj(map, prefix + "DedicatedClusterTypes.", this.DedicatedClusterTypes);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);
        this.setParamObj(map, prefix + "CbsInfo.", this.CbsInfo);
        this.setParamSimple(map, prefix + "PurchaseSource", this.PurchaseSource);
        this.setParamSimple(map, prefix + "DedicatedClusterOrderId", this.DedicatedClusterOrderId);

    }
}

