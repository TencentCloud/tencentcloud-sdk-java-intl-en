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
package com.tencentcloudapi.pts.v20210728;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.pts.v20210728.models.*;

public class PtsClient extends AbstractClient{
    private static String endpoint = "pts.tencentcloudapi.com";
    private static String service = "pts";
    private static String version = "2021-07-28";
    
    public PtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PtsClient(Credential credential, String region, ClientProfile profile) {
        super(PtsClient.endpoint, PtsClient.version, credential, region, profile);
    }

    /**
     *This API is used to stop cron jobs.
     * @param req AbortCronJobsRequest
     * @return AbortCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public AbortCronJobsResponse AbortCronJobs(AbortCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortCronJobs", AbortCronJobsResponse.class);
    }

    /**
     *This API is used to stop test job.
     * @param req AbortJobRequest
     * @return AbortJobResponse
     * @throws TencentCloudSDKException
     */
    public AbortJobResponse AbortJob(AbortJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AbortJob", AbortJobResponse.class);
    }

    /**
     *This API is used to adjust the target RPS of a job.
     * @param req AdjustJobSpeedRequest
     * @return AdjustJobSpeedResponse
     * @throws TencentCloudSDKException
     */
    public AdjustJobSpeedResponse AdjustJobSpeed(AdjustJobSpeedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AdjustJobSpeed", AdjustJobSpeedResponse.class);
    }

    /**
     *This API is used to copy a scenario.
     * @param req CopyScenarioRequest
     * @return CopyScenarioResponse
     * @throws TencentCloudSDKException
     */
    public CopyScenarioResponse CopyScenario(CopyScenarioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyScenario", CopyScenarioResponse.class);
    }

    /**
     *This API is used to create an alert recipient group.
     * @param req CreateAlertChannelRequest
     * @return CreateAlertChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertChannelResponse CreateAlertChannel(CreateAlertChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlertChannel", CreateAlertChannelResponse.class);
    }

    /**
     *This API is used to create a cron job.
     * @param req CreateCronJobRequest
     * @return CreateCronJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCronJobResponse CreateCronJob(CreateCronJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCronJob", CreateCronJobResponse.class);
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
     *This API is used to create a file.
     * @param req CreateFileRequest
     * @return CreateFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileResponse CreateFile(CreateFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFile", CreateFileResponse.class);
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
     *This API is used to create a scenario.
     * @param req CreateScenarioRequest
     * @return CreateScenarioResponse
     * @throws TencentCloudSDKException
     */
    public CreateScenarioResponse CreateScenario(CreateScenarioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScenario", CreateScenarioResponse.class);
    }

