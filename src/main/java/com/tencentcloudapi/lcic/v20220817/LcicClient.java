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
package com.tencentcloudapi.lcic.v20220817;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lcic.v20220817.models.*;

public class LcicClient extends AbstractClient{
    private static String endpoint = "lcic.intl.tencentcloudapi.com";
    private static String service = "lcic";
    private static String version = "2022-08-17";
    
    public LcicClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LcicClient(Credential credential, String region, ClientProfile profile) {
        super(LcicClient.endpoint, LcicClient.version, credential, region, profile);
    }

    /**
     *This API is used to add users to a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req AddGroupMemberRequest
     * @return AddGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public AddGroupMemberResponse AddGroupMember(AddGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddGroupMember", AddGroupMemberResponse.class);
    }

    /**
     *This API is used to add users to multiple groups at a time.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchAddGroupMemberRequest
     * @return BatchAddGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchAddGroupMemberResponse BatchAddGroupMember(BatchAddGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchAddGroupMember", BatchAddGroupMemberResponse.class);
    }

    /**
     *This API is used to create multiple groups at a time.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchCreateGroupWithMembersRequest
     * @return BatchCreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateGroupWithMembersResponse BatchCreateGroupWithMembers(BatchCreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateGroupWithMembers", BatchCreateGroupWithMembersResponse.class);
    }

    /**
     *This API is used to create multiple rooms at a time.
     * @param req BatchCreateRoomRequest
     * @return BatchCreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateRoomResponse BatchCreateRoom(BatchCreateRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateRoom", BatchCreateRoomResponse.class);
    }

    /**
     *This API is used to remove users from multiple groups at a time.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchDeleteGroupMemberRequest
     * @return BatchDeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteGroupMemberResponse BatchDeleteGroupMember(BatchDeleteGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteGroupMember", BatchDeleteGroupMemberResponse.class);
    }

    /**
     *This API is used to delete the recordings of multiple rooms.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchDeleteRecordRequest
     * @return BatchDeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteRecordResponse BatchDeleteRecord(BatchDeleteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteRecord", BatchDeleteRecordResponse.class);
    }

    /**
     *This API is used to get courseware information.
     * @param req BatchDescribeDocumentRequest
     * @return BatchDescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeDocumentResponse BatchDescribeDocument(BatchDescribeDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDescribeDocument", BatchDescribeDocumentResponse.class);
    }

    /**
     *This API is used to register multiple users (up to 1,000) at a time. If a user ID already exists, the existing one will be overwritten.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchRegisterRequest
     * @return BatchRegisterResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterResponse BatchRegister(BatchRegisterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRegister", BatchRegisterResponse.class);
    }

    /**
     *This API is used to bind a document to a room.
     * @param req BindDocumentToRoomRequest
     * @return BindDocumentToRoomResponse
     * @throws TencentCloudSDKException
     */
    public BindDocumentToRoomResponse BindDocumentToRoom(BindDocumentToRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDocumentToRoom", BindDocumentToRoomResponse.class);
    }

