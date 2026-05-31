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
package com.tencentcloudapi.tdmq.v20200217;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdmq.v20200217.models.*;

public class TdmqClient extends AbstractClient{
    private static String endpoint = "tdmq.intl.tencentcloudapi.com";
    private static String service = "tdmq";
    private static String version = "2020-02-17";

    public TdmqClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdmqClient(Credential credential, String region, ClientProfile profile) {
        super(TdmqClient.endpoint, TdmqClient.version, credential, region, profile);
    }

    /**
     *This API is used to acknowledge the message in the specified topic by the provided `MessageID`.
     * @param req AcknowledgeMessageRequest
     * @return AcknowledgeMessageResponse
     * @throws TencentCloudSDKException
     */
    public AcknowledgeMessageResponse AcknowledgeMessage(AcknowledgeMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcknowledgeMessage", AcknowledgeMessageResponse.class);
    }

    /**
     *This API is used to clear the messages in the CMQ message queue.
     * @param req ClearCmqQueueRequest
     * @return ClearCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqQueueResponse ClearCmqQueue(ClearCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearCmqQueue", ClearCmqQueueResponse.class);
    }

    /**
     *This API is used to clear the message tags of a subscriber.
     * @param req ClearCmqSubscriptionFilterTagsRequest
     * @return ClearCmqSubscriptionFilterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqSubscriptionFilterTagsResponse ClearCmqSubscriptionFilterTags(ClearCmqSubscriptionFilterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearCmqSubscriptionFilterTags", ClearCmqSubscriptionFilterTagsResponse.class);
    }

    /**
     *This API is used to create a CMQ queue.
     * @param req CreateCmqQueueRequest
     * @return CreateCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqQueueResponse CreateCmqQueue(CreateCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCmqQueue", CreateCmqQueueResponse.class);
    }

    /**
     *This API is used to create a CMQ subscription.
     * @param req CreateCmqSubscribeRequest
     * @return CreateCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqSubscribeResponse CreateCmqSubscribe(CreateCmqSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCmqSubscribe", CreateCmqSubscribeResponse.class);
    }

    /**
     *This API is used to create a CMQ topic.
     * @param req CreateCmqTopicRequest
     * @return CreateCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqTopicResponse CreateCmqTopic(CreateCmqTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCmqTopic", CreateCmqTopicResponse.class);
    }

    /**
     *This API is used to create a TDMQ namespace.
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironment", CreateEnvironmentResponse.class);
    }

    /**
     *This API is used to create an environment role.
     * @param req CreateEnvironmentRoleRequest
     * @return CreateEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentRoleResponse CreateEnvironmentRole(CreateEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironmentRole", CreateEnvironmentRoleResponse.class);
    }

    /**
     *This api is used to create a professional cluster with prepayment via api calls.
     * @param req CreateProClusterRequest
     * @return CreateProClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateProClusterResponse CreateProCluster(CreateProClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProCluster", CreateProClusterResponse.class);
    }

    /**
     *This API is used to create a TDMQ for RabbitMQ routing relationship.
     * @param req CreateRabbitMQBindingRequest
     * @return CreateRabbitMQBindingResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQBindingResponse CreateRabbitMQBinding(CreateRabbitMQBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQBinding", CreateRabbitMQBindingResponse.class);
    }

    /**
     *This API is used to create a TDMQ for RabbitMQ user.
     * @param req CreateRabbitMQUserRequest
     * @return CreateRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQUserResponse CreateRabbitMQUser(CreateRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQUser", CreateRabbitMQUserResponse.class);
    }

    /**
     *This API is used to create a RabbitMQ managed instance.
     * @param req CreateRabbitMQVipInstanceRequest
     * @return CreateRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQVipInstanceResponse CreateRabbitMQVipInstance(CreateRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQVipInstance", CreateRabbitMQVipInstanceResponse.class);
    }

    /**
     *This API is used to create a TDMQ for RabbitMQ vhost.
     * @param req CreateRabbitMQVirtualHostRequest
     * @return CreateRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQVirtualHostResponse CreateRabbitMQVirtualHost(CreateRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQVirtualHost", CreateRabbitMQVirtualHostResponse.class);
    }

    /**
     *Create a RocketMQ cluster.
This API is applicable to clusters: 4.x virtual cluster. For 4.x dedicated or generic clusters, refer to the API documentation [CreateRocketMQVipInstance](https://www.tencentcloud.com/document/api/1179/95721?from_cn_redirect=1). For 5.x clusters, refer to the API documentation [CreateInstance](https://www.tencentcloud.com/document/api/1493/97868?from_cn_redirect=1).
     * @param req CreateRocketMQClusterRequest
     * @return CreateRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQClusterResponse CreateRocketMQCluster(CreateRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQCluster", CreateRocketMQClusterResponse.class);
    }

    /**
     *Grant access by role.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [CreateRole](https://www.tencentcloud.com/document/api/1493/98864?from_cn_redirect=1).
     * @param req CreateRocketMQEnvironmentRoleRequest
     * @return CreateRocketMQEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQEnvironmentRoleResponse CreateRocketMQEnvironmentRole(CreateRocketMQEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQEnvironmentRole", CreateRocketMQEnvironmentRoleResponse.class);
    }

    /**
     *This API is used to create a RocketMQ consumption group.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [CreateConsumerGroup](https://www.tencentcloud.com/document/api/1493/97943?from_cn_redirect=1) to create a consumer group.
     * @param req CreateRocketMQGroupRequest
     * @return CreateRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQGroupResponse CreateRocketMQGroup(CreateRocketMQGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQGroup", CreateRocketMQGroupResponse.class);
    }

    /**
     *This API is used to create a RocketMQ consumption group.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [CreateConsumerGroup](https://www.tencentcloud.com/document/api/1493/97943?from_cn_redirect=1) to create a consumer group.
     * @param req CreateRocketMQGroupV2Request
     * @return CreateRocketMQGroupV2Response
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQGroupV2Response CreateRocketMQGroupV2(CreateRocketMQGroupV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQGroupV2", CreateRocketMQGroupV2Response.class);
    }

    /**
     *Create a RocketMQ metadata migration task to batch create topics and consumer group data.
     * @param req CreateRocketMQMigrationTaskRequest
     * @return CreateRocketMQMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQMigrationTaskResponse CreateRocketMQMigrationTask(CreateRocketMQMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQMigrationTask", CreateRocketMQMigrationTaskResponse.class);
    }

    /**
     *This API is used to create a RocketMQ namespace.
This API is applicable to clusters: 4.x virtual cluster and 4.x dedicated cluster. Other cluster types do not support this feature.
     * @param req CreateRocketMQNamespaceRequest
     * @return CreateRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQNamespaceResponse CreateRocketMQNamespace(CreateRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQNamespace", CreateRocketMQNamespaceResponse.class);
    }

    /**
     *Create a role.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [CreateRole](https://www.tencentcloud.com/document/api/1493/98864?from_cn_redirect=1).
     * @param req CreateRocketMQRoleRequest
     * @return CreateRocketMQRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQRoleResponse CreateRocketMQRole(CreateRocketMQRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQRole", CreateRocketMQRoleResponse.class);
    }

    /**
     *Create RocketMQ topics in batches.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [CreateTopic](https://www.tencentcloud.com/document/api/1493/97947?from_cn_redirect=1).
     * @param req CreateRocketMQTopicRequest
     * @return CreateRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQTopicResponse CreateRocketMQTopic(CreateRocketMQTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQTopic", CreateRocketMQTopicResponse.class);
    }

    /**
     *This API is used to create a RocketMQ topic.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [CreateTopic](https://www.tencentcloud.com/document/api/1493/97947?from_cn_redirect=1).
     * @param req CreateRocketMQTopicV2Request
     * @return CreateRocketMQTopicV2Response
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQTopicV2Response CreateRocketMQTopicV2(CreateRocketMQTopicV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQTopicV2", CreateRocketMQTopicV2Response.class);
    }

    /**
     *This API is used to create a RocketMQ 4.x cluster.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For 5.x clusters, refer to the API documentation [CreateInstance](https://www.tencentcloud.com/document/api/1493/97868?from_cn_redirect=1).
     * @param req CreateRocketMQVipInstanceRequest
     * @return CreateRocketMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQVipInstanceResponse CreateRocketMQVipInstance(CreateRocketMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQVipInstance", CreateRocketMQVipInstanceResponse.class);
    }

    /**
     *This API is used to create a role.
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *This API is used to create a subscription to a topic.
     * @param req CreateSubscriptionRequest
     * @return CreateSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscriptionResponse CreateSubscription(CreateSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscription", CreateSubscriptionResponse.class);
    }

    /**
     *This API is used to add a message topic in the specified partition and type.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *This API is used to delete a cluster.
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *This API is used to delete a CMQ queue.
     * @param req DeleteCmqQueueRequest
     * @return DeleteCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqQueueResponse DeleteCmqQueue(DeleteCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCmqQueue", DeleteCmqQueueResponse.class);
    }

    /**
     *This API is used to delete a CMQ subscription.
     * @param req DeleteCmqSubscribeRequest
     * @return DeleteCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqSubscribeResponse DeleteCmqSubscribe(DeleteCmqSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCmqSubscribe", DeleteCmqSubscribeResponse.class);
    }

    /**
     *This API is used to delete a CMQ topic.
     * @param req DeleteCmqTopicRequest
     * @return DeleteCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqTopicResponse DeleteCmqTopic(DeleteCmqTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCmqTopic", DeleteCmqTopicResponse.class);
    }

    /**
     *This API is used to delete an environment role.
     * @param req DeleteEnvironmentRolesRequest
     * @return DeleteEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentRolesResponse DeleteEnvironmentRoles(DeleteEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnvironmentRoles", DeleteEnvironmentRolesResponse.class);
    }

    /**
     *This API is used to batch delete namespaces under a tenant.
     * @param req DeleteEnvironmentsRequest
     * @return DeleteEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentsResponse DeleteEnvironments(DeleteEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnvironments", DeleteEnvironmentsResponse.class);
    }

    /**
     *This API is used to delete a professional cluster with prepayment via API calls.
     * @param req DeleteProClusterRequest
     * @return DeleteProClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProClusterResponse DeleteProCluster(DeleteProClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProCluster", DeleteProClusterResponse.class);
    }

    /**
     *This API is used to unbind RabbitMQ routing relationships.
     * @param req DeleteRabbitMQBindingRequest
     * @return DeleteRabbitMQBindingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQBindingResponse DeleteRabbitMQBinding(DeleteRabbitMQBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQBinding", DeleteRabbitMQBindingResponse.class);
    }

    /**
     *This API is used to delete RabbitMQ permissions.
     * @param req DeleteRabbitMQPermissionRequest
     * @return DeleteRabbitMQPermissionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQPermissionResponse DeleteRabbitMQPermission(DeleteRabbitMQPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQPermission", DeleteRabbitMQPermissionResponse.class);
    }

    /**
     *This API is used to delete a TDMQ for RabbitMQ user.
     * @param req DeleteRabbitMQUserRequest
     * @return DeleteRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQUserResponse DeleteRabbitMQUser(DeleteRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQUser", DeleteRabbitMQUserResponse.class);
    }

    /**
     *This API is used to delete a RabbitMQ managed instance.
     * @param req DeleteRabbitMQVipInstanceRequest
     * @return DeleteRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQVipInstanceResponse DeleteRabbitMQVipInstance(DeleteRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQVipInstance", DeleteRabbitMQVipInstanceResponse.class);
    }

    /**
     *This API is used to delete a TDMQ for RabbitMQ vhost.
     * @param req DeleteRabbitMQVirtualHostRequest
     * @return DeleteRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQVirtualHostResponse DeleteRabbitMQVirtualHost(DeleteRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQVirtualHost", DeleteRabbitMQVirtualHostResponse.class);
    }

    /**
     *This API is used to delete a RocketMQ cluster.
This API is applicable to clusters: 4.x virtual cluster. For 4.x dedicated or generic clusters, refer to the API documentation [DeleteRocketMQVipInstance](https://www.tencentcloud.com/document/api/1179/95802?from_cn_redirect=1). For 5.x clusters, refer to [DeleteInstance](https://www.tencentcloud.com/document/product/1493/97867?from_cn_redirect=1).
     * @param req DeleteRocketMQClusterRequest
     * @return DeleteRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQClusterResponse DeleteRocketMQCluster(DeleteRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQCluster", DeleteRocketMQClusterResponse.class);
    }

    /**
     *Delete role authorizations in batches.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DeleteRole](https://www.tencentcloud.com/document/api/1493/98863?from_cn_redirect=1).
     * @param req DeleteRocketMQEnvironmentRolesRequest
     * @return DeleteRocketMQEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQEnvironmentRolesResponse DeleteRocketMQEnvironmentRoles(DeleteRocketMQEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQEnvironmentRoles", DeleteRocketMQEnvironmentRolesResponse.class);
    }

    /**
     *This API is used to delete a RocketMQ consumption group.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DeleteConsumerGroup](https://www.tencentcloud.com/document/api/1493/97942?from_cn_redirect=1) to delete the consumer group.
     * @param req DeleteRocketMQGroupRequest
     * @return DeleteRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQGroupResponse DeleteRocketMQGroup(DeleteRocketMQGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQGroup", DeleteRocketMQGroupResponse.class);
    }

    /**
     *This API is used to delete a RocketMQ namespace.
This API is applicable to clusters: 4.x virtual cluster and 4.x dedicated cluster. Other cluster types do not support this feature.
     * @param req DeleteRocketMQNamespaceRequest
     * @return DeleteRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQNamespaceResponse DeleteRocketMQNamespace(DeleteRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQNamespace", DeleteRocketMQNamespaceResponse.class);
    }

    /**
     *Delete roles in batches.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DeleteRole](https://www.tencentcloud.com/document/api/1493/98863?from_cn_redirect=1).
     * @param req DeleteRocketMQRolesRequest
     * @return DeleteRocketMQRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQRolesResponse DeleteRocketMQRoles(DeleteRocketMQRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQRoles", DeleteRocketMQRolesResponse.class);
    }

    /**
     *Delete a RocketMQ topic.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DeleteTopic](https://www.tencentcloud.com/document/api/1493/97946?from_cn_redirect=1).
     * @param req DeleteRocketMQTopicRequest
     * @return DeleteRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQTopicResponse DeleteRocketMQTopic(DeleteRocketMQTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQTopic", DeleteRocketMQTopicResponse.class);
    }

    /**
     *This API is used to delete a RocketMQ dedicated or generic cluster.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DeleteInstance](https://www.tencentcloud.com/document/api/1493/97867?from_cn_redirect=1).
     * @param req DeleteRocketMQVipInstanceRequest
     * @return DeleteRocketMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQVipInstanceResponse DeleteRocketMQVipInstance(DeleteRocketMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQVipInstance", DeleteRocketMQVipInstanceResponse.class);
    }

    /**
     *This API is used to delete one or multiple roles.
     * @param req DeleteRolesRequest
     * @return DeleteRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRolesResponse DeleteRoles(DeleteRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoles", DeleteRolesResponse.class);
    }

    /**
     *This API is used to delete a subscription.
     * @param req DeleteSubscriptionsRequest
     * @return DeleteSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubscriptionsResponse DeleteSubscriptions(DeleteSubscriptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSubscriptions", DeleteSubscriptionsResponse.class);
    }

    /**
     *This API is used to batch delete topics.
     * @param req DeleteTopicsRequest
     * @return DeleteTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicsResponse DeleteTopics(DeleteTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopics", DeleteTopicsResponse.class);
    }

    /**
     *This API is used to get the list of dedicated clusters bound to a user.
     * @param req DescribeBindClustersRequest
     * @return DescribeBindClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindClustersResponse DescribeBindClusters(DescribeBindClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindClusters", DescribeBindClustersResponse.class);
    }

    /**
     *This API is used to get the tenant-VPC binding relationship.
     * @param req DescribeBindVpcsRequest
     * @return DescribeBindVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindVpcsResponse DescribeBindVpcs(DescribeBindVpcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindVpcs", DescribeBindVpcsResponse.class);
    }

    /**
     *This API is used to get the details of a cluster.
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
    }

    /**
     *This API is used to get the list of clusters.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *This API is used to query the details of a CMQ queue.
     * @param req DescribeCmqQueueDetailRequest
     * @return DescribeCmqQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueueDetailResponse DescribeCmqQueueDetail(DescribeCmqQueueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqQueueDetail", DescribeCmqQueueDetailResponse.class);
    }

    /**
     *This API is used to query all CMQ queues.
     * @param req DescribeCmqQueuesRequest
     * @return DescribeCmqQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueuesResponse DescribeCmqQueues(DescribeCmqQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqQueues", DescribeCmqQueuesResponse.class);
    }

    /**
     *This API is used to query the CMQ subscription details.
     * @param req DescribeCmqSubscriptionDetailRequest
     * @return DescribeCmqSubscriptionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqSubscriptionDetailResponse DescribeCmqSubscriptionDetail(DescribeCmqSubscriptionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqSubscriptionDetail", DescribeCmqSubscriptionDetailResponse.class);
    }

    /**
     *This API is used to query the details of a CMQ topic.
     * @param req DescribeCmqTopicDetailRequest
     * @return DescribeCmqTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicDetailResponse DescribeCmqTopicDetail(DescribeCmqTopicDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqTopicDetail", DescribeCmqTopicDetailResponse.class);
    }

    /**
     *This API is used to enumerate all CMQ topics.
     * @param req DescribeCmqTopicsRequest
     * @return DescribeCmqTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicsResponse DescribeCmqTopics(DescribeCmqTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqTopics", DescribeCmqTopicsResponse.class);
    }

    /**
     *This API is used to get the attributes of the specified namespace.
     * @param req DescribeEnvironmentAttributesRequest
     * @return DescribeEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentAttributesResponse DescribeEnvironmentAttributes(DescribeEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironmentAttributes", DescribeEnvironmentAttributesResponse.class);
    }

    /**
     *This API is used to get the list of namespace roles.
     * @param req DescribeEnvironmentRolesRequest
     * @return DescribeEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentRolesResponse DescribeEnvironmentRoles(DescribeEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironmentRoles", DescribeEnvironmentRolesResponse.class);
    }

    /**
     *This API is used to get the list of namespaces under a tenant.
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *Queries message trajectory
     * @param req DescribeMqMsgTraceRequest
     * @return DescribeMqMsgTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMqMsgTraceResponse DescribeMqMsgTrace(DescribeMqMsgTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMqMsgTrace", DescribeMqMsgTraceResponse.class);
    }

    /**
     *This API is used to get message details.
     * @param req DescribeMsgRequest
     * @return DescribeMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgResponse DescribeMsg(DescribeMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsg", DescribeMsgResponse.class);
    }

    /**
     *Query the message trace of a single message
     * @param req DescribeMsgTraceRequest
     * @return DescribeMsgTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgTraceResponse DescribeMsgTrace(DescribeMsgTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsgTrace", DescribeMsgTraceResponse.class);
    }

    /**
     *This API is used to obtain message production overview information.
     * @param req DescribePublisherSummaryRequest
     * @return DescribePublisherSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublisherSummaryResponse DescribePublisherSummary(DescribePublisherSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublisherSummary", DescribePublisherSummaryResponse.class);
    }

    /**
     *This API is used to obtain the list of producer information.
     * @param req DescribePublishersRequest
     * @return DescribePublishersResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublishersResponse DescribePublishers(DescribePublishersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublishers", DescribePublishersResponse.class);
    }

    /**
     *This API is used to obtain the information of a TDMQ for Pulsar pro cluster instance.
     * @param req DescribePulsarProInstanceDetailRequest
     * @return DescribePulsarProInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePulsarProInstanceDetailResponse DescribePulsarProInstanceDetail(DescribePulsarProInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePulsarProInstanceDetail", DescribePulsarProInstanceDetailResponse.class);
    }

    /**
     *This API is used to query the list of the purchased TDMQ for Pulsar pro instances.
     * @param req DescribePulsarProInstancesRequest
     * @return DescribePulsarProInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePulsarProInstancesResponse DescribePulsarProInstances(DescribePulsarProInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePulsarProInstances", DescribePulsarProInstancesResponse.class);
    }

    /**
     *This API is used to query the list of RabbitMQ route relations.
     * @param req DescribeRabbitMQBindingsRequest
     * @return DescribeRabbitMQBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQBindingsResponse DescribeRabbitMQBindings(DescribeRabbitMQBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQBindings", DescribeRabbitMQBindingsResponse.class);
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ exchanges.
     * @param req DescribeRabbitMQExchangesRequest
     * @return DescribeRabbitMQExchangesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQExchangesResponse DescribeRabbitMQExchanges(DescribeRabbitMQExchangesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQExchanges", DescribeRabbitMQExchangesResponse.class);
    }

    /**
     *This API is used to query the RabbitMQ managed node list.
     * @param req DescribeRabbitMQNodeListRequest
     * @return DescribeRabbitMQNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQNodeListResponse DescribeRabbitMQNodeList(DescribeRabbitMQNodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQNodeList", DescribeRabbitMQNodeListResponse.class);
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ permissions.
     * @param req DescribeRabbitMQPermissionRequest
     * @return DescribeRabbitMQPermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQPermissionResponse DescribeRabbitMQPermission(DescribeRabbitMQPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQPermission", DescribeRabbitMQPermissionResponse.class);
    }

    /**
     *This API is used to query the details of RabbitMQ queues.
     * @param req DescribeRabbitMQQueueDetailRequest
     * @return DescribeRabbitMQQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQQueueDetailResponse DescribeRabbitMQQueueDetail(DescribeRabbitMQQueueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQQueueDetail", DescribeRabbitMQQueueDetailResponse.class);
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ queues.
     * @param req DescribeRabbitMQQueuesRequest
     * @return DescribeRabbitMQQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQQueuesResponse DescribeRabbitMQQueues(DescribeRabbitMQQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQQueues", DescribeRabbitMQQueuesResponse.class);
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ users.
     * @param req DescribeRabbitMQUserRequest
     * @return DescribeRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQUserResponse DescribeRabbitMQUser(DescribeRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQUser", DescribeRabbitMQUserResponse.class);
    }

    /**
     *This API is used to obtain information about one RabbitMQ managed instance.
     * @param req DescribeRabbitMQVipInstanceRequest
     * @return DescribeRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVipInstanceResponse DescribeRabbitMQVipInstance(DescribeRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQVipInstance", DescribeRabbitMQVipInstanceResponse.class);
    }

    /**
     *This API is used to query the RabbitMQ managed instance list of user purchases.
     * @param req DescribeRabbitMQVipInstancesRequest
     * @return DescribeRabbitMQVipInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVipInstancesResponse DescribeRabbitMQVipInstances(DescribeRabbitMQVipInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQVipInstances", DescribeRabbitMQVipInstancesResponse.class);
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ vhosts.
     * @param req DescribeRabbitMQVirtualHostRequest
     * @return DescribeRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVirtualHostResponse DescribeRabbitMQVirtualHost(DescribeRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQVirtualHost", DescribeRabbitMQVirtualHostResponse.class);
    }

    /**
     *Query RocketMQ virtual cluster information.
Current API applicable clusters: 4.x virtual cluster. For 4.x dedicated or generic clusters, see the REST API documentation for querying cluster information at [DescribeRocketMQVipInstanceDetail](https://www.tencentcloud.com/document/api/1179/86725?from_cn_redirect=1). For 5.x clusters, see the REST API documentation for querying cluster information at [DescribeInstance](https://www.tencentcloud.com/document/api/1493/97866?from_cn_redirect=1).
     * @param req DescribeRocketMQClusterRequest
     * @return DescribeRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClusterResponse DescribeRocketMQCluster(DescribeRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQCluster", DescribeRocketMQClusterResponse.class);
    }

    /**
     *Query the RocketMQ virtual cluster list.
This API is applicable to clusters: 4.x virtual cluster. For querying 5.x cluster list, see List API Documentation [DescribeInstanceList](https://www.tencentcloud.com/document/api/1493/96028?from_cn_redirect=1), or use [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) applicable to all cluster types.
     * @param req DescribeRocketMQClustersRequest
     * @return DescribeRocketMQClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClustersResponse DescribeRocketMQClusters(DescribeRocketMQClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQClusters", DescribeRocketMQClustersResponse.class);
    }

    /**
     *Query a role-based license list.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the List API Documentation [DescribeRoleList](https://www.tencentcloud.com/document/api/1493/98862?from_cn_redirect=1).
     * @param req DescribeRocketMQEnvironmentRolesRequest
     * @return DescribeRocketMQEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQEnvironmentRolesResponse DescribeRocketMQEnvironmentRoles(DescribeRocketMQEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQEnvironmentRoles", DescribeRocketMQEnvironmentRolesResponse.class);
    }

    /**
     *Query the sales specification of a generic cluster.
This API is applicable to clusters: 4.x generic cluster. For 5.x clusters, refer to the API documentation [DescribeProductSKUs](https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).
     * @param req DescribeRocketMQGeneralSKUsRequest
     * @return DescribeRocketMQGeneralSKUsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQGeneralSKUsResponse DescribeRocketMQGeneralSKUs(DescribeRocketMQGeneralSKUsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQGeneralSKUs", DescribeRocketMQGeneralSKUsResponse.class);
    }

    /**
     *Query the RocketMQ consumer group list.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DescribeConsumerGroupList](https://www.tencentcloud.com/document/api/1493/101535?from_cn_redirect=1) to query the consumption group list.
     * @param req DescribeRocketMQGroupsRequest
     * @return DescribeRocketMQGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQGroupsResponse DescribeRocketMQGroups(DescribeRocketMQGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQGroups", DescribeRocketMQGroupsResponse.class);
    }

    /**
     *Query RocketMQ message details.
Current API applicable clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, see the REST API documentation for query message details at [DescribeMessage](https://www.tencentcloud.com/document/api/1493/114594?from_cn_redirect=1).
     * @param req DescribeRocketMQMsgRequest
     * @return DescribeRocketMQMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQMsgResponse DescribeRocketMQMsg(DescribeRocketMQMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQMsg", DescribeRocketMQMsgResponse.class);
    }

    /**
     *Query message trajectory.
Current API applicable clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, see the REST API documentation for query message trajectory at [DescribeMessageTrace](https://www.tencentcloud.com/document/api/1493/114302?from_cn_redirect=1).
     * @param req DescribeRocketMQMsgTraceRequest
     * @return DescribeRocketMQMsgTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQMsgTraceResponse DescribeRocketMQMsgTrace(DescribeRocketMQMsgTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQMsgTrace", DescribeRocketMQMsgTraceResponse.class);
    }

    /**
     *Query the RocketMQ namespace list.
This API is applicable to clusters: 4.x virtual cluster and 4.x dedicated cluster. Other cluster types do not support this feature.
     * @param req DescribeRocketMQNamespacesRequest
     * @return DescribeRocketMQNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQNamespacesResponse DescribeRocketMQNamespaces(DescribeRocketMQNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQNamespaces", DescribeRocketMQNamespacesResponse.class);
    }

    /**
     *This API is used to query the producer client list under a specified topic in RocketMQ.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For 5.x clusters, refer to the List API Documentation [DescribeProducerList](https://www.tencentcloud.com/document/api/1493/122548?from_cn_redirect=1) for producer clients.
     * @param req DescribeRocketMQProducersRequest
     * @return DescribeRocketMQProducersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQProducersResponse DescribeRocketMQProducers(DescribeRocketMQProducersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQProducers", DescribeRocketMQProducersResponse.class);
    }

    /**
     *Query public network metric monitoring data. Currently only support inbound bandwidth and outbound bandwidth metrics for Client to LB.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. 5.x clusters are not supported yet.
     * @param req DescribeRocketMQPublicAccessMonitorDataRequest
     * @return DescribeRocketMQPublicAccessMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQPublicAccessMonitorDataResponse DescribeRocketMQPublicAccessMonitorData(DescribeRocketMQPublicAccessMonitorDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQPublicAccessMonitorData", DescribeRocketMQPublicAccessMonitorDataResponse.class);
    }

    /**
     *Query the public network access point information of a RocketMQ cluster.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For public network access point information of 5.x clusters, refer to the API Documentation [DescribeInstance](https://www.tencentcloud.com/document/api/1493/97866?from_cn_redirect=1).
     * @param req DescribeRocketMQPublicAccessPointRequest
     * @return DescribeRocketMQPublicAccessPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQPublicAccessPointResponse DescribeRocketMQPublicAccessPoint(DescribeRocketMQPublicAccessPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQPublicAccessPoint", DescribeRocketMQPublicAccessPointResponse.class);
    }

    /**
     *This API is used to query the list of roles.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the List API Documentation [DescribeRoleList](https://www.tencentcloud.com/document/api/1493/98862?from_cn_redirect=1).
     * @param req DescribeRocketMQRolesRequest
     * @return DescribeRocketMQRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQRolesResponse DescribeRocketMQRoles(DescribeRocketMQRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQRoles", DescribeRocketMQRolesResponse.class);
    }

    /**
     *Used to obtain the RocketMQ metric sorting list, such as sorting topics under a cluster instance by the most occupied storage space.
This API is used for applicable clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. The feature is not supported yet for 5.x clusters.
     * @param req DescribeRocketMQTopUsagesRequest
     * @return DescribeRocketMQTopUsagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopUsagesResponse DescribeRocketMQTopUsages(DescribeRocketMQTopUsagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopUsages", DescribeRocketMQTopUsagesResponse.class);
    }

    /**
     *This API is used to obtain RocketMQ topic details.
     * @param req DescribeRocketMQTopicRequest
     * @return DescribeRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicResponse DescribeRocketMQTopic(DescribeRocketMQTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopic", DescribeRocketMQTopicResponse.class);
    }

    /**
     *Query the RocketMQ message list.
Current API applicable clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, see the List API Documentation for query messages at [DescribeMessageList](https://www.tencentcloud.com/document/api/1493/114593?from_cn_redirect=1).
     * @param req DescribeRocketMQTopicMsgsRequest
     * @return DescribeRocketMQTopicMsgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicMsgsResponse DescribeRocketMQTopicMsgs(DescribeRocketMQTopicMsgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopicMsgs", DescribeRocketMQTopicMsgsResponse.class);
    }

    /**
     *Query the production detail list of RocketMQ topics.
This API is used for applicable clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. The feature is not supported yet for 5.x clusters.
     * @param req DescribeRocketMQTopicStatsRequest
     * @return DescribeRocketMQTopicStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicStatsResponse DescribeRocketMQTopicStats(DescribeRocketMQTopicStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopicStats", DescribeRocketMQTopicStatsResponse.class);
    }

    /**
     *Query the RocketMQ topic list.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DescribeTopicList](https://www.tencentcloud.com/document/api/1493/96030?from_cn_redirect=1).
     * @param req DescribeRocketMQTopicsRequest
     * @return DescribeRocketMQTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicsResponse DescribeRocketMQTopics(DescribeRocketMQTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopics", DescribeRocketMQTopicsResponse.class);
    }

    /**
     *This API is used to query the list of subscribed topics for a RocketMQ consumption group.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DescribeTopicListByGroup](https://www.tencentcloud.com/document/api/1493/115314?from_cn_redirect=1) to query the list of subscribed topics for a consumption group.
     * @param req DescribeRocketMQTopicsByGroupRequest
     * @return DescribeRocketMQTopicsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicsByGroupResponse DescribeRocketMQTopicsByGroup(DescribeRocketMQTopicsByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopicsByGroup", DescribeRocketMQTopicsByGroupResponse.class);
    }

    /**
     *Query RocketMQ cluster info.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DescribeInstance](https://www.tencentcloud.com/document/api/1493/97866?from_cn_redirect=1).
     * @param req DescribeRocketMQVipInstanceDetailRequest
     * @return DescribeRocketMQVipInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQVipInstanceDetailResponse DescribeRocketMQVipInstanceDetail(DescribeRocketMQVipInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQVipInstanceDetail", DescribeRocketMQVipInstanceDetailResponse.class);
    }

    /**
     *Query the RocketMQ 4.x cluster list.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For 5.x clusters, refer to the API documentation [DescribeInstanceList](https://www.tencentcloud.com/document/api/1493/96028?from_cn_redirect=1), or use the [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) API applicable to all cluster types.
     * @param req DescribeRocketMQVipInstancesRequest
     * @return DescribeRocketMQVipInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQVipInstancesResponse DescribeRocketMQVipInstances(DescribeRocketMQVipInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQVipInstances", DescribeRocketMQVipInstancesResponse.class);
    }

    /**
     *This API is used to get the list of roles.
     * @param req DescribeRolesRequest
     * @return DescribeRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRolesResponse DescribeRoles(DescribeRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoles", DescribeRolesResponse.class);
    }

    /**
     *This API is used to query the list of subscribers under the specified environment and topic.
     * @param req DescribeSubscriptionsRequest
     * @return DescribeSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscriptionsResponse DescribeSubscriptions(DescribeSubscriptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscriptions", DescribeSubscriptionsResponse.class);
    }

    /**
     *This API is used to query messages.
     * @param req DescribeTopicMsgsRequest
     * @return DescribeTopicMsgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicMsgsResponse DescribeTopicMsgs(DescribeTopicMsgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicMsgs", DescribeTopicMsgsResponse.class);
    }

    /**
     *This API is used to get the list of topics under an environment.
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopics", DescribeTopicsResponse.class);
    }

    /**
     *Export the RocketMQ message details.
     * @param req ExportRocketMQMessageDetailRequest
     * @return ExportRocketMQMessageDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportRocketMQMessageDetailResponse ExportRocketMQMessageDetail(ExportRocketMQMessageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRocketMQMessageDetail", ExportRocketMQMessageDetailResponse.class);
    }

    /**
     *This API is used to update a cluster.
     * @param req ModifyClusterRequest
     * @return ModifyClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterResponse ModifyCluster(ModifyClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCluster", ModifyClusterResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CMQ queue.
     * @param req ModifyCmqQueueAttributeRequest
     * @return ModifyCmqQueueAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqQueueAttributeResponse ModifyCmqQueueAttribute(ModifyCmqQueueAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCmqQueueAttribute", ModifyCmqQueueAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CMQ subscription.
     * @param req ModifyCmqSubscriptionAttributeRequest
     * @return ModifyCmqSubscriptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqSubscriptionAttributeResponse ModifyCmqSubscriptionAttribute(ModifyCmqSubscriptionAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCmqSubscriptionAttribute", ModifyCmqSubscriptionAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CMQ topic.
     * @param req ModifyCmqTopicAttributeRequest
     * @return ModifyCmqTopicAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqTopicAttributeResponse ModifyCmqTopicAttribute(ModifyCmqTopicAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCmqTopicAttribute", ModifyCmqTopicAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of the specified namespace.
     * @param req ModifyEnvironmentAttributesRequest
     * @return ModifyEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentAttributesResponse ModifyEnvironmentAttributes(ModifyEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnvironmentAttributes", ModifyEnvironmentAttributesResponse.class);
    }

    /**
     *This API is used to modify an environment role.
     * @param req ModifyEnvironmentRoleRequest
     * @return ModifyEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentRoleResponse ModifyEnvironmentRole(ModifyEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnvironmentRole", ModifyEnvironmentRoleResponse.class);
    }

    /**
     *This API is used to modify the public network security policy for pulsar Pro Edition.
     * @param req ModifyPublicNetworkSecurityPolicyRequest
     * @return ModifyPublicNetworkSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublicNetworkSecurityPolicyResponse ModifyPublicNetworkSecurityPolicy(ModifyPublicNetworkSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPublicNetworkSecurityPolicy", ModifyPublicNetworkSecurityPolicyResponse.class);
    }

    /**
     *This API is used to modify RabbitMQ permissions.
     * @param req ModifyRabbitMQPermissionRequest
     * @return ModifyRabbitMQPermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQPermissionResponse ModifyRabbitMQPermission(ModifyRabbitMQPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQPermission", ModifyRabbitMQPermissionResponse.class);
    }

    /**
     *This API is used to modify a TDMQ for RabbitMQ user.
     * @param req ModifyRabbitMQUserRequest
     * @return ModifyRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQUserResponse ModifyRabbitMQUser(ModifyRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQUser", ModifyRabbitMQUserResponse.class);
    }

    /**
     *This API is used to modify a TDMQ for RabbitMQ vhost.
     * @param req ModifyRabbitMQVirtualHostRequest
     * @return ModifyRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQVirtualHostResponse ModifyRabbitMQVirtualHost(ModifyRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQVirtualHost", ModifyRabbitMQVirtualHostResponse.class);
    }

    /**
     *This API is used to modify the attributes of a RocketMQ cluster.
This API is applicable to clusters: 4.x virtual cluster. For 4.x dedicated or generic clusters, refer to the API documentation [ModifyRocketMQInstance](https://www.tencentcloud.com/document/api/1179/108862?from_cn_redirect=1). For 5.x clusters, refer to the API documentation [ModifyInstance](https://www.tencentcloud.com/document/api/1493/97865?from_cn_redirect=1).
     * @param req ModifyRocketMQClusterRequest
     * @return ModifyRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQClusterResponse ModifyRocketMQCluster(ModifyRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQCluster", ModifyRocketMQClusterResponse.class);
    }

    /**
     *Modify role authorization.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [ModifyRole](https://www.tencentcloud.com/document/api/1493/98861?from_cn_redirect=1).
     * @param req ModifyRocketMQEnvironmentRoleRequest
     * @return ModifyRocketMQEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQEnvironmentRoleResponse ModifyRocketMQEnvironmentRole(ModifyRocketMQEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQEnvironmentRole", ModifyRocketMQEnvironmentRoleResponse.class);
    }

    /**
     *Modify a RocketMQ consumption group property.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [ModifyConsumerGroup](https://www.tencentcloud.com/document/api/1493/97940?from_cn_redirect=1) to modify the consumer group's attributes.
     * @param req ModifyRocketMQGroupRequest
     * @return ModifyRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQGroupResponse ModifyRocketMQGroup(ModifyRocketMQGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQGroup", ModifyRocketMQGroupResponse.class);
    }

    /**
     *Modify RocketMQ Dedicated or Generic Cluster Property.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For 5.x clusters, refer to the API documentation [ModifyInstance](https://www.tencentcloud.com/document/api/1493/97865?from_cn_redirect=1).
     * @param req ModifyRocketMQInstanceRequest
     * @return ModifyRocketMQInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQInstanceResponse ModifyRocketMQInstance(ModifyRocketMQInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQInstance", ModifyRocketMQInstanceResponse.class);
    }

    /**
     *This API is used to modify the RocketMQ dedicated cluster configuration, supporting upgrades of instance specification, number of nodes and storage, as well as downgrades of instance specification. After initiating order and completing payment, it will enter the instance configuration change process. You can check whether the change is completed via [DescribeRocketMQVipInstances](https://www.tencentcloud.com/document/api/1179/80903?from_cn_redirect=1).
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For 5.x clusters, refer to the API documentation [ModifyInstance](https://www.tencentcloud.com/document/api/1493/97865?from_cn_redirect=1).
     * @param req ModifyRocketMQInstanceSpecRequest
     * @return ModifyRocketMQInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQInstanceSpecResponse ModifyRocketMQInstanceSpec(ModifyRocketMQInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQInstanceSpec", ModifyRocketMQInstanceSpecResponse.class);
    }

    /**
     *This API is used to update a RocketMQ namespace.
This API is applicable to clusters: 4.x virtual cluster and 4.x dedicated cluster. Other cluster types do not support this feature.
     * @param req ModifyRocketMQNamespaceRequest
     * @return ModifyRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQNamespaceResponse ModifyRocketMQNamespace(ModifyRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQNamespace", ModifyRocketMQNamespaceResponse.class);
    }

    /**
     *Modify a role.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [ModifyRole](https://www.tencentcloud.com/document/api/1493/98861?from_cn_redirect=1).
     * @param req ModifyRocketMQRoleRequest
     * @return ModifyRocketMQRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQRoleResponse ModifyRocketMQRole(ModifyRocketMQRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQRole", ModifyRocketMQRoleResponse.class);
    }

    /**
     *This API is used to modify RocketMQ topic attributes.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [ModifyTopic](https://www.tencentcloud.com/document/api/1493/97944?from_cn_redirect=1).
     * @param req ModifyRocketMQTopicRequest
     * @return ModifyRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQTopicResponse ModifyRocketMQTopic(ModifyRocketMQTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQTopic", ModifyRocketMQTopicResponse.class);
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
     *This API is used to modify the topic remarks and number of partitions.
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

    /**
     *This API is used to send a CMQ topic message.
     * @param req PublishCmqMsgRequest
     * @return PublishCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public PublishCmqMsgResponse PublishCmqMsg(PublishCmqMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishCmqMsg", PublishCmqMsgResponse.class);
    }

    /**
     *This API is used to receive messages sent to a specified Partitioned Topic. It supports only Partitioned Topic type. When there are no messages in the Partitioned Topic but the API is still called, it throws a ReceiveTimeout exception.

This API is used to batch receive policies.

This API is used to provide the following three parameters:.

MaxNumMessages: The maximum number of messages returned by the Receive API each time when using BatchReceive.
MaxNumBytes: the maximum size of messages returned by the Receive API in a single BatchReceive operation, in bytes.
Timeout: The maximum timeout period for each Receive API call when using BatchReceive is how long, in MS.

This API is used to disable the BatchReceive feature if none of the three parameters are specified. If any one of the three parameters has a value greater than 0, BatchReceive is enabled. BatchReceive completes when reaching the threshold specified in any one of the three parameters.

Note: MaxNumMessages and MaxNumBytes are subject to the size of ReceiveQueueSize for each receipt of messages. If ReceiveQueueSize is set to 5 and MaxNumMessages is set to 10, then BatchReceive will receive at most 5 messages at once rather than 10.



This API is used to return multiple messages at one time.

This API is used to Split multiple messages with the special character '###', allowing the business side to use Split tools in different languages to separate messages after receiving them.
Multiple MessageIDs use the special character '###' to separate with each other. After receiving the message, the business side can leverage the Split tool provided by different languages to separate different messages. (Used for filling in the necessary MessageID field information when calling the AcknowledgeMessage API.).
     * @param req ReceiveMessageRequest
     * @return ReceiveMessageResponse
     * @throws TencentCloudSDKException
     */
    public ReceiveMessageResponse ReceiveMessage(ReceiveMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReceiveMessage", ReceiveMessageResponse.class);
    }

