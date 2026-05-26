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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel {

    /**
    * Specifies the security group list to bind to the instance or read-only group.
Security group information can be queried by calling the sgId field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1).
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
    */
    @SerializedName("SecurityGroupIdSet")
    @Expose
    private String [] SecurityGroupIdSet;

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). specify either DBInstanceId or ReadOnlyGroupId. if both are provided, ReadOnlyGroupId is ignored.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725). valid values: DBInstanceId and ReadOnlyGroupId (at least one is required). if you need to modify the associated security group of the read-only group, only ReadOnlyGroupId is required.
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
     * Get Specifies the security group list to bind to the instance or read-only group.
Security group information can be queried by calling the sgId field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1).
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections. 
     * @return SecurityGroupIdSet Specifies the security group list to bind to the instance or read-only group.
Security group information can be queried by calling the sgId field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1).
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     */
    public String [] getSecurityGroupIdSet() {
        return this.SecurityGroupIdSet;
    }

    /**
     * Set Specifies the security group list to bind to the instance or read-only group.
Security group information can be queried by calling the sgId field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1).
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     * @param SecurityGroupIdSet Specifies the security group list to bind to the instance or read-only group.
Security group information can be queried by calling the sgId field in the return value of [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1).
**Note:** This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     */
    public void setSecurityGroupIdSet(String [] SecurityGroupIdSet) {
        this.SecurityGroupIdSet = SecurityGroupIdSet;
    }

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). specify either DBInstanceId or ReadOnlyGroupId. if both are provided, ReadOnlyGroupId is ignored. 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). specify either DBInstanceId or ReadOnlyGroupId. if both are provided, ReadOnlyGroupId is ignored.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). specify either DBInstanceId or ReadOnlyGroupId. if both are provided, ReadOnlyGroupId is ignored.
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). specify either DBInstanceId or ReadOnlyGroupId. if both are provided, ReadOnlyGroupId is ignored.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725). valid values: DBInstanceId and ReadOnlyGroupId (at least one is required). if you need to modify the associated security group of the read-only group, only ReadOnlyGroupId is required. 
     * @return ReadOnlyGroupId ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725). valid values: DBInstanceId and ReadOnlyGroupId (at least one is required). if you need to modify the associated security group of the read-only group, only ReadOnlyGroupId is required.
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725). valid values: DBInstanceId and ReadOnlyGroupId (at least one is required). if you need to modify the associated security group of the read-only group, only ReadOnlyGroupId is required.
     * @param ReadOnlyGroupId ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725). valid values: DBInstanceId and ReadOnlyGroupId (at least one is required). if you need to modify the associated security group of the read-only group, only ReadOnlyGroupId is required.
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    public ModifyDBInstanceSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSecurityGroupsRequest(ModifyDBInstanceSecurityGroupsRequest source) {
        if (source.SecurityGroupIdSet != null) {
            this.SecurityGroupIdSet = new String[source.SecurityGroupIdSet.length];
            for (int i = 0; i < source.SecurityGroupIdSet.length; i++) {
                this.SecurityGroupIdSet[i] = new String(source.SecurityGroupIdSet[i]);
            }
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIdSet.", this.SecurityGroupIdSet);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);

    }
}