    /**
     *This API is used to create a document to be used in a room.
     * @param req CreateDocumentRequest
     * @return CreateDocumentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocumentResponse CreateDocument(CreateDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDocument", CreateDocumentResponse.class);
    }

    /**
     *his API is used to create a group and specify its members.
A maximum of 20 requests can be initiated per second for this API.
     * @param req CreateGroupWithMembersRequest
     * @return CreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithMembersResponse CreateGroupWithMembers(CreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroupWithMembers", CreateGroupWithMembersResponse.class);
    }

    /**
     *This API is used to merge groups.
A maximum of 20 requests can be initiated per second for this API.
     * @param req CreateGroupWithSubGroupRequest
     * @return CreateGroupWithSubGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithSubGroupResponse CreateGroupWithSubGroup(CreateGroupWithSubGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroupWithSubGroup", CreateGroupWithSubGroupResponse.class);
    }

    /**
     *This API is used to create a room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req CreateRoomRequest
     * @return CreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoomResponse CreateRoom(CreateRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoom", CreateRoomResponse.class);
    }

    /**
     *This API is used to create a spectator.
     * @param req CreateSupervisorRequest
     * @return CreateSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public CreateSupervisorResponse CreateSupervisor(CreateSupervisorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSupervisor", CreateSupervisorResponse.class);
    }

    /**
     *This API is used to delete the custom elements. The `Scenes` parameter specifies the custom elements to delete. If `Scenes` is empty, all custom elements will be deleted.
     * @param req DeleteAppCustomContentRequest
     * @return DeleteAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppCustomContentResponse DeleteAppCustomContent(DeleteAppCustomContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAppCustomContent", DeleteAppCustomContentResponse.class);
    }

    /**
     *This API is used to delete a document.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteDocumentRequest
     * @return DeleteDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocumentResponse DeleteDocument(DeleteDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDocument", DeleteDocumentResponse.class);
    }

    /**
     *This API is used to delete one or multiple groups.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *This API is used to remove users from a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteGroupMemberRequest
     * @return DeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupMemberResponse DeleteGroupMember(DeleteGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroupMember", DeleteGroupMemberResponse.class);
    }

    /**
     *This example shows you how to delete the recording files of a specific room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecord", DeleteRecordResponse.class);
    }

    /**
     *This API is used to delete a room.
     * @param req DeleteRoomRequest
     * @return DeleteRoomResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoomResponse DeleteRoom(DeleteRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoom", DeleteRoomResponse.class);
    }

    /**
     *This API is used to delete spectators.
     * @param req DeleteSupervisorRequest
     * @return DeleteSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSupervisorResponse DeleteSupervisor(DeleteSupervisorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSupervisor", DeleteSupervisorResponse.class);
    }

    /**
     *This API is used to get the answers to a quiz question in a room.
     * @param req DescribeAnswerListRequest
     * @return DescribeAnswerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnswerListResponse DescribeAnswerList(DescribeAnswerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAnswerList", DescribeAnswerListResponse.class);
    }

    /**
     *This API is used to get the user list of a room. This API will not work if a room has ended or expired.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeCurrentMemberListRequest
     * @return DescribeCurrentMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentMemberListResponse DescribeCurrentMemberList(DescribeCurrentMemberListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurrentMemberList", DescribeCurrentMemberListResponse.class);
    }

    /**
     *This API is used to get developer information.
     * @param req DescribeDeveloperRequest
     * @return DescribeDeveloperResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeveloperResponse DescribeDeveloper(DescribeDeveloperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeveloper", DescribeDeveloperResponse.class);
    }

    /**
     *This API is used to get the information of a specific document.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeDocumentRequest
     * @return DescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentResponse DescribeDocument(DescribeDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocument", DescribeDocumentResponse.class);
    }

    /**
     *A new API is offered for this action now.

This API is used to query courseware. It has been deprecated. Please use `BatchDescribeDocument` instead.
     * @param req DescribeDocumentsRequest
     * @return DescribeDocumentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsResponse DescribeDocuments(DescribeDocumentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocuments", DescribeDocumentsResponse.class);
    }

    /**
     *This API is used to get the document list of a specific room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeDocumentsByRoomRequest
     * @return DescribeDocumentsByRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsByRoomResponse DescribeDocumentsByRoom(DescribeDocumentsByRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocumentsByRoom", DescribeDocumentsByRoomResponse.class);
    }

    /**
     *This API is used to get the details of a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroup", DescribeGroupResponse.class);
    }

    /**
     *This API is used to query groups.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeGroupListRequest
     * @return DescribeGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupListResponse DescribeGroupList(DescribeGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupList", DescribeGroupListResponse.class);
    }

    /**
     *This API is used to get the members of a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeGroupMemberListRequest
     * @return DescribeGroupMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupMemberListResponse DescribeGroupMemberList(DescribeGroupMemberListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupMemberList", DescribeGroupMemberListResponse.class);
    }

    /**
     *This API is used to get the quiz details of a room.
     * @param req DescribeQuestionListRequest
     * @return DescribeQuestionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuestionListResponse DescribeQuestionList(DescribeQuestionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuestionList", DescribeQuestionListResponse.class);
    }

    /**
     *This API is used to get room information.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeRoomRequest
     * @return DescribeRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomResponse DescribeRoom(DescribeRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoom", DescribeRoomResponse.class);
    }

    /**
     *This API is used to obtain the statistics of a room. It can be called only after the room is ended.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeRoomStatisticsRequest
     * @return DescribeRoomStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomStatisticsResponse DescribeRoomStatistics(DescribeRoomStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoomStatistics", DescribeRoomStatisticsResponse.class);
    }

    /**
     *This API is used to get the user list of a specific application.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeSdkAppIdUsersRequest
     * @return DescribeSdkAppIdUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSdkAppIdUsersResponse DescribeSdkAppIdUsers(DescribeSdkAppIdUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSdkAppIdUsers", DescribeSdkAppIdUsersResponse.class);
    }

    /**
     *This API is used to get the spectators of a room.
     * @param req DescribeSupervisorsRequest
     * @return DescribeSupervisorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupervisorsResponse DescribeSupervisors(DescribeSupervisorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupervisors", DescribeSupervisorsResponse.class);
    }

    /**
     *This API is used to obtain user profile.
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUser", DescribeUserResponse.class);
    }

    /**
     *This API is used to end a room.
     * @param req EndRoomRequest
     * @return EndRoomResponse
     * @throws TencentCloudSDKException
     */
    public EndRoomResponse EndRoom(EndRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EndRoom", EndRoomResponse.class);
    }

