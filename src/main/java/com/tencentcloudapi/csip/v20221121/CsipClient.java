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
    private static String endpoint = "csip.tencentcloudapi.com";
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
     *This API is used to stop a scan task. 
     * @param req StopRiskCenterTaskRequest
     * @return StopRiskCenterTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRiskCenterTaskResponse StopRiskCenterTask(StopRiskCenterTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRiskCenterTask", StopRiskCenterTaskResponse.class);
    }

}
