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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditInstanceListRequest extends AbstractModel {

    /**
    * Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Use the value of `Product` for this parameter, such as `dcdb` and `mariadb`.
    */
    @SerializedName("NodeRequestType")
    @Expose
    private String NodeRequestType;

    /**
    * Audit status. Valid values: `0` (Not enabled), `1` (Enabled). Default value: `0`.
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

    /**
    * The offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of queried items. Default value: `20`. Max value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters for querying instances
    */
    @SerializedName("Filters")
    @Expose
    private AuditInstanceFilter [] Filters;

    /**
     * Get Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB). 
     * @return Product Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
     * @param Product Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Use the value of `Product` for this parameter, such as `dcdb` and `mariadb`. 
     * @return NodeRequestType Use the value of `Product` for this parameter, such as `dcdb` and `mariadb`.
     */
    public String getNodeRequestType() {
        return this.NodeRequestType;
    }

    /**
     * Set Use the value of `Product` for this parameter, such as `dcdb` and `mariadb`.
     * @param NodeRequestType Use the value of `Product` for this parameter, such as `dcdb` and `mariadb`.
     */
    public void setNodeRequestType(String NodeRequestType) {
        this.NodeRequestType = NodeRequestType;
    }

    /**
     * Get Audit status. Valid values: `0` (Not enabled), `1` (Enabled). Default value: `0`. 
     * @return AuditSwitch Audit status. Valid values: `0` (Not enabled), `1` (Enabled). Default value: `0`.
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set Audit status. Valid values: `0` (Not enabled), `1` (Enabled). Default value: `0`.
     * @param AuditSwitch Audit status. Valid values: `0` (Not enabled), `1` (Enabled). Default value: `0`.
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
    }

    /**
     * Get The offset. Default value: `0`. 
     * @return Offset The offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: `0`.
     * @param Offset The offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of queried items. Default value: `20`. Max value: `100`. 
     * @return Limit The number of queried items. Default value: `20`. Max value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of queried items. Default value: `20`. Max value: `100`.
     * @param Limit The number of queried items. Default value: `20`. Max value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters for querying instances 
     * @return Filters Filters for querying instances
     */
    public AuditInstanceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters for querying instances
     * @param Filters Filters for querying instances
     */
    public void setFilters(AuditInstanceFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAuditInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditInstanceListRequest(DescribeAuditInstanceListRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.NodeRequestType != null) {
            this.NodeRequestType = new String(source.NodeRequestType);
        }
        if (source.AuditSwitch != null) {
            this.AuditSwitch = new Long(source.AuditSwitch);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AuditInstanceFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AuditInstanceFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "NodeRequestType", this.NodeRequestType);
        this.setParamSimple(map, prefix + "AuditSwitch", this.AuditSwitch);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

