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
    private static String service = "scf";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopyFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an alias for a function version. You can use the alias to mark a specific function version such as DEV/RELEASE. You can also modify the version pointed to by the alias at any time.
An alias must point to a master version and can point to an additional version at the same time. If you specify an alias when invoking a function, the request will be sent to the versions pointed to by the alias. You can configure the ratio between the master version and additional version during request sending.
     * @param req CreateAliasRequest
     * @return CreateAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasResponse CreateAlias(CreateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an alias of a function version.
     * @param req DeleteAliasRequest
     * @return DeleteAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasResponse DeleteAlias(DeleteAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a specified version of a specified layer. The deleted version cannot be associated with a function, but the deletion does not affect functions that are referencing this layer.
     * @param req DeleteLayerVersionRequest
     * @return DeleteLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLayerVersionResponse DeleteLayerVersion(DeleteLayerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLayerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLayerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLayerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the specific namespace according to the parameters passed in.
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the provisioned concurrency configuration of a function version.
     * @param req DeleteProvisionedConcurrencyConfigRequest
     * @return DeleteProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProvisionedConcurrencyConfigResponse DeleteProvisionedConcurrencyConfig(DeleteProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProvisionedConcurrencyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProvisionedConcurrencyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProvisionedConcurrencyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the reserved concurrency configuration of a function.
     * @param req DeleteReservedConcurrencyConfigRequest
     * @return DeleteReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReservedConcurrencyConfigResponse DeleteReservedConcurrencyConfig(DeleteReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReservedConcurrencyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReservedConcurrencyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReservedConcurrencyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the account information.
     * @param req GetAccountRequest
     * @return GetAccountResponse
     * @throws TencentCloudSDKException
     */
    public GetAccountResponse GetAccount(GetAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the alias details such as the name, description, version, and routing information.
     * @param req GetAliasRequest
     * @return GetAliasResponse
     * @throws TencentCloudSDKException
     */
    public GetAliasResponse GetAlias(GetAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFunctionAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the async retry configuration of a function, including the number of retry attempts and message retention period.
     * @param req GetFunctionEventInvokeConfigRequest
     * @return GetFunctionEventInvokeConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionEventInvokeConfigResponse GetFunctionEventInvokeConfig(GetFunctionEventInvokeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFunctionEventInvokeConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionEventInvokeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFunctionEventInvokeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFunctionLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the layer version details, including links used to download files in the layer.
     * @param req GetLayerVersionRequest
     * @return GetLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetLayerVersionResponse GetLayerVersion(GetLayerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLayerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetLayerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLayerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the provisioned concurrency details of a function or its specified version.
     * @param req GetProvisionedConcurrencyConfigRequest
     * @return GetProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetProvisionedConcurrencyConfigResponse GetProvisionedConcurrencyConfig(GetProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetProvisionedConcurrencyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetProvisionedConcurrencyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetProvisionedConcurrencyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the reserved concurrency details of a function.
     * @param req GetReservedConcurrencyConfigRequest
     * @return GetReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetReservedConcurrencyConfigResponse GetReservedConcurrencyConfig(GetReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetReservedConcurrencyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetReservedConcurrencyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetReservedConcurrencyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Invoke");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return the list of all aliases under a function. You can filter them by the specific function version.
     * @param req ListAliasesRequest
     * @return ListAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ListAliasesResponse ListAliases(ListAliasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAliasesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAliasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAliases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pull the list of async function events.
     * @param req ListAsyncEventsRequest
     * @return ListAsyncEventsResponse
     * @throws TencentCloudSDKException
     */
    public ListAsyncEventsResponse ListAsyncEvents(ListAsyncEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAsyncEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAsyncEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAsyncEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListFunctionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListFunctions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of all versions of a specified layer.
     * @param req ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListLayerVersionsResponse ListLayerVersions(ListLayerVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListLayerVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListLayerVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListLayerVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return the list of all layers, including the information of the latest version of each layer. You can filter them by the compatible runtime.
     * @param req ListLayersRequest
     * @return ListLayersResponse
     * @throws TencentCloudSDKException
     */
    public ListLayersResponse ListLayers(ListLayersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListLayersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListLayersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListLayers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the function trigger list.
     * @param req ListTriggersRequest
     * @return ListTriggersResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggersResponse ListTriggers(ListTriggersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTriggersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTriggersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTriggers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListVersionByFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListVersionByFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a version for a layer by using the given .zip file or COS object. Each time this API is called with the same layer name, a new version will be generated.
     * @param req PublishLayerVersionRequest
     * @return PublishLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishLayerVersionResponse PublishLayerVersion(PublishLayerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishLayerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishLayerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishLayerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the provisioned concurrency of a non-$LATEST version of a function.
     * @param req PutProvisionedConcurrencyConfigRequest
     * @return PutProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutProvisionedConcurrencyConfigResponse PutProvisionedConcurrencyConfig(PutProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutProvisionedConcurrencyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutProvisionedConcurrencyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutProvisionedConcurrencyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the reserved concurrency of a function.
     * @param req PutReservedConcurrencyConfigRequest
     * @return PutReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutReservedConcurrencyConfigResponse PutReservedConcurrencyConfig(PutReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutReservedConcurrencyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutReservedConcurrencyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutReservedConcurrencyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the account concurrency quota.
     * @param req PutTotalConcurrencyConfigRequest
     * @return PutTotalConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutTotalConcurrencyConfigResponse PutTotalConcurrencyConfig(PutTotalConcurrencyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutTotalConcurrencyConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutTotalConcurrencyConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutTotalConcurrencyConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to terminate a running async function event.
     * @param req TerminateAsyncEventRequest
     * @return TerminateAsyncEventResponse
     * @throws TencentCloudSDKException
     */
    public TerminateAsyncEventResponse TerminateAsyncEvent(TerminateAsyncEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateAsyncEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateAsyncEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateAsyncEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the configuration of an alias.
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFunctionCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFunctionCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFunctionConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFunctionConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the async retry configuration of a function, including the number of retry attempts and message retention period.
     * @param req UpdateFunctionEventInvokeConfigRequest
     * @return UpdateFunctionEventInvokeConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionEventInvokeConfigResponse UpdateFunctionEventInvokeConfig(UpdateFunctionEventInvokeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFunctionEventInvokeConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFunctionEventInvokeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFunctionEventInvokeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
