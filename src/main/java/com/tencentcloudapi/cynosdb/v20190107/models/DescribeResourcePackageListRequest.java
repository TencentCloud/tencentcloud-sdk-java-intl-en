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

public class DescribeResourcePackageListRequest extends AbstractModel {

    /**
    * Unique ID of the resource package
    */
    @SerializedName("PackageId")
    @Expose
    private String [] PackageId;

    /**
    * Resource package name.
    */
    @SerializedName("PackageName")
    @Expose
    private String [] PackageName;

    /**
    * Resource package type
CCU: compute resource package. DISK: storage resource package.
    */
    @SerializedName("PackageType")
    @Expose
    private String [] PackageType;

    /**
    * Region of use for the resource package
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
    */
    @SerializedName("PackageRegion")
    @Expose
    private String [] PackageRegion;

    /**
    * Resource pack status
creating
using: in use;
expired
normal_finish: used up;
apply_refund: refund requested.
refund: refunded.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Sort condition. Supported sort condition: startTime - effective time.
expireTime: expiration time, packageUsedSpec: used capacity, packageTotalSpec: total storage capacity.
Sequential arrangement by array.
    */
    @SerializedName("OrderBy")
    @Expose
    private String [] OrderBy;

    /**
    * Sorting method. `DESC`: descending order. `ASC`: ascending order.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

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
     * Get Unique ID of the resource package 
     * @return PackageId Unique ID of the resource package
     */
    public String [] getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Unique ID of the resource package
     * @param PackageId Unique ID of the resource package
     */
    public void setPackageId(String [] PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Resource package name. 
     * @return PackageName Resource package name.
     */
    public String [] getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Resource package name.
     * @param PackageName Resource package name.
     */
    public void setPackageName(String [] PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Resource package type
CCU: compute resource package. DISK: storage resource package. 
     * @return PackageType Resource package type
CCU: compute resource package. DISK: storage resource package.
     */
    public String [] getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource package type
CCU: compute resource package. DISK: storage resource package.
     * @param PackageType Resource package type
CCU: compute resource package. DISK: storage resource package.
     */
    public void setPackageType(String [] PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Region of use for the resource package
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions 
     * @return PackageRegion Region of use for the resource package
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
     */
    public String [] getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of use for the resource package
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
     * @param PackageRegion Region of use for the resource package
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
     */
    public void setPackageRegion(String [] PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource pack status
creating
using: in use;
expired
normal_finish: used up;
apply_refund: refund requested.
refund: refunded. 
     * @return Status Resource pack status
creating
using: in use;
expired
normal_finish: used up;
apply_refund: refund requested.
refund: refunded.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Resource pack status
creating
using: in use;
expired
normal_finish: used up;
apply_refund: refund requested.
refund: refunded.
     * @param Status Resource pack status
creating
using: in use;
expired
normal_finish: used up;
apply_refund: refund requested.
refund: refunded.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Sort condition. Supported sort condition: startTime - effective time.
expireTime: expiration time, packageUsedSpec: used capacity, packageTotalSpec: total storage capacity.
Sequential arrangement by array. 
     * @return OrderBy Sort condition. Supported sort condition: startTime - effective time.
expireTime: expiration time, packageUsedSpec: used capacity, packageTotalSpec: total storage capacity.
Sequential arrangement by array.
     */
    public String [] getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort condition. Supported sort condition: startTime - effective time.
expireTime: expiration time, packageUsedSpec: used capacity, packageTotalSpec: total storage capacity.
Sequential arrangement by array.
     * @param OrderBy Sort condition. Supported sort condition: startTime - effective time.
expireTime: expiration time, packageUsedSpec: used capacity, packageTotalSpec: total storage capacity.
Sequential arrangement by array.
     */
    public void setOrderBy(String [] OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method. `DESC`: descending order. `ASC`: ascending order. 
     * @return OrderDirection Sorting method. `DESC`: descending order. `ASC`: ascending order.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting method. `DESC`: descending order. `ASC`: ascending order.
     * @param OrderDirection Sorting method. `DESC`: descending order. `ASC`: ascending order.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
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

    public DescribeResourcePackageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePackageListRequest(DescribeResourcePackageListRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String[source.PackageId.length];
            for (int i = 0; i < source.PackageId.length; i++) {
                this.PackageId[i] = new String(source.PackageId[i]);
            }
        }
        if (source.PackageName != null) {
            this.PackageName = new String[source.PackageName.length];
            for (int i = 0; i < source.PackageName.length; i++) {
                this.PackageName[i] = new String(source.PackageName[i]);
            }
        }
        if (source.PackageType != null) {
            this.PackageType = new String[source.PackageType.length];
            for (int i = 0; i < source.PackageType.length; i++) {
                this.PackageType[i] = new String(source.PackageType[i]);
            }
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new String[source.PackageRegion.length];
            for (int i = 0; i < source.PackageRegion.length; i++) {
                this.PackageRegion[i] = new String(source.PackageRegion[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String[source.OrderBy.length];
            for (int i = 0; i < source.OrderBy.length; i++) {
                this.OrderBy[i] = new String(source.OrderBy[i]);
            }
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
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
        this.setParamArraySimple(map, prefix + "PackageId.", this.PackageId);
        this.setParamArraySimple(map, prefix + "PackageName.", this.PackageName);
        this.setParamArraySimple(map, prefix + "PackageType.", this.PackageType);
        this.setParamArraySimple(map, prefix + "PackageRegion.", this.PackageRegion);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

