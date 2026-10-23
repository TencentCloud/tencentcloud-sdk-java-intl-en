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

public class CreateResourcePackageRequest extends AbstractModel {

    /**
    * Instance type. Currently fixed to cynosdb-serverless.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Region of resource package use. chineseMainland: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Resource package type. CCU: compute resource package. DISK: storage resource package.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Resource pack version
base: basic version, common: general version, enterprise: Enterprise Edition
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * Package size. Compute resource unit: count. Storage resource: GB.
    */
    @SerializedName("PackageSpec")
    @Expose
    private Float PackageSpec;

    /**
    * Resource pack validity period. Unit: day.
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
    * Number of resource packages to purchase
    */
    @SerializedName("PackageCount")
    @Expose
    private Long PackageCount;

    /**
    * Resource package name.
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get Instance type. Currently fixed to cynosdb-serverless. 
     * @return InstanceType Instance type. Currently fixed to cynosdb-serverless.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Currently fixed to cynosdb-serverless.
     * @param InstanceType Instance type. Currently fixed to cynosdb-serverless.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Region of resource package use. chineseMainland: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions. 
     * @return PackageRegion Region of resource package use. chineseMainland: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of resource package use. chineseMainland: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
     * @param PackageRegion Region of resource package use. chineseMainland: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource package type. CCU: compute resource package. DISK: storage resource package. 
     * @return PackageType Resource package type. CCU: compute resource package. DISK: storage resource package.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource package type. CCU: compute resource package. DISK: storage resource package.
     * @param PackageType Resource package type. CCU: compute resource package. DISK: storage resource package.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Resource pack version
base: basic version, common: general version, enterprise: Enterprise Edition 
     * @return PackageVersion Resource pack version
base: basic version, common: general version, enterprise: Enterprise Edition
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set Resource pack version
base: basic version, common: general version, enterprise: Enterprise Edition
     * @param PackageVersion Resource pack version
base: basic version, common: general version, enterprise: Enterprise Edition
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get Package size. Compute resource unit: count. Storage resource: GB. 
     * @return PackageSpec Package size. Compute resource unit: count. Storage resource: GB.
     */
    public Float getPackageSpec() {
        return this.PackageSpec;
    }

    /**
     * Set Package size. Compute resource unit: count. Storage resource: GB.
     * @param PackageSpec Package size. Compute resource unit: count. Storage resource: GB.
     */
    public void setPackageSpec(Float PackageSpec) {
        this.PackageSpec = PackageSpec;
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

    /**
     * Get Number of resource packages to purchase 
     * @return PackageCount Number of resource packages to purchase
     */
    public Long getPackageCount() {
        return this.PackageCount;
    }

    /**
     * Set Number of resource packages to purchase
     * @param PackageCount Number of resource packages to purchase
     */
    public void setPackageCount(Long PackageCount) {
        this.PackageCount = PackageCount;
    }

    /**
     * Get Resource package name. 
     * @return PackageName Resource package name.
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Resource package name.
     * @param PackageName Resource package name.
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

