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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationJobsRequest extends AbstractModel{

    /**
    * Data migration task ID such as `dts-amm1jw5q`
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Data migration task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Data migration task status. Valid values: `created`, `checking`, `checkPass`, `checkNotPass`, `readyRun`, `running`, `readyComplete`, `success`, `failed`, `stopping`, `completing`.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Source instance ID in the format of `cdb-c1nl9rpv`
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * Source instance region, such as `ap-guangzhou`.
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * Source database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String [] SrcDatabaseType;

    /**
    * Source instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String [] SrcAccessType;

    /**
    * Target instance ID in the format of `cdb-c1nl9rpv`
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * Target instance region, such as `ap-guangzhou`.
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * Target database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String [] DstDatabaseType;

    /**
    * Target instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
    */
    @SerializedName("DstAccessType")
    @Expose
    private String [] DstAccessType;

    /**
    * Task running mode. Valid values: `immediate`, `timed`.
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * Sorting order. Valid values: `asc`, `desc`. Default value: `desc` by creation time.
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * Number of instances to be returned. Value range: [1,100]. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Tag filter
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get Data migration task ID such as `dts-amm1jw5q` 
     * @return JobId Data migration task ID such as `dts-amm1jw5q`
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Data migration task ID such as `dts-amm1jw5q`
     * @param JobId Data migration task ID such as `dts-amm1jw5q`
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Data migration task name 
     * @return JobName Data migration task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Data migration task name
     * @param JobName Data migration task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Data migration task status. Valid values: `created`, `checking`, `checkPass`, `checkNotPass`, `readyRun`, `running`, `readyComplete`, `success`, `failed`, `stopping`, `completing`. 
     * @return Status Data migration task status. Valid values: `created`, `checking`, `checkPass`, `checkNotPass`, `readyRun`, `running`, `readyComplete`, `success`, `failed`, `stopping`, `completing`.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Data migration task status. Valid values: `created`, `checking`, `checkPass`, `checkNotPass`, `readyRun`, `running`, `readyComplete`, `success`, `failed`, `stopping`, `completing`.
     * @param Status Data migration task status. Valid values: `created`, `checking`, `checkPass`, `checkNotPass`, `readyRun`, `running`, `readyComplete`, `success`, `failed`, `stopping`, `completing`.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Source instance ID in the format of `cdb-c1nl9rpv` 
     * @return SrcInstanceId Source instance ID in the format of `cdb-c1nl9rpv`
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance ID in the format of `cdb-c1nl9rpv`
     * @param SrcInstanceId Source instance ID in the format of `cdb-c1nl9rpv`
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get Source instance region, such as `ap-guangzhou`. 
     * @return SrcRegion Source instance region, such as `ap-guangzhou`.
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set Source instance region, such as `ap-guangzhou`.
     * @param SrcRegion Source instance region, such as `ap-guangzhou`.
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get Source database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql. 
     * @return SrcDatabaseType Source database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
     */
    public String [] getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
     * @param SrcDatabaseType Source database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
     */
    public void setSrcDatabaseType(String [] SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get Source instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM). 
     * @return SrcAccessType Source instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
     */
    public String [] getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
     * @param SrcAccessType Source instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
     */
    public void setSrcAccessType(String [] SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Target instance ID in the format of `cdb-c1nl9rpv` 
     * @return DstInstanceId Target instance ID in the format of `cdb-c1nl9rpv`
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set Target instance ID in the format of `cdb-c1nl9rpv`
     * @param DstInstanceId Target instance ID in the format of `cdb-c1nl9rpv`
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get Target instance region, such as `ap-guangzhou`. 
     * @return DstRegion Target instance region, such as `ap-guangzhou`.
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set Target instance region, such as `ap-guangzhou`.
     * @param DstRegion Target instance region, such as `ap-guangzhou`.
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get Target database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql. 
     * @return DstDatabaseType Target database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
     */
    public String [] getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Target database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
     * @param DstDatabaseType Target database type, such as `sqlserver`, `mysql`, `mongodb`, `redis`, `tendis`, `keewidb`, `clickhouse`, `cynosdbmysql`, `percona`, `tdsqlpercona`, `mariadb`, `tdsqlmysql`, `postgresql.
     */
    public void setDstDatabaseType(String [] DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get Target instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM). 
     * @return DstAccessType Target instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
     */
    public String [] getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
     * @param DstAccessType Target instance access type. Valid values: `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `cdb` (Database); `cvm` (self-build on CVM).
     */
    public void setDstAccessType(String [] DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Task running mode. Valid values: `immediate`, `timed`. 
     * @return RunMode Task running mode. Valid values: `immediate`, `timed`.
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Task running mode. Valid values: `immediate`, `timed`.
     * @param RunMode Task running mode. Valid values: `immediate`, `timed`.
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Sorting order. Valid values: `asc`, `desc`. Default value: `desc` by creation time. 
     * @return OrderSeq Sorting order. Valid values: `asc`, `desc`. Default value: `desc` by creation time.
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * Set Sorting order. Valid values: `asc`, `desc`. Default value: `desc` by creation time.
     * @param OrderSeq Sorting order. Valid values: `asc`, `desc`. Default value: `desc` by creation time.
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
    }

    /**
     * Get Number of instances to be returned. Value range: [1,100]. Default value: `20`. 
     * @return Limit Number of instances to be returned. Value range: [1,100]. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of instances to be returned. Value range: [1,100]. Default value: `20`.
     * @param Limit Number of instances to be returned. Value range: [1,100]. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Tag filter 
     * @return TagFilters Tag filter
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filter
     * @param TagFilters Tag filter
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeMigrationJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationJobsRequest(DescribeMigrationJobsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String[source.SrcDatabaseType.length];
            for (int i = 0; i < source.SrcDatabaseType.length; i++) {
                this.SrcDatabaseType[i] = new String(source.SrcDatabaseType[i]);
            }
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String[source.SrcAccessType.length];
            for (int i = 0; i < source.SrcAccessType.length; i++) {
                this.SrcAccessType[i] = new String(source.SrcAccessType[i]);
            }
        }
        if (source.DstInstanceId != null) {
            this.DstInstanceId = new String(source.DstInstanceId);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String[source.DstDatabaseType.length];
            for (int i = 0; i < source.DstDatabaseType.length; i++) {
                this.DstDatabaseType[i] = new String(source.DstDatabaseType[i]);
            }
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String[source.DstAccessType.length];
            for (int i = 0; i < source.DstAccessType.length; i++) {
                this.DstAccessType[i] = new String(source.DstAccessType[i]);
            }
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.OrderSeq != null) {
            this.OrderSeq = new String(source.OrderSeq);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamArraySimple(map, prefix + "SrcDatabaseType.", this.SrcDatabaseType);
        this.setParamArraySimple(map, prefix + "SrcAccessType.", this.SrcAccessType);
        this.setParamSimple(map, prefix + "DstInstanceId", this.DstInstanceId);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamArraySimple(map, prefix + "DstDatabaseType.", this.DstDatabaseType);
        this.setParamArraySimple(map, prefix + "DstAccessType.", this.DstAccessType);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "OrderSeq", this.OrderSeq);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

