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

public class SalePackageSpec extends AbstractModel {

    /**
    * Resource package region of use.
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Specifies the resource package type.
CCU - compute resource package.
Storage resource package.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Resource pack version.
base - basic version; common - general version; enterprise - enterprise edition.
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * Minimum number of resources in the current version of the resource package. compute resource unit: pieces; storage resource: GB.
    */
    @SerializedName("MinPackageSpec")
    @Expose
    private Float MinPackageSpec;

    /**
    * Specifies the maximum number of resources in the current version of the resource package. valid values: compute resource unit: pieces; storage resource: GB.
    */
    @SerializedName("MaxPackageSpec")
    @Expose
    private Float MaxPackageSpec;

    /**
    * Specifies the resource pack validity period. the measurement unit is day.
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
     * Get Resource package region of use. 
     * @return PackageRegion Resource package region of use.
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Resource package region of use.
     * @param PackageRegion Resource package region of use.
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Specifies the resource package type.
CCU - compute resource package.
Storage resource package. 
     * @return PackageType Specifies the resource package type.
CCU - compute resource package.
Storage resource package.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Specifies the resource package type.
CCU - compute resource package.
Storage resource package.
     * @param PackageType Specifies the resource package type.
CCU - compute resource package.
Storage resource package.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Resource pack version.
base - basic version; common - general version; enterprise - enterprise edition. 
     * @return PackageVersion Resource pack version.
base - basic version; common - general version; enterprise - enterprise edition.
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set Resource pack version.
base - basic version; common - general version; enterprise - enterprise edition.
     * @param PackageVersion Resource pack version.
base - basic version; common - general version; enterprise - enterprise edition.
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get Minimum number of resources in the current version of the resource package. compute resource unit: pieces; storage resource: GB. 
     * @return MinPackageSpec Minimum number of resources in the current version of the resource package. compute resource unit: pieces; storage resource: GB.
     */
    public Float getMinPackageSpec() {
        return this.MinPackageSpec;
    }

    /**
     * Set Minimum number of resources in the current version of the resource package. compute resource unit: pieces; storage resource: GB.
     * @param MinPackageSpec Minimum number of resources in the current version of the resource package. compute resource unit: pieces; storage resource: GB.
     */
    public void setMinPackageSpec(Float MinPackageSpec) {
        this.MinPackageSpec = MinPackageSpec;
    }

    /**
     * Get Specifies the maximum number of resources in the current version of the resource package. valid values: compute resource unit: pieces; storage resource: GB. 
     * @return MaxPackageSpec Specifies the maximum number of resources in the current version of the resource package. valid values: compute resource unit: pieces; storage resource: GB.
     */
    public Float getMaxPackageSpec() {
        return this.MaxPackageSpec;
    }

    /**
     * Set Specifies the maximum number of resources in the current version of the resource package. valid values: compute resource unit: pieces; storage resource: GB.
     * @param MaxPackageSpec Specifies the maximum number of resources in the current version of the resource package. valid values: compute resource unit: pieces; storage resource: GB.
     */
    public void setMaxPackageSpec(Float MaxPackageSpec) {
        this.MaxPackageSpec = MaxPackageSpec;
    }

    /**
     * Get Specifies the resource pack validity period. the measurement unit is day. 
     * @return ExpireDay Specifies the resource pack validity period. the measurement unit is day.
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set Specifies the resource pack validity period. the measurement unit is day.
     * @param ExpireDay Specifies the resource pack validity period. the measurement unit is day.
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

