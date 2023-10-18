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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceInterRequest extends AbstractModel {

    /**
    * The maximum number of results returned per page. Value range: 1-100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter by instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Filter by status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6` (Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The list of instance version numbers
    */
    @SerializedName("VersionSet")
    @Expose
    private String [] VersionSet;

    /**
    * Instance AZ ID in the format of ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Page number. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get The maximum number of results returned per page. Value range: 1-100. 
     * @return Limit The maximum number of results returned per page. Value range: 1-100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of results returned per page. Value range: 1-100.
     * @param Limit The maximum number of results returned per page. Value range: 1-100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter by instance ID 
     * @return InstanceId Filter by instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Filter by instance ID
     * @param InstanceId Filter by instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Filter by status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6` (Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group). 
     * @return Status Filter by status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6` (Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Filter by status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6` (Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
     * @param Status Filter by status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6` (Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The list of instance version numbers 
     * @return VersionSet The list of instance version numbers
     */
    public String [] getVersionSet() {
        return this.VersionSet;
    }

    /**
     * Set The list of instance version numbers
     * @param VersionSet The list of instance version numbers
     */
    public void setVersionSet(String [] VersionSet) {
        this.VersionSet = VersionSet;
    }

    /**
     * Get Instance AZ ID in the format of ap-guangzhou-2 
     * @return Zone Instance AZ ID in the format of ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ ID in the format of ap-guangzhou-2
     * @param Zone Instance AZ ID in the format of ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Page number. Default value: `0`. 
     * @return Offset Page number. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: `0`.
     * @param Offset Page number. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeDBInstanceInterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceInterRequest(DescribeDBInstanceInterRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VersionSet != null) {
            this.VersionSet = new String[source.VersionSet.length];
            for (int i = 0; i < source.VersionSet.length; i++) {
                this.VersionSet[i] = new String(source.VersionSet[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "VersionSet.", this.VersionSet);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

