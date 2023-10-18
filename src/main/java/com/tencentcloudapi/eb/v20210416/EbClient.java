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
package com.tencentcloudapi.eb.v20210416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.eb.v20210416.models.*;

public class EbClient extends AbstractClient{
    private static String endpoint = "eb.tencentcloudapi.com";
    private static String service = "eb";
    private static String version = "2021-04-16";
    
    public EbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EbClient(Credential credential, String region, ClientProfile profile) {
        super(EbClient.endpoint, EbClient.version, credential, region, profile);
    }

    /**
     *This API is used to check a rule.
     * @param req CheckRuleRequest
     * @return CheckRuleResponse
     * @throws TencentCloudSDKException
     */
    public CheckRuleResponse CheckRule(CheckRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckRule", CheckRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to test rules and data on the ETL configuration page.
     * @param req CheckTransformationRequest
     * @return CheckTransformationResponse
     * @throws TencentCloudSDKException
     */
    public CheckTransformationResponse CheckTransformation(CheckTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckTransformationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckTransformation", CheckTransformationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an event connector.
     * @param req CreateConnectionRequest
     * @return CreateConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateConnectionResponse CreateConnection(CreateConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateConnection", CreateConnectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an event bus.
     * @param req CreateEventBusRequest
     * @return CreateEventBusResponse
     * @throws TencentCloudSDKException
     */
    public CreateEventBusResponse CreateEventBus(CreateEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEventBusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateEventBus", CreateEventBusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an event rule.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a delivery target.
     * @param req CreateTargetRequest
     * @return CreateTargetResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetResponse CreateTarget(CreateTargetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTargetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTarget", CreateTargetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a transformer.
     * @param req CreateTransformationRequest
     * @return CreateTransformationResponse
     * @throws TencentCloudSDKException
     */
    public CreateTransformationResponse CreateTransformation(CreateTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTransformationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTransformation", CreateTransformationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an event connector.
     * @param req DeleteConnectionRequest
     * @return DeleteConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConnectionResponse DeleteConnection(DeleteConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteConnection", DeleteConnectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an event bus.
     * @param req DeleteEventBusRequest
     * @return DeleteEventBusResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEventBusResponse DeleteEventBus(DeleteEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEventBusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteEventBus", DeleteEventBusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an event rule.
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a delivery target.
     * @param req DeleteTargetRequest
     * @return DeleteTargetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetResponse DeleteTarget(DeleteTargetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTargetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteTarget", DeleteTargetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a transformer.
     * @param req DeleteTransformationRequest
     * @return DeleteTransformationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTransformationResponse DeleteTransformation(DeleteTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTransformationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteTransformation", DeleteTransformationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the details of an event bus.
     * @param req GetEventBusRequest
     * @return GetEventBusResponse
     * @throws TencentCloudSDKException
     */
    public GetEventBusResponse GetEventBus(GetEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetEventBusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetEventBus", GetEventBusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the details of an event rule.
     * @param req GetRuleRequest
     * @return GetRuleResponse
     * @throws TencentCloudSDKException
     */
    public GetRuleResponse GetRule(GetRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetRule", GetRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the details of a transformer.
     * @param req GetTransformationRequest
     * @return GetTransformationResponse
     * @throws TencentCloudSDKException
     */
    public GetTransformationResponse GetTransformation(GetTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTransformationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetTransformation", GetTransformationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of event connectors.
     * @param req ListConnectionsRequest
     * @return ListConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public ListConnectionsResponse ListConnections(ListConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListConnectionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListConnections", ListConnectionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of event buses.
     * @param req ListEventBusesRequest
     * @return ListEventBusesResponse
     * @throws TencentCloudSDKException
     */
    public ListEventBusesResponse ListEventBuses(ListEventBusesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEventBusesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListEventBuses", ListEventBusesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of event rules.
     * @param req ListRulesRequest
     * @return ListRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListRulesResponse ListRules(ListRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListRules", ListRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list delivery targets.
     * @param req ListTargetsRequest
     * @return ListTargetsResponse
     * @throws TencentCloudSDKException
     */
    public ListTargetsResponse ListTargets(ListTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTargetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ListTargets", ListTargetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update an event connector.
     * @param req UpdateConnectionRequest
     * @return UpdateConnectionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConnectionResponse UpdateConnection(UpdateConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateConnection", UpdateConnectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update an event bus.
     * @param req UpdateEventBusRequest
     * @return UpdateEventBusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEventBusResponse UpdateEventBus(UpdateEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEventBusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateEventBus", UpdateEventBusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update an event rule.
     * @param req UpdateRuleRequest
     * @return UpdateRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuleResponse UpdateRule(UpdateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateRule", UpdateRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a delivery target.
     * @param req UpdateTargetRequest
     * @return UpdateTargetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTargetResponse UpdateTarget(UpdateTargetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateTargetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateTarget", UpdateTargetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to update a transformer.
     * @param req UpdateTransformationRequest
     * @return UpdateTransformationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTransformationResponse UpdateTransformation(UpdateTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateTransformationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UpdateTransformation", UpdateTransformationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
