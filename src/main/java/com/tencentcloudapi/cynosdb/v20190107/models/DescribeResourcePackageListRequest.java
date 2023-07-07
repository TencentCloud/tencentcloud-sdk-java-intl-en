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

public class DescribeResourcePackageListRequest extends AbstractModel{

    /**
    * The unique ID of a resource pack
    */
    @SerializedName("PackageId")
    @Expose
    private String [] PackageId;

    /**
    * Resource pack name
    */
    @SerializedName("PackageName")
    @Expose
    private String [] PackageName;

    /**
    * Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
    */
    @SerializedName("PackageType")
    @Expose
    private String [] PackageType;

    /**
    * Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
    */
    @SerializedName("PackageRegion")
    @Expose
    private String [] PackageRegion;

    /**
    * Resource pack status. Valid values: `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded).
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Sorting conditions. Valid values: `startTime` (effective time), `expireTime` (expiration date), `packageUsedSpec` (used capacity), `packageTotalSpec` (total storage capacity). 
Sorting by array order
    */
    @SerializedName("OrderBy")
    @Expose
    private String [] OrderBy;

    /**
    * Sorting order. Valid values: `ASC` (ascending), `DESC` (descending).
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * Offset
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
     * Get The unique ID of a resource pack 
     * @return PackageId The unique ID of a resource pack
     */
    public String [] getPackageId() {
        return this.PackageId;
    }

    /**
     * Set The unique ID of a resource pack
     * @param PackageId The unique ID of a resource pack
     */
    public void setPackageId(String [] PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Resource pack name 
     * @return PackageName Resource pack name
     */
    public String [] getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Resource pack name
     * @param PackageName Resource pack name
     */
    public void setPackageName(String [] PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). 
     * @return PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
     */
    public String [] getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
     * @param PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack).
     */
    public void setPackageType(String [] PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland). 
     * @return PackageRegion Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
     */
    public String [] getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
     * @param PackageRegion Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland).
     */
    public void setPackageRegion(String [] PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource pack status. Valid values: `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded). 
     * @return Status Resource pack status. Valid values: `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded).
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Resource pack status. Valid values: `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded).
     * @param Status Resource pack status. Valid values: `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded).
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Sorting conditions. Valid values: `startTime` (effective time), `expireTime` (expiration date), `packageUsedSpec` (used capacity), `packageTotalSpec` (total storage capacity). 
Sorting by array order 
     * @return OrderBy Sorting conditions. Valid values: `startTime` (effective time), `expireTime` (expiration date), `packageUsedSpec` (used capacity), `packageTotalSpec` (total storage capacity). 
Sorting by array order
     */
    public String [] getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting conditions. Valid values: `startTime` (effective time), `expireTime` (expiration date), `packageUsedSpec` (used capacity), `packageTotalSpec` (total storage capacity). 
Sorting by array order
     * @param OrderBy Sorting conditions. Valid values: `startTime` (effective time), `expireTime` (expiration date), `packageUsedSpec` (used capacity), `packageTotalSpec` (total storage capacity). 
Sorting by array order
     */
    public void setOrderBy(String [] OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: `ASC` (ascending), `DESC` (descending). 
     * @return OrderDirection Sorting order. Valid values: `ASC` (ascending), `DESC` (descending).
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting order. Valid values: `ASC` (ascending), `DESC` (descending).
     * @param OrderDirection Sorting order. Valid values: `ASC` (ascending), `DESC` (descending).
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
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