    /**
     *This API is used to rewind a message by timestamp, accurate down to the millisecond.
     * @param req ResetMsgSubOffsetByTimestampRequest
     * @return ResetMsgSubOffsetByTimestampResponse
     * @throws TencentCloudSDKException
     */
    public ResetMsgSubOffsetByTimestampResponse ResetMsgSubOffsetByTimestamp(ResetMsgSubOffsetByTimestampRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetMsgSubOffsetByTimestamp", ResetMsgSubOffsetByTimestampResponse.class);
    }

    /**
     *Reset consumer offset.
This API is applicable to clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, refer to the API documentation [ResetConsumerGroupOffset](https://www.tencentcloud.com/document/api/1493/116942?from_cn_redirect=1) to reset the consumer offset.
     * @param req ResetRocketMQConsumerOffSetRequest
     * @return ResetRocketMQConsumerOffSetResponse
     * @throws TencentCloudSDKException
     */
    public ResetRocketMQConsumerOffSetResponse ResetRocketMQConsumerOffSet(ResetRocketMQConsumerOffSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetRocketMQConsumerOffSet", ResetRocketMQConsumerOffSetResponse.class);
    }

    /**
     *Resend a RocketMQ dead letter message.
Current API applicable clusters: 4.x virtual cluster, 4.x dedicated cluster, and 4.x generic cluster. For 5.x clusters, see the REST API documentation for resending dead letter messages at [ResendDeadLetterMessage](https://www.tencentcloud.com/document/api/1493/114592?from_cn_redirect=1).
     * @param req RetryRocketMQDlqMessageRequest
     * @return RetryRocketMQDlqMessageResponse
     * @throws TencentCloudSDKException
     */
    public RetryRocketMQDlqMessageResponse RetryRocketMQDlqMessage(RetryRocketMQDlqMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryRocketMQDlqMessage", RetryRocketMQDlqMessageResponse.class);
    }

