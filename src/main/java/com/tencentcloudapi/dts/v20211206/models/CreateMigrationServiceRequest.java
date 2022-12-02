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

public class CreateMigrationServiceRequest extends AbstractModel{

    /**
    * Source database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * Target database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * Source instance region, such as `ap-guangzhou`.
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * Target instance region, such as `ap-guangzhou`. Note that it must be the same as the API request region.
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * Instance specification. Valid values: `micro`, `small`, `medium`, `large`, `xlarge`, `2xlarge`.
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * Quantity. Value range: [1,15]. Default value: `1`.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Migration task name, which can contain up to 128 characters.
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Tag information
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
     * Get Source database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`. 
     * @return SrcDatabaseType Source database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
     * @param SrcDatabaseType Source database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get Target database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`. 
     * @return DstDatabaseType Target database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Target database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
     * @param DstDatabaseType Target database type. Valid values: `mysql`, `redis`, `percona`, `mongodb`, `postgresql`, `sqlserver`, `mariadb`.
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
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
     * Get Target instance region, such as `ap-guangzhou`. Note that it must be the same as the API request region. 
     * @return DstRegion Target instance region, such as `ap-guangzhou`. Note that it must be the same as the API request region.
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set Target instance region, such as `ap-guangzhou`. Note that it must be the same as the API request region.
     * @param DstRegion Target instance region, such as `ap-guangzhou`. Note that it must be the same as the API request region.
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get Instance specification. Valid values: `micro`, `small`, `medium`, `large`, `xlarge`, `2xlarge`. 
     * @return InstanceClass Instance specification. Valid values: `micro`, `small`, `medium`, `large`, `xlarge`, `2xlarge`.
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set Instance specification. Valid values: `micro`, `small`, `medium`, `large`, `xlarge`, `2xlarge`.
     * @param InstanceClass Instance specification. Valid values: `micro`, `small`, `medium`, `large`, `xlarge`, `2xlarge`.
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get Quantity. Value range: [1,15]. Default value: `1`. 
     * @return Count Quantity. Value range: [1,15]. Default value: `1`.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantity. Value range: [1,15]. Default value: `1`.
     * @param Count Quantity. Value range: [1,15]. Default value: `1`.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Migration task name, which can contain up to 128 characters. 
     * @return JobName Migration task name, which can contain up to 128 characters.
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Migration task name, which can contain up to 128 characters.
     * @param JobName Migration task name, which can contain up to 128 characters.
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Tag information 
     * @return Tags Tag information
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information
     * @param Tags Tag information
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    public CreateMigrationServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMigrationServiceRequest(CreateMigrationServiceRequest source) {
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String(source.SrcDatabaseType);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String(source.DstDatabaseType);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

