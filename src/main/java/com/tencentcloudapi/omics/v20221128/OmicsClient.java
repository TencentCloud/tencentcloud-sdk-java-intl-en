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
package com.tencentcloudapi.omics.v20221128;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.omics.v20221128.models.*;

public class OmicsClient extends AbstractClient{
    private static String endpoint = "omics.tencentcloudapi.com";
    private static String service = "omics";
    private static String version = "2022-11-28";
    
    public OmicsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OmicsClient(Credential credential, String region, ClientProfile profile) {
        super(OmicsClient.endpoint, OmicsClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an environment for Tencent Healthcare Omics Platform.
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironment", CreateEnvironmentResponse.class);
    }

    /**
     *This API is used to create a volume.
     * @param req CreateVolumeRequest
     * @return CreateVolumeResponse
     * @throws TencentCloudSDKException
     */
    public CreateVolumeResponse CreateVolume(CreateVolumeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVolume", CreateVolumeResponse.class);
    }

    /**
     *This API is used to delete the environment.
     * @param req DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentResponse DeleteEnvironment(DeleteEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnvironment", DeleteEnvironmentResponse.class);
    }

    /**
     *This API is used to delete the volume.
     * @param req DeleteVolumeRequest
     * @return DeleteVolumeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVolumeResponse DeleteVolume(DeleteVolumeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVolume", DeleteVolumeResponse.class);
    }

    /**
     *This API is used to delete the volume data.
     * @param req DeleteVolumeDataRequest
     * @return DeleteVolumeDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVolumeDataResponse DeleteVolumeData(DeleteVolumeDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVolumeData", DeleteVolumeDataResponse.class);
    }

    /**
     *This API is used to query the environment list.
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *This API is used to query the run group list.
     * @param req DescribeRunGroupsRequest
     * @return DescribeRunGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunGroupsResponse DescribeRunGroups(DescribeRunGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRunGroups", DescribeRunGroupsResponse.class);
    }

    /**
     *This API is used to query the run list.
     * @param req DescribeRunsRequest
     * @return DescribeRunsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunsResponse DescribeRuns(DescribeRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuns", DescribeRunsResponse.class);
    }

    /**
     *This API is used to query the table.
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *This API is used to query the table row data.
     * @param req DescribeTablesRowsRequest
     * @return DescribeTablesRowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesRowsResponse DescribeTablesRows(DescribeTablesRowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablesRows", DescribeTablesRowsResponse.class);
    }

    /**
     *This API is used to query the volume list.
     * @param req DescribeVolumesRequest
     * @return DescribeVolumesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVolumesResponse DescribeVolumes(DescribeVolumesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVolumes", DescribeVolumesResponse.class);
    }

    /**
     *This API is used to query job details.
     * @param req GetRunCallsRequest
     * @return GetRunCallsResponse
     * @throws TencentCloudSDKException
     */
    public GetRunCallsResponse GetRunCalls(GetRunCallsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRunCalls", GetRunCallsResponse.class);
    }

    /**
     *This API is used to get the run details file.
     * @param req GetRunMetadataFileRequest
     * @return GetRunMetadataFileResponse
     * @throws TencentCloudSDKException
     */
    public GetRunMetadataFileResponse GetRunMetadataFile(GetRunMetadataFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRunMetadataFile", GetRunMetadataFileResponse.class);
    }

    /**
     *This API is used to query run details.
     * @param req GetRunStatusRequest
     * @return GetRunStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetRunStatusResponse GetRunStatus(GetRunStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRunStatus", GetRunStatusResponse.class);
    }

    /**
     *This API is used to import the table file.
     * @param req ImportTableFileRequest
     * @return ImportTableFileResponse
     * @throws TencentCloudSDKException
     */
    public ImportTableFileResponse ImportTableFile(ImportTableFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportTableFile", ImportTableFileResponse.class);
    }

    /**
     *This API is used to modify the volume.
     * @param req ModifyVolumeRequest
     * @return ModifyVolumeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVolumeResponse ModifyVolume(ModifyVolumeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVolume", ModifyVolumeResponse.class);
    }

    /**
     *This API is used to retry the run.
     * @param req RetryRunsRequest
     * @return RetryRunsResponse
     * @throws TencentCloudSDKException
     */
    public RetryRunsResponse RetryRuns(RetryRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryRuns", RetryRunsResponse.class);
    }

    /**
     *This API is used to run the application.
     * @param req RunApplicationRequest
     * @return RunApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RunApplicationResponse RunApplication(RunApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunApplication", RunApplicationResponse.class);
    }

    /**
     *This API is used to run the workflow.
     * @param req RunWorkflowRequest
     * @return RunWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public RunWorkflowResponse RunWorkflow(RunWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunWorkflow", RunWorkflowResponse.class);
    }

    /**
     *This API is used to terminate the run group.
     * @param req TerminateRunGroupRequest
     * @return TerminateRunGroupResponse
     * @throws TencentCloudSDKException
     */
    public TerminateRunGroupResponse TerminateRunGroup(TerminateRunGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateRunGroup", TerminateRunGroupResponse.class);
    }

}
