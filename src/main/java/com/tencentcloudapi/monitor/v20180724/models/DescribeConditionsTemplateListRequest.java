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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConditionsTemplateListRequest extends AbstractModel{

    /**
    * The value is fixed to `monitor`.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * View name, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). For the monitoring of Tencent Cloud services, the value of this parameter is `QceNamespacesNew.N.Id` of the output parameter of `DescribeAllNamespaces`, for example, `cvm_device`.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * Filter by trigger condition template name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Filter by trigger condition template ID.
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * Pagination parameter, which specifies the number of returned results per page. Value range: 1-100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset starting from 0. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting method by update time. `asc`: Ascending order; `desc`: Descending order.
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
     * Get The value is fixed to `monitor`. 
     * @return Module The value is fixed to `monitor`.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The value is fixed to `monitor`.
     * @param Module The value is fixed to `monitor`.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get View name, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). For the monitoring of Tencent Cloud services, the value of this parameter is `QceNamespacesNew.N.Id` of the output parameter of `DescribeAllNamespaces`, for example, `cvm_device`. 
     * @return ViewName View name, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). For the monitoring of Tencent Cloud services, the value of this parameter is `QceNamespacesNew.N.Id` of the output parameter of `DescribeAllNamespaces`, for example, `cvm_device`.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set View name, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). For the monitoring of Tencent Cloud services, the value of this parameter is `QceNamespacesNew.N.Id` of the output parameter of `DescribeAllNamespaces`, for example, `cvm_device`.
     * @param ViewName View name, which can be obtained via [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). For the monitoring of Tencent Cloud services, the value of this parameter is `QceNamespacesNew.N.Id` of the output parameter of `DescribeAllNamespaces`, for example, `cvm_device`.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get Filter by trigger condition template name. 
     * @return GroupName Filter by trigger condition template name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Filter by trigger condition template name.
     * @param GroupName Filter by trigger condition template name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Filter by trigger condition template ID. 
     * @return GroupID Filter by trigger condition template ID.
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set Filter by trigger condition template ID.
     * @param GroupID Filter by trigger condition template ID.
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get Pagination parameter, which specifies the number of returned results per page. Value range: 1-100. Default value: 20. 
     * @return Limit Pagination parameter, which specifies the number of returned results per page. Value range: 1-100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter, which specifies the number of returned results per page. Value range: 1-100. Default value: 20.
     * @param Limit Pagination parameter, which specifies the number of returned results per page. Value range: 1-100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset starting from 0. Default value: 0. 
     * @return Offset Pagination offset starting from 0. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset starting from 0. Default value: 0.
     * @param Offset Pagination offset starting from 0. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting method by update time. `asc`: Ascending order; `desc`: Descending order. 
     * @return UpdateTimeOrder Sorting method by update time. `asc`: Ascending order; `desc`: Descending order.
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set Sorting method by update time. `asc`: Ascending order; `desc`: Descending order.
     * @param UpdateTimeOrder Sorting method by update time. `asc`: Ascending order; `desc`: Descending order.
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    public DescribeConditionsTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConditionsTemplateListRequest(DescribeConditionsTemplateListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.UpdateTimeOrder != null) {
            this.UpdateTimeOrder = new String(source.UpdateTimeOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "UpdateTimeOrder", this.UpdateTimeOrder);

    }
}

