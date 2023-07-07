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

public class DescribeResourcePackageDetailRequest extends AbstractModel{

    /**
    * The unique ID of a resource pack
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Instance ID
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
     * Get The unique ID of a resource pack 
     * @return PackageId The unique ID of a resource pack
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set The unique ID of a resource pack
     * @param PackageId The unique ID of a resource pack
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Instance ID 
     * @return ClusterIds Instance ID
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Instance ID
     * @param ClusterIds Instance ID
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    public DescribeResourcePackageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePackageDetailRequest(DescribeResourcePackageDetailRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

