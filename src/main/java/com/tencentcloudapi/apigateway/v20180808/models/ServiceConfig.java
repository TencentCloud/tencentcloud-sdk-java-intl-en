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

public class ServiceConfig extends AbstractModel{

    /**
    * Backend type. This parameter takes effect when VPC is enabled. Currently, only `clb` is supported.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Unique VPC ID.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * API backend service URL. This parameter is required when `ServiceType` is `HTTP`.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * API backend service path, such as `/path`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend paths can be different.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API backend service request method, such as `GET`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend methods can be different
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get Backend type. This parameter takes effect when VPC is enabled. Currently, only `clb` is supported. 
     * @return Product Backend type. This parameter takes effect when VPC is enabled. Currently, only `clb` is supported.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Backend type. This parameter takes effect when VPC is enabled. Currently, only `clb` is supported.
     * @param Product Backend type. This parameter takes effect when VPC is enabled. Currently, only `clb` is supported.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Unique VPC ID. 
     * @return UniqVpcId Unique VPC ID.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique VPC ID.
     * @param UniqVpcId Unique VPC ID.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get API backend service URL. This parameter is required when `ServiceType` is `HTTP`. 
     * @return Url API backend service URL. This parameter is required when `ServiceType` is `HTTP`.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set API backend service URL. This parameter is required when `ServiceType` is `HTTP`.
     * @param Url API backend service URL. This parameter is required when `ServiceType` is `HTTP`.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get API backend service path, such as `/path`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend paths can be different. 
     * @return Path API backend service path, such as `/path`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend paths can be different.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API backend service path, such as `/path`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend paths can be different.
     * @param Path API backend service path, such as `/path`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend paths can be different.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API backend service request method, such as `GET`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend methods can be different 
     * @return Method API backend service request method, such as `GET`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend methods can be different
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API backend service request method, such as `GET`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend methods can be different
     * @param Method API backend service request method, such as `GET`. If `ServiceType` is `HTTP`, this parameter will be required. The frontend and backend methods can be different
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

