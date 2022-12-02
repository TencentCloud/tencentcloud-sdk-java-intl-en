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

public class CreateSyncJobRequest extends AbstractModel{

    /**
    * Billing mode. Valid values: `PrePay` (monthly subscription); `PostPay` (pay-as-you-go). Currently, DTS at Tencent Cloud International is free of charge.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Source database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * Source database region, such as `ap-guangzhou`.
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * Target database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * Target database region, such as `ap-guangzhou`.
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * Sync task specification, such as `Standard`.
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * Tag
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Number of sync tasks
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Auto-renewal flag
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Sync link specification
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * Sync link name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * ID of the existing task used to create a similar task
    */
    @SerializedName("ExistedJobId")
    @Expose
    private String ExistedJobId;

    /**
     * Get Billing mode. Valid values: `PrePay` (monthly subscription); `PostPay` (pay-as-you-go). Currently, DTS at Tencent Cloud International is free of charge. 
     * @return PayMode Billing mode. Valid values: `PrePay` (monthly subscription); `PostPay` (pay-as-you-go). Currently, DTS at Tencent Cloud International is free of charge.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. Valid values: `PrePay` (monthly subscription); `PostPay` (pay-as-you-go). Currently, DTS at Tencent Cloud International is free of charge.
     * @param PayMode Billing mode. Valid values: `PrePay` (monthly subscription); `PostPay` (pay-as-you-go). Currently, DTS at Tencent Cloud International is free of charge.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Source database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`. 
     * @return SrcDatabaseType Source database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
     * @param SrcDatabaseType Source database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get Source database region, such as `ap-guangzhou`. 
     * @return SrcRegion Source database region, such as `ap-guangzhou`.
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set Source database region, such as `ap-guangzhou`.
     * @param SrcRegion Source database region, such as `ap-guangzhou`.
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get Target database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`. 
     * @return DstDatabaseType Target database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Target database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
     * @param DstDatabaseType Target database type, such as `mysql`, `cynosdbmysql`, `tdapg`, `tdpg`, and `tdsqlmysql`.
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get Target database region, such as `ap-guangzhou`. 
     * @return DstRegion Target database region, such as `ap-guangzhou`.
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set Target database region, such as `ap-guangzhou`.
     * @param DstRegion Target database region, such as `ap-guangzhou`.
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get Sync task specification, such as `Standard`. 
     * @return Specification Sync task specification, such as `Standard`.
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set Sync task specification, such as `Standard`.
     * @param Specification Sync task specification, such as `Standard`.
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get Tag 
     * @return Tags Tag
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
     * @param Tags Tag
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Number of sync tasks 
     * @return Count Number of sync tasks
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of sync tasks
     * @param Count Number of sync tasks
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Auto-renewal flag 
     * @return AutoRenew Auto-renewal flag
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Auto-renewal flag
     * @param AutoRenew Auto-renewal flag
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Sync link specification 
     * @return InstanceClass Sync link specification
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set Sync link specification
     * @param InstanceClass Sync link specification
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get Sync link name 
     * @return JobName Sync link name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Sync link name
     * @param JobName Sync link name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get ID of the existing task used to create a similar task 
     * @return ExistedJobId ID of the existing task used to create a similar task
     */
    public String getExistedJobId() {
        return this.ExistedJobId;
    }

    /**
     * Set ID of the existing task used to create a similar task
     * @param ExistedJobId ID of the existing task used to create a similar task
     */
    public void setExistedJobId(String ExistedJobId) {
        this.ExistedJobId = ExistedJobId;
    }

    public CreateSyncJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSyncJobRequest(CreateSyncJobRequest source) {
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String(source.SrcDatabaseType);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String(source.DstDatabaseType);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.ExistedJobId != null) {
            this.ExistedJobId = new String(source.ExistedJobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "ExistedJobId", this.ExistedJobId);

    }
}

