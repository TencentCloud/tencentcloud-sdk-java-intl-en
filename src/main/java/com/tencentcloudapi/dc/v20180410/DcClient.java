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
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptDirectConnectTunnelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AcceptDirectConnectTunnel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDirectConnect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectTunnelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDirectConnectTunnel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDirectConnect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectTunnelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDirectConnectTunnel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessPointsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccessPoints"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectTunnelsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDirectConnectTunnels"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDirectConnects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDirectConnectAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDirectConnectAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDirectConnectTunnelAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDirectConnectTunnelAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<RejectDirectConnectTunnelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RejectDirectConnectTunnel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
