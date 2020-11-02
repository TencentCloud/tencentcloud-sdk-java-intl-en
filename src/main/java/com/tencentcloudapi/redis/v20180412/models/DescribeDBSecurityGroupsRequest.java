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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSecurityGroupsRequest extends AbstractModel{

    /**
    * Database engine name. For this API, its value is `redis`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB Console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Database engine name. For this API, its value is `redis`. 
     * @return Product Database engine name. For this API, its value is `redis`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Database engine name. For this API, its value is `redis`.
     * @param Product Database engine name. For this API, its value is `redis`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB Console. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB Console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB Console.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB Console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

