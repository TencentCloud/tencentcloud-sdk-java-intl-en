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
     *### API description
This API is used to start an on-cloud recording task. It records the audio and video streams in a room and saves them to the specified cloud storage. You can use this API to record the streams in a room separately, or you can mix the streams first and then record the mixed stream.

### You can use this API to perform the following operations:
* Specify the anchors whose streams you want or do not want to record by using the `RecordParams` parameter
* Specify the storage service you want to save recording files to by using the `StorageParams` parameter
* Specify transcoding settings for mixed-stream recording, including video resolution, video bitrate, frame rate, and audio quality, by using `MixTranscodeParams`
* Specify the layout of different videos in mixed-stream recording mode or select an auto-arranged layout template

### Key concepts
* Single-stream recording: Record the audio and video of each subscribed user (`UserId`) in a room and save the recording files (M3U8/TS) to the cloud
* Mixed-stream recording: Mix the audios and videos of subscribed users (`UserId`) in a room, record the mixed stream, and save the recording files (M3U8/TS) to the cloud
     * @param req CreateCloudRecordingRequest
     * @return CreateCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudRecordingResponse CreateCloudRecording(CreateCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudRecording");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a recording task. It works only when a task is in progress. If the task has already ended when this API is called, an error will be returned. If a task is stopped successfully, but the uploading of recording files has not completed, the backend will continue to upload the files and will notify you via a callback when the upload is completed.
     * @param req DeleteCloudRecordingRequest
     * @return DeleteCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudRecordingResponse DeleteCloudRecording(DeleteCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudRecording");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status of a recording task after it starts. It works only when a task is in progress. If the task has already ended when this API is called, an error will be returned.
     * @param req DescribeCloudRecordingRequest
     * @return DescribeCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRecordingResponse DescribeCloudRecording(DescribeCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudRecording");
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
     *This API is used to modify a recording task. It works only when a task is in progress. If the task has already ended when this API is called, an error will be returned. You need to specify all the parameters for each request instead of just the ones you want to modify.
     * @param req ModifyCloudRecordingRequest
     * @return ModifyCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudRecordingResponse ModifyCloudRecording(ModifyCloudRecordingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudRecordingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudRecordingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudRecording");
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

}
