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
package com.tencentcloudapi.trocket.v20230308;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trocket.v20230308.models.*;

public class TrocketClient extends AbstractClient{
    private static String endpoint = "trocket.intl.tencentcloudapi.com";
    private static String service = "trocket";
    private static String version = "2023-03-08";

    public TrocketClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrocketClient(Credential credential, String region, ClientProfile profile) {
        super(TrocketClient.endpoint, TrocketClient.version, credential, region, profile);
    }

    /**
     *This API is used to modify the Topic status during migration and go to next step.
     * @param req ChangeMigratingTopicToNextStageRequest
     * @return ChangeMigratingTopicToNextStageResponse
     * @throws TencentCloudSDKException
     */
    public ChangeMigratingTopicToNextStageResponse ChangeMigratingTopicToNextStage(ChangeMigratingTopicToNextStageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeMigratingTopicToNextStage", ChangeMigratingTopicToNextStageResponse.class);
    }

    /**
     *Create consumer groups.
     * @param req CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerGroupResponse CreateConsumerGroup(CreateConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumerGroup", CreateConsumerGroupResponse.class);
    }

    /**
     *This API is used to create a RocketMQ 5.x cluster.
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *This API is used to add a role.
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *This API is used to delete a consumer group. After a consumer group is deleted, all configurations and related data of the consumer group are cleared and cannot be restored. After deletion, online consumer clients report errors. It is recommended to take clients offline in advance.
     * @param req DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerGroupResponse DeleteConsumerGroup(DeleteConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumerGroup", DeleteConsumerGroupResponse.class);
    }

    /**
     *This API is used to delete a TDMQ RocketMQ 5.x cluster. Topics, consumer groups, and roles in use should be deleted first.
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *This API is used to delete a role. Make sure that the related information on this role is not used in the current code. After the role is deleted, the keys (AccessKey and SecretKey) used to produce or consume messages with this role become invalid immediately.
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRole", DeleteRoleResponse.class);
    }

    /**
     *This API is used to delete a smooth migration task. Only canceled tasks can be deleted.
     * @param req DeleteSmoothMigrationTaskRequest
     * @return DeleteSmoothMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmoothMigrationTaskResponse DeleteSmoothMigrationTask(DeleteSmoothMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSmoothMigrationTask", DeleteSmoothMigrationTaskResponse.class);
    }

    /**
     *This API is used to delete a topic. After deletion, all configurations and related data of the topic will be cleared and cannot be restored.
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *Query consumer client details.
     * @param req DescribeConsumerClientRequest
     * @return DescribeConsumerClientResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerClientResponse DescribeConsumerClient(DescribeConsumerClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerClient", DescribeConsumerClientResponse.class);
    }

    /**
     *This API is used to query the client connection list of a consumer group.
     * @param req DescribeConsumerClientListRequest
     * @return DescribeConsumerClientListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerClientListResponse DescribeConsumerClientList(DescribeConsumerClientListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerClientList", DescribeConsumerClientListResponse.class);
    }

    /**
     *Query consumer group details.
     * @param req DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupResponse DescribeConsumerGroup(DescribeConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroup", DescribeConsumerGroupResponse.class);
    }

    /**
     *This API is used to query the number of heaped messages in a specified consumer group.
     * @param req DescribeConsumerLagRequest
     * @return DescribeConsumerLagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerLagResponse DescribeConsumerLag(DescribeConsumerLagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerLag", DescribeConsumerLagResponse.class);
    }

    /**
     *This API is used to describe clusters, supporting both 4.x and 5.x clusters. Among them, parameter usage of Filters is as follows:.

-InstanceName, the cluster name, supports fuzzy query and can be obtained from the API return value or console.
-InstanceId Cluster ID, exact query, obtain from the current API or console.
- InstanceType cluster type, see [InstanceItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#InstanceItem) data structure, supports multiple selections.
- Version: cluster edition, enumeration values as follows:.
-4 RocketMQ 4.x clusters.
-Deploy a RocketMQ 5.x cluster.

This API is used to demonstrate Filters.
 [{ "Name": "InstanceId", "Values": ["rmq-72mo3a9o"] }]
     * @param req DescribeFusionInstanceListRequest
     * @return DescribeFusionInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFusionInstanceListResponse DescribeFusionInstanceList(DescribeFusionInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFusionInstanceList", DescribeFusionInstanceListResponse.class);
    }

    /**
     *This API is used to query RocketMQ 5.x cluster information.
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *This API is used to describe clusters. It only supports 5.x clusters. Description of the Filters parameter use is as follows:.

-InstanceName Cluster name, supports fuzzy search.
- InstanceId The Tencent Cloud RocketMQ instance ID, obtained from the [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) API or console.
- InstanceType cluster type, see [InstanceItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#InstanceItem) data structure, supports multiple selections.
-InstanceStatus cluster status, see [InstanceItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#InstanceItem) data structure, supports multiple selections.

This API is used to demonstrate Filters.
[{
    "Name": "InstanceId",
    "Values": ["rmq-72mo3a9o"]
}]
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *Query message details.
     * @param req DescribeMessageRequest
     * @return DescribeMessageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageResponse DescribeMessage(DescribeMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessage", DescribeMessageResponse.class);
    }

    /**
     *Query the message list. If querying dead letter messages, set the ConsumerGroup parameter.
     * @param req DescribeMessageListRequest
     * @return DescribeMessageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageListResponse DescribeMessageList(DescribeMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageList", DescribeMessageListResponse.class);
    }

    /**
     *This API is used to query message trace by message ID.
     * @param req DescribeMessageTraceRequest
     * @return DescribeMessageTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageTraceResponse DescribeMessageTrace(DescribeMessageTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageTrace", DescribeMessageTraceResponse.class);
    }

    /**
     *This API is used to view real-time information of migration consumption groups.
     * @param req DescribeMigratingGroupStatsRequest
     * @return DescribeMigratingGroupStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigratingGroupStatsResponse DescribeMigratingGroupStats(DescribeMigratingGroupStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigratingGroupStats", DescribeMigratingGroupStatsResponse.class);
    }

    /**
     *This API is used to query the Topic migration status list.

The Filters field is a query filter that supports the following conditions:.
This API is used to get topic names with fuzzy query support.
This api is used to query the migration status. See the data structure in MigratingTopic (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#MigratingTopic).
This API is used to manage namespaces, valid only for 4.x clusters.

This API is used to demonstrate Filters.
[{
    "Name": "TopicName",
    "Values": ["topic-a"]
}]
     * @param req DescribeMigratingTopicListRequest
     * @return DescribeMigratingTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigratingTopicListResponse DescribeMigratingTopicList(DescribeMigratingTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigratingTopicList", DescribeMigratingTopicListResponse.class);
    }

    /**
     *This API is used to query real-time data of migration topics.
     * @param req DescribeMigratingTopicStatsRequest
     * @return DescribeMigratingTopicStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigratingTopicStatsResponse DescribeMigratingTopicStats(DescribeMigratingTopicStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigratingTopicStats", DescribeMigratingTopicStatsResponse.class);
    }

    /**
     *This API is used to search the data migration task list. Filter parameter usage instructions are as follows:.

This API is used to search precisely according to task ID.
InstanceId. This API is used to precisely search based on instance ID.
This API is used to search by task Type.
     * @param req DescribeMigrationTaskListRequest
     * @return DescribeMigrationTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationTaskListResponse DescribeMigrationTaskList(DescribeMigrationTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationTaskList", DescribeMigrationTaskListResponse.class);
    }

    /**
     *This API is used to query producer list information associated with a topic. Filters support the following criteria:.
-client IP.
-client ID.
     * @param req DescribeProducerListRequest
     * @return DescribeProducerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProducerListResponse DescribeProducerList(DescribeProducerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducerList", DescribeProducerListResponse.class);
    }

    /**
     *This API is used to query product sales specifications against RocketMQ 5.x clusters.
     * @param req DescribeProductSKUsRequest
     * @return DescribeProductSKUsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductSKUsResponse DescribeProductSKUs(DescribeProductSKUsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductSKUs", DescribeProductSKUsResponse.class);
    }

    /**
     *This API is used to query the list of roles. Filter parameter usage instructions are as follows:.

-Role name supports fuzzy search and can be obtained from the API return value or console.
-AccessKey, support fuzzy search, obtain from API return value or console.

This API is used to demonstrate Filters. 
[{ "Name": "RoleName", "Values": ["test_role"] }]
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *This API is used to query the migration task list smoothly.

This API is used to query the supported fields of the query parameter Filters as follows:.
Task status, supports multiple selections. 
ConnectionType, network connection type, supports multiple selections. See the description of SmoothMigrationTaskItem (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem).
This API is used to search for an instance by instance ID with precise matching. 
This API is used to query task names with fuzzy search support.

This API is used to demonstrate Filters.
[{
    "Name": "InstanceId",
    "Values": ["rmq-1gzecldfg"]
}]
     * @param req DescribeSmoothMigrationTaskListRequest
     * @return DescribeSmoothMigrationTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmoothMigrationTaskListResponse DescribeSmoothMigrationTaskList(DescribeSmoothMigrationTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSmoothMigrationTaskList", DescribeSmoothMigrationTaskListResponse.class);
    }

    /**
     *This API is used to obtain the group list of the source cluster during the smooth migration process.

The Filters field is a query filter that supports the following fields:.
This API is used to query consumer group names with fuzzy search support.
This API is used to check whether the data is Imported.
This api is used to check the import status. See SourceClusterGroupConfig (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) for details.
This API is used to manage namespaces, valid only for 4.x clusters.

This API is used to demonstrate Filters.
[{
    "Name": "GroupName",
    "Values": ["group-a"]
}]
     * @param req DescribeSourceClusterGroupListRequest
     * @return DescribeSourceClusterGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceClusterGroupListResponse DescribeSourceClusterGroupList(DescribeSourceClusterGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceClusterGroupList", DescribeSourceClusterGroupListResponse.class);
    }

    /**
     *This API is used to query topic details. The Offset and Limit parameters are pagination parameters for consumer groups subscribing to this topic. The Filter parameter usage instructions are as follows:.

-The ConsumerGroup name can be obtained from the [ConsumeGroupItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ConsumeGroupItem) in the API response of [DescribeConsumerGroupList](https://www.tencentcloud.comom/document/api/1493/101535?from_cn_redirect=1) or from the console.

This API is used to demonstrate Filters. 
[{ "Name": "ConsumerGroup", "Values": ["test_group"] }]
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopic", DescribeTopicResponse.class);
    }

    /**
     *This API is used to search the topic list. Filter parameter usage instructions are as follows:.

-TopicName supports fuzzy search. Obtain it from the [TopicItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#TopicItem) in the [DescribeTopicList](https://www.tencentcloud.comom/document/api/1493/96030?from_cn_redirect=1) API response or the console.
-Search by TopicType, support multiple selections. See the TopicType field in the [DescribeTopic](https://www.tencentcloud.comom/document/api/1493/97945?from_cn_redirect=1) API.

This API is used to demonstrate Filters.
 [{ "Name": "TopicName", "Values": ["test_topic"] }]
     * @param req DescribeTopicListRequest
     * @return DescribeTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicListResponse DescribeTopicList(DescribeTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicList", DescribeTopicListResponse.class);
    }

    /**
     *This API is used to get topic list by consumer group. Filter parameter usage instructions are as follows:.

-TopicName. It can be obtained from [TopicItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#TopicItem) returned by the API [DescribeTopicList](https://www.tencentcloud.comom/document/api/1493/96030?from_cn_redirect=1) or from the console.

This API is used to demonstrate Filters. 
[{ "Name": "TopicName", "Values": ["test_topic"] }]
     * @param req DescribeTopicListByGroupRequest
     * @return DescribeTopicListByGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicListByGroupResponse DescribeTopicListByGroup(DescribeTopicListByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicListByGroup", DescribeTopicListByGroupResponse.class);
    }

    /**
     *This API is used to check whether the topics being migrated are in normal status. Only topics in normal status can enter the next migration stage.
     * @param req DoHealthCheckOnMigratingTopicRequest
     * @return DoHealthCheckOnMigratingTopicResponse
     * @throws TencentCloudSDKException
     */
    public DoHealthCheckOnMigratingTopicResponse DoHealthCheckOnMigratingTopic(DoHealthCheckOnMigratingTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DoHealthCheckOnMigratingTopic", DoHealthCheckOnMigratingTopicResponse.class);
    }

