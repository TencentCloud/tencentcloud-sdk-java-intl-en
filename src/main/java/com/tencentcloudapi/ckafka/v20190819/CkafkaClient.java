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
    private static String endpoint = "ckafka.tencentcloudapi.com";
    private static String version = "2019-08-19";

    public CkafkaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CkafkaClient(Credential credential, String region, ClientProfile profile) {
        super(CkafkaClient.endpoint, CkafkaClient.version, credential, region, profile);
    }

    /**
     *This API is used to add an ACL policy.
     * @param req CreateAclRequest
     * @return CreateAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclResponse CreateAcl(CreateAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAclResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAclResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAcl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a partition in a topic.
     * @param req CreatePartitionRequest
     * @return CreatePartitionResponse
     * @throws TencentCloudSDKException
     */
    public CreatePartitionResponse CreatePartition(CreatePartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePartitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePartitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePartition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a CKafka topic.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a topic IP whitelist.
     * @param req CreateTopicIpWhiteListRequest
     * @return CreateTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicIpWhiteListResponse CreateTopicIpWhiteList(CreateTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicIpWhiteListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicIpWhiteListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTopicIpWhiteList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a user.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an ACL.
     * @param req DeleteAclRequest
     * @return DeleteAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclResponse DeleteAcl(DeleteAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAclResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAclResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAcl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a CKafka topic.
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a topic IP whitelist.
     * @param req DeleteTopicIpWhiteListRequest
     * @return DeleteTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicIpWhiteListResponse DeleteTopicIpWhiteList(DeleteTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicIpWhiteListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicIpWhiteListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTopicIpWhiteList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a user.
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enumerate ACLs.
     * @param req DescribeACLRequest
     * @return DescribeACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeACLResponse DescribeACL(DescribeACLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeACLResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeACLResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeACL"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the user list.
     * @param req DescribeAppInfoRequest
     * @return DescribeAppInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppInfoResponse DescribeAppInfo(DescribeAppInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAppInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAppInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query consumer group information.
     * @param req DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupResponse DescribeConsumerGroup(DescribeConsumerGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConsumerGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConsumerGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConsumerGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enumerate consumer groups (simplified).
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get consumer group information.
     * @param req DescribeGroupInfoRequest
     * @return DescribeGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupInfoResponse DescribeGroupInfo(DescribeGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the consumer group offset.
     * @param req DescribeGroupOffsetsRequest
     * @return DescribeGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupOffsetsResponse DescribeGroupOffsets(DescribeGroupOffsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupOffsetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupOffsetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupOffsets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get instance attributes.
     * @param req DescribeInstanceAttributesRequest
     * @return DescribeInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAttributesResponse DescribeInstanceAttributes(DescribeInstanceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of CKafka instances under a user account.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get instance list details under a user account.
     * @param req DescribeInstancesDetailRequest
     * @return DescribeInstancesDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDetailResponse DescribeInstancesDetail(DescribeInstancesDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstancesDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *API domain name: https://ckafka.tencentcloudapi.com
This API is used to get the list of topics in a CKafka instance of a user.
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get topic attributes.

     * @param req DescribeTopicAttributesRequest
     * @return DescribeTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicAttributesResponse DescribeTopicAttributes(DescribeTopicAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTopicAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get topic list details (only for call in the console).
     * @param req DescribeTopicDetailRequest
     * @return DescribeTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicDetailResponse DescribeTopicDetail(DescribeTopicDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTopicDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query user information.
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the consumer group (Groups) offset.
     * @param req ModifyGroupOffsetsRequest
     * @return ModifyGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupOffsetsResponse ModifyGroupOffsets(ModifyGroupOffsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupOffsetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupOffsetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyGroupOffsets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set instance attributes.
     * @param req ModifyInstanceAttributesRequest
     * @return ModifyInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAttributesResponse ModifyInstanceAttributes(ModifyInstanceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the password.
     * @param req ModifyPasswordRequest
     * @return ModifyPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPasswordResponse ModifyPassword(ModifyPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify topic attributes.
     * @param req ModifyTopicAttributesRequest
     * @return ModifyTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicAttributesResponse ModifyTopicAttributes(ModifyTopicAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTopicAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTopicAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