    /**
     *This API is used to get the events of a room. It only works within one hour after a class ends.
     * @param req GetRoomEventRequest
     * @return GetRoomEventResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomEventResponse GetRoomEvent(GetRoomEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRoomEvent", GetRoomEventResponse.class);
    }

    /**
     *This API is used to get the message history of a room (room messages are retained for seven days).
     * @param req GetRoomMessageRequest
     * @return GetRoomMessageResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomMessageResponse GetRoomMessage(GetRoomMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRoomMessage", GetRoomMessageResponse.class);
    }

    /**
     *This API is used to get the room list.
     * @param req GetRoomsRequest
     * @return GetRoomsResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomsResponse GetRooms(GetRoomsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRooms", GetRoomsResponse.class);
    }

    /**
     *This API is used to get watermark settings.
A maximum of 20 requests can be initiated per second for this API.
     * @param req GetWatermarkRequest
     * @return GetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public GetWatermarkResponse GetWatermark(GetWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWatermark", GetWatermarkResponse.class);
    }

    /**
     *This API is used to remove a user from the room.
     * @param req KickUserFromRoomRequest
     * @return KickUserFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public KickUserFromRoomResponse KickUserFromRoom(KickUserFromRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KickUserFromRoom", KickUserFromRoomResponse.class);
    }

    /**
     *This API is used to log in with an origin account, which is the `originId` entered during registration.
     * @param req LoginOriginIdRequest
     * @return LoginOriginIdResponse
     * @throws TencentCloudSDKException
     */
    public LoginOriginIdResponse LoginOriginId(LoginOriginIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LoginOriginId", LoginOriginIdResponse.class);
    }

    /**
     *This API is used to log in.
     * @param req LoginUserRequest
     * @return LoginUserResponse
     * @throws TencentCloudSDKException
     */
    public LoginUserResponse LoginUser(LoginUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LoginUser", LoginUserResponse.class);
    }

    /**
     *This API is used to modify an application.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApp", ModifyAppResponse.class);
    }

    /**
     *This API is used to modify a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroup", ModifyGroupResponse.class);
    }

    /**
     *This API is used to modify a room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyRoomRequest
     * @return ModifyRoomResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoomResponse ModifyRoom(ModifyRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoom", ModifyRoomResponse.class);
    }

    /**
     *This API is used to modify a user profile such as the nickname and profile photo.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyUserProfileRequest
     * @return ModifyUserProfileResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserProfileResponse ModifyUserProfile(ModifyUserProfileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserProfile", ModifyUserProfileResponse.class);
    }

    /**
     *This API is used to register a user.
     * @param req RegisterUserRequest
     * @return RegisterUserResponse
     * @throws TencentCloudSDKException
     */
    public RegisterUserResponse RegisterUser(RegisterUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterUser", RegisterUserResponse.class);
    }

    /**
     *This API is used to set or update the custom content of an application, including the application icon and custom code. After you update JS and CSS content, you also need to call this API for the updates to take effect.
     * @param req SetAppCustomContentRequest
     * @return SetAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public SetAppCustomContentResponse SetAppCustomContent(SetAppCustomContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAppCustomContent", SetAppCustomContentResponse.class);
    }

    /**
     *This API is used to configure watermarks.
A maximum of 20 requests can be initiated per second for this API.
     * @param req SetWatermarkRequest
     * @return SetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public SetWatermarkResponse SetWatermark(SetWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetWatermark", SetWatermarkResponse.class);
    }

    /**
     *This API is used to start a room. Before you call this API, make sure a user has entered the room so that the class is initialized.
     * @param req StartRoomRequest
     * @return StartRoomResponse
     * @throws TencentCloudSDKException
     */
    public StartRoomResponse StartRoom(StartRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartRoom", StartRoomResponse.class);
    }

    /**
     *This API is used to unbind a document from a room.
     * @param req UnbindDocumentFromRoomRequest
     * @return UnbindDocumentFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDocumentFromRoomResponse UnbindDocumentFromRoom(UnbindDocumentFromRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindDocumentFromRoom", UnbindDocumentFromRoomResponse.class);
    }

}
