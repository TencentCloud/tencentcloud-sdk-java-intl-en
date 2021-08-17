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
    * Backend type, which takes effect when VPC is enabled. Valid values: `clb` and `upstream` (VPC channel)
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
    * API backend service URL, which is required if `ServiceType` is `HTTP`.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * API backend service path, such as `/path`, which is required if `ServiceType` is `HTTP`. The frontend and backend paths can be different.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API backend service request method, such as `GET`, which is required if `ServiceType` is `HTTP`. The frontend and backend methods can be different
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get Backend type, which takes effect when VPC is enabled. Valid values: `clb` and `upstream` (VPC channel) 
     * @return Product Backend type, which takes effect when VPC is enabled. Valid values: `clb` and `upstream` (VPC channel)
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Backend type, which takes effect when VPC is enabled. Valid values: `clb` and `upstream` (VPC channel)
     * @param Product Backend type, which takes effect when VPC is enabled. Valid values: `clb` and `upstream` (VPC channel)
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
     * Get API backend service URL, which is required if `ServiceType` is `HTTP`. 
     * @return Url API backend service URL, which is required if `ServiceType` is `HTTP`.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set API backend service URL, which is required if `ServiceType` is `HTTP`.
     * @param Url API backend service URL, which is required if `ServiceType` is `HTTP`.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get API backend service path, such as `/path`, which is required if `ServiceType` is `HTTP`. The frontend and backend paths can be different. 
     * @return Path API backend service path, such as `/path`, which is required if `ServiceType` is `HTTP`. The frontend and backend paths can be different.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API backend service path, such as `/path`, which is required if `ServiceType` is `HTTP`. The frontend and backend paths can be different.
     * @param Path API backend service path, such as `/path`, which is required if `ServiceType` is `HTTP`. The frontend and backend paths can be different.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API backend service request method, such as `GET`, which is required if `ServiceType` is `HTTP`. The frontend and backend methods can be different 
     * @return Method API backend service request method, such as `GET`, which is required if `ServiceType` is `HTTP`. The frontend and backend methods can be different
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API backend service request method, such as `GET`, which is required if `ServiceType` is `HTTP`. The frontend and backend methods can be different
     * @param Method API backend service request method, such as `GET`, which is required if `ServiceType` is `HTTP`. The frontend and backend methods can be different
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    public ServiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceConfig(ServiceConfig source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
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

