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
package com.tencentcloudapi.ckafka.v20190819;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ckafka.v20190819.models.*;

public class CkafkaClient extends AbstractClient{
    private static String endpoint = "ckafka.intl.tencentcloudapi.com";
    private static String service = "ckafka";
    private static String version = "2019-08-19";

    public CkafkaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CkafkaClient(Credential credential, String region, ClientProfile profile) {
        super(CkafkaClient.endpoint, CkafkaClient.version, credential, region, profile);
    }

    /**
     *This API is used to create ACL policies in batches.
     * @param req BatchCreateAclRequest
     * @return BatchCreateAclResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateAclResponse BatchCreateAcl(BatchCreateAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateAcl", BatchCreateAclResponse.class);
    }

    /**
     *This API is used to batch modify consumer group offsets.
     * @param req BatchModifyGroupOffsetsRequest
     * @return BatchModifyGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyGroupOffsetsResponse BatchModifyGroupOffsets(BatchModifyGroupOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyGroupOffsets", BatchModifyGroupOffsetsResponse.class);
    }

    /**
     *This API is used to batch set topic attributes.
     * @param req BatchModifyTopicAttributesRequest
     * @return BatchModifyTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTopicAttributesResponse BatchModifyTopicAttributes(BatchModifyTopicAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTopicAttributes", BatchModifyTopicAttributesResponse.class);
    }

    /**
     *This API is used to add an ACL policy.
     * @param req CreateAclRequest
     * @return CreateAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclResponse CreateAcl(CreateAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAcl", CreateAclResponse.class);
    }

    /**
     *This API shows you how to create an ACL rule.
     * @param req CreateAclRuleRequest
     * @return CreateAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclRuleResponse CreateAclRule(CreateAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAclRule", CreateAclRuleResponse.class);
    }

    /**
     *This API is used to create a consumer group.
     * @param req CreateConsumerRequest
     * @return CreateConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerResponse CreateConsumer(CreateConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumer", CreateConsumerResponse.class);
    }

    /**
     *This API is used to create a DataHub topic.
     * @param req CreateDatahubTopicRequest
     * @return CreateDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatahubTopicResponse CreateDatahubTopic(CreateDatahubTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatahubTopic", CreateDatahubTopicResponse.class);
    }

    /**
     *This API is used to create a pay-as-you-go instance.  It will be deprecated in future versions. We recommend that you use the `CreatePostPaidInstance` API instead.  You can call this API via SDK or the TencentCloud API console to create a pay-as-you-go CKafka instance,  which is an alternate option for making a purchase in the console.
     * @param req CreateInstancePostRequest
     * @return CreateInstancePostResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancePostResponse CreateInstancePost(CreateInstancePostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstancePost", CreateInstancePostResponse.class);
    }

    /**
     *This API is used to add a partition in a topic.
     * @param req CreatePartitionRequest
     * @return CreatePartitionResponse
     * @throws TencentCloudSDKException
     */
    public CreatePartitionResponse CreatePartition(CreatePartitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePartition", CreatePartitionResponse.class);
    }

