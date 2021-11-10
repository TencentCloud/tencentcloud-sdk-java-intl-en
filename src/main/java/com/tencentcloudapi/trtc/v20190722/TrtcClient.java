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
    private static String service = "trtc";
    private static String version = "2019-07-22";

    public TrtcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrtcClient(Credential credential, String region, ClientProfile profile) {
        super(TrtcClient.endpoint, TrtcClient.version, credential, region, profile);
    }

    /**
     *This API is used to add custom background or watermark images during [On-Cloud MixTranscoding](https://intl.cloud.tencent.com/document/product/647/16827?from_cn_redirect=1). If you do not need to add such images frequently, we recommend you add them in the console via **Application Management** > **[Material Management](https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1)**.
     * @param req CreatePictureRequest
     * @return CreatePictureResponse
     * @throws TencentCloudSDKException
     */
    public CreatePictureResponse CreatePicture(CreatePictureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePictureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePictureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePicture");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
     *This API is used to delete custom background or watermark images during [On-Cloud MixTranscoding](https://intl.cloud.tencent.com/document/product/647/16827?from_cn_redirect=1). If you do not need to delete such images frequently, we recommend you delete them in the console via **Application Management** > **[Material Management](https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1)**.
     * @param req DeletePictureRequest
     * @return DeletePictureResponse
     * @throws TencentCloudSDKException
     */
    public DeletePictureResponse DeletePicture(DeletePictureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePictureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePictureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePicture");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query exception occurrences under a specified `SDKAppID` and return the exception IDs and possible causes. It queries data in last 15 days, and the query period is up to 1 hour, which can start and end on different days. For more information about exceptions, please see the exception event ID mapping table: https://intl.cloud.tencent.com/document/product/647/37906.
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
     *This API is used to query the user list and call quality data of a specified time range in the last 14 days. When `DataType` is not null, data of up to 6 users during a period of up to 1 hour can be queried each time, and the period can start on one day and end on the next. When `DataType` and `UserIds` are null, 6 users are queried by default, and data of up to 100 users can be displayed on each page (`PageSize` set to 100 or smaller). This API is used to query call quality and is not recommended for billing.
**Note**: You can use this API to query or check historical data, but not for real-time key business logic.
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
     *This API is used to query the information of custom background or watermark images during [On-Cloud MixTranscoding](https://intl.cloud.tencent.com/document/product/647/16827?from_cn_redirect=1). If you do not need to query such information frequently, we recommend you query it in the console via **Application Management** > **[Material Management](https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1)**.
     * @param req DescribePictureRequest
     * @return DescribePictureResponse
     * @throws TencentCloudSDKException
     */
    public DescribePictureResponse DescribePicture(DescribePictureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePictureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePictureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePicture");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query billable on-cloud recording durations.

- If the period queried is 1 day or shorter, the statistics returned are on a 5-minute basis. If the period queried is longer than 1 day, the statistics returned are on a daily basis.
- The period queried in a request cannot be longer than 31 days.
- If you query the statistics of the current day, the statistics returned may be inaccurate due to the delay in data collection.
- In the daily pay-as-you-go mode, bills for a day are generated the next morning. Therefore, we recommend you query the statistics after 9 AM the next day.
     * @param req DescribeRecordStatisticRequest
     * @return DescribeRecordStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordStatisticResponse DescribeRecordStatistic(DescribeRecordStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordStatisticResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordStatisticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordStatistic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the room list of an `SDKAppID` in the last 14 days. It returns 10 calls by default and can return up to 100 calls per query.
**Note**: You can use this API to query or check historical data, but not for real-time key business logic.
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
     *This API is used to query billable audio/video interaction durations.
- If the period queried is 1 day or shorter, the statistics returned are on a 5-minute basis. If the period queried is longer than 1 day, the statistics returned are on a daily basis.
- The period queried in a request cannot be longer than 31 days.
- If you query the statistics of the current day, the statistics returned may be inaccurate due to the delay in data collection.
- In the daily pay-as-you-go mode, bills for a day are generated the next morning. Therefore, we recommend you query the statistics after 9 AM the next day.
     * @param req DescribeTrtcInteractiveTimeRequest
     * @return DescribeTrtcInteractiveTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrtcInteractiveTimeResponse DescribeTrtcInteractiveTime(DescribeTrtcInteractiveTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrtcInteractiveTimeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrtcInteractiveTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrtcInteractiveTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query billable relaying and transcoding durations.
- If the period queried is 1 day or shorter, the statistics returned are on a 5-minute basis. If the period queried is longer than 1 day, the statistics returned are on a daily basis.
- The period queried in a request cannot be longer than 31 days.
- If you query the statistics of the current day, the statistics returned may be inaccurate due to the delay in data collection.
- In the daily pay-as-you-go mode, bills for a day are generated the next morning. Therefore, we recommend you query the statistics after 9 AM the next day.
     * @param req DescribeTrtcMcuTranscodeTimeRequest
     * @return DescribeTrtcMcuTranscodeTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrtcMcuTranscodeTimeResponse DescribeTrtcMcuTranscodeTime(DescribeTrtcMcuTranscodeTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrtcMcuTranscodeTimeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrtcMcuTranscodeTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrtcMcuTranscodeTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the user list of a specified time range (up to 4 hours) in the last 14 days. Data of 6 users is displayed on each page by default, and data of up to 100 users can be displayed on each page (`PageSize` set to 100 or smaller).
**Note**: You can use this API to query or check historical data, but not for real-time key business logic.
     * @param req DescribeUserInformationRequest
     * @return DescribeUserInformationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInformationResponse DescribeUserInformation(DescribeUserInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserInformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserInformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserInformation");
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
     *This API is used to remove all users from a room and close the room. It works on all platforms. For Android, iOS, Windows, and macOS, you need to update the TRTC SDK to version 6.6 or above.
     * @param req DismissRoomByStrRoomIdRequest
     * @return DismissRoomByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomByStrRoomIdResponse DismissRoomByStrRoomId(DismissRoomByStrRoomIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DismissRoomByStrRoomIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DismissRoomByStrRoomIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DismissRoomByStrRoomId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify custom background or watermark images during [On-Cloud MixTranscoding](https://intl.cloud.tencent.com/document/product/647/16827?from_cn_redirect=1). If you do not need to modify such images frequently, we recommend you modify them in the console via **Application Management** > **[Material Management](https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1)**.
     * @param req ModifyPictureRequest
     * @return ModifyPictureResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPictureResponse ModifyPicture(ModifyPictureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPictureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPictureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPicture");
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
     *This API is used to remove a user from a room. It allows the anchor, room owner, or admin to kick out a user, and works on all platforms. For Android, iOS, Windows, and macOS, you need to update the TRTC SDK to version 6.6 or above.
     * @param req RemoveUserByStrRoomIdRequest
     * @return RemoveUserByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserByStrRoomIdResponse RemoveUserByStrRoomId(RemoveUserByStrRoomIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserByStrRoomIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserByStrRoomIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUserByStrRoomId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable On-Cloud MixTranscoding and specify the position of each channel of image in stream mixing.

There may be multiple audio/video streams in a TRTC room. You can call this API to request the Tencent Cloud server to mix the audio and video and specify the position of each image to produce just one audio/video stream for recording and playback. The mixing stops automatically after a room is terminated.

You can use this API to perform the following operations:
- Set image and audio quality parameters of the final live stream, including video resolution, video bitrate, video frame rate, and audio quality.
- Set the layout, i.e., the position of each image. You only need to set it once when enabling On-Cloud MixTranscoding, and the layout engine will automatically arrange images as configured.
- Set the names of recording files for future playback.
- Set the stream ID for CDN live streaming.

Currently, On-Cloud MixTranscoding supports the following layout templates:
- Floating: The entire screen is covered by the video image of the first user who enters the room, and the images of other users are displayed as small images in rows in the bottom-left corner in room entry sequence. The screen allows up to 4 rows of 4 small images, which float over the big image. Up to 1 big image and 15 small images can be displayed. A user sending audio only will still occupy an image spot.
- Grid: The images of all users split the entire screen evenly. The more users, the smaller the image dimensions. Up to 16 images can be displayed. A user sending audio only will still occupy an image spot.
- Screen sharing: This is designed for video conferencing and online education. The shared screen (or camera image of the anchor) is always displayed as the big image, which occupies the left half of the screen, and the images of other users occupy the right half in up to 2 columns of up to 8 small images each. Up to 1 big image and 15 small images can be displayed. If the upstream aspect ratio does not match the output, the big image on the left will be scaled and displayed in whole, while the small images on the right will be cropped.
- Picture-in-picture: This template mixes the big and small images or big image of a user with the audio of other users. The small image floats over the big image. You can specify the user whose small and big images are displayed, as well as the position of the small image. This template can display at most 2 images.
- Custom: This is designed for cases where you want to specify the image positions of users in the mixed stream or preset image positions. If users are assigned to preset positions, the layout engine will reserve the positions for the users; if not, users will occupy the positions in room entry sequence. Once all preset positions are occupied, TRTC will stop mixing the audio and video of other users. If the place-holding feature is enabled for a custom template (by setting `PlaceHolderMode` in `LayoutParams` to `1`) and a user for whom a place is held is not sending video, the position will show the specified placeholder image (`PlaceImageId`).

Notes:
1. **As On-Cloud MixTranscoding is a paid feature, you will be charged for calling this API. For details, see [Billing of On-Cloud MixTranscoding](https://intl.cloud.tencent.com/document/product/647/49446?from_cn_redirect=1).**
2. You can call this API only if your application is created on or after January 9, 2020. Applications created before use the stream mixing service of CSS by default. If you want to switch to MCU On-Cloud MixTranscoding, please [submit a ticket](https://console.cloud.tencent.com/workorder/category).
3. You cannot use the server and client stream mixing APIs at the same time.
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
     *This API is used to enable On-Cloud MixTranscoding and specify the position of each channel of image in stream mixing.

There may be multiple channels of audio/video streams in a TRTC room. You can call this API to request the Tencent Cloud server to mix multiple channels of video images and audio into one channel and specify the position of each image so as to produce only one channel of audio/video stream for recording and live streaming.

You can use this API to perform the following operations:
- Set image and audio quality parameters of the mixed stream, including video resolution, bitrate, frame rate, and audio quality.
- Set the layout, i.e., the position of each channel of image. You only need to set it once when enabling On-Cloud MixTranscoding, and the layout engine will automatically arrange images as configured.
- Set the names of recording files for future playback.
- Set the stream ID for CDN live streaming.

Currently, On-Cloud MixTranscoding supports the following layout templates:
- Floating: the entire screen is covered by the video image of the first user who enters the room, and the images of other users are displayed as small images in horizontal rows in the bottom-left corner in room entry sequence. The screen can accommodate up to 4 rows of 4 small images, which float over the big image. Up to 1 big image and 15 small images can be displayed. A user sending audio only will still occupy an image spot.
- Grid: the images of all users split the screen evenly. The more the users, the smaller the image dimensions. Up to 16 images can be displayed. A user sending audio only will still occupy an image spot.
- Screen sharing: this template is designed for video conferencing and online classes. The shared screen (or camera image of the anchor) is always displayed as the big image, which occupies the left half of the screen, and the images of other users occupy the right half in up to 2 columns of a maximum of 8 small images each. Up to 1 big image and 15 small images can be displayed. If the aspect ratio of upstream images does not match that of output images, the big image on the left will be scaled and displayed in whole, while the small images on the right will be cropped.
- Picture-in-picture: this template mixes the big and small images or big image of a user with the audio of other users. The small image floats over the big image. You can specify the user whose big and small images are displayed and the position of the small image.
- Custom: you can use custom templates to specify the image positions of users in mixed streams or preset image positions. If users are assigned to preset positions, the layout engine will reserve the positions for the users; if not, users will occupy the positions in room entry sequence. Once all preset positions are occupied, TRTC will stop mixing the audio and images of other users. If the placeholding feature is enabled for a custom template (`PlaceHolderMode` in `LayoutParams` is set to 1), but a user for whom a place is reserved is not sending video data, the position will show the corresponding placeholder image (`PlaceImageId`).

Notes:
1. **As On-Cloud MixTranscoding is a paid feature, you will be charged for calling this API. For details, see [Billing of On-Cloud MixTranscoding](https://intl.cloud.tencent.com/document/product/647/49446?from_cn_redirect=1).**
2. You can call this API only if your application is created on or after January 9, 2020. Applications created before use the stream mixing service of CSS by default. If you want to switch to MCU On-Cloud MixTranscoding, please [submit a ticket](https://console.cloud.tencent.com/workorder/category).
3. You cannot use the server and client stream mixing APIs at the same time.
     * @param req StartMCUMixTranscodeByStrRoomIdRequest
     * @return StartMCUMixTranscodeByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public StartMCUMixTranscodeByStrRoomIdResponse StartMCUMixTranscodeByStrRoomId(StartMCUMixTranscodeByStrRoomIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMCUMixTranscodeByStrRoomIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartMCUMixTranscodeByStrRoomIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartMCUMixTranscodeByStrRoomId");
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

    /**
     *This API is used to stop On-Cloud MixTranscoding.
     * @param req StopMCUMixTranscodeByStrRoomIdRequest
     * @return StopMCUMixTranscodeByStrRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public StopMCUMixTranscodeByStrRoomIdResponse StopMCUMixTranscodeByStrRoomId(StopMCUMixTranscodeByStrRoomIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMCUMixTranscodeByStrRoomIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopMCUMixTranscodeByStrRoomIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopMCUMixTranscodeByStrRoomId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
