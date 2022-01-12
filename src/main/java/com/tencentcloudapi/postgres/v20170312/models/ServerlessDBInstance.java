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

public class ServerlessDBInstance extends AbstractModel{

    /**
    * Instance ID, which is the unique identifier
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * Instance status
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * Region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability zone
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Project ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Character set
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * Database version
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance network information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private ServerlessDBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * Instance account information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBAccountSet")
    @Expose
    private ServerlessDBAccount [] DBAccountSet;

    /**
    * Information of the databases in an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBDatabaseList")
    @Expose
    private String [] DBDatabaseList;

    /**
    * The array of tags bound to an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Database kernel version
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * Database major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
     * Get Instance ID, which is the unique identifier
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBInstanceId Instance ID, which is the unique identifier
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID, which is the unique identifier
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBInstanceId Instance ID, which is the unique identifier
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBInstanceName Instance name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set Instance name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBInstanceName Instance name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get Instance status
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBInstanceStatus Instance status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set Instance status
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBInstanceStatus Instance status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get Region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Region Region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Region Region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Availability zone
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Zone Availability zone
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Zone Availability zone
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Project ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ProjectId Project ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Character set
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBCharset Character set
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set Character set
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBCharset Character set
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get Database version
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBVersion Database version
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Database version
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBVersion Database version
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Creation time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance network information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBInstanceNetInfo Instance network information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ServerlessDBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set Instance network information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBInstanceNetInfo Instance network information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBInstanceNetInfo(ServerlessDBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get Instance account information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBAccountSet Instance account information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ServerlessDBAccount [] getDBAccountSet() {
        return this.DBAccountSet;
    }

    /**
     * Set Instance account information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBAccountSet Instance account information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBAccountSet(ServerlessDBAccount [] DBAccountSet) {
        this.DBAccountSet = DBAccountSet;
    }

    /**
     * Get Information of the databases in an instance
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBDatabaseList Information of the databases in an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getDBDatabaseList() {
        return this.DBDatabaseList;
    }

    /**
     * Set Information of the databases in an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBDatabaseList Information of the databases in an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBDatabaseList(String [] DBDatabaseList) {
        this.DBDatabaseList = DBDatabaseList;
    }

    /**
     * Get The array of tags bound to an instance
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TagList The array of tags bound to an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set The array of tags bound to an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TagList The array of tags bound to an instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Database kernel version
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBKernelVersion Database kernel version
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set Database kernel version
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBKernelVersion Database kernel version
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get Database major version number
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBMajorVersion Database major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set Database major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBMajorVersion Database major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    public ServerlessDBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessDBInstance(ServerlessDBInstance source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBInstanceStatus != null) {
            this.DBInstanceStatus = new String(source.DBInstanceStatus);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new ServerlessDBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new ServerlessDBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.DBAccountSet != null) {
            this.DBAccountSet = new ServerlessDBAccount[source.DBAccountSet.length];
            for (int i = 0; i < source.DBAccountSet.length; i++) {
                this.DBAccountSet[i] = new ServerlessDBAccount(source.DBAccountSet[i]);
            }
        }
        if (source.DBDatabaseList != null) {
            this.DBDatabaseList = new String[source.DBDatabaseList.length];
            for (int i = 0; i < source.DBDatabaseList.length; i++) {
                this.DBDatabaseList[i] = new String(source.DBDatabaseList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceStatus", this.DBInstanceStatus);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamArrayObj(map, prefix + "DBAccountSet.", this.DBAccountSet);
        this.setParamArraySimple(map, prefix + "DBDatabaseList.", this.DBDatabaseList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);

    }
}

