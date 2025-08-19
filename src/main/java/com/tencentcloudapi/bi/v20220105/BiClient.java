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
package com.tencentcloudapi.bi.v20220105;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bi.v20220105.models.*;

public class BiClient extends AbstractClient{
    private static String endpoint = "bi.intl.tencentcloudapi.com";
    private static String service = "bi";
    private static String version = "2022-01-05";

    public BiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BiClient(Credential credential, String region, ClientProfile profile) {
        super(BiClient.endpoint, BiClient.version, credential, region, profile);
    }

    /**
     *This API is used to extend the available time of a token with strong authentication.
     * @param req ApplyEmbedIntervalRequest
     * @return ApplyEmbedIntervalResponse
     * @throws TencentCloudSDKException
     */
    public ApplyEmbedIntervalResponse ApplyEmbedInterval(ApplyEmbedIntervalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyEmbedInterval", ApplyEmbedIntervalResponse.class);
    }

    /**
     *This API is used to create a data source.
     * @param req CreateDatasourceRequest
     * @return CreateDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasourceResponse CreateDatasource(CreateDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatasource", CreateDatasourceResponse.class);
    }

    /**
     *This API is used to create a cloud database.
     * @param req CreateDatasourceCloudRequest
     * @return CreateDatasourceCloudResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasourceCloudResponse CreateDatasourceCloud(CreateDatasourceCloudRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatasourceCloud", CreateDatasourceCloudResponse.class);
    }

    /**
     *This API is used to create an embedded report with strong authentication.
     * @param req CreateEmbedTokenRequest
     * @return CreateEmbedTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmbedTokenResponse CreateEmbedToken(CreateEmbedTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmbedToken", CreateEmbedTokenResponse.class);
    }

    /**
     *This API is used to create a project.
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *This API is used to create a user role.
     * @param req CreateUserRoleRequest
     * @return CreateUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserRoleResponse CreateUserRole(CreateUserRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserRole", CreateUserRoleResponse.class);
    }

    /**
     *This API is used to create a user role in the project.
     * @param req CreateUserRoleProjectRequest
     * @return CreateUserRoleProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserRoleProjectResponse CreateUserRoleProject(CreateUserRoleProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserRoleProject", CreateUserRoleProjectResponse.class);
    }

    /**
     *This API is used to delete a data source.
     * @param req DeleteDatasourceRequest
     * @return DeleteDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatasourceResponse DeleteDatasource(DeleteDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDatasource", DeleteDatasourceResponse.class);
    }

    /**
     *This API is used to delete a project.
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *This API is used to remove a user role, which will result in user deletion.
     * @param req DeleteUserRoleRequest
     * @return DeleteUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserRoleResponse DeleteUserRole(DeleteUserRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserRole", DeleteUserRoleResponse.class);
    }

    /**
     *This API is used to delete a user role in the project.
     * @param req DeleteUserRoleProjectRequest
     * @return DeleteUserRoleProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserRoleProjectResponse DeleteUserRoleProject(DeleteUserRoleProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserRoleProject", DeleteUserRoleProjectResponse.class);
    }

    /**
     *This API is used to query a data source list.
     * @param req DescribeDatasourceListRequest
     * @return DescribeDatasourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceListResponse DescribeDatasourceList(DescribeDatasourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasourceList", DescribeDatasourceListResponse.class);
    }

    /**
     *This API is used to query component information on the page.
     * @param req DescribePageWidgetListRequest
     * @return DescribePageWidgetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePageWidgetListResponse DescribePageWidgetList(DescribePageWidgetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePageWidgetList", DescribePageWidgetListResponse.class);
    }

    /**
     *This API is used to obtain project details.
     * @param req DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectInfoResponse DescribeProjectInfo(DescribeProjectInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectInfo", DescribeProjectInfoResponse.class);
    }

    /**
     *This API is used to obtain project information.
     * @param req DescribeProjectListRequest
     * @return DescribeProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectListResponse DescribeProjectList(DescribeProjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectList", DescribeProjectListResponse.class);
    }

    /**
     *This API is used to obtain the user interface in the project.
     * @param req DescribeUserProjectListRequest
     * @return DescribeUserProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserProjectListResponse DescribeUserProjectList(DescribeUserProjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserProjectList", DescribeUserProjectListResponse.class);
    }

    /**
     *This API is used to obtain the user role list.
     * @param req DescribeUserRoleListRequest
     * @return DescribeUserRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRoleListResponse DescribeUserRoleList(DescribeUserRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserRoleList", DescribeUserRoleListResponse.class);
    }

    /**
     *This API is used to obtain the user role list in the project.
     * @param req DescribeUserRoleProjectListRequest
     * @return DescribeUserRoleProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRoleProjectListResponse DescribeUserRoleProjectList(DescribeUserRoleProjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserRoleProjectList", DescribeUserRoleProjectListResponse.class);
    }

    /**
     *This API is used to export a screenshot.
     * @param req ExportScreenPageRequest
     * @return ExportScreenPageResponse
     * @throws TencentCloudSDKException
     */
    public ExportScreenPageResponse ExportScreenPage(ExportScreenPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportScreenPage", ExportScreenPageResponse.class);
    }

    /**
     *This API is used to update a data source.
     * @param req ModifyDatasourceRequest
     * @return ModifyDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatasourceResponse ModifyDatasource(ModifyDatasourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatasource", ModifyDatasourceResponse.class);
    }

    /**
     *This API is used to update a cloud database.
     * @param req ModifyDatasourceCloudRequest
     * @return ModifyDatasourceCloudResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatasourceCloudResponse ModifyDatasourceCloud(ModifyDatasourceCloudRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatasourceCloud", ModifyDatasourceCloudResponse.class);
    }

    /**
     *This API is used to modify project information.
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *This API is used to modify user role info.
     * @param req ModifyUserRoleRequest
     * @return ModifyUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserRoleResponse ModifyUserRole(ModifyUserRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserRole", ModifyUserRoleResponse.class);
    }

    /**
     *This API is used to modify the user role info in the project.
     * @param req ModifyUserRoleProjectRequest
     * @return ModifyUserRoleProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserRoleProjectResponse ModifyUserRoleProject(ModifyUserRoleProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserRoleProject", ModifyUserRoleProjectResponse.class);
    }

}
