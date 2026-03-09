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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPermissionsRequest extends AbstractModel {

    /**
    * Resource.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table. specifies catalogName.SchemaName.TableName.
    */
    @SerializedName("Resource")
    @Expose
    private PrivilegeResource Resource;

    /**
    * Filtering conditions (this parameter is not supported).
    */
    @SerializedName("Filters")
    @Expose
    private SecurityFilter [] Filters;

    /**
    * Sorting field (this parameter is not supported).
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * Page parameter (this parameter is not supported).
    */
    @SerializedName("Page")
    @Expose
    private Page Page;

    /**
     * Get Resource.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table. specifies catalogName.SchemaName.TableName. 
     * @return Resource Resource.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table. specifies catalogName.SchemaName.TableName.
     */
    public PrivilegeResource getResource() {
        return this.Resource;
    }

    /**
     * Set Resource.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table. specifies catalogName.SchemaName.TableName.
     * @param Resource Resource.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table. specifies catalogName.SchemaName.TableName.
     */
    public void setResource(PrivilegeResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Filtering conditions (this parameter is not supported). 
     * @return Filters Filtering conditions (this parameter is not supported).
     */
    public SecurityFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering conditions (this parameter is not supported).
     * @param Filters Filtering conditions (this parameter is not supported).
     */
    public void setFilters(SecurityFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field (this parameter is not supported). 
     * @return OrderFields Sorting field (this parameter is not supported).
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sorting field (this parameter is not supported).
     * @param OrderFields Sorting field (this parameter is not supported).
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Page parameter (this parameter is not supported). 
     * @return Page Page parameter (this parameter is not supported).
     */
    public Page getPage() {
        return this.Page;
    }

    /**
     * Set Page parameter (this parameter is not supported).
     * @param Page Page parameter (this parameter is not supported).
     */
    public void setPage(Page Page) {
        this.Page = Page;
    }

    public ListPermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPermissionsRequest(ListPermissionsRequest source) {
        if (source.Resource != null) {
            this.Resource = new PrivilegeResource(source.Resource);
        }
        if (source.Filters != null) {
            this.Filters = new SecurityFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new SecurityFilter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Page(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamObj(map, prefix + "Page.", this.Page);

    }
}

