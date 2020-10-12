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
     *This API is used to create exception information.
     * @param req CreateTroubleInfoRequest
     * @return CreateTroubleInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateTroubleInfoResponse CreateTroubleInfo(CreateTroubleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTroubleInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTroubleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTroubleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query exception occurrences under a specified `SDKAppID` and return the exception ID and possible causes. It queries data in last 5 days, and the query period is up to 1 hour which can start and end on different days. For more information about exceptions, please see the exception ID mapping table: https://intl.cloud.tencent.com/document/product/647/37906
     * @param req DescribeAbnormalEventRequest
     * @return DescribeAbnormalEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalEventResponse DescribeAbnormalEvent(DescribeAbnormalEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query user list and call quality data within a specified time. It queries data in last 14 days. When `DataType` is not null, real-time data of up to 1 hour and up to 6 users can be queried. The query period can start and end on different days. When `DataType` and all `UserId`s are null, data of 6 users will be queried by default. Data of up to 100 users can be displayed on one page (`PageSize` is up to 100).
     * @param req DescribeCallDetailRequest
     * @return DescribeCallDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallDetailResponse DescribeCallDetail(DescribeCallDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCallDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCallDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCallDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a user’s activity details such as room entry/exit and video enablement/disablement during a call. It can query data for the last 14 days.
     * @param req DescribeDetailEventRequest
     * @return DescribeDetailEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetailEventResponse DescribeDetailEvent(DescribeDetailEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDetailEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDetailEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDetailEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the daily numbers of rooms and users under a specified `SDKAppID`. It can query data once per minute for the last 14 days. If a day has not ended, the numbers of rooms and users on the day cannot be queried.
     * @param req DescribeHistoryScaleRequest
     * @return DescribeHistoryScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryScaleResponse DescribeHistoryScale(DescribeHistoryScaleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHistoryScaleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHistoryScaleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHistoryScale");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeNetworkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealtimeNetwork");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeQualityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealtimeQuality");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeScaleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealtimeScale");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the room list under a specified `SDKAppID`. It returns 10 calls by default and up to 100 calls at a time. It can query data for the last 14 days.
     * @param req DescribeRoomInformationRequest
     * @return DescribeRoomInformationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomInformationResponse DescribeRoomInformation(DescribeRoomInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomInformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomInformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoomInformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DismissRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DismissRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable On-Cloud MixTranscoding and specify the layout position of each channel of video image in the mixed video image.

There may be multiple channels of audio/video streams in a TRTC room. You can call this API to request the Tencent Cloud server to combine multiple channels of video images into one channel, specify the position of each channel, and mix the multiple channels of audio so as to output one channel of audio/video stream for easier recording and live streaming.

You can use this API to perform the following operations:
- Set the image and audio quality parameters of the final live stream, including video resolution, video bitrate, video frame rate, and audio quality.
- Set the image layout, i.e., positions of all channels of images. You only need to set the layout once when enabling On-Cloud MixTranscoding, and the layout engine will automatically arrange the video images in the configured layout in subsequent operations.
- Set the recording file name for future playback.
- Set the CDN live stream ID for live streaming over CDN.

Currently, the following layout templates are supported:
- Floating template: the entire screen will be covered by the video image of the first user who enters the room, and the video images of other users will be displayed as small images in horizontal rows from the bottom-left corner in room entry sequence. The screen can contain up to 4 rows with 4 small images each row, which float over the big image. Up to 1 big image and 15 small images are supported. If a user sends audio only, the user will still use an image spot.
- Grid template: the screen is divided into user video images with the same dimensions. The more the users, the smaller the image dimensions. Up to 16 images are supported. If a user sends audio only, the user will still use an image spot.
- Screen sharing template: it is suitable for video conferencing and online education. The shared screen (or camera of the anchor) is always displayed in the big image on the left of the screen, and the video images of other users are vertically displayed on the right in up to 2 columns with up to 8 small images in each column. Up to 1 big image and 15 small images are supported. If width and height of the upstream image’s resolution don’t match those of the output image, the big image on the left will be scaled to display it as a whole, while the small images on the right will be cropped.
- Picture-in-picture template: it is suitable for mixing a pair of big/small images or a big image with the audio of other users. The small image floats over the big image, and the users in the big/small images and the display position of the small image can be specified.
     * @param req StartMCUMixTranscodeRequest
     * @return StartMCUMixTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public StartMCUMixTranscodeResponse StartMCUMixTranscode(StartMCUMixTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMCUMixTranscodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartMCUMixTranscodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartMCUMixTranscode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to end On-Cloud MixTranscoding.
     * @param req StopMCUMixTranscodeRequest
     * @return StopMCUMixTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public StopMCUMixTranscodeResponse StopMCUMixTranscode(StopMCUMixTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMCUMixTranscodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopMCUMixTranscodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopMCUMixTranscode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