    /**
     *This API is used to rewind a CMQ queue.
     * @param req RewindCmqQueueRequest
     * @return RewindCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public RewindCmqQueueResponse RewindCmqQueue(RewindCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RewindCmqQueue", RewindCmqQueueResponse.class);
    }

    /**
     *This API is used to batch send messages.

Note: the batch message sending API in TDMQ is to package messages into a batch on the service side of TDMQ-HTTP and then send the batch as a TCP request inside the service. Therefore, when using this API, you should still follow the logic of sending a single message: each message is an independent HTTP request, and multiple HTTP requests are aggregated into one batch inside the TDMQ-HTTP service and then sent to the server; that is, batch sending messages is the same as sending a single message in terms of usage, and batch aggregation is completed inside the TDMQ-HTTP service.
     * @param req SendBatchMessagesRequest
     * @return SendBatchMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendBatchMessagesResponse SendBatchMessages(SendBatchMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendBatchMessages", SendBatchMessagesResponse.class);
    }

    /**
     *This API is used to send a CMQ message.
     * @param req SendCmqMsgRequest
     * @return SendCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendCmqMsgResponse SendCmqMsg(SendCmqMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendCmqMsg", SendCmqMsgResponse.class);
    }

    /**
     *This API is used to send a single message.
The message cannot be sent to a persistent topic.
     * @param req SendMessagesRequest
     * @return SendMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendMessagesResponse SendMessages(SendMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMessages", SendMessagesResponse.class);
    }

    /**
     *This API is used to test message sending. It cannot be used in the production environment.
     * @param req SendMsgRequest
     * @return SendMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendMsgResponse SendMsg(SendMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMsg", SendMsgResponse.class);
    }

    /**
     *This API is used to send messages through RocketMQ. It is only used for sending a small number of test messages from the console and does not provide SLA. Cloud API is subject to traffic throttling. In real business scenarios, use the RocketMQ SDK to send messages.
     * @param req SendRocketMQMessageRequest
     * @return SendRocketMQMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendRocketMQMessageResponse SendRocketMQMessage(SendRocketMQMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendRocketMQMessage", SendRocketMQMessageResponse.class);
    }

    /**
     *Enable or disable public network access, set security access policy.
This API is applicable to clusters: 4.x dedicated cluster and 4.x generic cluster. For public network access point settings of 5.x clusters, refer to the API Documentation [ModifyInstanceEndpoint](https://www.tencentcloud.com/document/api/1493/115981?from_cn_redirect=1).
     * @param req SetRocketMQPublicAccessPointRequest
     * @return SetRocketMQPublicAccessPointResponse
     * @throws TencentCloudSDKException
     */
    public SetRocketMQPublicAccessPointResponse SetRocketMQPublicAccessPoint(SetRocketMQPublicAccessPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetRocketMQPublicAccessPoint", SetRocketMQPublicAccessPointResponse.class);
    }

    /**
     *This API is used to unbind a CMQ dead letter queue.
     * @param req UnbindCmqDeadLetterRequest
     * @return UnbindCmqDeadLetterResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCmqDeadLetterResponse UnbindCmqDeadLetter(UnbindCmqDeadLetterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCmqDeadLetter", UnbindCmqDeadLetterResponse.class);
    }

}
