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
package com.tencentcloudapi.tem.v20210701;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tem.v20210701.models.*;

public class TemClient extends AbstractClient{
    private static String endpoint = "tem.tencentcloudapi.com";
    private static String service = "tem";
    private static String version = "2021-07-01";

    public TemClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TemClient(Credential credential, String region, ClientProfile profile) {
        super(TemClient.endpoint, TemClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an application.
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to generate a COS temporary key.
     * @param req CreateCosTokenRequest
     * @return CreateCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenResponse CreateCosToken(CreateCosTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCosTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCosToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an environment.
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEnvironmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEnvironment");
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
     *This API is used to delete an application.
  - Stop running the current application
  - Delete resources related to the application
  - Delete the application
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplication");
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
     *This API is used to deploy an application.
     * @param req DeployApplicationRequest
     * @return DeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeployApplicationResponse DeployApplication(DeployApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeployApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of application pods.
     * @param req DescribeApplicationPodsRequest
     * @return DescribeApplicationPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationPodsResponse DescribeApplicationPods(DescribeApplicationPodsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationPodsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationPodsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationPods");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status of all applications in an envrionment.
     * @param req DescribeApplicationsStatusRequest
     * @return DescribeApplicationsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsStatusResponse DescribeApplicationsStatus(DescribeApplicationsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationsStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of tenant environments.
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvironments");
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
     *This API is used to query the list of ingress rules associated with the application.
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
     *This API is used to terminate a namespace.
     * @param req DestroyEnvironmentRequest
     * @return DestroyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DestroyEnvironmentResponse DestroyEnvironment(DestroyEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyEnvironmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to generate the pre-signed download URL for the specified application package.
     * @param req GenerateApplicationPackageDownloadUrlRequest
     * @return GenerateApplicationPackageDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateApplicationPackageDownloadUrlResponse GenerateApplicationPackageDownloadUrl(GenerateApplicationPackageDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateApplicationPackageDownloadUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateApplicationPackageDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateApplicationPackageDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the basic information of an application.
     * @param req ModifyApplicationInfoRequest
     * @return ModifyApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationInfoResponse ModifyApplicationInfo(ModifyApplicationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to edit an environment.
     * @param req ModifyEnvironmentRequest
     * @return ModifyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentResponse ModifyEnvironment(ModifyEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvironmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEnvironment");
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
     *This API is used to restart an application.
     * @param req RestartApplicationRequest
     * @return RestartApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationResponse RestartApplication(RestartApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to restart an application pod.
     * @param req RestartApplicationPodRequest
     * @return RestartApplicationPodResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationPodResponse RestartApplicationPod(RestartApplicationPodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartApplicationPodResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartApplicationPodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartApplicationPod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to configure the rolling update policy for an application.
     * @param req RollingUpdateApplicationByVersionRequest
     * @return RollingUpdateApplicationByVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollingUpdateApplicationByVersionResponse RollingUpdateApplicationByVersion(RollingUpdateApplicationByVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollingUpdateApplicationByVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RollingUpdateApplicationByVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollingUpdateApplicationByVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop an application.
     * @param req StopApplicationRequest
     * @return StopApplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopApplicationResponse StopApplication(StopApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
