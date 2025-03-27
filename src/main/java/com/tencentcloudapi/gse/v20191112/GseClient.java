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
    private static String endpoint = "gse.intl.tencentcloudapi.com";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyFleet", CopyFleetResponse.class);
    }

    /**
     *This API is used to create a game server session.
     * @param req CreateGameServerSessionRequest
     * @return CreateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateGameServerSessionResponse CreateGameServerSession(CreateGameServerSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGameServerSession", CreateGameServerSessionResponse.class);
    }

    /**
     *This API (DeleteTimerScalingPolicy) is used to delete a scheduled scaling policy of a fleet.

     * @param req DeleteTimerScalingPolicyRequest
     * @return DeleteTimerScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimerScalingPolicyResponse DeleteTimerScalingPolicy(DeleteTimerScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTimerScalingPolicy", DeleteTimerScalingPolicyResponse.class);
    }

    /**
     *This API is used to query the list of game server session details.
     * @param req DescribeGameServerSessionDetailsRequest
     * @return DescribeGameServerSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionDetailsResponse DescribeGameServerSessionDetails(DescribeGameServerSessionDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGameServerSessionDetails", DescribeGameServerSessionDetailsResponse.class);
    }

    /**
     *This API is used to query the placement of a game server session.
     * @param req DescribeGameServerSessionPlacementRequest
     * @return DescribeGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionPlacementResponse DescribeGameServerSessionPlacement(DescribeGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGameServerSessionPlacement", DescribeGameServerSessionPlacementResponse.class);
    }

    /**
     *This API is used to query the list of game server sessions.
     * @param req DescribeGameServerSessionsRequest
     * @return DescribeGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionsResponse DescribeGameServerSessions(DescribeGameServerSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGameServerSessions", DescribeGameServerSessionsResponse.class);
    }

    /**
     *This API is used to obtain the list of CVM types in the specified region.
     * @param req DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypesResponse DescribeInstanceTypes(DescribeInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTypes", DescribeInstanceTypesResponse.class);
    }

    /**
     *This API is used to get the list of player sessions.
     * @param req DescribePlayerSessionsRequest
     * @return DescribePlayerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayerSessionsResponse DescribePlayerSessions(DescribePlayerSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlayerSessions", DescribePlayerSessionsResponse.class);
    }

    /**
     *This API (DescribeTimerScalingPolicies) is used to query the scheduled scaling policies of a fleet. You can query the policies by `fleetID` or the fleet name. The returned results are paged. 

     * @param req DescribeTimerScalingPoliciesRequest
     * @return DescribeTimerScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimerScalingPoliciesResponse DescribeTimerScalingPolicies(DescribeTimerScalingPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimerScalingPolicies", DescribeTimerScalingPoliciesResponse.class);
    }

    /**
     *This API is used to terminate the game server session and the corresponding process, which is applicable to time-limited protection and no protection.
     * @param req EndGameServerSessionAndProcessRequest
     * @return EndGameServerSessionAndProcessResponse
     * @throws TencentCloudSDKException
     */
    public EndGameServerSessionAndProcessResponse EndGameServerSessionAndProcess(EndGameServerSessionAndProcessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EndGameServerSessionAndProcess", EndGameServerSessionAndProcessResponse.class);
    }

    /**
     *This API is used to get the log URL of a game server session.
     * @param req GetGameServerSessionLogUrlRequest
     * @return GetGameServerSessionLogUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetGameServerSessionLogUrlResponse GetGameServerSessionLogUrl(GetGameServerSessionLogUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGameServerSessionLogUrl", GetGameServerSessionLogUrlResponse.class);
    }

    /**
     *This API is used to get the credentials required for instance login.
     * @param req GetInstanceAccessRequest
     * @return GetInstanceAccessResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceAccessResponse GetInstanceAccess(GetInstanceAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetInstanceAccess", GetInstanceAccessResponse.class);
    }

    /**
     *This API is used to join a game server session.
     * @param req JoinGameServerSessionRequest
     * @return JoinGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionResponse JoinGameServerSession(JoinGameServerSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "JoinGameServerSession", JoinGameServerSessionResponse.class);
    }

    /**
     *This API is used to join game server sessions in batch.
     * @param req JoinGameServerSessionBatchRequest
     * @return JoinGameServerSessionBatchResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionBatchResponse JoinGameServerSessionBatch(JoinGameServerSessionBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "JoinGameServerSessionBatch", JoinGameServerSessionBatchResponse.class);
    }

    /**
     *This API (PutTimerScalingPolicy) is used to create or update a scheduled scaling policy for a fleet.

If the field `timerID` is filled in, the specified policy will be updated, and if `timerID` is left empty, a new policy will be created.

     * @param req PutTimerScalingPolicyRequest
     * @return PutTimerScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public PutTimerScalingPolicyResponse PutTimerScalingPolicy(PutTimerScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutTimerScalingPolicy", PutTimerScalingPolicyResponse.class);
    }

    /**
     *This API is used to search in the list of game server sessions.
     * @param req SearchGameServerSessionsRequest
     * @return SearchGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public SearchGameServerSessionsResponse SearchGameServerSessions(SearchGameServerSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchGameServerSessions", SearchGameServerSessionsResponse.class);
    }

    /**
     *This API (SetServerReserved) is used to mark the exceptional instances as retained for troubleshooting.

`ReserveValue`: specifies whether to retain the instance. Valid values: `0` (do not retain), `1` (retain). Default value: `0`.

     * @param req SetServerReservedRequest
     * @return SetServerReservedResponse
     * @throws TencentCloudSDKException
     */
    public SetServerReservedResponse SetServerReserved(SetServerReservedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetServerReserved", SetServerReservedResponse.class);
    }

    /**
     *This API is used to start placing a game server session.
     * @param req StartGameServerSessionPlacementRequest
     * @return StartGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StartGameServerSessionPlacementResponse StartGameServerSessionPlacement(StartGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartGameServerSessionPlacement", StartGameServerSessionPlacementResponse.class);
    }

    /**
     *This API is used to stop placing a game server session.
     * @param req StopGameServerSessionPlacementRequest
     * @return StopGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StopGameServerSessionPlacementResponse StopGameServerSessionPlacement(StopGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopGameServerSessionPlacement", StopGameServerSessionPlacementResponse.class);
    }

    /**
     *This API (UpdateBucketAccelerateOpt) is used to enable COS global acceleration.
     * @param req UpdateBucketAccelerateOptRequest
     * @return UpdateBucketAccelerateOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketAccelerateOptResponse UpdateBucketAccelerateOpt(UpdateBucketAccelerateOptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBucketAccelerateOpt", UpdateBucketAccelerateOptResponse.class);
    }

    /**
     *This API (UpdateBucketCORSOpt) is used to configure CORS for COS.
     * @param req UpdateBucketCORSOptRequest
     * @return UpdateBucketCORSOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketCORSOptResponse UpdateBucketCORSOpt(UpdateBucketCORSOptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBucketCORSOpt", UpdateBucketCORSOptResponse.class);
    }

    /**
     *This API is used to update a game server session.
     * @param req UpdateGameServerSessionRequest
     * @return UpdateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGameServerSessionResponse UpdateGameServerSession(UpdateGameServerSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGameServerSession", UpdateGameServerSessionResponse.class);
    }

}
