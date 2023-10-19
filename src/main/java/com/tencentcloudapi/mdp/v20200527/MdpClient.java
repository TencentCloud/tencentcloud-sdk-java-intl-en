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
package com.tencentcloudapi.mdp.v20200527;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mdp.v20200527.models.*;

public class MdpClient extends AbstractClient{
    private static String endpoint = "mdp.tencentcloudapi.com";
    private static String service = "mdp";
    private static String version = "2020-05-27";
    
    public MdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MdpClient(Credential credential, String region, ClientProfile profile) {
        super(MdpClient.endpoint, MdpClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind an LVB domain name to a channel.
     * @param req BindNewLVBDomainWithChannelRequest
     * @return BindNewLVBDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public BindNewLVBDomainWithChannelResponse BindNewLVBDomainWithChannel(BindNewLVBDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindNewLVBDomainWithChannel", BindNewLVBDomainWithChannelResponse.class);
    }

    /**
     *This API is used to create a StreamPackage channel.
     * @param req CreateStreamPackageChannelRequest
     * @return CreateStreamPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageChannelResponse CreateStreamPackageChannel(CreateStreamPackageChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageChannel", CreateStreamPackageChannelResponse.class);
    }

    /**
     *This API is used to create an endpoint on a StreamPackage channel.
     * @param req CreateStreamPackageChannelEndpointRequest
     * @return CreateStreamPackageChannelEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageChannelEndpointResponse CreateStreamPackageChannelEndpoint(CreateStreamPackageChannelEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageChannelEndpoint", CreateStreamPackageChannelEndpointResponse.class);
    }

    /**
     *This API is used to delete endpoints from a StreamPackage channel in batches.
     * @param req DeleteStreamPackageChannelEndpointsRequest
     * @return DeleteStreamPackageChannelEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageChannelEndpointsResponse DeleteStreamPackageChannelEndpoints(DeleteStreamPackageChannelEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageChannelEndpoints", DeleteStreamPackageChannelEndpointsResponse.class);
    }

    /**
     *This API is used to delete StreamPackage channels in batches.
     * @param req DeleteStreamPackageChannelsRequest
     * @return DeleteStreamPackageChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageChannelsResponse DeleteStreamPackageChannels(DeleteStreamPackageChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageChannels", DeleteStreamPackageChannelsResponse.class);
    }

    /**
     *This API is used to query the information of a StreamPackage channel.
     * @param req DescribeStreamPackageChannelRequest
     * @return DescribeStreamPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageChannelResponse DescribeStreamPackageChannel(DescribeStreamPackageChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageChannel", DescribeStreamPackageChannelResponse.class);
    }

    /**
     *This API is used to query the information of multiple StreamPackage channels.
     * @param req DescribeStreamPackageChannelsRequest
     * @return DescribeStreamPackageChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageChannelsResponse DescribeStreamPackageChannels(DescribeStreamPackageChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageChannels", DescribeStreamPackageChannelsResponse.class);
    }

    /**
     *This API is used to modify a StreamPackage channel.
     * @param req ModifyStreamPackageChannelRequest
     * @return ModifyStreamPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageChannelResponse ModifyStreamPackageChannel(ModifyStreamPackageChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageChannel", ModifyStreamPackageChannelResponse.class);
    }

    /**
     *This API is used to modify an endpoint of a StreamPackage channel.
     * @param req ModifyStreamPackageChannelEndpointRequest
     * @return ModifyStreamPackageChannelEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageChannelEndpointResponse ModifyStreamPackageChannelEndpoint(ModifyStreamPackageChannelEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageChannelEndpoint", ModifyStreamPackageChannelEndpointResponse.class);
    }

    /**
     *This API is used to modify the input authentication information of a StreamPackage channel.
     * @param req ModifyStreamPackageChannelInputAuthInfoRequest
     * @return ModifyStreamPackageChannelInputAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageChannelInputAuthInfoResponse ModifyStreamPackageChannelInputAuthInfo(ModifyStreamPackageChannelInputAuthInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageChannelInputAuthInfo", ModifyStreamPackageChannelInputAuthInfoResponse.class);
    }

    /**
     *This API is used to unbind a CDN playback domain name from a channel.
     * @param req UnbindCdnDomainWithChannelRequest
     * @return UnbindCdnDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCdnDomainWithChannelResponse UnbindCdnDomainWithChannel(UnbindCdnDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCdnDomainWithChannel", UnbindCdnDomainWithChannelResponse.class);
    }

}
