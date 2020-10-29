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
package com.tencentcloudapi.msp.v20180319;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.msp.v20180319.models.*;

public class MspClient extends AbstractClient{
    private static String endpoint = "msp.tencentcloudapi.com";
    private static String version = "2018-03-19";

    public MspClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MspClient(Credential credential, String region, ClientProfile profile) {
        super(MspClient.endpoint, MspClient.version, credential, region, profile);
    }

    /**
     *This API is used to cancel the registered migration tasks.
     * @param req DeregisterMigrationTaskRequest
     * @return DeregisterMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterMigrationTaskResponse DeregisterMigrationTask(DeregisterMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeregisterMigrationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeregisterMigrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeregisterMigrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the specified migration task details.
     * @param req DescribeMigrationTaskRequest
     * @return DescribeMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationTaskResponse DescribeMigrationTask(DescribeMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the list of migration project names.
     * @param req ListMigrationProjectRequest
     * @return ListMigrationProjectResponse
     * @throws TencentCloudSDKException
     */
    public ListMigrationProjectResponse ListMigrationProject(ListMigrationProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListMigrationProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListMigrationProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListMigrationProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain migration task list.
     * @param req ListMigrationTaskRequest
     * @return ListMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ListMigrationTaskResponse ListMigrationTask(ListMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListMigrationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListMigrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListMigrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the project of a migration task.
     * @param req ModifyMigrationTaskBelongToProjectRequest
     * @return ModifyMigrationTaskBelongToProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationTaskBelongToProjectResponse ModifyMigrationTaskBelongToProject(ModifyMigrationTaskBelongToProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrationTaskBelongToProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrationTaskBelongToProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrationTaskBelongToProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the migration task status.
     * @param req ModifyMigrationTaskStatusRequest
     * @return ModifyMigrationTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationTaskStatusResponse ModifyMigrationTaskStatus(ModifyMigrationTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrationTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrationTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrationTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to register a migration task.
     * @param req RegisterMigrationTaskRequest
     * @return RegisterMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public RegisterMigrationTaskResponse RegisterMigrationTask(RegisterMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterMigrationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterMigrationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterMigrationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
