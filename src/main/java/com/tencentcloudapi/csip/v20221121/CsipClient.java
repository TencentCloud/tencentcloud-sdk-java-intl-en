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
package com.tencentcloudapi.csip.v20221121;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.csip.v20221121.models.*;

public class CsipClient extends AbstractClient{
    private static String endpoint = "csip.intl.tencentcloudapi.com";
    private static String service = "csip";
    private static String version = "2022-11-21";

    public CsipClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CsipClient(Credential credential, String region, ClientProfile profile) {
        super(CsipClient.endpoint, CsipClient.version, credential, region, profile);
    }

    /**
     *This API is used to add the CAM role of Cloud Security Center (CSC) to the current account. The name of the CAM role is "csip".
     * @param req AddNewBindRoleUserRequest
     * @return AddNewBindRoleUserResponse
     * @throws TencentCloudSDKException
     */
    public AddNewBindRoleUserResponse AddNewBindRoleUser(AddNewBindRoleUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNewBindRoleUser", AddNewBindRoleUserResponse.class);
    }

    /**
     *Detect AK async task.
     * @param req CreateAccessKeyCheckTaskRequest
     * @return CreateAccessKeyCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeyCheckTaskResponse CreateAccessKeyCheckTask(CreateAccessKeyCheckTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeyCheckTask", CreateAccessKeyCheckTaskResponse.class);
    }

    /**
     *Trigger an AK asset sync task.
     * @param req CreateAccessKeySyncTaskRequest
     * @return CreateAccessKeySyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeySyncTaskResponse CreateAccessKeySyncTask(CreateAccessKeySyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeySyncTask", CreateAccessKeySyncTaskResponse.class);
    }

    /**
     *This API is used to create an asset with the specific domain/IP.
     * @param req CreateDomainAndIpRequest
     * @return CreateDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAndIpResponse CreateDomainAndIp(CreateDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainAndIp", CreateDomainAndIpResponse.class);
    }

    /**
     *This API is used to create a risk scan task. 
     * @param req CreateRiskCenterScanTaskRequest
     * @return CreateRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskCenterScanTaskResponse CreateRiskCenterScanTask(CreateRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRiskCenterScanTask", CreateRiskCenterScanTaskResponse.class);
    }

    /**
     *This API is used to delete assets.
     * @param req DeleteDomainAndIpRequest
     * @return DeleteDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAndIpResponse DeleteDomainAndIp(DeleteDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainAndIp", DeleteDomainAndIpResponse.class);
    }

    /**
     *This API is used to delete a risk scan task.
     * @param req DeleteRiskScanTaskRequest
     * @return DeleteRiskScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskScanTaskResponse DeleteRiskScanTask(DeleteRiskScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskScanTask", DeleteRiskScanTaskResponse.class);
    }

    /**
     *Retrieve the call record list.
     * @param req DescribeAbnormalCallRecordRequest
     * @return DescribeAbnormalCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalCallRecordResponse DescribeAbnormalCallRecord(DescribeAbnormalCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalCallRecord", DescribeAbnormalCallRecordResponse.class);
    }

    /**
     *List of alarm records for access keys.
     * @param req DescribeAccessKeyAlarmRequest
     * @return DescribeAccessKeyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmResponse DescribeAccessKeyAlarm(DescribeAccessKeyAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarm", DescribeAccessKeyAlarmResponse.class);
    }

    /**
     *Alarm Record Details for Access Key.
     * @param req DescribeAccessKeyAlarmDetailRequest
     * @return DescribeAccessKeyAlarmDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmDetailResponse DescribeAccessKeyAlarmDetail(DescribeAccessKeyAlarmDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarmDetail", DescribeAccessKeyAlarmDetailResponse.class);
    }

    /**
     *Obtain user access key asset list.
     * @param req DescribeAccessKeyAssetRequest
     * @return DescribeAccessKeyAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAssetResponse DescribeAccessKeyAsset(DescribeAccessKeyAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAsset", DescribeAccessKeyAssetResponse.class);
    }

    /**
     *Access key risk record list.
     * @param req DescribeAccessKeyRiskRequest
     * @return DescribeAccessKeyRiskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskResponse DescribeAccessKeyRisk(DescribeAccessKeyRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRisk", DescribeAccessKeyRiskResponse.class);
    }

    /**
     *Access Key Risk Record Details.
     * @param req DescribeAccessKeyRiskDetailRequest
     * @return DescribeAccessKeyRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskDetailResponse DescribeAccessKeyRiskDetail(DescribeAccessKeyRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRiskDetail", DescribeAccessKeyRiskDetailResponse.class);
    }

    /**
     *Query the user's account details.
     * @param req DescribeAccessKeyUserDetailRequest
     * @return DescribeAccessKeyUserDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserDetailResponse DescribeAccessKeyUserDetail(DescribeAccessKeyUserDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserDetail", DescribeAccessKeyUserDetailResponse.class);
    }

    /**
     *Query the account list of a user.
     * @param req DescribeAccessKeyUserListRequest
     * @return DescribeAccessKeyUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserListResponse DescribeAccessKeyUserList(DescribeAccessKeyUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserList", DescribeAccessKeyUserListResponse.class);
    }

    /**
     *Query the process list of host nodes under the exposed path in cloud boundary analysis.
     * @param req DescribeAssetProcessListRequest
     * @return DescribeAssetProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessListResponse DescribeAssetProcessList(DescribeAssetProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessList", DescribeAssetProcessListResponse.class);
    }

    /**
     *Cloud Defense Asset Center Statistics
     * @param req DescribeCFWAssetStatisticsRequest
     * @return DescribeCFWAssetStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFWAssetStatisticsResponse DescribeCFWAssetStatistics(DescribeCFWAssetStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFWAssetStatistics", DescribeCFWAssetStatisticsResponse.class);
    }

    /**
     *Obtain risk center risk overview example.
     * @param req DescribeCSIPRiskStatisticsRequest
     * @return DescribeCSIPRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPRiskStatisticsResponse DescribeCSIPRiskStatistics(DescribeCSIPRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPRiskStatistics", DescribeCSIPRiskStatisticsResponse.class);
    }

    /**
     *This API is used to query details of CVM assets.
     * @param req DescribeCVMAssetInfoRequest
     * @return DescribeCVMAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetInfoResponse DescribeCVMAssetInfo(DescribeCVMAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssetInfo", DescribeCVMAssetInfoResponse.class);
    }

    /**
     *This API is used to query the list of CVM assets.
     * @param req DescribeCVMAssetsRequest
     * @return DescribeCVMAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetsResponse DescribeCVMAssets(DescribeCVMAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssets", DescribeCVMAssetsResponse.class);
    }

    /**
     *Retrieve the call record list.
     * @param req DescribeCallRecordRequest
     * @return DescribeCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallRecordResponse DescribeCallRecord(DescribeCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallRecord", DescribeCallRecordResponse.class);
    }

    /**
     *This example shows you how to obtain the cluster list.
     * @param req DescribeClusterAssetsRequest
     * @return DescribeClusterAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetsResponse DescribeClusterAssets(DescribeClusterAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssets", DescribeClusterAssetsResponse.class);
    }

    /**
     *This API is used to list cluster pods.
     * @param req DescribeClusterPodAssetsRequest
     * @return DescribeClusterPodAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodAssetsResponse DescribeClusterPodAssets(DescribeClusterPodAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodAssets", DescribeClusterPodAssetsResponse.class);
    }

    /**
     *This API is used to query details of a database asset. 
     * @param req DescribeDbAssetInfoRequest
     * @return DescribeDbAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetInfoResponse DescribeDbAssetInfo(DescribeDbAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssetInfo", DescribeDbAssetInfoResponse.class);
    }

    /**
     *This API is used to list database assets.
     * @param req DescribeDbAssetsRequest
     * @return DescribeDbAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetsResponse DescribeDbAssets(DescribeDbAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssets", DescribeDbAssetsResponse.class);
    }

    /**
     *This API is used to list domain assets. 
     * @param req DescribeDomainAssetsRequest
     * @return DescribeDomainAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAssetsResponse DescribeDomainAssets(DescribeDomainAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainAssets", DescribeDomainAssetsResponse.class);
    }

    /**
     *Cloud boundary analysis asset category.
     * @param req DescribeExposeAssetCategoryRequest
     * @return DescribeExposeAssetCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeAssetCategoryResponse DescribeExposeAssetCategory(DescribeExposeAssetCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeAssetCategory", DescribeExposeAssetCategoryResponse.class);
    }

    /**
     *Query the node of the cloud boundary analysis path.
     * @param req DescribeExposePathRequest
     * @return DescribeExposePathResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposePathResponse DescribeExposePath(DescribeExposePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposePath", DescribeExposePathResponse.class);
    }

    /**
     *Cloud Boundary Analysis Asset List.
     * @param req DescribeExposuresRequest
     * @return DescribeExposuresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposuresResponse DescribeExposures(DescribeExposuresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposures", DescribeExposuresResponse.class);
    }

    /**
     *Obtain Gateway List
     * @param req DescribeGatewayAssetsRequest
     * @return DescribeGatewayAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayAssetsResponse DescribeGatewayAssets(DescribeGatewayAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayAssets", DescribeGatewayAssetsResponse.class);
    }

    /**
     *Query the high-risk baseline risk list of host nodes under the exposed path in cloud boundary analysis.
     * @param req DescribeHighBaseLineRiskListRequest
     * @return DescribeHighBaseLineRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHighBaseLineRiskListResponse DescribeHighBaseLineRiskList(DescribeHighBaseLineRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHighBaseLineRiskList", DescribeHighBaseLineRiskListResponse.class);
    }

    /**
     *This API is used to query the list of TCP listeners.
     * @param req DescribeListenerListRequest
     * @return DescribeListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerListResponse DescribeListenerList(DescribeListenerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerList", DescribeListenerListResponse.class);
    }

    /**
     *Obtain Network Interface Card List
     * @param req DescribeNICAssetsRequest
     * @return DescribeNICAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNICAssetsResponse DescribeNICAssets(DescribeNICAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNICAssets", DescribeNICAssetsResponse.class);
    }

    /**
     *Check group account details
     * @param req DescribeOrganizationInfoRequest
     * @return DescribeOrganizationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationInfoResponse DescribeOrganizationInfo(DescribeOrganizationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationInfo", DescribeOrganizationInfoResponse.class);
    }

    /**
     *Query group account user list
     * @param req DescribeOrganizationUserInfoRequest
     * @return DescribeOrganizationUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationUserInfoResponse DescribeOrganizationUserInfo(DescribeOrganizationUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationUserInfo", DescribeOrganizationUserInfoResponse.class);
    }

    /**
     *Asset list.
     * @param req DescribeOtherCloudAssetsRequest
     * @return DescribeOtherCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOtherCloudAssetsResponse DescribeOtherCloudAssets(DescribeOtherCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOtherCloudAssets", DescribeOtherCloudAssetsResponse.class);
    }

    /**
     *This API is used to query the list of public IP assets.
     * @param req DescribePublicIpAssetsRequest
     * @return DescribePublicIpAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicIpAssetsResponse DescribePublicIpAssets(DescribePublicIpAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicIpAssets", DescribePublicIpAssetsResponse.class);
    }

    /**
     *Repository Image List
     * @param req DescribeRepositoryImageAssetsRequest
     * @return DescribeRepositoryImageAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryImageAssetsResponse DescribeRepositoryImageAssets(DescribeRepositoryImageAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositoryImageAssets", DescribeRepositoryImageAssetsResponse.class);
    }

    /**
     *This API is used to query the list of configuration risks by assets.
     * @param req DescribeRiskCenterAssetViewCFGRiskListRequest
     * @return DescribeRiskCenterAssetViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewCFGRiskListResponse DescribeRiskCenterAssetViewCFGRiskList(DescribeRiskCenterAssetViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewCFGRiskList", DescribeRiskCenterAssetViewCFGRiskListResponse.class);
    }

    /**
     *This API is used to query the list of port risks by assets.
     * @param req DescribeRiskCenterAssetViewPortRiskListRequest
     * @return DescribeRiskCenterAssetViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewPortRiskListResponse DescribeRiskCenterAssetViewPortRiskList(DescribeRiskCenterAssetViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewPortRiskList", DescribeRiskCenterAssetViewPortRiskListResponse.class);
    }

    /**
     *This API is used to query the list of vulnerabilities by assets.
     * @param req DescribeRiskCenterAssetViewVULRiskListRequest
     * @return DescribeRiskCenterAssetViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewVULRiskListResponse DescribeRiskCenterAssetViewVULRiskList(DescribeRiskCenterAssetViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewVULRiskList", DescribeRiskCenterAssetViewVULRiskListResponse.class);
    }

    /**
     *This API is used to query the list of weak passwords by assets.
     * @param req DescribeRiskCenterAssetViewWeakPasswordRiskListRequest
     * @return DescribeRiskCenterAssetViewWeakPasswordRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewWeakPasswordRiskListResponse DescribeRiskCenterAssetViewWeakPasswordRiskList(DescribeRiskCenterAssetViewWeakPasswordRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewWeakPasswordRiskList", DescribeRiskCenterAssetViewWeakPasswordRiskListResponse.class);
    }

    /**
     *Obtain Configuration Risk List from Configuration's Perspective
     * @param req DescribeRiskCenterCFGViewCFGRiskListRequest
     * @return DescribeRiskCenterCFGViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterCFGViewCFGRiskListResponse DescribeRiskCenterCFGViewCFGRiskList(DescribeRiskCenterCFGViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterCFGViewCFGRiskList", DescribeRiskCenterCFGViewCFGRiskListResponse.class);
    }

    /**
     *This API is used to query the list of port risks by ports.
     * @param req DescribeRiskCenterPortViewPortRiskListRequest
     * @return DescribeRiskCenterPortViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterPortViewPortRiskListResponse DescribeRiskCenterPortViewPortRiskList(DescribeRiskCenterPortViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterPortViewPortRiskList", DescribeRiskCenterPortViewPortRiskListResponse.class);
    }

    /**
     *This API is used to query the list of services in risk.
     * @param req DescribeRiskCenterServerRiskListRequest
     * @return DescribeRiskCenterServerRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterServerRiskListResponse DescribeRiskCenterServerRiskList(DescribeRiskCenterServerRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterServerRiskList", DescribeRiskCenterServerRiskListResponse.class);
    }

    /**
     *This API is used to query the list of vulnerabilities by vulnerabilities.
     * @param req DescribeRiskCenterVULViewVULRiskListRequest
     * @return DescribeRiskCenterVULViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterVULViewVULRiskListResponse DescribeRiskCenterVULViewVULRiskList(DescribeRiskCenterVULViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterVULViewVULRiskList", DescribeRiskCenterVULViewVULRiskListResponse.class);
    }

    /**
     *This API is used to get the list of content risks.
     * @param req DescribeRiskCenterWebsiteRiskListRequest
     * @return DescribeRiskCenterWebsiteRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterWebsiteRiskListResponse DescribeRiskCenterWebsiteRiskList(DescribeRiskCenterWebsiteRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterWebsiteRiskList", DescribeRiskCenterWebsiteRiskListResponse.class);
    }

    /**
     *This API is used to get the list of scan reports.
     * @param req DescribeScanReportListRequest
     * @return DescribeScanReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanReportListResponse DescribeScanReportList(DescribeScanReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanReportList", DescribeScanReportListResponse.class);
    }

    /**
     *Query the statistical information of cloud boundary analysis scanning results.
     * @param req DescribeScanStatisticRequest
     * @return DescribeScanStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStatisticResponse DescribeScanStatistic(DescribeScanStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanStatistic", DescribeScanStatisticResponse.class);
    }

    /**
     *This API is used to get the list of scan tasks.
     * @param req DescribeScanTaskListRequest
     * @return DescribeScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskListResponse DescribeScanTaskList(DescribeScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskList", DescribeScanTaskListResponse.class);
    }

    /**
     *This API is used to query information of a vulnerability.
     * @param req DescribeSearchBugInfoRequest
     * @return DescribeSearchBugInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchBugInfoResponse DescribeSearchBugInfo(DescribeSearchBugInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchBugInfo", DescribeSearchBugInfoResponse.class);
    }

    /**
     *This API is used to obtain user access key asset list (source IP perspective).
     * @param req DescribeSourceIPAssetRequest
     * @return DescribeSourceIPAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIPAssetResponse DescribeSourceIPAsset(DescribeSourceIPAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceIPAsset", DescribeSourceIPAssetResponse.class);
    }

    /**
     *Query the group's sub-account list
     * @param req DescribeSubUserInfoRequest
     * @return DescribeSubUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubUserInfoResponse DescribeSubUserInfo(DescribeSubUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubUserInfo", DescribeSubUserInfoResponse.class);
    }

    /**
     *This API is used to get the list of subnets.
     * @param req DescribeSubnetAssetsRequest
     * @return DescribeSubnetAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetAssetsResponse DescribeSubnetAssets(DescribeSubnetAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnetAssets", DescribeSubnetAssetsResponse.class);
    }

    /**
     *This API is used to get the list of scan task reports.
     * @param req DescribeTaskLogListRequest
     * @return DescribeTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogListResponse DescribeTaskLogList(DescribeTaskLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogList", DescribeTaskLogListResponse.class);
    }

    /**
     *This API is used to get the temp download link of a report. 
     * @param req DescribeTaskLogURLRequest
     * @return DescribeTaskLogURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogURLResponse DescribeTaskLogURL(DescribeTaskLogURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogURL", DescribeTaskLogURLResponse.class);
    }

    /**
     *Obtain account call record list.
     * @param req DescribeUserCallRecordRequest
     * @return DescribeUserCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCallRecordResponse DescribeUserCallRecord(DescribeUserCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCallRecord", DescribeUserCallRecordResponse.class);
    }

    /**
     *Security Center Risk Center - List of Vulnerabilities.
     * @param req DescribeVULListRequest
     * @return DescribeVULListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULListResponse DescribeVULList(DescribeVULListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULList", DescribeVULListResponse.class);
    }

    /**
     *This API is used to query the advanced configuration of vulnerability scan.
     * @param req DescribeVULRiskAdvanceCFGListRequest
     * @return DescribeVULRiskAdvanceCFGListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskAdvanceCFGListResponse DescribeVULRiskAdvanceCFGList(DescribeVULRiskAdvanceCFGListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskAdvanceCFGList", DescribeVULRiskAdvanceCFGListResponse.class);
    }

    /**
     *Retrieve vulnerability details.
     * @param req DescribeVULRiskDetailRequest
     * @return DescribeVULRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskDetailResponse DescribeVULRiskDetail(DescribeVULRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskDetail", DescribeVULRiskDetailResponse.class);
    }

    /**
     *This API is used to get the list of VPCs.
     * @param req DescribeVpcAssetsRequest
     * @return DescribeVpcAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcAssetsResponse DescribeVpcAssets(DescribeVpcAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcAssets", DescribeVpcAssetsResponse.class);
    }

    /**
     *Query the list of vulnerabilities of host nodes under the exposed path in cloud boundary analysis.
     * @param req DescribeVulRiskListRequest
     * @return DescribeVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskListResponse DescribeVulRiskList(DescribeVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskList", DescribeVulRiskListResponse.class);
    }

    /**
     *Obtain Vulnerability Risk List from Vulnerability's Perspective
     * @param req DescribeVulViewVulRiskListRequest
     * @return DescribeVulViewVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulViewVulRiskListResponse DescribeVulViewVulRiskList(DescribeVulViewVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulViewVulRiskList", DescribeVulViewVulRiskListResponse.class);
    }

    /**
     *Modify Group Account Status
     * @param req ModifyOrganizationAccountStatusRequest
     * @return ModifyOrganizationAccountStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrganizationAccountStatusResponse ModifyOrganizationAccountStatus(ModifyOrganizationAccountStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOrganizationAccountStatus", ModifyOrganizationAccountStatusResponse.class);
    }

    /**
     *This API is used to modify the status of a risk. 
     * @param req ModifyRiskCenterRiskStatusRequest
     * @return ModifyRiskCenterRiskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterRiskStatusResponse ModifyRiskCenterRiskStatus(ModifyRiskCenterRiskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterRiskStatus", ModifyRiskCenterRiskStatusResponse.class);
    }

    /**
     *Modify Risk Center Scan Task
     * @param req ModifyRiskCenterScanTaskRequest
     * @return ModifyRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterScanTaskResponse ModifyRiskCenterScanTask(ModifyRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterScanTask", ModifyRiskCenterScanTaskResponse.class);
    }

    /**
     *This API is used to stop a scan task. 
     * @param req StopRiskCenterTaskRequest
     * @return StopRiskCenterTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRiskCenterTaskResponse StopRiskCenterTask(StopRiskCenterTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRiskCenterTask", StopRiskCenterTaskResponse.class);
    }

    /**
     *Tag the risk or Alarm as processed/ignored.
     * @param req UpdateAccessKeyAlarmStatusRequest
     * @return UpdateAccessKeyAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyAlarmStatusResponse UpdateAccessKeyAlarmStatus(UpdateAccessKeyAlarmStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyAlarmStatus", UpdateAccessKeyAlarmStatusResponse.class);
    }

    /**
     *Edit access key/Source IP remark.
     * @param req UpdateAccessKeyRemarkRequest
     * @return UpdateAccessKeyRemarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyRemarkResponse UpdateAccessKeyRemark(UpdateAccessKeyRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyRemark", UpdateAccessKeyRemarkResponse.class);
    }

}
