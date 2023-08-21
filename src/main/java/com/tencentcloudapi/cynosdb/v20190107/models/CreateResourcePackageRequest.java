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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourcePackageRequest extends AbstractModel{

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition).
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * Resource pack size. Unit of the compute resource pack: Ten thousand.  Unit of the storage resource pack:  GB
    */
    @SerializedName("PackageSpec")
    @Expose
    private Float PackageSpec;

    /**
    * Validity period of a resource pack in days
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
    * Number of the resource packs to be purchased
    */
    @SerializedName("PackageCount")
    @Expose
    private Long PackageCount;

    /**
    * Resource pack name
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland). 
     * @return PackageRegion Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
     * @param PackageRegion Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). 
     * @return PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
     * @param PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition). 
     * @return PackageVersion Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition).
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition).
     * @param PackageVersion Resource pack edition. Valid values: `base` (basic edition), `common` (general edition), `enterprise` (enterprise edition).
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get Resource pack size. Unit of the compute resource pack: Ten thousand.  Unit of the storage resource pack:  GB 
     * @return PackageSpec Resource pack size. Unit of the compute resource pack: Ten thousand.  Unit of the storage resource pack:  GB
     */
    public Float getPackageSpec() {
        return this.PackageSpec;
    }

    /**
     * Set Resource pack size. Unit of the compute resource pack: Ten thousand.  Unit of the storage resource pack:  GB
     * @param PackageSpec Resource pack size. Unit of the compute resource pack: Ten thousand.  Unit of the storage resource pack:  GB
     */
    public void setPackageSpec(Float PackageSpec) {
        this.PackageSpec = PackageSpec;
    }

    /**
     * Get Validity period of a resource pack in days 
     * @return ExpireDay Validity period of a resource pack in days
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set Validity period of a resource pack in days
     * @param ExpireDay Validity period of a resource pack in days
     */
    public void setExpireDay(Long ExpireDay) {
        this.ExpireDay = ExpireDay;
    }

    /**
     * Get Number of the resource packs to be purchased 
     * @return PackageCount Number of the resource packs to be purchased
     */
    public Long getPackageCount() {
        return this.PackageCount;
    }

    /**
     * Set Number of the resource packs to be purchased
     * @param PackageCount Number of the resource packs to be purchased
     */
    public void setPackageCount(Long PackageCount) {
        this.PackageCount = PackageCount;
    }

    /**
     * Get Resource pack name 
     * @return PackageName Resource pack name
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Resource pack name
     * @param PackageName Resource pack name
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public CreateResourcePackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourcePackageRequest(CreateResourcePackageRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new String(source.PackageRegion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.PackageSpec != null) {
            this.PackageSpec = new Float(source.PackageSpec);
        }
        if (source.ExpireDay != null) {
            this.ExpireDay = new Long(source.ExpireDay);
        }
        if (source.PackageCount != null) {
            this.PackageCount = new Long(source.PackageCount);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "PackageSpec", this.PackageSpec);
        this.setParamSimple(map, prefix + "ExpireDay", this.ExpireDay);
        this.setParamSimple(map, prefix + "PackageCount", this.PackageCount);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

