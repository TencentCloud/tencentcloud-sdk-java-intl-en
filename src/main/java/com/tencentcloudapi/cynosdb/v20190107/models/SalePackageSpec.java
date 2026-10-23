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

public class SalePackageSpec extends AbstractModel {

    /**
    * Region of use for the resource package
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Resource package type
CCU: compute resource package
DISK: storage resource package.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Resource pack version
base: basic edition, common: general edition, enterprise: Enterprise Edition
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * Minimum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
    */
    @SerializedName("MinPackageSpec")
    @Expose
    private Float MinPackageSpec;

    /**
    * Maximum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
    */
    @SerializedName("MaxPackageSpec")
    @Expose
    private Float MaxPackageSpec;

    /**
    * Resource pack validity period. Unit: day.
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
     * Get Region of use for the resource package 
     * @return PackageRegion Region of use for the resource package
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of use for the resource package
     * @param PackageRegion Region of use for the resource package
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource package type
CCU: compute resource package
DISK: storage resource package. 
     * @return PackageType Resource package type
CCU: compute resource package
DISK: storage resource package.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource package type
CCU: compute resource package
DISK: storage resource package.
     * @param PackageType Resource package type
CCU: compute resource package
DISK: storage resource package.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Resource pack version
base: basic edition, common: general edition, enterprise: Enterprise Edition 
     * @return PackageVersion Resource pack version
base: basic edition, common: general edition, enterprise: Enterprise Edition
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set Resource pack version
base: basic edition, common: general edition, enterprise: Enterprise Edition
     * @param PackageVersion Resource pack version
base: basic edition, common: general edition, enterprise: Enterprise Edition
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get Minimum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB. 
     * @return MinPackageSpec Minimum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
     */
    public Float getMinPackageSpec() {
        return this.MinPackageSpec;
    }

    /**
     * Set Minimum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
     * @param MinPackageSpec Minimum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
     */
    public void setMinPackageSpec(Float MinPackageSpec) {
        this.MinPackageSpec = MinPackageSpec;
    }

    /**
     * Get Maximum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB. 
     * @return MaxPackageSpec Maximum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
     */
    public Float getMaxPackageSpec() {
        return this.MaxPackageSpec;
    }

    /**
     * Set Maximum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
     * @param MaxPackageSpec Maximum number of resources in the current resource package version. Compute resource unit: count; storage resource: GB.
     */
    public void setMaxPackageSpec(Float MaxPackageSpec) {
        this.MaxPackageSpec = MaxPackageSpec;
    }

    /**
     * Get Resource pack validity period. Unit: day. 
     * @return ExpireDay Resource pack validity period. Unit: day.
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set Resource pack validity period. Unit: day.
     * @param ExpireDay Resource pack validity period. Unit: day.
     */
    public void setExpireDay(Long ExpireDay) {
        this.ExpireDay = ExpireDay;
    }

    public SalePackageSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SalePackageSpec(SalePackageSpec source) {
        if (source.PackageRegion != null) {
            this.PackageRegion = new String(source.PackageRegion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.MinPackageSpec != null) {
            this.MinPackageSpec = new Float(source.MinPackageSpec);
        }
        if (source.MaxPackageSpec != null) {
            this.MaxPackageSpec = new Float(source.MaxPackageSpec);
        }
        if (source.ExpireDay != null) {
            this.ExpireDay = new Long(source.ExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "MinPackageSpec", this.MinPackageSpec);
        this.setParamSimple(map, prefix + "MaxPackageSpec", this.MaxPackageSpec);
        this.setParamSimple(map, prefix + "ExpireDay", this.ExpireDay);

    }
}

