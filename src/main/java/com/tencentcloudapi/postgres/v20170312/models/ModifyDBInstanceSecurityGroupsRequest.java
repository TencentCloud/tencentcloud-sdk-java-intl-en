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

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel{

    /**
    * The list of security groups to be associated with the instance or RO groups.
Information of security groups can be obtained from the `sgld` field in the returned value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.

    */
    @SerializedName("SecurityGroupIdSet")
    @Expose
    private String [] SecurityGroupIdSet;

    /**
    * Instance ID. Either this parameter or `ReadOnlyGroupId` must be passed in. If both parameters are passed in, `ReadOnlyGroupId` will be ignored.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * RO group ID. Either this parameter or `DBInstanceId` must be passed in. To modify  the security groups associated with the RO groups, only pass in `ReadOnlyGroupId`.
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
     * Get The list of security groups to be associated with the instance or RO groups.
Information of security groups can be obtained from the `sgld` field in the returned value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.
 
     * @return SecurityGroupIdSet The list of security groups to be associated with the instance or RO groups.
Information of security groups can be obtained from the `sgld` field in the returned value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.

     */
    public String [] getSecurityGroupIdSet() {
        return this.SecurityGroupIdSet;
    }

    /**
     * Set The list of security groups to be associated with the instance or RO groups.
Information of security groups can be obtained from the `sgld` field in the returned value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.

     * @param SecurityGroupIdSet The list of security groups to be associated with the instance or RO groups.
Information of security groups can be obtained from the `sgld` field in the returned value of the [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808?from_cn_redirect=1) API.

     */
    public void setSecurityGroupIdSet(String [] SecurityGroupIdSet) {
        this.SecurityGroupIdSet = SecurityGroupIdSet;
    }

    /**
     * Get Instance ID. Either this parameter or `ReadOnlyGroupId` must be passed in. If both parameters are passed in, `ReadOnlyGroupId` will be ignored. 
     * @return DBInstanceId Instance ID. Either this parameter or `ReadOnlyGroupId` must be passed in. If both parameters are passed in, `ReadOnlyGroupId` will be ignored.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. Either this parameter or `ReadOnlyGroupId` must be passed in. If both parameters are passed in, `ReadOnlyGroupId` will be ignored.
     * @param DBInstanceId Instance ID. Either this parameter or `ReadOnlyGroupId` must be passed in. If both parameters are passed in, `ReadOnlyGroupId` will be ignored.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get RO group ID. Either this parameter or `DBInstanceId` must be passed in. To modify  the security groups associated with the RO groups, only pass in `ReadOnlyGroupId`. 
     * @return ReadOnlyGroupId RO group ID. Either this parameter or `DBInstanceId` must be passed in. To modify  the security groups associated with the RO groups, only pass in `ReadOnlyGroupId`.
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set RO group ID. Either this parameter or `DBInstanceId` must be passed in. To modify  the security groups associated with the RO groups, only pass in `ReadOnlyGroupId`.
     * @param ReadOnlyGroupId RO group ID. Either this parameter or `DBInstanceId` must be passed in. To modify  the security groups associated with the RO groups, only pass in `ReadOnlyGroupId`.
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

