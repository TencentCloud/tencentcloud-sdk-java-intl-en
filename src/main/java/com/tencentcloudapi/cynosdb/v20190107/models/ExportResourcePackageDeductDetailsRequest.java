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

public class ExportResourcePackageDeductDetailsRequest extends AbstractModel {

    /**
    * Resource package ID to be exported.
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Specifies the cluster ID of the cynos cluster that uses the resource package capacity.
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Sorting field. currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount).
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting type. supports ASC, DESC, ASC, DESC.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * A maximum of 2000 rows of data can be exported at a time. currently, a maximum of 2000 rows are supported.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Offset and page number.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Specifies the format for exporting data. currently only supports csv format, reserved for future expansion.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get Resource package ID to be exported. 
     * @return PackageId Resource package ID to be exported.
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Resource package ID to be exported.
     * @param PackageId Resource package ID to be exported.
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Specifies the cluster ID of the cynos cluster that uses the resource package capacity. 
     * @return ClusterIds Specifies the cluster ID of the cynos cluster that uses the resource package capacity.
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Specifies the cluster ID of the cynos cluster that uses the resource package capacity.
     * @param ClusterIds Specifies the cluster ID of the cynos cluster that uses the resource package capacity.
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Sorting field. currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount). 
     * @return OrderBy Sorting field. currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount).
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount).
     * @param OrderBy Sorting field. currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount).
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting type. supports ASC, DESC, ASC, DESC. 
     * @return OrderByType Sorting type. supports ASC, DESC, ASC, DESC.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting type. supports ASC, DESC, ASC, DESC.
     * @param OrderByType Sorting type. supports ASC, DESC, ASC, DESC.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get A maximum of 2000 rows of data can be exported at a time. currently, a maximum of 2000 rows are supported. 
     * @return Limit A maximum of 2000 rows of data can be exported at a time. currently, a maximum of 2000 rows are supported.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set A maximum of 2000 rows of data can be exported at a time. currently, a maximum of 2000 rows are supported.
     * @param Limit A maximum of 2000 rows of data can be exported at a time. currently, a maximum of 2000 rows are supported.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset and page number. 
     * @return Offset Offset and page number.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset and page number.
     * @param Offset Offset and page number.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Specifies the format for exporting data. currently only supports csv format, reserved for future expansion. 
     * @return FileType Specifies the format for exporting data. currently only supports csv format, reserved for future expansion.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Specifies the format for exporting data. currently only supports csv format, reserved for future expansion.
     * @param FileType Specifies the format for exporting data. currently only supports csv format, reserved for future expansion.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public ExportResourcePackageDeductDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportResourcePackageDeductDetailsRequest(ExportResourcePackageDeductDetailsRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

