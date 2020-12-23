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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDiagDBInstanceConfRequest extends AbstractModel{

    /**
    * Inspection switch.
    */
    @SerializedName("InstanceConfs")
    @Expose
    private InstanceConfs InstanceConfs;

    /**
    * The effective instance region. If the value is "All", it means it is effective for the whole region.
    */
    @SerializedName("Regions")
    @Expose
    private String Regions;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Specify the instance ID that needs to modify the inspection status.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Inspection switch. 
     * @return InstanceConfs Inspection switch.
     */
    public InstanceConfs getInstanceConfs() {
        return this.InstanceConfs;
    }

    /**
     * Set Inspection switch.
     * @param InstanceConfs Inspection switch.
     */
    public void setInstanceConfs(InstanceConfs InstanceConfs) {
        this.InstanceConfs = InstanceConfs;
    }

    /**
     * Get The effective instance region. If the value is "All", it means it is effective for the whole region. 
     * @return Regions The effective instance region. If the value is "All", it means it is effective for the whole region.
     */
    public String getRegions() {
        return this.Regions;
    }

    /**
     * Set The effective instance region. If the value is "All", it means it is effective for the whole region.
     * @param Regions The effective instance region. If the value is "All", it means it is effective for the whole region.
     */
    public void setRegions(String Regions) {
        this.Regions = Regions;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)). 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Specify the instance ID that needs to modify the inspection status. 
     * @return InstanceIds Specify the instance ID that needs to modify the inspection status.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Specify the instance ID that needs to modify the inspection status.
     * @param InstanceIds Specify the instance ID that needs to modify the inspection status.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceConfs.", this.InstanceConfs);
        this.setParamSimple(map, prefix + "Regions", this.Regions);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

