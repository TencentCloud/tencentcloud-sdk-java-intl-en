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
package com.tencentcloudapi.dc.v20180410;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dc.v20180410.models.*;

public class DcClient extends AbstractClient{
    private static String endpoint = "dc.tencentcloudapi.com";
    private static String service = "dc";
    private static String version = "2018-04-10";

    public DcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DcClient(Credential credential, String region, ClientProfile profile) {
        super(DcClient.endpoint, DcClient.version, credential, region, profile);
    }

    /**
     *This API is used to accept an application for a dedicated tunnel.
     * @param req AcceptDirectConnectTunnelRequest
     * @return AcceptDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public AcceptDirectConnectTunnelResponse AcceptDirectConnectTunnel(AcceptDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcceptDirectConnectTunnelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptDirectConnectTunnelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcceptDirectConnectTunnel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for an internet tunnel’s CIDR block.
     * @param req ApplyInternetAddressRequest
     * @return ApplyInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public ApplyInternetAddressResponse ApplyInternetAddress(ApplyInternetAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyInternetAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyInternetAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyInternetAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for a connection.
When calling this API, please note that:
You need to complete identity verification for your account; otherwise, you cannot apply for a connection;
If there is any connection in arrears under your account, you cannot apply for more connections.
     * @param req CreateDirectConnectRequest
     * @return CreateDirectConnectResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectResponse CreateDirectConnect(CreateDirectConnectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDirectConnect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a dedicated tunnel.
     * @param req CreateDirectConnectTunnelRequest
     * @return CreateDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectTunnelResponse CreateDirectConnectTunnel(CreateDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectTunnelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectTunnelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDirectConnectTunnel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a connection.
Only connected connections can be deleted.
     * @param req DeleteDirectConnectRequest
     * @return DeleteDirectConnectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectResponse DeleteDirectConnect(DeleteDirectConnectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDirectConnect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a dedicated tunnel.
     * @param req DeleteDirectConnectTunnelRequest
     * @return DeleteDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectTunnelResponse DeleteDirectConnectTunnel(DeleteDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectTunnelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectTunnelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDirectConnectTunnel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query connection access points.

     * @param req DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessPointsResponse DescribeAccessPoints(DescribeAccessPointsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessPointsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessPointsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessPoints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of dedicated tunnels.
     * @param req DescribeDirectConnectTunnelsRequest
     * @return DescribeDirectConnectTunnelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectTunnelsResponse DescribeDirectConnectTunnels(DescribeDirectConnectTunnelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectTunnelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectTunnelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDirectConnectTunnels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of connections.
     * @param req DescribeDirectConnectsRequest
     * @return DescribeDirectConnectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectsResponse DescribeDirectConnects(DescribeDirectConnectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDirectConnects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the public IP address of an internet tunnel.
     * @param req DescribeInternetAddressRequest
     * @return DescribeInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetAddressResponse DescribeInternetAddress(DescribeInternetAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInternetAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInternetAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInternetAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the public IP quota of internet tunnels.
     * @param req DescribeInternetAddressQuotaRequest
     * @return DescribeInternetAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetAddressQuotaResponse DescribeInternetAddressQuota(DescribeInternetAddressQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInternetAddressQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInternetAddressQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInternetAddressQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the public IP address assignment statistics of internet tunnels.
     * @param req DescribeInternetAddressStatisticsRequest
     * @return DescribeInternetAddressStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetAddressStatisticsResponse DescribeInternetAddressStatistics(DescribeInternetAddressStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInternetAddressStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInternetAddressStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInternetAddressStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable a public IP address of internet tunnels.
     * @param req DisableInternetAddressRequest
     * @return DisableInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisableInternetAddressResponse DisableInternetAddress(DisableInternetAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableInternetAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableInternetAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableInternetAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable a public IP address for internet tunnels.
     * @param req EnableInternetAddressRequest
     * @return EnableInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public EnableInternetAddressResponse EnableInternetAddress(EnableInternetAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableInternetAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableInternetAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableInternetAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify connection attributes.
     * @param req ModifyDirectConnectAttributeRequest
     * @return ModifyDirectConnectAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectAttributeResponse ModifyDirectConnectAttribute(ModifyDirectConnectAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDirectConnectAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDirectConnectAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDirectConnectAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the dedicated tunnel attributes.
     * @param req ModifyDirectConnectTunnelAttributeRequest
     * @return ModifyDirectConnectTunnelAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectTunnelAttributeResponse ModifyDirectConnectTunnelAttribute(ModifyDirectConnectTunnelAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDirectConnectTunnelAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDirectConnectTunnelAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDirectConnectTunnelAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reject an application for a dedicated tunnel.
     * @param req RejectDirectConnectTunnelRequest
     * @return RejectDirectConnectTunnelResponse
     * @throws TencentCloudSDKException
     */
    public RejectDirectConnectTunnelResponse RejectDirectConnectTunnel(RejectDirectConnectTunnelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RejectDirectConnectTunnelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RejectDirectConnectTunnelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RejectDirectConnectTunnel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to release an IP address of internet tunnels.
     * @param req ReleaseInternetAddressRequest
     * @return ReleaseInternetAddressResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseInternetAddressResponse ReleaseInternetAddress(ReleaseInternetAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseInternetAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseInternetAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseInternetAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
