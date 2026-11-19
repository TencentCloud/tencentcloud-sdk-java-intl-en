/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.makers.v20261113;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.makers.v20261113.models.*;

public class MakersClient extends AbstractClient{
    private static String endpoint = "makers.intl.tencentcloudapi.com";
    private static String service = "makers";
    private static String version = "2026-11-13";

    public MakersClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MakersClient(Credential credential, String region, ClientProfile profile) {
        super(MakersClient.endpoint, MakersClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a deployment. When uploading an artifact, pass Upload for ViaMeta and Provider, and pass the path of the uploaded object for TempBucketPath.
     * @param req CreateDeploymentRequest
     * @return CreateDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeploymentResponse CreateDeployment(CreateDeploymentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeployment", CreateDeploymentResponse.class);
    }

    /**
     *This API is used to create a project. When uploading an artifact, pass Upload for Provider and Custom for Channel.
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *Bind a custom domain name to a specified environment of a project.
     * @param req CreateZoneCustomDomainRequest
     * @return CreateZoneCustomDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneCustomDomainResponse CreateZoneCustomDomain(CreateZoneCustomDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateZoneCustomDomain", CreateZoneCustomDomainResponse.class);
    }

    /**
     *Delete a project. In-progress builds prevent deletion.
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *Unbind a custom domain name from a project by domain name.
     * @param req DeleteProjectCustomDomainsRequest
     * @return DeleteProjectCustomDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectCustomDomainsResponse DeleteProjectCustomDomains(DeleteProjectCustomDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectCustomDomains", DeleteProjectCustomDomainsResponse.class);
    }

    /**
     *Delete environment variables by EnvVars. Match by Id or Key. Value is required but not used for matching. You can pass any value.
     * @param req DeleteProjectEnvsRequest
     * @return DeleteProjectEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectEnvsResponse DeleteProjectEnvs(DeleteProjectEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectEnvs", DeleteProjectEnvsResponse.class);
    }

    /**
     *Get the COS bucket, region, target path, and temporary key for uploading artifacts.
     * @param req DescribeCosTempTokenRequest
     * @return DescribeCosTempTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosTempTokenResponse DescribeCosTempToken(DescribeCosTempTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosTempToken", DescribeCosTempTokenResponse.class);
    }

    /**
     *Return the access address of the build log.
     * @param req DescribeDeploymentLogRequest
     * @return DescribeDeploymentLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeploymentLogResponse DescribeDeploymentLog(DescribeDeploymentLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeploymentLog", DescribeDeploymentLogResponse.class);
    }

    /**
     *Query deployment records of a project.
     * @param req DescribeDeploymentsRequest
     * @return DescribeDeploymentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeploymentsResponse DescribeDeployments(DescribeDeploymentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployments", DescribeDeploymentsResponse.class);
    }

    /**
     *Query environments in a project, including built-in Production, Preview, and custom environments.
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *Query project environment variables. If Env is not specified, return all application scopes.
     * @param req DescribeProjectEnvsRequest
     * @return DescribeProjectEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectEnvsResponse DescribeProjectEnvs(DescribeProjectEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectEnvs", DescribeProjectEnvsResponse.class);
    }

    /**
     *This API is used to query projects under a site by page. Offset is the page number offset, and the backend skips Offset * Limit items.
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *Queries the custom and preset domain names of a project under a site.
     * @param req DescribeZoneCustomDomainsRequest
     * @return DescribeZoneCustomDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneCustomDomainsResponse DescribeZoneCustomDomains(DescribeZoneCustomDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneCustomDomains", DescribeZoneCustomDomainsResponse.class);
    }

    /**
     *Modify the project name and build configuration. Fields not passed retain their original values.
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *Write environment variables based on the passed-in EnvVars.
     * @param req ModifyProjectEnvsRequest
     * @return ModifyProjectEnvsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectEnvsResponse ModifyProjectEnvs(ModifyProjectEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProjectEnvs", ModifyProjectEnvsResponse.class);
    }

    /**
     *Switch a bound custom domain name to another environment.
     * @param req ModifyZoneCustomDomainEnvRequest
     * @return ModifyZoneCustomDomainEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneCustomDomainEnvResponse ModifyZoneCustomDomainEnv(ModifyZoneCustomDomainEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneCustomDomainEnv", ModifyZoneCustomDomainEnvResponse.class);
    }

}
