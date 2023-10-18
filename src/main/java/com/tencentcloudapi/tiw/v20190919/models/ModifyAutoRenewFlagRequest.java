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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoRenewFlagRequest extends AbstractModel {

    /**
    * Subproduct ID. To obtain this ID, call the `DescribeUserResources` API and find the subproduct ID of the monthly feature package with the level 1. Usually the value is `sp_tiw_package`.
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * Resource ID. To obtain this ID, call the `DescribeUserResources` API and find the resource ID of the monthly feature package with the level 1.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Renewal mode. Valid values: `0` (default mode, which is auto-renewal), `1` (auto-renewal), `2` (manual renewal, which is specified by users). If no renewal is required, set it to `0`.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get Subproduct ID. To obtain this ID, call the `DescribeUserResources` API and find the subproduct ID of the monthly feature package with the level 1. Usually the value is `sp_tiw_package`. 
     * @return SubProduct Subproduct ID. To obtain this ID, call the `DescribeUserResources` API and find the subproduct ID of the monthly feature package with the level 1. Usually the value is `sp_tiw_package`.
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set Subproduct ID. To obtain this ID, call the `DescribeUserResources` API and find the subproduct ID of the monthly feature package with the level 1. Usually the value is `sp_tiw_package`.
     * @param SubProduct Subproduct ID. To obtain this ID, call the `DescribeUserResources` API and find the subproduct ID of the monthly feature package with the level 1. Usually the value is `sp_tiw_package`.
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get Resource ID. To obtain this ID, call the `DescribeUserResources` API and find the resource ID of the monthly feature package with the level 1. 
     * @return ResourceId Resource ID. To obtain this ID, call the `DescribeUserResources` API and find the resource ID of the monthly feature package with the level 1.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID. To obtain this ID, call the `DescribeUserResources` API and find the resource ID of the monthly feature package with the level 1.
     * @param ResourceId Resource ID. To obtain this ID, call the `DescribeUserResources` API and find the resource ID of the monthly feature package with the level 1.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Renewal mode. Valid values: `0` (default mode, which is auto-renewal), `1` (auto-renewal), `2` (manual renewal, which is specified by users). If no renewal is required, set it to `0`. 
     * @return AutoRenewFlag Renewal mode. Valid values: `0` (default mode, which is auto-renewal), `1` (auto-renewal), `2` (manual renewal, which is specified by users). If no renewal is required, set it to `0`.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal mode. Valid values: `0` (default mode, which is auto-renewal), `1` (auto-renewal), `2` (manual renewal, which is specified by users). If no renewal is required, set it to `0`.
     * @param AutoRenewFlag Renewal mode. Valid values: `0` (default mode, which is auto-renewal), `1` (auto-renewal), `2` (manual renewal, which is specified by users). If no renewal is required, set it to `0`.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public ModifyAutoRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoRenewFlagRequest(ModifyAutoRenewFlagRequest source) {
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