    /**
     *This API is used to replace `CreateInstancePost`  to create a pay-as-you-go instance.  You can call this API via SDK or the TencentCloud API console to create a pay-as-you-go CKafka instance,  which is an alternate option for making a purchase in the console.
     * @param req CreatePostPaidInstanceRequest
     * @return CreatePostPaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePostPaidInstanceResponse CreatePostPaidInstance(CreatePostPaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePostPaidInstance", CreatePostPaidInstanceResponse.class);
    }

    /**
     *This API is used to create a CKafka topic.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *This API is used to create a topic IP allowlist.
     * @param req CreateTopicIpWhiteListRequest
     * @return CreateTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicIpWhiteListResponse CreateTopicIpWhiteList(CreateTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopicIpWhiteList", CreateTopicIpWhiteListResponse.class);
    }

    /**
     *This API is used to add a user.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *This API is used to delete an ACL.
     * @param req DeleteAclRequest
     * @return DeleteAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclResponse DeleteAcl(DeleteAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAcl", DeleteAclResponse.class);
    }

    /**
     *This API is used to delete a monthly subscribed (prepaid) instance.
     * @param req DeleteInstancePreRequest
     * @return DeleteInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstancePreResponse DeleteInstancePre(DeleteInstancePreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstancePre", DeleteInstancePreResponse.class);
    }

    /**
     *This API is used to delete a route.
     * @param req DeleteRouteRequest
     * @return DeleteRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteResponse DeleteRoute(DeleteRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoute", DeleteRouteResponse.class);
    }

    /**
     *This API is used to modify the delayed trigger time of route deletion.
     * @param req DeleteRouteTriggerTimeRequest
     * @return DeleteRouteTriggerTimeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTriggerTimeResponse DeleteRouteTriggerTime(DeleteRouteTriggerTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRouteTriggerTime", DeleteRouteTriggerTimeResponse.class);
    }

    /**
     *This API is used to delete a CKafka topic.
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *This API is used to delete a topic IP allowlist.
     * @param req DeleteTopicIpWhiteListRequest
     * @return DeleteTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicIpWhiteListResponse DeleteTopicIpWhiteList(DeleteTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopicIpWhiteList", DeleteTopicIpWhiteListResponse.class);
    }

    /**
     *This API is used to delete a user.
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *This API is used to enumerate ACLs.
     * @param req DescribeACLRequest
     * @return DescribeACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeACLResponse DescribeACL(DescribeACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeACL", DescribeACLResponse.class);
    }

    /**
     *This API is used to query the ACL rule list.
     * @param req DescribeAclRuleRequest
     * @return DescribeAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAclRuleResponse DescribeAclRule(DescribeAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAclRule", DescribeAclRuleResponse.class);
    }

    /**
     *This API is used to query the user list.
     * @param req DescribeAppInfoRequest
     * @return DescribeAppInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppInfoResponse DescribeAppInfo(DescribeAppInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppInfo", DescribeAppInfoResponse.class);
    }

    /**
     *This API is used to view the AZ list of Ckafka.
     * @param req DescribeCkafkaZoneRequest
     * @return DescribeCkafkaZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCkafkaZoneResponse DescribeCkafkaZone(DescribeCkafkaZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCkafkaZone", DescribeCkafkaZoneResponse.class);
    }

    /**
     *This API is used to query consumer group information.
     * @param req DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupResponse DescribeConsumerGroup(DescribeConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroup", DescribeConsumerGroupResponse.class);
    }

    /**
     *This API is used to get the DataHub topic attributes.
     * @param req DescribeDatahubTopicRequest
     * @return DescribeDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTopicResponse DescribeDatahubTopic(DescribeDatahubTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatahubTopic", DescribeDatahubTopicResponse.class);
    }

    /**
     *This API is used to query the DataHub topic list.
     * @param req DescribeDatahubTopicsRequest
     * @return DescribeDatahubTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTopicsResponse DescribeDatahubTopics(DescribeDatahubTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatahubTopics", DescribeDatahubTopicsResponse.class);
    }

    /**
     *This API is used to enumerate consumer groups (simplified).
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroup", DescribeGroupResponse.class);
    }

    /**
     *This API is used to get consumer group information.
     * @param req DescribeGroupInfoRequest
     * @return DescribeGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupInfoResponse DescribeGroupInfo(DescribeGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupInfo", DescribeGroupInfoResponse.class);
    }

    /**
     *This API is used to get the consumer group offset.
     * @param req DescribeGroupOffsetsRequest
     * @return DescribeGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupOffsetsResponse DescribeGroupOffsets(DescribeGroupOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupOffsets", DescribeGroupOffsetsResponse.class);
    }

    /**
     *This API is used to get instance attributes. 
     * @param req DescribeInstanceAttributesRequest
     * @return DescribeInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAttributesResponse DescribeInstanceAttributes(DescribeInstanceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceAttributes", DescribeInstanceAttributesResponse.class);
    }

    /**
     *This API is used to get the list of CKafka instances under a user account.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to get instance list details under a user account.
     * @param req DescribeInstancesDetailRequest
     * @return DescribeInstancesDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDetailResponse DescribeInstancesDetail(DescribeInstancesDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDetail", DescribeInstancesDetailResponse.class);
    }

    /**
     *This API is used to enumerate regions, and can be called only in Guangzhou.
     * @param req DescribeRegionRequest
     * @return DescribeRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionResponse DescribeRegion(DescribeRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegion", DescribeRegionResponse.class);
    }

    /**
     *This API is used to view route information.
     * @param req DescribeRouteRequest
     * @return DescribeRouteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteResponse DescribeRoute(DescribeRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoute", DescribeRouteResponse.class);
    }

    /**
     *This API is used to query the task status.
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *API domain name: https://ckafka.tencentcloudapi.com
This API is used to get the list of topics in a CKafka instance of a user.
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopic", DescribeTopicResponse.class);
    }

    /**
     *This API is used to get topic attributes.

     * @param req DescribeTopicAttributesRequest
     * @return DescribeTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicAttributesResponse DescribeTopicAttributes(DescribeTopicAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicAttributes", DescribeTopicAttributesResponse.class);
    }

    /**
     *This API is used to get topic list details (only for call in the console).
     * @param req DescribeTopicDetailRequest
     * @return DescribeTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicDetailResponse DescribeTopicDetail(DescribeTopicDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicDetail", DescribeTopicDetailResponse.class);
    }

    /**
     *This API is used to query the connection information of the topic producer.
     * @param req DescribeTopicProduceConnectionRequest
     * @return DescribeTopicProduceConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicProduceConnectionResponse DescribeTopicProduceConnection(DescribeTopicProduceConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicProduceConnection", DescribeTopicProduceConnectionResponse.class);
    }

    /**
     *This API is used to search and subscribe the message group information of a topic.
     * @param req DescribeTopicSubscribeGroupRequest
     * @return DescribeTopicSubscribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicSubscribeGroupResponse DescribeTopicSubscribeGroup(DescribeTopicSubscribeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicSubscribeGroup", DescribeTopicSubscribeGroupResponse.class);
    }

    /**
     *This API is used to get the details of a synced topic replica.
     * @param req DescribeTopicSyncReplicaRequest
     * @return DescribeTopicSyncReplicaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicSyncReplicaResponse DescribeTopicSyncReplica(DescribeTopicSyncReplicaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicSyncReplica", DescribeTopicSyncReplicaResponse.class);
    }

    /**
     *This API is used to query user information.
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUser", DescribeUserResponse.class);
    }

    /**
     *This API is used to query messages based on a specified offset position.
     * @param req FetchMessageByOffsetRequest
     * @return FetchMessageByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchMessageByOffsetResponse FetchMessageByOffset(FetchMessageByOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchMessageByOffset", FetchMessageByOffsetResponse.class);
    }

    /**
     *This API is used to query the message list based on an offset.
     * @param req FetchMessageListByOffsetRequest
     * @return FetchMessageListByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchMessageListByOffsetResponse FetchMessageListByOffset(FetchMessageListByOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchMessageListByOffset", FetchMessageListByOffsetResponse.class);
    }

    /**
     *This API is used to purchase a CKafka instance or query the instance renewal price.
     * @param req InquireCkafkaPriceRequest
     * @return InquireCkafkaPriceResponse
     * @throws TencentCloudSDKException
     */
    public InquireCkafkaPriceResponse InquireCkafkaPrice(InquireCkafkaPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquireCkafkaPrice", InquireCkafkaPriceResponse.class);
    }

