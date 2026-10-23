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

public class DescribeResourcePackageSaleSpecRequest extends AbstractModel {

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Region of resource pack usage
china: universally applicable in the Chinese mainland; overseas: universally applicable in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Resource package type
CCU - compute resource package
DISK - storage resource package
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get Region of resource pack usage
china: universally applicable in the Chinese mainland; overseas: universally applicable in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions. 
     * @return PackageRegion Region of resource pack usage
china: universally applicable in the Chinese mainland; overseas: universally applicable in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of resource pack usage
china: universally applicable in the Chinese mainland; overseas: universally applicable in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
     * @param PackageRegion Region of resource pack usage
china: universally applicable in the Chinese mainland; overseas: universally applicable in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions.
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource package type
CCU - compute resource package
DISK - storage resource package 
     * @return PackageType Resource package type
CCU - compute resource package
DISK - storage resource package
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource package type
CCU - compute resource package
DISK - storage resource package
     * @param PackageType Resource package type
CCU - compute resource package
DISK - storage resource package
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeResourcePackageSaleSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePackageSaleSpecRequest(DescribeResourcePackageSaleSpecRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new String(source.PackageRegion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

