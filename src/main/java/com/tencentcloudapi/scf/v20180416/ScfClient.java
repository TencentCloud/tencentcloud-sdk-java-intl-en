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
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyFunction", CopyFunctionResponse.class);
    }

    /**
     *This API is used to create an alias for a function version. You can use the alias to mark a specific function version such as DEV/RELEASE. You can also modify the version pointed to by the alias at any time.
An alias must point to a master version and can point to an additional version at the same time. If you specify an alias when invoking a function, the request will be sent to the versions pointed to by the alias. You can configure the ratio between the master version and additional version during request sending.
     * @param req CreateAliasRequest
     * @return CreateAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasResponse CreateAlias(CreateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlias", CreateAliasResponse.class);
    }

    /**
     *This API is used to create a namespace based on the input parameters.
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
    }

    /**
     *This API is used to create a trigger based on the input parameters.
     * @param req CreateTriggerRequest
     * @return CreateTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerResponse CreateTrigger(CreateTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrigger", CreateTriggerResponse.class);
    }

    /**
     *This API is used to delete an alias of a function version.
     * @param req DeleteAliasRequest
     * @return DeleteAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasResponse DeleteAlias(DeleteAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlias", DeleteAliasResponse.class);
    }

    /**
     *This API is used to delete a function based on the input parameters.
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunction", DeleteFunctionResponse.class);
    }

    /**
     *This API is used to delete a specified version of a specified layer. The deleted version cannot be associated with a function, but the deletion does not affect functions that are referencing this layer.
     * @param req DeleteLayerVersionRequest
     * @return DeleteLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLayerVersionResponse DeleteLayerVersion(DeleteLayerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLayerVersion", DeleteLayerVersionResponse.class);
    }

    /**
     *This API is used to delete the specific namespace according to the parameters passed in.
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNamespace", DeleteNamespaceResponse.class);
    }

    /**
     *This API is used to delete the provisioned concurrency configuration of a function version.
     * @param req DeleteProvisionedConcurrencyConfigRequest
     * @return DeleteProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProvisionedConcurrencyConfigResponse DeleteProvisionedConcurrencyConfig(DeleteProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProvisionedConcurrencyConfig", DeleteProvisionedConcurrencyConfigResponse.class);
    }

    /**
     *This API is used to delete the configuration of reserved quota.
     * @param req DeleteReservedConcurrencyConfigRequest
     * @return DeleteReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReservedConcurrencyConfigResponse DeleteReservedConcurrencyConfig(DeleteReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReservedConcurrencyConfig", DeleteReservedConcurrencyConfigResponse.class);
    }

    /**
     *This API is used to delete an existing trigger based on the input parameters.
     * @param req DeleteTriggerRequest
     * @return DeleteTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerResponse DeleteTrigger(DeleteTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrigger", DeleteTriggerResponse.class);
    }

    /**
     *This API is used to get the account information.
     * @param req GetAccountRequest
     * @return GetAccountResponse
     * @throws TencentCloudSDKException
     */
    public GetAccountResponse GetAccount(GetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAccount", GetAccountResponse.class);
    }

    /**
     *This API is used to get the alias details such as the name, description, version, and routing information.
     * @param req GetAliasRequest
     * @return GetAliasResponse
     * @throws TencentCloudSDKException
     */
    public GetAliasResponse GetAlias(GetAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAlias", GetAliasResponse.class);
    }

    /**
     *This API is used to get the status of an async function execution event. The event status is retained for 3*24 hours, counting from the completion of the event.
     * @param req GetAsyncEventStatusRequest
     * @return GetAsyncEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetAsyncEventStatusResponse GetAsyncEventStatus(GetAsyncEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAsyncEventStatus", GetAsyncEventStatusResponse.class);
    }

    /**
     *This API is used to obtain the download address of the function code package.
     * @param req GetFunctionAddressRequest
     * @return GetFunctionAddressResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionAddressResponse GetFunctionAddress(GetFunctionAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFunctionAddress", GetFunctionAddressResponse.class);
    }

    /**
     *This API is used to get the async retry configuration of a function, including the number of retry attempts and message retention period.
     * @param req GetFunctionEventInvokeConfigRequest
     * @return GetFunctionEventInvokeConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionEventInvokeConfigResponse GetFunctionEventInvokeConfig(GetFunctionEventInvokeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFunctionEventInvokeConfig", GetFunctionEventInvokeConfigResponse.class);
    }

    /**
     *This API returns function running logs according to the specified conditions. Note that this API has been disused. You can use [GetRequestStatus](https://intl.cloud.tencent.com/document/product/583/65348?from_cn_redirect=1) instead. See also [Retrieving Logs](https://intl.cloud.tencent.com/document/product/583/52637?from_cn_redirect=1).
     * @param req GetFunctionLogsRequest
     * @return GetFunctionLogsResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionLogsResponse GetFunctionLogs(GetFunctionLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFunctionLogs", GetFunctionLogsResponse.class);
    }

    /**
     *This API is used to get the layer version details, including links used to download files in the layer.
     * @param req GetLayerVersionRequest
     * @return GetLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetLayerVersionResponse GetLayerVersion(GetLayerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLayerVersion", GetLayerVersionResponse.class);
    }

    /**
     *This API is used to get the provisioned concurrency details of a function or its specified version.
     * @param req GetProvisionedConcurrencyConfigRequest
     * @return GetProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetProvisionedConcurrencyConfigResponse GetProvisionedConcurrencyConfig(GetProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProvisionedConcurrencyConfig", GetProvisionedConcurrencyConfigResponse.class);
    }

    /**
     *This API is used to query the status of a single function request.
     * @param req GetRequestStatusRequest
     * @return GetRequestStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetRequestStatusResponse GetRequestStatus(GetRequestStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRequestStatus", GetRequestStatusResponse.class);
    }

    /**
     *This API is used to obtain the reserved quota details of a function. 
     * @param req GetReservedConcurrencyConfigRequest
     * @return GetReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetReservedConcurrencyConfigResponse GetReservedConcurrencyConfig(GetReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetReservedConcurrencyConfig", GetReservedConcurrencyConfigResponse.class);
    }

    /**
     *This API is used to run a function.
     * @param req InvokeRequest
     * @return InvokeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeResponse Invoke(InvokeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Invoke", InvokeResponse.class);
    }

    /**
     * This API is used to invoke functions synchronously.
     * @param req InvokeFunctionRequest
     * @return InvokeFunctionResponse
     * @throws TencentCloudSDKException
     */
    public InvokeFunctionResponse InvokeFunction(InvokeFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeFunction", InvokeFunctionResponse.class);
    }

    /**
     *This API is used to return the list of all aliases under a function. You can filter them by the specific function version.
     * @param req ListAliasesRequest
     * @return ListAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ListAliasesResponse ListAliases(ListAliasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAliases", ListAliasesResponse.class);
    }

    /**
     *This API is used to pull the list of async function events.
     * @param req ListAsyncEventsRequest
     * @return ListAsyncEventsResponse
     * @throws TencentCloudSDKException
     */
    public ListAsyncEventsResponse ListAsyncEvents(ListAsyncEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAsyncEvents", ListAsyncEventsResponse.class);
    }

    /**
     *This API is used to return relevant function information based on the input query parameters.
     * @param req ListFunctionsRequest
     * @return ListFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public ListFunctionsResponse ListFunctions(ListFunctionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFunctions", ListFunctionsResponse.class);
    }

    /**
     *This API is used to get the information of all versions of a specified layer.
     * @param req ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListLayerVersionsResponse ListLayerVersions(ListLayerVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLayerVersions", ListLayerVersionsResponse.class);
    }

    /**
     *This API is used to return the list of all layers, including the information of the latest version of each layer. You can filter them by the compatible runtime.
     * @param req ListLayersRequest
     * @return ListLayersResponse
     * @throws TencentCloudSDKException
     */
    public ListLayersResponse ListLayers(ListLayersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLayers", ListLayersResponse.class);
    }

    /**
     *This API is used to display a namespace list.
     * @param req ListNamespacesRequest
     * @return ListNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public ListNamespacesResponse ListNamespaces(ListNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListNamespaces", ListNamespacesResponse.class);
    }

    /**
     *This API is used to get the function trigger list.
     * @param req ListTriggersRequest
     * @return ListTriggersResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggersResponse ListTriggers(ListTriggersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggers", ListTriggersResponse.class);
    }

    /**
     *This API is used to query the function version based on the input parameters.
     * @param req ListVersionByFunctionRequest
     * @return ListVersionByFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ListVersionByFunctionResponse ListVersionByFunction(ListVersionByFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListVersionByFunction", ListVersionByFunctionResponse.class);
    }

    /**
     *This API is used to create a version for a layer by using the given .zip file or COS object. Each time this API is called with the same layer name, a new version will be generated.
     * @param req PublishLayerVersionRequest
     * @return PublishLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishLayerVersionResponse PublishLayerVersion(PublishLayerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishLayerVersion", PublishLayerVersionResponse.class);
    }

    /**
     *This API is used for users to release a new version of the function.
     * @param req PublishVersionRequest
     * @return PublishVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishVersionResponse PublishVersion(PublishVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishVersion", PublishVersionResponse.class);
    }

    /**
     *This API is used to set the provisioned concurrency of a non-$LATEST version of a function.
     * @param req PutProvisionedConcurrencyConfigRequest
     * @return PutProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutProvisionedConcurrencyConfigResponse PutProvisionedConcurrencyConfig(PutProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutProvisionedConcurrencyConfig", PutProvisionedConcurrencyConfigResponse.class);
    }

    /**
     *This API is used to configure the reserved quota of a function.
     * @param req PutReservedConcurrencyConfigRequest
     * @return PutReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutReservedConcurrencyConfigResponse PutReservedConcurrencyConfig(PutReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutReservedConcurrencyConfig", PutReservedConcurrencyConfigResponse.class);
    }

    /**
     *This API is used to modify the account concurrency quota.
     * @param req PutTotalConcurrencyConfigRequest
     * @return PutTotalConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutTotalConcurrencyConfigResponse PutTotalConcurrencyConfig(PutTotalConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutTotalConcurrencyConfig", PutTotalConcurrencyConfigResponse.class);
    }

    /**
     *This API is used to terminate a running async function event.
     * @param req TerminateAsyncEventRequest
     * @return TerminateAsyncEventResponse
     * @throws TencentCloudSDKException
     */
    public TerminateAsyncEventResponse TerminateAsyncEvent(TerminateAsyncEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateAsyncEvent", TerminateAsyncEventResponse.class);
    }

    /**
     *This API is used to update the configuration of an alias.
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlias", UpdateAliasResponse.class);
    }

    /**
     *This API is used to update the function code based on the input parameters.
     * @param req UpdateFunctionCodeRequest
     * @return UpdateFunctionCodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionCodeResponse UpdateFunctionCode(UpdateFunctionCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFunctionCode", UpdateFunctionCodeResponse.class);
    }

    /**
     *This API is used to update the async retry configuration of a function, including the number of retry attempts and message retention period.
     * @param req UpdateFunctionEventInvokeConfigRequest
     * @return UpdateFunctionEventInvokeConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionEventInvokeConfigResponse UpdateFunctionEventInvokeConfig(UpdateFunctionEventInvokeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFunctionEventInvokeConfig", UpdateFunctionEventInvokeConfigResponse.class);
    }

    /**
     *This API is used to update a namespace.
     * @param req UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNamespaceResponse UpdateNamespace(UpdateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateNamespace", UpdateNamespaceResponse.class);
    }

    /**
     *This API is used to update the trigger status.
     * @param req UpdateTriggerStatusRequest
     * @return UpdateTriggerStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerStatusResponse UpdateTriggerStatus(UpdateTriggerStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerStatus", UpdateTriggerStatusResponse.class);
    }

}