    /**
     *This API is used to delete an alert recipient group.
     * @param req DeleteAlertChannelRequest
     * @return DeleteAlertChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlertChannelResponse DeleteAlertChannel(DeleteAlertChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlertChannel", DeleteAlertChannelResponse.class);
    }

    /**
     *This API is used to delete cron jobs.
     * @param req DeleteCronJobsRequest
     * @return DeleteCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCronJobsResponse DeleteCronJobs(DeleteCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCronJobs", DeleteCronJobsResponse.class);
    }

    /**
     *This API is used to delete environments.
     * @param req DeleteEnvironmentsRequest
     * @return DeleteEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentsResponse DeleteEnvironments(DeleteEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnvironments", DeleteEnvironmentsResponse.class);
    }

    /**
     *This API is used to delete files.
     * @param req DeleteFilesRequest
     * @return DeleteFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFilesResponse DeleteFiles(DeleteFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFiles", DeleteFilesResponse.class);
    }

    /**
     *This API is used to delete jobs.
     * @param req DeleteJobsRequest
     * @return DeleteJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobsResponse DeleteJobs(DeleteJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJobs", DeleteJobsResponse.class);
    }

    /**
     *This API is used to delete projects.
     * @param req DeleteProjectsRequest
     * @return DeleteProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectsResponse DeleteProjects(DeleteProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjects", DeleteProjectsResponse.class);
    }

    /**
     *This API is used to delete scenarios.
     * @param req DeleteScenariosRequest
     * @return DeleteScenariosResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScenariosResponse DeleteScenarios(DeleteScenariosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScenarios", DeleteScenariosResponse.class);
    }

    /**
     *This API is used to query alert recipient groups.
     * @param req DescribeAlertChannelsRequest
     * @return DescribeAlertChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertChannelsResponse DescribeAlertChannels(DescribeAlertChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertChannels", DescribeAlertChannelsResponse.class);
    }

    /**
     *This API is used to query alert records.
     * @param req DescribeAlertRecordsRequest
     * @return DescribeAlertRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRecordsResponse DescribeAlertRecords(DescribeAlertRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertRecords", DescribeAlertRecordsResponse.class);
    }

    /**
     *This API is used to query all supported metrics.
     * @param req DescribeAvailableMetricsRequest
     * @return DescribeAvailableMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableMetricsResponse DescribeAvailableMetrics(DescribeAvailableMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableMetrics", DescribeAvailableMetricsResponse.class);
    }

    /**
     *This API is used to query checkpoint summary information.
     * @param req DescribeCheckSummaryRequest
     * @return DescribeCheckSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckSummaryResponse DescribeCheckSummary(DescribeCheckSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckSummary", DescribeCheckSummaryResponse.class);
    }

    /**
     *This API is used to list cron jobs, selecting all by default if a non-mandatory array parameter is empty.
     * @param req DescribeCronJobsRequest
     * @return DescribeCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCronJobsResponse DescribeCronJobs(DescribeCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCronJobs", DescribeCronJobsResponse.class);
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
     *This API is used to query error summary information.
     * @param req DescribeErrorSummaryRequest
     * @return DescribeErrorSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorSummaryResponse DescribeErrorSummary(DescribeErrorSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeErrorSummary", DescribeErrorSummaryResponse.class);
    }

    /**
     *This API is used to query file list.
     * @param req DescribeFilesRequest
     * @return DescribeFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFilesResponse DescribeFiles(DescribeFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFiles", DescribeFilesResponse.class);
    }

    /**
     *This API is used to query job list.
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *This API is used to query label values.
     * @param req DescribeLabelValuesRequest
     * @return DescribeLabelValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLabelValuesResponse DescribeLabelValues(DescribeLabelValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLabelValues", DescribeLabelValuesResponse.class);
    }

    /**
     *This API is used to query all labels and values of metrics
     * @param req DescribeMetricLabelWithValuesRequest
     * @return DescribeMetricLabelWithValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricLabelWithValuesResponse DescribeMetricLabelWithValues(DescribeMetricLabelWithValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricLabelWithValues", DescribeMetricLabelWithValuesResponse.class);
    }

    /**
     *This API is used to query logs in performance testing, including engine logs and console logs.
     * @param req DescribeNormalLogsRequest
     * @return DescribeNormalLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNormalLogsResponse DescribeNormalLogs(DescribeNormalLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNormalLogs", DescribeNormalLogsResponse.class);
    }

    /**
     *The API is used to query project list.
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *This API is used to query region list.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to query request summary information.
     * @param req DescribeRequestSummaryRequest
     * @return DescribeRequestSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRequestSummaryResponse DescribeRequestSummary(DescribeRequestSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRequestSummary", DescribeRequestSummaryResponse.class);
    }

    /**
     *This API is used to query metrics in batch and return metric content at a specific time point.
     * @param req DescribeSampleBatchQueryRequest
     * @return DescribeSampleBatchQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleBatchQueryResponse DescribeSampleBatchQuery(DescribeSampleBatchQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleBatchQuery", DescribeSampleBatchQueryResponse.class);
    }

    /**
     *This API is used to query sampled request logs.
     * @param req DescribeSampleLogsRequest
     * @return DescribeSampleLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleLogsResponse DescribeSampleLogs(DescribeSampleLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleLogs", DescribeSampleLogsResponse.class);
    }

    /**
     *This API is used to batch query metric matrices.
     * @param req DescribeSampleMatrixBatchQueryRequest
     * @return DescribeSampleMatrixBatchQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleMatrixBatchQueryResponse DescribeSampleMatrixBatchQuery(DescribeSampleMatrixBatchQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleMatrixBatchQuery", DescribeSampleMatrixBatchQueryResponse.class);
    }

    /**
     *This API is used to query metric matrix.
     * @param req DescribeSampleMatrixQueryRequest
     * @return DescribeSampleMatrixQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleMatrixQueryResponse DescribeSampleMatrixQuery(DescribeSampleMatrixQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleMatrixQuery", DescribeSampleMatrixQueryResponse.class);
    }

    /**
     *This API is used to query metrics and return metric content at a specific time point.
     * @param req DescribeSampleQueryRequest
     * @return DescribeSampleQueryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleQueryResponse DescribeSampleQuery(DescribeSampleQueryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleQuery", DescribeSampleQueryResponse.class);
    }

    /**
     *This API is used to query scenarios with executed jobs.
     * @param req DescribeScenarioWithJobsRequest
     * @return DescribeScenarioWithJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenarioWithJobsResponse DescribeScenarioWithJobs(DescribeScenarioWithJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenarioWithJobs", DescribeScenarioWithJobsResponse.class);
    }

    /**
     *This API is used to query scenario list.
     * @param req DescribeScenariosRequest
     * @return DescribeScenariosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenariosResponse DescribeScenarios(DescribeScenariosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenarios", DescribeScenariosResponse.class);
    }

    /**
     *This API is used to generate temporary COS credentials.
     * @param req GenerateTmpKeyRequest
     * @return GenerateTmpKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateTmpKeyResponse GenerateTmpKey(GenerateTmpKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateTmpKey", GenerateTmpKeyResponse.class);
    }

    /**
     *This API is used to restart cron jobs that have been aborted.
     * @param req RestartCronJobsRequest
     * @return RestartCronJobsResponse
     * @throws TencentCloudSDKException
     */
    public RestartCronJobsResponse RestartCronJobs(RestartCronJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartCronJobs", RestartCronJobsResponse.class);
    }

