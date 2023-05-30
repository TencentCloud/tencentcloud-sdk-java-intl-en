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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAPIServiceRequest extends AbstractModel{

    /**
    * Supported services are cos:GetService and cdn:DescribeDomainsConfig.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Request parameters in JSON format.
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get Supported services are cos:GetService and cdn:DescribeDomainsConfig. 
     * @return Service Supported services are cos:GetService and cdn:DescribeDomainsConfig.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Supported services are cos:GetService and cdn:DescribeDomainsConfig.
     * @param Service Supported services are cos:GetService and cdn:DescribeDomainsConfig.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Request parameters in JSON format. 
     * @return Data Request parameters in JSON format.
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Request parameters in JSON format.
     * @param Data Request parameters in JSON format.
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public DescribeAPIServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAPIServiceRequest(DescribeAPIServiceRequest source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

