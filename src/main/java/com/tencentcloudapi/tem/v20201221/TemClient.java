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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosTokenV2", CreateCosTokenV2Response.class);
    }

    /**
     *This API is used to create an environment.
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
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
     *This API is used to create a service.
     * @param req CreateServiceV2Request
     * @return CreateServiceV2Response
     * @throws TencentCloudSDKException
     */
    public CreateServiceV2Response CreateServiceV2(CreateServiceV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceV2", CreateServiceV2Response.class);
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
     *This API is used to deploy a service.
     * @param req DeployServiceV2Request
     * @return DeployServiceV2Response
     * @throws TencentCloudSDKException
     */
    public DeployServiceV2Response DeployServiceV2(DeployServiceV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployServiceV2", DeployServiceV2Response.class);
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
     *This API is used to get the list of tenant environments.
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespaces", DescribeNamespacesResponse.class);
    }

    /**
     *This API is used to query the list of ingress rules associated with the service.
     * @param req DescribeRelatedIngressesRequest
     * @return DescribeRelatedIngressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedIngressesResponse DescribeRelatedIngresses(DescribeRelatedIngressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRelatedIngresses", DescribeRelatedIngressesResponse.class);
    }

    /**
     *This API is used to get the list of running pods under a service.
     * @param req DescribeServiceRunPodListV2Request
     * @return DescribeServiceRunPodListV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeServiceRunPodListV2Response DescribeServiceRunPodListV2(DescribeServiceRunPodListV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceRunPodListV2", DescribeServiceRunPodListV2Response.class);
    }

    /**
     *Generate the pre-signed download URL for the specified package
     * @param req GenerateDownloadUrlRequest
     * @return GenerateDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDownloadUrlResponse GenerateDownloadUrl(GenerateDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateDownloadUrl", GenerateDownloadUrlResponse.class);
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
     *This API is used to edit an environment.
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNamespace", ModifyNamespaceResponse.class);
    }

    /**
     *This API is used to modify a service’s basic information.
     * @param req ModifyServiceInfoRequest
     * @return ModifyServiceInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceInfoResponse ModifyServiceInfo(ModifyServiceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceInfo", ModifyServiceInfoResponse.class);
    }

    /**
     *This API is used to restart an instance.
     * @param req RestartServiceRunPodRequest
     * @return RestartServiceRunPodResponse
     * @throws TencentCloudSDKException
     */
    public RestartServiceRunPodResponse RestartServiceRunPod(RestartServiceRunPodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartServiceRunPod", RestartServiceRunPodResponse.class);
    }

}
