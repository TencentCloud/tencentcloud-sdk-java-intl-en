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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchConditionInstanceNew extends AbstractModel {

    /**
    * Execution space, optional 
 "DRY_RUN"
    */
    @SerializedName("ExecutionSpace")
    @Expose
    private String ExecutionSpace;

    /**
    * Business Products, options: <DATA_DEV / DATA_QUALITY / DATA_INTEGRATION, default DATA_DEV. Non-empty. Default own project
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Resource Group Information, optional
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
     * Get Execution space, optional 
 "DRY_RUN" 
     * @return ExecutionSpace Execution space, optional 
 "DRY_RUN"
     */
    public String getExecutionSpace() {
        return this.ExecutionSpace;
    }

    /**
     * Set Execution space, optional 
 "DRY_RUN"
     * @param ExecutionSpace Execution space, optional 
 "DRY_RUN"
     */
    public void setExecutionSpace(String ExecutionSpace) {
        this.ExecutionSpace = ExecutionSpace;
    }

    /**
     * Get Business Products, options: <DATA_DEV / DATA_QUALITY / DATA_INTEGRATION, default DATA_DEV. Non-empty. Default own project 
     * @return ProductName Business Products, options: <DATA_DEV / DATA_QUALITY / DATA_INTEGRATION, default DATA_DEV. Non-empty. Default own project
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Business Products, options: <DATA_DEV / DATA_QUALITY / DATA_INTEGRATION, default DATA_DEV. Non-empty. Default own project
     * @param ProductName Business Products, options: <DATA_DEV / DATA_QUALITY / DATA_INTEGRATION, default DATA_DEV. Non-empty. Default own project
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Resource Group Information, optional 
     * @return ResourceGroup Resource Group Information, optional
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Resource Group Information, optional
     * @param ResourceGroup Resource Group Information, optional
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    public SearchConditionInstanceNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchConditionInstanceNew(SearchConditionInstanceNew source) {
        if (source.ExecutionSpace != null) {
            this.ExecutionSpace = new String(source.ExecutionSpace);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionSpace", this.ExecutionSpace);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);

    }
}

