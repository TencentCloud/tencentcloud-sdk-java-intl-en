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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourcePackagesDeductionPriorityRequest extends AbstractModel {

    /**
    * Specifies the resource package type whose priority needs to be modified. CCU: compute resource package. DISK: storage resource package.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * The modified deduction priority takes effect for which cynos resource.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Resource package deduction priority.
    */
    @SerializedName("DeductionPriorities")
    @Expose
    private PackagePriority [] DeductionPriorities;

    /**
     * Get Specifies the resource package type whose priority needs to be modified. CCU: compute resource package. DISK: storage resource package. 
     * @return PackageType Specifies the resource package type whose priority needs to be modified. CCU: compute resource package. DISK: storage resource package.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Specifies the resource package type whose priority needs to be modified. CCU: compute resource package. DISK: storage resource package.
     * @param PackageType Specifies the resource package type whose priority needs to be modified. CCU: compute resource package. DISK: storage resource package.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get The modified deduction priority takes effect for which cynos resource. 
     * @return ClusterId The modified deduction priority takes effect for which cynos resource.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The modified deduction priority takes effect for which cynos resource.
     * @param ClusterId The modified deduction priority takes effect for which cynos resource.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Resource package deduction priority. 
     * @return DeductionPriorities Resource package deduction priority.
     */
    public PackagePriority [] getDeductionPriorities() {
        return this.DeductionPriorities;
    }

    /**
     * Set Resource package deduction priority.
     * @param DeductionPriorities Resource package deduction priority.
     */
    public void setDeductionPriorities(PackagePriority [] DeductionPriorities) {
        this.DeductionPriorities = DeductionPriorities;
    }

    public ModifyResourcePackagesDeductionPriorityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcePackagesDeductionPriorityRequest(ModifyResourcePackagesDeductionPriorityRequest source) {
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DeductionPriorities != null) {
            this.DeductionPriorities = new PackagePriority[source.DeductionPriorities.length];
            for (int i = 0; i < source.DeductionPriorities.length; i++) {
                this.DeductionPriorities[i] = new PackagePriority(source.DeductionPriorities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "DeductionPriorities.", this.DeductionPriorities);

    }
}

