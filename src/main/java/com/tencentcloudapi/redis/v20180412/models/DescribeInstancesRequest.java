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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * Instance list size. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is an integral multiple of `Limit`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Instance ID, such as crs-6ubhgouj
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Enumerated values: projectId, createtime, instancename, type, curDeadline
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1: reverse; 0: sequential; reverse by default
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Array of VPC IDs such as 47525. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * Array of subnet IDs such as 56854. The array subscript starts from 0
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Array of project IDs. The array subscript starts from 0
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * ID of the instance to be searched for.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Array of VPC IDs such as vpc-sad23jfdfk. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * Array of subnet IDs such as subnet-fdj24n34j2. The array subscript starts from 0
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * Region ID, which has already been disused. The corresponding region can be queried through the common parameter `Region`
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Type edition. 1: standalone edition; 2: primary-secondary edition; 3: cluster edition
    */
    @SerializedName("TypeVersion")
    @Expose
    private Long TypeVersion;

    /**
    * Engine information: Redis-2.8, Redis-4.0, CKV
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * Renewal mode. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * Billing method. postpaid: pay-as-you-go; prepaid: monthly subscription
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * Instance type. 1: legacy Redis Cluster Edition, 2: Redis 2.8 Master-Slave Edition, 3: CKV Master-Slave Edition, 4: CKV Cluster Edition, 5: Redis 2.8 Standalone Edition, 6: Redis 4.0 Master-Slave Edition, 7: Redis 4.0 Cluster Edition, 8: Redis 5.0 Master-Slave Edition, 9: Redis 5.0 Cluster Edition,
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Search keywords, which can be instance ID, instance name, or complete IP
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * Internal parameter, which can be ignored
    */
    @SerializedName("TypeList")
    @Expose
    private Long [] TypeList;

    /**
    * Internal parameter, which can be ignored
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
     * Get Instance list size. Default value: 20 
     * @return Limit Instance list size. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Instance list size. Default value: 20
     * @param Limit Instance list size. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is an integral multiple of `Limit` 
     * @return Offset Offset, which is an integral multiple of `Limit`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integral multiple of `Limit`
     * @param Offset Offset, which is an integral multiple of `Limit`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Instance ID, such as crs-6ubhgouj 
     * @return InstanceId Instance ID, such as crs-6ubhgouj
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as crs-6ubhgouj
     * @param InstanceId Instance ID, such as crs-6ubhgouj
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Enumerated values: projectId, createtime, instancename, type, curDeadline 
     * @return OrderBy Enumerated values: projectId, createtime, instancename, type, curDeadline
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Enumerated values: projectId, createtime, instancename, type, curDeadline
     * @param OrderBy Enumerated values: projectId, createtime, instancename, type, curDeadline
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 1: reverse; 0: sequential; reverse by default 
     * @return OrderType 1: reverse; 0: sequential; reverse by default
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 1: reverse; 0: sequential; reverse by default
     * @param OrderType 1: reverse; 0: sequential; reverse by default
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Array of VPC IDs such as 47525. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default 
     * @return VpcIds Array of VPC IDs such as 47525. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set Array of VPC IDs such as 47525. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
     * @param VpcIds Array of VPC IDs such as 47525. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get Array of subnet IDs such as 56854. The array subscript starts from 0 
     * @return SubnetIds Array of subnet IDs such as 56854. The array subscript starts from 0
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Array of subnet IDs such as 56854. The array subscript starts from 0
     * @param SubnetIds Array of subnet IDs such as 56854. The array subscript starts from 0
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Array of project IDs. The array subscript starts from 0 
     * @return ProjectIds Array of project IDs. The array subscript starts from 0
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Array of project IDs. The array subscript starts from 0
     * @param ProjectIds Array of project IDs. The array subscript starts from 0
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get ID of the instance to be searched for. 
     * @return SearchKey ID of the instance to be searched for.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set ID of the instance to be searched for.
     * @param SearchKey ID of the instance to be searched for.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Array of VPC IDs such as vpc-sad23jfdfk. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default 
     * @return UniqVpcIds Array of VPC IDs such as vpc-sad23jfdfk. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set Array of VPC IDs such as vpc-sad23jfdfk. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
     * @param UniqVpcIds Array of VPC IDs such as vpc-sad23jfdfk. The array subscript starts from 0. If this parameter is not passed in, the basic network will be selected by default
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get Array of subnet IDs such as subnet-fdj24n34j2. The array subscript starts from 0 
     * @return UniqSubnetIds Array of subnet IDs such as subnet-fdj24n34j2. The array subscript starts from 0
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set Array of subnet IDs such as subnet-fdj24n34j2. The array subscript starts from 0
     * @param UniqSubnetIds Array of subnet IDs such as subnet-fdj24n34j2. The array subscript starts from 0
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get Region ID, which has already been disused. The corresponding region can be queried through the common parameter `Region` 
     * @return RegionIds Region ID, which has already been disused. The corresponding region can be queried through the common parameter `Region`
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Region ID, which has already been disused. The corresponding region can be queried through the common parameter `Region`
     * @param RegionIds Region ID, which has already been disused. The corresponding region can be queried through the common parameter `Region`
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted 
     * @return Status Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
     * @param Status Instance status. 0: to be initialized; 1: in process; 2: running; -2: isolated; -3: to be deleted
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Type edition. 1: standalone edition; 2: primary-secondary edition; 3: cluster edition 
     * @return TypeVersion Type edition. 1: standalone edition; 2: primary-secondary edition; 3: cluster edition
     */
    public Long getTypeVersion() {
        return this.TypeVersion;
    }

    /**
     * Set Type edition. 1: standalone edition; 2: primary-secondary edition; 3: cluster edition
     * @param TypeVersion Type edition. 1: standalone edition; 2: primary-secondary edition; 3: cluster edition
     */
    public void setTypeVersion(Long TypeVersion) {
        this.TypeVersion = TypeVersion;
    }

    /**
     * Get Engine information: Redis-2.8, Redis-4.0, CKV 
     * @return EngineName Engine information: Redis-2.8, Redis-4.0, CKV
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set Engine information: Redis-2.8, Redis-4.0, CKV
     * @param EngineName Engine information: Redis-2.8, Redis-4.0, CKV
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get Renewal mode. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled 
     * @return AutoRenew Renewal mode. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Renewal mode. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     * @param AutoRenew Renewal mode. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Billing method. postpaid: pay-as-you-go; prepaid: monthly subscription 
     * @return BillingMode Billing method. postpaid: pay-as-you-go; prepaid: monthly subscription
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing method. postpaid: pay-as-you-go; prepaid: monthly subscription
     * @param BillingMode Billing method. postpaid: pay-as-you-go; prepaid: monthly subscription
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Instance type. 1: legacy Redis Cluster Edition, 2: Redis 2.8 Master-Slave Edition, 3: CKV Master-Slave Edition, 4: CKV Cluster Edition, 5: Redis 2.8 Standalone Edition, 6: Redis 4.0 Master-Slave Edition, 7: Redis 4.0 Cluster Edition, 8: Redis 5.0 Master-Slave Edition, 9: Redis 5.0 Cluster Edition, 
     * @return Type Instance type. 1: legacy Redis Cluster Edition, 2: Redis 2.8 Master-Slave Edition, 3: CKV Master-Slave Edition, 4: CKV Cluster Edition, 5: Redis 2.8 Standalone Edition, 6: Redis 4.0 Master-Slave Edition, 7: Redis 4.0 Cluster Edition, 8: Redis 5.0 Master-Slave Edition, 9: Redis 5.0 Cluster Edition,
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Instance type. 1: legacy Redis Cluster Edition, 2: Redis 2.8 Master-Slave Edition, 3: CKV Master-Slave Edition, 4: CKV Cluster Edition, 5: Redis 2.8 Standalone Edition, 6: Redis 4.0 Master-Slave Edition, 7: Redis 4.0 Cluster Edition, 8: Redis 5.0 Master-Slave Edition, 9: Redis 5.0 Cluster Edition,
     * @param Type Instance type. 1: legacy Redis Cluster Edition, 2: Redis 2.8 Master-Slave Edition, 3: CKV Master-Slave Edition, 4: CKV Cluster Edition, 5: Redis 2.8 Standalone Edition, 6: Redis 4.0 Master-Slave Edition, 7: Redis 4.0 Cluster Edition, 8: Redis 5.0 Master-Slave Edition, 9: Redis 5.0 Cluster Edition,
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Search keywords, which can be instance ID, instance name, or complete IP 
     * @return SearchKeys Search keywords, which can be instance ID, instance name, or complete IP
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set Search keywords, which can be instance ID, instance name, or complete IP
     * @param SearchKeys Search keywords, which can be instance ID, instance name, or complete IP
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get Internal parameter, which can be ignored 
     * @return TypeList Internal parameter, which can be ignored
     */
    public Long [] getTypeList() {
        return this.TypeList;
    }

    /**
     * Set Internal parameter, which can be ignored
     * @param TypeList Internal parameter, which can be ignored
     */
    public void setTypeList(Long [] TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get Internal parameter, which can be ignored 
     * @return MonitorVersion Internal parameter, which can be ignored
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set Internal parameter, which can be ignored
     * @param MonitorVersion Internal parameter, which can be ignored
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.UniqVpcIds != null) {
            this.UniqVpcIds = new String[source.UniqVpcIds.length];
            for (int i = 0; i < source.UniqVpcIds.length; i++) {
                this.UniqVpcIds[i] = new String(source.UniqVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.TypeVersion != null) {
            this.TypeVersion = new Long(source.TypeVersion);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long[source.AutoRenew.length];
            for (int i = 0; i < source.AutoRenew.length; i++) {
                this.AutoRenew[i] = new Long(source.AutoRenew[i]);
            }
        }
        if (source.BillingMode != null) {
            this.BillingMode = new String(source.BillingMode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.TypeList != null) {
            this.TypeList = new Long[source.TypeList.length];
            for (int i = 0; i < source.TypeList.length; i++) {
                this.TypeList[i] = new Long(source.TypeList[i]);
            }
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "TypeVersion", this.TypeVersion);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamArraySimple(map, prefix + "AutoRenew.", this.AutoRenew);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "TypeList.", this.TypeList);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);

    }
}

