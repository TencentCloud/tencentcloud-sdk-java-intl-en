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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiagDBInstancesRequest extends AbstractModel {

    /**
    * Whether it is an instance supported by DBbrain. It is fixed to `true`.
    */
    @SerializedName("IsSupported")
    @Expose
    private Boolean IsSupported;

    /**
    * Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Pagination parameter indicating the offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameter. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query by instance name.
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * Query by instance ID.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Query by region.
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get Whether it is an instance supported by DBbrain. It is fixed to `true`. 
     * @return IsSupported Whether it is an instance supported by DBbrain. It is fixed to `true`.
     */
    public Boolean getIsSupported() {
        return this.IsSupported;
    }

    /**
     * Set Whether it is an instance supported by DBbrain. It is fixed to `true`.
     * @param IsSupported Whether it is an instance supported by DBbrain. It is fixed to `true`.
     */
    public void setIsSupported(Boolean IsSupported) {
        this.IsSupported = IsSupported;
    }

    /**
     * Get Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql. 
     * @return Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     * @param Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Pagination parameter indicating the offset. 
     * @return Offset Pagination parameter indicating the offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter indicating the offset.
     * @param Offset Pagination parameter indicating the offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameter. Maximum value: 100. 
     * @return Limit Pagination parameter. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter. Maximum value: 100.
     * @param Limit Pagination parameter. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query by instance name. 
     * @return InstanceNames Query by instance name.
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set Query by instance name.
     * @param InstanceNames Query by instance name.
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get Query by instance ID. 
     * @return InstanceIds Query by instance ID.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Query by instance ID.
     * @param InstanceIds Query by instance ID.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Query by region. 
     * @return Regions Query by region.
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set Query by region.
     * @param Regions Query by region.
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    public DescribeDiagDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagDBInstancesRequest(DescribeDiagDBInstancesRequest source) {
        if (source.IsSupported != null) {
            this.IsSupported = new Boolean(source.IsSupported);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupported", this.IsSupported);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

