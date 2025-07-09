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
package com.tencentcloudapi.trabbit.v20230418;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trabbit.v20230418.models.*;

public class TrabbitClient extends AbstractClient{
    private static String endpoint = "trabbit.intl.tencentcloudapi.com";
    private static String service = "trabbit";
    private static String version = "2023-04-18";

    public TrabbitClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrabbitClient(Credential credential, String region, ClientProfile profile) {
        super(TrabbitClient.endpoint, TrabbitClient.version, credential, region, profile);
    }

    /**
     *This API is used to create RabbitMQ binding relationships.
     * @param req CreateRabbitMQServerlessBindingRequest
     * @return CreateRabbitMQServerlessBindingResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQServerlessBindingResponse CreateRabbitMQServerlessBinding(CreateRabbitMQServerlessBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQServerlessBinding", CreateRabbitMQServerlessBindingResponse.class);
    }

    /**
     *This API is used to create a RabbitMQ exchange.
     * @param req CreateRabbitMQServerlessExchangeRequest
     * @return CreateRabbitMQServerlessExchangeResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQServerlessExchangeResponse CreateRabbitMQServerlessExchange(CreateRabbitMQServerlessExchangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQServerlessExchange", CreateRabbitMQServerlessExchangeResponse.class);
    }

    /**
     *This API is used to create an RabbitMQ queue.
     * @param req CreateRabbitMQServerlessQueueRequest
     * @return CreateRabbitMQServerlessQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQServerlessQueueResponse CreateRabbitMQServerlessQueue(CreateRabbitMQServerlessQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQServerlessQueue", CreateRabbitMQServerlessQueueResponse.class);
    }

    /**
     *This API is used to create a user for RabbitMQ.
     * @param req CreateRabbitMQServerlessUserRequest
     * @return CreateRabbitMQServerlessUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQServerlessUserResponse CreateRabbitMQServerlessUser(CreateRabbitMQServerlessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQServerlessUser", CreateRabbitMQServerlessUserResponse.class);
    }

    /**
     *This API is used to create a vhost for RabbitMQ.
     * @param req CreateRabbitMQServerlessVirtualHostRequest
     * @return CreateRabbitMQServerlessVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQServerlessVirtualHostResponse CreateRabbitMQServerlessVirtualHost(CreateRabbitMQServerlessVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQServerlessVirtualHost", CreateRabbitMQServerlessVirtualHostResponse.class);
    }

    /**
     *This API is used to unbind RabbitMQ binding relationships.
     * @param req DeleteRabbitMQServerlessBindingRequest
     * @return DeleteRabbitMQServerlessBindingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQServerlessBindingResponse DeleteRabbitMQServerlessBinding(DeleteRabbitMQServerlessBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQServerlessBinding", DeleteRabbitMQServerlessBindingResponse.class);
    }

    /**
     *This API is used to delete the RabbitMQ exchange.
     * @param req DeleteRabbitMQServerlessExchangeRequest
     * @return DeleteRabbitMQServerlessExchangeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQServerlessExchangeResponse DeleteRabbitMQServerlessExchange(DeleteRabbitMQServerlessExchangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQServerlessExchange", DeleteRabbitMQServerlessExchangeResponse.class);
    }

    /**
     *This API is used to delete the permission of RabbitMQ.
     * @param req DeleteRabbitMQServerlessPermissionRequest
     * @return DeleteRabbitMQServerlessPermissionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQServerlessPermissionResponse DeleteRabbitMQServerlessPermission(DeleteRabbitMQServerlessPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQServerlessPermission", DeleteRabbitMQServerlessPermissionResponse.class);
    }

    /**
     *This API is used to delete an RabbitMQ queue.
     * @param req DeleteRabbitMQServerlessQueueRequest
     * @return DeleteRabbitMQServerlessQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQServerlessQueueResponse DeleteRabbitMQServerlessQueue(DeleteRabbitMQServerlessQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQServerlessQueue", DeleteRabbitMQServerlessQueueResponse.class);
    }

    /**
     *This API is used to delete the user of RabbitMQ.
     * @param req DeleteRabbitMQServerlessUserRequest
     * @return DeleteRabbitMQServerlessUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQServerlessUserResponse DeleteRabbitMQServerlessUser(DeleteRabbitMQServerlessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQServerlessUser", DeleteRabbitMQServerlessUserResponse.class);
    }

    /**
     *This API is used to delete a vhost for RabbitMQ.
     * @param req DeleteRabbitMQServerlessVirtualHostRequest
     * @return DeleteRabbitMQServerlessVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQServerlessVirtualHostResponse DeleteRabbitMQServerlessVirtualHost(DeleteRabbitMQServerlessVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQServerlessVirtualHost", DeleteRabbitMQServerlessVirtualHostResponse.class);
    }

    /**
     *This API is used to retrieve the binding relationship list.
     * @param req DescribeRabbitMQServerlessBindingsRequest
     * @return DescribeRabbitMQServerlessBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessBindingsResponse DescribeRabbitMQServerlessBindings(DescribeRabbitMQServerlessBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessBindings", DescribeRabbitMQServerlessBindingsResponse.class);
    }

    /**
     *This API is used to query RabbitMQ connection list.
     * @param req DescribeRabbitMQServerlessConnectionRequest
     * @return DescribeRabbitMQServerlessConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessConnectionResponse DescribeRabbitMQServerlessConnection(DescribeRabbitMQServerlessConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessConnection", DescribeRabbitMQServerlessConnectionResponse.class);
    }

    /**
     *This API is used to query RabbitMQ queue consumer list.
     * @param req DescribeRabbitMQServerlessConsumersRequest
     * @return DescribeRabbitMQServerlessConsumersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessConsumersResponse DescribeRabbitMQServerlessConsumers(DescribeRabbitMQServerlessConsumersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessConsumers", DescribeRabbitMQServerlessConsumersResponse.class);
    }

    /**
     *This API is used to query RabbitMQ exchange details.
     * @param req DescribeRabbitMQServerlessExchangeDetailRequest
     * @return DescribeRabbitMQServerlessExchangeDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessExchangeDetailResponse DescribeRabbitMQServerlessExchangeDetail(DescribeRabbitMQServerlessExchangeDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessExchangeDetail", DescribeRabbitMQServerlessExchangeDetailResponse.class);
    }

    /**
     *This API is used to query the list of RabbitMQ exchanges.
     * @param req DescribeRabbitMQServerlessExchangesRequest
     * @return DescribeRabbitMQServerlessExchangesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessExchangesResponse DescribeRabbitMQServerlessExchanges(DescribeRabbitMQServerlessExchangesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessExchanges", DescribeRabbitMQServerlessExchangesResponse.class);
    }

    /**
     *This API is used to retrieve dedicated instance information for a single RabbitMQ.
     * @param req DescribeRabbitMQServerlessInstanceRequest
     * @return DescribeRabbitMQServerlessInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessInstanceResponse DescribeRabbitMQServerlessInstance(DescribeRabbitMQServerlessInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessInstance", DescribeRabbitMQServerlessInstanceResponse.class);
    }

    /**
     *This API is used to query RabbitMQ permission list.
     * @param req DescribeRabbitMQServerlessPermissionRequest
     * @return DescribeRabbitMQServerlessPermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessPermissionResponse DescribeRabbitMQServerlessPermission(DescribeRabbitMQServerlessPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessPermission", DescribeRabbitMQServerlessPermissionResponse.class);
    }

    /**
     *This API is used to query RabbitMQ queue details.
     * @param req DescribeRabbitMQServerlessQueueDetailRequest
     * @return DescribeRabbitMQServerlessQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessQueueDetailResponse DescribeRabbitMQServerlessQueueDetail(DescribeRabbitMQServerlessQueueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessQueueDetail", DescribeRabbitMQServerlessQueueDetailResponse.class);
    }

    /**
     *This API is used to query a RabbitMQ queue list.
     * @param req DescribeRabbitMQServerlessQueuesRequest
     * @return DescribeRabbitMQServerlessQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessQueuesResponse DescribeRabbitMQServerlessQueues(DescribeRabbitMQServerlessQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessQueues", DescribeRabbitMQServerlessQueuesResponse.class);
    }

    /**
     *This API is used to query RabbitMQ user list.
     * @param req DescribeRabbitMQServerlessUserRequest
     * @return DescribeRabbitMQServerlessUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessUserResponse DescribeRabbitMQServerlessUser(DescribeRabbitMQServerlessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessUser", DescribeRabbitMQServerlessUserResponse.class);
    }

    /**
     *This API is used to query a RabbitMQ vhost list.
     * @param req DescribeRabbitMQServerlessVirtualHostRequest
     * @return DescribeRabbitMQServerlessVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQServerlessVirtualHostResponse DescribeRabbitMQServerlessVirtualHost(DescribeRabbitMQServerlessVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQServerlessVirtualHost", DescribeRabbitMQServerlessVirtualHostResponse.class);
    }

    /**
     *This API is used to obtain instance lists.
     * @param req ListRabbitMQServerlessInstancesRequest
     * @return ListRabbitMQServerlessInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ListRabbitMQServerlessInstancesResponse ListRabbitMQServerlessInstances(ListRabbitMQServerlessInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRabbitMQServerlessInstances", ListRabbitMQServerlessInstancesResponse.class);
    }

    /**
     *This API is used to modify the RabbitMQ exchange.
     * @param req ModifyRabbitMQServerlessExchangeRequest
     * @return ModifyRabbitMQServerlessExchangeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQServerlessExchangeResponse ModifyRabbitMQServerlessExchange(ModifyRabbitMQServerlessExchangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQServerlessExchange", ModifyRabbitMQServerlessExchangeResponse.class);
    }

    /**
     *This API is used to modify cluster information.
     * @param req ModifyRabbitMQServerlessInstanceRequest
     * @return ModifyRabbitMQServerlessInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQServerlessInstanceResponse ModifyRabbitMQServerlessInstance(ModifyRabbitMQServerlessInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQServerlessInstance", ModifyRabbitMQServerlessInstanceResponse.class);
    }

    /**
     *This API is used to modify the permission of RabbitMQ.
     * @param req ModifyRabbitMQServerlessPermissionRequest
     * @return ModifyRabbitMQServerlessPermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQServerlessPermissionResponse ModifyRabbitMQServerlessPermission(ModifyRabbitMQServerlessPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQServerlessPermission", ModifyRabbitMQServerlessPermissionResponse.class);
    }

    /**
     *This API is used to modify an RabbitMQ queue.
     * @param req ModifyRabbitMQServerlessQueueRequest
     * @return ModifyRabbitMQServerlessQueueResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQServerlessQueueResponse ModifyRabbitMQServerlessQueue(ModifyRabbitMQServerlessQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQServerlessQueue", ModifyRabbitMQServerlessQueueResponse.class);
    }

    /**
     *This API is used to modify the user of RabbitMQ.
     * @param req ModifyRabbitMQServerlessUserRequest
     * @return ModifyRabbitMQServerlessUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQServerlessUserResponse ModifyRabbitMQServerlessUser(ModifyRabbitMQServerlessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQServerlessUser", ModifyRabbitMQServerlessUserResponse.class);
    }

    /**
     *This API is used to modify a vhost for RabbitMQ.
     * @param req ModifyRabbitMQServerlessVirtualHostRequest
     * @return ModifyRabbitMQServerlessVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQServerlessVirtualHostResponse ModifyRabbitMQServerlessVirtualHost(ModifyRabbitMQServerlessVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQServerlessVirtualHost", ModifyRabbitMQServerlessVirtualHostResponse.class);
    }

}
