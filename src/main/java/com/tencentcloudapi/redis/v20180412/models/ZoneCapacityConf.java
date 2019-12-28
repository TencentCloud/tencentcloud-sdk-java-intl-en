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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneCapacityConf extends AbstractModel{

    /**
    * AZ ID, such as ap-guangzhou-3
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * AZ name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Whether a product is sold out in an AZ
    */
    @SerializedName("IsSaleout")
    @Expose
    private Boolean IsSaleout;

    /**
    * Whether it is a default AZ
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Network type. basenet: basic network; vpcnet: VPC
    */
    @SerializedName("NetWorkType")
    @Expose
    private String [] NetWorkType;

    /**
    * Information of an AZ, such as product specifications in it
    */
    @SerializedName("ProductSet")
    @Expose
    private ProductConf [] ProductSet;

    /**
    * AZ ID, such as 100003
    */
    @SerializedName("OldZoneId")
    @Expose
    private Long OldZoneId;

    /**
     * Get AZ ID, such as ap-guangzhou-3 
     * @return ZoneId AZ ID, such as ap-guangzhou-3
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID, such as ap-guangzhou-3
     * @param ZoneId AZ ID, such as ap-guangzhou-3
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get AZ name 
     * @return ZoneName AZ name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name
     * @param ZoneName AZ name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Whether a product is sold out in an AZ 
     * @return IsSaleout Whether a product is sold out in an AZ
     */
    public Boolean getIsSaleout() {
        return this.IsSaleout;
    }

    /**
     * Set Whether a product is sold out in an AZ
     * @param IsSaleout Whether a product is sold out in an AZ
     */
    public void setIsSaleout(Boolean IsSaleout) {
        this.IsSaleout = IsSaleout;
    }

    /**
     * Get Whether it is a default AZ 
     * @return IsDefault Whether it is a default AZ
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is a default AZ
     * @param IsDefault Whether it is a default AZ
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Network type. basenet: basic network; vpcnet: VPC 
     * @return NetWorkType Network type. basenet: basic network; vpcnet: VPC
     */
    public String [] getNetWorkType() {
        return this.NetWorkType;
    }

    /**
     * Set Network type. basenet: basic network; vpcnet: VPC
     * @param NetWorkType Network type. basenet: basic network; vpcnet: VPC
     */
    public void setNetWorkType(String [] NetWorkType) {
        this.NetWorkType = NetWorkType;
    }

    /**
     * Get Information of an AZ, such as product specifications in it 
     * @return ProductSet Information of an AZ, such as product specifications in it
     */
    public ProductConf [] getProductSet() {
        return this.ProductSet;
    }

    /**
     * Set Information of an AZ, such as product specifications in it
     * @param ProductSet Information of an AZ, such as product specifications in it
     */
    public void setProductSet(ProductConf [] ProductSet) {
        this.ProductSet = ProductSet;
    }

    /**
     * Get AZ ID, such as 100003 
     * @return OldZoneId AZ ID, such as 100003
     */
    public Long getOldZoneId() {
        return this.OldZoneId;
    }

    /**
     * Set AZ ID, such as 100003
     * @param OldZoneId AZ ID, such as 100003
     */
    public void setOldZoneId(Long OldZoneId) {
        this.OldZoneId = OldZoneId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "IsSaleout", this.IsSaleout);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamArraySimple(map, prefix + "NetWorkType.", this.NetWorkType);
        this.setParamArrayObj(map, prefix + "ProductSet.", this.ProductSet);
        this.setParamSimple(map, prefix + "OldZoneId", this.OldZoneId);

    }
}

