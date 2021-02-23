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
package com.tencentcloudapi.gse.v20191112;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gse.v20191112.models.*;

public class GseClient extends AbstractClient{
    private static String endpoint = "gse.tencentcloudapi.com";
    private static String service = "gse";
    private static String version = "2019-11-12";

    public GseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GseClient(Credential credential, String region, ClientProfile profile) {
        super(GseClient.endpoint, GseClient.version, credential, region, profile);
    }

    /**
     *This API is used to replicate server fleet.
     * @param req CopyFleetRequest
     * @return CopyFleetResponse
     * @throws TencentCloudSDKException
     */
    public CopyFleetResponse CopyFleet(CopyFleetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyFleetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopyFleetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyFleet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a game server session.
     * @param req CreateGameServerSessionRequest
     * @return CreateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateGameServerSessionResponse CreateGameServerSession(CreateGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGameServerSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGameServerSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGameServerSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of game server session details.
     * @param req DescribeGameServerSessionDetailsRequest
     * @return DescribeGameServerSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionDetailsResponse DescribeGameServerSessionDetails(DescribeGameServerSessionDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGameServerSessionDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the placement of a game server session.
     * @param req DescribeGameServerSessionPlacementRequest
     * @return DescribeGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionPlacementResponse DescribeGameServerSessionPlacement(DescribeGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionPlacementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionPlacementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGameServerSessionPlacement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of game server sessions.
     * @param req DescribeGameServerSessionsRequest
     * @return DescribeGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionsResponse DescribeGameServerSessions(DescribeGameServerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGameServerSessions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of player sessions.
     * @param req DescribePlayerSessionsRequest
     * @return DescribePlayerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayerSessionsResponse DescribePlayerSessions(DescribePlayerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayerSessionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayerSessionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlayerSessions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the log URL of a game server session.
     * @param req GetGameServerSessionLogUrlRequest
     * @return GetGameServerSessionLogUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetGameServerSessionLogUrlResponse GetGameServerSessionLogUrl(GetGameServerSessionLogUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGameServerSessionLogUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGameServerSessionLogUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGameServerSessionLogUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the credentials required for instance login.
     * @param req GetInstanceAccessRequest
     * @return GetInstanceAccessResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceAccessResponse GetInstanceAccess(GetInstanceAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetInstanceAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetInstanceAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetInstanceAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to join a game server session.
     * @param req JoinGameServerSessionRequest
     * @return JoinGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionResponse JoinGameServerSession(JoinGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<JoinGameServerSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<JoinGameServerSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "JoinGameServerSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to join game server sessions in batch.
     * @param req JoinGameServerSessionBatchRequest
     * @return JoinGameServerSessionBatchResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionBatchResponse JoinGameServerSessionBatch(JoinGameServerSessionBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<JoinGameServerSessionBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<JoinGameServerSessionBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "JoinGameServerSessionBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to search in the list of game server sessions.
     * @param req SearchGameServerSessionsRequest
     * @return SearchGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public SearchGameServerSessionsResponse SearchGameServerSessions(SearchGameServerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchGameServerSessionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchGameServerSessionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchGameServerSessions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start placing a game server session.
     * @param req StartGameServerSessionPlacementRequest
     * @return StartGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StartGameServerSessionPlacementResponse StartGameServerSessionPlacement(StartGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartGameServerSessionPlacementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartGameServerSessionPlacementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartGameServerSessionPlacement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop placing a game server session.
     * @param req StopGameServerSessionPlacementRequest
     * @return StopGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StopGameServerSessionPlacementResponse StopGameServerSessionPlacement(StopGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopGameServerSessionPlacementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopGameServerSessionPlacementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopGameServerSessionPlacement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpdateBucketAccelerateOpt) is used to enable COS global acceleration.
     * @param req UpdateBucketAccelerateOptRequest
     * @return UpdateBucketAccelerateOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketAccelerateOptResponse UpdateBucketAccelerateOpt(UpdateBucketAccelerateOptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateBucketAccelerateOptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateBucketAccelerateOptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateBucketAccelerateOpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpdateBucketCORSOpt) is used to configure CORS for COS.
     * @param req UpdateBucketCORSOptRequest
     * @return UpdateBucketCORSOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketCORSOptResponse UpdateBucketCORSOpt(UpdateBucketCORSOptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateBucketCORSOptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateBucketCORSOptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateBucketCORSOpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a game server session.
     * @param req UpdateGameServerSessionRequest
     * @return UpdateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGameServerSessionResponse UpdateGameServerSession(UpdateGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGameServerSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGameServerSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGameServerSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