    /**
     *This API is used to modify an ACL policy, and currently only supports specifying whether to apply the preset rule to new topics.
     * @param req ModifyAclRuleRequest
     * @return ModifyAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAclRuleResponse ModifyAclRule(ModifyAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAclRule", ModifyAclRuleResponse.class);
    }

    /**
     *This API is used to modify the DataHub topic attributes.
     * @param req ModifyDatahubTopicRequest
     * @return ModifyDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatahubTopicResponse ModifyDatahubTopic(ModifyDatahubTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatahubTopic", ModifyDatahubTopicResponse.class);
    }

    /**
     *This API is used to set the consumer group (Groups) offset.
     * @param req ModifyGroupOffsetsRequest
     * @return ModifyGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupOffsetsResponse ModifyGroupOffsets(ModifyGroupOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroupOffsets", ModifyGroupOffsetsResponse.class);
    }

    /**
     *This API is used to set instance attributes.
     * @param req ModifyInstanceAttributesRequest
     * @return ModifyInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAttributesResponse ModifyInstanceAttributes(ModifyInstanceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAttributes", ModifyInstanceAttributesResponse.class);
    }

    /**
     *This API is used to change the configurations of a prepaid instance, such as disk capacity and bandwidth.
     * @param req ModifyInstancePreRequest
     * @return ModifyInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancePreResponse ModifyInstancePre(ModifyInstancePreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancePre", ModifyInstancePreResponse.class);
    }

    /**
     *This API is used to change the password.
     * @param req ModifyPasswordRequest
     * @return ModifyPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPasswordResponse ModifyPassword(ModifyPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPassword", ModifyPasswordResponse.class);
    }

    /**
     *This API is used to modify topic attributes.
     * @param req ModifyTopicAttributesRequest
     * @return ModifyTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicAttributesResponse ModifyTopicAttributes(ModifyTopicAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopicAttributes", ModifyTopicAttributesResponse.class);
    }

    /**
     *This API is used to send messages through the HTTP access layer.
     * @param req SendMessageRequest
     * @return SendMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendMessageResponse SendMessage(SendMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMessage", SendMessageResponse.class);
    }

}
