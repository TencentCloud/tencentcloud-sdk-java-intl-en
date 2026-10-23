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

public class ExportResourcePackageDeductDetailsRequest extends AbstractModel {

    /**
    * Resource package ID to be exported
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * cynos cluster ID that uses the resource pack capacity
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Sorting field. Currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting type. Supports `ASC`, `DESC`, `asc`, and `desc`.
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
    * A maximum of 2000 rows of data can be exported at a time.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Offset and page number
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Data export format. Currently only csv format is supported. Reserved for extension.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get Resource package ID to be exported 
     * @return PackageId Resource package ID to be exported
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Resource package ID to be exported
     * @param PackageId Resource package ID to be exported
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get cynos cluster ID that uses the resource pack capacity 
     * @return ClusterIds cynos cluster ID that uses the resource pack capacity
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set cynos cluster ID that uses the resource pack capacity
     * @param ClusterIds cynos cluster ID that uses the resource pack capacity
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Sorting field. Currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount) 
     * @return OrderBy Sorting field. Currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount)
     * @param OrderBy Sorting field. Currently supports: createTime (resource package deduction time), successDeductSpec (resource package deduction amount)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting type. Supports `ASC`, `DESC`, `asc`, and `desc`. 
     * @return OrderByType Sorting type. Supports `ASC`, `DESC`, `asc`, and `desc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting type. Supports `ASC`, `DESC`, `asc`, and `desc`.
     * @param OrderByType Sorting type. Supports `ASC`, `DESC`, `asc`, and `desc`.
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
     * Get A maximum of 2000 rows of data can be exported at a time. 
     * @return Limit A maximum of 2000 rows of data can be exported at a time.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set A maximum of 2000 rows of data can be exported at a time.
     * @param Limit A maximum of 2000 rows of data can be exported at a time.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset and page number 
     * @return Offset Offset and page number
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset and page number
     * @param Offset Offset and page number
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Data export format. Currently only csv format is supported. Reserved for extension. 
     * @return FileType Data export format. Currently only csv format is supported. Reserved for extension.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Data export format. Currently only csv format is supported. Reserved for extension.
     * @param FileType Data export format. Currently only csv format is supported. Reserved for extension.
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

