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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServerlessDBInstanceRequest extends AbstractModel{

    /**
    * Availability zone ID. Only ap-shanghai-2, ap-beijing-1, and ap-guangzhou-2 are supported during the beta test.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance name. The value must be unique for the same account.
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * Kernel version of a PostgreSQL instance. Currently, only 10.4 is supported.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Database character set of a PostgreSQL instance. Currently, only UTF-8 is supported.
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Array of tags to be bound with the instance
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get Availability zone ID. Only ap-shanghai-2, ap-beijing-1, and ap-guangzhou-2 are supported during the beta test. 
     * @return Zone Availability zone ID. Only ap-shanghai-2, ap-beijing-1, and ap-guangzhou-2 are supported during the beta test.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone ID. Only ap-shanghai-2, ap-beijing-1, and ap-guangzhou-2 are supported during the beta test.
     * @param Zone Availability zone ID. Only ap-shanghai-2, ap-beijing-1, and ap-guangzhou-2 are supported during the beta test.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance name. The value must be unique for the same account. 
     * @return DBInstanceName Instance name. The value must be unique for the same account.
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set Instance name. The value must be unique for the same account.
     * @param DBInstanceName Instance name. The value must be unique for the same account.
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get Kernel version of a PostgreSQL instance. Currently, only 10.4 is supported. 
     * @return DBVersion Kernel version of a PostgreSQL instance. Currently, only 10.4 is supported.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Kernel version of a PostgreSQL instance. Currently, only 10.4 is supported.
     * @param DBVersion Kernel version of a PostgreSQL instance. Currently, only 10.4 is supported.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Database character set of a PostgreSQL instance. Currently, only UTF-8 is supported. 
     * @return DBCharset Database character set of a PostgreSQL instance. Currently, only UTF-8 is supported.
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set Database character set of a PostgreSQL instance. Currently, only UTF-8 is supported.
     * @param DBCharset Database character set of a PostgreSQL instance. Currently, only UTF-8 is supported.
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get VPC ID. 
     * @return VpcId VPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID.
     * @param VpcId VPC ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID. 
     * @return SubnetId VPC subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID.
     * @param SubnetId VPC subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Array of tags to be bound with the instance 
     * @return TagList Array of tags to be bound with the instance
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Array of tags to be bound with the instance
     * @param TagList Array of tags to be bound with the instance
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateServerlessDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServerlessDBInstanceRequest(CreateServerlessDBInstanceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

