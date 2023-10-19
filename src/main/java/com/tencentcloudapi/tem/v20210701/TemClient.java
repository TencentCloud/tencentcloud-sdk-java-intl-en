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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplication", CreateApplicationResponse.class);
    }

    /**
     *This API is used to create a scaling rule.
     * @param req CreateApplicationAutoscalerRequest
     * @return CreateApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationAutoscalerResponse CreateApplicationAutoscaler(CreateApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationAutoscaler", CreateApplicationAutoscalerResponse.class);
    }

    /**
     *This API is used to create an access policy. 
     * @param req CreateApplicationServiceRequest
     * @return CreateApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationServiceResponse CreateApplicationService(CreateApplicationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationService", CreateApplicationServiceResponse.class);
    }

    /**
     *This API is used to create a configuration.
     * @param req CreateConfigDataRequest
     * @return CreateConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigDataResponse CreateConfigData(CreateConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigData", CreateConfigDataResponse.class);
    }

    /**
     *This API is used to generate a COS temporary key.
     * @param req CreateCosTokenRequest
     * @return CreateCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenResponse CreateCosToken(CreateCosTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosToken", CreateCosTokenResponse.class);
    }

    /**
     *This API is used to create an environment.
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironment", CreateEnvironmentResponse.class);
    }

    /**
     *This API is used to create a log collecting configuration.
     * @param req CreateLogConfigRequest
     * @return CreateLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogConfigResponse CreateLogConfig(CreateLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogConfig", CreateLogConfigResponse.class);
    }

    /**
     *This API is used to bind a cloud resource.
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResource", CreateResourceResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplication", DeleteApplicationResponse.class);
    }

    /**
     *This API is used to delete a scaling rule.
     * @param req DeleteApplicationAutoscalerRequest
     * @return DeleteApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationAutoscalerResponse DeleteApplicationAutoscaler(DeleteApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationAutoscaler", DeleteApplicationAutoscalerResponse.class);
    }

    /**
     *This API is used to delete an access policy.
     * @param req DeleteApplicationServiceRequest
     * @return DeleteApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationServiceResponse DeleteApplicationService(DeleteApplicationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationService", DeleteApplicationServiceResponse.class);
    }

    /**
     *This API is used to delete an ingress rule.
     * @param req DeleteIngressRequest
     * @return DeleteIngressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIngressResponse DeleteIngress(DeleteIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIngress", DeleteIngressResponse.class);
    }

    /**
     *This API is used to deploy an application.
     * @param req DeployApplicationRequest
     * @return DeployApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeployApplicationResponse DeployApplication(DeployApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployApplication", DeployApplicationResponse.class);
    }

    /**
     *This API is used to query the scaling rules of an application.
     * @param req DescribeApplicationAutoscalerListRequest
     * @return DescribeApplicationAutoscalerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationAutoscalerListResponse DescribeApplicationAutoscalerList(DescribeApplicationAutoscalerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationAutoscalerList", DescribeApplicationAutoscalerListResponse.class);
    }

    /**
     *This API is used to check the basic information of an application.
     * @param req DescribeApplicationInfoRequest
     * @return DescribeApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationInfoResponse DescribeApplicationInfo(DescribeApplicationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationInfo", DescribeApplicationInfoResponse.class);
    }

    /**
     *This API is used to get the list of application pods.
     * @param req DescribeApplicationPodsRequest
     * @return DescribeApplicationPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationPodsResponse DescribeApplicationPods(DescribeApplicationPodsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationPods", DescribeApplicationPodsResponse.class);
    }

    /**
     *This API is used to query the list of access policies.
     * @param req DescribeApplicationServiceListRequest
     * @return DescribeApplicationServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationServiceListResponse DescribeApplicationServiceList(DescribeApplicationServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationServiceList", DescribeApplicationServiceListResponse.class);
    }

    /**
     *This API is to query the list of running applications.
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplications", DescribeApplicationsResponse.class);
    }

    /**
     *This API is used to query the status of all applications in an envrionment.
     * @param req DescribeApplicationsStatusRequest
     * @return DescribeApplicationsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsStatusResponse DescribeApplicationsStatus(DescribeApplicationsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationsStatus", DescribeApplicationsStatusResponse.class);
    }

    /**
     *This API is used to query details of a configuration.
     * @param req DescribeConfigDataRequest
     * @return DescribeConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDataResponse DescribeConfigData(DescribeConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigData", DescribeConfigDataResponse.class);
    }

    /**
     *This API is used to query the list of configurations.
     * @param req DescribeConfigDataListRequest
     * @return DescribeConfigDataListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDataListResponse DescribeConfigDataList(DescribeConfigDataListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigDataList", DescribeConfigDataListResponse.class);
    }

    /**
     *This API is used to obtain the basic information of an environment.
     * @param req DescribeEnvironmentRequest
     * @return DescribeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentResponse DescribeEnvironment(DescribeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironment", DescribeEnvironmentResponse.class);
    }

    /**
     *This API is used to obtain the environment status.
     * @param req DescribeEnvironmentStatusRequest
     * @return DescribeEnvironmentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentStatusResponse DescribeEnvironmentStatus(DescribeEnvironmentStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironmentStatus", DescribeEnvironmentStatusResponse.class);
    }

    /**
     *This API is used to obtain the list of environments. 
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *This API is used to query an ingress rule.
     * @param req DescribeIngressRequest
     * @return DescribeIngressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressResponse DescribeIngress(DescribeIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIngress", DescribeIngressResponse.class);
    }

    /**
     *This API is used to query the list of ingress rules.
     * @param req DescribeIngressesRequest
     * @return DescribeIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIngressesResponse DescribeIngresses(DescribeIngressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIngresses", DescribeIngressesResponse.class);
    }

    /**
     *This API is used to query details of a log collecting configuration.
     * @param req DescribeLogConfigRequest
     * @return DescribeLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogConfigResponse DescribeLogConfig(DescribeLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogConfig", DescribeLogConfigResponse.class);
    }

    /**
     *This API is used to querying the list of log collecting configurations.
     * @param req DescribePagedLogConfigListRequest
     * @return DescribePagedLogConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePagedLogConfigListResponse DescribePagedLogConfigList(DescribePagedLogConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePagedLogConfigList", DescribePagedLogConfigListResponse.class);
    }

    /**
     *This API is used to query the list of ingress rules associated with the application.
     * @param req DescribeRelatedIngressesRequest
     * @return DescribeRelatedIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedIngressesResponse DescribeRelatedIngresses(DescribeRelatedIngressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelatedIngresses", DescribeRelatedIngressesResponse.class);
    }

    /**
     *This API is used to terminate a configuration.
     * @param req DestroyConfigDataRequest
     * @return DestroyConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public DestroyConfigDataResponse DestroyConfigData(DestroyConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyConfigData", DestroyConfigDataResponse.class);
    }

    /**
     *This API is used to terminate an environment.
     * @param req DestroyEnvironmentRequest
     * @return DestroyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DestroyEnvironmentResponse DestroyEnvironment(DestroyEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyEnvironment", DestroyEnvironmentResponse.class);
    }

    /**
     *This API is used to terminate a log collecting configuration.
     * @param req DestroyLogConfigRequest
     * @return DestroyLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DestroyLogConfigResponse DestroyLogConfig(DestroyLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyLogConfig", DestroyLogConfigResponse.class);
    }

    /**
     *This API is used to disable a scaling rule.
     * @param req DisableApplicationAutoscalerRequest
     * @return DisableApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public DisableApplicationAutoscalerResponse DisableApplicationAutoscaler(DisableApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableApplicationAutoscaler", DisableApplicationAutoscalerResponse.class);
    }

    /**
     *This API is used to enable a scaling rule.
     * @param req EnableApplicationAutoscalerRequest
     * @return EnableApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public EnableApplicationAutoscalerResponse EnableApplicationAutoscaler(EnableApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableApplicationAutoscaler", EnableApplicationAutoscalerResponse.class);
    }

    /**
     *This API is used to generate the pre-signed download URL for the specified application package.
     * @param req GenerateApplicationPackageDownloadUrlRequest
     * @return GenerateApplicationPackageDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateApplicationPackageDownloadUrlResponse GenerateApplicationPackageDownloadUrl(GenerateApplicationPackageDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateApplicationPackageDownloadUrl", GenerateApplicationPackageDownloadUrlResponse.class);
    }

    /**
     *This API is used to modify a scaling rule.
     * @param req ModifyApplicationAutoscalerRequest
     * @return ModifyApplicationAutoscalerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationAutoscalerResponse ModifyApplicationAutoscaler(ModifyApplicationAutoscalerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationAutoscaler", ModifyApplicationAutoscalerResponse.class);
    }

    /**
     *This API is used to modify the basic information of an application.
     * @param req ModifyApplicationInfoRequest
     * @return ModifyApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationInfoResponse ModifyApplicationInfo(ModifyApplicationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationInfo", ModifyApplicationInfoResponse.class);
    }

    /**
     *This API is used to modify an access policy.
     * @param req ModifyApplicationServiceRequest
     * @return ModifyApplicationServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationServiceResponse ModifyApplicationService(ModifyApplicationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationService", ModifyApplicationServiceResponse.class);
    }

    /**
     *This API is used to modify a configuration.
     * @param req ModifyConfigDataRequest
     * @return ModifyConfigDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigDataResponse ModifyConfigData(ModifyConfigDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfigData", ModifyConfigDataResponse.class);
    }

    /**
     *This API is used to edit an environment.
     * @param req ModifyEnvironmentRequest
     * @return ModifyEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentResponse ModifyEnvironment(ModifyEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnvironment", ModifyEnvironmentResponse.class);
    }

    /**
     *This API is used to create or update an ingress rule.
     * @param req ModifyIngressRequest
     * @return ModifyIngressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIngressResponse ModifyIngress(ModifyIngressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIngress", ModifyIngressResponse.class);
    }

    /**
     *This API is used to modify a log collecting configuration.
     * @param req ModifyLogConfigRequest
     * @return ModifyLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogConfigResponse ModifyLogConfig(ModifyLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogConfig", ModifyLogConfigResponse.class);
    }

    /**
     *This API is used to restart an application.
     * @param req RestartApplicationRequest
     * @return RestartApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationResponse RestartApplication(RestartApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartApplication", RestartApplicationResponse.class);
    }

    /**
     *This API is used to restart an application pod.
     * @param req RestartApplicationPodRequest
     * @return RestartApplicationPodResponse
     * @throws TencentCloudSDKException
     */
    public RestartApplicationPodResponse RestartApplicationPod(RestartApplicationPodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartApplicationPod", RestartApplicationPodResponse.class);
    }

    /**
     *This API is used to configure the rolling update policy for an application.
     * @param req RollingUpdateApplicationByVersionRequest
     * @return RollingUpdateApplicationByVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollingUpdateApplicationByVersionResponse RollingUpdateApplicationByVersion(RollingUpdateApplicationByVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollingUpdateApplicationByVersion", RollingUpdateApplicationByVersionResponse.class);
    }

    /**
     *This API is used to stop an application.
     * @param req StopApplicationRequest
     * @return StopApplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopApplicationResponse StopApplication(StopApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopApplication", StopApplicationResponse.class);
    }

}
