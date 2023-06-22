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
    private static String endpoint = "lcic.tencentcloudapi.com";
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
        JsonResponseModel<AddGroupMemberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add users to multiple groups at a time.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchAddGroupMemberRequest
     * @return BatchAddGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchAddGroupMemberResponse BatchAddGroupMember(BatchAddGroupMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchAddGroupMemberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchAddGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchAddGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create multiple groups at a time.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchCreateGroupWithMembersRequest
     * @return BatchCreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateGroupWithMembersResponse BatchCreateGroupWithMembers(BatchCreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchCreateGroupWithMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchCreateGroupWithMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchCreateGroupWithMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create multiple rooms at a time.
     * @param req BatchCreateRoomRequest
     * @return BatchCreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateRoomResponse BatchCreateRoom(BatchCreateRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchCreateRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchCreateRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchCreateRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove users from multiple groups at a time.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchDeleteGroupMemberRequest
     * @return BatchDeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteGroupMemberResponse BatchDeleteGroupMember(BatchDeleteGroupMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteGroupMemberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the recordings of multiple rooms.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchDeleteRecordRequest
     * @return BatchDeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteRecordResponse BatchDeleteRecord(BatchDeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get courseware information.
     * @param req BatchDescribeDocumentRequest
     * @return BatchDescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeDocumentResponse BatchDescribeDocument(BatchDescribeDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDescribeDocumentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDescribeDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDescribeDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to register multiple users (up to 1,000) at a time. If a user ID already exists, the existing one will be overwritten.
A maximum of 20 requests can be initiated per second for this API.
     * @param req BatchRegisterRequest
     * @return BatchRegisterResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterResponse BatchRegister(BatchRegisterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchRegisterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchRegisterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchRegister");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a document to a room.
     * @param req BindDocumentToRoomRequest
     * @return BindDocumentToRoomResponse
     * @throws TencentCloudSDKException
     */
    public BindDocumentToRoomResponse BindDocumentToRoom(BindDocumentToRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindDocumentToRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindDocumentToRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindDocumentToRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a document to be used in a room.
     * @param req CreateDocumentRequest
     * @return CreateDocumentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocumentResponse CreateDocument(CreateDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDocumentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *his API is used to create a group and specify its members.
A maximum of 20 requests can be initiated per second for this API.
     * @param req CreateGroupWithMembersRequest
     * @return CreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithMembersResponse CreateGroupWithMembers(CreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupWithMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupWithMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroupWithMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to merge groups.
A maximum of 20 requests can be initiated per second for this API.
     * @param req CreateGroupWithSubGroupRequest
     * @return CreateGroupWithSubGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithSubGroupResponse CreateGroupWithSubGroup(CreateGroupWithSubGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupWithSubGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupWithSubGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroupWithSubGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req CreateRoomRequest
     * @return CreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoomResponse CreateRoom(CreateRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a spectator.
     * @param req CreateSupervisorRequest
     * @return CreateSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public CreateSupervisorResponse CreateSupervisor(CreateSupervisorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSupervisorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSupervisorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSupervisor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the custom elements. The `Scenes` parameter specifies the custom elements to delete. If `Scenes` is empty, all custom elements will be deleted.
     * @param req DeleteAppCustomContentRequest
     * @return DeleteAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppCustomContentResponse DeleteAppCustomContent(DeleteAppCustomContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAppCustomContentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAppCustomContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAppCustomContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a document.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteDocumentRequest
     * @return DeleteDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocumentResponse DeleteDocument(DeleteDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDocumentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or multiple groups.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove users from a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteGroupMemberRequest
     * @return DeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupMemberResponse DeleteGroupMember(DeleteGroupMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupMemberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This example shows you how to delete the recording files of a specific room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a room.
     * @param req DeleteRoomRequest
     * @return DeleteRoomResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoomResponse DeleteRoom(DeleteRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete spectators.
     * @param req DeleteSupervisorRequest
     * @return DeleteSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSupervisorResponse DeleteSupervisor(DeleteSupervisorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSupervisorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSupervisorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSupervisor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the answers to a quiz question in a room.
     * @param req DescribeAnswerListRequest
     * @return DescribeAnswerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnswerListResponse DescribeAnswerList(DescribeAnswerListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAnswerListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAnswerListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAnswerList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the user list of a room. This API will not work if a room has ended or expired.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeCurrentMemberListRequest
     * @return DescribeCurrentMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentMemberListResponse DescribeCurrentMemberList(DescribeCurrentMemberListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCurrentMemberListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCurrentMemberListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCurrentMemberList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get developer information.
     * @param req DescribeDeveloperRequest
     * @return DescribeDeveloperResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeveloperResponse DescribeDeveloper(DescribeDeveloperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeveloperResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeveloperResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeveloper");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a specific document.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeDocumentRequest
     * @return DescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentResponse DescribeDocument(DescribeDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *有新接口替换

A new API is offered for this action now.

This API is used to query courseware. It has been deprecated. Please use `BatchDescribeDocument` instead.
     * @param req DescribeDocumentsRequest
     * @return DescribeDocumentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsResponse DescribeDocuments(DescribeDocumentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDocumentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDocuments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the document list of a specific room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeDocumentsByRoomRequest
     * @return DescribeDocumentsByRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsByRoomResponse DescribeDocumentsByRoom(DescribeDocumentsByRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentsByRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDocumentsByRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDocumentsByRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the details of a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query groups.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeGroupListRequest
     * @return DescribeGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupListResponse DescribeGroupList(DescribeGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the members of a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeGroupMemberListRequest
     * @return DescribeGroupMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupMemberListResponse DescribeGroupMemberList(DescribeGroupMemberListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupMemberListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupMemberListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupMemberList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the quiz details of a room.
     * @param req DescribeQuestionListRequest
     * @return DescribeQuestionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuestionListResponse DescribeQuestionList(DescribeQuestionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQuestionListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQuestionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQuestionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get room information.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeRoomRequest
     * @return DescribeRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomResponse DescribeRoom(DescribeRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the statistics of a room. It can be called only after the room is ended.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeRoomStatisticsRequest
     * @return DescribeRoomStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomStatisticsResponse DescribeRoomStatistics(DescribeRoomStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoomStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the user list of a specific application.
A maximum of 20 requests can be initiated per second for this API.
     * @param req DescribeSdkAppIdUsersRequest
     * @return DescribeSdkAppIdUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSdkAppIdUsersResponse DescribeSdkAppIdUsers(DescribeSdkAppIdUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSdkAppIdUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSdkAppIdUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSdkAppIdUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the spectators of a room.
     * @param req DescribeSupervisorsRequest
     * @return DescribeSupervisorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupervisorsResponse DescribeSupervisors(DescribeSupervisorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSupervisorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSupervisorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSupervisors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain user profile.
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to end a room.
     * @param req EndRoomRequest
     * @return EndRoomResponse
     * @throws TencentCloudSDKException
     */
    public EndRoomResponse EndRoom(EndRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EndRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EndRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EndRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the events of a room. It only works within one hour after a class ends.
     * @param req GetRoomEventRequest
     * @return GetRoomEventResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomEventResponse GetRoomEvent(GetRoomEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoomEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoomEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRoomEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the message history of a room (room messages are retained for seven days).
     * @param req GetRoomMessageRequest
     * @return GetRoomMessageResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomMessageResponse GetRoomMessage(GetRoomMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoomMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoomMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRoomMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the room list.
     * @param req GetRoomsRequest
     * @return GetRoomsResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomsResponse GetRooms(GetRoomsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoomsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoomsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRooms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get watermark settings.
A maximum of 20 requests can be initiated per second for this API.
     * @param req GetWatermarkRequest
     * @return GetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public GetWatermarkResponse GetWatermark(GetWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetWatermarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove a user from the room.
     * @param req KickUserFromRoomRequest
     * @return KickUserFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public KickUserFromRoomResponse KickUserFromRoom(KickUserFromRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KickUserFromRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<KickUserFromRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KickUserFromRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to log in with an origin account, which is the `originId` entered during registration.
     * @param req LoginOriginIdRequest
     * @return LoginOriginIdResponse
     * @throws TencentCloudSDKException
     */
    public LoginOriginIdResponse LoginOriginId(LoginOriginIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LoginOriginIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LoginOriginIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LoginOriginId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to log in.
     * @param req LoginUserRequest
     * @return LoginUserResponse
     * @throws TencentCloudSDKException
     */
    public LoginUserResponse LoginUser(LoginUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LoginUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LoginUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LoginUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an application.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a group.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a room.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyRoomRequest
     * @return ModifyRoomResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoomResponse ModifyRoom(ModifyRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a user profile such as the nickname and profile photo.
A maximum of 20 requests can be initiated per second for this API.
     * @param req ModifyUserProfileRequest
     * @return ModifyUserProfileResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserProfileResponse ModifyUserProfile(ModifyUserProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to register a user.
     * @param req RegisterUserRequest
     * @return RegisterUserResponse
     * @throws TencentCloudSDKException
     */
    public RegisterUserResponse RegisterUser(RegisterUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set or update the custom content of an application, including the application icon and custom code. After you update JS and CSS content, you also need to call this API for the updates to take effect.
     * @param req SetAppCustomContentRequest
     * @return SetAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public SetAppCustomContentResponse SetAppCustomContent(SetAppCustomContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAppCustomContentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetAppCustomContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAppCustomContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to configure watermarks.
A maximum of 20 requests can be initiated per second for this API.
     * @param req SetWatermarkRequest
     * @return SetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public SetWatermarkResponse SetWatermark(SetWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWatermarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a room. Before you call this API, make sure a user has entered the room so that the class is initialized.
     * @param req StartRoomRequest
     * @return StartRoomResponse
     * @throws TencentCloudSDKException
     */
    public StartRoomResponse StartRoom(StartRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind a document from a room.
     * @param req UnbindDocumentFromRoomRequest
     * @return UnbindDocumentFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDocumentFromRoomResponse UnbindDocumentFromRoom(UnbindDocumentFromRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindDocumentFromRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindDocumentFromRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindDocumentFromRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
