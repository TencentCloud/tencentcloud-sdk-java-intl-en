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
package com.tencentcloudapi.tem.v20201221;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tem.v20201221.models.*;

public class TemClient extends AbstractClient{
    private static String endpoint = "tem.tencentcloudapi.com";
    private static String service = "tem";
    private static String version = "2020-12-21";

    public TemClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TemClient(Credential credential, String region, ClientProfile profile) {
        super(TemClient.endpoint, TemClient.version, credential, region, profile);
    }

    /**
     *This API is used to generate a COS temporary key.
     * @param req CreateCosTokenV2Request
     * @return CreateCosTokenV2Response
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenV2Response CreateCosTokenV2(CreateCosTokenV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosTokenV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCosTokenV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCosTokenV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an environment.
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
     *This API is used to bind a cloud resource.
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a service.
     * @param req CreateServiceV2Request
     * @return CreateServiceV2Response
     * @throws TencentCloudSDKException
     */
    public CreateServiceV2Response CreateServiceV2(CreateServiceV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an ingress rule.
     * @param req DeleteIngressRequest
     * @return DeleteIngressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIngressResponse DeleteIngress(DeleteIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIngressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIngressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIngress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to deploy a service.
     * @param req DeployServiceV2Request
     * @return DeployServiceV2Response
     * @throws TencentCloudSDKException
     */
    public DeployServiceV2Response DeployServiceV2(DeployServiceV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<DeployServiceV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeployServiceV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployServiceV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query an ingress rule.
     * @param req DescribeIngressRequest
     * @return DescribeIngressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressResponse DescribeIngress(DescribeIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIngressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIngressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIngress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of ingress rules.
     * @param req DescribeIngressesRequest
     * @return DescribeIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressesResponse DescribeIngresses(DescribeIngressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIngressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIngressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIngresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of tenant environments.
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of ingress rules associated with the service.
     * @param req DescribeRelatedIngressesRequest
     * @return DescribeRelatedIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedIngressesResponse DescribeRelatedIngresses(DescribeRelatedIngressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRelatedIngressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRelatedIngressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRelatedIngresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of running pods under a service.
     * @param req DescribeServiceRunPodListV2Request
     * @return DescribeServiceRunPodListV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeServiceRunPodListV2Response DescribeServiceRunPodListV2(DescribeServiceRunPodListV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceRunPodListV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceRunPodListV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceRunPodListV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create or update an ingress rule.
     * @param req ModifyIngressRequest
     * @return ModifyIngressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIngressResponse ModifyIngress(ModifyIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIngressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIngressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIngress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to edit an environment.
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a service’s basic information.
     * @param req ModifyServiceInfoRequest
     * @return ModifyServiceInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceInfoResponse ModifyServiceInfo(ModifyServiceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyServiceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to restart an instance.
     * @param req RestartServiceRunPodRequest
     * @return RestartServiceRunPodResponse
     * @throws TencentCloudSDKException
     */
    public RestartServiceRunPodResponse RestartServiceRunPod(RestartServiceRunPodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartServiceRunPodResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartServiceRunPodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartServiceRunPod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
