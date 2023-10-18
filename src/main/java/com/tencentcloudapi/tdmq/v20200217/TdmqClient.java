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
    private static String endpoint = "tdmq.tencentcloudapi.com";
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
        JsonResponseModel<AcknowledgeMessageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AcknowledgeMessage", AcknowledgeMessageResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to clear the messages in the CMQ message queue.
     * @param req ClearCmqQueueRequest
     * @return ClearCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqQueueResponse ClearCmqQueue(ClearCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearCmqQueueResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ClearCmqQueue", ClearCmqQueueResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to clear the message tags of a subscriber.
     * @param req ClearCmqSubscriptionFilterTagsRequest
     * @return ClearCmqSubscriptionFilterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqSubscriptionFilterTagsResponse ClearCmqSubscriptionFilterTags(ClearCmqSubscriptionFilterTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearCmqSubscriptionFilterTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ClearCmqSubscriptionFilterTags", ClearCmqSubscriptionFilterTagsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a cluster.
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a CMQ queue.
     * @param req CreateCmqQueueRequest
     * @return CreateCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqQueueResponse CreateCmqQueue(CreateCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCmqQueueResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCmqQueue", CreateCmqQueueResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a CMQ subscription.
     * @param req CreateCmqSubscribeRequest
     * @return CreateCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqSubscribeResponse CreateCmqSubscribe(CreateCmqSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCmqSubscribeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCmqSubscribe", CreateCmqSubscribeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a CMQ topic.
     * @param req CreateCmqTopicRequest
     * @return CreateCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqTopicResponse CreateCmqTopic(CreateCmqTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCmqTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCmqTopic", CreateCmqTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a TDMQ namespace.
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEnvironmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateEnvironment", CreateEnvironmentResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an environment role.
     * @param req CreateEnvironmentRoleRequest
     * @return CreateEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentRoleResponse CreateEnvironmentRole(CreateEnvironmentRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEnvironmentRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateEnvironmentRole", CreateEnvironmentRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a TDMQ for RabbitMQ user.
     * @param req CreateRabbitMQUserRequest
     * @return CreateRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQUserResponse CreateRabbitMQUser(CreateRabbitMQUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRabbitMQUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRabbitMQUser", CreateRabbitMQUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a TDMQ for RabbitMQ exclusive instance.
     * @param req CreateRabbitMQVipInstanceRequest
     * @return CreateRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQVipInstanceResponse CreateRabbitMQVipInstance(CreateRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRabbitMQVipInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRabbitMQVipInstance", CreateRabbitMQVipInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a TDMQ for RabbitMQ vhost.
     * @param req CreateRabbitMQVirtualHostRequest
     * @return CreateRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQVirtualHostResponse CreateRabbitMQVirtualHost(CreateRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRabbitMQVirtualHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRabbitMQVirtualHost", CreateRabbitMQVirtualHostResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a RocketMQ cluster.
     * @param req CreateRocketMQClusterRequest
     * @return CreateRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQClusterResponse CreateRocketMQCluster(CreateRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRocketMQCluster", CreateRocketMQClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a RocketMQ consumer group.
     * @param req CreateRocketMQGroupRequest
     * @return CreateRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQGroupResponse CreateRocketMQGroup(CreateRocketMQGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRocketMQGroup", CreateRocketMQGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a RocketMQ namespace.
     * @param req CreateRocketMQNamespaceRequest
     * @return CreateRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQNamespaceResponse CreateRocketMQNamespace(CreateRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQNamespaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRocketMQNamespace", CreateRocketMQNamespaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a RocketMQ topic.
     * @param req CreateRocketMQTopicRequest
     * @return CreateRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQTopicResponse CreateRocketMQTopic(CreateRocketMQTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRocketMQTopic", CreateRocketMQTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a role.
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a subscription to a topic.
     * @param req CreateSubscriptionRequest
     * @return CreateSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscriptionResponse CreateSubscription(CreateSubscriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubscriptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSubscription", CreateSubscriptionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a message topic in the specified partition and type.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a cluster.
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a CMQ queue.
     * @param req DeleteCmqQueueRequest
     * @return DeleteCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqQueueResponse DeleteCmqQueue(DeleteCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCmqQueueResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCmqQueue", DeleteCmqQueueResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a CMQ subscription.
     * @param req DeleteCmqSubscribeRequest
     * @return DeleteCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqSubscribeResponse DeleteCmqSubscribe(DeleteCmqSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCmqSubscribeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCmqSubscribe", DeleteCmqSubscribeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a CMQ topic.
     * @param req DeleteCmqTopicRequest
     * @return DeleteCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqTopicResponse DeleteCmqTopic(DeleteCmqTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCmqTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCmqTopic", DeleteCmqTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an environment role.
     * @param req DeleteEnvironmentRolesRequest
     * @return DeleteEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentRolesResponse DeleteEnvironmentRoles(DeleteEnvironmentRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEnvironmentRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteEnvironmentRoles", DeleteEnvironmentRolesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch delete namespaces under a tenant.
     * @param req DeleteEnvironmentsRequest
     * @return DeleteEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentsResponse DeleteEnvironments(DeleteEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEnvironmentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteEnvironments", DeleteEnvironmentsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a TDMQ for RabbitMQ user.
     * @param req DeleteRabbitMQUserRequest
     * @return DeleteRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQUserResponse DeleteRabbitMQUser(DeleteRabbitMQUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRabbitMQUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRabbitMQUser", DeleteRabbitMQUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a TDMQ for RabbitMQ exclusive instance.
     * @param req DeleteRabbitMQVipInstanceRequest
     * @return DeleteRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQVipInstanceResponse DeleteRabbitMQVipInstance(DeleteRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRabbitMQVipInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRabbitMQVipInstance", DeleteRabbitMQVipInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a TDMQ for RabbitMQ vhost.
     * @param req DeleteRabbitMQVirtualHostRequest
     * @return DeleteRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQVirtualHostResponse DeleteRabbitMQVirtualHost(DeleteRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRabbitMQVirtualHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRabbitMQVirtualHost", DeleteRabbitMQVirtualHostResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a RocketMQ cluster.
     * @param req DeleteRocketMQClusterRequest
     * @return DeleteRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQClusterResponse DeleteRocketMQCluster(DeleteRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRocketMQCluster", DeleteRocketMQClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a RocketMQ consumer group.
     * @param req DeleteRocketMQGroupRequest
     * @return DeleteRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQGroupResponse DeleteRocketMQGroup(DeleteRocketMQGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRocketMQGroup", DeleteRocketMQGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a RocketMQ namespace.
     * @param req DeleteRocketMQNamespaceRequest
     * @return DeleteRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQNamespaceResponse DeleteRocketMQNamespace(DeleteRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQNamespaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRocketMQNamespace", DeleteRocketMQNamespaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a RocketMQ topic.
     * @param req DeleteRocketMQTopicRequest
     * @return DeleteRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQTopicResponse DeleteRocketMQTopic(DeleteRocketMQTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRocketMQTopic", DeleteRocketMQTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete one or multiple roles.
     * @param req DeleteRolesRequest
     * @return DeleteRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRolesResponse DeleteRoles(DeleteRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRoles", DeleteRolesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a subscription.
     * @param req DeleteSubscriptionsRequest
     * @return DeleteSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubscriptionsResponse DeleteSubscriptions(DeleteSubscriptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSubscriptionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSubscriptions", DeleteSubscriptionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch delete topics.
     * @param req DeleteTopicsRequest
     * @return DeleteTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicsResponse DeleteTopics(DeleteTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteTopics", DeleteTopicsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of dedicated clusters bound to a user.
     * @param req DescribeBindClustersRequest
     * @return DescribeBindClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindClustersResponse DescribeBindClusters(DescribeBindClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBindClusters", DescribeBindClustersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the tenant-VPC binding relationship.
     * @param req DescribeBindVpcsRequest
     * @return DescribeBindVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindVpcsResponse DescribeBindVpcs(DescribeBindVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindVpcsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBindVpcs", DescribeBindVpcsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the details of a cluster.
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of clusters.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enumerate the source queues of a CMQ dead letter queue.
     * @param req DescribeCmqDeadLetterSourceQueuesRequest
     * @return DescribeCmqDeadLetterSourceQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqDeadLetterSourceQueuesResponse DescribeCmqDeadLetterSourceQueues(DescribeCmqDeadLetterSourceQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqDeadLetterSourceQueuesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCmqDeadLetterSourceQueues", DescribeCmqDeadLetterSourceQueuesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of a CMQ queue.
     * @param req DescribeCmqQueueDetailRequest
     * @return DescribeCmqQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueueDetailResponse DescribeCmqQueueDetail(DescribeCmqQueueDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqQueueDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCmqQueueDetail", DescribeCmqQueueDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query all CMQ queues.
     * @param req DescribeCmqQueuesRequest
     * @return DescribeCmqQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueuesResponse DescribeCmqQueues(DescribeCmqQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqQueuesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCmqQueues", DescribeCmqQueuesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the CMQ subscription details.
     * @param req DescribeCmqSubscriptionDetailRequest
     * @return DescribeCmqSubscriptionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqSubscriptionDetailResponse DescribeCmqSubscriptionDetail(DescribeCmqSubscriptionDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqSubscriptionDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCmqSubscriptionDetail", DescribeCmqSubscriptionDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of a CMQ topic.
     * @param req DescribeCmqTopicDetailRequest
     * @return DescribeCmqTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicDetailResponse DescribeCmqTopicDetail(DescribeCmqTopicDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqTopicDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCmqTopicDetail", DescribeCmqTopicDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enumerate all CMQ topics.
     * @param req DescribeCmqTopicsRequest
     * @return DescribeCmqTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicsResponse DescribeCmqTopics(DescribeCmqTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqTopicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCmqTopics", DescribeCmqTopicsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the attributes of the specified namespace.
     * @param req DescribeEnvironmentAttributesRequest
     * @return DescribeEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentAttributesResponse DescribeEnvironmentAttributes(DescribeEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEnvironmentAttributes", DescribeEnvironmentAttributesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of namespace roles.
     * @param req DescribeEnvironmentRolesRequest
     * @return DescribeEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentRolesResponse DescribeEnvironmentRoles(DescribeEnvironmentRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEnvironmentRoles", DescribeEnvironmentRolesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of namespaces under a tenant.
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain message production overview information.
     * @param req DescribePublisherSummaryRequest
     * @return DescribePublisherSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublisherSummaryResponse DescribePublisherSummary(DescribePublisherSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublisherSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePublisherSummary", DescribePublisherSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the list of producer information.
     * @param req DescribePublishersRequest
     * @return DescribePublishersResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublishersResponse DescribePublishers(DescribePublishersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublishersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePublishers", DescribePublishersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the information of a TDMQ for Pulsar pro cluster instance.
     * @param req DescribePulsarProInstanceDetailRequest
     * @return DescribePulsarProInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePulsarProInstanceDetailResponse DescribePulsarProInstanceDetail(DescribePulsarProInstanceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePulsarProInstanceDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePulsarProInstanceDetail", DescribePulsarProInstanceDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of the purchased TDMQ for Pulsar pro instances.
     * @param req DescribePulsarProInstancesRequest
     * @return DescribePulsarProInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePulsarProInstancesResponse DescribePulsarProInstances(DescribePulsarProInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePulsarProInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePulsarProInstances", DescribePulsarProInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ exclusive cluster nodes.
     * @param req DescribeRabbitMQNodeListRequest
     * @return DescribeRabbitMQNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQNodeListResponse DescribeRabbitMQNodeList(DescribeRabbitMQNodeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRabbitMQNodeListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRabbitMQNodeList", DescribeRabbitMQNodeListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ users.
     * @param req DescribeRabbitMQUserRequest
     * @return DescribeRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQUserResponse DescribeRabbitMQUser(DescribeRabbitMQUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRabbitMQUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRabbitMQUser", DescribeRabbitMQUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of the purchased TDMQ for RabbitMQ exclusive instances.
     * @param req DescribeRabbitMQVipInstancesRequest
     * @return DescribeRabbitMQVipInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVipInstancesResponse DescribeRabbitMQVipInstances(DescribeRabbitMQVipInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRabbitMQVipInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRabbitMQVipInstances", DescribeRabbitMQVipInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ vhosts.
     * @param req DescribeRabbitMQVirtualHostRequest
     * @return DescribeRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVirtualHostResponse DescribeRabbitMQVirtualHost(DescribeRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRabbitMQVirtualHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRabbitMQVirtualHost", DescribeRabbitMQVirtualHostResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of TDMQ for RabbitMQ exclusive vhosts.
     * @param req DescribeRabbitMQVirtualHostListRequest
     * @return DescribeRabbitMQVirtualHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVirtualHostListResponse DescribeRabbitMQVirtualHostList(DescribeRabbitMQVirtualHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRabbitMQVirtualHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRabbitMQVirtualHostList", DescribeRabbitMQVirtualHostListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of a specific RocketMQ cluster.
     * @param req DescribeRocketMQClusterRequest
     * @return DescribeRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClusterResponse DescribeRocketMQCluster(DescribeRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQCluster", DescribeRocketMQClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of RocketMQ clusters.
     * @param req DescribeRocketMQClustersRequest
     * @return DescribeRocketMQClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClustersResponse DescribeRocketMQClusters(DescribeRocketMQClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQClusters", DescribeRocketMQClustersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of RocketMQ consumer groups.
     * @param req DescribeRocketMQGroupsRequest
     * @return DescribeRocketMQGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQGroupsResponse DescribeRocketMQGroups(DescribeRocketMQGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQGroups", DescribeRocketMQGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the TDMQ for RocketMQ message details.
     * @param req DescribeRocketMQMsgRequest
     * @return DescribeRocketMQMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQMsgResponse DescribeRocketMQMsg(DescribeRocketMQMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQMsgResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQMsg", DescribeRocketMQMsgResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of RocketMQ namespaces.
     * @param req DescribeRocketMQNamespacesRequest
     * @return DescribeRocketMQNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQNamespacesResponse DescribeRocketMQNamespaces(DescribeRocketMQNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQNamespacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQNamespaces", DescribeRocketMQNamespacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of RocketMQ topics.
     * @param req DescribeRocketMQTopicsRequest
     * @return DescribeRocketMQTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicsResponse DescribeRocketMQTopics(DescribeRocketMQTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQTopicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQTopics", DescribeRocketMQTopicsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of a specific TDMQ for RocketMQ exclusive cluster.
     * @param req DescribeRocketMQVipInstanceDetailRequest
     * @return DescribeRocketMQVipInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQVipInstanceDetailResponse DescribeRocketMQVipInstanceDetail(DescribeRocketMQVipInstanceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQVipInstanceDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQVipInstanceDetail", DescribeRocketMQVipInstanceDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of the purchased TDMQ for RocketMQ exclusive instances.
     * @param req DescribeRocketMQVipInstancesRequest
     * @return DescribeRocketMQVipInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQVipInstancesResponse DescribeRocketMQVipInstances(DescribeRocketMQVipInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQVipInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRocketMQVipInstances", DescribeRocketMQVipInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of roles.
     * @param req DescribeRolesRequest
     * @return DescribeRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRolesResponse DescribeRoles(DescribeRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRoles", DescribeRolesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of subscribers under the specified environment and topic.
     * @param req DescribeSubscriptionsRequest
     * @return DescribeSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscriptionsResponse DescribeSubscriptions(DescribeSubscriptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscriptionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSubscriptions", DescribeSubscriptionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of topics under an environment.
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTopics", DescribeTopicsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a cluster.
     * @param req ModifyClusterRequest
     * @return ModifyClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterResponse ModifyCluster(ModifyClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCluster", ModifyClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a CMQ queue.
     * @param req ModifyCmqQueueAttributeRequest
     * @return ModifyCmqQueueAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqQueueAttributeResponse ModifyCmqQueueAttribute(ModifyCmqQueueAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCmqQueueAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCmqQueueAttribute", ModifyCmqQueueAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a CMQ subscription.
     * @param req ModifyCmqSubscriptionAttributeRequest
     * @return ModifyCmqSubscriptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqSubscriptionAttributeResponse ModifyCmqSubscriptionAttribute(ModifyCmqSubscriptionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCmqSubscriptionAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCmqSubscriptionAttribute", ModifyCmqSubscriptionAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a CMQ topic.
     * @param req ModifyCmqTopicAttributeRequest
     * @return ModifyCmqTopicAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqTopicAttributeResponse ModifyCmqTopicAttribute(ModifyCmqTopicAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCmqTopicAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCmqTopicAttribute", ModifyCmqTopicAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of the specified namespace.
     * @param req ModifyEnvironmentAttributesRequest
     * @return ModifyEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentAttributesResponse ModifyEnvironmentAttributes(ModifyEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvironmentAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyEnvironmentAttributes", ModifyEnvironmentAttributesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an environment role.
     * @param req ModifyEnvironmentRoleRequest
     * @return ModifyEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentRoleResponse ModifyEnvironmentRole(ModifyEnvironmentRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvironmentRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyEnvironmentRole", ModifyEnvironmentRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a TDMQ for RabbitMQ user.
     * @param req ModifyRabbitMQUserRequest
     * @return ModifyRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQUserResponse ModifyRabbitMQUser(ModifyRabbitMQUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRabbitMQUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRabbitMQUser", ModifyRabbitMQUserResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a TDMQ for RabbitMQ vhost.
     * @param req ModifyRabbitMQVirtualHostRequest
     * @return ModifyRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQVirtualHostResponse ModifyRabbitMQVirtualHost(ModifyRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRabbitMQVirtualHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRabbitMQVirtualHost", ModifyRabbitMQVirtualHostResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a RocketMQ cluster.
     * @param req ModifyRocketMQClusterRequest
     * @return ModifyRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQClusterResponse ModifyRocketMQCluster(ModifyRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRocketMQCluster", ModifyRocketMQClusterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a RocketMQ consumer group.
     * @param req ModifyRocketMQGroupRequest
     * @return ModifyRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQGroupResponse ModifyRocketMQGroup(ModifyRocketMQGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRocketMQGroup", ModifyRocketMQGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the configurations of a TDMQ for RocketMQ exclusive instance, including the upgrade of the instance specification, node count, and storage, and the downgrade of the instance specification. After you call this API to place the order and make payments, the configuration modification will be in progress. You can query whether the modification has been completed through the `DescribeRocketMQVipInstances` API`.
     * @param req ModifyRocketMQInstanceSpecRequest
     * @return ModifyRocketMQInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQInstanceSpecResponse ModifyRocketMQInstanceSpec(ModifyRocketMQInstanceSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQInstanceSpecResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRocketMQInstanceSpec", ModifyRocketMQInstanceSpecResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a RocketMQ namespace.
     * @param req ModifyRocketMQNamespaceRequest
     * @return ModifyRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQNamespaceResponse ModifyRocketMQNamespace(ModifyRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQNamespaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRocketMQNamespace", ModifyRocketMQNamespaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a RocketMQ topic.
     * @param req ModifyRocketMQTopicRequest
     * @return ModifyRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQTopicResponse ModifyRocketMQTopic(ModifyRocketMQTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRocketMQTopic", ModifyRocketMQTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a role.
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRole", ModifyRoleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the topic remarks and number of partitions.
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to send a CMQ topic message.
     * @param req PublishCmqMsgRequest
     * @return PublishCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public PublishCmqMsgResponse PublishCmqMsg(PublishCmqMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishCmqMsgResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "PublishCmqMsg", PublishCmqMsgResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Currently, the `ReceiveMessage` API only supports partitioned topics. It is used to receive messages sent to a specified partitioned topic. If it is called when there are no messages in the partitioned topic, the `ReceiveTimeout` exception will be reported.

Instructions on how to use `BatchReceivePolicy`:

`BatchReceive` has three parameters:

● `MaxNumMessages`: The maximum number of messages returned by `Receive` when `BatchReceive` is used.
● `MaxNumBytes`: The maximum size (in bytes) of the message returned by `Receive` when `BatchReceive` is used.
● `Timeout`: The maximum timeout period (in milliseconds) of calling `Receive` when `BatchReceive` is used.

By default, if you don’t specify any of the three parameters, the `BatchReceive` feature is disabled; if one of the three parameter values is above zero, `BatchReceive` is enabled. `BatchReceive` will be disabled when any of the three parameter values reaches the threshold you specify.

Note: The values of both `MaxNumMessages` and `MaxNumBytes` are subject to the value of `ReceiveQueueSize`. If the values of `ReceiveQueueSize` and `MaxNumMessages` are 5 and 10, respectively, you can receive up to five rather than 10 messages when `BatchReceive` is used.



The API configured with `BatchReceivePolicy` returns multiple messages at a time.

1. These messages are separated by “###”. After receiving them, you can separate them with split tools in different languages.
2. MessageIDs are separated by “###”. After receiving the messages, you can separate the MessageIDs with split tools in different languages, so that you can obtain the `MessageID` field information required for calling the `AcknowledgeMessage` API.

     * @param req ReceiveMessageRequest
     * @return ReceiveMessageResponse
     * @throws TencentCloudSDKException
     */
    public ReceiveMessageResponse ReceiveMessage(ReceiveMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReceiveMessageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReceiveMessage", ReceiveMessageResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to rewind a message by timestamp, accurate down to the millisecond.
     * @param req ResetMsgSubOffsetByTimestampRequest
     * @return ResetMsgSubOffsetByTimestampResponse
     * @throws TencentCloudSDKException
     */
    public ResetMsgSubOffsetByTimestampResponse ResetMsgSubOffsetByTimestamp(ResetMsgSubOffsetByTimestampRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetMsgSubOffsetByTimestampResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetMsgSubOffsetByTimestamp", ResetMsgSubOffsetByTimestampResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to reset the consumption offset of a specified consumer group to a specified timestamp.
     * @param req ResetRocketMQConsumerOffSetRequest
     * @return ResetRocketMQConsumerOffSetResponse
     * @throws TencentCloudSDKException
     */
    public ResetRocketMQConsumerOffSetResponse ResetRocketMQConsumerOffSet(ResetRocketMQConsumerOffSetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetRocketMQConsumerOffSetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetRocketMQConsumerOffSet", ResetRocketMQConsumerOffSetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to rewind a CMQ queue.
     * @param req RewindCmqQueueRequest
     * @return RewindCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public RewindCmqQueueResponse RewindCmqQueue(RewindCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RewindCmqQueueResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RewindCmqQueue", RewindCmqQueueResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch send messages.

Note: the batch message sending API in TDMQ is to package messages into a batch on the service side of TDMQ-HTTP and then send the batch as a TCP request inside the service. Therefore, when using this API, you should still follow the logic of sending a single message: each message is an independent HTTP request, and multiple HTTP requests are aggregated into one batch inside the TDMQ-HTTP service and then sent to the server; that is, batch sending messages is the same as sending a single message in terms of usage, and batch aggregation is completed inside the TDMQ-HTTP service.
     * @param req SendBatchMessagesRequest
     * @return SendBatchMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendBatchMessagesResponse SendBatchMessages(SendBatchMessagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendBatchMessagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SendBatchMessages", SendBatchMessagesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to send a CMQ message.
     * @param req SendCmqMsgRequest
     * @return SendCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendCmqMsgResponse SendCmqMsg(SendCmqMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendCmqMsgResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SendCmqMsg", SendCmqMsgResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to send a single message.
The message cannot be sent to a persistent topic.
     * @param req SendMessagesRequest
     * @return SendMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendMessagesResponse SendMessages(SendMessagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendMessagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SendMessages", SendMessagesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to test message sending. It cannot be used in the production environment.
     * @param req SendMsgRequest
     * @return SendMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendMsgResponse SendMsg(SendMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendMsgResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SendMsg", SendMsgResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This document is used to send a TDMQ for RocketMQ message.
     * @param req SendRocketMQMessageRequest
     * @return SendRocketMQMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendRocketMQMessageResponse SendRocketMQMessage(SendRocketMQMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendRocketMQMessageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SendRocketMQMessage", SendRocketMQMessageResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind a CMQ dead letter queue.
     * @param req UnbindCmqDeadLetterRequest
     * @return UnbindCmqDeadLetterResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCmqDeadLetterResponse UnbindCmqDeadLetter(UnbindCmqDeadLetterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindCmqDeadLetterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UnbindCmqDeadLetter", UnbindCmqDeadLetterResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
