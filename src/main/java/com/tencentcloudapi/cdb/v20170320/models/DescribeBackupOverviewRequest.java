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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupOverviewRequest extends AbstractModel {

    /**
    * The cloud database product type for which a backup overview needs to be queried. The value can be mysql (two-node/three-node high-availability instances), mysql-basic (single-node cloud disk edition instance), or mysql-cluster (cloud disk edition instance).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get The cloud database product type for which a backup overview needs to be queried. The value can be mysql (two-node/three-node high-availability instances), mysql-basic (single-node cloud disk edition instance), or mysql-cluster (cloud disk edition instance). 
     * @return Product The cloud database product type for which a backup overview needs to be queried. The value can be mysql (two-node/three-node high-availability instances), mysql-basic (single-node cloud disk edition instance), or mysql-cluster (cloud disk edition instance).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set The cloud database product type for which a backup overview needs to be queried. The value can be mysql (two-node/three-node high-availability instances), mysql-basic (single-node cloud disk edition instance), or mysql-cluster (cloud disk edition instance).
     * @param Product The cloud database product type for which a backup overview needs to be queried. The value can be mysql (two-node/three-node high-availability instances), mysql-basic (single-node cloud disk edition instance), or mysql-cluster (cloud disk edition instance).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeBackupOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupOverviewRequest(DescribeBackupOverviewRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

