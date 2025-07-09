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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePackage extends AbstractModel {

    /**
    * The unique ID of the resource package.
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Resource package type: CCU: compute resource package.
DISK: storage resource package.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Deduction priority of the current resource package bound to the current instance.
    */
    @SerializedName("DeductionPriority")
    @Expose
    private Long DeductionPriority;

    /**
     * Get The unique ID of the resource package. 
     * @return PackageId The unique ID of the resource package.
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set The unique ID of the resource package.
     * @param PackageId The unique ID of the resource package.
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Resource package type: CCU: compute resource package.
DISK: storage resource package. 
     * @return PackageType Resource package type: CCU: compute resource package.
DISK: storage resource package.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource package type: CCU: compute resource package.
DISK: storage resource package.
     * @param PackageType Resource package type: CCU: compute resource package.
DISK: storage resource package.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Deduction priority of the current resource package bound to the current instance. 
     * @return DeductionPriority Deduction priority of the current resource package bound to the current instance.
     */
    public Long getDeductionPriority() {
        return this.DeductionPriority;
    }

    /**
     * Set Deduction priority of the current resource package bound to the current instance.
     * @param DeductionPriority Deduction priority of the current resource package bound to the current instance.
     */
    public void setDeductionPriority(Long DeductionPriority) {
        this.DeductionPriority = DeductionPriority;
    }

    public ResourcePackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePackage(ResourcePackage source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.DeductionPriority != null) {
            this.DeductionPriority = new Long(source.DeductionPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "DeductionPriority", this.DeductionPriority);

    }
}

