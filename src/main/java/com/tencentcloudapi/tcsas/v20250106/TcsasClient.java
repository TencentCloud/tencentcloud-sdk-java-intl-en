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
package com.tencentcloudapi.tcsas.v20250106;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcsas.v20250106.models.*;

public class TcsasClient extends AbstractClient{
    private static String endpoint = "tcsas.intl.tencentcloudapi.com";
    private static String service = "tcsas";
    private static String version = "2025-01-06";

    public TcsasClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcsasClient(Credential credential, String region, ClientProfile profile) {
        super(TcsasClient.endpoint, TcsasClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a team member.
     * @param req AddTeamMemberRequest
     * @return AddTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public AddTeamMemberResponse AddTeamMember(AddTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTeamMember", AddTeamMemberResponse.class);
    }

    /**
     *This API is used to configure the preview of a mini program.
     * @param req ConfigureMNPPreviewRequest
     * @return ConfigureMNPPreviewResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureMNPPreviewResponse ConfigureMNPPreview(ConfigureMNPPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureMNPPreview", ConfigureMNPPreviewResponse.class);
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
     *This API is used to create the configuration for a specified superapp.
     * @param req CreateApplicationConfigRequest
     * @return CreateApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationConfigResponse CreateApplicationConfig(CreateApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationConfig", CreateApplicationConfigResponse.class);
    }

    /**
     *This API is used to create a sensitive API of an application.
     * @param req CreateApplicationSensitiveAPIRequest
     * @return CreateApplicationSensitiveAPIResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationSensitiveAPIResponse CreateApplicationSensitiveAPI(CreateApplicationSensitiveAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationSensitiveAPI", CreateApplicationSensitiveAPIResponse.class);
    }

    /**
     *This API is used to create a global domain allowlist or blocklist.
     * @param req CreateGlobalDomainACLRequest
     * @return CreateGlobalDomainACLResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalDomainACLResponse CreateGlobalDomainACL(CreateGlobalDomainACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalDomainACL", CreateGlobalDomainACLResponse.class);
    }

    /**
     *This API is used to create a mini program.
     * @param req CreateMNPRequest
     * @return CreateMNPResponse
     * @throws TencentCloudSDKException
     */
    public CreateMNPResponse CreateMNP(CreateMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMNP", CreateMNPResponse.class);
    }

    /**
     *This API is used to create a mini program approval request.
     * @param req CreateMNPApprovalRequest
     * @return CreateMNPApprovalResponse
     * @throws TencentCloudSDKException
     */
    public CreateMNPApprovalResponse CreateMNPApproval(CreateMNPApprovalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMNPApproval", CreateMNPApprovalResponse.class);
    }

    /**
     *This API is used to add a domain name to the allowlist / blocklist of a mini program.
     * @param req CreateMNPDomainACLRequest
     * @return CreateMNPDomainACLResponse
     * @throws TencentCloudSDKException
     */
    public CreateMNPDomainACLResponse CreateMNPDomainACL(CreateMNPDomainACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMNPDomainACL", CreateMNPDomainACLResponse.class);
    }

    /**
     *This API is used to create a permission request to allow a mini program to call sensitive APIs.
     * @param req CreateMNPSensitiveAPIPermissionApprovalRequest
     * @return CreateMNPSensitiveAPIPermissionApprovalResponse
     * @throws TencentCloudSDKException
     */
    public CreateMNPSensitiveAPIPermissionApprovalResponse CreateMNPSensitiveAPIPermissionApproval(CreateMNPSensitiveAPIPermissionApprovalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMNPSensitiveAPIPermissionApproval", CreateMNPSensitiveAPIPermissionApprovalResponse.class);
    }

    /**
     *This API is used to create a mini program version.
     * @param req CreateMNPVersionRequest
     * @return CreateMNPVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateMNPVersionResponse CreateMNPVersion(CreateMNPVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMNPVersion", CreateMNPVersionResponse.class);
    }

    /**
     *This API is used to obtain the encryption key.
     * @param req CreatePresetKeyRequest
     * @return CreatePresetKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePresetKeyResponse CreatePresetKey(CreatePresetKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePresetKey", CreatePresetKeyResponse.class);
    }

    /**
     *This API is used to create a team.
     * @param req CreateTeamRequest
     * @return CreateTeamResponse
     * @throws TencentCloudSDKException
     */
    public CreateTeamResponse CreateTeam(CreateTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTeam", CreateTeamResponse.class);
    }

    /**
     *This API is used to create a user.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *This API is used to delete the applications.
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplication", DeleteApplicationResponse.class);
    }

    /**
     *This API is used to delete a sensitive API.
     * @param req DeleteApplicationSensitiveAPIRequest
     * @return DeleteApplicationSensitiveAPIResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationSensitiveAPIResponse DeleteApplicationSensitiveAPI(DeleteApplicationSensitiveAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationSensitiveAPI", DeleteApplicationSensitiveAPIResponse.class);
    }

    /**
     *This API is used to delete domains from the allowlist or blocklist.
     * @param req DeleteGlobalDomainRequest
     * @return DeleteGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalDomainResponse DeleteGlobalDomain(DeleteGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalDomain", DeleteGlobalDomainResponse.class);
    }

    /**
     *This API is used to delete a mini program.
     * @param req DeleteMNPRequest
     * @return DeleteMNPResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMNPResponse DeleteMNP(DeleteMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMNP", DeleteMNPResponse.class);
    }

    /**
     *This API is used to deletes a team.
     * @param req DeleteTeamRequest
     * @return DeleteTeamResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamResponse DeleteTeam(DeleteTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTeam", DeleteTeamResponse.class);
    }

    /**
     *This API is used to delete a team member.
     * @param req DeleteTeamMemberRequest
     * @return DeleteTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamMemberResponse DeleteTeamMember(DeleteTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTeamMember", DeleteTeamMemberResponse.class);
    }

    /**
     *This API is used to delete a user.
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *This API is used to retrieve the line chart data for selected superapp metrics.
     * @param req DescribeAPPDataDetailLineChartRequest
     * @return DescribeAPPDataDetailLineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPPDataDetailLineChartResponse DescribeAPPDataDetailLineChart(DescribeAPPDataDetailLineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPPDataDetailLineChart", DescribeAPPDataDetailLineChartResponse.class);
    }

    /**
     *This API is used to retrieve an overview of the superapp data.
     * @param req DescribeAPPDataOverviewRequest
     * @return DescribeAPPDataOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPPDataOverviewResponse DescribeAPPDataOverview(DescribeAPPDataOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPPDataOverview", DescribeAPPDataOverviewResponse.class);
    }

    /**
     *This API is used to retrieve the advertising line chart data for a mini program within a specified date range.
     * @param req DescribeAdvertisingLineChartRequest
     * @return DescribeAdvertisingLineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdvertisingLineChartResponse DescribeAdvertisingLineChart(DescribeAdvertisingLineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdvertisingLineChart", DescribeAdvertisingLineChartResponse.class);
    }

    /**
     *This API is used to retrieve an overview of mini program ad metrics within a specified date range.
     * @param req DescribeAdvertisingOverviewRequest
     * @return DescribeAdvertisingOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdvertisingOverviewResponse DescribeAdvertisingOverview(DescribeAdvertisingOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdvertisingOverview", DescribeAdvertisingOverviewResponse.class);
    }

    /**
     *This API is used to query the application details.
     * @param req DescribeApplicationRequest
     * @return DescribeApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationResponse DescribeApplication(DescribeApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplication", DescribeApplicationResponse.class);
    }

    /**
     *This API is used to query the configuration files of an application.
     * @param req DescribeApplicationConfigFileRequest
     * @return DescribeApplicationConfigFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationConfigFileResponse DescribeApplicationConfigFile(DescribeApplicationConfigFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationConfigFile", DescribeApplicationConfigFileResponse.class);
    }

    /**
     *This API is used to retrieve the configuration details for an superapp.
     * @param req DescribeApplicationConfigInfosRequest
     * @return DescribeApplicationConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationConfigInfosResponse DescribeApplicationConfigInfos(DescribeApplicationConfigInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationConfigInfos", DescribeApplicationConfigInfosResponse.class);
    }

    /**
     *This API is used to query the applications.
     * @param req DescribeApplicationListRequest
     * @return DescribeApplicationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationListResponse DescribeApplicationList(DescribeApplicationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationList", DescribeApplicationListResponse.class);
    }

    /**
     *This API is used to list sensitive APIs of an application.
     * @param req DescribeApplicationSensitiveAPIListRequest
     * @return DescribeApplicationSensitiveAPIListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationSensitiveAPIListResponse DescribeApplicationSensitiveAPIList(DescribeApplicationSensitiveAPIListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationSensitiveAPIList", DescribeApplicationSensitiveAPIListResponse.class);
    }

    /**
     *This API is used to query the global domain allowlist and blocklist.
     * @param req DescribeGlobalDomainACLRequest
     * @return DescribeGlobalDomainACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalDomainACLResponse DescribeGlobalDomainACL(DescribeGlobalDomainACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalDomainACL", DescribeGlobalDomainACLResponse.class);
    }

    /**
     *This API is used to retrieve a global overview summary of usage statistics.
     * @param req DescribeGlobalOverviewDataSummaryRequest
     * @return DescribeGlobalOverviewDataSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalOverviewDataSummaryResponse DescribeGlobalOverviewDataSummary(DescribeGlobalOverviewDataSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalOverviewDataSummary", DescribeGlobalOverviewDataSummaryResponse.class);
    }

    /**
     *This API is used to retrieve the detailed report data for global overview within a specified date range.
     * @param req DescribeGlobalOverviewReportDetailRequest
     * @return DescribeGlobalOverviewReportDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalOverviewReportDetailResponse DescribeGlobalOverviewReportDetail(DescribeGlobalOverviewReportDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalOverviewReportDetail", DescribeGlobalOverviewReportDetailResponse.class);
    }

    /**
     *This API is used to retrieve the detailed visit analysis data for a mini game within a specified date range.
     * @param req DescribeMNGAccessAnalysisDetailRequest
     * @return DescribeMNGAccessAnalysisDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGAccessAnalysisDetailResponse DescribeMNGAccessAnalysisDetail(DescribeMNGAccessAnalysisDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGAccessAnalysisDetail", DescribeMNGAccessAnalysisDetailResponse.class);
    }

    /**
     *This API is used to retrieve line chart analysis data for mini game visits.
     * @param req DescribeMNGAccessAnalysisLineChartRequest
     * @return DescribeMNGAccessAnalysisLineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGAccessAnalysisLineChartResponse DescribeMNGAccessAnalysisLineChart(DescribeMNGAccessAnalysisLineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGAccessAnalysisLineChart", DescribeMNGAccessAnalysisLineChartResponse.class);
    }

    /**
     *This API is used to retrieve an overview of visit analysis data for a mini game within a specified date range.
     * @param req DescribeMNGAccessAnalysisOverviewRequest
     * @return DescribeMNGAccessAnalysisOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGAccessAnalysisOverviewResponse DescribeMNGAccessAnalysisOverview(DescribeMNGAccessAnalysisOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGAccessAnalysisOverview", DescribeMNGAccessAnalysisOverviewResponse.class);
    }

    /**
     *This API is used to retrieve the real-time active user statistics for a mini game.
     * @param req DescribeMNGActiveUserRealTimeStatisticsRequest
     * @return DescribeMNGActiveUserRealTimeStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGActiveUserRealTimeStatisticsResponse DescribeMNGActiveUserRealTimeStatistics(DescribeMNGActiveUserRealTimeStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGActiveUserRealTimeStatistics", DescribeMNGActiveUserRealTimeStatisticsResponse.class);
    }

    /**
     *This API is used to retrieve the advertising detailed data for a mini game over a specified period.
     * @param req DescribeMNGAdvertisingDetailRequest
     * @return DescribeMNGAdvertisingDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGAdvertisingDetailResponse DescribeMNGAdvertisingDetail(DescribeMNGAdvertisingDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGAdvertisingDetail", DescribeMNGAdvertisingDetailResponse.class);
    }

    /**
     *This API is used to retrieve mini game advertising data in a line chart format.
     * @param req DescribeMNGAdvertisingLineChartRequest
     * @return DescribeMNGAdvertisingLineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGAdvertisingLineChartResponse DescribeMNGAdvertisingLineChart(DescribeMNGAdvertisingLineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGAdvertisingLineChart", DescribeMNGAdvertisingLineChartResponse.class);
    }

    /**
     *This API is used to retrieve an overview of mini game ad metrics within a specified date range.
     * @param req DescribeMNGAdvertisingOverviewRequest
     * @return DescribeMNGAdvertisingOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGAdvertisingOverviewResponse DescribeMNGAdvertisingOverview(DescribeMNGAdvertisingOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGAdvertisingOverview", DescribeMNGAdvertisingOverviewResponse.class);
    }

    /**
     *This API is used to retrieve the detailed mini game monthly active user data.
     * @param req DescribeMNGMAUDataDetailRequest
     * @return DescribeMNGMAUDataDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGMAUDataDetailResponse DescribeMNGMAUDataDetail(DescribeMNGMAUDataDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGMAUDataDetail", DescribeMNGMAUDataDetailResponse.class);
    }

    /**
     *This API is used to retrieve mini game monthly active user data in a line chart format.
     * @param req DescribeMNGMAULineChartRequest
     * @return DescribeMNGMAULineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGMAULineChartResponse DescribeMNGMAULineChart(DescribeMNGMAULineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGMAULineChart", DescribeMNGMAULineChartResponse.class);
    }

    /**
     *This API is used to retrieve MAU comparison data for a mini game between two months.
     * @param req DescribeMNGMAUMonthlyComparisonMetricCardRequest
     * @return DescribeMNGMAUMonthlyComparisonMetricCardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGMAUMonthlyComparisonMetricCardResponse DescribeMNGMAUMonthlyComparisonMetricCard(DescribeMNGMAUMonthlyComparisonMetricCardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGMAUMonthlyComparisonMetricCard", DescribeMNGMAUMonthlyComparisonMetricCardResponse.class);
    }

    /**
     *This API is used to retrieve the line chart data for mini game payment.
     * @param req DescribeMNGPaymentLineChartRequest
     * @return DescribeMNGPaymentLineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGPaymentLineChartResponse DescribeMNGPaymentLineChart(DescribeMNGPaymentLineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGPaymentLineChart", DescribeMNGPaymentLineChartResponse.class);
    }

    /**
     *This API is used to retrieve an overview of mini game payment data within a specified period.
     * @param req DescribeMNGPaymentOverviewRequest
     * @return DescribeMNGPaymentOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGPaymentOverviewResponse DescribeMNGPaymentOverview(DescribeMNGPaymentOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGPaymentOverview", DescribeMNGPaymentOverviewResponse.class);
    }

    /**
     *This API is used to retrieve a detailed payment report data for a mini game.
     * @param req DescribeMNGPaymentReportDetailRequest
     * @return DescribeMNGPaymentReportDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGPaymentReportDetailResponse DescribeMNGPaymentReportDetail(DescribeMNGPaymentReportDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGPaymentReportDetail", DescribeMNGPaymentReportDetailResponse.class);
    }

    /**
     *This API is used to retrieve the mini game payment retention data.
     * @param req DescribeMNGPaymentRetentionAnalysisRequest
     * @return DescribeMNGPaymentRetentionAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGPaymentRetentionAnalysisResponse DescribeMNGPaymentRetentionAnalysis(DescribeMNGPaymentRetentionAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGPaymentRetentionAnalysis", DescribeMNGPaymentRetentionAnalysisResponse.class);
    }

    /**
     *This API is used to retrieve user retention data for a mini game within a specified date range.
     * @param req DescribeMNGRetentionDataRequest
     * @return DescribeMNGRetentionDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNGRetentionDataResponse DescribeMNGRetentionData(DescribeMNGRetentionDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNGRetentionData", DescribeMNGRetentionDataResponse.class);
    }

    /**
     *This API is used to query the mini program details.
     * @param req DescribeMNPRequest
     * @return DescribeMNPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPResponse DescribeMNP(DescribeMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNP", DescribeMNPResponse.class);
    }

    /**
     *This API is used to retrieve an overview of visit analysis data for a mini program within a specified date range.
     * @param req DescribeMNPAccessAnalysisOverviewRequest
     * @return DescribeMNPAccessAnalysisOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPAccessAnalysisOverviewResponse DescribeMNPAccessAnalysisOverview(DescribeMNPAccessAnalysisOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPAccessAnalysisOverview", DescribeMNPAccessAnalysisOverviewResponse.class);
    }

    /**
     *This API is used to retrieve the real-time active user statistics for a mini program.
     * @param req DescribeMNPActiveUserRealTimeStatisticsRequest
     * @return DescribeMNPActiveUserRealTimeStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPActiveUserRealTimeStatisticsResponse DescribeMNPActiveUserRealTimeStatistics(DescribeMNPActiveUserRealTimeStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPActiveUserRealTimeStatistics", DescribeMNPActiveUserRealTimeStatisticsResponse.class);
    }

    /**
     *This API is used to retrieve the detailed advertising data for a mini program within a specified date range.
     * @param req DescribeMNPAdvertisingDetailRequest
     * @return DescribeMNPAdvertisingDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPAdvertisingDetailResponse DescribeMNPAdvertisingDetail(DescribeMNPAdvertisingDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPAdvertisingDetail", DescribeMNPAdvertisingDetailResponse.class);
    }

    /**
     *This API is used to query the mini program version management information.
     * @param req DescribeMNPAllStageVersionsRequest
     * @return DescribeMNPAllStageVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPAllStageVersionsResponse DescribeMNPAllStageVersions(DescribeMNPAllStageVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPAllStageVersions", DescribeMNPAllStageVersionsResponse.class);
    }

    /**
     *This API is used to list the approval requests related with a mini program version.
     * @param req DescribeMNPApprovalListRequest
     * @return DescribeMNPApprovalListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPApprovalListResponse DescribeMNPApprovalList(DescribeMNPApprovalListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPApprovalList", DescribeMNPApprovalListResponse.class);
    }

    /**
     *This API is used to query the mini program types.
     * @param req DescribeMNPCategoryRequest
     * @return DescribeMNPCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPCategoryResponse DescribeMNPCategory(DescribeMNPCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPCategory", DescribeMNPCategoryResponse.class);
    }

    /**
     *This API is used to query the domain allowlist / blocklist of a mini program.
     * @param req DescribeMNPDomainACLRequest
     * @return DescribeMNPDomainACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPDomainACLResponse DescribeMNPDomainACL(DescribeMNPDomainACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPDomainACL", DescribeMNPDomainACLResponse.class);
    }

    /**
     *This API is used to query the mini programs.
     * @param req DescribeMNPListRequest
     * @return DescribeMNPListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPListResponse DescribeMNPList(DescribeMNPListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPList", DescribeMNPListResponse.class);
    }

    /**
     *This API is used to retrieve the detailed mini program monthly active user data.
     * @param req DescribeMNPMAUDataDetailRequest
     * @return DescribeMNPMAUDataDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPMAUDataDetailResponse DescribeMNPMAUDataDetail(DescribeMNPMAUDataDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPMAUDataDetail", DescribeMNPMAUDataDetailResponse.class);
    }

    /**
     *This API is used to retrieve mini program monthly active user data in a line chart format.
     * @param req DescribeMNPMAULineChartRequest
     * @return DescribeMNPMAULineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPMAULineChartResponse DescribeMNPMAULineChart(DescribeMNPMAULineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPMAULineChart", DescribeMNPMAULineChartResponse.class);
    }

    /**
     *This API is used to retrieve MAU comparison data for a mini program between two months.
     * @param req DescribeMNPMAUMetricCardRequest
     * @return DescribeMNPMAUMetricCardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPMAUMetricCardResponse DescribeMNPMAUMetricCard(DescribeMNPMAUMetricCardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPMAUMetricCard", DescribeMNPMAUMetricCardResponse.class);
    }

    /**
     *DescribeMNPOfflinePackageURL
     * @param req DescribeMNPOfflinePackageURLRequest
     * @return DescribeMNPOfflinePackageURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPOfflinePackageURLResponse DescribeMNPOfflinePackageURL(DescribeMNPOfflinePackageURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPOfflinePackageURL", DescribeMNPOfflinePackageURLResponse.class);
    }

    /**
     *This API is used to retrieve the detailed page visit data for a mini program over a specified period.
     * @param req DescribeMNPPageAnalysisDetailRequest
     * @return DescribeMNPPageAnalysisDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPPageAnalysisDetailResponse DescribeMNPPageAnalysisDetail(DescribeMNPPageAnalysisDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPPageAnalysisDetail", DescribeMNPPageAnalysisDetailResponse.class);
    }

    /**
     *This API is used to query the mini program preview details.
     * @param req DescribeMNPPreviewRequest
     * @return DescribeMNPPreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPPreviewResponse DescribeMNPPreview(DescribeMNPPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPPreview", DescribeMNPPreviewResponse.class);
    }

    /**
     *This API is used to list all released versions of a mini program.
     * @param req DescribeMNPReleasedVersionHistoryRequest
     * @return DescribeMNPReleasedVersionHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPReleasedVersionHistoryResponse DescribeMNPReleasedVersionHistory(DescribeMNPReleasedVersionHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPReleasedVersionHistory", DescribeMNPReleasedVersionHistoryResponse.class);
    }

    /**
     *This API is used to retrieve the line chart data for mini program visit analysis within a given date range.
     * @param req DescribeMNPReportDataLineChartRequest
     * @return DescribeMNPReportDataLineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPReportDataLineChartResponse DescribeMNPReportDataLineChart(DescribeMNPReportDataLineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPReportDataLineChart", DescribeMNPReportDataLineChartResponse.class);
    }

    /**
     *This API is used to retrieve the detailed mini program visit analysis data.
     * @param req DescribeMNPReportDetailRequest
     * @return DescribeMNPReportDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPReportDetailResponse DescribeMNPReportDetail(DescribeMNPReportDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPReportDetail", DescribeMNPReportDetailResponse.class);
    }

    /**
     *This API is used to retrieve user retention data for a mini program within a specified date range.
     * @param req DescribeMNPRetentionDataRequest
     * @return DescribeMNPRetentionDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPRetentionDataResponse DescribeMNPRetentionData(DescribeMNPRetentionDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPRetentionData", DescribeMNPRetentionDataResponse.class);
    }

    /**
     *This API is used to query details of a specific permission request to call sensitive APIs.
     * @param req DescribeMNPSensitiveAPIPermissionApprovalRequest
     * @return DescribeMNPSensitiveAPIPermissionApprovalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPSensitiveAPIPermissionApprovalResponse DescribeMNPSensitiveAPIPermissionApproval(DescribeMNPSensitiveAPIPermissionApprovalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPSensitiveAPIPermissionApproval", DescribeMNPSensitiveAPIPermissionApprovalResponse.class);
    }

    /**
     *This API is used to query permission requests to allow a mini program calling sensitive APIs.
     * @param req DescribeMNPSensitiveAPIPermissionApprovalListRequest
     * @return DescribeMNPSensitiveAPIPermissionApprovalListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPSensitiveAPIPermissionApprovalListResponse DescribeMNPSensitiveAPIPermissionApprovalList(DescribeMNPSensitiveAPIPermissionApprovalListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPSensitiveAPIPermissionApprovalList", DescribeMNPSensitiveAPIPermissionApprovalListResponse.class);
    }

    /**
     *This API is used to query the list of sensitive APIs that available to a mini program.
     * @param req DescribeMNPSensitiveAPIPermissionListRequest
     * @return DescribeMNPSensitiveAPIPermissionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPSensitiveAPIPermissionListResponse DescribeMNPSensitiveAPIPermissionList(DescribeMNPSensitiveAPIPermissionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPSensitiveAPIPermissionList", DescribeMNPSensitiveAPIPermissionListResponse.class);
    }

    /**
     *This API is used to query the mini program version creation results.
     * @param req DescribeMNPVersionRequest
     * @return DescribeMNPVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMNPVersionResponse DescribeMNPVersion(DescribeMNPVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMNPVersion", DescribeMNPVersionResponse.class);
    }

    /**
     *This API is used to retrieve the detailed standard payment data for specified  mini programs within a specified date range.
     * @param req DescribePaymentDataDetailRequest
     * @return DescribePaymentDataDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePaymentDataDetailResponse DescribePaymentDataDetail(DescribePaymentDataDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePaymentDataDetail", DescribePaymentDataDetailResponse.class);
    }

    /**
     *This API is used to retrieve the line chart data related to standard payment for a mini program within a specified date range.
     * @param req DescribePaymentDataLineChartRequest
     * @return DescribePaymentDataLineChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribePaymentDataLineChartResponse DescribePaymentDataLineChart(DescribePaymentDataLineChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePaymentDataLineChart", DescribePaymentDataLineChartResponse.class);
    }

    /**
     *This API is used to retrieve an overview of mini program payment data within a specified date range.
     * @param req DescribePaymentDataOverviewRequest
     * @return DescribePaymentDataOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePaymentDataOverviewResponse DescribePaymentDataOverview(DescribePaymentDataOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePaymentDataOverview", DescribePaymentDataOverviewResponse.class);
    }

    /**
     *This API is used to query the roles.
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *This API is used to query the team details.
     * @param req DescribeTeamRequest
     * @return DescribeTeamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamResponse DescribeTeam(DescribeTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeam", DescribeTeamResponse.class);
    }

    /**
     *This API is used to query the teams.
     * @param req DescribeTeamListRequest
     * @return DescribeTeamListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamListResponse DescribeTeamList(DescribeTeamListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeamList", DescribeTeamListResponse.class);
    }

    /**
     *This API is used to query the team members.
     * @param req DescribeTeamMemberListRequest
     * @return DescribeTeamMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamMemberListResponse DescribeTeamMemberList(DescribeTeamMemberListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeamMemberList", DescribeTeamMemberListResponse.class);
    }

    /**
     *This API is used to obtain a temporary key for file uploads.
     * @param req DescribeTempSecret4UploadFile2CosRequest
     * @return DescribeTempSecret4UploadFile2CosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTempSecret4UploadFile2CosResponse DescribeTempSecret4UploadFile2Cos(DescribeTempSecret4UploadFile2CosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTempSecret4UploadFile2Cos", DescribeTempSecret4UploadFile2CosResponse.class);
    }

    /**
     *This API is used to query the user details.
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUser", DescribeUserResponse.class);
    }

    /**
     *This API is used to query the users.
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserList", DescribeUserListResponse.class);
    }

    /**
     *This API is used to set a sensitive API to restricted.
     * @param req DisableApplicationSensitiveAPIRequest
     * @return DisableApplicationSensitiveAPIResponse
     * @throws TencentCloudSDKException
     */
    public DisableApplicationSensitiveAPIResponse DisableApplicationSensitiveAPI(DisableApplicationSensitiveAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableApplicationSensitiveAPI", DisableApplicationSensitiveAPIResponse.class);
    }

    /**
     *This API is used to set an application sensitive API to public.
     * @param req EnableApplicationSensitiveAPIRequest
     * @return EnableApplicationSensitiveAPIResponse
     * @throws TencentCloudSDKException
     */
    public EnableApplicationSensitiveAPIResponse EnableApplicationSensitiveAPI(EnableApplicationSensitiveAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableApplicationSensitiveAPI", EnableApplicationSensitiveAPIResponse.class);
    }

    /**
     *This API is used to change the application information.
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplication", ModifyApplicationResponse.class);
    }

    /**
     *This API is used to edit the configuration of a superapp.
     * @param req ModifyApplicationConfigRequest
     * @return ModifyApplicationConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationConfigResponse ModifyApplicationConfig(ModifyApplicationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationConfig", ModifyApplicationConfigResponse.class);
    }

    /**
     *This API is used to modify the domain allowlist or blocklist.
     * @param req ModifyGlobalDomainRequest
     * @return ModifyGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalDomainResponse ModifyGlobalDomain(ModifyGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalDomain", ModifyGlobalDomainResponse.class);
    }

    /**
     *This API is used to modify the mini program information.
     * @param req ModifyMNPRequest
     * @return ModifyMNPResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMNPResponse ModifyMNP(ModifyMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMNP", ModifyMNPResponse.class);
    }

    /**
     *This API is used to edit the mini program domain information.
     * @param req ModifyMNPDomainRequest
     * @return ModifyMNPDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMNPDomainResponse ModifyMNPDomain(ModifyMNPDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMNPDomain", ModifyMNPDomainResponse.class);
    }

    /**
     *This API is used to change the team information.
     * @param req ModifyTeamRequest
     * @return ModifyTeamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamResponse ModifyTeam(ModifyTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTeam", ModifyTeamResponse.class);
    }

    /**
     *This API is used to modify the team member information.
     * @param req ModifyTeamMemberRequest
     * @return ModifyTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamMemberResponse ModifyTeamMember(ModifyTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTeamMember", ModifyTeamMemberResponse.class);
    }

    /**
     *This API is used to modify the user information.
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *This API is used to approve or reject the release of a mini program version.
     * @param req ProcessMNPApprovalRequest
     * @return ProcessMNPApprovalResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMNPApprovalResponse ProcessMNPApproval(ProcessMNPApprovalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMNPApproval", ProcessMNPApprovalResponse.class);
    }

    /**
     *This API is used to approve or reject the sensitive API permission requests.
     * @param req ProcessMNPSensitiveAPIPermissionApprovalRequest
     * @return ProcessMNPSensitiveAPIPermissionApprovalResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMNPSensitiveAPIPermissionApprovalResponse ProcessMNPSensitiveAPIPermissionApproval(ProcessMNPSensitiveAPIPermissionApprovalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ProcessMNPSensitiveAPIPermissionApproval", ProcessMNPSensitiveAPIPermissionApprovalResponse.class);
    }

    /**
     *This API is used to release a mini program version.
     * @param req ReleaseMNPVersionRequest
     * @return ReleaseMNPVersionResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseMNPVersionResponse ReleaseMNPVersion(ReleaseMNPVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseMNPVersion", ReleaseMNPVersionResponse.class);
    }

    /**
     *This API is used to remove a mini program.
     * @param req RemoveMNPRequest
     * @return RemoveMNPResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMNPResponse RemoveMNP(RemoveMNPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveMNP", RemoveMNPResponse.class);
    }

    /**
     *This API is used to rollback a mini program online version.
     * @param req RollbackMNPVersionRequest
     * @return RollbackMNPVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollbackMNPVersionResponse RollbackMNPVersion(RollbackMNPVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackMNPVersion", RollbackMNPVersionResponse.class);
    }

}