    /**
     *Modify consumer group attributes.
     * @param req ModifyConsumerGroupRequest
     * @return ModifyConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupResponse ModifyConsumerGroup(ModifyConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroup", ModifyConsumerGroupResponse.class);
    }

    /**
     *This API is used to modify attributes of a TDMQ RocketMQ 5.x cluster. Only running clusters support this operation.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *This API is used to modify access points of a TDMQ RocketMQ 5.x cluster. Make sure that the access points exist before the operation.
     * @param req ModifyInstanceEndpointRequest
     * @return ModifyInstanceEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEndpointResponse ModifyInstanceEndpoint(ModifyInstanceEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceEndpoint", ModifyInstanceEndpointResponse.class);
    }

    /**
     *This API is used to modify a role.
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRole", ModifyRoleResponse.class);
    }

    /**
     *Modify topic attributes.
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

    /**
     *This API is used to remove a topic from the migration list. It is valid only when the topic is in the initial state.
     * @param req RemoveMigratingTopicRequest
     * @return RemoveMigratingTopicResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMigratingTopicResponse RemoveMigratingTopic(RemoveMigratingTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveMigratingTopic", RemoveMigratingTopicResponse.class);
    }

    /**
     *This API is used to resend dead letter messages.
     * @param req ResendDeadLetterMessageRequest
     * @return ResendDeadLetterMessageResponse
     * @throws TencentCloudSDKException
     */
    public ResendDeadLetterMessageResponse ResendDeadLetterMessage(ResendDeadLetterMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResendDeadLetterMessage", ResendDeadLetterMessageResponse.class);
    }

    /**
     *Reset the consumption position.
     * @param req ResetConsumerGroupOffsetRequest
     * @return ResetConsumerGroupOffsetResponse
     * @throws TencentCloudSDKException
     */
    public ResetConsumerGroupOffsetResponse ResetConsumerGroupOffset(ResetConsumerGroupOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConsumerGroupOffset", ResetConsumerGroupOffsetResponse.class);
    }

    /**
     *This API is used to roll back the topic that is undergoing migration to the previous stage.
     * @param req RollbackMigratingTopicStageRequest
     * @return RollbackMigratingTopicStageResponse
     * @throws TencentCloudSDKException
     */
    public RollbackMigratingTopicStageResponse RollbackMigratingTopicStage(RollbackMigratingTopicStageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackMigratingTopicStage", RollbackMigratingTopicStageResponse.class);
    }

}
