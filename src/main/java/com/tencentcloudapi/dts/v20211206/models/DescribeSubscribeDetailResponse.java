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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeDetailResponse extends AbstractModel {

    /**
    * The ID of the data subscription, such as subs-b6x64o31tm
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Data subscription instance name
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * The subscribed cloud database instance ID. This value only makes sense if cloud database is subscribed. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The subscribed cloud database instance status. This value only makes sense if cloud database is subscribed. Valid values: running, isolated, offline.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Subscription task billing status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Subscription task status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * Modification time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Creation time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Isolation time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Expiration time for monthly subscription tasks, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Offline time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Auto-renewal flag. It is meaningful only when PayType=0. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * The region where the task is located
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Kafka topic
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Broker address of Kafka serviceNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Broker")
    @Expose
    private String Broker;

    /**
    * Data subscription type. Valid values for non-mongo Product: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo Product: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscribeMode")
    @Expose
    private String SubscribeMode;

    /**
    * Subscription data format. If it is empty, the default format is used: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg is protobuf, mongo is json. When DatabaseType is mysql and cynosdbmysql, there are three optional protocols: protobuf\avro\json. For details on data format, please refer to the consumption demo documentation on the official website.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Information of subscribed tableNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscribeObjects")
    @Expose
    private SubscribeObject [] SubscribeObjects;

    /**
    * Kafka configuration information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KafkaConfig")
    @Expose
    private SubscribeKafkaConfig KafkaConfig;

    /**
    * Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Access type information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointItem [] Endpoints;

    /**
    * Mongo output aggregation settings
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
    * TagNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Subscription task error information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Errors")
    @Expose
    private SubsErr [] Errors;

    /**
    * Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. Fill in true to process, others will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The ID of the data subscription, such as subs-b6x64o31tm 
     * @return SubscribeId The ID of the data subscription, such as subs-b6x64o31tm
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set The ID of the data subscription, such as subs-b6x64o31tm
     * @param SubscribeId The ID of the data subscription, such as subs-b6x64o31tm
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Data subscription instance name 
     * @return SubscribeName Data subscription instance name
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set Data subscription instance name
     * @param SubscribeName Data subscription instance name
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported. 
     * @return Product Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
     * @param Product Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get The subscribed cloud database instance ID. This value only makes sense if cloud database is subscribed. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId The subscribed cloud database instance ID. This value only makes sense if cloud database is subscribed. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The subscribed cloud database instance ID. This value only makes sense if cloud database is subscribed. Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId The subscribed cloud database instance ID. This value only makes sense if cloud database is subscribed. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The subscribed cloud database instance status. This value only makes sense if cloud database is subscribed. Valid values: running, isolated, offline.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceStatus The subscribed cloud database instance status. This value only makes sense if cloud database is subscribed. Valid values: running, isolated, offline.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set The subscribed cloud database instance status. This value only makes sense if cloud database is subscribed. Valid values: running, isolated, offline.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceStatus The subscribed cloud database instance status. This value only makes sense if cloud database is subscribed. Valid values: running, isolated, offline.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Subscription task billing status. Valid values: normal, isolating, isolated, offline, post2PrePayIng. 
     * @return Status Subscription task billing status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Subscription task billing status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
     * @param Status Subscription task billing status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Subscription task status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error. 
     * @return SubsStatus Subscription task status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set Subscription task status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
     * @param SubsStatus Subscription task status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get Modification time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Creation time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time, the format is: Y-m-d h:m:s.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Isolation time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolateTime Isolation time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Isolation time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolateTime Isolation time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Expiration time for monthly subscription tasks, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time for monthly subscription tasks, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time for monthly subscription tasks, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time for monthly subscription tasks, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Offline time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OfflineTime Offline time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Offline time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     * @param OfflineTime Offline time, the format is: Y-m-d h:m:s. Default time: 0000-00-00 00:00:00.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go). 
     * @return PayType Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
     * @param PayType Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Auto-renewal flag. It is meaningful only when PayType=0. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled). 
     * @return AutoRenewFlag Auto-renewal flag. It is meaningful only when PayType=0. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. It is meaningful only when PayType=0. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled).
     * @param AutoRenewFlag Auto-renewal flag. It is meaningful only when PayType=0. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get The region where the task is located 
     * @return Region The region where the task is located
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region where the task is located
     * @param Region The region where the task is located
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Kafka topic
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Topic Kafka topic
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Kafka topic
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Topic Kafka topic
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Broker address of Kafka serviceNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Broker Broker address of Kafka serviceNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBroker() {
        return this.Broker;
    }

    /**
     * Set Broker address of Kafka serviceNote: This field may return null, indicating that no valid values can be obtained.
     * @param Broker Broker address of Kafka serviceNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBroker(String Broker) {
        this.Broker = Broker;
    }

    /**
     * Get Data subscription type. Valid values for non-mongo Product: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo Product: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubscribeMode Data subscription type. Valid values for non-mongo Product: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo Product: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubscribeMode() {
        return this.SubscribeMode;
    }

    /**
     * Set Data subscription type. Valid values for non-mongo Product: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo Product: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubscribeMode Data subscription type. Valid values for non-mongo Product: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo Product: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscribeMode(String SubscribeMode) {
        this.SubscribeMode = SubscribeMode;
    }

    /**
     * Get Subscription data format. If it is empty, the default format is used: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg is protobuf, mongo is json. When DatabaseType is mysql and cynosdbmysql, there are three optional protocols: protobuf\avro\json. For details on data format, please refer to the consumption demo documentation on the official website.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Subscription data format. If it is empty, the default format is used: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg is protobuf, mongo is json. When DatabaseType is mysql and cynosdbmysql, there are three optional protocols: protobuf\avro\json. For details on data format, please refer to the consumption demo documentation on the official website.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Subscription data format. If it is empty, the default format is used: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg is protobuf, mongo is json. When DatabaseType is mysql and cynosdbmysql, there are three optional protocols: protobuf\avro\json. For details on data format, please refer to the consumption demo documentation on the official website.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Subscription data format. If it is empty, the default format is used: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg is protobuf, mongo is json. When DatabaseType is mysql and cynosdbmysql, there are three optional protocols: protobuf\avro\json. For details on data format, please refer to the consumption demo documentation on the official website.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Information of subscribed tableNote: This field may return null, indicating that no valid values can be obtained. 
     * @return SubscribeObjects Information of subscribed tableNote: This field may return null, indicating that no valid values can be obtained.
     */
    public SubscribeObject [] getSubscribeObjects() {
        return this.SubscribeObjects;
    }

    /**
     * Set Information of subscribed tableNote: This field may return null, indicating that no valid values can be obtained.
     * @param SubscribeObjects Information of subscribed tableNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscribeObjects(SubscribeObject [] SubscribeObjects) {
        this.SubscribeObjects = SubscribeObjects;
    }

    /**
     * Get Kafka configuration information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KafkaConfig Kafka configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SubscribeKafkaConfig getKafkaConfig() {
        return this.KafkaConfig;
    }

    /**
     * Set Kafka configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KafkaConfig Kafka configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKafkaConfig(SubscribeKafkaConfig KafkaConfig) {
        this.KafkaConfig = KafkaConfig;
    }

    /**
     * Get Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessType Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessType Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Access type information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Endpoints Access type information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EndpointItem [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set Access type information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Endpoints Access type information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndpoints(EndpointItem [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get Mongo output aggregation settings
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PipelineInfo Mongo output aggregation settings
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set Mongo output aggregation settings
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PipelineInfo Mongo output aggregation settings
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPipelineInfo(PipelineInfo [] PipelineInfo) {
        this.PipelineInfo = PipelineInfo;
    }

    /**
     * Get TagNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags TagNote: This field may return null, indicating that no valid values can be obtained.
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set TagNote: This field may return null, indicating that no valid values can be obtained.
     * @param Tags TagNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Subscription task error information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Errors Subscription task error information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SubsErr [] getErrors() {
        return this.Errors;
    }

    /**
     * Set Subscription task error information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Errors Subscription task error information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrors(SubsErr [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. Fill in true to process, others will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraAttr Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. Fill in true to process, others will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. Fill in true to process, others will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraAttr Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. Fill in true to process, others will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSubscribeDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeDetailResponse(DescribeSubscribeDetailResponse source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubsStatus != null) {
            this.SubsStatus = new String(source.SubsStatus);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Broker != null) {
            this.Broker = new String(source.Broker);
        }
        if (source.SubscribeMode != null) {
            this.SubscribeMode = new String(source.SubscribeMode);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SubscribeObjects != null) {
            this.SubscribeObjects = new SubscribeObject[source.SubscribeObjects.length];
            for (int i = 0; i < source.SubscribeObjects.length; i++) {
                this.SubscribeObjects[i] = new SubscribeObject(source.SubscribeObjects[i]);
            }
        }
        if (source.KafkaConfig != null) {
            this.KafkaConfig = new SubscribeKafkaConfig(source.KafkaConfig);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EndpointItem[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EndpointItem(source.Endpoints[i]);
            }
        }
        if (source.PipelineInfo != null) {
            this.PipelineInfo = new PipelineInfo[source.PipelineInfo.length];
            for (int i = 0; i < source.PipelineInfo.length; i++) {
                this.PipelineInfo[i] = new PipelineInfo(source.PipelineInfo[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Errors != null) {
            this.Errors = new SubsErr[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new SubsErr(source.Errors[i]);
            }
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubsStatus", this.SubsStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Broker", this.Broker);
        this.setParamSimple(map, prefix + "SubscribeMode", this.SubscribeMode);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "SubscribeObjects.", this.SubscribeObjects);
        this.setParamObj(map, prefix + "KafkaConfig.", this.KafkaConfig);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamArrayObj(map, prefix + "PipelineInfo.", this.PipelineInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

