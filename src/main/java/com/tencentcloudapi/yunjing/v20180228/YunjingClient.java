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
package com.tencentcloudapi.yunjing.v20180228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.yunjing.v20180228.models.*;

public class YunjingClient extends AbstractClient{
    private static String endpoint = "yunjing.tencentcloudapi.com";
    private static String service = "yunjing";
    private static String version = "2018-02-28";
    
    public YunjingClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public YunjingClient(Credential credential, String region, ClientProfile profile) {
        super(YunjingClient.endpoint, YunjingClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a allowlist rule.
     * @param req AddLoginWhiteListRequest
     * @return AddLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddLoginWhiteListResponse AddLoginWhiteList(AddLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddLoginWhiteList", AddLoginWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a tag to a server.
     * @param req AddMachineTagRequest
     * @return AddMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public AddMachineTagResponse AddMachineTag(AddMachineTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddMachineTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddMachineTag", AddMachineTagResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to deactivate CWP Pro.
     * @param req CloseProVersionRequest
     * @return CloseProVersionResponse
     * @throws TencentCloudSDKException
     */
    public CloseProVersionResponse CloseProVersion(CloseProVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CloseProVersion", CloseProVersionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a real-time port acquisition task.
     * @param req CreateOpenPortTaskRequest
     * @return CreateOpenPortTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenPortTaskResponse CreateOpenPortTask(CreateOpenPortTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpenPortTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateOpenPortTask", CreateOpenPortTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a real-time process pulling task.
     * @param req CreateProcessTaskRequest
     * @return CreateProcessTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcessTaskResponse CreateProcessTask(CreateProcessTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProcessTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateProcessTask", CreateProcessTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add one or more usual login locations.
     * @param req CreateUsualLoginPlacesRequest
     * @return CreateUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsualLoginPlacesResponse CreateUsualLoginPlaces(CreateUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUsualLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateUsualLoginPlaces", CreateUsualLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete brute force attack records.
     * @param req DeleteBruteAttacksRequest
     * @return DeleteBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBruteAttacksResponse DeleteBruteAttacks(DeleteBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBruteAttacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteBruteAttacks", DeleteBruteAttacksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a allowlist rule.
     * @param req DeleteLoginWhiteListRequest
     * @return DeleteLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginWhiteListResponse DeleteLoginWhiteList(DeleteLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteLoginWhiteList", DeleteLoginWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to uninstall the CWP agent.
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMachine", DeleteMachineResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to remove a tag from a server.
     * @param req DeleteMachineTagRequest
     * @return DeleteMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineTagResponse DeleteMachineTag(DeleteMachineTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMachineTag", DeleteMachineTagResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete malicious request records.
     * @param req DeleteMaliciousRequestsRequest
     * @return DeleteMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestsResponse DeleteMaliciousRequests(DeleteMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMaliciousRequests", DeleteMaliciousRequestsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete trojan records.
     * @param req DeleteMalwaresRequest
     * @return DeleteMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwaresResponse DeleteMalwares(DeleteMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMalwares", DeleteMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete unusual login location records.
     * @param req DeleteNonlocalLoginPlacesRequest
     * @return DeleteNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNonlocalLoginPlacesResponse DeleteNonlocalLoginPlaces(DeleteNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNonlocalLoginPlaces", DeleteNonlocalLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete one or more usual login locations.
     * @param req DeleteUsualLoginPlacesRequest
     * @return DeleteUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsualLoginPlacesResponse DeleteUsualLoginPlaces(DeleteUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsualLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteUsualLoginPlaces", DeleteUsualLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the account statistics list.
     * @param req DescribeAccountStatisticsRequest
     * @return DescribeAccountStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountStatisticsResponse DescribeAccountStatistics(DescribeAccountStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccountStatistics", DescribeAccountStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the account list.
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of vulnerabilities on a single server.
     * @param req DescribeAgentVulsRequest
     * @return DescribeAgentVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentVulsResponse DescribeAgentVuls(DescribeAgentVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentVulsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAgentVuls", DescribeAgentVulsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the alarm settings.
     * @param req DescribeAlarmAttributeRequest
     * @return DescribeAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmAttributeResponse DescribeAlarmAttribute(DescribeAlarmAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAlarmAttribute", DescribeAlarmAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the brute force attack event list.
     * @param req DescribeBruteAttacksRequest
     * @return DescribeBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttacksResponse DescribeBruteAttacks(DescribeBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBruteAttacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBruteAttacks", DescribeBruteAttacksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the component information.
     * @param req DescribeComponentInfoRequest
     * @return DescribeComponentInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentInfoResponse DescribeComponentInfo(DescribeComponentInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComponentInfo", DescribeComponentInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the component statistics list.
     * @param req DescribeComponentStatisticsRequest
     * @return DescribeComponentStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentStatisticsResponse DescribeComponentStatistics(DescribeComponentStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComponentStatistics", DescribeComponentStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the component list.
     * @param req DescribeComponentsRequest
     * @return DescribeComponentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentsResponse DescribeComponents(DescribeComponentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeComponents", DescribeComponentsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the account change history list.
     * @param req DescribeHistoryAccountsRequest
     * @return DescribeHistoryAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryAccountsResponse DescribeHistoryAccounts(DescribeHistoryAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHistoryAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeHistoryAccounts", DescribeHistoryAccountsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of servers affected by a vulnerability.
     * @param req DescribeImpactedHostsRequest
     * @return DescribeImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImpactedHostsResponse DescribeImpactedHosts(DescribeImpactedHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImpactedHostsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeImpactedHosts", DescribeImpactedHostsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of login allowlist entries.
     * @param req DescribeLoginWhiteListRequest
     * @return DescribeLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteListResponse DescribeLoginWhiteList(DescribeLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLoginWhiteList", DescribeLoginWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get server details.
     * @param req DescribeMachineInfoRequest
     * @return DescribeMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineInfoResponse DescribeMachineInfo(DescribeMachineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeMachineInfo", DescribeMachineInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of servers in a specified region.
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeMachines", DescribeMachinesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get malicious request data.
     * @param req DescribeMaliciousRequestsRequest
     * @return DescribeMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaliciousRequestsResponse DescribeMaliciousRequests(DescribeMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeMaliciousRequests", DescribeMaliciousRequestsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of trojan events.
     * @param req DescribeMalwaresRequest
     * @return DescribeMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwaresResponse DescribeMalwares(DescribeMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeMalwares", DescribeMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get unusual login events.
     * @param req DescribeNonlocalLoginPlacesRequest
     * @return DescribeNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNonlocalLoginPlacesResponse DescribeNonlocalLoginPlaces(DescribeNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNonlocalLoginPlaces", DescribeNonlocalLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the statistics on port usage
     * @param req DescribeOpenPortStatisticsRequest
     * @return DescribeOpenPortStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortStatisticsResponse DescribeOpenPortStatistics(DescribeOpenPortStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpenPortStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOpenPortStatistics", DescribeOpenPortStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the status of a real-time port pulling task.
     * @param req DescribeOpenPortTaskStatusRequest
     * @return DescribeOpenPortTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortTaskStatusResponse DescribeOpenPortTaskStatus(DescribeOpenPortTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpenPortTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOpenPortTaskStatus", DescribeOpenPortTaskStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the port list.

     * @param req DescribeOpenPortsRequest
     * @return DescribeOpenPortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortsResponse DescribeOpenPorts(DescribeOpenPortsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpenPortsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOpenPorts", DescribeOpenPortsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the overview statistics of CWP under the current account.
     * @param req DescribeOverviewStatisticsRequest
     * @return DescribeOverviewStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewStatisticsResponse DescribeOverviewStatistics(DescribeOverviewStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeOverviewStatistics", DescribeOverviewStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the CWP Pro information.
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProVersionInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeProVersionInfo", DescribeProVersionInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the process statistics list.
     * @param req DescribeProcessStatisticsRequest
     * @return DescribeProcessStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessStatisticsResponse DescribeProcessStatistics(DescribeProcessStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProcessStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeProcessStatistics", DescribeProcessStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the status of a real-time process pulling task.
     * @param req DescribeProcessTaskStatusRequest
     * @return DescribeProcessTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessTaskStatusResponse DescribeProcessTaskStatus(DescribeProcessTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProcessTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeProcessTaskStatus", DescribeProcessTaskStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the process list.
     * @param req DescribeProcessesRequest
     * @return DescribeProcessesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessesResponse DescribeProcesses(DescribeProcessesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProcessesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeProcesses", DescribeProcessesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the security event message data.
     * @param req DescribeSecurityDynamicsRequest
     * @return DescribeSecurityDynamicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityDynamicsResponse DescribeSecurityDynamics(DescribeSecurityDynamicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityDynamicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecurityDynamics", DescribeSecurityDynamicsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the security event statistics.
     * @param req DescribeSecurityTrendsRequest
     * @return DescribeSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTrendsResponse DescribeSecurityTrends(DescribeSecurityTrendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityTrendsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecurityTrends", DescribeSecurityTrendsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the information of servers associated with a specified tag.
     * @param req DescribeTagMachinesRequest
     * @return DescribeTagMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagMachinesResponse DescribeTagMachines(DescribeTagMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTagMachines", DescribeTagMachinesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get all server tags.
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTags", DescribeTagsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query usual login locations.
     * @param req DescribeUsualLoginPlacesRequest
     * @return DescribeUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsualLoginPlacesResponse DescribeUsualLoginPlaces(DescribeUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsualLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUsualLoginPlaces", DescribeUsualLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get vulnerability details.
     * @param req DescribeVulInfoRequest
     * @return DescribeVulInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulInfoResponse DescribeVulInfo(DescribeVulInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulInfo", DescribeVulInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the vulnerability detection result.

     * @param req DescribeVulScanResultRequest
     * @return DescribeVulScanResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanResultResponse DescribeVulScanResult(DescribeVulScanResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulScanResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVulScanResult", DescribeVulScanResultResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the vulnerability list.
     * @param req DescribeVulsRequest
     * @return DescribeVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsResponse DescribeVuls(DescribeVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVuls", DescribeVulsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the brute force attack data in the weekly CWP Pro report.
     * @param req DescribeWeeklyReportBruteAttacksRequest
     * @return DescribeWeeklyReportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportBruteAttacksResponse DescribeWeeklyReportBruteAttacks(DescribeWeeklyReportBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportBruteAttacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWeeklyReportBruteAttacks", DescribeWeeklyReportBruteAttacksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the details in the weekly CWP Pro report.
     * @param req DescribeWeeklyReportInfoRequest
     * @return DescribeWeeklyReportInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportInfoResponse DescribeWeeklyReportInfo(DescribeWeeklyReportInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWeeklyReportInfo", DescribeWeeklyReportInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the trojan data in the weekly CWP Pro report.
     * @param req DescribeWeeklyReportMalwaresRequest
     * @return DescribeWeeklyReportMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportMalwaresResponse DescribeWeeklyReportMalwares(DescribeWeeklyReportMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWeeklyReportMalwares", DescribeWeeklyReportMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the unusual login location data in the weekly CWP Pro report.
     * @param req DescribeWeeklyReportNonlocalLoginPlacesRequest
     * @return DescribeWeeklyReportNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportNonlocalLoginPlacesResponse DescribeWeeklyReportNonlocalLoginPlaces(DescribeWeeklyReportNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWeeklyReportNonlocalLoginPlaces", DescribeWeeklyReportNonlocalLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the vulnerability data in the weekly CWP Pro report.

     * @param req DescribeWeeklyReportVulsRequest
     * @return DescribeWeeklyReportVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportVulsResponse DescribeWeeklyReportVuls(DescribeWeeklyReportVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportVulsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWeeklyReportVuls", DescribeWeeklyReportVulsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the weekly report list.
     * @param req DescribeWeeklyReportsRequest
     * @return DescribeWeeklyReportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportsResponse DescribeWeeklyReports(DescribeWeeklyReportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeWeeklyReports", DescribeWeeklyReportsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add or edit tags.
     * @param req EditTagsRequest
     * @return EditTagsResponse
     * @throws TencentCloudSDKException
     */
    public EditTagsResponse EditTags(EditTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "EditTags", EditTagsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export brute force attack records into a CSV file.
     * @param req ExportBruteAttacksRequest
     * @return ExportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public ExportBruteAttacksResponse ExportBruteAttacks(ExportBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBruteAttacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ExportBruteAttacks", ExportBruteAttacksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export the malicious request file into a CSV file for download.
     * @param req ExportMaliciousRequestsRequest
     * @return ExportMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public ExportMaliciousRequestsResponse ExportMaliciousRequests(ExportMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ExportMaliciousRequests", ExportMaliciousRequestsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export trojan records into a CSV file.
     * @param req ExportMalwaresRequest
     * @return ExportMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public ExportMalwaresResponse ExportMalwares(ExportMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ExportMalwares", ExportMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to export unusual login location events into a CSV file.
     * @param req ExportNonlocalLoginPlacesRequest
     * @return ExportNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public ExportNonlocalLoginPlacesResponse ExportNonlocalLoginPlaces(ExportNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ExportNonlocalLoginPlaces", ExportNonlocalLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to ignore one or more vulnerabilities.
     * @param req IgnoreImpactedHostsRequest
     * @return IgnoreImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreImpactedHostsResponse IgnoreImpactedHosts(IgnoreImpactedHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IgnoreImpactedHostsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "IgnoreImpactedHosts", IgnoreImpactedHostsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set the current location as the usual login location.
     * @param req MisAlarmNonlocalLoginPlacesRequest
     * @return MisAlarmNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public MisAlarmNonlocalLoginPlacesResponse MisAlarmNonlocalLoginPlaces(MisAlarmNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MisAlarmNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "MisAlarmNonlocalLoginPlaces", MisAlarmNonlocalLoginPlacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify alarm settings.
     * @param req ModifyAlarmAttributeRequest
     * @return ModifyAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmAttributeResponse ModifyAlarmAttribute(ModifyAlarmAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAlarmAttribute", ModifyAlarmAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to set whether to automatically activate CWP Pro for newly added servers.
     * @param req ModifyAutoOpenProVersionConfigRequest
     * @return ModifyAutoOpenProVersionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoOpenProVersionConfigResponse ModifyAutoOpenProVersionConfig(ModifyAutoOpenProVersionConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoOpenProVersionConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAutoOpenProVersionConfig", ModifyAutoOpenProVersionConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to edit a allowlist rule.
     * @param req ModifyLoginWhiteListRequest
     * @return ModifyLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteListResponse ModifyLoginWhiteList(ModifyLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyLoginWhiteList", ModifyLoginWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the renewal flag of CWP Pro.
     * @param req ModifyProVersionRenewFlagRequest
     * @return ModifyProVersionRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProVersionRenewFlagResponse ModifyProVersionRenewFlag(ModifyProVersionRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProVersionRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyProVersionRenewFlag", ModifyProVersionRenewFlagResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to activate CWP Pro.
     * @param req OpenProVersionRequest
     * @return OpenProVersionResponse
     * @throws TencentCloudSDKException
     */
    public OpenProVersionResponse OpenProVersion(OpenProVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenProVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "OpenProVersion", OpenProVersionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to recover isolated trojan files in a batch.
     * @param req RecoverMalwaresRequest
     * @return RecoverMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMalwaresResponse RecoverMalwares(RecoverMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RecoverMalwares", RecoverMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to re-scan for vulnerabilities.
     * @param req RescanImpactedHostRequest
     * @return RescanImpactedHostResponse
     * @throws TencentCloudSDKException
     */
    public RescanImpactedHostResponse RescanImpactedHost(RescanImpactedHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RescanImpactedHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RescanImpactedHost", RescanImpactedHostResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to isolate trojans.
     * @param req SeparateMalwaresRequest
     * @return SeparateMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public SeparateMalwaresResponse SeparateMalwares(SeparateMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SeparateMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SeparateMalwares", SeparateMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to trust a malicious request.
     * @param req TrustMaliciousRequestRequest
     * @return TrustMaliciousRequestResponse
     * @throws TencentCloudSDKException
     */
    public TrustMaliciousRequestResponse TrustMaliciousRequest(TrustMaliciousRequestRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrustMaliciousRequestResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "TrustMaliciousRequest", TrustMaliciousRequestResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to trust an identified trojan file.
     * @param req TrustMalwaresRequest
     * @return TrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public TrustMalwaresResponse TrustMalwares(TrustMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrustMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "TrustMalwares", TrustMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to untrust a malicious request.
     * @param req UntrustMaliciousRequestRequest
     * @return UntrustMaliciousRequestResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMaliciousRequestResponse UntrustMaliciousRequest(UntrustMaliciousRequestRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UntrustMaliciousRequestResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UntrustMaliciousRequest", UntrustMaliciousRequestResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to untrust a trojan file.
     * @param req UntrustMalwaresRequest
     * @return UntrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMalwaresResponse UntrustMalwares(UntrustMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UntrustMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UntrustMalwares", UntrustMalwaresResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
