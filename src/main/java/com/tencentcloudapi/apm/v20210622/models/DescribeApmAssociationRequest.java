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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmAssociationRequest extends AbstractModel {

    /**
    * Associated product name. currently only supports Prometheus.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Business System Name
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Associated product name. currently only supports Prometheus. 
     * @return ProductName Associated product name. currently only supports Prometheus.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Associated product name. currently only supports Prometheus.
     * @param ProductName Associated product name. currently only supports Prometheus.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Business System Name 
     * @return InstanceId Business System Name
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business System Name
     * @param InstanceId Business System Name
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeApmAssociationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmAssociationRequest(DescribeApmAssociationRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

