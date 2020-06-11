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
package com.tencentcloudapi.trtc.v20190722;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trtc.v20190722.models.*;

public class TrtcClient extends AbstractClient{
    private static String endpoint = "trtc.tencentcloudapi.com";
    private static String version = "2019-07-22";

    public TrtcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrtcClient(Credential credential, String region, ClientProfile profile) {
        super(TrtcClient.endpoint, TrtcClient.version, credential, region, profile);
    }

    /**
     *This API is used to query the user list and user call quality data in a specified time period. It can query data of up to 6 users for the last 5 days, and the query time range cannot exceed 1 hour.
     * @param req DescribeCallDetailRequest
     * @return DescribeCallDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallDetailResponse DescribeCallDetail(DescribeCallDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCallDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCallDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCallDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the number of historical rooms and users for the last 5 days. It can query once per minute.
     * @param req DescribeHistoryScaleRequest
     * @return DescribeHistoryScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryScaleResponse DescribeHistoryScale(DescribeHistoryScaleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHistoryScaleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHistoryScaleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHistoryScale"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query real-time network status for the last 24 hours according to `sdkappid`, including upstream and downstream packet losses. The query time range cannot exceed 1 hour.
     * @param req DescribeRealtimeNetworkRequest
     * @return DescribeRealtimeNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeNetworkResponse DescribeRealtimeNetwork(DescribeRealtimeNetworkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealtimeNetworkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeNetworkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealtimeNetwork"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query real-time quality data for the last 24 hours according to `sdkappid`, including the room entry success rate, instant playback rate of the first frame, audio lag rate, and video lag rate. The query time range cannot exceed 1 hour.
     * @param req DescribeRealtimeQualityRequest
     * @return DescribeRealtimeQualityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeQualityResponse DescribeRealtimeQuality(DescribeRealtimeQualityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealtimeQualityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeQualityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealtimeQuality"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the real-time scale for the last 24 hours according to `sdkappid`. The query time range cannot exceed 1 hour.
     * @param req DescribeRealtimeScaleRequest
     * @return DescribeRealtimeScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeScaleResponse DescribeRealtimeScale(DescribeRealtimeScaleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealtimeScaleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeScaleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealtimeScale"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the room list for the last 5 days according to `sdkappid`. It returns 10 calls by default and up to 100 calls at a time.
     * @param req DescribeRoomInformationRequest
     * @return DescribeRoomInformationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomInformationResponse DescribeRoomInformation(DescribeRoomInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomInformationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomInformationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRoomInformation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove all users from a room and dismiss the room. It supports all platforms. For Android, iOS, Windows, and macOS, the TRTC SDK needs to be upgraded to v6.6 or above.
     * @param req DismissRoomRequest
     * @return DismissRoomResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomResponse DismissRoom(DismissRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DismissRoomResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DismissRoomResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DismissRoom"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove a user from a room. It is applicable to scenarios where the anchor, room owner, or admin wants to kick out a user. It supports all platforms. For Android, iOS, Windows, and macOS, the TRTC SDK needs to be upgraded to v6.6 or above.
     * @param req RemoveUserRequest
     * @return RemoveUserResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserResponse RemoveUser(RemoveUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
