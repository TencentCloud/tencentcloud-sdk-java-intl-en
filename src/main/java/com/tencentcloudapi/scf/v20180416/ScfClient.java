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
package com.tencentcloudapi.scf.v20180416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.scf.v20180416.models.*;

public class ScfClient extends AbstractClient{
    private static String endpoint = "scf.tencentcloudapi.com";
    private static String version = "2018-04-16";

    public ScfClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ScfClient(Credential credential, String region, ClientProfile profile) {
        super(ScfClient.endpoint, ScfClient.version, credential, region, profile);
    }

    /**
     *This API is used to replicate a function. You can store the replicated function in a specified Region and Namespace.
Note: This API **does not** replicate the following objects or attributes of the function:
1. Function trigger
2. Versions other than $LATEST
3. CLS target of the logs configured in the function

You can manually configure the function after replication as required.
     * @param req CopyFunctionRequest
     * @return CopyFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CopyFunctionResponse CopyFunction(CopyFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CopyFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CopyFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a function based on the input parameters.
     * @param req CreateFunctionRequest
     * @return CreateFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionResponse CreateFunction(CreateFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a namespace based on the input parameters.
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a trigger based on the input parameters.
     * @param req CreateTriggerRequest
     * @return CreateTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerResponse CreateTrigger(CreateTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a function based on the input parameters.
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a namespace based on the input parameters.
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an existing trigger based on the input parameters.
     * @param req DeleteTriggerRequest
     * @return DeleteTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerResponse DeleteTrigger(DeleteTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain function details, such as name, code, handler, associated trigger, and timeout.
     * @param req GetFunctionRequest
     * @return GetFunctionResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionResponse GetFunction(GetFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the download address of the function code package.
     * @param req GetFunctionAddressRequest
     * @return GetFunctionAddressResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionAddressResponse GetFunctionAddress(GetFunctionAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFunctionAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetFunctionAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return function running logs according to the specified log query criteria.
     * @param req GetFunctionLogsRequest
     * @return GetFunctionLogsResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionLogsResponse GetFunctionLogs(GetFunctionLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFunctionLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetFunctionLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to run a function.
     * @param req InvokeRequest
     * @return InvokeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeResponse Invoke(InvokeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Invoke"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return relevant function information based on the input query parameters.
     * @param req ListFunctionsRequest
     * @return ListFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public ListFunctionsResponse ListFunctions(ListFunctionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListFunctionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListFunctionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListFunctions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to display a namespace list.
     * @param req ListNamespacesRequest
     * @return ListNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public ListNamespacesResponse ListNamespaces(ListNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListNamespacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListNamespacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListNamespaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the function version based on the input parameters.
     * @param req ListVersionByFunctionRequest
     * @return ListVersionByFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ListVersionByFunctionResponse ListVersionByFunction(ListVersionByFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListVersionByFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListVersionByFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListVersionByFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used for users to release a new version of the function.
     * @param req PublishVersionRequest
     * @return PublishVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishVersionResponse PublishVersion(PublishVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PublishVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PublishVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the function code based on the input parameters.
     * @param req UpdateFunctionCodeRequest
     * @return UpdateFunctionCodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionCodeResponse UpdateFunctionCode(UpdateFunctionCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFunctionCodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFunctionCodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateFunctionCode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the function configuration based on the input parameters.
     * @param req UpdateFunctionConfigurationRequest
     * @return UpdateFunctionConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionConfigurationResponse UpdateFunctionConfiguration(UpdateFunctionConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFunctionConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFunctionConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateFunctionConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a namespace.
     * @param req UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNamespaceResponse UpdateNamespace(UpdateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateNamespaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