    /**
     *This API is used to create and start test job.
     * @param req StartJobRequest
     * @return StartJobResponse
     * @throws TencentCloudSDKException
     */
    public StartJobResponse StartJob(StartJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartJob", StartJobResponse.class);
    }

    /**
     *This API is used to update a cron job.
     * @param req UpdateCronJobRequest
     * @return UpdateCronJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCronJobResponse UpdateCronJob(UpdateCronJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCronJob", UpdateCronJobResponse.class);
    }

    /**
     *This API is used to update environments.
     * @param req UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEnvironmentResponse UpdateEnvironment(UpdateEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEnvironment", UpdateEnvironmentResponse.class);
    }

    /**
     *This API is used to update relation between files and scenarios.
     * @param req UpdateFileScenarioRelationRequest
     * @return UpdateFileScenarioRelationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFileScenarioRelationResponse UpdateFileScenarioRelation(UpdateFileScenarioRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFileScenarioRelation", UpdateFileScenarioRelationResponse.class);
    }

    /**
     *This API is used to update a job.
     * @param req UpdateJobRequest
     * @return UpdateJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateJobResponse UpdateJob(UpdateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateJob", UpdateJobResponse.class);
    }

    /**
     *This API is used to update a project.
     * @param req UpdateProjectRequest
     * @return UpdateProjectResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProjectResponse UpdateProject(UpdateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProject", UpdateProjectResponse.class);
    }

    /**
     *This API is used to update a scenario.
     * @param req UpdateScenarioRequest
     * @return UpdateScenarioResponse
     * @throws TencentCloudSDKException
     */
    public UpdateScenarioResponse UpdateScenario(UpdateScenarioRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateScenario", UpdateScenarioResponse.class);
    }

}
