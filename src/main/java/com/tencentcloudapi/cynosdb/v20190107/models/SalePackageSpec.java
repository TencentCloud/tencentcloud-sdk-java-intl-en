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
    * Region of the resource pack Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * Minimum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinPackageSpec")
    @Expose
    private Float MinPackageSpec;

    /**
    * Maximum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxPackageSpec")
    @Expose
    private Float MaxPackageSpec;

    /**
    * Validity period of a resource pack in days Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
     * Get Region of the resource pack Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageRegion Region of the resource pack Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of the resource pack Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageRegion Region of the resource pack Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageVersion Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition). Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageVersion Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get Minimum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinPackageSpec Minimum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMinPackageSpec() {
        return this.MinPackageSpec;
    }

    /**
     * Set Minimum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinPackageSpec Minimum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinPackageSpec(Float MinPackageSpec) {
        this.MinPackageSpec = MinPackageSpec;
    }

    /**
     * Get Maximum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxPackageSpec Maximum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMaxPackageSpec() {
        return this.MaxPackageSpec;
    }

    /**
     * Set Maximum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxPackageSpec Maximum number of resources for the current edition of the resource pack.  Unit of the compute resources: pcs.  Unit of the storage resources: GB. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxPackageSpec(Float MaxPackageSpec) {
        this.MaxPackageSpec = MaxPackageSpec;
    }

    /**
     * Get Validity period of a resource pack in days Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireDay Validity period of a resource pack in days Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set Validity period of a resource pack in days Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireDay Validity period of a resource pack in days Note: This field may return null, indicating that no valid values can be obtained.
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

